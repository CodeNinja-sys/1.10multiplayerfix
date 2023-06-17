/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class yk {
    private final boolean a;
    private final boolean b;
    private final Random c = new Random();
    private final iu d;
    private final double e;
    private final double f;
    private final double g;
    private final cpk h;
    private final float i;
    private final List j = ov.a();
    private final Map k = sz.c();

    public yk(iu iu2, cpk cpk2, double d2, double d3, double d4, float f2, List list) {
        this(iu2, cpk2, d2, d3, d4, f2, false, true, list);
    }

    public yk(iu iu2, cpk cpk2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3, List list) {
        this(iu2, cpk2, d2, d3, d4, f2, bl2, bl3);
        this.j.addAll(list);
    }

    public yk(iu iu2, cpk cpk2, double d2, double d3, double d4, float f2, boolean bl2, boolean bl3) {
        this.d = iu2;
        this.h = cpk2;
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
                        cmz cmz2 = new cmz(d6, d7, d8);
                        dbk dbk2 = this.d.n(cmz2);
                        if (dbk2.a() != ahk.a) {
                            float f4 = this.h != null ? this.h.a(this, this.d, cmz2, dbk2) : dbk2.t().a((cpk)null);
                            f3 -= (f4 + 0.3f) * 0.3f;
                        }
                        if (f3 > 0.0f && (this.h == null || this.h.a(this, this.d, cmz2, dbk2, f3))) {
                            hashSet.add(cmz2);
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
        n3 = cmk.c(this.e - (double)f5 - 1.0);
        n2 = cmk.c(this.e + (double)f5 + 1.0);
        int n5 = cmk.c(this.f - (double)f5 - 1.0);
        int n6 = cmk.c(this.f + (double)f5 + 1.0);
        int n7 = cmk.c(this.g - (double)f5 - 1.0);
        int n8 = cmk.c(this.g + (double)f5 + 1.0);
        List list = this.d.b(this.h, new cxt(n3, n5, n7, n2, n6, n8));
        amj amj2 = new amj(this.e, this.f, this.g);
        for (int i3 = 0; i3 < list.size(); ++i3) {
            bdl bdl2;
            double d9;
            double d10;
            double d11;
            double d12;
            double d13;
            cpk cpk2 = (cpk)list.get(i3);
            if (cpk2.N_() || !((d13 = cpk2.j(this.e, this.f, this.g) / (double)f5) <= 1.0) || (d12 = (double)cmk.a((d11 = cpk2.aU - this.e) * d11 + (d10 = cpk2.aV + (double)cpk2.A() - this.f) * d10 + (d9 = cpk2.aW - this.g) * d9)) == 0.0) continue;
            d11 /= d12;
            d10 /= d12;
            d9 /= d12;
            double d14 = this.d.a(amj2, cpk2.cD());
            double d15 = (1.0 - d13) * d14;
            cpk2.a(ahy.a(this), (float)((int)((d15 * d15 + d15) / 2.0 * 7.0 * (double)f5 + 1.0)));
            double d16 = 1.0;
            if (cpk2 instanceof bga) {
                d16 = cqc.a((bga)cpk2, d15);
            }
            cpk2.aX += d11 * d16;
            cpk2.aY += d10 * d16;
            cpk2.aZ += d9 * d16;
            if (!(cpk2 instanceof bdl) || (bdl2 = (bdl)cpk2).aL() || bdl2.aM() && bdl2.G.b) continue;
            this.k.put(bdl2, new amj(d11 * d15, d10 * d15, d9 * d15));
        }
    }

    public void a(boolean bl2) {
        this.d.a(null, this.e, this.f, this.g, dah.bF, csg.e, 4.0f, (1.0f + (this.d.p.nextFloat() - this.d.p.nextFloat()) * 0.2f) * 0.7f);
        if (this.i < 2.0f || !this.b) {
            this.d.a(lz.b, this.e, this.f, this.g, 1.0, 0.0, 0.0, new int[0]);
        } else {
            this.d.a(lz.c, this.e, this.f, this.g, 1.0, 0.0, 0.0, new int[0]);
        }
        if (this.b) {
            for (cmz cmz2 : this.j) {
                dbk dbk2 = this.d.n(cmz2);
                bfa bfa2 = dbk2.t();
                if (bl2) {
                    double d2 = (float)cmz2.a() + this.d.p.nextFloat();
                    double d3 = (float)cmz2.b() + this.d.p.nextFloat();
                    double d4 = (float)cmz2.c() + this.d.p.nextFloat();
                    double d5 = d2 - this.e;
                    double d6 = d3 - this.f;
                    double d7 = d4 - this.g;
                    double d8 = cmk.a(d5 * d5 + d6 * d6 + d7 * d7);
                    d5 /= d8;
                    d6 /= d8;
                    d7 /= d8;
                    double d9 = 0.5 / (d8 / (double)this.i + 0.1);
                    this.d.a(lz.a, (d2 + this.e) / 2.0, (d3 + this.f) / 2.0, (d4 + this.g) / 2.0, d5 *= (d9 *= (double)(this.d.p.nextFloat() * this.d.p.nextFloat() + 0.3f)), d6 *= d9, d7 *= d9, new int[0]);
                    this.d.a(lz.l, d2, d3, d4, d5, d6, d7, new int[0]);
                }
                if (dbk2.a() == ahk.a) continue;
                if (bfa2.a(this)) {
                    bfa2.a(this.d, cmz2, this.d.n(cmz2), 1.0f / this.i, 0);
                }
                this.d.a(cmz2, blg.a.s(), 3);
                bfa2.a(this.d, cmz2, this);
            }
        }
        if (this.a) {
            for (cmz cmz2 : this.j) {
                if (this.d.n(cmz2).a() != ahk.a || !this.d.n(cmz2.h()).b() || this.c.nextInt(3) != 0) continue;
                this.d.a(cmz2, blg.ab.s());
            }
        }
    }

    public Map b() {
        return this.k;
    }

    public bga c() {
        if (this.h == null) {
            return null;
        }
        if (this.h instanceof cgg) {
            return ((cgg)this.h).n();
        }
        if (this.h instanceof bga) {
            return (bga)this.h;
        }
        return null;
    }

    public void d() {
        this.j.clear();
    }

    public List e() {
        return this.j;
    }
}

