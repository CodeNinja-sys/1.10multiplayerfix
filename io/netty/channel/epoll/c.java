/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.b;
import io.netty.channel.epoll.a;

public abstract class c
extends b {
    protected boolean b;
    final /* synthetic */ a c;

    protected c(a a2) {
        this.c = a2;
        super(a2);
    }

    abstract void j();

    void k() {
    }

    @Override
    protected void g() {
        if (this.n()) {
            return;
        }
        super.g();
    }

    void l() {
        super.g();
    }

    private boolean n() {
        return (this.c.c & 2) != 0;
    }

    protected final void m() {
        if ((this.c.c & a.a(this.c)) != 0) {
            this.c.c &= ~a.a(this.c);
            a.b(this.c);
        }
    }
}

