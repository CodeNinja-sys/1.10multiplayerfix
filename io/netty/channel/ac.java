/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.k;
import io.netty.channel.l;
import io.netty.util.t;

abstract class ac
extends io.netty.util.c.ac
implements Runnable {
    private k a;
    private Object b;
    private bw c;
    private int d;

    private ac(t t2) {
        super(t2);
    }

    protected static void a(ac ac2, k k2, Object object, int n2, bw bw2) {
        ac2.a = k2;
        ac2.b = object;
        ac2.c = bw2;
        ac2.d = n2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        try {
            bj bj2;
            if (this.d > 0 && (bj2 = k.j(this.a).t().a()) != null) {
                bj2.b(this.d);
            }
            this.a(this.a, this.b, this.c);
        }
        finally {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public Runnable a() {
        return this;
    }

    protected void a(k k2, Object object, bw bw2) {
        k.a(k2, object, bw2);
    }

    @Override
    public /* synthetic */ Object b() {
        return this.a();
    }

    /* synthetic */ ac(t t2, l l2) {
        this(t2);
    }
}

