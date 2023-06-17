/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.c.b;
import net.minecraft.g.e;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.u.b.n;
import net.minecraft.w.f.f;
import net.minecraft.w.f.m;
import net.minecraft.x.a.g;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

public class u
extends f {
    private static final g c = o.a(u.class, q.h);
    private int d;
    public double a;
    public double b;

    public u(k k2) {
        super(k2);
    }

    public u(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        f.a(a2, "MinecartFurnace");
    }

    @Override
    public m a() {
        return m.c;
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(c, false);
    }

    @Override
    public void cE_() {
        super.cE_();
        if (this.d > 0) {
            --this.d;
        }
        if (this.d <= 0) {
            this.a = 0.0;
            this.b = 0.0;
        }
        this.c(this.d > 0);
        if (this.g() && this.bx.nextInt(4) == 0) {
            this.aQ.a(aj.m, this.aU, this.aV + 0.8, this.aW, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected double l() {
        return 0.2;
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        super.a(n2);
        if (!n2.c() && this.aQ.G().b("doEntityDrops")) {
            this.a(new cu(p.al, 1), 0.0f);
        }
    }

    @Override
    protected void a(net.minecraft.u.b.b b2, b b3) {
        super.a(b2, b3);
        double d2 = this.a * this.a + this.b * this.b;
        if (d2 > 1.0E-4 && this.aX * this.aX + this.aZ * this.aZ > 0.001) {
            d2 = n.a(d2);
            this.a /= d2;
            this.b /= d2;
            if (this.a * this.aX + this.b * this.aZ < 0.0) {
                this.a = 0.0;
                this.b = 0.0;
            } else {
                double d3 = d2 / this.l();
                this.a *= d3;
                this.b *= d3;
            }
        }
    }

    @Override
    protected void s() {
        double d2 = this.a * this.a + this.b * this.b;
        if (d2 > 1.0E-4) {
            d2 = n.a(d2);
            this.a /= d2;
            this.b /= d2;
            double d3 = 1.0;
            this.aX *= (double)0.8f;
            this.aY *= 0.0;
            this.aZ *= (double)0.8f;
            this.aX += this.a * 1.0;
            this.aZ += this.b * 1.0;
        } else {
            this.aX *= (double)0.98f;
            this.aY *= 0.0;
            this.aZ *= (double)0.98f;
        }
        super.s();
    }

    @Override
    public boolean a(net.minecraft.w.a.b b2, cu cu2, ah ah2) {
        if (cu2 != null && cu2.a() == w.j && this.d + 3600 <= 32000) {
            if (!b2.J.d) {
                --cu2.b;
            }
            this.d += 3600;
        }
        this.a = this.aU - b2.aU;
        this.b = this.aW - b2.aW;
        return true;
    }

    @Override
    protected void a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("PushX", this.a);
        e2.a("PushZ", this.b);
        e2.a("Fuel", (short)this.d);
    }

    @Override
    protected void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a = e2.k("PushX");
        this.b = e2.k("PushZ");
        this.d = e2.g("Fuel");
    }

    protected boolean g() {
        return (Boolean)this.bE.a(c);
    }

    protected void c(boolean bl2) {
        this.bE.b(c, bl2);
    }

    @Override
    public b c() {
        return (this.g() ? p.am : p.al).v().a(e.a, (Comparable)((Object)ad.c));
    }
}

