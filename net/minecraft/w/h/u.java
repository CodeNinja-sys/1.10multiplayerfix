/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.q.z;
import net.minecraft.u.a.a;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ac;
import net.minecraft.w.ah;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.as;
import net.minecraft.w.b.av;
import net.minecraft.w.b.ay;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bf;
import net.minecraft.w.b.bg;
import net.minecraft.w.b.bi;
import net.minecraft.w.b.e;
import net.minecraft.w.b.g;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.h.ai;
import net.minecraft.w.h.y;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class u
extends ai {
    private static final net.minecraft.x.a.g e = net.minecraft.x.a.o.a(u.class, net.minecraft.x.a.q.b);
    private bi f;
    private e g;

    public u(k k2) {
        super(k2);
        this.d(0.6f, 0.7f);
    }

    @Override
    protected void cA_() {
        this.d = new ay(this);
        this.g = new e((t)this, 0.6, net.minecraft.a.w.bb, true);
        this.o.a(1, new av(this));
        this.o.a(2, this.d);
        this.o.a(3, this.g);
        this.o.a(5, new g(this, 1.0, 10.0f, 5.0f));
        this.o.a(6, new net.minecraft.w.b.z(this, 0.8));
        this.o.a(7, new bg(this, 0.3f));
        this.o.a(8, new as(this));
        this.o.a(9, new net.minecraft.w.b.k(this, 0.8));
        this.o.a(10, new az(this, 0.8));
        this.o.a(11, new ap(this, b.class, 10.0f));
        this.p.a(1, new bf(this, net.minecraft.w.h.ah.class, false, null));
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(e, 0);
    }

    @Override
    public void e() {
        if (this.L().a()) {
            double d2 = this.L().b();
            if (d2 == 0.6) {
                this.m(true);
                this.b(false);
            } else if (d2 == 1.33) {
                this.m(false);
                this.b(true);
            } else {
                this.m(false);
                this.b(false);
            }
        } else {
            this.m(false);
            this.b(false);
        }
    }

    @Override
    protected boolean i() {
        return !this.z() && this.by > 2400;
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(10.0);
        this.a(net.minecraft.w.d.d).a(0.3f);
    }

    @Override
    public void c(float f2, float f3) {
    }

    public static void a(a a2) {
        net.minecraft.w.f.a(a2, "Ozelot");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("CatType", this.p());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.b(e2.h("CatType"));
    }

    @Override
    protected bv j() {
        return this.z() ? (this.w() ? net.minecraft.a.f.T : (this.bx.nextInt(4) == 0 ? net.minecraft.a.f.U : net.minecraft.a.f.P)) : null;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.S;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.Q;
    }

    @Override
    protected float bE() {
        return 0.4f;
    }

    @Override
    public boolean j(n n2) {
        return n2.a(net.minecraft.u.n.a(this), 3.0f);
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (this.d != null) {
            this.d.a(false);
        }
        return super.a(n2, f2);
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.L;
    }

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (this.z()) {
            if (this.d((l)b2) && !this.aQ.C && !this.a(cu2)) {
                this.d.a(!this.E());
            }
        } else if ((this.g == null || this.g.f()) && cu2 != null && cu2.a() == net.minecraft.a.w.bb && b2.n(this) < 9.0) {
            if (!b2.J.d) {
                --cu2.b;
            }
            if (!this.aQ.C) {
                if (this.bx.nextInt(3) == 0) {
                    this.a(true);
                    this.b(1 + this.aQ.p.nextInt(3));
                    this.b(b2.cM());
                    this.e(true);
                    this.d.a(true);
                    this.aQ.a((n)this, (byte)7);
                } else {
                    this.e(false);
                    this.aQ.a((n)this, (byte)6);
                }
            }
            return true;
        }
        return super.a(b2, ah2, cu2);
    }

    public u a(ah ah2) {
        u u2 = new u(this.aQ);
        if (this.z()) {
            u2.b(this.b());
            u2.a(true);
            u2.b(this.p());
        }
        return u2;
    }

    @Override
    public boolean a(cu cu2) {
        return cu2 != null && cu2.a() == net.minecraft.a.w.bb;
    }

    @Override
    public boolean a(y y2) {
        if (y2 == this) {
            return false;
        }
        if (!this.z()) {
            return false;
        }
        if (!(y2 instanceof u)) {
            return false;
        }
        u u2 = (u)y2;
        return !u2.z() ? false : this.w() && u2.w();
    }

    public int p() {
        return (Integer)this.bE.a(e);
    }

    public void b(int n2) {
        this.bE.b(e, n2);
    }

    @Override
    public boolean aq() {
        return this.aQ.p.nextInt(3) != 0;
    }

    @Override
    public boolean ar() {
        if (this.aQ.a(this.cT(), (n)this) && this.aQ.a((n)this, this.cT()).isEmpty() && !this.aQ.e(this.cT())) {
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.aU, this.cT().b, this.aW);
            if (b2.k() < this.aQ.x()) {
                return false;
            }
            net.minecraft.g.c.b b3 = this.aQ.n(b2.c());
            cn cn2 = b3.c();
            if (cn2 == net.minecraft.a.p.c || b3.d() == h.j) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String X() {
        return this.bO_() ? this.cP() : (this.z() ? net.minecraft.u.d.b.a.a("entity.Cat.name") : super.X());
    }

    @Override
    public void a(boolean bl2) {
        super.a(bl2);
    }

    @Override
    protected void cF_() {
        if (this.f == null) {
            this.f = new bi(this, b.class, 16.0f, 0.8, 1.33);
        }
        this.o.a(this.f);
        if (!this.z()) {
            this.o.a(4, this.f);
        }
    }

    @Override
    public ac a(z z2, ac ac2) {
        ac2 = super.a(z2, ac2);
        if (this.p() == 0 && this.aQ.p.nextInt(7) == 0) {
            for (int i2 = 0; i2 < 2; ++i2) {
                u u2 = new u(this.aQ);
                u2.b(this.aU, this.aV, this.aW, this.ba, 0.0f);
                u2.e(-24000);
                this.aQ.a(u2);
            }
        }
        return ac2;
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.a(ah2);
    }
}

