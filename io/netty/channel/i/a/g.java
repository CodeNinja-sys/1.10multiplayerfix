/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.barchart.udt.TypeUDT
 *  com.barchart.udt.nio.ChannelUDT
 *  com.barchart.udt.nio.SocketChannelUDT
 */
package io.netty.channel.i.a;

import com.barchart.udt.TypeUDT;
import com.barchart.udt.nio.ChannelUDT;
import com.barchart.udt.nio.SocketChannelUDT;
import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bh;
import io.netty.channel.bj;
import io.netty.channel.d.i;
import io.netty.channel.i.a;
import io.netty.channel.i.a.j;
import io.netty.channel.i.c;
import io.netty.channel.i.d;
import io.netty.channel.i.f;
import io.netty.util.c.ad;
import io.netty.util.c.b.h;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.SelectableChannel;
import java.util.List;

public class g
extends i
implements c {
    private static final io.netty.util.c.b.g f = io.netty.util.c.b.h.a(g.class);
    private static final bh g = new bh(false);
    private static final String h = " (expected: " + ad.a(f.class) + ')';
    private final d i;

    public g() {
        this(TypeUDT.DATAGRAM);
    }

    public g(an an2, SocketChannelUDT socketChannelUDT) {
        super(an2, (SelectableChannel)socketChannelUDT, 1);
        try {
            socketChannelUDT.configureBlocking(false);
            switch (socketChannelUDT.socketUDT().status()) {
                case INIT: 
                case OPENED: {
                    this.i = new a(this, (ChannelUDT)socketChannelUDT, true);
                    break;
                }
                default: {
                    this.i = new a(this, (ChannelUDT)socketChannelUDT, false);
                    break;
                }
            }
        }
        catch (Exception exception) {
            block7: {
                try {
                    socketChannelUDT.close();
                }
                catch (Exception exception2) {
                    if (!f.f()) break block7;
                    f.d("Failed to close channel.", exception2);
                }
            }
            throw new ar("Failed to configure channel.", exception);
        }
    }

    public g(SocketChannelUDT socketChannelUDT) {
        this(null, socketChannelUDT);
    }

    public g(TypeUDT typeUDT) {
        this(j.b(typeUDT));
    }

    @Override
    public d g() {
        return this.i;
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.J().bind(socketAddress);
    }

    @Override
    protected void B() {
        this.J().close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected boolean b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        this.c(socketAddress2 != null ? socketAddress2 : new InetSocketAddress(0));
        boolean bl2 = false;
        try {
            boolean bl3 = this.J().connect(socketAddress);
            if (!bl3) {
                this.X().interestOps(this.X().interestOps() | 8);
            }
            bl2 = true;
            boolean bl4 = bl3;
            return bl4;
        }
        finally {
            if (!bl2) {
                this.B();
            }
        }
    }

    @Override
    protected void A() {
        this.B();
    }

    @Override
    protected void aa() {
        if (!this.J().finishConnect()) {
            throw new Error("Provider error: failed to finish connect. Provider library should be upgraded.");
        }
        this.X().interestOps(this.X().interestOps() & 0xFFFFFFF7);
    }

    @Override
    protected int a(List list) {
        int n2 = this.i.n();
        io.netty.b.g g2 = this.i.e().d(n2);
        int n3 = g2.a((ScatteringByteChannel)this.J(), n2);
        if (n3 <= 0) {
            g2.ad();
            return 0;
        }
        if (n3 >= n2) {
            this.J().close();
            throw new ar("Invalid config : increase receive buffer size to avoid message truncation");
        }
        list.add(new f(g2));
        return 1;
    }

    @Override
    protected boolean a(Object object, bj bj2) {
        f f2 = (f)object;
        io.netty.b.g g2 = f2.a();
        int n2 = g2.r();
        long l2 = g2.T() == 1 ? (long)this.J().write(g2.U()) : this.J().write(g2.V());
        if (l2 <= 0L && n2 > 0) {
            return false;
        }
        if (l2 != (long)n2) {
            throw new Error("Provider error: failed to write message. Provider library should be upgraded.");
        }
        return true;
    }

    @Override
    protected final Object c(Object object) {
        if (object instanceof f) {
            return object;
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + h);
    }

    @Override
    public boolean I() {
        SocketChannelUDT socketChannelUDT = this.J();
        return socketChannelUDT.isOpen() && socketChannelUDT.isConnectFinished();
    }

    protected SocketChannelUDT J() {
        return (SocketChannelUDT)super.V();
    }

    @Override
    protected SocketAddress x() {
        return this.J().socket().getLocalSocketAddress();
    }

    @Override
    public bh F() {
        return g;
    }

    @Override
    protected SocketAddress y() {
        return this.J().socket().getRemoteSocketAddress();
    }

    @Override
    public InetSocketAddress i() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public InetSocketAddress u() {
        return (InetSocketAddress)super.h();
    }

    @Override
    protected /* synthetic */ SelectableChannel V() {
        return this.J();
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.u();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.i();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.g();
    }
}

