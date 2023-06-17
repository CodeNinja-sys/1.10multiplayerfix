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
import io.netty.c.a.e.h;
import io.netty.c.a.e.i;
import io.netty.c.a.e.o;
import io.netty.c.a.w;
import io.netty.c.a.y;
import io.netty.channel.bd;
import java.util.List;
import org.jboss.marshalling.ByteInput;
import org.jboss.marshalling.Unmarshaller;

public class c
extends w {
    protected final o c;
    protected final int d;
    private boolean e;

    public c(o o2, int n2) {
        this.c = o2;
        this.d = n2;
    }

    @Override
    protected void a(bd bd2, g g2, List list) {
        if (this.e) {
            g2.A(this.b());
            this.d();
            return;
        }
        Unmarshaller unmarshaller = this.c.a(bd2);
        Object object = new a(g2);
        if (this.d != Integer.MAX_VALUE) {
            object = new h((ByteInput)object, this.d);
        }
        try {
            unmarshaller.start((ByteInput)object);
            Object object2 = unmarshaller.readObject();
            unmarshaller.finish();
            list.add(object2);
        }
        catch (i i2) {
            this.e = true;
            throw new y();
        }
        finally {
            unmarshaller.close();
        }
    }

    @Override
    protected void b(bd bd2, g g2, List list) {
        switch (g2.r()) {
            case 0: {
                return;
            }
            case 1: {
                if (g2.m(g2.p()) != 121) break;
                g2.A(1);
                return;
            }
        }
        this.a(bd2, g2, list);
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        if (throwable instanceof y) {
            bd2.n();
        } else {
            super.a(bd2, throwable);
        }
    }
}

