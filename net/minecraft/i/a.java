/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.i.f;
import net.minecraft.i.g;
import net.minecraft.i.h;
import net.minecraft.i.i;
import net.minecraft.i.j;
import net.minecraft.i.l;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.s;

public class a
extends j {
    private boolean g;

    public a(net.minecraft.w.f f2, k k2) {
        super(f2, k2);
    }

    public a(net.minecraft.w.f f2, k k2, boolean bl2) {
        super(f2, k2, bl2);
    }

    @Override
    protected l a() {
        this.f = new f();
        this.f.a(true);
        return new l(this.f);
    }

    @Override
    protected boolean b() {
        return this.a.be || this.f() && this.n() || this.a.cz();
    }

    @Override
    protected s c() {
        return new s(this.a.aU, this.p(), this.a.aW);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public i a(net.minecraft.u.b.b var1_1) {
        block4: {
            if (this.b.n(var1_1).d() != net.minecraft.g.a.h.a) break block4;
            var2_2 = var1_1.c();
            while (var2_2.k() > 0 && this.b.n(var2_2).d() == net.minecraft.g.a.h.a) {
                var2_2 = var2_2.c();
            }
            if (var2_2.k() <= 0) ** GOTO lbl9
            return super.a(var2_2.b());
lbl-1000:
            // 1 sources

            {
                var2_2 = var2_2.b();
lbl9:
                // 2 sources

                ** while (var2_2.k() < this.b.L() && this.b.n((net.minecraft.u.b.b)var2_2).d() == net.minecraft.g.a.h.a)
            }
lbl10:
            // 1 sources

            var1_1 = var2_2;
        }
        if (!this.b.n(var1_1).d().a()) {
            return super.a(var1_1);
        }
        var2_2 = var1_1.b();
        ** GOTO lbl17
lbl-1000:
        // 1 sources

        {
            var2_2 = var2_2.b();
lbl17:
            // 2 sources

            if (var2_2.k() >= this.b.L()) return super.a(var2_2);
            ** while (this.b.n((net.minecraft.u.b.b)var2_2).d().a())
        }
lbl19:
        // 1 sources

        return super.a(var2_2);
    }

    @Override
    public i a(net.minecraft.w.n n2) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2);
        return this.a(b2);
    }

    private int p() {
        if (this.a.cm() && this.f()) {
            int n2 = (int)this.a.cT().b;
            cn cn2 = this.b.n(new net.minecraft.u.b.b(net.minecraft.u.b.n.c(this.a.aU), n2, net.minecraft.u.b.n.c(this.a.aW))).c();
            int n3 = 0;
            while (cn2 == p.i || cn2 == p.j) {
                cn2 = this.b.n(new net.minecraft.u.b.b(net.minecraft.u.b.n.c(this.a.aU), ++n2, net.minecraft.u.b.n.c(this.a.aW))).c();
                if (++n3 <= 16) continue;
                return (int)this.a.cT().b;
            }
            return n2;
        }
        return (int)(this.a.cT().b + 0.5);
    }

    @Override
    protected void d() {
        g g2;
        int n2;
        super.d();
        for (n2 = 0; n2 < this.c.d(); ++n2) {
            g2 = this.c.a(n2);
            g g3 = n2 + 1 < this.c.d() ? this.c.a(n2 + 1) : null;
            b b2 = this.b.n(new net.minecraft.u.b.b(g2.a, g2.b, g2.c));
            cn cn2 = b2.c();
            if (cn2 != p.bE) continue;
            this.c.a(n2, g2.a(g2.a, g2.b + 1, g2.c));
            if (g3 == null || g2.b < g3.b) continue;
            this.c.a(n2 + 1, g3.a(g3.a, g2.b + 1, g3.c));
        }
        if (this.g) {
            if (this.b.g(new net.minecraft.u.b.b(net.minecraft.u.b.n.c(this.a.aU), (int)(this.a.cT().b + 0.5), net.minecraft.u.b.n.c(this.a.aW)))) {
                return;
            }
            for (n2 = 0; n2 < this.c.d(); ++n2) {
                g2 = this.c.a(n2);
                if (!this.b.g(new net.minecraft.u.b.b(g2.a, g2.b, g2.c))) continue;
                this.c.b(n2 - 1);
                return;
            }
        }
    }

    @Override
    protected boolean a(s s2, s s3, int n2, int n3, int n4) {
        int n5 = net.minecraft.u.b.n.c(s2.b);
        int n6 = net.minecraft.u.b.n.c(s2.d);
        double d2 = s3.b - s2.b;
        double d3 = s3.d - s2.d;
        double d4 = d2 * d2 + d3 * d3;
        if (d4 < 1.0E-8) {
            return false;
        }
        double d5 = 1.0 / Math.sqrt(d4);
        if (!this.a(n5, (int)s2.c, n6, n2 += 2, n3, n4 += 2, s2, d2 *= d5, d3 *= d5)) {
            return false;
        }
        n2 -= 2;
        n4 -= 2;
        double d6 = 1.0 / Math.abs(d2);
        double d7 = 1.0 / Math.abs(d3);
        double d8 = (double)n5 - s2.b;
        double d9 = (double)n6 - s2.d;
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        if (d3 >= 0.0) {
            d9 += 1.0;
        }
        d8 /= d2;
        d9 /= d3;
        int n7 = d2 < 0.0 ? -1 : 1;
        int n8 = d3 < 0.0 ? -1 : 1;
        int n9 = net.minecraft.u.b.n.c(s3.b);
        int n10 = net.minecraft.u.b.n.c(s3.d);
        int n11 = n9 - n5;
        int n12 = n10 - n6;
        while (n11 * n7 > 0 || n12 * n8 > 0) {
            if (d8 < d9) {
                d8 += d6;
                n11 = n9 - (n5 += n7);
            } else {
                d9 += d7;
                n12 = n10 - (n6 += n8);
            }
            if (this.a(n5, (int)s2.c, n6, n2, n3, n4, s2, d2, d3)) continue;
            return false;
        }
        return true;
    }

    private boolean a(int n2, int n3, int n4, int n5, int n6, int n7, s s2, double d2, double d3) {
        int n8 = n2 - n5 / 2;
        int n9 = n4 - n7 / 2;
        if (!this.b(n8, n3, n9, n5, n6, n7, s2, d2, d3)) {
            return false;
        }
        for (int i2 = n8; i2 < n8 + n5; ++i2) {
            for (int i3 = n9; i3 < n9 + n7; ++i3) {
                double d4 = (double)i2 + 0.5 - s2.b;
                double d5 = (double)i3 + 0.5 - s2.d;
                if (!(d4 * d2 + d5 * d3 >= 0.0)) continue;
                h h2 = this.f.a(this.b, i2, n3 - 1, i3, this.a, n5, n6, n7, true, true);
                if (h2 == h.g) {
                    return false;
                }
                if (h2 == h.f) {
                    return false;
                }
                if (h2 == h.b) {
                    return false;
                }
                h2 = this.f.a(this.b, i2, n3, i3, this.a, n5, n6, n7, true, true);
                float f2 = this.a.a(h2);
                if (f2 < 0.0f || f2 >= 8.0f) {
                    return false;
                }
                if (h2 != h.j && h2 != h.i && h2 != h.n) continue;
                return false;
            }
        }
        return true;
    }

    private boolean b(int n2, int n3, int n4, int n5, int n6, int n7, s s2, double d2, double d3) {
        for (net.minecraft.u.b.b b2 : net.minecraft.u.b.b.a(new net.minecraft.u.b.b(n2, n3, n4), new net.minecraft.u.b.b(n2 + n5 - 1, n3 + n6 - 1, n4 + n7 - 1))) {
            cn cn2;
            double d4;
            double d5 = (double)b2.cy_() + 0.5 - s2.b;
            if (!(d5 * d2 + (d4 = (double)b2.l() + 0.5 - s2.d) * d3 >= 0.0) || (cn2 = this.b.n(b2).c()).a((n)this.b, b2)) continue;
            return false;
        }
        return true;
    }

    public void a(boolean bl2) {
        this.f.b(bl2);
    }

    public void b(boolean bl2) {
        this.f.a(bl2);
    }

    public boolean e() {
        return this.f.c();
    }

    public void c(boolean bl2) {
        this.f.c(bl2);
    }

    public boolean f() {
        return this.f.e();
    }

    public void d(boolean bl2) {
        this.g = bl2;
    }
}

