/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.a.a;
import io.netty.a.g;
import io.netty.a.h;
import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.ba;
import io.netty.channel.bi;
import io.netty.channel.br;
import io.netty.channel.bw;
import io.netty.channel.cn;
import io.netty.util.b.ad;
import io.netty.util.b.af;
import io.netty.util.c;
import io.netty.util.c.d;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Map;

public final class f
extends a {
    private static final io.netty.util.c.b.g a;
    private volatile SocketAddress b;

    public f() {
    }

    private f(f f2) {
        super(f2);
        this.b = f2.b;
    }

    public f c(SocketAddress socketAddress) {
        this.b = socketAddress;
        return this;
    }

    public f c(String string, int n2) {
        this.b = new InetSocketAddress(string, n2);
        return this;
    }

    public f c(InetAddress inetAddress, int n2) {
        this.b = new InetSocketAddress(inetAddress, n2);
        return this;
    }

    public av l() {
        this.m();
        SocketAddress socketAddress = this.b;
        if (socketAddress == null) {
            throw new IllegalStateException("remoteAddress not set");
        }
        return this.b(socketAddress, this.f());
    }

    public av d(String string, int n2) {
        return this.d(new InetSocketAddress(string, n2));
    }

    public av d(InetAddress inetAddress, int n2) {
        return this.d(new InetSocketAddress(inetAddress, n2));
    }

    public av d(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new NullPointerException("remoteAddress");
        }
        this.m();
        return this.b(socketAddress, this.f());
    }

    public av a(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (socketAddress == null) {
            throw new NullPointerException("remoteAddress");
        }
        this.m();
        return this.b(socketAddress, socketAddress2);
    }

    private av b(SocketAddress socketAddress, SocketAddress socketAddress2) {
        av av2 = this.e(socketAddress);
        if (av2 != null) {
            return av2;
        }
        av av3 = this.e();
        an an2 = av3.e();
        if (av3.bq_() != null) {
            return av3;
        }
        bw bw2 = an2.p();
        if (av3.isDone()) {
            f.b(av3, an2, socketAddress, socketAddress2, bw2);
        } else {
            av3.a((ad)new g(this, av3, an2, socketAddress, socketAddress2, bw2));
        }
        return bw2;
    }

    private static void b(av av2, an an2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        an2.e().execute(new h(av2, socketAddress2, an2, socketAddress, bw2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void a(an an2) {
        Map map;
        br br2 = an2.c();
        br2.b(new ba[]{this.h()});
        Map map2 = map = this.j();
        synchronized (map2) {
            for (Map.Entry object : map.entrySet()) {
                try {
                    if (an2.G().a((bi)object.getKey(), object.getValue())) continue;
                    a.d("Unknown channel option: " + object);
                }
                catch (Throwable entry) {
                    a.d("Failed to set a channel option: " + an2, entry);
                }
            }
        }
        map2 = this.k();
        Map map3 = map2;
        synchronized (map3) {
            for (Map.Entry entry : map2.entrySet()) {
                an2.a((c)entry.getKey()).set(entry.getValue());
            }
        }
    }

    public f m() {
        super.a();
        if (this.h() == null) {
            throw new IllegalStateException("handler not set");
        }
        return this;
    }

    public f n() {
        return new f(this);
    }

    @Override
    public String toString() {
        if (this.b == null) {
            return super.toString();
        }
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.setLength(stringBuilder.length() - 1);
        stringBuilder.append(", remoteAddress: ");
        stringBuilder.append(this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    av e(SocketAddress socketAddress) {
        InetAddress inetAddress;
        if (socketAddress instanceof InetSocketAddress && (com.c.b.a.a((inetAddress = ((InetSocketAddress)socketAddress).getAddress()).getHostAddress()) || com.c.b.a.a(inetAddress.getHostName()))) {
            an an2 = this.g().a();
            an2.t().d();
            SocketException socketException = new SocketException("Network is unreachable");
            socketException.setStackTrace(d.k);
            return new cn(an2, af.a).a(socketException);
        }
        return null;
    }

    @Override
    public /* synthetic */ a b() {
        return this.n();
    }

    @Override
    public /* synthetic */ a a() {
        return this.m();
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.n();
    }

    static /* synthetic */ void a(av av2, an an2, SocketAddress socketAddress, SocketAddress socketAddress2, bw bw2) {
        f.b(av2, an2, socketAddress, socketAddress2, bw2);
    }

    static {
        com.c.b.d.a();
        a = io.netty.util.c.b.h.a(f.class);
    }
}

