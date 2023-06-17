/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.epoll;

import io.netty.channel.am;
import io.netty.channel.ap;
import io.netty.channel.av;
import io.netty.channel.b;
import io.netty.channel.bh;
import io.netty.channel.bi;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.cc;
import io.netty.channel.epoll.Native;
import io.netty.channel.epoll.a;
import io.netty.channel.epoll.c;
import io.netty.channel.epoll.f;
import io.netty.channel.epoll.g;
import io.netty.channel.h.d;
import io.netty.util.c.ad;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.NotYetConnectedException;

public final class EpollDatagramChannel
extends a
implements io.netty.channel.h.b {
    private static final bh g = new bh(true);
    private static final String h = " (expected: " + ad.a(d.class) + ", " + ad.a(am.class) + '<' + ad.a(io.netty.b.g.class) + ", " + ad.a(InetSocketAddress.class) + ">, " + ad.a(io.netty.b.g.class) + ')';
    private volatile InetSocketAddress i;
    private volatile InetSocketAddress j;
    private volatile boolean k;
    private final g l = new g(this);

    public EpollDatagramChannel() {
        super(Native.b(), 1);
    }

    @Override
    public bh F() {
        return g;
    }

    @Override
    public boolean I() {
        return this.e != -1 && ((Boolean)this.l.a(bi.B) != false && this.j() || this.d);
    }

    @Override
    public boolean P() {
        return this.k;
    }

    @Override
    public av a(InetAddress inetAddress) {
        return this.a(inetAddress, this.p());
    }

    @Override
    public av a(InetAddress inetAddress, bw bw2) {
        try {
            return this.a(inetAddress, NetworkInterface.getByInetAddress(this.K().getAddress()), null, bw2);
        }
        catch (SocketException socketException) {
            bw2.a(socketException);
            return bw2;
        }
    }

    @Override
    public av a(InetSocketAddress inetSocketAddress, NetworkInterface networkInterface) {
        return this.a(inetSocketAddress, networkInterface, this.p());
    }

    @Override
    public av a(InetSocketAddress inetSocketAddress, NetworkInterface networkInterface, bw bw2) {
        return this.a(inetSocketAddress.getAddress(), networkInterface, null, bw2);
    }

    @Override
    public av a(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2) {
        return this.a(inetAddress, networkInterface, inetAddress2, this.p());
    }

    @Override
    public av a(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        if (inetAddress == null) {
            throw new NullPointerException("multicastAddress");
        }
        if (networkInterface == null) {
            throw new NullPointerException("networkInterface");
        }
        bw2.a(new UnsupportedOperationException("Multicast not supported"));
        return bw2;
    }

    @Override
    public av b(InetAddress inetAddress) {
        return this.b(inetAddress, this.p());
    }

    @Override
    public av b(InetAddress inetAddress, bw bw2) {
        try {
            return this.b(inetAddress, NetworkInterface.getByInetAddress(this.K().getAddress()), null, bw2);
        }
        catch (SocketException socketException) {
            bw2.a(socketException);
            return bw2;
        }
    }

    @Override
    public av b(InetSocketAddress inetSocketAddress, NetworkInterface networkInterface) {
        return this.b(inetSocketAddress, networkInterface, this.p());
    }

    @Override
    public av b(InetSocketAddress inetSocketAddress, NetworkInterface networkInterface, bw bw2) {
        return this.b(inetSocketAddress.getAddress(), networkInterface, null, bw2);
    }

    @Override
    public av b(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2) {
        return this.b(inetAddress, networkInterface, inetAddress2, this.p());
    }

    @Override
    public av b(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        if (inetAddress == null) {
            throw new NullPointerException("multicastAddress");
        }
        if (networkInterface == null) {
            throw new NullPointerException("networkInterface");
        }
        bw2.a(new UnsupportedOperationException("Multicast not supported"));
        return bw2;
    }

    @Override
    public av c(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2) {
        return this.c(inetAddress, networkInterface, inetAddress2, this.p());
    }

    @Override
    public av c(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        if (inetAddress == null) {
            throw new NullPointerException("multicastAddress");
        }
        if (inetAddress2 == null) {
            throw new NullPointerException("sourceToBlock");
        }
        if (networkInterface == null) {
            throw new NullPointerException("networkInterface");
        }
        bw2.a(new UnsupportedOperationException("Multicast not supported"));
        return bw2;
    }

    @Override
    public av a(InetAddress inetAddress, InetAddress inetAddress2) {
        return this.a(inetAddress, inetAddress2, this.p());
    }

    @Override
    public av a(InetAddress inetAddress, InetAddress inetAddress2, bw bw2) {
        try {
            return this.c(inetAddress, NetworkInterface.getByInetAddress(this.K().getAddress()), inetAddress2, bw2);
        }
        catch (Throwable throwable) {
            bw2.a(throwable);
            return bw2;
        }
    }

    @Override
    protected c O() {
        return new f(this);
    }

    protected InetSocketAddress Q() {
        return this.i;
    }

    protected InetSocketAddress R() {
        return this.j;
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress)socketAddress;
        EpollDatagramChannel.a(inetSocketAddress);
        Native.a(this.e, inetSocketAddress.getAddress(), inetSocketAddress.getPort());
        this.i = Native.localAddress(this.e);
        this.d = true;
    }

    @Override
    protected void a(bj bj2) {
        while (true) {
            Object object;
            if ((object = bj2.b()) == null) {
                this.N();
                break;
            }
            try {
                boolean bl2 = false;
                for (int i2 = this.S().d() - 1; i2 >= 0; --i2) {
                    if (!this.d(object)) continue;
                    bl2 = true;
                    break;
                }
                if (bl2) {
                    bj2.c();
                    continue;
                }
                this.M();
            }
            catch (IOException iOException) {
                bj2.a(iOException);
                continue;
            }
            break;
        }
    }

    private boolean d(Object object) {
        int n2;
        InetSocketAddress inetSocketAddress;
        io.netty.b.g g2;
        if (object instanceof am) {
            am am2 = (am)object;
            g2 = (io.netty.b.g)am2.e();
            inetSocketAddress = (InetSocketAddress)am2.g();
        } else {
            g2 = (io.netty.b.g)object;
            inetSocketAddress = null;
        }
        int n3 = g2.r();
        if (n3 == 0) {
            return true;
        }
        if (inetSocketAddress == null && (inetSocketAddress = this.j) == null) {
            throw new NotYetConnectedException();
        }
        if (g2.Z()) {
            long l2 = g2.aa();
            n2 = Native.a(this.e, l2, g2.p(), g2.q(), inetSocketAddress.getAddress(), inetSocketAddress.getPort());
        } else {
            ByteBuffer byteBuffer = g2.k(g2.p(), g2.r());
            n2 = Native.a(this.e, byteBuffer, byteBuffer.position(), byteBuffer.limit(), inetSocketAddress.getAddress(), inetSocketAddress.getPort());
        }
        return n2 > 0;
    }

    @Override
    protected Object c(Object object) {
        am am2;
        if (object instanceof d) {
            d d2 = (d)object;
            io.netty.b.g g2 = (io.netty.b.g)d2.e();
            if (g2.Z()) {
                return object;
            }
            return new d(this.a((Object)d2, g2), (InetSocketAddress)d2.g());
        }
        if (object instanceof io.netty.b.g) {
            io.netty.b.g g3 = (io.netty.b.g)object;
            if (g3.Z()) {
                return object;
            }
            return this.a(g3);
        }
        if (object instanceof am && (am2 = (am)object).e() instanceof io.netty.b.g && (am2.g() == null || am2.g() instanceof InetSocketAddress)) {
            io.netty.b.g g4 = (io.netty.b.g)am2.e();
            if (g4.Z()) {
                return am2;
            }
            return new cc(this.a((Object)am2, g4), (InetSocketAddress)am2.g());
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + h);
    }

    public g S() {
        return this.l;
    }

    @Override
    protected void A() {
        this.k = false;
    }

    @Override
    protected /* synthetic */ SocketAddress y() {
        return this.R();
    }

    @Override
    protected /* synthetic */ SocketAddress x() {
        return this.Q();
    }

    @Override
    protected /* synthetic */ b bv_() {
        return this.O();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.S();
    }

    @Override
    public /* synthetic */ io.netty.channel.h.c T() {
        return this.S();
    }

    static /* synthetic */ InetSocketAddress a(EpollDatagramChannel epollDatagramChannel, InetSocketAddress inetSocketAddress) {
        epollDatagramChannel.j = inetSocketAddress;
        return epollDatagramChannel.j;
    }

    static /* synthetic */ InetSocketAddress b(EpollDatagramChannel epollDatagramChannel, InetSocketAddress inetSocketAddress) {
        epollDatagramChannel.i = inetSocketAddress;
        return epollDatagramChannel.i;
    }

    static /* synthetic */ boolean a(EpollDatagramChannel epollDatagramChannel, boolean bl2) {
        epollDatagramChannel.k = bl2;
        return epollDatagramChannel.k;
    }
}

