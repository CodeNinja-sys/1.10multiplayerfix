/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import com.a.a.b.cm;
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.n.a.dl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import net.minecraft.c.b.j;
import net.minecraft.g.bs;
import net.minecraft.g.cn;
import net.minecraft.p.b;
import net.minecraft.q.a.a.c;
import net.minecraft.q.a.d;
import net.minecraft.q.a.u;
import net.minecraft.q.ad;
import net.minecraft.q.aj;
import net.minecraft.q.as;
import net.minecraft.q.aw;
import net.minecraft.q.b.am;
import net.minecraft.q.b.i;
import net.minecraft.q.f.a.h;
import net.minecraft.q.f.f;
import net.minecraft.q.f.k;
import net.minecraft.q.g;
import net.minecraft.q.g.a.ab;
import net.minecraft.q.g.c.a.e;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.l;
import net.minecraft.q.r;
import net.minecraft.q.t;
import net.minecraft.q.w;
import net.minecraft.q.x;
import net.minecraft.q.z;
import net.minecraft.u.b.m;
import net.minecraft.u.b.s;
import net.minecraft.u.bo;
import net.minecraft.u.cd;
import net.minecraft.w.ag;
import net.minecraft.w.g.a;
import net.minecraft.w.h.al;
import net.minecraft.w.h.p;
import net.minecraft.w.h.y;
import net.minecraft.w.n;
import net.minecraft.x.d.b.av;
import net.minecraft.x.d.b.bf;
import net.minecraft.x.d.b.bk;
import net.minecraft.x.d.b.ce;

public class v
extends net.minecraft.q.k
implements net.minecraft.u.av {
    private static final org.apache.logging.log4j.d H = org.apache.logging.log4j.c.c();
    private final net.minecraft.c.a I;
    private final net.minecraft.w.w J;
    private final j K;
    private final Set L = aad.a();
    private final TreeSet M = new TreeSet();
    private final Map N = sz.c();
    public boolean a;
    private boolean O;
    private int P;
    private final g Q;
    private final net.minecraft.q.c R = new net.minecraft.q.c();
    protected final net.minecraft.b.a G = new net.minecraft.b.a(this);
    private final x[] S = new x[]{new x(null), new x(null)};
    private int T;
    private final List U = ov.a();

    public v(net.minecraft.c.a a2, u u2, d d2, int n2, b b2) {
        super(u2, d2, net.minecraft.q.w.a(n2).d(), b2, false);
        this.I = a2;
        this.J = new net.minecraft.w.w(this);
        this.K = new j(this);
        this.q.a(this);
        this.t = this.b();
        this.Q = new g(this);
        this.u();
        this.v();
        this.V().a(a2.aT());
    }

    @Override
    public net.minecraft.q.k j() {
        this.x = new net.minecraft.q.a.h(this.u);
        String string = net.minecraft.b.e.a(this.q);
        net.minecraft.b.e e2 = (net.minecraft.b.e)this.x.a(net.minecraft.b.e.class, string);
        if (e2 == null) {
            this.y = new net.minecraft.b.e(this);
            this.x.a(string, this.y);
        } else {
            this.y = e2;
            this.y.a(this);
        }
        this.B = new net.minecraft.j.c(this.I);
        net.minecraft.j.h h2 = (net.minecraft.j.h)this.x.a(net.minecraft.j.h.class, "scoreboard");
        if (h2 == null) {
            h2 = new net.minecraft.j.h();
            this.x.a("scoreboard", h2);
        }
        h2.a(this.B);
        ((net.minecraft.j.c)this.B).a(new ad(h2));
        this.z = new c(new File(new File(this.u.a(), "data"), "loot_tables"));
        this.V().b(this.v.y(), this.v.z());
        this.V().c(this.v.E());
        this.V().b(this.v.D());
        this.V().c(this.v.F());
        this.V().b(this.v.G());
        if (this.v.B() > 0L) {
            this.V().a(this.v.A(), this.v.C(), this.v.B());
        } else {
            this.V().a(this.v.A());
        }
        return this;
    }

    @Override
    public void a() {
        super.a();
        if (this.F().s() && this.R() != net.minecraft.q.l.d) {
            this.F().a(net.minecraft.q.l.d);
        }
        this.q.l().b();
        if (this.g()) {
            if (this.G().b("doDaylightCycle")) {
                long l2 = this.v.f() + 24000L;
                this.v.b(l2 - l2 % 24000L);
            }
            this.c();
        }
        this.A.a("mobSpawner");
        if (this.G().b("doMobSpawning") && this.v.t() != net.minecraft.q.ab.g) {
            this.R.a(this, this.D, this.E, this.v.e() % 400L == 0L);
        }
        this.A.c("chunkSource");
        this.t.a();
        int n2 = this.a(1.0f);
        if (n2 != this.S()) {
            this.d(n2);
        }
        this.v.a(this.v.e() + 1L);
        if (this.G().b("doDaylightCycle")) {
            this.v.b(this.v.f() + 1L);
        }
        this.A.c("tickPending");
        this.a(false);
        this.A.c("tickBlocks");
        this.d();
        this.A.c("chunkMap");
        this.K.c();
        this.A.c("village");
        this.y.a();
        this.G.a();
        this.A.c("portalForcer");
        this.Q.a(this.B());
        this.A.b();
        this.am();
    }

    public am a(ag ag2, net.minecraft.u.b.b b2) {
        List list = this.ac().a(ag2, b2);
        return list != null && !list.isEmpty() ? (am)cd.a(this.p, list) : null;
    }

    public boolean a(ag ag2, am am2, net.minecraft.u.b.b b2) {
        List list = this.ac().a(ag2, b2);
        return list != null && !list.isEmpty() ? list.contains(am2) : false;
    }

    @Override
    public void H() {
        this.O = false;
        if (!this.g.isEmpty()) {
            int n2 = 0;
            int n3 = 0;
            for (net.minecraft.w.a.b b2 : this.g) {
                if (b2.a()) {
                    ++n2;
                    continue;
                }
                if (!b2.ae()) continue;
                ++n3;
            }
            this.O = n3 > 0 && n3 >= this.g.size() - n2;
        }
    }

    protected void c() {
        this.O = false;
        for (net.minecraft.w.a.b b2 : this.g) {
            if (!b2.ae()) continue;
            b2.a(false, false, true);
        }
        this.ai();
    }

    private void ai() {
        this.v.g(0);
        this.v.b(false);
        this.v.f(0);
        this.v.a(false);
    }

    public boolean g() {
        if (this.O && !this.C) {
            for (net.minecraft.w.a.b b2 : this.g) {
                if (b2.a() || b2.af()) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public void m() {
        if (this.v.c() <= 0) {
            this.v.b(this.x() + 1);
        }
        int n2 = this.v.b();
        int n3 = this.v.d();
        int n4 = 0;
        while (this.b(new net.minecraft.u.b.b(n2, 0, n3)).d() == net.minecraft.g.a.h.a) {
            n2 += this.p.nextInt(8) - this.p.nextInt(8);
            n3 += this.p.nextInt(8) - this.p.nextInt(8);
            if (++n4 == 10000) break;
        }
        this.v.a(n2);
        this.v.c(n3);
    }

    @Override
    protected boolean a(int n2, int n3, boolean bl2) {
        return this.ac().c(n2, n3);
    }

    protected void h() {
        this.A.a("playerCheckLight");
        if (!this.g.isEmpty()) {
            int n2 = this.p.nextInt(this.g.size());
            net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)this.g.get(n2);
            int n3 = net.minecraft.u.b.n.c(b2.aU) + this.p.nextInt(11) - 5;
            int n4 = net.minecraft.u.b.n.c(b2.aV) + this.p.nextInt(11) - 5;
            int n5 = net.minecraft.u.b.n.c(b2.aW) + this.p.nextInt(11) - 5;
            this.v(new net.minecraft.u.b.b(n3, n4, n5));
        }
        this.A.b();
    }

    @Override
    protected void d() {
        this.h();
        if (this.v.t() == net.minecraft.q.ab.g) {
            Iterator iterator = this.K.b();
            while (iterator.hasNext()) {
                ((k)iterator.next()).b(false);
            }
        } else {
            int n2 = this.G().c("randomTickSpeed");
            boolean bl2 = this.J();
            boolean bl3 = this.I();
            this.A.a("pollingChunks");
            Iterator iterator = this.K.b();
            while (iterator.hasNext()) {
                Object object;
                net.minecraft.u.b.b b2;
                int n3;
                this.A.a("getChunk");
                k k2 = (k)iterator.next();
                int n4 = k2.b * 16;
                int n5 = k2.c * 16;
                this.A.c("checkNextLight");
                k2.n();
                this.A.c("tickChunk");
                k2.b(false);
                this.A.c("thunder");
                if (bl2 && bl3 && this.p.nextInt(100000) == 0) {
                    this.j = this.j * 3 + 1013904223;
                    n3 = this.j >> 2;
                    b2 = this.D(new net.minecraft.u.b.b(n4 + (n3 & 0xF), 0, n5 + (n3 >> 8 & 0xF)));
                    if (this.A(b2)) {
                        object = this.C(b2);
                        if (this.p.nextDouble() < (double)((z)object).a() * 0.05) {
                            al al2 = new al(this);
                            al2.a(net.minecraft.w.h.p.e);
                            al2.y(true);
                            al2.e(0);
                            al2.e(b2.cy_(), b2.k(), b2.l());
                            this.a(al2);
                            this.e(new a(this, b2.cy_(), b2.k(), b2.l(), true));
                        } else {
                            this.e(new a(this, b2.cy_(), b2.k(), b2.l(), false));
                        }
                    }
                }
                this.A.c("iceandsnow");
                if (this.p.nextInt(16) == 0) {
                    this.j = this.j * 3 + 1013904223;
                    n3 = this.j >> 2;
                    b2 = this.o(new net.minecraft.u.b.b(n4 + (n3 & 0xF), 0, n5 + (n3 >> 8 & 0xF)));
                    object = b2.c();
                    if (this.u((net.minecraft.u.b.b)object)) {
                        this.b((net.minecraft.u.b.b)object, net.minecraft.a.p.aI.v());
                    }
                    if (bl2 && this.f(b2, true)) {
                        this.b(b2, net.minecraft.a.p.aH.v());
                    }
                    if (bl2 && this.a((net.minecraft.u.b.b)object).g()) {
                        this.n((net.minecraft.u.b.b)object).c().b_(this, (net.minecraft.u.b.b)object);
                    }
                }
                this.A.c("tickBlocks");
                if (n2 > 0) {
                    for (net.minecraft.q.f.a.e e2 : k2.h()) {
                        if (e2 == net.minecraft.q.f.k.a || !e2.b()) continue;
                        for (int i2 = 0; i2 < n2; ++i2) {
                            this.j = this.j * 3 + 1013904223;
                            int n6 = this.j >> 2;
                            int n7 = n6 & 0xF;
                            int n8 = n6 >> 8 & 0xF;
                            int n9 = n6 >> 16 & 0xF;
                            net.minecraft.g.c.b b3 = e2.a(n7, n9, n8);
                            cn cn2 = b3.c();
                            this.A.a("randomTick");
                            if (cn2.m()) {
                                cn2.b((net.minecraft.q.k)this, new net.minecraft.u.b.b(n7 + n4, n9 + e2.c(), n8 + n5), b3, this.p);
                            }
                            this.A.b();
                        }
                    }
                }
                this.A.b();
            }
            this.A.b();
        }
    }

    protected net.minecraft.u.b.b D(net.minecraft.u.b.b b2) {
        net.minecraft.u.b.b b3 = this.o(b2);
        net.minecraft.u.b.a a2 = new net.minecraft.u.b.a(b3, new net.minecraft.u.b.b(b3.cy_(), this.L(), b3.l())).b(3.0);
        List list = this.a(net.minecraft.w.l.class, a2, (cm)new r(this));
        if (!list.isEmpty()) {
            return ((net.minecraft.w.l)list.get(this.p.nextInt(list.size()))).aC();
        }
        if (b3.k() == -1) {
            b3 = b3.a(2);
        }
        return b3;
    }

    @Override
    public boolean d(net.minecraft.u.b.b b2, cn cn2) {
        as as2 = new as(b2, cn2);
        return this.U.contains(as2);
    }

    @Override
    public boolean e(net.minecraft.u.b.b b2, cn cn2) {
        as as2 = new as(b2, cn2);
        return this.L.contains(as2);
    }

    @Override
    public void a(net.minecraft.u.b.b b2, cn cn2, int n2) {
        this.a(b2, cn2, n2, 0);
    }

    @Override
    public void a(net.minecraft.u.b.b b2, cn cn2, int n2, int n3) {
        if (b2 instanceof net.minecraft.u.b.g || b2 instanceof net.minecraft.u.b.h) {
            b2 = new net.minecraft.u.b.b(b2);
            org.apache.logging.log4j.c.c().f("Tried to assign a mutable BlockPos to tick data...", (Throwable)new Error(b2.getClass().toString()));
        }
        net.minecraft.g.a.h h2 = cn2.v().d();
        if (this.b && h2 != net.minecraft.g.a.h.a) {
            if (cn2.t()) {
                net.minecraft.g.c.b b3;
                if (this.a(b2.a(-8, -8, -8), b2.a(8, 8, 8)) && (b3 = this.n(b2)).d() != net.minecraft.g.a.h.a && b3.c() == cn2) {
                    b3.c().a((net.minecraft.q.k)this, b2, b3, this.p);
                }
                return;
            }
            n2 = 1;
        }
        as as2 = new as(b2, cn2);
        if (this.d(b2)) {
            if (h2 != net.minecraft.g.a.h.a) {
                as2.a((long)n2 + this.v.e());
                as2.a(n3);
            }
            if (!this.L.contains(as2)) {
                this.L.add(as2);
                this.M.add(as2);
            }
        }
    }

    @Override
    public void b(net.minecraft.u.b.b b2, cn cn2, int n2, int n3) {
        if (b2 instanceof net.minecraft.u.b.g || b2 instanceof net.minecraft.u.b.h) {
            b2 = new net.minecraft.u.b.b(b2);
            org.apache.logging.log4j.c.c().f("Tried to assign a mutable BlockPos to tick data...", (Throwable)new Error(b2.getClass().toString()));
        }
        as as2 = new as(b2, cn2);
        as2.a(n3);
        net.minecraft.g.a.h h2 = cn2.v().d();
        if (h2 != net.minecraft.g.a.h.a) {
            as2.a((long)n2 + this.v.e());
        }
        if (!this.L.contains(as2)) {
            this.L.add(as2);
            this.M.add(as2);
        }
    }

    @Override
    public void q() {
        if (this.g.isEmpty()) {
            if (this.P++ >= 300) {
                return;
            }
        } else {
            this.X();
        }
        this.q.r();
        super.q();
    }

    @Override
    protected void r() {
        super.r();
        this.A.c("players");
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            n n2 = (n)this.g.get(i2);
            n n3 = n2.df();
            if (n3 != null) {
                if (!n3.bk && n3.A(n2)) continue;
                n2.o();
            }
            this.A.a("tick");
            if (!n2.bk) {
                try {
                    this.g(n2);
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Ticking player");
                    net.minecraft.k.i i3 = a2.a("Player being ticked");
                    n2.a(i3);
                    throw new bo(a2);
                }
            }
            this.A.b();
            this.A.a("remove");
            if (n2.bk) {
                int n4 = n2.bH;
                int n5 = n2.bJ;
                if (n2.bG && this.a(n4, n5, true)) {
                    this.a(n4, n5).b(n2);
                }
                this.c.remove(n2);
                this.d(n2);
            }
            this.A.b();
        }
    }

    public void X() {
        this.P = 0;
    }

    @Override
    public boolean a(boolean bl2) {
        as as2;
        if (this.v.t() == net.minecraft.q.ab.g) {
            return false;
        }
        int n2 = this.M.size();
        if (n2 != this.L.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (n2 > 65536) {
            n2 = 65536;
        }
        this.A.a("cleaning");
        for (int i2 = 0; i2 < n2; ++i2) {
            as2 = (as)this.M.first();
            if (!bl2 && as2.b > this.v.e()) break;
            this.M.remove(as2);
            this.L.remove(as2);
            this.U.add(as2);
        }
        this.A.b();
        this.A.a("ticking");
        Iterator iterator = this.U.iterator();
        while (iterator.hasNext()) {
            as2 = (as)iterator.next();
            iterator.remove();
            boolean bl3 = false;
            if (this.a(as2.a.a(0, 0, 0), as2.a.a(0, 0, 0))) {
                net.minecraft.g.c.b b2 = this.n(as2.a);
                if (b2.d() == net.minecraft.g.a.h.a || !cn.a(b2.c(), as2.a())) continue;
                try {
                    b2.c().a((net.minecraft.q.k)this, as2.a, b2, this.p);
                    continue;
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Exception while ticking a block");
                    net.minecraft.k.i i3 = a2.a("Block being ticked");
                    net.minecraft.k.i.a(i3, as2.a, b2);
                    throw new bo(a2);
                }
            }
            this.a(as2.a, as2.a(), 0);
        }
        this.A.b();
        this.U.clear();
        return !this.M.isEmpty();
    }

    @Override
    public List a(k k2, boolean bl2) {
        m m2 = k2.k();
        int n2 = (m2.a << 4) - 2;
        int n3 = n2 + 16 + 2;
        int n4 = (m2.b << 4) - 2;
        int n5 = n4 + 16 + 2;
        return this.b(new dc(n2, 0, n4, n3, 256, n5), bl2);
    }

    @Override
    public List b(dc dc2, boolean bl2) {
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < 2; ++i2) {
            Iterator iterator = i2 == 0 ? this.M.iterator() : this.U.iterator();
            while (iterator.hasNext()) {
                as as2 = (as)iterator.next();
                net.minecraft.u.b.b b2 = as2.a;
                if (b2.cy_() < dc2.a || b2.cy_() >= dc2.d || b2.l() < dc2.c || b2.l() >= dc2.f) continue;
                if (bl2) {
                    if (i2 == 0) {
                        this.L.remove(as2);
                    }
                    iterator.remove();
                }
                if (arrayList == null) {
                    arrayList = ov.a();
                }
                arrayList.add(as2);
            }
        }
        return arrayList;
    }

    @Override
    public void a(n n2, boolean bl2) {
        if (!this.ak() && (n2 instanceof y || n2 instanceof net.minecraft.w.h.c)) {
            n2.aa();
        }
        if (!this.aj() && n2 instanceof net.minecraft.w.g) {
            n2.aa();
        }
        super.a(n2, bl2);
    }

    private boolean aj() {
        return this.I.an();
    }

    private boolean ak() {
        return this.I.am();
    }

    @Override
    protected f b() {
        h h2 = this.u.a(this.q);
        return new net.minecraft.q.g.t(this, h2, this.q.d());
    }

    @Override
    public boolean a(net.minecraft.w.a.b b2, net.minecraft.u.b.b b3) {
        return !this.I.a(this, b3, b2) && this.V().a(b3);
    }

    @Override
    public void a(aj aj2) {
        if (!this.v.w()) {
            try {
                this.b(aj2);
                if (this.v.t() == net.minecraft.q.ab.g) {
                    this.al();
                }
                super.a(aj2);
            }
            catch (Throwable throwable) {
                net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Exception initializing level");
                try {
                    this.a(a2);
                }
                catch (Throwable throwable2) {
                    // empty catch block
                }
                throw new bo(a2);
            }
            this.v.f(true);
        }
    }

    private void al() {
        this.v.c(false);
        this.v.e(true);
        this.v.b(false);
        this.v.a(false);
        this.v.e(1000000000);
        this.v.b(6000L);
        this.v.a(net.minecraft.q.am.e);
        this.v.d(false);
        this.v.a(net.minecraft.q.l.a);
        this.v.g(true);
        this.G().a("doDaylightCycle", "false");
    }

    private void b(aj aj2) {
        if (!this.q.f()) {
            this.v.a(net.minecraft.u.b.b.c.a(this.q.j()));
        } else if (this.v.t() == net.minecraft.q.ab.g) {
            this.v.a(net.minecraft.u.b.b.c.b());
        } else {
            this.w = true;
            i i2 = this.q.l();
            List list = i2.a();
            Random random = new Random(this.A());
            net.minecraft.u.b.b b2 = i2.a(0, 0, 256, list, random);
            int n2 = 8;
            int n3 = this.q.j();
            int n4 = 8;
            if (b2 != null) {
                n2 = b2.cy_();
                n4 = b2.l();
            } else {
                H.f("Unable to find spawn biome");
            }
            int n5 = 0;
            while (!this.q.b(n2, n4)) {
                n2 += random.nextInt(64) - random.nextInt(64);
                n4 += random.nextInt(64) - random.nextInt(64);
                if (++n5 == 1000) break;
            }
            this.v.a(new net.minecraft.u.b.b(n2, n3, n4));
            this.w = false;
            if (aj2.c()) {
                this.Y();
            }
        }
    }

    protected void Y() {
        ab ab2 = new ab();
        for (int i2 = 0; i2 < 10; ++i2) {
            int n2;
            int n3 = this.v.b() + this.p.nextInt(6) - this.p.nextInt(6);
            net.minecraft.u.b.b b2 = this.p(new net.minecraft.u.b.b(n3, 0, n2 = this.v.d() + this.p.nextInt(6) - this.p.nextInt(6))).b();
            if (ab2.a((net.minecraft.q.k)this, this.p, b2)) break;
        }
    }

    public net.minecraft.u.b.b Z() {
        return this.q.i();
    }

    public void a(boolean bl2, net.minecraft.u.as as2) {
        net.minecraft.q.g.t t2 = this.ac();
        if (t2.f()) {
            if (as2 != null) {
                as2.a("Saving level");
            }
            this.ab();
            if (as2 != null) {
                as2.c("Saving chunks");
            }
            t2.a(bl2);
            for (k k2 : ov.a(t2.c())) {
                if (k2 == null || this.K.a(k2.b, k2.c)) continue;
                t2.a(k2);
            }
        }
    }

    public void aa() {
        net.minecraft.q.g.t t2 = this.ac();
        if (t2.f()) {
            t2.e();
        }
    }

    protected void ab() {
        this.z();
        v[] arrv = this.I.d;
        int n2 = this.I.d.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            v v2 = arrv[i2];
            if (!(v2 instanceof aw)) continue;
            ((aw)v2).ai();
        }
        this.v.a(this.V().h());
        this.v.d(this.V().a());
        this.v.c(this.V().b());
        this.v.e(this.V().m());
        this.v.f(this.V().n());
        this.v.h(this.V().q());
        this.v.i(this.V().p());
        this.v.b(this.V().j());
        this.v.c(this.V().i());
        this.u.a(this.v, this.I.av().b());
        this.x.a();
    }

    @Override
    public boolean a(n n2) {
        return this.i(n2) ? super.a(n2) : false;
    }

    @Override
    public void b(Collection collection) {
        for (n n2 : ov.a(collection)) {
            if (!this.i(n2)) continue;
            this.c.add(n2);
            this.c(n2);
        }
    }

    private boolean i(n n2) {
        if (n2.bk) {
            H.f("Tried to add entity {} but it was marked as removed already", net.minecraft.w.h.b(n2));
            return false;
        }
        UUID uUID = n2.cM();
        if (this.N.containsKey(uUID)) {
            n n3 = (n)this.N.get(uUID);
            if (this.d.contains(n3)) {
                this.d.remove(n3);
            } else {
                if (!(n2 instanceof net.minecraft.w.a.b)) {
                    H.f("Keeping entity {} that already exists with UUID {}", net.minecraft.w.h.b(n3), uUID.toString());
                    return false;
                }
                H.f("Force-added player with duplicate UUID {}", uUID.toString());
            }
            this.f(n3);
        }
        return true;
    }

    @Override
    protected void c(n n2) {
        super.c(n2);
        this.i.a(n2.ca(), n2);
        this.N.put(n2.cM(), n2);
        n[] arrn = n2.cF();
        if (arrn != null) {
            n[] arrn2 = arrn;
            int n3 = arrn.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                n n4 = arrn2[i2];
                this.i.a(n4.ca(), n4);
            }
        }
    }

    @Override
    protected void d(n n2) {
        super.d(n2);
        this.i.d(n2.ca());
        this.N.remove(n2.cM());
        n[] arrn = n2.cF();
        if (arrn != null) {
            n[] arrn2 = arrn;
            int n3 = arrn.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                n n4 = arrn2[i2];
                this.i.d(n4.ca());
            }
        }
    }

    @Override
    public boolean e(n n2) {
        if (super.e(n2)) {
            this.I.av().a(null, n2.aU, n2.aV, n2.aW, 512.0, this.q.a().a(), new bk(n2));
            return true;
        }
        return false;
    }

    @Override
    public void a(n n2, byte by2) {
        this.ae().b(n2, new net.minecraft.x.d.b.aw(n2, by2));
    }

    public net.minecraft.q.g.t ac() {
        return (net.minecraft.q.g.t)super.i();
    }

    @Override
    public t a(n n2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        t t2 = new t(this, n2, d2, d3, d4, f2, bl2, bl3);
        t2.a();
        t2.a(false);
        if (!bl3) {
            t2.d();
        }
        for (net.minecraft.w.a.b b2 : this.g) {
            if (!(b2.h(d2, d3, d4) < 4096.0)) continue;
            ((net.minecraft.w.a.g)b2).a.a(new net.minecraft.x.d.b.l(d2, d3, d4, f2, t2.e(), (s)t2.b().get(b2)));
        }
        return t2;
    }

    @Override
    public void c(net.minecraft.u.b.b b2, cn cn2, int n2, int n3) {
        bs bs2 = new bs(b2, cn2, n2, n3);
        for (bs bs3 : this.S[this.T]) {
            if (!bs3.equals(bs2)) continue;
            return;
        }
        this.S[this.T].add(bs2);
    }

    private void am() {
        while (!this.S[this.T].isEmpty()) {
            int n2 = this.T;
            this.T ^= 1;
            for (bs bs2 : this.S[n2]) {
                if (!this.a(bs2)) continue;
                this.I.av().a(null, bs2.a().cy_(), bs2.a().k(), bs2.a().l(), 64.0, this.q.a().a(), new bf(bs2.a(), bs2.d(), bs2.b(), bs2.c()));
            }
            this.S[n2].clear();
        }
    }

    private boolean a(bs bs2) {
        net.minecraft.g.c.b b2 = this.n(bs2.a());
        return b2.c() == bs2.d() ? b2.a((net.minecraft.q.k)this, bs2.a(), bs2.b(), bs2.c()) : false;
    }

    public void ad() {
        this.u.f();
    }

    @Override
    protected void f() {
        boolean bl2 = this.J();
        super.f();
        if (this.l != this.m) {
            this.I.av().a(new ce(7, this.m), this.q.a().a());
        }
        if (this.n != this.o) {
            this.I.av().a(new ce(8, this.o), this.q.a().a());
        }
        if (bl2 != this.J()) {
            if (bl2) {
                this.I.av().a(new ce(2, 0.0f));
            } else {
                this.I.av().a(new ce(1, 0.0f));
            }
            this.I.av().a(new ce(7, this.m));
            this.I.av().a(new ce(8, this.o));
        }
    }

    @Override
    public net.minecraft.c.a l() {
        return this.I;
    }

    public net.minecraft.w.w ae() {
        return this.J;
    }

    public j af() {
        return this.K;
    }

    public g ag() {
        return this.Q;
    }

    public e ah() {
        return this.u.g();
    }

    public void a(net.minecraft.u.aj aj2, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... arrn) {
        this.a(aj2, false, d2, d3, d4, n2, d5, d6, d7, d8, arrn);
    }

    public void a(net.minecraft.u.aj aj2, boolean bl2, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... arrn) {
        av av2 = new av(aj2, bl2, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, n2, arrn);
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            net.minecraft.w.a.g g2 = (net.minecraft.w.a.g)this.g.get(i2);
            this.a(g2, bl2, d2, d3, d4, av2);
        }
    }

    public void a(net.minecraft.w.a.g g2, net.minecraft.u.aj aj2, boolean bl2, double d2, double d3, double d4, int n2, double d5, double d6, double d7, double d8, int ... arrn) {
        av av2 = new av(aj2, bl2, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, n2, arrn);
        this.a(g2, bl2, d2, d3, d4, av2);
    }

    private void a(net.minecraft.w.a.g g2, boolean bl2, double d2, double d3, double d4, net.minecraft.x.p p2) {
        net.minecraft.u.b.b b2 = g2.aC();
        double d5 = b2.e(d2, d3, d4);
        if (d5 <= 1024.0 || bl2 && d5 <= 262144.0) {
            g2.a.a(p2);
        }
    }

    public n b(UUID uUID) {
        return (n)this.N.get(uUID);
    }

    @Override
    public dl a(Runnable runnable) {
        return this.I.a(runnable);
    }

    @Override
    public boolean aU() {
        return this.I.aU();
    }

    @Override
    public /* synthetic */ f i() {
        return this.ac();
    }
}

