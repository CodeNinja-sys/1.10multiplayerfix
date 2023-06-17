/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.b.bi;
import io.netty.b.g;
import io.netty.b.w;
import io.netty.channel.a;
import io.netty.channel.an;
import io.netty.channel.ao;
import io.netty.channel.ar;
import io.netty.channel.bw;
import io.netty.channel.cr;
import io.netty.channel.d.h;
import io.netty.channel.d.l;
import io.netty.util.x;
import io.netty.util.z;
import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.util.concurrent.ScheduledFuture;

public abstract class d
extends a {
    private static final io.netty.util.c.b.g f = io.netty.util.c.b.h.a(d.class);
    private final SelectableChannel g;
    protected final int c;
    volatile SelectionKey d;
    private volatile boolean h;
    private volatile boolean i;
    private bw j;
    private ScheduledFuture k;
    private SocketAddress l;

    protected d(an an2, SelectableChannel selectableChannel, int n2) {
        super(an2);
        this.g = selectableChannel;
        this.c = n2;
        try {
            selectableChannel.configureBlocking(false);
        }
        catch (IOException iOException) {
            block4: {
                try {
                    selectableChannel.close();
                }
                catch (IOException iOException2) {
                    if (!f.f()) break block4;
                    f.d("Failed to close a partially initialized socket.", iOException2);
                }
            }
            throw new ar("Failed to enter non-blocking mode.", iOException);
        }
    }

    @Override
    public boolean H() {
        return this.g.isOpen();
    }

    public h O() {
        return (h)super.t();
    }

    protected SelectableChannel V() {
        return this.g;
    }

    public l W() {
        return (l)super.e();
    }

    protected SelectionKey X() {
        assert (this.d != null);
        return this.d;
    }

    protected boolean Y() {
        return this.i;
    }

    protected void b(boolean bl2) {
        this.i = bl2;
    }

    protected boolean Q() {
        return this.h;
    }

    void Z() {
        this.h = true;
    }

    @Override
    protected boolean a(cr cr2) {
        return cr2 instanceof l;
    }

    @Override
    protected void bw_() {
        boolean bl2 = false;
        while (true) {
            try {
                this.d = this.V().register(this.W().a, 0, this);
                return;
            }
            catch (CancelledKeyException cancelledKeyException) {
                if (!bl2) {
                    this.W().l();
                    bl2 = true;
                    continue;
                }
                throw cancelledKeyException;
            }
            break;
        }
    }

    @Override
    protected void bx_() {
        this.W().a(this.X());
    }

    @Override
    protected void by_() {
        if (this.h) {
            return;
        }
        SelectionKey selectionKey = this.d;
        if (!selectionKey.isValid()) {
            return;
        }
        this.i = true;
        int n2 = selectionKey.interestOps();
        if ((n2 & this.c) == 0) {
            selectionKey.interestOps(n2 | this.c);
        }
    }

    protected abstract boolean b(SocketAddress var1, SocketAddress var2);

    protected abstract void aa();

    protected final g c(g g2) {
        int n2 = g2.r();
        if (n2 == 0) {
            x.c(g2);
            return bi.c;
        }
        io.netty.b.h h2 = this.d();
        if (h2.h()) {
            g g3 = h2.d(n2);
            g3.b(g2, g2.p(), n2);
            x.c(g2);
            return g3;
        }
        g g4 = w.a();
        if (g4 != null) {
            g4.b(g2, g2.p(), n2);
            x.c(g2);
            return g4;
        }
        return g2;
    }

    protected final g a(z z2, g g2) {
        int n2 = g2.r();
        if (n2 == 0) {
            x.c(z2);
            return bi.c;
        }
        io.netty.b.h h2 = this.d();
        if (h2.h()) {
            g g3 = h2.d(n2);
            g3.b(g2, g2.p(), n2);
            x.c(z2);
            return g3;
        }
        g g4 = w.a();
        if (g4 != null) {
            g4.b(g2, g2.p(), n2);
            x.c(z2);
            return g4;
        }
        if (z2 != g2) {
            g2.ab();
            x.c(z2);
        }
        return g2;
    }

    @Override
    public /* synthetic */ ao t() {
        return this.O();
    }

    @Override
    public /* synthetic */ cr e() {
        return this.W();
    }

    static /* synthetic */ bw a(d d2) {
        return d2.j;
    }

    static /* synthetic */ bw a(d d2, bw bw2) {
        d2.j = bw2;
        return d2.j;
    }

    static /* synthetic */ SocketAddress a(d d2, SocketAddress socketAddress) {
        d2.l = socketAddress;
        return d2.l;
    }

    static /* synthetic */ ScheduledFuture a(d d2, ScheduledFuture scheduledFuture) {
        d2.k = scheduledFuture;
        return d2.k;
    }

    static /* synthetic */ ScheduledFuture b(d d2) {
        return d2.k;
    }

    static /* synthetic */ SocketAddress c(d d2) {
        return d2.l;
    }
}

