/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.EnumSet;
import java.util.HashSet;

public class cae
extends um {
    private float j;

    @Override
    public void a(bnj bnj2, xy xy2) {
        super.a(bnj2, xy2);
        this.j = xy2.a(cfh.g);
    }

    @Override
    public void b() {
        this.b.a(cfh.g, this.j);
        super.b();
    }

    @Override
    public aqn a() {
        Object object;
        cmz cmz2;
        int n2;
        if (this.e() && this.b.V_()) {
            n2 = (int)this.b.cD().b;
            cmz2 = new pj(cmk.c(this.b.aU), n2, cmk.c(this.b.aW));
            object = this.a.n(cmz2).t();
            while (object == blg.i || object == blg.j) {
                ((pj)cmz2).a(cmk.c(this.b.aU), ++n2, cmk.c(this.b.aW));
                object = this.a.n(cmz2).t();
            }
        } else if (this.b.be) {
            n2 = cmk.c(this.b.cD().b + 0.5);
        } else {
            cmz2 = new cmz(this.b);
            while ((this.a.n(cmz2).a() == ahk.a || this.a.n(cmz2).t().a(this.a, cmz2)) && cmz2.b() > 0) {
                cmz2 = cmz2.h();
            }
            n2 = cmz2.g().b();
        }
        cmz2 = new cmz(this.b);
        object = this.a(this.b, cmz2.a(), n2, cmz2.c());
        if (this.b.a((cfh)((Object)object)) < 0.0f) {
            HashSet hashSet = aad.a();
            hashSet.add(new cmz(this.b.cD().a, (double)n2, this.b.cD().c));
            hashSet.add(new cmz(this.b.cD().a, (double)n2, this.b.cD().f));
            hashSet.add(new cmz(this.b.cD().d, (double)n2, this.b.cD().c));
            hashSet.add(new cmz(this.b.cD().d, (double)n2, this.b.cD().f));
            for (cmz cmz3 : hashSet) {
                cfh cfh2 = this.a(this.b, cmz3);
                if (!(this.b.a(cfh2) >= 0.0f)) continue;
                return this.a(cmz3.a(), cmz3.b(), cmz3.c());
            }
        }
        return this.a(cmz2.a(), n2, cmz2.c());
    }

    @Override
    public aqn a(double d2, double d3, double d4) {
        return this.a(cmk.c(d2 - (double)(this.b.bl / 2.0f)), cmk.c(d3), cmk.c(d4 - (double)(this.b.bl / 2.0f)));
    }

    @Override
    public int a(aqn[] arraqn, aqn aqn2, aqn aqn3, float f2) {
        aqn aqn4;
        boolean bl2;
        int n2 = 0;
        int n3 = 0;
        cfh cfh2 = this.a(this.b, aqn2.a, aqn2.b + 1, aqn2.c);
        if (this.b.a(cfh2) >= 0.0f) {
            n3 = cmk.d(Math.max(1.0f, this.b.bu));
        }
        cmz cmz2 = new cmz(aqn2.a, aqn2.b, aqn2.c).h();
        double d2 = (double)aqn2.b - (1.0 - this.a.n((cmz)cmz2).c((bnj)this.a, (cmz)cmz2).e);
        aqn aqn5 = this.a(aqn2.a, aqn2.b, aqn2.c + 1, n3, d2, bqk.d);
        aqn aqn6 = this.a(aqn2.a - 1, aqn2.b, aqn2.c, n3, d2, bqk.e);
        aqn aqn7 = this.a(aqn2.a + 1, aqn2.b, aqn2.c, n3, d2, bqk.f);
        aqn aqn8 = this.a(aqn2.a, aqn2.b, aqn2.c - 1, n3, d2, bqk.c);
        if (aqn5 != null && !aqn5.i && aqn5.a(aqn3) < f2) {
            arraqn[n2++] = aqn5;
        }
        if (aqn6 != null && !aqn6.i && aqn6.a(aqn3) < f2) {
            arraqn[n2++] = aqn6;
        }
        if (aqn7 != null && !aqn7.i && aqn7.a(aqn3) < f2) {
            arraqn[n2++] = aqn7;
        }
        if (aqn8 != null && !aqn8.i && aqn8.a(aqn3) < f2) {
            arraqn[n2++] = aqn8;
        }
        boolean bl3 = aqn8 == null || aqn8.m == cfh.b || aqn8.l != 0.0f;
        boolean bl4 = aqn5 == null || aqn5.m == cfh.b || aqn5.l != 0.0f;
        boolean bl5 = aqn7 == null || aqn7.m == cfh.b || aqn7.l != 0.0f;
        boolean bl6 = bl2 = aqn6 == null || aqn6.m == cfh.b || aqn6.l != 0.0f;
        if (bl3 && bl2 && (aqn4 = this.a(aqn2.a - 1, aqn2.b, aqn2.c - 1, n3, d2, bqk.c)) != null && !aqn4.i && aqn4.a(aqn3) < f2) {
            arraqn[n2++] = aqn4;
        }
        if (bl3 && bl5 && (aqn4 = this.a(aqn2.a + 1, aqn2.b, aqn2.c - 1, n3, d2, bqk.c)) != null && !aqn4.i && aqn4.a(aqn3) < f2) {
            arraqn[n2++] = aqn4;
        }
        if (bl4 && bl2 && (aqn4 = this.a(aqn2.a - 1, aqn2.b, aqn2.c + 1, n3, d2, bqk.d)) != null && !aqn4.i && aqn4.a(aqn3) < f2) {
            arraqn[n2++] = aqn4;
        }
        if (bl4 && bl5 && (aqn4 = this.a(aqn2.a + 1, aqn2.b, aqn2.c + 1, n3, d2, bqk.d)) != null && !aqn4.i && aqn4.a(aqn3) < f2) {
            arraqn[n2++] = aqn4;
        }
        return n2;
    }

    private aqn a(int n2, int n3, int n4, int n5, double d2, bqk bqk2) {
        aqn aqn2 = null;
        cmz cmz2 = new cmz(n2, n3, n4);
        cmz cmz3 = cmz2.h();
        double d3 = (double)n3 - (1.0 - this.a.n((cmz)cmz3).c((bnj)this.a, (cmz)cmz3).e);
        if (d3 - d2 > 1.125) {
            return null;
        }
        cfh cfh2 = this.a(this.b, n2, n3, n4);
        float f2 = this.b.a(cfh2);
        double d4 = (double)this.b.bl / 2.0;
        if (f2 >= 0.0f) {
            aqn2 = this.a(n2, n3, n4);
            aqn2.m = cfh2;
            aqn2.l = Math.max(aqn2.l, f2);
        }
        if (cfh2 == cfh.c) {
            return aqn2;
        }
        if (aqn2 == null && n5 > 0 && cfh2 != cfh.e && cfh2 != cfh.d && (aqn2 = this.a(n2, n3 + 1, n4, n5 - 1, d2, bqk2)) != null && (aqn2.m == cfh.b || aqn2.m == cfh.c) && this.b.bl < 1.0f) {
            double d5 = (double)(n2 - bqk2.h()) + 0.5;
            double d6 = (double)(n4 - bqk2.j()) + 0.5;
            cxt cxt2 = new cxt(d5 - d4, (double)n3 + 0.001, d6 - d4, d5 + d4, (float)n3 + this.b.bm, d6 + d4);
            cxt cxt3 = this.a.n(cmz2).c(this.a, cmz2);
            cxt cxt4 = cxt2.a(0.0, cxt3.e - 0.002, 0.0);
            if (this.b.aQ.b(cxt4)) {
                aqn2 = null;
            }
        }
        if (cfh2 == cfh.b) {
            cfh cfh3;
            cxt cxt5 = new cxt((double)n2 - d4 + 0.5, (double)n3 + 0.001, (double)n4 - d4 + 0.5, (double)n2 + d4 + 0.5, (float)n3 + this.b.bm, (double)n4 + d4 + 0.5);
            if (this.b.aQ.b(cxt5)) {
                return null;
            }
            if (this.b.bl >= 1.0f && (cfh3 = this.a(this.b, n2, n3 - 1, n4)) == cfh.a) {
                aqn2 = this.a(n2, n3, n4);
                aqn2.m = cfh.c;
                aqn2.l = Math.max(aqn2.l, f2);
                return aqn2;
            }
            int n6 = 0;
            while (n3 > 0 && cfh2 == cfh.b) {
                --n3;
                if (n6++ >= this.b.az()) {
                    return null;
                }
                cfh2 = this.a(this.b, n2, n3, n4);
                f2 = this.b.a(cfh2);
                if (cfh2 != cfh.b && f2 >= 0.0f) {
                    aqn2 = this.a(n2, n3, n4);
                    aqn2.m = cfh2;
                    aqn2.l = Math.max(aqn2.l, f2);
                    break;
                }
                if (!(f2 < 0.0f)) continue;
                return null;
            }
        }
        return aqn2;
    }

    @Override
    public cfh a(bnj bnj2, int n2, int n3, int n4, xy xy2, int n5, int n6, int n7, boolean bl2, boolean bl3) {
        EnumSet<cfh> enumSet = EnumSet.noneOf(cfh.class);
        cfh cfh2 = cfh.a;
        double d2 = (double)xy2.bl / 2.0;
        cmz cmz2 = new cmz(xy2);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n6; ++i3) {
                for (int i4 = 0; i4 < n7; ++i4) {
                    int n8 = i2 + n2;
                    int n9 = i3 + n3;
                    int n10 = i4 + n4;
                    cfh cfh3 = this.a(bnj2, n8, n9, n10);
                    if (cfh3 == cfh.p && bl2 && bl3) {
                        cfh3 = cfh.c;
                    }
                    if (cfh3 == cfh.o && !bl3) {
                        cfh3 = cfh.a;
                    }
                    if (cfh3 == cfh.h && !(bnj2.n(cmz2).t() instanceof bxs) && !(bnj2.n(cmz2.h()).t() instanceof bxs)) {
                        cfh3 = cfh.e;
                    }
                    if (i2 == 0 && i3 == 0 && i4 == 0) {
                        cfh2 = cfh3;
                    }
                    enumSet.add(cfh3);
                }
            }
        }
        if (enumSet.contains((Object)cfh.e)) {
            return cfh.e;
        }
        cfh cfh4 = cfh.a;
        for (cfh cfh5 : enumSet) {
            if (xy2.a(cfh5) < 0.0f) {
                return cfh5;
            }
            if (!(xy2.a(cfh5) >= xy2.a(cfh4))) continue;
            cfh4 = cfh5;
        }
        if (cfh2 == cfh.b && xy2.a(cfh4) == 0.0f) {
            return cfh.b;
        }
        return cfh4;
    }

    private cfh a(xy xy2, cmz cmz2) {
        return this.a(xy2, cmz2.a(), cmz2.b(), cmz2.c());
    }

    private cfh a(xy xy2, int n2, int n3, int n4) {
        return this.a(this.a, n2, n3, n4, xy2, this.d, this.e, this.f, this.d(), this.c());
    }

    @Override
    public cfh a(bnj bnj2, int n2, int n3, int n4) {
        Object object;
        cfh cfh2 = this.b(bnj2, n2, n3, n4);
        if (cfh2 == cfh.b && n3 >= 1) {
            object = bnj2.n(new cmz(n2, n3 - 1, n4)).t();
            cfh cfh3 = this.b(bnj2, n2, n3 - 1, n4);
            cfh cfh4 = cfh2 = cfh3 == cfh.c || cfh3 == cfh.b || cfh3 == cfh.g || cfh3 == cfh.f ? cfh.b : cfh.c;
            if (cfh3 == cfh.j || object == blg.df) {
                cfh2 = cfh.j;
            }
            if (cfh3 == cfh.l) {
                cfh2 = cfh.l;
            }
        }
        object = bjb.e();
        if (cfh2 == cfh.c) {
            for (int i2 = -1; i2 <= 1; ++i2) {
                for (int i3 = -1; i3 <= 1; ++i3) {
                    if (i2 == 0 && i3 == 0) continue;
                    bfa bfa2 = bnj2.n(((bjb)object).c(i2 + n2, n3, i3 + n4)).t();
                    if (bfa2 == blg.aK) {
                        cfh2 = cfh.k;
                        continue;
                    }
                    if (bfa2 != blg.ab) continue;
                    cfh2 = cfh.i;
                }
            }
        }
        ((bjb)object).f();
        return cfh2;
    }

    private cfh b(bnj bnj2, int n2, int n3, int n4) {
        cmz cmz2 = new cmz(n2, n3, n4);
        dbk dbk2 = bnj2.n(cmz2);
        bfa bfa2 = dbk2.t();
        ahk ahk2 = dbk2.a();
        if (ahk2 == ahk.a) {
            return cfh.b;
        }
        if (bfa2 == blg.bd || bfa2 == blg.cw || bfa2 == blg.bx) {
            return cfh.d;
        }
        if (bfa2 == blg.ab) {
            return cfh.j;
        }
        if (bfa2 == blg.aK) {
            return cfh.l;
        }
        if (bfa2 instanceof xt && ahk2 == ahk.d && !((Boolean)dbk2.b(xt.b)).booleanValue()) {
            return cfh.p;
        }
        if (bfa2 instanceof xt && ahk2 == ahk.f && !((Boolean)dbk2.b(xt.b)).booleanValue()) {
            return cfh.q;
        }
        if (bfa2 instanceof xt && ((Boolean)dbk2.b(xt.b)).booleanValue()) {
            return cfh.o;
        }
        if (bfa2 instanceof bxs) {
            return cfh.h;
        }
        if (bfa2 instanceof gd || bfa2 instanceof zd || bfa2 instanceof bty && !((Boolean)dbk2.b(bty.a)).booleanValue()) {
            return cfh.e;
        }
        if (ahk2 == ahk.h) {
            return cfh.g;
        }
        if (ahk2 == ahk.i) {
            return cfh.f;
        }
        if (bfa2.a(bnj2, cmz2)) {
            return cfh.b;
        }
        return cfh.a;
    }
}

