/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.aq;
import io.netty.channel.bd;
import io.netty.channel.be;
import io.netty.channel.bp;
import io.netty.channel.br;
import io.netty.channel.bw;
import java.net.SocketAddress;

public class bz
extends aq {
    private be a;
    private bp b;

    protected bz() {
    }

    public bz(be be2, bp bp2) {
        this.a(be2, bp2);
    }

    protected final void a(be be2, bp bp2) {
        this.b(be2, bp2);
        this.a = be2;
        this.b = bp2;
    }

    private void b(be be2, bp bp2) {
        if (this.a != null) {
            throw new IllegalStateException("init() can not be invoked if " + bz.class.getSimpleName() + " was constructed with non-default constructor.");
        }
        if (be2 == null) {
            throw new NullPointerException("inboundHandler");
        }
        if (bp2 == null) {
            throw new NullPointerException("outboundHandler");
        }
        if (be2 instanceof bp) {
            throw new IllegalArgumentException("inboundHandler must not implement " + bp.class.getSimpleName() + " to get combined.");
        }
        if (bp2 instanceof be) {
            throw new IllegalArgumentException("outboundHandler must not implement " + be.class.getSimpleName() + " to get combined.");
        }
    }

    protected final be a() {
        return this.a;
    }

    protected final bp b() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void e(bd bd2) {
        if (this.a == null) {
            throw new IllegalStateException("init() must be invoked before being added to a " + br.class.getSimpleName() + " if " + bz.class.getSimpleName() + " was constructed with the default constructor.");
        }
        try {
            this.a.e(bd2);
        }
        finally {
            this.b.e(bd2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void f(bd bd2) {
        try {
            this.a.f(bd2);
        }
        finally {
            this.b.f(bd2);
        }
    }

    @Override
    public void g(bd bd2) {
        this.a.g(bd2);
    }

    @Override
    public void h(bd bd2) {
        this.a.h(bd2);
    }

    @Override
    public void a(bd bd2) {
        this.a.a(bd2);
    }

    @Override
    public void b(bd bd2) {
        this.a.b(bd2);
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        this.a.a(bd2, throwable);
    }

    @Override
    public void b(bd bd2, Object object) {
        this.a.b(bd2, object);
    }

    @Override
    public void a_(bd bd2, Object object) {
        this.a.a_(bd2, object);
    }

    @Override
    public void i(bd bd2) {
        this.a.i(bd2);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, bw bw2) {
        this.b.a(bd2, socketAddress, bw2);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        this.b.a(bd2, socketAddress, socketAddress2, bw2);
    }

    @Override
    public void a(bd bd2, bw bw2) {
        this.b.a(bd2, bw2);
    }

    @Override
    public void b(bd bd2, bw bw2) {
        this.b.b(bd2, bw2);
    }

    @Override
    public void c(bd bd2, bw bw2) {
        this.b.c(bd2, bw2);
    }

    @Override
    public void c(bd bd2) {
        this.b.c(bd2);
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        this.b.a(bd2, object, bw2);
    }

    @Override
    public void d(bd bd2) {
        this.b.d(bd2);
    }

    @Override
    public void j(bd bd2) {
        this.a.j(bd2);
    }
}

