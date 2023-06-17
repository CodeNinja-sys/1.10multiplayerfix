/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.b.q;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.ah;
import net.minecraft.u.b.g;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.u.r;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.ae;
import net.minecraft.w.b.a.c;
import net.minecraft.w.b.a.h;
import net.minecraft.w.b.a.i;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.ba;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.p;
import net.minecraft.w.b.y;
import net.minecraft.w.e.af;
import net.minecraft.w.e.ao;
import net.minecraft.w.e.bi;
import net.minecraft.w.e.bj;
import net.minecraft.w.e.k;
import net.minecraft.w.f;
import net.minecraft.w.f.ab;
import net.minecraft.w.h.ak;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.o;

public class d
extends k {
    protected static final net.minecraft.w.b.a.f a = new c(null, "zombie.spawnReinforcements", 0.0, 0.0, 1.0).a("Spawn Reinforcements Chance");
    private static final UUID b = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
    private static final h c = new h(b, "Baby speed boost", 0.5, 1);
    private static final net.minecraft.x.a.g d = net.minecraft.x.a.o.a(d.class, net.minecraft.x.a.q.h);
    private static final net.minecraft.x.a.g e = net.minecraft.x.a.o.a(d.class, net.minecraft.x.a.q.b);
    private static final net.minecraft.x.a.g f = net.minecraft.x.a.o.a(d.class, net.minecraft.x.a.q.h);
    private static final net.minecraft.x.a.g g = net.minecraft.x.a.o.a(d.class, net.minecraft.x.a.q.h);
    private final net.minecraft.w.b.ac h = new net.minecraft.w.b.ac(this);
    private int i;
    private boolean u;
    private float v = -1.0f;
    private float w;

    public d(net.minecraft.q.k k2) {
        super(k2);
        this.d(0.6f, 1.95f);
    }

    @Override
    protected void cA_() {
        this.o.a(0, new av(this));
        this.o.a(2, new net.minecraft.w.b.d(this, 1.0, false));
        this.o.a(5, new net.minecraft.w.b.n(this, 1.0));
        this.o.a(7, new az(this, 1.0));
        this.o.a(8, new ap(this, b.class, 8.0f));
        this.o.a(8, new bh(this));
        this.c();
    }

    protected void c() {
        this.o.a(6, new p(this, 1.0, false));
        this.p.a(1, new ba((t)this, true, ao.class));
        this.p.a(2, new y((t)this, b.class, true));
        this.p.a(3, new y((t)this, ak.class, false));
        this.p.a(3, new y((t)this, bj.class, true));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.b).a(35.0);
        this.a(net.minecraft.w.d.d).a(0.23f);
        this.a(net.minecraft.w.d.e).a(3.0);
        this.a(net.minecraft.w.d.g).a(2.0);
        this.bA().b(a).a(this.bx.nextDouble() * (double)0.1f);
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.cc().a(d, false);
        this.cc().a(e, 0);
        this.cc().a(f, false);
        this.cc().a(g, false);
    }

    public void a(boolean bl2) {
        this.cc().b(g, bl2);
    }

    public boolean p() {
        return (Boolean)this.cc().a(g);
    }

    public boolean q() {
        return this.u;
    }

    public void c(boolean bl2) {
        if (this.u != bl2) {
            this.u = bl2;
            ((net.minecraft.i.a)this.N()).a(bl2);
            if (bl2) {
                this.o.a(1, this.h);
            } else {
                this.o.a(this.h);
            }
        }
    }

    @Override
    public boolean ba() {
        return (Boolean)this.cc().a(d);
    }

    @Override
    protected int b_(b b2) {
        if (this.ba()) {
            this.k = (int)((float)this.k * 2.5f);
        }
        return super.b_(b2);
    }

    public void d(boolean bl2) {
        this.cc().b(d, bl2);
        if (this.aQ != null && !this.aQ.C) {
            i i2 = this.a(net.minecraft.w.d.d);
            i2.c(c);
            if (bl2) {
                i2.b(c);
            }
        }
        this.e(bl2);
    }

    public af r() {
        return net.minecraft.w.e.af.a((Integer)this.cc().a(e));
    }

    public boolean s() {
        return this.r().b();
    }

    public int t() {
        return this.r().c();
    }

    public void a(af af2) {
        this.cc().b(e, af2.a());
    }

    @Override
    public void a(net.minecraft.x.a.g g2) {
        if (d.equals(g2)) {
            this.e(this.ba());
        }
        super.a(g2);
    }

    @Override
    public void n() {
        if (this.aQ.n() && !this.aQ.C && !this.ba() && this.r().e()) {
            net.minecraft.u.b.b b2;
            float f2 = this.n(1.0f);
            net.minecraft.u.b.b b3 = b2 = this.df() instanceof ab ? new net.minecraft.u.b.b(this.aU, Math.round(this.aV), this.aW).b() : new net.minecraft.u.b.b(this.aU, Math.round(this.aV), this.aW);
            if (f2 > 0.5f && this.bx.nextFloat() * 30.0f < (f2 - 0.4f) * 2.0f && this.aQ.g(b2)) {
                boolean bl2 = true;
                cu cu2 = this.a(net.minecraft.h.k.f);
                if (cu2 != null) {
                    if (cu2.d()) {
                        cu2.b(cu2.g() + this.bx.nextInt(2));
                        if (cu2.g() >= cu2.i()) {
                            this.e(cu2);
                            this.a(net.minecraft.h.k.f, null);
                        }
                    }
                    bl2 = false;
                }
                if (bl2) {
                    this.k(8);
                }
            }
        }
        super.n();
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (super.a(n2, f2)) {
            l l2 = this.W();
            if (l2 == null && n2.j() instanceof l) {
                l2 = (l)n2.j();
            }
            if (l2 != null && this.aQ.R() == net.minecraft.q.l.d && (double)this.bx.nextFloat() < this.a(a).f() && this.aQ.G().b("doMobSpawning")) {
                int n3 = net.minecraft.u.b.n.c(this.aU);
                int n4 = net.minecraft.u.b.n.c(this.aV);
                int n5 = net.minecraft.u.b.n.c(this.aW);
                d d2 = new d(this.aQ);
                for (int i2 = 0; i2 < 50; ++i2) {
                    int n6;
                    int n7;
                    int n8 = n3 + net.minecraft.u.b.n.a(this.bx, 7, 40) * net.minecraft.u.b.n.a(this.bx, -1, 1);
                    if (!this.aQ.n(new net.minecraft.u.b.b(n8, (n7 = n4 + net.minecraft.u.b.n.a(this.bx, 7, 40) * net.minecraft.u.b.n.a(this.bx, -1, 1)) - 1, n6 = n5 + net.minecraft.u.b.n.a(this.bx, 7, 40) * net.minecraft.u.b.n.a(this.bx, -1, 1))).t() || this.aQ.j(new net.minecraft.u.b.b(n8, n7, n6)) >= 10) continue;
                    d2.e(n8, n7, n6);
                    if (this.aQ.a((double)n8, (double)n7, (double)n6, 7.0) || !this.aQ.a(d2.cT(), (n)d2) || !this.aQ.a((n)d2, d2.cT()).isEmpty() || this.aQ.e(d2.cT())) continue;
                    this.aQ.a(d2);
                    d2.c(l2);
                    d2.a(this.aQ.C(new net.minecraft.u.b.b(d2)), null);
                    this.a(a).b(new h("Zombie reinforcement caller charge", -0.05f, 0));
                    d2.a(a).b(new h("Zombie reinforcement callee charge", -0.05f, 0));
                    break;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void cE_() {
        if (!this.aQ.C && this.v()) {
            int n2 = this.y();
            this.i -= n2;
            if (this.i <= 0) {
                this.w();
            }
        }
        super.cE_();
    }

    @Override
    public boolean j(n n2) {
        boolean bl2 = super.j(n2);
        if (bl2) {
            float f2 = this.aQ.C(new net.minecraft.u.b.b(this)).a();
            if (this.bC() == null) {
                if (this.cy() && this.bx.nextFloat() < f2 * 0.3f) {
                    n2.k(2 * (int)f2);
                }
                if (this.r() == net.minecraft.w.e.af.g && n2 instanceof l) {
                    ((l)n2).c(new net.minecraft.d.j(net.minecraft.a.c.q, 140 * (int)f2));
                }
            }
        }
        return bl2;
    }

    @Override
    protected bv j() {
        return this.r().f();
    }

    @Override
    protected bv cc_() {
        return this.r().g();
    }

    @Override
    protected bv cd_() {
        return this.r().h();
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        bv bv2 = this.r().i();
        this.a(bv2, 0.15f, 1.0f);
    }

    @Override
    public ae bB() {
        return net.minecraft.w.ae.b;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.aj;
    }

    @Override
    protected void a(z z2) {
        super.a(z2);
        float f2 = this.bx.nextFloat();
        float f3 = this.aQ.R() == net.minecraft.q.l.d ? 0.05f : 0.01f;
        if (f2 < f3) {
            int n2 = this.bx.nextInt(3);
            if (n2 == 0) {
                this.a(net.minecraft.h.k.a, new cu(net.minecraft.a.w.n));
            } else {
                this.a(net.minecraft.h.k.a, new cu(net.minecraft.a.w.a));
            }
        }
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Zombie");
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        if (this.ba()) {
            e2.a("IsBaby", true);
        }
        e2.a("ZombieType", this.r().a());
        e2.a("ConversionTime", this.v() ? this.i : -1);
        e2.a("CanBreakDoors", this.q());
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        if (e2.p("IsBaby")) {
            this.d(true);
        }
        if (e2.p("IsVillager")) {
            if (e2.b("VillagerProfession", 99)) {
                this.a(net.minecraft.w.e.af.a(e2.h("VillagerProfession") + 1));
            } else {
                this.a(net.minecraft.w.e.af.a(this.aQ.p.nextInt(5) + 1));
            }
        }
        if (e2.e("ZombieType")) {
            this.a(net.minecraft.w.e.af.a(e2.h("ZombieType")));
        }
        if (e2.b("ConversionTime", 99) && e2.h("ConversionTime") > -1) {
            this.b(e2.h("ConversionTime"));
        }
        this.c(e2.p("CanBreakDoors"));
    }

    @Override
    public void b(l l2) {
        super.b(l2);
        if ((this.aQ.R() == net.minecraft.q.l.c || this.aQ.R() == net.minecraft.q.l.d) && l2 instanceof ak) {
            if (this.aQ.R() != net.minecraft.q.l.d && this.bx.nextBoolean()) {
                return;
            }
            ak ak2 = (ak)l2;
            d d2 = new d(this.aQ);
            d2.y(l2);
            this.aQ.b(l2);
            d2.a(this.aQ.C(new net.minecraft.u.b.b(d2)), new net.minecraft.w.e.t(this, false, true, null));
            d2.a(net.minecraft.w.e.af.a(ak2.p() + 1));
            d2.d(l2.ba());
            d2.g(ak2.aT());
            if (ak2.bO_()) {
                d2.g(ak2.cP());
                d2.q(ak2.cQ());
            }
            this.aQ.a(d2);
            this.aQ.a(null, 1026, new net.minecraft.u.b.b((int)this.aU, (int)this.aV, (int)this.aW), 0);
        }
    }

    @Override
    public float ce_() {
        float f2 = 1.74f;
        if (this.ba()) {
            f2 = (float)((double)f2 - 0.81);
        }
        return f2;
    }

    @Override
    protected boolean b(cu cu2) {
        return cu2.a() == net.minecraft.a.w.aW && this.ba() && this.cz() ? false : super.b(cu2);
    }

    @Override
    public ac a(z z2, ac ac2) {
        Object object;
        ac2 = super.a(z2, ac2);
        float f2 = z2.c();
        this.f(this.bx.nextFloat() < 0.55f * f2);
        if (ac2 == null) {
            ac2 = new net.minecraft.w.e.t(this, this.aQ.p.nextFloat() < 0.05f, this.aQ.p.nextFloat() < 0.05f, null);
        }
        if (ac2 instanceof net.minecraft.w.e.t) {
            object = (net.minecraft.w.e.t)ac2;
            boolean bl2 = false;
            q q2 = this.aQ.a(new net.minecraft.u.b.b(this));
            if (q2 instanceof net.minecraft.q.b.j && this.aQ.g(new net.minecraft.u.b.b(this)) && this.bx.nextInt(5) != 0) {
                this.a(net.minecraft.w.e.af.g);
                bl2 = true;
            }
            if (!bl2 && ((net.minecraft.w.e.t)object).b) {
                this.a(net.minecraft.w.e.af.a(this.bx.nextInt(5) + 1));
            }
            if (((net.minecraft.w.e.t)object).a) {
                this.d(true);
                if ((double)this.aQ.p.nextFloat() < 0.05) {
                    List list = this.aQ.a(net.minecraft.w.h.ah.class, this.cT().b(5.0, 3.0, 5.0), net.minecraft.u.r.b);
                    if (!list.isEmpty()) {
                        net.minecraft.w.h.ah ah2 = (net.minecraft.w.h.ah)list.get(0);
                        ah2.a(true);
                        this.r(ah2);
                    }
                } else if ((double)this.aQ.p.nextFloat() < 0.05) {
                    net.minecraft.w.h.ah ah3 = new net.minecraft.w.h.ah(this.aQ);
                    ah3.b(this.aU, this.aV, this.aW, this.ba, 0.0f);
                    ah3.a(z2, null);
                    ah3.a(true);
                    this.aQ.a(ah3);
                    this.r(ah3);
                }
            }
        }
        this.c(this.bx.nextFloat() < f2 * 0.1f);
        this.a(z2);
        this.b(z2);
        if (this.a(net.minecraft.h.k.f) == null && ((Calendar)(object = this.aQ.P())).get(2) + 1 == 10 && ((Calendar)object).get(5) == 31 && this.bx.nextFloat() < 0.25f) {
            this.a(net.minecraft.h.k.f, new cu(this.bx.nextFloat() < 0.1f ? net.minecraft.a.p.aZ : net.minecraft.a.p.aU));
            this.r[net.minecraft.h.k.f.b()] = 0.0f;
        }
        this.a(net.minecraft.w.d.c).b(new h("Random spawn bonus", this.bx.nextDouble() * (double)0.05f, 0));
        double d2 = this.bx.nextDouble() * 1.5 * (double)f2;
        if (d2 > 1.0) {
            this.a(net.minecraft.w.d.b).b(new h("Random zombie-spawn bonus", d2, 2));
        }
        if (this.bx.nextFloat() < f2 * 0.05f) {
            this.a(a).b(new h("Leader zombie bonus", this.bx.nextDouble() * 0.25 + 0.5, 0));
            this.a(net.minecraft.w.d.a).b(new h("Leader zombie bonus", this.bx.nextDouble() * 3.0 + 1.0, 2));
            this.c(true);
        }
        return ac2;
    }

    @Override
    public boolean a(b b2, ah ah2, cu cu2) {
        if (cu2 != null && cu2.a() == net.minecraft.a.w.aq && cu2.h() == 0 && this.s() && this.b(net.minecraft.a.c.r)) {
            if (!b2.J.d) {
                --cu2.b;
            }
            if (!this.aQ.C) {
                this.b(this.bx.nextInt(2401) + 3600);
            }
            return true;
        }
        return false;
    }

    protected void b(int n2) {
        this.i = n2;
        this.cc().b(f, true);
        this.d(net.minecraft.a.c.r);
        this.c(new net.minecraft.d.j(net.minecraft.a.c.e, n2, Math.min(this.aQ.R().a() - 1, 0)));
        this.aQ.a((n)this, (byte)16);
    }

    @Override
    public void a(byte by2) {
        if (by2 == 16) {
            if (!this.ch()) {
                this.aQ.a(this.aU + 0.5, this.aV + 0.5, this.aW + 0.5, net.minecraft.a.f.hR, this.S(), 1.0f + this.bx.nextFloat(), this.bx.nextFloat() * 0.7f + 0.3f, false);
            }
        } else {
            super.a(by2);
        }
    }

    @Override
    protected boolean i() {
        return !this.v();
    }

    public boolean v() {
        return (Boolean)this.cc().a(f);
    }

    protected void w() {
        ak ak2 = new ak(this.aQ);
        ak2.y(this);
        ak2.a(this.aQ.C(new net.minecraft.u.b.b(ak2)), null);
        ak2.v();
        if (this.ba()) {
            ak2.e(-24000);
        }
        this.aQ.b(this);
        ak2.g(this.aT());
        ak2.b(this.t());
        if (this.bO_()) {
            ak2.g(this.cP());
            ak2.q(this.cQ());
        }
        this.aQ.a(ak2);
        ak2.c(new net.minecraft.d.j(net.minecraft.a.c.i, 200, 0));
        this.aQ.a(null, 1027, new net.minecraft.u.b.b((int)this.aU, (int)this.aV, (int)this.aW), 0);
    }

    protected int y() {
        int n2 = 1;
        if (this.bx.nextFloat() < 0.01f) {
            int n3 = 0;
            g g2 = new g();
            for (int i2 = (int)this.aU - 4; i2 < (int)this.aU + 4 && n3 < 14; ++i2) {
                for (int i3 = (int)this.aV - 4; i3 < (int)this.aV + 4 && n3 < 14; ++i3) {
                    for (int i4 = (int)this.aW - 4; i4 < (int)this.aW + 4 && n3 < 14; ++i4) {
                        cn cn2 = this.aQ.n(g2.b(i2, i3, i4)).c();
                        if (cn2 != net.minecraft.a.p.bi && cn2 != net.minecraft.a.p.C) continue;
                        if (this.bx.nextFloat() < 0.3f) {
                            ++n2;
                        }
                        ++n3;
                    }
                }
            }
        }
        return n2;
    }

    public void e(boolean bl2) {
        this.q(bl2 ? 0.5f : 1.0f);
    }

    @Override
    protected final void d(float f2, float f3) {
        boolean bl2 = this.v > 0.0f && this.w > 0.0f;
        this.v = f2;
        this.w = f3;
        if (!bl2) {
            this.q(1.0f);
        }
    }

    protected final void q(float f2) {
        super.d(this.v * f2, this.w * f2);
    }

    @Override
    public double Y() {
        return this.ba() ? 0.0 : -0.35;
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        super.a(n2);
        if (n2.j() instanceof bi && !(this instanceof ao) && ((bi)n2.j()).c() && ((bi)n2.j()).s()) {
            ((bi)n2.j()).t();
            this.a(new cu(net.minecraft.a.w.ch, 1, 2), 0.0f);
        }
    }

    @Override
    public String X() {
        return this.bO_() ? this.cP() : this.r().d().c();
    }
}

