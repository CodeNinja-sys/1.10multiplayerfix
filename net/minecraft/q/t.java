/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.f;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.o.z;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.u.b.a;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.u.bu;
import net.minecraft.w.f.af;
import net.minecraft.w.l;

public class t {
    private final boolean a;
    private final boolean b;
    private final Random c = new Random();
    private final k d;
    private final double e;
    private final double f;
    private final double g;
    private final net.minecraft.w.n h;
    private final float i;
    private final List j = ov.a();
    private final Map k = sz.c();

    public t(k k2, net.minecraft.w.n n2, double d2, double d3, double d4, float f2, List list) {
        this(k2, n2, d2, d3, d4, f2, false, true, list);
    }

    public t(k k2, net.minecraft.w.n n2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3, List list) {
        this(k2, n2, d2, d3, d4, f2, bl2, bl3);
        this.j.addAll(list);
    }

    public t(k k2, net.minecraft.w.n n2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        this.d = k2;
        this.h = n2;
        this.i = f2;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.a = bl2;
        this.b = bl3;
    }

    public void a() {
        int n2;
        int n3;
        HashSet hashSet = aad.a();
        int n4 = 16;
        for (int i2 = 0; i2 < 16; ++i2) {
            for (n3 = 0; n3 < 16; ++n3) {
                for (n2 = 0; n2 < 16; ++n2) {
                    if (i2 != 0 && i2 != 15 && n3 != 0 && n3 != 15 && n2 != 0 && n2 != 15) continue;
                    double d2 = (float)i2 / 15.0f * 2.0f - 1.0f;
                    double d3 = (float)n3 / 15.0f * 2.0f - 1.0f;
                    double d4 = (float)n2 / 15.0f * 2.0f - 1.0f;
                    double d5 = Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
                    d2 /= d5;
                    d3 /= d5;
                    d4 /= d5;
                    double d6 = this.e;
                    double d7 = this.f;
                    double d8 = this.g;
                    float f2 = 0.3f;
                    for (float f3 = this.i * (0.7f + this.d.p.nextFloat() * 0.6f); f3 > 0.0f; f3 -= 0.22500001f) {
                        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(d6, d7, d8);
                        b b3 = this.d.n(b2);
                        if (b3.d() != net.minecraft.g.a.h.a) {
                            float f4 = this.h != null ? this.h.a(this, this.d, b2, b3) : b3.c().a((net.minecraft.w.n)null);
                            f3 -= (f4 + 0.3f) * 0.3f;
                        }
                        if (f3 > 0.0f && (this.h == null || this.h.a(this, this.d, b2, b3, f3))) {
                            hashSet.add(b2);
                        }
                        d6 += d2 * (double)0.3f;
                        d7 += d3 * (double)0.3f;
                        d8 += d4 * (double)0.3f;
                    }
                }
            }
        }
        this.j.addAll(hashSet);
        float f5 = this.i * 2.0f;
        n3 = n.c(this.e - (double)f5 - 1.0);
        n2 = n.c(this.e + (double)f5 + 1.0);
        int n5 = n.c(this.f - (double)f5 - 1.0);
        int n6 = n.c(this.f + (double)f5 + 1.0);
        int n7 = n.c(this.g - (double)f5 - 1.0);
        int n8 = n.c(this.g + (double)f5 + 1.0);
        List list = this.d.b(this.h, new a(n3, n5, n7, n2, n6, n8));
        s s2 = new s(this.e, this.f, this.g);
        for (int i3 = 0; i3 < list.size(); ++i3) {
            net.minecraft.w.a.b b4;
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            net.minecraft.w.n n9 = (net.minecraft.w.n)list.get(i3);
            if (n9.cX() || !((d13 = n9.i(this.e, this.f, this.g) / (double)f5) <= 1.0) || (d12 = (double)n.a((d11 = n9.aU - this.e) * d11 + (d10 = n9.aV + (double)n9.ce_() - this.f) * d10 + (d9 = n9.aW - this.g) * d9)) == 0.0) continue;
            d11 /= d12;
            d10 /= d12;
            d9 /= d12;
            double d14 = this.d.a(s2, n9.cT());
            double d15 = (1.0 - d13) * d14;
            n9.a(net.minecraft.u.n.a(this), (float)((int)((d15 * d15 + d15) / 2.0 * 7.0 * (double)f5 + 1.0)));
            double d16 = 1.0;
            if (n9 instanceof l) {
                d16 = z.a((l)n9, d15);
            }
            n9.aX += d11 * d16;
            n9.aY += d10 * d16;
            n9.aZ += d9 * d16;
            if (!(n9 instanceof net.minecraft.w.a.b) || (b4 = (net.minecraft.w.a.b)n9).a() || b4.c() && b4.J.b) continue;
            this.k.put(b4, new s(d11 * d15, d10 * d15, d9 * d15));
        }
    }

    public void a(boolean bl2) {
        this.d.a(null, this.e, this.f, this.g, net.minecraft.a.f.bF, bu.e, 4.0f, (1.0f + (this.d.p.nextFloat() - this.d.p.nextFloat()) * 0.2f) * 0.7f);
        if (this.i >= 2.0f && this.b) {
            this.d.a(aj.c, this.e, this.f, this.g, 1.0, 0.0, 0.0, new int[0]);
        } else {
            this.d.a(aj.b, this.e, this.f, this.g, 1.0, 0.0, 0.0, new int[0]);
        }
        if (this.b) {
            for (net.minecraft.u.b.b b2 : this.j) {
                b b3 = this.d.n(b2);
                cn cn2 = b3.c();
                if (bl2) {
                    double d2 = (float)b2.cy_() + this.d.p.nextFloat();
                    double d3 = (float)b2.k() + this.d.p.nextFloat();
                    double d4 = (float)b2.l() + this.d.p.nextFloat();
                    double d5 = d2 - this.e;
                    double d6 = d3 - this.f;
                    double d7 = d4 - this.g;
                    double d8 = n.a(d5 * d5 + d6 * d6 + d7 * d7);
                    d5 /= d8;
                    d6 /= d8;
                    d7 /= d8;
                    double d9 = 0.5 / (d8 / (double)this.i + 0.1);
                    this.d.a(aj.a, (d2 + this.e) / 2.0, (d3 + this.f) / 2.0, (d4 + this.g) / 2.0, d5 *= (d9 *= (double)(this.d.p.nextFloat() * this.d.p.nextFloat() + 0.3f)), d6 *= d9, d7 *= d9, new int[0]);
                    this.d.a(aj.l, d2, d3, d4, d5, d6, d7, new int[0]);
                }
                if (b3.d() == net.minecraft.g.a.h.a) continue;
                if (cn2.a(this)) {
                    cn2.a(this.d, b2, this.d.n(b2), 1.0f / this.i, 0);
                }
                this.d.a(b2, p.a.v(), 3);
                cn2.a(this.d, b2, this);
            }
        }
        if (this.a) {
            for (net.minecraft.u.b.b b2 : this.j) {
                if (this.d.n(b2).d() != net.minecraft.g.a.h.a || !this.d.n(b2.c()).e() || this.c.nextInt(3) != 0) continue;
                this.d.b(b2, p.ab.v());
            }
        }
    }

    public Map b() {
        return this.k;
    }

    public l c() {
        return this.h == null ? null : (this.h instanceof af ? ((af)this.h).a() : (this.h instanceof l ? (l)this.h : null));
    }

    public void d() {
        this.j.clear();
    }

    public List e() {
        return this.j;
    }
}

