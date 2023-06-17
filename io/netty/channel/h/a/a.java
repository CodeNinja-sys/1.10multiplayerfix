/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h.a;

import io.netty.b.g;
import io.netty.channel.am;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.av;
import io.netty.channel.bh;
import io.netty.channel.bi;
import io.netty.channel.bj;
import io.netty.channel.bw;
import io.netty.channel.cc;
import io.netty.channel.dg;
import io.netty.channel.h.a.b;
import io.netty.channel.h.a.i;
import io.netty.channel.h.c;
import io.netty.channel.h.d;
import io.netty.channel.h.h;
import io.netty.util.c.ad;
import io.netty.util.c.u;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.MembershipKey;
import java.nio.channels.SelectableChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class a
extends io.netty.channel.d.i
implements io.netty.channel.h.b {
    private static final bh f = new bh(true);
    private static final SelectorProvider g = SelectorProvider.provider();
    private static final String h = " (expected: " + ad.a(d.class) + ", " + ad.a(am.class) + '<' + ad.a(g.class) + ", " + ad.a(SocketAddress.class) + ">, " + ad.a(g.class) + ')';
    private final c i;
    private Map j;
    private dg k;

    private static DatagramChannel a(SelectorProvider selectorProvider) {
        try {
            return selectorProvider.openDatagramChannel();
        }
        catch (IOException iOException) {
            throw new ar("Failed to open a socket.", iOException);
        }
    }

    private static DatagramChannel a(SelectorProvider selectorProvider, h h2) {
        if (h2 == null) {
            return a.a(selectorProvider);
        }
        a.R();
        try {
            return selectorProvider.openDatagramChannel(io.netty.channel.h.a.i.a(h2));
        }
        catch (IOException iOException) {
            throw new ar("Failed to open a socket.", iOException);
        }
    }

    private static void R() {
        if (u.d() < 7) {
            throw new UnsupportedOperationException("Only supported on java 7+.");
        }
    }

    public a() {
        this(a.a(g));
    }

    public a(SelectorProvider selectorProvider) {
        this(a.a(selectorProvider));
    }

    public a(h h2) {
        this(a.a(g, h2));
    }

    public a(SelectorProvider selectorProvider, h h2) {
        this(a.a(selectorProvider, h2));
    }

    public a(DatagramChannel datagramChannel) {
        super(null, datagramChannel, 1);
        this.i = new b(this, datagramChannel);
    }

    @Override
    public bh F() {
        return f;
    }

    @Override
    public c T() {
        return this.i;
    }

    @Override
    public boolean I() {
        DatagramChannel datagramChannel = this.N();
        return datagramChannel.isOpen() && ((Boolean)this.i.a(bi.B) != false && this.j() || datagramChannel.socket().isBound());
    }

    @Override
    public boolean P() {
        return this.N().isConnected();
    }

    protected DatagramChannel N() {
        return (DatagramChannel)super.V();
    }

    @Override
    protected SocketAddress x() {
        return this.N().socket().getLocalSocketAddress();
    }

    @Override
    protected SocketAddress y() {
        return this.N().socket().getRemoteSocketAddress();
    }

    @Override
    protected void c(SocketAddress socketAddress) {
        this.N().socket().bind(socketAddress);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected boolean b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress2 != null) {
            this.N().socket().bind(socketAddress2);
        }
        boolean bl2 = false;
        try {
            this.N().connect(socketAddress);
            bl2 = true;
            boolean bl3 = true;
            return bl3;
        }
        finally {
            if (!bl2) {
                this.B();
            }
        }
    }

    @Override
    protected void aa() {
        throw new Error();
    }

    @Override
    protected void A() {
        this.N().disconnect();
    }

    @Override
    protected void B() {
        this.N().close();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected int a(List list) {
        int n2;
        DatagramChannel datagramChannel = this.N();
        c c2 = this.T();
        dg dg2 = this.k;
        if (dg2 == null) {
            this.k = dg2 = c2.f().a();
        }
        g g2 = dg2.a(c2.e());
        boolean bl2 = true;
        try {
            ByteBuffer byteBuffer = g2.k(g2.q(), g2.s());
            n2 = byteBuffer.position();
            InetSocketAddress inetSocketAddress = (InetSocketAddress)datagramChannel.receive(byteBuffer);
            if (inetSocketAddress == null) {
                int n3 = 0;
                return n3;
            }
            int n4 = byteBuffer.position() - n2;
            g2.h(g2.q() + n4);
            dg2.a(n4);
            list.add(new d(g2, this.K(), inetSocketAddress));
            bl2 = false;
            int n5 = 1;
            return n5;
        }
        catch (Throwable throwable) {
            u.a(throwable);
            n2 = -1;
            return n2;
        }
        finally {
            if (bl2) {
                g2.ad();
            }
        }
    }

    @Override
    protected boolean a(Object object, bj bj2) {
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
        if (n2 == 0) {
            return true;
        }
        ByteBuffer byteBuffer = g2.k(g2.p(), n2);
        int n3 = socketAddress != null ? this.N().send(byteBuffer, socketAddress) : this.N().write(byteBuffer);
        return n3 > 0;
    }

    @Override
    protected Object c(Object object) {
        am am2;
        if (object instanceof d) {
            d d2 = (d)object;
            g g2 = (g)d2.e();
            if (a.a(g2)) {
                return d2;
            }
            return new d(this.a(d2, g2), (InetSocketAddress)d2.g());
        }
        if (object instanceof g) {
            g g3 = (g)object;
            if (a.a(g3)) {
                return g3;
            }
            return this.c(g3);
        }
        if (object instanceof am && (am2 = (am)object).e() instanceof g) {
            g g4 = (g)am2.e();
            if (a.a(g4)) {
                return am2;
            }
            return new cc(this.a(am2, g4), am2.g());
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + h);
    }

    private static boolean a(g g2) {
        return g2.o() && g2.T() == 1;
    }

    @Override
    protected boolean M() {
        return true;
    }

    @Override
    public InetSocketAddress K() {
        return (InetSocketAddress)super.f();
    }

    @Override
    public InetSocketAddress J() {
        return (InetSocketAddress)super.h();
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public av a(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        a.R();
        if (inetAddress == null) {
            throw new NullPointerException("multicastAddress");
        }
        if (networkInterface == null) {
            throw new NullPointerException("networkInterface");
        }
        try {
            MembershipKey membershipKey = inetAddress2 == null ? this.N().join(inetAddress, networkInterface) : this.N().join(inetAddress, networkInterface, inetAddress2);
            a a2 = this;
            synchronized (a2) {
                ArrayList<MembershipKey> arrayList = null;
                if (this.j == null) {
                    this.j = new HashMap();
                } else {
                    arrayList = (ArrayList<MembershipKey>)this.j.get(inetAddress);
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<MembershipKey>();
                    this.j.put(inetAddress, arrayList);
                }
                arrayList.add(membershipKey);
            }
            bw2.b();
        }
        catch (Throwable throwable) {
            bw2.a(throwable);
        }
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public av b(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        a.R();
        if (inetAddress == null) {
            throw new NullPointerException("multicastAddress");
        }
        if (networkInterface == null) {
            throw new NullPointerException("networkInterface");
        }
        a a2 = this;
        synchronized (a2) {
            List list;
            if (this.j != null && (list = (List)this.j.get(inetAddress)) != null) {
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    MembershipKey membershipKey = (MembershipKey)iterator.next();
                    if (!networkInterface.equals(membershipKey.networkInterface()) || (inetAddress2 != null || membershipKey.sourceAddress() != null) && (inetAddress2 == null || !inetAddress2.equals(membershipKey.sourceAddress()))) continue;
                    membershipKey.drop();
                    iterator.remove();
                }
                if (list.isEmpty()) {
                    this.j.remove(inetAddress);
                }
            }
        }
        bw2.b();
        return bw2;
    }

    @Override
    public av c(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2) {
        return this.c(inetAddress, networkInterface, inetAddress2, this.p());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public av c(InetAddress inetAddress, NetworkInterface networkInterface, InetAddress inetAddress2, bw bw2) {
        a.R();
        if (inetAddress == null) {
            throw new NullPointerException("multicastAddress");
        }
        if (inetAddress2 == null) {
            throw new NullPointerException("sourceToBlock");
        }
        if (networkInterface == null) {
            throw new NullPointerException("networkInterface");
        }
        a a2 = this;
        synchronized (a2) {
            if (this.j != null) {
                List list = (List)this.j.get(inetAddress);
                for (MembershipKey membershipKey : list) {
                    if (!networkInterface.equals(membershipKey.networkInterface())) continue;
                    try {
                        membershipKey.block(inetAddress2);
                    }
                    catch (IOException iOException) {
                        bw2.a(iOException);
                    }
                }
            }
        }
        bw2.b();
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
        catch (SocketException socketException) {
            bw2.a(socketException);
            return bw2;
        }
    }

    @Override
    protected void b(boolean bl2) {
        super.b(bl2);
    }

    @Override
    protected /* synthetic */ SelectableChannel V() {
        return this.N();
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

