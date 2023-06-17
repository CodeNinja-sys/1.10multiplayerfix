/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.ByteInput
 *  org.jboss.marshalling.Unmarshaller
 */
package io.netty.c.a.e;

import io.netty.b.g;
import io.netty.c.a.e.a;
import io.netty.c.a.e.o;
import io.netty.c.a.m;
import io.netty.channel.bd;
import org.jboss.marshalling.ByteInput;
import org.jboss.marshalling.Unmarshaller;

public class k
extends m {
    private final o a;

    public k(o o2) {
        this(o2, 0x100000);
    }

    public k(o o2, int n2) {
        super(n2, 0, 4, 0, 4);
        this.a = o2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected Object a(bd bd2, g g2) {
        g g3 = (g)super.a(bd2, g2);
        if (g3 == null) {
            return null;
        }
        Unmarshaller unmarshaller = this.a.a(bd2);
        a a2 = new a(g3);
        try {
            unmarshaller.start((ByteInput)a2);
            Object object = unmarshaller.readObject();
            unmarshaller.finish();
            Object object2 = object;
            return object2;
        }
        finally {
            unmarshaller.close();
        }
    }

    @Override
    protected g a(bd bd2, g g2, int n2, int n3) {
        return g2.i(n2, n3);
    }
}

