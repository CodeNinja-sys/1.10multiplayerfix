/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

import net.minecraft.e.e;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.b.b;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;
import net.minecraft.u.bp;
import net.minecraft.w.c.n;
import net.minecraft.w.l;

public abstract class q
extends net.minecraft.w.n {
    private int a = -1;
    private int f = -1;
    private int g = -1;
    private cn h;
    private boolean i;
    public l b;
    private int j;
    private int k;
    public double c;
    public double d;
    public double e;

    public q(k k2) {
        super(k2);
        this.d(1.0f, 1.0f);
    }

    @Override
    protected void cb_() {
    }

    @Override
    public boolean a(double d2) {
        double d3 = this.cT().a() * 4.0;
        if (Double.isNaN(d3)) {
            d3 = 4.0;
        }
        return d2 < (d3 *= 64.0) * d3;
    }

    public q(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2);
        this.d(1.0f, 1.0f);
        this.b(d2, d3, d4, this.ba, this.bb);
        this.e(d2, d3, d4);
        double d8 = net.minecraft.u.b.n.a(d5 * d5 + d6 * d6 + d7 * d7);
        this.c = d5 / d8 * 0.1;
        this.d = d6 / d8 * 0.1;
        this.e = d7 / d8 * 0.1;
    }

    public q(k k2, l l2, double d2, double d3, double d4) {
        super(k2);
        this.b = l2;
        this.d(1.0f, 1.0f);
        this.b(l2.aU, l2.aV, l2.aW, l2.ba, l2.bb);
        this.e(this.aU, this.aV, this.aW);
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        double d5 = net.minecraft.u.b.n.a((d2 += this.bx.nextGaussian() * 0.4) * d2 + (d3 += this.bx.nextGaussian() * 0.4) * d3 + (d4 += this.bx.nextGaussian() * 0.4) * d4);
        this.c = d2 / d5 * 0.1;
        this.d = d3 / d5 * 0.1;
        this.e = d4 / d5 * 0.1;
    }

    @Override
    public void cE_() {
        if (this.aQ.C || (this.b == null || !this.b.bk) && this.aQ.d(new b(this))) {
            super.cE_();
            if (this.f()) {
                this.k(1);
            }
            if (this.i) {
                if (this.aQ.n(new b(this.a, this.f, this.g)).c() == this.h) {
                    ++this.j;
                    if (this.j == 600) {
                        this.aa();
                    }
                    return;
                }
                this.i = false;
                this.aX *= (double)(this.bx.nextFloat() * 0.2f);
                this.aY *= (double)(this.bx.nextFloat() * 0.2f);
                this.aZ *= (double)(this.bx.nextFloat() * 0.2f);
                this.j = 0;
                this.k = 0;
            } else {
                ++this.k;
            }
            o o2 = n.a(this, true, this.k >= 25, this.b);
            if (o2 != null) {
                this.a(o2);
            }
            this.aU += this.aX;
            this.aV += this.aY;
            this.aW += this.aZ;
            n.a(this, 0.2f);
            float f2 = this.a();
            if (this.cm()) {
                for (int i2 = 0; i2 < 4; ++i2) {
                    float f3 = 0.25f;
                    this.aQ.a(aj.e, this.aU - this.aX * 0.25, this.aV - this.aY * 0.25, this.aW - this.aZ * 0.25, this.aX, this.aY, this.aZ, new int[0]);
                }
                f2 = 0.8f;
            }
            this.aX += this.c;
            this.aY += this.d;
            this.aZ += this.e;
            this.aX *= (double)f2;
            this.aY *= (double)f2;
            this.aZ *= (double)f2;
            this.aQ.a(this.cz_(), this.aU, this.aV + 0.5, this.aW, 0.0, 0.0, 0.0, new int[0]);
            this.e(this.aU, this.aV, this.aW);
        } else {
            this.aa();
        }
    }

    protected boolean f() {
        return true;
    }

    protected aj cz_() {
        return aj.l;
    }

    protected float a() {
        return 0.95f;
    }

    protected abstract void a(o var1);

    public static void a(a a2, String string) {
    }

    @Override
    public void a(e e2) {
        e2.a("xTile", this.a);
        e2.a("yTile", this.f);
        e2.a("zTile", this.g);
        bp bp2 = (bp)cn.v.b(this.h);
        e2.a("inTile", bp2 == null ? "" : bp2.toString());
        e2.a("inGround", (byte)(this.i ? 1 : 0));
        e2.a("direction", this.a(new double[]{this.aX, this.aY, this.aZ}));
        e2.a("power", this.a(new double[]{this.c, this.d, this.e}));
        e2.a("life", this.j);
    }

    @Override
    public void b(e e2) {
        net.minecraft.e.q q2;
        this.a = e2.h("xTile");
        this.f = e2.h("yTile");
        this.g = e2.h("zTile");
        this.h = e2.b("inTile", 8) ? cn.a(e2.l("inTile")) : cn.d(e2.f("inTile") & 0xFF);
        boolean bl2 = this.i = e2.f("inGround") == 1;
        if (e2.b("power", 9) && (q2 = e2.c("power", 6)).e() == 3) {
            this.c = q2.e(0);
            this.d = q2.e(1);
            this.e = q2.e(2);
        }
        this.j = e2.h("life");
        if (e2.b("direction", 9) && e2.c("direction", 6).e() == 3) {
            q2 = e2.c("direction", 6);
            this.aX = q2.e(0);
            this.aY = q2.e(1);
            this.aZ = q2.e(2);
        } else {
            this.aa();
        }
    }

    @Override
    public boolean cg_() {
        return true;
    }

    @Override
    public float cu() {
        return 1.0f;
    }

    @Override
    public boolean a(net.minecraft.u.n n2, float f2) {
        if (this.b(n2)) {
            return false;
        }
        this.bN();
        if (n2.j() != null) {
            s s2 = n2.j().bL();
            if (s2 != null) {
                this.aX = s2.b;
                this.aY = s2.c;
                this.aZ = s2.d;
                this.c = this.aX * 0.1;
                this.d = this.aY * 0.1;
                this.e = this.aZ * 0.1;
            }
            if (n2.j() instanceof l) {
                this.b = (l)n2.j();
            }
            return true;
        }
        return false;
    }

    @Override
    public float n(float f2) {
        return 1.0f;
    }

    @Override
    public int m(float f2) {
        return 0xF000F0;
    }
}

