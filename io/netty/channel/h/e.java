/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.h;

import io.netty.b.h;
import io.netty.channel.ap;
import io.netty.channel.ar;
import io.netty.channel.bi;
import io.netty.channel.cd;
import io.netty.channel.cw;
import io.netty.channel.cy;
import io.netty.channel.df;
import io.netty.channel.h.b;
import io.netty.channel.h.c;
import io.netty.util.c.b.g;
import io.netty.util.c.u;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Map;

public class e
extends cd
implements c {
    private static final g b = io.netty.util.c.b.h.a(e.class);
    private static final df c = new cw(2048);
    private final DatagramSocket d;
    private volatile boolean e;

    public e(b b2, DatagramSocket datagramSocket) {
        super(b2);
        if (datagramSocket == null) {
            throw new NullPointerException("javaSocket");
        }
        this.d = datagramSocket;
        this.c(c);
    }

    @Override
    public Map a() {
        return this.a(super.a(), bi.l, bi.o, bi.n, bi.p, bi.x, bi.u, bi.v, bi.w, bi.t, bi.B);
    }

    @Override
    public Object a(bi bi2) {
        if (bi2 == bi.l) {
            return this.q();
        }
        if (bi2 == bi.o) {
            return this.n();
        }
        if (bi2 == bi.n) {
            return this.m();
        }
        if (bi2 == bi.p) {
            return this.p();
        }
        if (bi2 == bi.x) {
            return this.r();
        }
        if (bi2 == bi.u) {
            return this.t();
        }
        if (bi2 == bi.v) {
            return this.u();
        }
        if (bi2 == bi.w) {
            return this.s();
        }
        if (bi2 == bi.t) {
            return this.o();
        }
        if (bi2 == bi.B) {
            return this.e;
        }
        return super.a(bi2);
    }

    @Override
    public boolean a(bi bi2, Object object) {
        this.b(bi2, object);
        if (bi2 == bi.l) {
            this.k((Boolean)object);
        } else if (bi2 == bi.o) {
            this.t((Integer)object);
        } else if (bi2 == bi.n) {
            this.u((Integer)object);
        } else if (bi2 == bi.p) {
            this.l((Boolean)object);
        } else if (bi2 == bi.x) {
            this.g((Boolean)object);
        } else if (bi2 == bi.u) {
            this.b((InetAddress)object);
        } else if (bi2 == bi.v) {
            this.b((NetworkInterface)object);
        } else if (bi2 == bi.w) {
            this.r((Integer)object);
        } else if (bi2 == bi.t) {
            this.s((Integer)object);
        } else if (bi2 == bi.B) {
            this.c((Boolean)object);
        } else {
            return super.a(bi2, object);
        }
        return true;
    }

    private void c(boolean bl2) {
        if (this.a.j()) {
            throw new IllegalStateException("Can only changed before channel was registered");
        }
        this.e = bl2;
    }

    @Override
    public boolean q() {
        try {
            return this.d.getBroadcast();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public c k(boolean bl2) {
        try {
            if (bl2 && !u.b() && !u.c() && !this.d.getLocalAddress().isAnyLocalAddress()) {
                b.d("A non-root user can't receive a broadcast packet if the socket is not bound to a wildcard address; setting the SO_BROADCAST flag anyway as requested on the socket which is bound to " + this.d.getLocalSocketAddress() + '.');
            }
            this.d.setBroadcast(bl2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public InetAddress t() {
        if (this.d instanceof MulticastSocket) {
            try {
                return ((MulticastSocket)this.d).getInterface();
            }
            catch (SocketException socketException) {
                throw new ar(socketException);
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public c b(InetAddress inetAddress) {
        if (this.d instanceof MulticastSocket) {
            try {
                ((MulticastSocket)this.d).setInterface(inetAddress);
            }
            catch (SocketException socketException) {
                throw new ar(socketException);
            }
        } else {
            throw new UnsupportedOperationException();
        }
        return this;
    }

    @Override
    public boolean r() {
        if (this.d instanceof MulticastSocket) {
            try {
                return ((MulticastSocket)this.d).getLoopbackMode();
            }
            catch (SocketException socketException) {
                throw new ar(socketException);
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public c g(boolean bl2) {
        if (this.d instanceof MulticastSocket) {
            try {
                ((MulticastSocket)this.d).setLoopbackMode(bl2);
            }
            catch (SocketException socketException) {
                throw new ar(socketException);
            }
        } else {
            throw new UnsupportedOperationException();
        }
        return this;
    }

    @Override
    public NetworkInterface u() {
        if (this.d instanceof MulticastSocket) {
            try {
                return ((MulticastSocket)this.d).getNetworkInterface();
            }
            catch (SocketException socketException) {
                throw new ar(socketException);
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public c b(NetworkInterface networkInterface) {
        if (this.d instanceof MulticastSocket) {
            try {
                ((MulticastSocket)this.d).setNetworkInterface(networkInterface);
            }
            catch (SocketException socketException) {
                throw new ar(socketException);
            }
        } else {
            throw new UnsupportedOperationException();
        }
        return this;
    }

    @Override
    public boolean p() {
        try {
            return this.d.getReuseAddress();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public c l(boolean bl2) {
        try {
            this.d.setReuseAddress(bl2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public int n() {
        try {
            return this.d.getReceiveBufferSize();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public c t(int n2) {
        try {
            this.d.setReceiveBufferSize(n2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public int m() {
        try {
            return this.d.getSendBufferSize();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public c u(int n2) {
        try {
            this.d.setSendBufferSize(n2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public int s() {
        if (this.d instanceof MulticastSocket) {
            try {
                return ((MulticastSocket)this.d).getTimeToLive();
            }
            catch (IOException iOException) {
                throw new ar(iOException);
            }
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public c r(int n2) {
        if (this.d instanceof MulticastSocket) {
            try {
                ((MulticastSocket)this.d).setTimeToLive(n2);
            }
            catch (IOException iOException) {
                throw new ar(iOException);
            }
        } else {
            throw new UnsupportedOperationException();
        }
        return this;
    }

    @Override
    public int o() {
        try {
            return this.d.getTrafficClass();
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
    }

    @Override
    public c s(int n2) {
        try {
            this.d.setTrafficClass(n2);
        }
        catch (SocketException socketException) {
            throw new ar(socketException);
        }
        return this;
    }

    @Override
    public c p(int n2) {
        super.c(n2);
        return this;
    }

    @Override
    public c o(int n2) {
        super.a(n2);
        return this;
    }

    @Override
    public c q(int n2) {
        super.b(n2);
        return this;
    }

    @Override
    public c c(h h2) {
        super.a(h2);
        return this;
    }

    @Override
    public c c(df df2) {
        super.a(df2);
        return this;
    }

    @Override
    public c j(boolean bl2) {
        super.a(bl2);
        return this;
    }

    @Override
    public c i(boolean bl2) {
        super.b(bl2);
        return this;
    }

    public c f(int n2) {
        super.d(n2);
        return this;
    }

    public c g(int n2) {
        super.e(n2);
        return this;
    }

    @Override
    public c c(cy cy2) {
        super.a(cy2);
        return this;
    }

    @Override
    public /* synthetic */ ap a(cy cy2) {
        return this.c(cy2);
    }

    @Override
    public /* synthetic */ ap e(int n2) {
        return this.g(n2);
    }

    @Override
    public /* synthetic */ ap d(int n2) {
        return this.f(n2);
    }

    @Override
    public /* synthetic */ ap b(boolean bl2) {
        return this.i(bl2);
    }

    @Override
    public /* synthetic */ ap a(boolean bl2) {
        return this.j(bl2);
    }

    @Override
    public /* synthetic */ ap a(df df2) {
        return this.c(df2);
    }

    @Override
    public /* synthetic */ ap a(h h2) {
        return this.c(h2);
    }

    @Override
    public /* synthetic */ ap c(int n2) {
        return this.p(n2);
    }

    @Override
    public /* synthetic */ ap b(int n2) {
        return this.q(n2);
    }

    @Override
    public /* synthetic */ ap a(int n2) {
        return this.o(n2);
    }
}

