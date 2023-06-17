/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.ah;
import io.netty.channel.ap;
import io.netty.channel.br;
import io.netty.channel.c.a;
import io.netty.channel.c.b;
import io.netty.channel.c.i;
import io.netty.channel.c.m;
import io.netty.channel.c.n;
import io.netty.channel.cd;
import io.netty.channel.cr;
import io.netty.channel.dj;
import io.netty.util.b.az;
import java.net.SocketAddress;
import java.util.ArrayDeque;
import java.util.Queue;

public class l
extends ah {
    private final ap c = new cd(this);
    private final Queue d = new ArrayDeque();
    private final Runnable e = new m(this);
    private volatile int f;
    private volatile a g;
    private volatile boolean h;

    @Override
    public ap G() {
        return this.c;
    }

    public a J() {
        return (a)super.f();
    }

    public a K() {
        return (a)super.h();
    }

    @Override
    public boolean H() {
        return this.f < 2;
    }

    @Override
    public boolean I() {
        return this.f == 1;
    }

    @Override
    protected boolean a(cr cr2) {
        return cr2 instanceof dj;
    }

    @Override
    protected SocketAddress x() {
        return this.g;
    }

    @Override
    protected void bw_() {
        ((az)((Object)this.e())).e(this.e);
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.g = i.a(this, this.g, socketAddress);
        this.f = 1;
    }

    @Override
    protected void B() {
        if (this.f <= 1) {
            if (this.g != null) {
                i.a(this.g);
                this.g = null;
            }
            this.f = 2;
        }
    }

    @Override
    protected void bx_() {
        ((az)((Object)this.e())).f(this.e);
    }

    @Override
    protected void by_() {
        Object e2;
        if (this.h) {
            return;
        }
        Queue queue = this.d;
        if (queue.isEmpty()) {
            this.h = true;
            return;
        }
        br br2 = this.c();
        while ((e2 = queue.poll()) != null) {
            br2.b(e2);
        }
        br2.n();
    }

    b a(b b2) {
        b b3 = new b(this, b2);
        if (this.e().bt_()) {
            this.b(b3);
        } else {
            this.e().execute(new n(this, b3));
        }
        return b3;
    }

    private void b(b b2) {
        this.d.add(b2);
        if (this.h) {
            Object e2;
            this.h = false;
            br br2 = this.c();
            while ((e2 = this.d.poll()) != null) {
                br2.b(e2);
            }
            br2.n();
        }
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.K();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.J();
    }

    static /* synthetic */ void a(l l2, b b2) {
        l2.b(b2);
    }
}

