/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.ao;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.bp;
import io.netty.channel.bw;
import io.netty.channel.cf;
import io.netty.channel.k;
import java.net.SocketAddress;

final class ck
extends k
implements bp {
    private static final String e = cf.d(ck.class);
    protected final ao d;

    ck(cf cf2) {
        super(cf2, null, e, false, true);
        this.d = cf2.g().t();
    }

    @Override
    public ba x() {
        return this;
    }

    @Override
    public void e(bd bd2) {
    }

    @Override
    public void f(bd bd2) {
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, bw bw2) {
        this.d.a(socketAddress, bw2);
    }

    @Override
    public void a(bd bd2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        this.d.a(socketAddress, socketAddress2, bw2);
    }

    @Override
    public void a(bd bd2, bw bw2) {
        this.d.a(bw2);
    }

    @Override
    public void b(bd bd2, bw bw2) {
        this.d.b(bw2);
    }

    @Override
    public void c(bd bd2, bw bw2) {
        this.d.c(bw2);
    }

    @Override
    public void c(bd bd2) {
        this.d.e();
    }

    @Override
    public void a(bd bd2, Object object, bw bw2) {
        this.d.a(object, bw2);
    }

    @Override
    public void d(bd bd2) {
        this.d.f();
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        bd2.a(throwable);
    }
}

