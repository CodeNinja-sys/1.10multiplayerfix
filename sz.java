/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.yk;
import io.netty.c.e.k;
import io.netty.channel.an;
import io.netty.channel.av;
import io.netty.channel.aw;
import io.netty.channel.ba;
import io.netty.channel.bd;
import io.netty.channel.c.b;
import io.netty.channel.c.l;
import io.netty.channel.ct;
import io.netty.channel.di;
import io.netty.channel.epoll.m;
import io.netty.util.b.ad;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.SecretKey;
import org.apache.commons.c.ao;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.g;

public class sz
extends di {
    private static final d h = org.apache.logging.log4j.c.c();
    public static final f a = g.a("NETWORK");
    public static final f b = g.a("NETWORK_PACKETS", a);
    public static final io.netty.util.c c = io.netty.util.c.a("protocol");
    public static final cag d = new cth();
    public static final cag e = new ik();
    public static final cag f = new aij();
    private final cdz i;
    private final Queue j = yk.b();
    private final ReentrantReadWriteLock k = new ReentrantReadWriteLock();
    private an l;
    private SocketAddress m;
    private acy n;
    private cbg o;
    private boolean p;
    private boolean q;

    public sz(cdz cdz2) {
        this.i = cdz2;
    }

    @Override
    public void a(bd bd2) {
        super.a(bd2);
        this.l = bd2.b();
        this.m = this.l.h();
        try {
            this.a(dfj.a);
        }
        catch (Throwable throwable) {
            h.d(throwable);
        }
    }

    public void a(dfj dfj2) {
        this.l.a(c).set((Object)dfj2);
        this.l.G().a(true);
        h.a("Enabled auto read");
    }

    @Override
    public void b(bd bd2) {
        this.a(new du("disconnect.endOfStream", new Object[0]));
    }

    @Override
    public void a(bd bd2, Throwable throwable) {
        du du2 = throwable instanceof k ? new du("disconnect.timeout", new Object[0]) : new du("disconnect.genericReason", "Internal Exception: " + throwable);
        h.a((Object)throwable);
        this.a(du2);
    }

    protected void a(bd bd2, ds ds2) {
        if (this.l.H()) {
            try {
                ds ds3 = ds2;
                ds3.a(this.n);
            }
            catch (xq xq2) {
                // empty catch block
            }
        }
    }

    public void a(acy acy2) {
        ao.a((Object)acy2, "packetListener", new Object[0]);
        h.a("Set listener of {} to {}", this, acy2);
        this.n = acy2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ds ds2) {
        if (this.e()) {
            this.l();
            this.a(ds2, null);
        } else {
            this.k.writeLock().lock();
            try {
                this.j.add(new cxw(ds2, null));
            }
            finally {
                this.k.writeLock().unlock();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ds ds2, ad ad2, ad ... arrad) {
        if (this.e()) {
            this.l();
            this.a(ds2, (ad[])org.apache.commons.c.c.a((Object[])arrad, 0, ad2));
        } else {
            this.k.writeLock().lock();
            try {
                this.j.add(new cxw(ds2, (ad[])org.apache.commons.c.c.a((Object[])arrad, 0, ad2)));
            }
            finally {
                this.k.writeLock().unlock();
            }
        }
    }

    private void a(ds ds2, ad[] arrad) {
        dfj dfj2 = dfj.a(ds2);
        dfj dfj3 = (dfj)((Object)this.l.a(c).get());
        if (dfj3 != dfj2) {
            h.a("Disabled auto read");
            this.l.G().a(false);
        }
        if (this.l.e().bt_()) {
            if (dfj2 != dfj3) {
                this.a(dfj2);
            }
            av av2 = this.l.b(ds2);
            if (arrad != null) {
                av2.a(arrad);
            }
            av2.a((ad)aw.i);
        } else {
            this.l.e().execute(new aqy(this, dfj2, dfj3, ds2, arrad));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void l() {
        if (this.l == null || !this.l.H()) {
            return;
        }
        this.k.readLock().lock();
        try {
            while (!this.j.isEmpty()) {
                cxw cxw2 = (cxw)this.j.poll();
                this.a(cxw.a(cxw2), cxw.b(cxw2));
            }
        }
        finally {
            this.k.readLock().unlock();
        }
    }

    public void a() {
        this.l();
        if (this.n instanceof avf) {
            ((avf)((Object)this.n)).a();
        }
        this.l.n();
    }

    public SocketAddress b() {
        return this.m;
    }

    public void a(cbg cbg2) {
        if (this.l.H()) {
            this.l.l().i();
            this.o = cbg2;
        }
    }

    public boolean c() {
        return this.l instanceof b || this.l instanceof l;
    }

    public static sz a(InetAddress inetAddress, int n2, boolean bl2) {
        cag cag2;
        Class class_;
        sz sz2 = new sz(cdz.b);
        if (io.netty.channel.epoll.d.a() && bl2) {
            class_ = m.class;
            cag2 = e;
        } else {
            class_ = io.netty.channel.h.a.f.class;
            cag2 = d;
        }
        ((io.netty.a.f)((io.netty.a.f)((io.netty.a.f)new io.netty.a.f().a((ct)cag2.c())).a(new cwm(sz2))).a(class_)).d(inetAddress, n2).g();
        return sz2;
    }

    public static sz a(SocketAddress socketAddress) {
        sz sz2 = new sz(cdz.b);
        ((io.netty.a.f)((io.netty.a.f)((io.netty.a.f)new io.netty.a.f().a((ct)f.c())).a(new ccn(sz2))).a(b.class)).d(socketAddress).g();
        return sz2;
    }

    public void a(SecretKey secretKey) {
        this.p = true;
        this.l.c().a("splitter", "decrypt", (ba)new kw(sv.a(2, secretKey)));
        this.l.c().a("prepender", "encrypt", (ba)new bwg(sv.a(1, secretKey)));
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

    public acy g() {
        return this.n;
    }

    public cbg h() {
        return this.o;
    }

    public void i() {
        this.l.G().a(false);
    }

    public void a(int n2) {
        if (n2 >= 0) {
            if (this.l.c().b("decompress") instanceof bvy) {
                ((bvy)this.l.c().b("decompress")).a(n2);
            } else {
                this.l.c().a("decoder", "decompress", (ba)new bvy(n2));
            }
            if (this.l.c().b("compress") instanceof bph) {
                ((bph)this.l.c().b("compress")).a(n2);
            } else {
                this.l.c().a("encoder", "compress", (ba)new bph(n2));
            }
        } else {
            if (this.l.c().b("decompress") instanceof bvy) {
                this.l.c().a("decompress");
            }
            if (this.l.c().b("compress") instanceof bph) {
                this.l.c().a("compress");
            }
        }
    }

    public void j() {
        if (this.l == null || this.l.H()) {
            return;
        }
        if (this.q) {
            h.f("handleDisconnection() called twice");
        } else {
            this.q = true;
            if (this.h() != null) {
                this.g().a(this.h());
            } else if (this.g() != null) {
                this.g().a(new aym("Disconnected"));
            }
        }
    }

    @Override
    protected /* synthetic */ void a(bd bd2, Object object) {
        this.a(bd2, (ds)object);
    }

    static /* synthetic */ an a(sz sz2) {
        return sz2.l;
    }
}

