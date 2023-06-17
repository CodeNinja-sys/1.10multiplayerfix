/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.g.a.b;
import net.minecraft.g.cn;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.af;
import net.minecraft.u.aw;
import net.minecraft.u.b.a;

public class m
extends ap
implements aw {
    private net.minecraft.g.c.b a;
    private ad b;
    private boolean c;
    private boolean d;
    private float e;
    private float f;

    public m() {
    }

    public m(net.minecraft.g.c.b b2, ad ad2, boolean bl2, boolean bl3) {
        this.a = b2;
        this.b = ad2;
        this.c = bl2;
        this.d = bl3;
    }

    public net.minecraft.g.c.b b() {
        return this.a;
    }

    @Override
    public int bL_() {
        return 0;
    }

    public boolean f() {
        return this.c;
    }

    public ad g() {
        return this.b;
    }

    public boolean h() {
        return this.d;
    }

    public float a(float f2) {
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        return this.f + (this.e - this.f) * f2;
    }

    public float b(float f2) {
        return (float)this.b.h() * this.e(this.a(f2));
    }

    public float c(float f2) {
        return (float)this.b.i() * this.e(this.a(f2));
    }

    public float d(float f2) {
        return (float)this.b.j() * this.e(this.a(f2));
    }

    private float e(float f2) {
        return this.c ? f2 - 1.0f : 1.0f - f2;
    }

    public a a(n n2, net.minecraft.u.b.b b2) {
        return this.a(n2, b2, this.e).a(this.a(n2, b2, this.f));
    }

    public a a(n n2, net.minecraft.u.b.b b2, float f2) {
        f2 = this.e(f2);
        return this.a.c(n2, b2).c((double)(f2 * (float)this.b.h()), f2 * (float)this.b.i(), f2 * (float)this.b.j());
    }

    private void k() {
        a a2 = this.a(this.k, this.l).a(this.l);
        List list = this.k.b(null, a2);
        if (!list.isEmpty()) {
            ad ad2 = this.c ? this.b : this.b.e();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                net.minecraft.w.n n2 = (net.minecraft.w.n)list.get(i2);
                if (n2.cm_() == net.minecraft.g.a.b.d) continue;
                if (this.a.c() == p.cE) {
                    switch (ad2.l()) {
                        case a: {
                            n2.aX = ad2.h();
                            break;
                        }
                        case b: {
                            n2.aY = ad2.i();
                            break;
                        }
                        case c: {
                            n2.aZ = ad2.j();
                        }
                    }
                }
                double d2 = 0.0;
                double d3 = 0.0;
                double d4 = 0.0;
                a a3 = n2.cT();
                switch (ad2.l()) {
                    case a: {
                        d2 = ad2.d() == af.a ? a2.d - a3.a : a3.d - a2.a;
                        d2 += 0.01;
                        break;
                    }
                    case b: {
                        d3 = ad2.d() == af.a ? a2.e - a3.b : a3.e - a2.b;
                        d3 += 0.01;
                        break;
                    }
                    case c: {
                        d4 = ad2.d() == af.a ? a2.f - a3.c : a3.f - a2.c;
                        d4 += 0.01;
                    }
                }
                n2.b(d2 * (double)ad2.h(), d3 * (double)ad2.i(), d4 * (double)ad2.j());
            }
        }
    }

    public void i() {
        if (this.f < 1.0f && this.k != null) {
            this.f = this.e = 1.0f;
            this.k.r(this.l);
            this.bP_();
            if (this.k.n(this.l).c() == p.M) {
                this.k.a(this.l, this.a, 3);
                this.k.c(this.l, this.a.c());
            }
        }
    }

    @Override
    public void a() {
        this.f = this.e;
        if (this.f >= 1.0f) {
            this.k();
            this.k.r(this.l);
            this.bP_();
            if (this.k.n(this.l).c() == p.M) {
                this.k.a(this.l, this.a, 3);
                this.k.c(this.l, this.a.c());
            }
        } else {
            this.e += 0.5f;
            if (this.e >= 1.0f) {
                this.e = 1.0f;
            }
            this.k();
        }
    }

    public static void a(net.minecraft.u.a.a a2) {
    }

    @Override
    public void b(e e2) {
        super.b(e2);
        this.a = cn.d(e2.h("blockId")).a(e2.h("blockData"));
        this.b = ad.a(e2.h("facing"));
        this.f = this.e = e2.j("progress");
        this.c = e2.p("extending");
    }

    @Override
    public e a(e e2) {
        super.a(e2);
        e2.a("blockId", cn.c(this.a.c()));
        e2.a("blockData", this.a.c().b(this.a));
        e2.a("facing", this.b.b());
        e2.a("progress", this.f);
        e2.a("extending", this.c);
        return e2;
    }
}

