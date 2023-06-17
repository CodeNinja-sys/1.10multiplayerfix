/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.jboss.marshalling.ByteOutput
 *  org.jboss.marshalling.Marshaller
 */
package io.netty.c.a.e;

import io.netty.b.g;
import io.netty.c.a.e.b;
import io.netty.c.a.e.j;
import io.netty.c.a.p;
import io.netty.channel.bd;
import org.jboss.marshalling.ByteOutput;
import org.jboss.marshalling.Marshaller;

public class l
extends p {
    private static final byte[] a = new byte[4];
    private final j b;

    public l(j j2) {
        this.b = j2;
    }

    @Override
    protected void a(bd bd2, Object object, g g2) {
        Marshaller marshaller = this.b.a(bd2);
        int n2 = g2.q();
        g2.c(a);
        b b2 = new b(g2);
        marshaller.start((ByteOutput)b2);
        marshaller.writeObject(object);
        marshaller.finish();
        marshaller.close();
        g2.e(n2, g2.q() - n2 - 4);
    }
}

