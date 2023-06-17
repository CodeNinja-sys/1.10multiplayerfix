/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.a;
import io.netty.channel.ao;
import io.netty.channel.bi;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.c;
import io.netty.channel.cr;
import io.netty.channel.d;
import io.netty.channel.dq;
import io.netty.channel.e;
import io.netty.channel.f;
import io.netty.channel.g;
import io.netty.channel.h;
import io.netty.channel.i;
import io.netty.util.c.u;
import io.netty.util.x;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.RejectedExecutionException;

public abstract class b
implements ao {
    private bj b;
    private boolean c;
    final /* synthetic */ a a;

    protected b(a a2) {
        this.a = a2;
        this.b = new bj(this.a);
    }

    @Override
    public final bj a() {
        return this.b;
    }

    @Override
    public final SocketAddress b() {
        return this.a.x();
    }

    @Override
    public final SocketAddress c() {
        return this.a.y();
    }

    @Override
    public final void a(cr cr2, bw bw2) {
        if (cr2 == null) {
            throw new NullPointerException("eventLoop");
        }
        if (this.a.j()) {
            bw2.a(new IllegalStateException("registered to an event loop already"));
            return;
        }
        if (!this.a.a(cr2)) {
            bw2.a(new IllegalStateException("incompatible event loop type: " + cr2.getClass().getName()));
            return;
        }
        io.netty.channel.a.a(this.a, cr2);
        if (cr2.bt_()) {
            this.f(bw2);
        } else {
            try {
                cr2.execute(new c(this, bw2));
            }
            catch (Throwable throwable) {
                io.netty.channel.a.E().d("Force-closing a channel whose registration task was not accepted by an event loop: {}", (Object)this.a, (Object)throwable);
                this.d();
                io.netty.channel.a.a(this.a).d();
                this.a(bw2, throwable);
            }
        }
    }

    private void f(bw bw2) {
        try {
            if (!bw2.bn_() || !this.d(bw2)) {
                return;
            }
            this.a.bw_();
            io.netty.channel.a.a(this.a, true);
            this.e(bw2);
            io.netty.channel.a.b(this.a).j();
            if (this.a.I()) {
                io.netty.channel.a.b(this.a).l();
            }
        }
        catch (Throwable throwable) {
            this.d();
            io.netty.channel.a.a(this.a).d();
            this.a(bw2, throwable);
        }
    }

    @Override
    public final void a(SocketAddress socketAddress, bw bw2) {
        if (!bw2.bn_() || !this.d(bw2)) {
            return;
        }
        if (!u.b() && !u.c() && Boolean.TRUE.equals(this.a.G().a(bi.l)) && socketAddress instanceof InetSocketAddress && !((InetSocketAddress)socketAddress).getAddress().isAnyLocalAddress()) {
            io.netty.channel.a.E().d("A non-root user can't receive a broadcast packet if the socket is not bound to a wildcard address; binding to a non-wildcard address (" + socketAddress + ") anyway as requested.");
        }
        boolean bl2 = this.a.I();
        try {
            this.a.c(socketAddress);
        }
        catch (Throwable throwable) {
            this.a(bw2, throwable);
            this.i();
            return;
        }
        if (!bl2 && this.a.I()) {
            this.a(new d(this));
        }
        this.e(bw2);
    }

    @Override
    public final void a(bw bw2) {
        if (!bw2.bn_()) {
            return;
        }
        boolean bl2 = this.a.I();
        try {
            this.a.A();
        }
        catch (Throwable throwable) {
            this.a(bw2, throwable);
            this.i();
            return;
        }
        if (bl2 && !this.a.I()) {
            this.a(new e(this));
        }
        this.e(bw2);
        this.i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void b(bw bw2) {
        if (!bw2.bn_()) {
            return;
        }
        if (this.c) {
            this.a(new f(this, bw2));
            return;
        }
        if (io.netty.channel.a.a(this.a).isDone()) {
            this.e(bw2);
            return;
        }
        boolean bl2 = this.a.I();
        bj bj2 = this.b;
        this.b = null;
        try {
            this.a.B();
            io.netty.channel.a.a(this.a).d();
            this.e(bw2);
        }
        catch (Throwable throwable) {
            io.netty.channel.a.a(this.a).d();
            this.a(bw2, throwable);
        }
        try {
            bj2.b(io.netty.channel.a.a);
            bj2.a(io.netty.channel.a.a);
        }
        finally {
            if (bl2 && !this.a.I()) {
                this.a(new g(this));
            }
            this.c(this.h());
        }
    }

    @Override
    public final void d() {
        try {
            this.a.B();
        }
        catch (Exception exception) {
            io.netty.channel.a.E().d("Failed to close a channel.", exception);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void c(bw bw2) {
        if (!bw2.bn_()) {
            return;
        }
        if (!io.netty.channel.a.c(this.a)) {
            this.e(bw2);
            return;
        }
        try {
            this.a.bx_();
        }
        catch (Throwable throwable) {
            io.netty.channel.a.E().d("Unexpected exception occurred while deregistering a channel.", throwable);
        }
        finally {
            if (io.netty.channel.a.c(this.a)) {
                io.netty.channel.a.a(this.a, false);
                this.a(new h(this));
                this.e(bw2);
            } else {
                this.e(bw2);
            }
        }
    }

    @Override
    public final void e() {
        if (!this.a.I()) {
            return;
        }
        try {
            this.a.by_();
        }
        catch (Exception exception) {
            this.a(new i(this, exception));
            this.b(this.h());
        }
    }

    @Override
    public final void a(Object object, bw bw2) {
        int n2;
        bj bj2 = this.b;
        if (bj2 == null) {
            this.a(bw2, io.netty.channel.a.a);
            x.b(object);
            return;
        }
        try {
            object = this.a.c(object);
            n2 = this.a.bB_().a(object);
            if (n2 < 0) {
                n2 = 0;
            }
        }
        catch (Throwable throwable) {
            this.a(bw2, throwable);
            x.b(object);
            return;
        }
        bj2.a(object, n2, bw2);
    }

    @Override
    public final void f() {
        bj bj2 = this.b;
        if (bj2 == null) {
            return;
        }
        bj2.a();
        this.g();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void g() {
        if (this.c) {
            return;
        }
        bj bj2 = this.b;
        if (bj2 == null || bj2.i()) {
            return;
        }
        this.c = true;
        if (!this.a.I()) {
            try {
                if (this.a.H()) {
                    bj2.b(io.netty.channel.a.b);
                } else {
                    bj2.b(io.netty.channel.a.a);
                }
            }
            finally {
                this.c = false;
            }
            return;
        }
        try {
            this.a.a(bj2);
        }
        catch (Throwable throwable) {
            bj2.b(throwable);
            if (throwable instanceof IOException && this.a.G().h()) {
                this.b(this.h());
            }
        }
        finally {
            this.c = false;
        }
    }

    @Override
    public final bw h() {
        return io.netty.channel.a.d(this.a);
    }

    protected final boolean d(bw bw2) {
        if (this.a.H()) {
            return true;
        }
        this.a(bw2, io.netty.channel.a.a);
        return false;
    }

    protected final void e(bw bw2) {
        if (!(bw2 instanceof dq) && !bw2.c()) {
            io.netty.channel.a.E().d("Failed to mark a promise as success because it is done already: {}", (Object)bw2);
        }
    }

    protected final void a(bw bw2, Throwable throwable) {
        if (!(bw2 instanceof dq) && !bw2.b(throwable)) {
            io.netty.channel.a.E().d("Failed to mark a promise as failure because it's done already: {}", (Object)bw2, (Object)throwable);
        }
    }

    protected final void i() {
        if (this.a.H()) {
            return;
        }
        this.b(this.h());
    }

    private void a(Runnable runnable) {
        try {
            this.a.e().execute(runnable);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            io.netty.channel.a.E().d("Can't invoke task later as EventLoop rejected it", rejectedExecutionException);
        }
    }

    static /* synthetic */ void a(b b2, bw bw2) {
        b2.f(bw2);
    }
}

