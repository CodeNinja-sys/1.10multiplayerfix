/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.a.w;
import net.minecraft.g.cn;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.q.a.a.j;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.a.b;
import net.minecraft.w.ah;
import net.minecraft.w.b.ap;
import net.minecraft.w.b.av;
import net.minecraft.w.b.az;
import net.minecraft.w.b.bc;
import net.minecraft.w.b.bh;
import net.minecraft.w.b.e;
import net.minecraft.w.d;
import net.minecraft.w.e.ao;
import net.minecraft.w.f;
import net.minecraft.w.g.a;
import net.minecraft.w.h.y;
import net.minecraft.w.n;
import net.minecraft.w.t;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class l
extends y {
    private static final g b = net.minecraft.x.a.o.a(l.class, net.minecraft.x.a.q.h);
    private static final Set c = aad.a(net.minecraft.a.w.cb, net.minecraft.a.w.cc, net.minecraft.a.w.cV);
    private boolean d;
    private int e;
    private int f;

    public l(net.minecraft.q.k k2) {
        super(k2);
        this.d(0.9f, 0.9f);
    }

    @Override
    protected void cA_() {
        this.o.a(0, new av(this));
        this.o.a(1, new net.minecraft.w.b.ah(this, 1.25));
        this.o.a(3, new net.minecraft.w.b.k(this, 1.0));
        this.o.a(4, new e((t)this, 1.2, net.minecraft.a.w.ci, false));
        this.o.a(4, new e((t)this, 1.2, false, c));
        this.o.a(5, new bc(this, 1.1));
        this.o.a(6, new az(this, 1.0));
        this.o.a(7, new ap(this, b.class, 6.0f));
        this.o.a(8, new bh(this));
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(net.minecraft.w.d.a).a(10.0);
        this.a(net.minecraft.w.d.d).a(0.25);
    }

    @Override
    public n da() {
        return this.db().isEmpty() ? null : (n)this.db().get(0);
    }

    @Override
    public boolean aI() {
        n n2 = this.da();
        if (!(n2 instanceof b)) {
            return false;
        }
        b b2 = (b)n2;
        cu cu2 = b2.bC();
        if (cu2 != null && cu2.a() == net.minecraft.a.w.ci) {
            return true;
        }
        cu2 = b2.bD();
        return cu2 != null && cu2.a() == net.minecraft.a.w.ci;
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(b, false);
    }

    public static void a(net.minecraft.u.a.a a2) {
        net.minecraft.w.f.a(a2, "Pig");
    }

    @Override
    public void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("Saddle", this.p());
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a(e2.p("Saddle"));
    }

    @Override
    protected bv j() {
        return net.minecraft.a.f.dV;
    }

    @Override
    protected bv cc_() {
        return net.minecraft.a.f.dX;
    }

    @Override
    protected bv cd_() {
        return net.minecraft.a.f.dW;
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, cn cn2) {
        this.a(net.minecraft.a.f.dZ, 0.15f, 1.0f);
    }

    @Override
    public boolean a(b b2, net.minecraft.u.ah ah2, cu cu2) {
        if (!super.a(b2, ah2, cu2)) {
            if (this.p() && !this.aQ.C && !this.cA()) {
                b2.r(this);
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    protected void b(boolean bl2, int n2) {
        super.b(bl2, n2);
        if (this.p()) {
            this.a(net.minecraft.a.w.aC, 1);
        }
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.D;
    }

    public boolean p() {
        return (Boolean)this.bE.a(b);
    }

    public void a(boolean bl2) {
        if (bl2) {
            this.bE.b(b, true);
        } else {
            this.bE.b(b, false);
        }
    }

    @Override
    public void a(a a2) {
        if (!this.aQ.C && !this.bk) {
            ao ao2 = new ao(this.aQ);
            ao2.a(net.minecraft.h.k.a, new cu(net.minecraft.a.w.D));
            ao2.b(this.aU, this.aV, this.aW, this.ba, this.bb);
            ao2.g(this.aT());
            if (this.bO_()) {
                ao2.g(this.cP());
                ao2.q(this.cQ());
            }
            this.aQ.a(ao2);
            this.aa();
        }
    }

    @Override
    public void c(float f2, float f3) {
        super.c(f2, f3);
        if (f2 > 5.0f) {
            for (b b2 : this.b(b.class)) {
                b2.a((net.minecraft.r.k)net.minecraft.r.j.u);
            }
        }
    }

    @Override
    public void b(float f2, float f3) {
        n n2;
        n n3 = n2 = this.db().isEmpty() ? null : (n)this.db().get(0);
        if (this.cA() && this.aI()) {
            this.bc = this.ba = n2.ba;
            this.bb = n2.bb * 0.5f;
            this.e(this.ba, this.bb);
            this.ak = this.ba;
            this.am = this.ba;
            this.bu = 1.0f;
            this.ao = this.ak() * 0.1f;
            if (this.de()) {
                float f4 = (float)this.a(net.minecraft.w.d.d).f() * 0.225f;
                if (this.d) {
                    if (this.e++ > this.f) {
                        this.d = false;
                    }
                    f4 += f4 * 1.15f * net.minecraft.u.b.n.a((float)this.e / (float)this.f * (float)Math.PI);
                }
                this.e_(f4);
                super.b(0.0f, 1.0f);
            } else {
                this.aX = 0.0;
                this.aY = 0.0;
                this.aZ = 0.0;
            }
            this.ac = this.ad;
            double d2 = this.aU - this.aR;
            double d3 = this.aW - this.aT;
            float f5 = net.minecraft.u.b.n.a(d2 * d2 + d3 * d3) * 4.0f;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            this.ad += (f5 - this.ad) * 0.4f;
            this.ae += this.ad;
        } else {
            this.bu = 0.5f;
            this.ao = 0.02f;
            super.b(f2, f3);
        }
    }

    public boolean q() {
        if (this.d) {
            return false;
        }
        this.d = true;
        this.e = 0;
        this.f = this.bd().nextInt(841) + 140;
        return true;
    }

    public l a(ah ah2) {
        return new l(this.aQ);
    }

    @Override
    public boolean a(cu cu2) {
        return cu2 != null && c.contains(cu2.a());
    }

    @Override
    public /* synthetic */ ah b(ah ah2) {
        return this.a(ah2);
    }
}

