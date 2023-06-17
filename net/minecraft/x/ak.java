/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.d.yk;
import io.netty.channel.av;
import io.netty.channel.ba;
import io.netty.channel.c.l;
import io.netty.channel.ct;
import io.netty.channel.di;
import io.netty.util.b.ad;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import net.minecraft.u.aw;
import net.minecraft.u.bd;
import net.minecraft.u.d.a;
import net.minecraft.u.m;
import net.minecraft.x.ab;
import net.minecraft.x.ac;
import net.minecraft.x.an;
import net.minecraft.x.ao;
import net.minecraft.x.aq;
import net.minecraft.x.as;
import net.minecraft.x.at;
import net.minecraft.x.b;
import net.minecraft.x.g;
import net.minecraft.x.h;
import net.minecraft.x.j;
import net.minecraft.x.k;
import net.minecraft.x.p;
import net.minecraft.x.q;
import net.minecraft.x.t;
import net.minecraft.x.u;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.f;

public class ak
extends di {
    private static final d h = org.apache.logging.log4j.c.c();
    public static final f a = org.apache.logging.log4j.g.a("NETWORK");
    public static final f b = org.apache.logging.log4j.g.a("NETWORK_PACKETS", a);
    public static final io.netty.util.c c = io.netty.util.c.a("protocol");
    public static final bd d = new an();
    public static final bd e = new aq();
    public static final bd f = new as();
    private final at i;
    private final Queue j = yk.b();
    private final ReentrantReadWriteLock k = new ReentrantReadWriteLock();
    private io.netty.channel.an l;
    private SocketAddress m;
    private b n;
    private a o;
    private boolean p;
    private boolean q;

    public ak(at at2) {
        this.i = at2;
    }

    @Override
    public void a(io.netty.channel.bd bd2) {
        super.a(bd2);
        this.l = bd2.b();
        this.m = this.l.h();
        try {
            this.a(net.minecraft.x.q.a);
        }
        catch (Throwable throwable) {
            h.d(throwable);
        }
    }

    public void a(q q2) {
        this.l.a(c).set((Object)q2);
        this.l.G().a(true);
        h.a("Enabled auto read");
    }

    @Override
    public void b(io.netty.channel.bd bd2) {
        this.a(new net.minecraft.u.d.l("disconnect.endOfStream", new Object[0]));
    }

    @Override
    public void a(io.netty.channel.bd bd2, Throwable throwable) {
        net.minecraft.u.d.l l2 = throwable instanceof io.netty.c.e.k ? new net.minecraft.u.d.l("disconnect.timeout", new Object[0]) : new net.minecraft.u.d.l("disconnect.genericReason", "Internal Exception: " + throwable);
        h.a((Object)throwable);
        this.a(l2);
    }

    protected void a(io.netty.channel.bd bd2, p p2) {
        if (this.l.H()) {
            try {
                p2.a(this.n);
            }
            catch (ab ab2) {
                // empty catch block
            }
        }
    }

    public void a(b b2) {
        org.apache.commons.c.ao.a((Object)b2, "packetListener", new Object[0]);
        h.a("Set listener of {} to {}", this, b2);
        this.n = b2;
    }

    public void a(p p2) {
        if (this.e()) {
            this.l();
            this.a(p2, null);
        } else {
            this.k.writeLock().lock();
            try {
                this.j.add(new k(p2, null));
            }
            finally {
                this.k.writeLock().unlock();
            }
        }
    }

    public void a(p p2, ad ad2, ad ... arrad) {
        if (this.e()) {
            this.l();
            this.a(p2, (ad[])org.apache.commons.c.c.a((Object[])arrad, 0, ad2));
        } else {
            this.k.writeLock().lock();
            try {
                this.j.add(new k(p2, (ad[])org.apache.commons.c.c.a((Object[])arrad, 0, ad2)));
            }
            finally {
                this.k.writeLock().unlock();
            }
        }
    }

    private void a(p p2, ad[] arrad) {
        q q2 = net.minecraft.x.q.a(p2);
        q q3 = (q)((Object)this.l.a(c).get());
        if (q3 != q2) {
            h.a("Disabled auto read");
            this.l.G().a(false);
        }
        if (this.l.e().bt_()) {
            if (q2 != q3) {
                this.a(q2);
            }
            av av2 = this.l.b(p2);
            if (arrad != null) {
                av2.a(arrad);
            }
            av2.a((ad)io.netty.channel.aw.i);
        } else {
            this.l.e().execute(new ao(this, q2, q3, p2, arrad));
        }
    }

    private void l() {
        if (this.l != null && this.l.H()) {
            this.k.readLock().lock();
            try {
                while (!this.j.isEmpty()) {
                    k k2 = (k)this.j.poll();
                    this.a(net.minecraft.x.k.a(k2), net.minecraft.x.k.b(k2));
                }
            }
            finally {
                this.k.readLock().unlock();
            }
        }
    }

    public void a() {
        this.l();
        if (this.n instanceof aw) {
            ((aw)((Object)this.n)).a();
        }
        this.l.n();
    }

    public SocketAddress b() {
        return this.m;
    }

    public void a(a a2) {
        if (this.l.H()) {
            this.l.l().i();
            this.o = a2;
        }
    }

    public boolean c() {
        return this.l instanceof io.netty.channel.c.b || this.l instanceof l;
    }

    public static ak a(InetAddress inetAddress, int n2, boolean bl2) {
        bd bd2;
        Class class_;
        ak ak2 = new ak(at.b);
        if (io.netty.channel.epoll.d.a() && bl2) {
            class_ = io.netty.channel.epoll.m.class;
            bd2 = e;
        } else {
            class_ = io.netty.channel.h.a.f.class;
            bd2 = d;
        }
        ((io.netty.a.f)((io.netty.a.f)((io.netty.a.f)new io.netty.a.f().a((ct)bd2.a())).a(new g(ak2))).a(class_)).d(inetAddress, n2).g();
        return ak2;
    }

    public static ak a(SocketAddress socketAddress) {
        ak ak2 = new ak(at.b);
        ((io.netty.a.f)((io.netty.a.f)((io.netty.a.f)new io.netty.a.f().a((ct)f.a())).a(new ac(ak2))).a(io.netty.channel.c.b.class)).d(socketAddress).g();
        return ak2;
    }

    public void a(SecretKey secretKey) {
        this.p = true;
        this.l.c().a("splitter", "decrypt", (ba)new u(net.minecraft.u.m.a(2, secretKey)));
        this.l.c().a("prepender", "encrypt", (ba)new h(net.minecraft.u.m.a(1, secretKey)));
    }

    public boolean d() {
        return this.p;
    }

    public boolean e() {
        return this.l != null && this.l.H();
    }

    public boolean f() {
        return this.l == null;
    }

    public b g() {
        return this.n;
    }

    public a h() {
        return this.o;
    }

    public void i() {
        this.l.G().a(false);
    }

    public void a(int n2) {
        if (n2 >= 0) {
            if (this.l.c().b("decompress") instanceof t) {
                ((t)this.l.c().b("decompress")).a(n2);
            } else {
                this.l.c().a("decoder", "decompress", (ba)new t(n2));
            }
            if (this.l.c().b("compress") instanceof j) {
                ((j)this.l.c().b("compress")).a(n2);
            } else {
                this.l.c().a("encoder", "compress", (ba)new j(n2));
            }
        } else {
            if (this.l.c().b("decompress") instanceof t) {
                this.l.c().a("decompress");
            }
            if (this.l.c().b("compress") instanceof j) {
                this.l.c().a("compress");
            }
        }
    }

    public void j() {
        if (this.l != null && !this.l.H()) {
            if (this.q) {
                h.f("handleDisconnection() called twice");
            } else {
                this.q = true;
                if (this.h() != null) {
                    this.g().a(this.h());
                } else if (this.g() != null) {
                    this.g().a(new net.minecraft.u.d.k("Disconnected"));
                }
            }
        }
    }

    @Override
    protected /* synthetic */ void a(io.netty.channel.bd bd2, Object object) {
        this.a(bd2, (p)object);
    }

    static /* synthetic */ io.netty.channel.an a(ak ak2) {
        return ak2.l;
    }
}

