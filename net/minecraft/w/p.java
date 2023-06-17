/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w;

import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.g.fm;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.b.a;
import net.minecraft.w.a.b;
import net.minecraft.w.f;
import net.minecraft.w.j;
import net.minecraft.w.n;

public class p
extends j {
    public p(k k2) {
        super(k2);
    }

    public p(k k2, net.minecraft.u.b.b b2) {
        super(k2, b2);
        this.e((double)b2.cy_() + 0.5, (double)b2.k() + 0.5, (double)b2.l() + 0.5);
        float f2 = 0.125f;
        float f3 = 0.1875f;
        float f4 = 0.25f;
        this.a(new a(this.aU - 0.1875, this.aV - 0.25 + 0.125, this.aW - 0.1875, this.aU + 0.1875, this.aV + 0.25 + 0.125, this.aW + 0.1875));
    }

    @Override
    public void e(double d2, double d3, double d4) {
        super.e((double)net.minecraft.u.b.n.c(d2) + 0.5, (double)net.minecraft.u.b.n.c(d3) + 0.5, (double)net.minecraft.u.b.n.c(d4) + 0.5);
    }

    @Override
    protected void a() {
        this.aU = (double)this.a.cy_() + 0.5;
        this.aV = (double)this.a.k() + 0.5;
        this.aW = (double)this.a.l() + 0.5;
    }

    @Override
    public void a(ad ad2) {
    }

    @Override
    public int f() {
        return 9;
    }

    @Override
    public int g() {
        return 9;
    }

    @Override
    public float ce_() {
        return -0.0625f;
    }

    @Override
    public boolean a(double d2) {
        return d2 < 1024.0;
    }

    @Override
    public void b(n n2) {
        this.a(net.minecraft.a.f.dj, 1.0f, 1.0f);
    }

    @Override
    public boolean d(e e2) {
        return false;
    }

    @Override
    public void a(e e2) {
    }

    @Override
    public void b(e e2) {
    }

    @Override
    public boolean a(b b2, cu cu2, ah ah2) {
        double d2;
        if (this.aQ.C) {
            return true;
        }
        boolean bl2 = false;
        if (cu2 != null && cu2.a() == w.cx) {
            d2 = 7.0;
            for (f f2 : this.aQ.a(f.class, new a(this.aU - 7.0, this.aV - 7.0, this.aW - 7.0, this.aU + 7.0, this.aV + 7.0, this.aW + 7.0))) {
                if (!f2.aO() || f2.aQ() != b2) continue;
                f2.b((n)this, true);
                bl2 = true;
            }
        }
        if (!bl2) {
            this.aa();
            if (b2.J.d) {
                d2 = 7.0;
                for (f f2 : this.aQ.a(f.class, new a(this.aU - 7.0, this.aV - 7.0, this.aW - 7.0, this.aU + 7.0, this.aV + 7.0, this.aW + 7.0))) {
                    if (!f2.aO() || f2.aQ() != this) continue;
                    f2.a(true, false);
                }
            }
        }
        return true;
    }

    @Override
    public boolean c() {
        return this.aQ.n(this.a).c() instanceof fm;
    }

    public static p a(k k2, net.minecraft.u.b.b b2) {
        p p2 = new p(k2, b2);
        p2.aP = true;
        k2.a(p2);
        p2.i();
        return p2;
    }

    public static p b(k k2, net.minecraft.u.b.b b2) {
        int n2 = b2.cy_();
        int n3 = b2.k();
        int n4 = b2.l();
        for (p p2 : k2.a(p.class, new a((double)n2 - 1.0, (double)n3 - 1.0, (double)n4 - 1.0, (double)n2 + 1.0, (double)n3 + 1.0, (double)n4 + 1.0))) {
            if (!p2.l().equals(b2)) continue;
            return p2;
        }
        return null;
    }

    @Override
    public void i() {
        this.a(net.minecraft.a.f.dk, 1.0f, 1.0f);
    }
}

