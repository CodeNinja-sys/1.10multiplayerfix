/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.b;

import io.netty.b.g;
import io.netty.channel.am;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bh;
import io.netty.channel.bi;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.dg;
import io.netty.channel.h.b;
import io.netty.channel.h.d;
import io.netty.channel.h.e;
import io.netty.util.c.ad;
import io.netty.util.c.b.h;
import io.netty.util.c.u;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Locale;

public class c
extends io.netty.channel.e.e
implements b {
    private static final io.netty.util.c.b.g d = io.netty.util.c.b.h.a(c.class);
    private static final bh e = new bh(true);
    private static final String f = " (expected: " + ad.a(d.class) + ", " + ad.a(am.class) + '<' + ad.a(g.class) + ", " + ad.a(SocketAddress.class) + ">, " + ad.a(g.class) + ')';
    private final MulticastSocket g;
    private final io.netty.channel.h.c h;
    private final DatagramPacket i = new DatagramPacket(io.netty.util.c.d.a, 0);
    private dg j;

    private static MulticastSocket L() {
        try {
            return new MulticastSocket(null);
        }
        catch (Exception exception) {
            throw new ar("failed to create a new socket", exception);
        }
    }

    public c() {
        this(io.netty.channel.h.b.c.L());
    }

    public c(MulticastSocket multicastSocket) {
        super(null);
        boolean bl2 = false;
        try {
            multicastSocket.setSoTimeout(1000);
            multicastSocket.setBroadcast(false);
            bl2 = true;
        }
        catch (SocketException socketException) {
            throw new ar("Failed to configure the datagram socket timeout.", socketException);
        }
        finally {
            if (!bl2) {
                multicastSocket.close();
            }
        }
        this.g = multicastSocket;
        this.h = new e(this, multicastSocket);
    }

    @Override
    public bh F() {
        return e;
    }

    @Override
    public io.netty.channel.h.c T() {
        return this.h;
    }

    @Override
    public boolean H() {
        return !this.g.isClosed();
    }

    @Override
    public boolean I() {
        return this.H() && ((Boolean)this.h.a(bi.B) != false && this.j() || this.g.isBound());
    }

    @Override
    public boolean P() {
        return this.g.isConnected();
    }

    @Override
    protected SocketAddress x() {
        return this.g.getLocalSocketAddress();
    }

    @Override
    protected SocketAddress y() {
        return this.g.getRemoteSocketAddress();
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.g.bind(socketAddress);
    }

    @Override
    public InetSocketAddress K() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public InetSocketAddress J() {
        return (InetSocketAddress)super.h();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            this.g.bind(socketAddress2);
        }
        boolean bl2 = false;
        try {
            this.g.connect(socketAddress);
            bl2 = true;
        }
        finally {
            if (!bl2) {
                try {
                    this.g.close();
                }
                catch (Throwable throwable) {
                    d.d("Failed to close a socket.", throwable);
                }
            }
        }
    }

    @Override
    protected void A() {
        this.g.disconnect();
    }

    @Override
    protected void B() {
        this.g.close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected int a(List list) {
        io.netty.channel.h.c c2 = this.T();
        dg dg2 = this.j;
        if (dg2 == null) {
            this.j = dg2 = c2.f().a();
        }
        g g2 = c2.e().c(dg2.a());
        boolean bl2 = true;
        try {
            this.i.setData(g2.X(), g2.Y(), g2.j());
            this.g.receive(this.i);
            InetSocketAddress inetSocketAddress = (InetSocketAddress)this.i.getSocketAddress();
            int n2 = this.i.getLength();
            dg2.a(n2);
            list.add(new d(g2.h(n2), this.K(), inetSocketAddress));
            bl2 = false;
            int n3 = 1;
            return n3;
        }
        catch (SocketTimeoutException socketTimeoutException) {
            int n4 = 0;
            return n4;
        }
        catch (SocketException socketException) {
            if (!socketException.getMessage().toLowerCase(Locale.US).contains("socket closed")) {
                throw socketException;
            }
            int n5 = -1;
            return n5;
        }
        catch (Throwable throwable) {
            u.a(throwable);
            int n6 = -1;
            return n6;
        }
        finally {
            if (bl2) {
                g2.ad();
            }
        }
    }

    @Override
    protected void a(bj bj2) {
        Object object;
        while ((object = bj2.b()) != null) {
            g g2;
            SocketAddress socketAddress;
            if (object instanceof am) {
                am am2 = (am)object;
                socketAddress = am2.g();
                g2 = (g)am2.e();
            } else {
                g2 = (g)object;
                socketAddress = null;
            }
            int n2 = g2.r();
            if (socketAddress != null) {
                this.i.setSocketAddress(socketAddress);
            }
            if (g2.W()) {
                this.i.setData(g2.X(), g2.Y() + g2.p(), n2);
            } else {
                byte[] arrby = new byte[n2];
                g2.a(g2.p(), arrby);
                this.i.setData(arrby);
            }
            try {
                this.g.send(this.i);
                bj2.c();
            }
            catch (IOException iOException) {
                bj2.a(iOException);
            }
        }
    }

    @Override
    protected Object c(Object object) {
        am am2;
        if (object instanceof d || object instanceof g) {
            return object;
        }
        if (object instanceof am && (am2 = (am)object).e() instanceof g) {
            return object;
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + f);
    }

    @Override
    public av a(InetAddress inetAddress) {
        return this.a(inetAddress, this.p());
    }

    @Override
    public av a(InetAddress inetAddress, bw bw2) {
        this.N();
        try {
            this.g.joinGroup(inetAddress);
            bw2.b();
        }
        catch (IOException iOException) {
            bw2.a(iOException);
        }
        return bw2;
    }

    @Override
    public av a(InetSocketAddress inetSocketAddress, NetworkInterface networkInterface) {
        return this.a(inetSocketAddress, networkInterface, this.p());
    }

    @Override
    public av a(InetSocketAddress inetSocketAddress, NetworkInterface networkInterface, bw bw2) {
        this.N();
        try {
            this.g.joinGroup(inetSocketAddress, networkInterface);
            bw2.b();
        }
        catch (IOException iOException) {
            bw2.a(iOException);
        }
        return bw2;
    }

    @Override
    public av a(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2) {
        return this.a(new UnsupportedOperationException());
    }

    @Override
    public av a(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        bw2.a(new UnsupportedOperationException());
        return bw2;
    }

    private void N() {
        if (!this.I()) {
            throw new IllegalStateException(b.class.getName() + " must be bound to join a group.");
        }
    }

    @Override
    public av b(InetAddress inetAddress) {
        return this.b(inetAddress, this.p());
    }

    @Override
    public av b(InetAddress inetAddress, bw bw2) {
        try {
            this.g.leaveGroup(inetAddress);
            bw2.b();
        }
        catch (IOException iOException) {
            bw2.a(iOException);
        }
        return bw2;
    }

    @Override
    public av b(InetSocketAddress inetSocketAddress, NetworkInterface networkInterface) {
        return this.b(inetSocketAddress, networkInterface, this.p());
    }

    @Override
    public av b(InetSocketAddress inetSocketAddress, NetworkInterface networkInterface, bw bw2) {
        try {
            this.g.leaveGroup(inetSocketAddress, networkInterface);
            bw2.b();
        }
        catch (IOException iOException) {
            bw2.a(iOException);
        }
        return bw2;
    }

    @Override
    public av b(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2) {
        return this.a(new UnsupportedOperationException());
    }

    @Override
    public av b(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        bw2.a(new UnsupportedOperationException());
        return bw2;
    }

    @Override
    public av c(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2) {
        return this.a(new UnsupportedOperationException());
    }

    @Override
    public av c(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        bw2.a(new UnsupportedOperationException());
        return bw2;
    }

    @Override
    public av a(InetAddress inetAddress, InetAddress inetAddress2) {
        return this.a(new UnsupportedOperationException());
    }

    @Override
    public av a(InetAddress inetAddress, InetAddress inetAddress2, bw bw2) {
        bw2.a(new UnsupportedOperationException());
        return bw2;
    }

    @Override
    public /* synthetic */ SocketAddress h() {
        return this.J();
    }

    @Override
    public /* synthetic */ SocketAddress f() {
        return this.K();
    }

    @Override
    public /* synthetic */ ap G() {
        return this.T();
    }
}

