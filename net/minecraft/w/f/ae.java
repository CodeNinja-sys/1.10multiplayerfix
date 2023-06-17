/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.b.cg;
import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.g.a.h;
import net.minecraft.m.cu;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.u.a.a;
import net.minecraft.u.bu;
import net.minecraft.w.a.b;
import net.minecraft.w.n;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ae
extends n {
    private static final d b = org.apache.logging.log4j.c.c();
    private static final g c = o.a(ae.class, q.f);
    private int d;
    private int e;
    private int f = 5;
    private String g;
    private String h;
    public float a = (float)(Math.random() * Math.PI * 2.0);

    public ae(net.minecraft.q.k k2, double d2, double d3, double d4) {
        super(k2);
        this.d(0.25f, 0.25f);
        this.e(d2, d3, d4);
        this.ba = (float)(Math.random() * 360.0);
        this.aX = (float)(Math.random() * (double)0.2f - (double)0.1f);
        this.aY = 0.2f;
        this.aZ = (float)(Math.random() * (double)0.2f - (double)0.1f);
    }

    public ae(net.minecraft.q.k k2, double d2, double d3, double d4, cu cu2) {
        this(k2, d2, d3, d4);
        this.a(cu2);
    }

    @Override
    protected boolean au() {
        return false;
    }

    public ae(net.minecraft.q.k k2) {
        super(k2);
        this.d(0.25f, 0.25f);
        this.a(new cu(p.a, 0));
    }

    @Override
    protected void cb_() {
        this.cc().a(c, cg.f());
    }

    @Override
    public void cE_() {
        if (this.c() == null) {
            this.aa();
        } else {
            boolean bl2;
            super.cE_();
            if (this.e > 0 && this.e != 32767) {
                --this.e;
            }
            this.aR = this.aU;
            this.aS = this.aV;
            this.aT = this.aW;
            if (!this.ci()) {
                this.aY -= (double)0.04f;
            }
            this.bv = this.a(this.aU, (this.cT().b + this.cT().e) / 2.0, this.aW);
            this.b(this.aX, this.aY, this.aZ);
            boolean bl3 = bl2 = (int)this.aR != (int)this.aU || (int)this.aS != (int)this.aV || (int)this.aT != (int)this.aW;
            if (bl2 || this.by % 25 == 0) {
                if (this.aQ.n(new net.minecraft.u.b.b(this)).d() == net.minecraft.g.a.h.i) {
                    this.aY = 0.2f;
                    this.aX = (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f;
                    this.aZ = (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f;
                    this.a(net.minecraft.a.f.bB, 0.4f, 2.0f + this.bx.nextFloat() * 0.4f);
                }
                if (!this.aQ.C) {
                    this.t();
                }
            }
            float f2 = 0.98f;
            if (this.be) {
                f2 = this.aQ.n((net.minecraft.u.b.b)new net.minecraft.u.b.b((int)net.minecraft.u.b.n.c((double)this.aU), (int)(net.minecraft.u.b.n.c((double)this.cT().b) - 1), (int)net.minecraft.u.b.n.c((double)this.aW))).c().N * 0.98f;
            }
            this.aX *= (double)f2;
            this.aY *= (double)0.98f;
            this.aZ *= (double)f2;
            if (this.be) {
                this.aY *= -0.5;
            }
            if (this.d != -32768) {
                ++this.d;
            }
            this.cn();
            if (!this.aQ.C && this.d >= 6000) {
                this.aa();
            }
        }
    }

    private void t() {
        for (ae ae2 : this.aQ.a(ae.class, this.cT().b(0.5, 0.0, 0.5))) {
            this.a(ae2);
        }
    }

    private boolean a(ae ae2) {
        if (ae2 == this) {
            return false;
        }
        if (ae2.br() && this.br()) {
            cu cu2 = this.c();
            cu cu3 = ae2.c();
            if (this.e != 32767 && ae2.e != 32767) {
                if (this.d != -32768 && ae2.d != -32768) {
                    if (cu3.a() != cu2.a()) {
                        return false;
                    }
                    if (cu3.n() ^ cu2.n()) {
                        return false;
                    }
                    if (cu3.n() && !cu3.o().equals(cu2.o())) {
                        return false;
                    }
                    if (cu3.a() == null) {
                        return false;
                    }
                    if (cu3.a().j() && cu3.h() != cu2.h()) {
                        return false;
                    }
                    if (cu3.b < cu2.b) {
                        return ae2.a(this);
                    }
                    if (cu3.b + cu2.b > cu3.b()) {
                        return false;
                    }
                    cu3.b += cu2.b;
                    ae2.e = Math.max(ae2.e, this.e);
                    ae2.d = Math.min(ae2.d, this.d);
                    ae2.a(cu3);
                    this.aa();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void a() {
        this.d = 4800;
    }

    @Override
    public boolean cn() {
        if (this.aQ.a(this.cT(), net.minecraft.g.a.h.h, (n)this)) {
            if (!this.bA && !this.bC) {
                this.al();
            }
            this.bA = true;
        } else {
            this.bA = false;
        }
        return this.bA;
    }

    @Override
    protected void l(int n2) {
        this.a(net.minecraft.u.n.a, (float)n2);
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (this.c() != null && this.c().a() == w.cj && n2.c()) {
            return false;
        }
        this.bN();
        this.f = (int)((float)this.f - f2);
        if (this.f <= 0) {
            this.aa();
        }
        return false;
    }

    public static void a(a a2) {
        a2.a(net.minecraft.u.a.c.e, (net.minecraft.u.a.e)new net.minecraft.u.a.b.d("Item", new String[]{"Item"}));
    }

    @Override
    public void a(e e2) {
        e2.a("Health", (short)this.f);
        e2.a("Age", (short)this.d);
        e2.a("PickupDelay", (short)this.e);
        if (this.g() != null) {
            e2.a("Thrower", this.g);
        }
        if (this.f() != null) {
            e2.a("Owner", this.h);
        }
        if (this.c() != null) {
            e2.a("Item", this.c().b(new e()));
        }
    }

    @Override
    public void b(e e2) {
        this.f = e2.g("Health");
        this.d = e2.g("Age");
        if (e2.e("PickupDelay")) {
            this.e = e2.g("PickupDelay");
        }
        if (e2.e("Owner")) {
            this.h = e2.l("Owner");
        }
        if (e2.e("Thrower")) {
            this.g = e2.l("Thrower");
        }
        e e3 = e2.o("Item");
        this.a(cu.a(e3));
        if (this.c() == null) {
            this.aa();
        }
    }

    @Override
    public void d(b b2) {
        if (!this.aQ.C) {
            cu cu2 = this.c();
            int n2 = cu2.b;
            if (this.e == 0 && (this.h == null || 6000 - this.d <= 200 || this.h.equals(b2.X())) && b2.q.c(cu2)) {
                b b3;
                if (cu2.a() == net.minecraft.m.cg.a(p.r)) {
                    b2.a((k)j.g);
                }
                if (cu2.a() == net.minecraft.m.cg.a(p.s)) {
                    b2.a((k)j.g);
                }
                if (cu2.a() == w.aM) {
                    b2.a((k)j.t);
                }
                if (cu2.a() == w.k) {
                    b2.a((k)j.w);
                }
                if (cu2.a() == w.bC) {
                    b2.a((k)j.A);
                }
                if (cu2.a() == w.k && this.g() != null && (b3 = this.aQ.a(this.g())) != null && b3 != b2) {
                    b3.a((k)j.x);
                }
                if (!this.ch()) {
                    this.aQ.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.da, net.minecraft.u.bu.h, 0.2f, ((this.bx.nextFloat() - this.bx.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                }
                b2.b(this, n2);
                if (cu2.b <= 0) {
                    this.aa();
                }
                b2.a(net.minecraft.r.o.d(cu2.a()), n2);
            }
        }
    }

    @Override
    public String X() {
        return this.bO_() ? this.cP() : net.minecraft.u.d.b.a.a("item." + this.c().k());
    }

    @Override
    public boolean cG() {
        return false;
    }

    @Override
    public n h_(int n2) {
        n n3 = super.h_(n2);
        if (!this.aQ.C && n3 instanceof ae) {
            ((ae)n3).t();
        }
        return n3;
    }

    public cu c() {
        cu cu2 = (cu)((cg)this.cc().a(c)).d();
        if (cu2 == null) {
            if (this.aQ != null) {
                b.b("Item entity {} has no item?!", this.ca());
            }
            return new cu(p.b);
        }
        return cu2;
    }

    public void a(cu cu2) {
        this.cc().b(c, cg.c(cu2));
        this.cc().b(c);
    }

    public String f() {
        return this.h;
    }

    public void a(String string) {
        this.h = string;
    }

    public String g() {
        return this.g;
    }

    public void b(String string) {
        this.g = string;
    }

    public int i() {
        return this.d;
    }

    public void l() {
        this.e = 10;
    }

    public void n() {
        this.e = 0;
    }

    public void p() {
        this.e = 32767;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public boolean q() {
        return this.e > 0;
    }

    public void r() {
        this.d = -6000;
    }

    public void s() {
        this.p();
        this.d = 5999;
    }
}

