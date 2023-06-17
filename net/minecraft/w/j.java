/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import com.a.a.b.cm;
import net.minecraft.e.e;
import net.minecraft.g.gh;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.g;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.w.a.b;
import net.minecraft.w.ai;
import net.minecraft.w.f.ae;
import net.minecraft.w.g.a;
import net.minecraft.w.n;
import org.apache.commons.c.ao;

public abstract class j
extends n {
    private static final cm c = new ai();
    private int d;
    protected net.minecraft.u.b.b a;
    public ad b;

    public j(k k2) {
        super(k2);
        this.d(0.5f, 0.5f);
    }

    public j(k k2, net.minecraft.u.b.b b2) {
        this(k2);
        this.a = b2;
    }

    @Override
    protected void cb_() {
    }

    protected void a(ad ad2) {
        ao.a(ad2);
        ao.a(ad2.l().d());
        this.b = ad2;
        this.bc = this.ba = (float)(this.b.c() * 90);
        this.a();
    }

    protected void a() {
        if (this.b != null) {
            double d2 = (double)this.a.cy_() + 0.5;
            double d3 = (double)this.a.k() + 0.5;
            double d4 = (double)this.a.l() + 0.5;
            double d5 = 0.46875;
            double d6 = this.b(this.f());
            double d7 = this.b(this.g());
            d2 -= (double)this.b.h() * 0.46875;
            d4 -= (double)this.b.j() * 0.46875;
            ad ad2 = this.b.g();
            this.aU = d2 += d6 * (double)ad2.h();
            this.aV = d3 += d7;
            this.aW = d4 += d6 * (double)ad2.j();
            double d8 = this.f();
            double d9 = this.g();
            double d10 = this.f();
            if (this.b.l() == net.minecraft.u.ae.c) {
                d10 = 1.0;
            } else {
                d8 = 1.0;
            }
            this.a(new net.minecraft.u.b.a(d2 - (d8 /= 32.0), d3 - (d9 /= 32.0), d4 - (d10 /= 32.0), d2 + d8, d3 + d9, d4 + d10));
        }
    }

    private double b(int n2) {
        return n2 % 32 == 0 ? 0.5 : 0.0;
    }

    @Override
    public void cE_() {
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        if (this.d++ == 100 && !this.aQ.C) {
            this.d = 0;
            if (!this.bk && !this.c()) {
                this.aa();
                this.b((n)null);
            }
        }
    }

    public boolean c() {
        if (!this.aQ.a((n)this, this.cT()).isEmpty()) {
            return false;
        }
        int n2 = Math.max(1, this.f() / 16);
        int n3 = Math.max(1, this.g() / 16);
        net.minecraft.u.b.b b2 = this.a.a(this.b.e());
        ad ad2 = this.b.g();
        g g2 = new g();
        for (int i2 = 0; i2 < n2; ++i2) {
            for (int i3 = 0; i3 < n3; ++i3) {
                int n4 = (n2 - 1) / -2;
                int n5 = (n3 - 1) / -2;
                g2.e(b2).b(ad2, i2 + n4).b(ad.b, i3 + n5);
                net.minecraft.g.c.b b3 = this.aQ.n(g2);
                if (b3.d().a() || gh.B(b3)) continue;
                return false;
            }
        }
        return this.aQ.a((n)this, this.cT(), c).isEmpty();
    }

    @Override
    public boolean cg_() {
        return true;
    }

    @Override
    public boolean a_(n n2) {
        return n2 instanceof b ? this.a(net.minecraft.u.n.a((b)n2), 0.0f) : false;
    }

    @Override
    public ad cl_() {
        return this.b;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        if (!this.bk && !this.aQ.C) {
            this.aa();
            this.bN();
            this.b(n2.j());
        }
        return true;
    }

    @Override
    public void b(double d2, double d3, double d4) {
        if (!this.aQ.C && !this.bk && d2 * d2 + d3 * d3 + d4 * d4 > 0.0) {
            this.aa();
            this.b((n)null);
        }
    }

    @Override
    public void a_(double d2, double d3, double d4) {
        if (!this.aQ.C && !this.bk && d2 * d2 + d3 * d3 + d4 * d4 > 0.0) {
            this.aa();
            this.b((n)null);
        }
    }

    @Override
    public void a(e e2) {
        e2.a("Facing", (byte)this.b.c());
        net.minecraft.u.b.b b2 = this.l();
        e2.a("TileX", b2.cy_());
        e2.a("TileY", b2.k());
        e2.a("TileZ", b2.l());
    }

    @Override
    public void b(e e2) {
        this.a = new net.minecraft.u.b.b(e2.h("TileX"), e2.h("TileY"), e2.h("TileZ"));
        this.a(ad.b(e2.f("Facing")));
    }

    public abstract int f();

    public abstract int g();

    public abstract void b(n var1);

    public abstract void i();

    @Override
    public ae a(cu cu2, float f2) {
        ae ae2 = new ae(this.aQ, this.aU + (double)((float)this.b.h() * 0.15f), this.aV + (double)f2, this.aW + (double)((float)this.b.j() * 0.15f), cu2);
        ae2.l();
        this.aQ.a(ae2);
        return ae2;
    }

    @Override
    protected boolean cj_() {
        return false;
    }

    @Override
    public void e(double d2, double d3, double d4) {
        this.a = new net.minecraft.u.b.b(d2, d3, d4);
        this.a();
        this.bO = true;
    }

    public net.minecraft.u.b.b l() {
        return this.a;
    }

    @Override
    public float a(bq bq2) {
        if (this.b != null && this.b.l() != net.minecraft.u.ae.b) {
            switch (bq2) {
                case c: {
                    this.b = this.b.e();
                    break;
                }
                case d: {
                    this.b = this.b.g();
                    break;
                }
                case b: {
                    this.b = this.b.f();
                }
            }
        }
        float f2 = net.minecraft.u.b.n.g(this.ba);
        switch (bq2) {
            case c: {
                return f2 + 180.0f;
            }
            case d: {
                return f2 + 90.0f;
            }
            case b: {
                return f2 + 270.0f;
            }
        }
        return f2;
    }

    @Override
    public float a(bi bi2) {
        return this.a(bi2.a(this.b));
    }

    @Override
    public void a(a a2) {
    }
}

