/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.a;

import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.minecraft.d.j;
import net.minecraft.f.ap;
import net.minecraft.g.cn;
import net.minecraft.g.ct;
import net.minecraft.g.ey;
import net.minecraft.g.fm;
import net.minecraft.h.ad;
import net.minecraft.h.ag;
import net.minecraft.h.aq;
import net.minecraft.h.w;
import net.minecraft.h.x;
import net.minecraft.l.k;
import net.minecraft.m.cu;
import net.minecraft.m.t;
import net.minecraft.q.al;
import net.minecraft.q.am;
import net.minecraft.q.v;
import net.minecraft.u.ah;
import net.minecraft.u.ai;
import net.minecraft.u.bb;
import net.minecraft.u.bo;
import net.minecraft.u.bu;
import net.minecraft.u.d.c;
import net.minecraft.u.d.o;
import net.minecraft.u.l;
import net.minecraft.w.a.b;
import net.minecraft.w.a.i;
import net.minecraft.w.aj;
import net.minecraft.w.c.f;
import net.minecraft.w.h;
import net.minecraft.w.n;
import net.minecraft.w.q;
import net.minecraft.x.a;
import net.minecraft.x.d.b.ac;
import net.minecraft.x.d.b.an;
import net.minecraft.x.d.b.as;
import net.minecraft.x.d.b.aw;
import net.minecraft.x.d.b.ax;
import net.minecraft.x.d.b.bi;
import net.minecraft.x.d.b.br;
import net.minecraft.x.d.b.bs;
import net.minecraft.x.d.b.bt;
import net.minecraft.x.d.b.bw;
import net.minecraft.x.d.b.cb;
import net.minecraft.x.d.b.ce;
import net.minecraft.x.d.b.cf;
import net.minecraft.x.d.b.cg;
import net.minecraft.x.d.b.ci;
import net.minecraft.x.d.b.e;
import net.minecraft.x.d.b.p;
import net.minecraft.x.d.b.y;
import net.minecraft.x.d.b.z;
import org.apache.logging.log4j.d;

public class g
extends b
implements net.minecraft.h.i {
    private static final d i = org.apache.logging.log4j.c.c();
    private String j = "en_US";
    public net.minecraft.x.z a;
    public final net.minecraft.c.a b;
    public final net.minecraft.c.b.k c;
    public double d;
    public double e;
    private final List k = ov.b();
    private final net.minecraft.r.b l;
    private float m = Float.MIN_VALUE;
    private int n = Integer.MIN_VALUE;
    private int bZ = Integer.MIN_VALUE;
    private int ca = Integer.MIN_VALUE;
    private int cb = Integer.MIN_VALUE;
    private int cc = Integer.MIN_VALUE;
    private float cd = -1.0E8f;
    private int ce = -99999999;
    private boolean cf = true;
    private int cg = -99999999;
    private int ch = 60;
    private i ci;
    private boolean cj = true;
    private long ck = System.currentTimeMillis();
    private n cl;
    private boolean cm;
    private int cn;
    public boolean f;
    public int g;
    public boolean h;

    public g(net.minecraft.c.a a2, v v2, com.c.a.e e2, net.minecraft.c.b.k k2) {
        super(v2, e2);
        k2.b = this;
        this.c = k2;
        net.minecraft.u.b.b b2 = v2.D();
        if (!v2.q.n() && v2.F().q() != net.minecraft.q.am.d) {
            int n2 = Math.max(0, a2.a(v2));
            int n3 = net.minecraft.u.b.n.c(v2.V().a(b2.cy_(), b2.l()));
            if (n3 < n2) {
                n2 = n3;
            }
            if (n3 <= 1) {
                n2 = 1;
            }
            b2 = v2.p(b2.a(this.bx.nextInt(n2 * 2 + 1) - n2, 0, this.bx.nextInt(n2 * 2 + 1) - n2));
        }
        this.b = a2;
        this.l = a2.av().a((b)this);
        this.bu = 0.0f;
        this.a(b2, 0.0f, 0.0f);
        while (!v2.a((n)this, this.cT()).isEmpty() && this.aV < 255.0) {
            this.e(this.aU, this.aV + 1.0, this.aW);
        }
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        if (e2.b("playerGameType", 99)) {
            if (this.aS().aG()) {
                this.c.a(this.aS().y());
            } else {
                this.c.a(net.minecraft.q.am.a(e2.h("playerGameType")));
            }
        }
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("playerGameType", this.c.a().a());
        n n2 = this.dd();
        if (this.df() != null && n2 != this & n2.b(g.class).size() == 1) {
            net.minecraft.e.e e3 = new net.minecraft.e.e();
            net.minecraft.e.e e4 = new net.minecraft.e.e();
            n2.d(e4);
            e3.a("Attach", this.df().cM());
            e3.a("Entity", e4);
            e2.a("RootVehicle", e3);
        }
    }

    @Override
    public void g(int n2) {
        super.g(n2);
        this.cg = -1;
    }

    @Override
    public void f(int n2) {
        super.f(n2);
        this.cg = -1;
    }

    public void e() {
        this.s.a(this);
    }

    @Override
    public void ch_() {
        super.ch_();
        this.a.a(new y(this.bu(), net.minecraft.x.d.b.cg.a));
    }

    @Override
    public void ci_() {
        super.ci_();
        this.a.a(new y(this.bu(), net.minecraft.x.d.b.cg.b));
    }

    @Override
    protected net.minecraft.u.j M() {
        return new l(this);
    }

    @Override
    public void cE_() {
        this.c.d();
        --this.ch;
        if (this.bB > 0) {
            --this.bB;
        }
        this.s.a();
        if (!this.aQ.C && !this.s.a(this)) {
            this.r();
            this.s = this.r;
        }
        while (!this.k.isEmpty()) {
            int n2 = Math.min(this.k.size(), Integer.MAX_VALUE);
            int[] arrn = new int[n2];
            Iterator iterator = this.k.iterator();
            int n3 = 0;
            while (iterator.hasNext() && n3 < n2) {
                arrn[n3++] = (Integer)iterator.next();
                iterator.remove();
            }
            this.a.a(new bt(arrn));
        }
        n n4 = this.L();
        if (n4 != this) {
            if (n4.br()) {
                this.a(n4.aU, n4.aV, n4.aW, n4.ba, n4.bb);
                this.b.av().d(this);
                if (this.G()) {
                    this.g(this);
                }
            } else {
                this.g(this);
            }
        }
    }

    public void i() {
        if (this.c.a().toString() == "CREATIVE" || this.c.a().toString() == "SPECTATOR") {
            net.minecraft.l.k.b();
        }
        try {
            super.cE_();
            for (int i2 = 0; i2 < this.q.e(); ++i2) {
                net.minecraft.x.p p2;
                cu cu2 = this.q.a(i2);
                if (cu2 == null || !cu2.a().b() || (p2 = ((t)cu2.a()).a(cu2, this.aQ, this)) == null) continue;
                this.a.a(p2);
            }
            if (this.bo() != this.cd || this.ce != this.t.a() || this.t.c() == 0.0f != this.cf) {
                this.a.a(new cf(this.bo(), this.t.a(), this.t.c()));
                this.cd = this.bo();
                this.ce = this.t.a();
                boolean bl2 = this.cf = this.t.c() == 0.0f;
            }
            if (this.bo() + this.aB() != this.m) {
                this.m = this.bo() + this.aB();
                this.a(net.minecraft.j.f.g, net.minecraft.u.b.n.f(this.m));
            }
            if (this.t.a() != this.n) {
                this.n = this.t.a();
                this.a(net.minecraft.j.f.h, net.minecraft.u.b.n.f((float)this.n));
            }
            if (this.cE() != this.bZ) {
                this.bZ = this.cE();
                this.a(net.minecraft.j.f.i, net.minecraft.u.b.n.f((float)this.bZ));
            }
            if (this.bt() != this.ca) {
                this.ca = this.bt();
                this.a(net.minecraft.j.f.j, net.minecraft.u.b.n.f((float)this.ca));
            }
            if (this.L != this.cc) {
                this.cc = this.L;
                this.a(net.minecraft.j.f.k, net.minecraft.u.b.n.f((float)this.cc));
            }
            if (this.K != this.cb) {
                this.cb = this.K;
                this.a(net.minecraft.j.f.l, net.minecraft.u.b.n.f((float)this.cb));
            }
            if (this.L != this.cg) {
                this.cg = this.L;
                this.a.a(new net.minecraft.x.d.b.k(this.M, this.L, this.K));
            }
            if (this.by % 20 * 5 == 0 && !this.I().a(net.minecraft.r.j.L)) {
                this.j();
            }
        }
        catch (Throwable throwable) {
            net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Ticking player");
            net.minecraft.k.i i3 = a2.a("Player being ticked");
            this.a(i3);
            throw new bo(a2);
        }
    }

    private void a(net.minecraft.j.f f2, int n2) {
        for (net.minecraft.j.j j2 : this.az().a(f2)) {
            net.minecraft.j.p p2 = this.az().c(this.X(), j2);
            p2.c(n2);
        }
    }

    protected void j() {
        net.minecraft.q.b.q q2 = this.aQ.a(new net.minecraft.u.b.b(net.minecraft.u.b.n.c(this.aU), 0, net.minecraft.u.b.n.c(this.aW)));
        String string = q2.l();
        bb bb2 = (bb)this.I().b((net.minecraft.r.k)net.minecraft.r.j.L);
        if (bb2 == null) {
            bb2 = (bb)this.I().a(net.minecraft.r.j.L, new bb());
        }
        bb2.add(string);
        if (this.I().b(net.minecraft.r.j.L) && bb2.size() >= net.minecraft.q.b.q.l.size()) {
            HashSet hashSet = aad.b((Iterable)net.minecraft.q.b.q.l);
            for (String string2 : bb2) {
                Iterator iterator = hashSet.iterator();
                while (iterator.hasNext()) {
                    net.minecraft.q.b.q q3 = (net.minecraft.q.b.q)iterator.next();
                    if (!q3.l().equals(string2)) continue;
                    iterator.remove();
                }
                if (hashSet.isEmpty()) break;
            }
            if (hashSet.isEmpty()) {
                this.a((net.minecraft.r.k)net.minecraft.r.j.L);
            }
        }
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        Object object2;
        boolean bl2 = this.aQ.G().b("showDeathMessages");
        this.a.a(new y(this.bu(), net.minecraft.x.d.b.cg.c, bl2));
        if (bl2) {
            object2 = this.aA();
            if (object2 != null && ((net.minecraft.j.i)object2).i() != net.minecraft.j.n.a) {
                if (((net.minecraft.j.i)object2).i() == net.minecraft.j.n.c) {
                    this.b.av().a((b)this, this.bu().b());
                } else if (((net.minecraft.j.i)object2).i() == net.minecraft.j.n.d) {
                    this.b.av().b((b)this, this.bu().b());
                }
            } else {
                this.b.av().a(this.bu().b());
            }
        }
        if (!this.aQ.G().b("keepInventory") && !this.a()) {
            this.q.k();
        }
        for (Object object2 : this.aQ.Q().a(net.minecraft.j.f.d)) {
            net.minecraft.j.p p2 = this.az().c(this.X(), (net.minecraft.j.j)object2);
            p2.a();
        }
        object2 = this.bv();
        if (object2 != null) {
            q q2 = (q)net.minecraft.w.h.a.get(net.minecraft.w.h.b((n)object2));
            if (q2 != null) {
                this.a(q2.e);
            }
            ((n)object2).a((n)this, this.ay);
        }
        this.a(net.minecraft.r.o.A);
        this.b(net.minecraft.r.o.h);
        this.bu().e();
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        boolean bl2;
        if (this.b(n2)) {
            return false;
        }
        boolean bl3 = bl2 = this.b.ak() && this.di() && "fall".equals(n2.s);
        if (!bl2 && this.ch > 0 && n2 != net.minecraft.u.n.l) {
            return false;
        }
        if (n2 instanceof net.minecraft.u.p) {
            n n3 = n2.j();
            if (n3 instanceof b && !this.a((b)n3)) {
                return false;
            }
            if (n3 instanceof f) {
                f f3 = (f)n3;
                if (f3.e instanceof b && !this.a((b)f3.e)) {
                    return false;
                }
            }
        }
        return super.a(n2, f2);
    }

    @Override
    public boolean a(b b2) {
        return !this.di() ? false : super.a(b2);
    }

    private boolean di() {
        return this.b.ap();
    }

    @Override
    public n h_(int n2) {
        this.cm = true;
        if (this.bS == 1 && n2 == 1) {
            this.aQ.b(this);
            if (!this.h) {
                this.h = true;
                if (this.a(net.minecraft.r.j.D)) {
                    this.a.a(new ce(4, 0.0f));
                } else {
                    this.a((net.minecraft.r.k)net.minecraft.r.j.D);
                    this.a.a(new ce(4, 1.0f));
                }
            }
            return this;
        }
        if (this.bS == 0 && n2 == 1) {
            this.a((net.minecraft.r.k)net.minecraft.r.j.C);
            n2 = 1;
        } else {
            this.a((net.minecraft.r.k)net.minecraft.r.j.y);
        }
        this.b.av().a(this, n2);
        this.a.a(new br(1032, net.minecraft.u.b.b.c, 0, false));
        this.cg = -1;
        this.cd = -1.0f;
        this.ce = -1;
        return this;
    }

    @Override
    public boolean a(g g2) {
        return g2.a() ? this.L() == this : (this.a() ? false : super.a(g2));
    }

    private void a(ap ap2) {
        net.minecraft.x.d.b.j j2;
        if (ap2 != null && (j2 = ap2.bJ_()) != null) {
            this.a.a(j2);
        }
    }

    @Override
    public void b(n n2, int n3) {
        super.b(n2, n3);
        this.s.a();
    }

    @Override
    public net.minecraft.w.a.h a(net.minecraft.u.b.b b2) {
        net.minecraft.w.a.h h2 = super.a(b2);
        if (h2 == net.minecraft.w.a.h.a) {
            this.a(net.minecraft.r.o.ad);
            p p2 = new p(this, b2);
            this.y().ae().a((n)this, p2);
            this.a.a(this.aU, this.aV, this.aW, this.ba, this.bb);
            this.a.a(p2);
        }
        return h2;
    }

    @Override
    public void a(boolean bl2, boolean bl3, boolean bl4) {
        if (this.ae()) {
            this.y().ae().b(this, new net.minecraft.x.d.b.aj(this, 2));
        }
        super.a(bl2, bl3, bl4);
        if (this.a != null) {
            this.a.a(this.aU, this.aV, this.aW, this.ba, this.bb);
        }
    }

    @Override
    public boolean a(n n2, boolean bl2) {
        n n3 = this.df();
        if (!super.a(n2, bl2)) {
            return false;
        }
        n n4 = this.df();
        if (n4 != n3 && this.a != null) {
            this.a.a(this.aU, this.aV, this.aW, this.ba, this.bb);
        }
        return true;
    }

    @Override
    public void o() {
        n n2 = this.df();
        super.o();
        n n3 = this.df();
        if (n3 != n2 && this.a != null) {
            this.a.a(this.aU, this.aV, this.aW, this.ba, this.bb);
        }
    }

    @Override
    public boolean b(net.minecraft.u.n n2) {
        return super.b(n2) || this.aU();
    }

    @Override
    protected void a(double d2, boolean bl2, net.minecraft.g.c.b b2, net.minecraft.u.b.b b3) {
    }

    @Override
    protected void b(net.minecraft.u.b.b b2) {
        if (!this.a()) {
            super.b(b2);
        }
    }

    public void a(double d2, boolean bl2) {
        net.minecraft.u.b.b b2;
        net.minecraft.g.c.b b3;
        cn cn2;
        int n2;
        int n3;
        int n4 = net.minecraft.u.b.n.c(this.aU);
        net.minecraft.u.b.b b4 = new net.minecraft.u.b.b(n4, n3 = net.minecraft.u.b.n.c(this.aV - (double)0.2f), n2 = net.minecraft.u.b.n.c(this.aW));
        net.minecraft.g.c.b b5 = this.aQ.n(b4);
        if (b5.d() == net.minecraft.g.a.h.a && ((cn2 = (b3 = this.aQ.n(b2 = b4.c())).c()) instanceof fm || cn2 instanceof ey || cn2 instanceof ct)) {
            b4 = b2;
            b5 = b3;
        }
        super.a(d2, bl2, b5, b4);
    }

    @Override
    public void a(net.minecraft.f.ad ad2) {
        ad2.a(this);
        this.a.a(new ac(ad2.D()));
    }

    private void dj() {
        this.cn = this.cn % 100 + 1;
    }

    @Override
    public void a(net.minecraft.q.d d2) {
        if (d2 instanceof net.minecraft.q.a.a.g && ((net.minecraft.q.a.a.g)((Object)d2)).b() != null && this.a()) {
            this.a(new net.minecraft.u.d.l("container.spectatorCantOpen", new Object[0]).a(new c().a(net.minecraft.u.d.o.m)));
        } else {
            this.dj();
            this.a.a(new net.minecraft.x.d.b.al(this.cn, d2.h(), d2.aK()));
            this.s = d2.a(this.q, this);
            this.s.f = this.cn;
            this.s.a(this);
        }
    }

    @Override
    public void a(net.minecraft.h.y y2) {
        if (y2 instanceof net.minecraft.q.a.a.g && ((net.minecraft.q.a.a.g)((Object)y2)).b() != null && this.a()) {
            this.a(new net.minecraft.u.d.l("container.spectatorCantOpen", new Object[0]).a(new c().a(net.minecraft.u.d.o.m)));
        } else {
            al al2;
            if (this.s != this.r) {
                this.r();
            }
            if (y2 instanceof al && (al2 = (al)y2).q() && !this.a(al2.r()) && !this.a()) {
                this.a.a(new net.minecraft.x.d.b.b(new net.minecraft.u.d.l("container.isLocked", y2.aK()), 2));
                this.a.a(new e(net.minecraft.a.f.W, net.minecraft.u.bu.e, this.aU, this.aV, this.aW, 1.0f, 1.0f));
                return;
            }
            this.dj();
            if (y2 instanceof net.minecraft.q.d) {
                this.a.a(new net.minecraft.x.d.b.al(this.cn, ((net.minecraft.q.d)((Object)y2)).h(), y2.aK(), y2.e()));
                this.s = ((net.minecraft.q.d)((Object)y2)).a(this.q, this);
            } else {
                this.a.a(new net.minecraft.x.d.b.al(this.cn, "minecraft:container", y2.aK(), y2.e()));
                this.s = new w(this.q, y2, this);
            }
            this.s.f = this.cn;
            this.s.a(this);
        }
    }

    @Override
    public void a(aj aj2) {
        this.dj();
        this.s = new ag(this.q, aj2, this.aQ);
        this.s.f = this.cn;
        this.s.a(this);
        ad ad2 = ((ag)this.s).b();
        net.minecraft.u.d.a a2 = aj2.aK();
        this.a.a(new net.minecraft.x.d.b.al(this.cn, "minecraft:villager", a2, ad2.e()));
        net.minecraft.b.d d2 = aj2.b(this);
        if (d2 != null) {
            a a3 = new a(io.netty.b.bi.a());
            a3.E(this.cn);
            d2.a(a3);
            this.a.a(new as("MC|TrList", a3));
        }
    }

    @Override
    public void a(net.minecraft.w.h.al al2, net.minecraft.h.y y2) {
        if (this.s != this.r) {
            this.r();
        }
        this.dj();
        this.a.a(new net.minecraft.x.d.b.al(this.cn, "EntityHorse", y2.aK(), y2.e(), al2.ca()));
        this.s = new net.minecraft.h.n(this.q, y2, al2, this);
        this.s.f = this.cn;
        this.s.a(this);
    }

    @Override
    public void a(cu cu2, ah ah2) {
        net.minecraft.m.cg cg2 = cu2.a();
        if (cg2 == net.minecraft.a.w.bX) {
            a a2 = new a(io.netty.b.bi.a());
            a2.a(ah2);
            this.a.a(new as("MC|BOpen", a2));
        }
    }

    @Override
    public void a(net.minecraft.f.h h2) {
        h2.d(true);
        this.a((ap)h2);
    }

    @Override
    public void a(aq aq2, int n2, cu cu2) {
        if (!(aq2.b(n2) instanceof x) && !this.f) {
            this.a.a(new net.minecraft.x.d.b.bb(aq2.f, n2, cu2));
        }
    }

    public void a(aq aq2) {
        this.a(aq2, aq2.c());
    }

    @Override
    public void a(aq aq2, List list) {
        this.a.a(new cb(aq2.f, list));
        this.a.a(new net.minecraft.x.d.b.bb(-1, -1, this.q.l()));
    }

    @Override
    public void a(aq aq2, int n2, int n3) {
        this.a.a(new an(aq2.f, n2, n3));
    }

    @Override
    public void a(aq aq2, net.minecraft.h.y y2) {
        for (int i2 = 0; i2 < y2.i(); ++i2) {
            this.a.a(new an(aq2.f, i2, y2.c(i2)));
        }
    }

    @Override
    public void r() {
        this.a.a(new ax(this.s.f));
        this.s();
    }

    public void p() {
        if (!this.f) {
            this.a.a(new net.minecraft.x.d.b.bb(-1, -1, this.q.l()));
        }
    }

    public void s() {
        this.s.b(this);
        this.s = this.r;
    }

    public void a(float f2, float f3, boolean bl2, boolean bl3) {
        if (this.cz()) {
            if (f2 >= -1.0f && f2 <= 1.0f) {
                this.aB = f2;
            }
            if (f3 >= -1.0f && f3 <= 1.0f) {
                this.aC = f3;
            }
            this.aA = bl2;
            this.m(bl3);
        }
    }

    @Override
    public boolean a(net.minecraft.r.d d2) {
        return this.l.a(d2);
    }

    @Override
    public void a(net.minecraft.r.k k2, int n2) {
        if (k2 != null) {
            this.l.b(this, k2, n2);
            for (net.minecraft.j.j j2 : this.az().a(k2.k())) {
                this.az().c(this.X(), j2).a(n2);
            }
            if (this.l.e()) {
                this.l.a(this);
            }
        }
    }

    @Override
    public void b(net.minecraft.r.k k2) {
        if (k2 != null) {
            this.l.a(this, k2, 0);
            for (net.minecraft.j.j j2 : this.az().a(k2.k())) {
                this.az().c(this.X(), j2).c(0);
            }
            if (this.l.e()) {
                this.l.a(this);
            }
        }
    }

    public void v() {
        this.ct();
        if (this.E) {
            this.a(true, false, false);
        }
    }

    public void w() {
        this.cd = -1.0E8f;
    }

    @Override
    public void b(net.minecraft.u.d.a a2) {
        this.a.a(new net.minecraft.x.d.b.b(a2));
    }

    @Override
    protected void co_() {
        if (this.aK != null && this.B()) {
            this.a.a(new aw(this, 9));
            super.co_();
        }
    }

    @Override
    public void a(b b2, boolean bl2) {
        super.a(b2, bl2);
        this.cg = -1;
        this.cd = -1.0f;
        this.ce = -1;
        this.k.addAll(((g)b2).k);
    }

    @Override
    protected void a(j j2) {
        super.a(j2);
        this.a.a(new bw(this.ca(), j2));
    }

    @Override
    protected void a(j j2, boolean bl2) {
        super.a(j2, bl2);
        this.a.a(new bw(this.ca(), j2));
    }

    @Override
    protected void b(j j2) {
        super.b(j2);
        this.a.a(new bs(this.ca(), j2.a()));
    }

    @Override
    public void d(double d2, double d3, double d4) {
        this.a.a(d2, d3, d4, this.ba, this.bb);
    }

    @Override
    public void a(n n2) {
        this.y().ae().b(this, new net.minecraft.x.d.b.aj(n2, 4));
    }

    @Override
    public void b(n n2) {
        this.y().ae().b(this, new net.minecraft.x.d.b.aj(n2, 5));
    }

    @Override
    public void t() {
        if (this.a != null) {
            this.a.a(new ci(this.J));
            this.cn_();
        }
    }

    public v y() {
        return (v)this.aQ;
    }

    @Override
    public void a(am am2) {
        this.c.a(am2);
        this.a.a(new ce(3, am2.a()));
        if (am2 == net.minecraft.q.am.e) {
            this.o();
        } else {
            this.g(this);
        }
        this.t();
        this.bP();
    }

    @Override
    public boolean a() {
        return this.c.a() == net.minecraft.q.am.e;
    }

    @Override
    public boolean c() {
        return this.c.a() == net.minecraft.q.am.c;
    }

    @Override
    public void a(net.minecraft.u.d.a a2) {
        this.a.a(new net.minecraft.x.d.b.b(a2));
    }

    @Override
    public boolean a(int n2, String string) {
        if ("seed".equals(string) && !this.b.ak()) {
            return true;
        }
        if (!("tell".equals(string) || "help".equals(string) || "me".equals(string) || "trigger".equals(string))) {
            if (this.b.av().e(this.ac())) {
                net.minecraft.c.b.g g2 = (net.minecraft.c.b.g)this.b.av().m().a((Object)this.ac());
                return g2 != null ? g2.a() >= n2 : this.b.B() >= n2;
            }
            return false;
        }
        return true;
    }

    public String z() {
        String string = this.a.a.b().toString();
        string = string.substring(string.indexOf("/") + 1);
        string = string.substring(0, string.indexOf(":"));
        return string;
    }

    public void a(net.minecraft.x.d.a.ad ad2) {
        this.j = ad2.a();
        this.ci = ad2.b();
        this.cj = ad2.c();
        this.cc().b(o, (byte)ad2.d());
        this.cc().b(p, (byte)(ad2.e() != net.minecraft.u.ai.a ? 1 : 0));
    }

    public i E() {
        return this.ci;
    }

    public void a(String string, String string2) {
        this.a.a(new z(string, string2));
    }

    @Override
    public net.minecraft.u.b.b aC() {
        return new net.minecraft.u.b.b(this.aU, this.aV + 0.5, this.aW);
    }

    public void F() {
        this.ck = net.minecraft.c.a.aI();
    }

    public net.minecraft.r.b I() {
        return this.l;
    }

    public void e(n n2) {
        if (n2 instanceof b) {
            this.a.a(new bt(n2.ca()));
        } else {
            this.k.add(n2.ca());
        }
    }

    public void f(n n2) {
        this.k.remove((Object)n2.ca());
    }

    @Override
    protected void cn_() {
        if (this.a()) {
            this.bk();
            this.o(true);
        } else {
            super.cn_();
        }
        this.y().ae().a(this);
    }

    public n L() {
        return this.cl == null ? this : this.cl;
    }

    public void g(n n2) {
        n n3 = this.L();
        n n4 = this.cl = n2 == null ? this : n2;
        if (n3 != this.cl) {
            this.a.a(new bi(this.cl));
            this.d(this.cl.aU, this.cl.aV, this.cl.aW);
        }
    }

    @Override
    protected void aP() {
        if (this.bP > 0 && !this.cm) {
            --this.bP;
        }
    }

    @Override
    public void c(n n2) {
        if (this.c.a() == net.minecraft.q.am.e) {
            this.g(n2);
        } else {
            super.c(n2);
        }
    }

    public long aQ() {
        return this.ck;
    }

    public net.minecraft.u.d.a aT() {
        return null;
    }

    @Override
    public void a(ah ah2) {
        super.a(ah2);
        this.aJ();
    }

    public boolean aU() {
        return this.cm;
    }

    public void aV() {
        this.cm = false;
    }

    public void aW() {
        this.a(7, true);
    }

    public void aX() {
        this.a(7, true);
        this.a(7, false);
    }
}

