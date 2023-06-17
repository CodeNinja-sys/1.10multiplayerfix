/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.c.an;
import java.util.Random;

public class axz
extends cgv {
    public static final byc a = byc.a("axis", ctv.class, ctv.a, ctv.c);
    protected static final cxt b = new cxt(0.0, 0.0, 0.375, 1.0, 1.0, 0.625);
    protected static final cxt c = new cxt(0.375, 0.0, 0.0, 0.625, 1.0, 1.0);
    protected static final cxt d = new cxt(0.375, 0.0, 0.375, 0.625, 1.0, 0.625);

    public axz() {
        super(ahk.E, false);
        this.D(this.O.b().a(a, (Comparable)((Object)ctv.a)));
        this.b(true);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        switch ((ctv)((Object)dbk2.b(a))) {
            case a: {
                return b;
            }
            default: {
                return d;
            }
            case c: 
        }
        return c;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        super.a(iu2, cmz2, dbk2, random);
        if (iu2.q.e() && iu2.F().b("doMobSpawning") && random.nextInt(2000) < iu2.Q().a()) {
            cpk cpk2;
            int n2 = cmz2.b();
            cmz cmz3 = cmz2;
            while (!iu2.n(cmz3).q() && cmz3.b() > 0) {
                cmz3 = cmz3.h();
            }
            if (n2 > 0 && !iu2.n(cmz3.g()).l() && (cpk2 = clx.a(iu2, vb.a(csq.class), (double)cmz3.a() + 0.5, (double)cmz3.b() + 1.1, (double)cmz3.c() + 0.5)) != null) {
                cpk2.bP = cpk2.aq_();
            }
        }
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    public static int a(ctv ctv2) {
        if (ctv2 == ctv.a) {
            return 1;
        }
        if (ctv2 == ctv.c) {
            return 2;
        }
        return 0;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    public boolean c(iu iu2, cmz cmz2) {
        lw lw2 = new lw(iu2, cmz2, ctv.a);
        if (lw2.d() && lw.a(lw2) == 0) {
            lw2.e();
            return true;
        }
        lw lw3 = new lw(iu2, cmz2, ctv.c);
        if (lw3.d() && lw.a(lw3) == 0) {
            lw3.e();
            return true;
        }
        return false;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        lw lw2;
        ctv ctv2 = (ctv)((Object)dbk2.b(a));
        if (ctv2 == ctv.a) {
            lw lw3 = new lw(iu2, cmz2, ctv.a);
            if (!lw3.d() || lw.a(lw3) < lw.b(lw3) * lw.c(lw3)) {
                iu2.a(cmz2, blg.a.s());
            }
        } else if (!(ctv2 != ctv.c || (lw2 = new lw(iu2, cmz2, ctv.c)).d() && lw.a(lw2) >= lw.b(lw2) * lw.c(lw2))) {
            iu2.a(cmz2, blg.a.s());
        }
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        boolean bl2;
        cmz2 = cmz2.c(bqk2);
        ctv ctv2 = null;
        if (dbk2.t() == this) {
            ctv2 = (ctv)((Object)dbk2.b(a));
            if (ctv2 == null) {
                return false;
            }
            if (ctv2 == ctv.c && bqk2 != bqk.f && bqk2 != bqk.e) {
                return false;
            }
            if (ctv2 == ctv.a && bqk2 != bqk.d && bqk2 != bqk.c) {
                return false;
            }
        }
        boolean bl3 = bnj2.n(cmz2.k()).t() == this && bnj2.n(cmz2.f(2)).t() != this;
        boolean bl4 = bnj2.n(cmz2.l()).t() == this && bnj2.n(cmz2.g(2)).t() != this;
        boolean bl5 = bnj2.n(cmz2.i()).t() == this && bnj2.n(cmz2.d(2)).t() != this;
        boolean bl6 = bnj2.n(cmz2.j()).t() == this && bnj2.n(cmz2.e(2)).t() != this;
        boolean bl7 = bl3 || bl4 || ctv2 == ctv.a;
        boolean bl8 = bl2 = bl5 || bl6 || ctv2 == ctv.c;
        if (bl7 && bqk2 == bqk.e) {
            return true;
        }
        if (bl7 && bqk2 == bqk.f) {
            return true;
        }
        if (bl2 && bqk2 == bqk.c) {
            return true;
        }
        return bl2 && bqk2 == bqk.d;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public kj b() {
        return kj.d;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        if (!cpk2.cp() && !cpk2.cq() && cpk2.aB_()) {
            cpk2.g(cmz2);
        }
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        if (random.nextInt(100) == 0) {
            iu2.a((double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5, dah.ex, csg.e, 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i2 = 0; i2 < 4; ++i2) {
            double d2 = (float)cmz2.a() + random.nextFloat();
            double d3 = (float)cmz2.b() + random.nextFloat();
            double d4 = (float)cmz2.c() + random.nextFloat();
            double d5 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d6 = ((double)random.nextFloat() - 0.5) * 0.5;
            double d7 = ((double)random.nextFloat() - 0.5) * 0.5;
            int n2 = random.nextInt(2) * 2 - 1;
            if (iu2.n(cmz2.k()).t() == this || iu2.n(cmz2.l()).t() == this) {
                d4 = (double)cmz2.c() + 0.5 + 0.25 * (double)n2;
                d7 = random.nextFloat() * 2.0f * (float)n2;
            } else {
                d2 = (double)cmz2.a() + 0.5 + 0.25 * (double)n2;
                d5 = random.nextFloat() * 2.0f * (float)n2;
            }
            iu2.a(lz.y, d2, d3, d4, d5, d6, d7, new int[0]);
        }
    }

    @Override
    public bhl c(iu iu2, cmz cmz2, dbk dbk2) {
        return null;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)((n2 & 3) == 2 ? ctv.c : ctv.a)));
    }

    @Override
    public int e(dbk dbk2) {
        return axz.a((ctv)((Object)dbk2.b(a)));
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case d: 
            case b: {
                switch ((ctv)((Object)dbk2.b(a))) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)ctv.c));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctv.a));
                    }
                }
                return dbk2;
            }
        }
        return dbk2;
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }

    /*
     * WARNING - void declaration
     */
    public aiz d(iu iu2, cmz cmz2) {
        void var9_11;
        ctv ctv2 = ctv.c;
        lw lw2 = new lw(iu2, cmz2, ctv.a);
        an an2 = ve.a(iu2, true);
        if (!lw2.d()) {
            ctv2 = ctv.a;
            lw2 = new lw(iu2, cmz2, ctv.c);
        }
        if (!lw2.d()) {
            return new aiz(cmz2, bqk.c, bqk.b, an2, 1, 1, 1);
        }
        int[] arrn = new int[yy.values().length];
        bqk bqk2 = lw.d(lw2).g();
        cmz cmz3 = lw.e(lw2).b(lw2.a() - 1);
        for (yy yy2 : yy.values()) {
            Object object = new aiz(bqk2.d() == yy2 ? cmz3 : cmz3.c(lw.d(lw2), lw2.b() - 1), bqk.a(yy2, ctv2), bqk.b, an2, lw2.b(), lw2.a(), 1);
            for (int i2 = 0; i2 < lw2.b(); ++i2) {
                for (int i3 = 0; i3 < lw2.a(); ++i3) {
                    amr amr2 = ((aiz)object).a(i2, i3, 1);
                    if (amr2.a() == null || amr2.a().a() == ahk.a) continue;
                    int n2 = yy2.ordinal();
                    arrn[n2] = arrn[n2] + 1;
                }
            }
        }
        yy yy3 = yy.a;
        for (Object object : yy.values()) {
            if (arrn[object.ordinal()] >= arrn[var9_11.ordinal()]) continue;
            yy yy4 = object;
        }
        return new aiz(bqk2.d() == var9_11 ? cmz3 : cmz3.c(lw.d(lw2), lw2.b() - 1), bqk.a((yy)var9_11, ctv2), bqk.b, an2, lw2.b(), lw2.a(), 1);
    }
}

