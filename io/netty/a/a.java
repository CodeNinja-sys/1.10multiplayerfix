/*
 * Decompiled with CFR 0.150.
 */
package io.netty.a;

import io.netty.a.b;
import io.netty.a.c;
import io.netty.a.d;
import io.netty.a.e;
import io.netty.a.i;
import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.ba;
import io.netty.channel.bi;
import io.netty.channel.bw;
import io.netty.channel.cn;
import io.netty.channel.ct;
import io.netty.util.b.ad;
import io.netty.util.b.af;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class a
implements Cloneable {
    private volatile ct a;
    private volatile i b;
    private volatile SocketAddress c;
    private final Map d = new LinkedHashMap();
    private final Map e = new LinkedHashMap();
    private volatile ba f;

    a() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    a(a a2) {
        this.a = a2.a;
        this.b = a2.b;
        this.f = a2.f;
        this.c = a2.c;
        Map map = a2.d;
        synchronized (map) {
            this.d.putAll(a2.d);
        }
        map = a2.e;
        synchronized (map) {
            this.e.putAll(a2.e);
        }
    }

    public a a(ct ct2) {
        if (ct2 == null) {
            throw new NullPointerException("group");
        }
        if (this.a != null) {
            throw new IllegalStateException("group set already");
        }
        this.a = ct2;
        return this;
    }

    public a a(Class class_) {
        if (class_ == null) {
            throw new NullPointerException("channelClass");
        }
        return this.a(new d(class_));
    }

    public a a(i i2) {
        if (i2 == null) {
            throw new NullPointerException("channelFactory");
        }
        if (this.b != null) {
            throw new IllegalStateException("channelFactory set already");
        }
        this.b = i2;
        return this;
    }

    public a a(SocketAddress socketAddress) {
        this.c = socketAddress;
        return this;
    }

    public a a(int n2) {
        return this.a(new InetSocketAddress(n2));
    }

    public a a(String string, int n2) {
        return this.a(new InetSocketAddress(string, n2));
    }

    public a a(InetAddress inetAddress, int n2) {
        return this.a(new InetSocketAddress(inetAddress, n2));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public a a(bi bi2, Object object) {
        if (bi2 == null) {
            throw new NullPointerException("option");
        }
        if (object == null) {
            Map map = this.d;
            synchronized (map) {
                this.d.remove(bi2);
            }
        }
        Map map = this.d;
        synchronized (map) {
            this.d.put(bi2, object);
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public a a(io.netty.util.c c2, Object object) {
        Object object2;
        if (c2 == null) {
            throw new NullPointerException("key");
        }
        if (object == null) {
            object2 = this.e;
            synchronized (object2) {
                this.e.remove(c2);
            }
        }
        object2 = this.e;
        synchronized (object2) {
            this.e.put(c2, object);
        }
        object2 = this;
        return object2;
    }

    public a a() {
        if (this.a == null) {
            throw new IllegalStateException("group not set");
        }
        if (this.b == null) {
            throw new IllegalStateException("channel or channelFactory not set");
        }
        return this;
    }

    public abstract a b();

    public av c() {
        this.a();
        return this.e();
    }

    public av d() {
        this.a();
        SocketAddress socketAddress = this.c;
        if (socketAddress == null) {
            throw new IllegalStateException("localAddress not set");
        }
        return this.c(socketAddress);
    }

    public av b(int n2) {
        return this.b(new InetSocketAddress(n2));
    }

    public av b(String string, int n2) {
        return this.b(new InetSocketAddress(string, n2));
    }

    public av b(InetAddress inetAddress, int n2) {
        return this.b(new InetSocketAddress(inetAddress, n2));
    }

    public av b(SocketAddress socketAddress) {
        this.a();
        if (socketAddress == null) {
            throw new NullPointerException("localAddress");
        }
        return this.c(socketAddress);
    }

    private av c(SocketAddress socketAddress) {
        bw bw2;
        av av2 = this.e();
        an an2 = av2.e();
        if (av2.bq_() != null) {
            return av2;
        }
        if (av2.isDone()) {
            bw2 = an2.p();
            io.netty.a.a.b(av2, an2, socketAddress, bw2);
        } else {
            bw2 = new e(an2, null);
            av2.a((ad)new b(this, av2, an2, socketAddress, bw2));
        }
        return bw2;
    }

    final av e() {
        an an2 = this.g().a();
        try {
            this.a(an2);
        }
        catch (Throwable throwable) {
            an2.t().d();
            return new cn(an2, af.a).a(throwable);
        }
        av av2 = this.i().a(an2);
        if (av2.bq_() != null) {
            if (an2.j()) {
                an2.l();
            } else {
                an2.t().d();
            }
        }
        return av2;
    }

    abstract void a(an var1);

    private static void b(av av2, an an2, SocketAddress socketAddress, bw bw2) {
        an2.e().execute(new c(av2, an2, socketAddress, bw2));
    }

    public a a(ba ba2) {
        if (ba2 == null) {
            throw new NullPointerException("handler");
        }
        this.f = ba2;
        return this;
    }

    final SocketAddress f() {
        return this.c;
    }

    final i g() {
        return this.b;
    }

    final ba h() {
        return this.f;
    }

    public final ct i() {
        return this.a;
    }

    final Map j() {
        return this.d;
    }

    final Map k() {
        return this.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(io.netty.util.c.ad.a(this));
        stringBuilder.append('(');
        if (this.a != null) {
            stringBuilder.append("group: ");
            stringBuilder.append(io.netty.util.c.ad.a(this.a));
            stringBuilder.append(", ");
        }
        if (this.b != null) {
            stringBuilder.append("channelFactory: ");
            stringBuilder.append(this.b);
            stringBuilder.append(", ");
        }
        if (this.c != null) {
            stringBuilder.append("localAddress: ");
            stringBuilder.append(this.c);
            stringBuilder.append(", ");
        }
        Map map = this.d;
        synchronized (map) {
            if (!this.d.isEmpty()) {
                stringBuilder.append("options: ");
                stringBuilder.append(this.d);
                stringBuilder.append(", ");
            }
        }
        map = this.e;
        synchronized (map) {
            if (!this.e.isEmpty()) {
                stringBuilder.append("attrs: ");
                stringBuilder.append(this.e);
                stringBuilder.append(", ");
            }
        }
        if (this.f != null) {
            stringBuilder.append("handler: ");
            stringBuilder.append(this.f);
            stringBuilder.append(", ");
        }
        if (stringBuilder.charAt(stringBuilder.length() - 1) == '(') {
            stringBuilder.append(')');
        } else {
            stringBuilder.setCharAt(stringBuilder.length() - 2, ')');
            stringBuilder.setLength(stringBuilder.length() - 1);
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ Object clone() {
        return this.b();
    }

    static /* synthetic */ void a(av av2, an an2, SocketAddress socketAddress, bw bw2) {
        io.netty.a.a.b(av2, an2, socketAddress, bw2);
    }
}

