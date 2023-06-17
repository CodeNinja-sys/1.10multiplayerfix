/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.channel.b;
import io.netty.channel.bw;
import io.netty.channel.d.d;
import io.netty.channel.d.f;
import io.netty.channel.d.g;
import io.netty.channel.d.h;
import io.netty.util.b.ad;
import java.net.ConnectException;
import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.concurrent.TimeUnit;

public abstract class e
extends b
implements h {
    static final /* synthetic */ boolean c;
    final /* synthetic */ d d;

    protected e(d d2) {
        this.d = d2;
        super(d2);
    }

    protected final void k() {
        SelectionKey selectionKey = this.d.X();
        if (!selectionKey.isValid()) {
            return;
        }
        int n2 = selectionKey.interestOps();
        if ((n2 & this.d.c) != 0) {
            selectionKey.interestOps(n2 & ~this.d.c);
        }
    }

    @Override
    public final SelectableChannel l() {
        return this.d.V();
    }

    @Override
    public final void a(SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        if (!bw2.bn_() || !this.d(bw2)) {
            return;
        }
        try {
            if (io.netty.channel.d.d.a(this.d) != null) {
                throw new IllegalStateException("connection attempt already made");
            }
            boolean bl2 = this.d.I();
            if (this.d.b(socketAddress, socketAddress2)) {
                this.a(bw2, bl2);
            } else {
                io.netty.channel.d.d.a(this.d, bw2);
                io.netty.channel.d.d.a(this.d, socketAddress);
                int n2 = this.d.G().b();
                if (n2 > 0) {
                    io.netty.channel.d.d.a(this.d, this.d.W().a(new f(this, socketAddress), (long)n2, TimeUnit.MILLISECONDS));
                }
                bw2.g((ad)new g(this));
            }
        }
        catch (Throwable throwable) {
            ConnectException connectException;
            if (throwable instanceof ConnectException) {
                ConnectException connectException2 = new ConnectException(throwable.getMessage() + ": " + socketAddress);
                connectException2.setStackTrace(throwable.getStackTrace());
                connectException = connectException2;
            }
            bw2.b(connectException);
            this.i();
        }
    }

    private void a(bw bw2, boolean bl2) {
        if (bw2 == null) {
            return;
        }
        boolean bl3 = bw2.c();
        if (!bl2 && this.d.I()) {
            this.d.c().l();
        }
        if (!bl3) {
            this.b(this.h());
        }
    }

    private void b(bw bw2, Throwable throwable) {
        if (bw2 == null) {
            return;
        }
        bw2.b(throwable);
        this.i();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void m() {
        if (!c && !this.d.W().bt_()) {
            throw new AssertionError();
        }
        try {
            boolean bl2 = this.d.I();
            this.d.aa();
            this.a(io.netty.channel.d.d.a(this.d), bl2);
        }
        catch (Throwable throwable) {
            ConnectException connectException;
            if (throwable instanceof ConnectException) {
                ConnectException connectException2 = new ConnectException(throwable.getMessage() + ": " + io.netty.channel.d.d.c(this.d));
                connectException2.setStackTrace(throwable.getStackTrace());
                connectException = connectException2;
            }
            this.b(io.netty.channel.d.d.a(this.d), connectException);
        }
        finally {
            if (io.netty.channel.d.d.b(this.d) != null) {
                io.netty.channel.d.d.b(this.d).cancel(false);
            }
            io.netty.channel.d.d.a(this.d, null);
        }
    }

    @Override
    protected final void g() {
        if (this.o()) {
            return;
        }
        super.g();
    }

    @Override
    public final void n() {
        super.g();
    }

    private boolean o() {
        SelectionKey selectionKey = this.d.X();
        return selectionKey.isValid() && (selectionKey.interestOps() & 4) != 0;
    }

    static {
        c = !d.class.desiredAssertionStatus();
    }
}

