/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import java.util.Random;

public class art
extends bfa {
    public static final qf a = qf.a("age", 0, 15);
    public static final ddi b = ddi.b("north");
    public static final ddi c = ddi.b("east");
    public static final ddi d = ddi.b("south");
    public static final ddi e = ddi.b("west");
    public static final ddi f = ddi.b("up");
    private final Map g = sz.g();
    private final Map h = sz.g();

    @Override
    public dbk b(dbk dbk2, bnj bnj2, cmz cmz2) {
        if (bnj2.n(cmz2.h()).q() || blg.ab.c(bnj2, cmz2.h())) {
            return this.s();
        }
        return dbk2.a(b, Boolean.valueOf(this.c(bnj2, cmz2.i()))).a(c, Boolean.valueOf(this.c(bnj2, cmz2.l()))).a(d, Boolean.valueOf(this.c(bnj2, cmz2.j()))).a(e, Boolean.valueOf(this.c(bnj2, cmz2.k()))).a(f, Boolean.valueOf(this.c(bnj2, cmz2.g())));
    }

    protected art() {
        super(ahk.o);
        this.D(this.O.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
        this.b(true);
    }

    public static void h() {
        blg.ab.a(blg.f, 5, 20);
        blg.ab.a(blg.bL, 5, 20);
        blg.ab.a(blg.bM, 5, 20);
        blg.ab.a(blg.bo, 5, 20);
        blg.ab.a(blg.bp, 5, 20);
        blg.ab.a(blg.bq, 5, 20);
        blg.ab.a(blg.br, 5, 20);
        blg.ab.a(blg.bs, 5, 20);
        blg.ab.a(blg.bt, 5, 20);
        blg.ab.a(blg.aO, 5, 20);
        blg.ab.a(blg.aP, 5, 20);
        blg.ab.a(blg.aQ, 5, 20);
        blg.ab.a(blg.aR, 5, 20);
        blg.ab.a(blg.aS, 5, 20);
        blg.ab.a(blg.aT, 5, 20);
        blg.ab.a(blg.ad, 5, 20);
        blg.ab.a(blg.bV, 5, 20);
        blg.ab.a(blg.bU, 5, 20);
        blg.ab.a(blg.bW, 5, 20);
        blg.ab.a(blg.cC, 5, 20);
        blg.ab.a(blg.cD, 5, 20);
        blg.ab.a(blg.r, 5, 5);
        blg.ab.a(blg.s, 5, 5);
        blg.ab.a(blg.t, 30, 60);
        blg.ab.a(blg.u, 30, 60);
        blg.ab.a(blg.X, 30, 20);
        blg.ab.a(blg.W, 15, 100);
        blg.ab.a(blg.H, 60, 100);
        blg.ab.a(blg.cF, 60, 100);
        blg.ab.a(blg.N, 60, 100);
        blg.ab.a(blg.O, 60, 100);
        blg.ab.a(blg.I, 60, 100);
        blg.ab.a(blg.L, 30, 60);
        blg.ab.a(blg.bn, 15, 100);
        blg.ab.a(blg.cA, 5, 5);
        blg.ab.a(blg.cx, 60, 20);
        blg.ab.a(blg.cy, 60, 20);
    }

    public void a(bfa bfa2, int n2, int n3) {
        this.g.put(bfa2, n2);
        this.h.put(bfa2, n3);
    }

    @Override
    public cxt b(dbk dbk2, iu iu2, cmz cmz2) {
        return y;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public int a(iu iu2) {
        return 30;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        bfa bfa2;
        boolean bl2;
        if (!iu2.F().b("doFireTick")) {
            return;
        }
        if (!this.a(iu2, cmz2)) {
            iu2.f(cmz2);
        }
        boolean bl3 = bl2 = (bfa2 = iu2.n(cmz2.h()).t()) == blg.aV;
        if (iu2.q instanceof cup && bfa2 == blg.h) {
            bl2 = true;
        }
        int n2 = (Integer)dbk2.b(a);
        if (!bl2 && iu2.I() && this.b(iu2, cmz2) && random.nextFloat() < 0.2f + (float)n2 * 0.03f) {
            iu2.f(cmz2);
            return;
        }
        if (n2 < 15) {
            dbk2 = dbk2.a(a, Integer.valueOf(n2 + random.nextInt(3) / 2));
            iu2.a(cmz2, dbk2, 4);
        }
        iu2.a(cmz2, (bfa)this, this.a(iu2) + random.nextInt(10));
        if (!bl2) {
            if (!this.c(iu2, cmz2)) {
                if (!iu2.n(cmz2.h()).q() || n2 > 3) {
                    iu2.f(cmz2);
                }
                return;
            }
            if (!this.c((bnj)iu2, cmz2.h()) && n2 == 15 && random.nextInt(4) == 0) {
                iu2.f(cmz2);
                return;
            }
        }
        boolean bl4 = iu2.B(cmz2);
        int n3 = 0;
        if (bl4) {
            n3 = -50;
        }
        this.a(iu2, cmz2.l(), 300 + n3, random, n2);
        this.a(iu2, cmz2.k(), 300 + n3, random, n2);
        this.a(iu2, cmz2.h(), 250 + n3, random, n2);
        this.a(iu2, cmz2.g(), 250 + n3, random, n2);
        this.a(iu2, cmz2.i(), 300 + n3, random, n2);
        this.a(iu2, cmz2.j(), 300 + n3, random, n2);
        for (int i2 = -1; i2 <= 1; ++i2) {
            for (int i3 = -1; i3 <= 1; ++i3) {
                for (int i4 = -1; i4 <= 4; ++i4) {
                    cmz cmz3;
                    int n4;
                    if (i2 == 0 && i4 == 0 && i3 == 0) continue;
                    int n5 = 100;
                    if (i4 > 1) {
                        n5 += (i4 - 1) * 100;
                    }
                    if ((n4 = this.d(iu2, cmz3 = cmz2.e(i2, i4, i3))) <= 0) continue;
                    int n6 = (n4 + 40 + iu2.Q().a() * 7) / (n2 + 30);
                    if (bl4) {
                        n6 /= 2;
                    }
                    if (n6 <= 0 || random.nextInt(n5) > n6 || iu2.I() && this.b(iu2, cmz3)) continue;
                    int n7 = n2 + random.nextInt(5) / 4;
                    if (n7 > 15) {
                        n7 = 15;
                    }
                    iu2.a(cmz3, dbk2.a(a, Integer.valueOf(n7)), 3);
                }
            }
        }
    }

    protected boolean b(iu iu2, cmz cmz2) {
        return iu2.A(cmz2) || iu2.A(cmz2.k()) || iu2.A(cmz2.l()) || iu2.A(cmz2.i()) || iu2.A(cmz2.j());
    }

    @Override
    public boolean i() {
        return false;
    }

    private int b(bfa bfa2) {
        Integer n2 = (Integer)this.h.get(bfa2);
        return n2 == null ? 0 : n2;
    }

    private int d(bfa bfa2) {
        Integer n2 = (Integer)this.g.get(bfa2);
        return n2 == null ? 0 : n2;
    }

    private void a(iu iu2, cmz cmz2, int n2, Random random, int n3) {
        int n4 = this.b(iu2.n(cmz2).t());
        if (random.nextInt(n2) < n4) {
            dbk dbk2 = iu2.n(cmz2);
            if (random.nextInt(n3 + 10) < 5 && !iu2.A(cmz2)) {
                int n5 = n3 + random.nextInt(5) / 4;
                if (n5 > 15) {
                    n5 = 15;
                }
                iu2.a(cmz2, this.s().a(a, Integer.valueOf(n5)), 3);
            } else {
                iu2.f(cmz2);
            }
            if (dbk2.t() == blg.W) {
                blg.W.a_(iu2, cmz2, dbk2.a(rp.a, Boolean.valueOf(true)));
            }
        }
    }

    private boolean c(iu iu2, cmz cmz2) {
        for (bqk bqk2 : bqk.values()) {
            if (!this.c((bnj)iu2, cmz2.c(bqk2))) continue;
            return true;
        }
        return false;
    }

    private int d(iu iu2, cmz cmz2) {
        if (!iu2.c(cmz2)) {
            return 0;
        }
        int n2 = 0;
        for (bqk bqk2 : bqk.values()) {
            n2 = Math.max(this.d(iu2.n(cmz2.c(bqk2)).t()), n2);
        }
        return n2;
    }

    @Override
    public boolean Y_() {
        return false;
    }

    public boolean c(bnj bnj2, cmz cmz2) {
        return this.d(bnj2.n(cmz2).t()) > 0;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return iu2.n(cmz2.h()).q() || this.c(iu2, cmz2);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (!iu2.n(cmz2.h()).q() && !this.c(iu2, cmz2)) {
            iu2.f(cmz2);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        if (iu2.q.a().a() <= 0 && blg.aY.c(iu2, cmz2)) {
            return;
        }
        if (!iu2.n(cmz2.h()).q() && !this.c(iu2, cmz2)) {
            iu2.f(cmz2);
            return;
        }
        iu2.a(cmz2, (bfa)this, this.a(iu2) + iu2.p.nextInt(10));
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, Random random) {
        block12: {
            double d2;
            double d3;
            double d4;
            int n2;
            block11: {
                if (random.nextInt(24) == 0) {
                    iu2.a((float)cmz2.a() + 0.5f, (double)((float)cmz2.b() + 0.5f), (double)((float)cmz2.c() + 0.5f), dah.bw, csg.e, 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (!iu2.n(cmz2.h()).q() && !blg.ab.c((bnj)iu2, cmz2.h())) break block11;
                for (int i2 = 0; i2 < 3; ++i2) {
                    double d5 = (double)cmz2.a() + random.nextDouble();
                    double d6 = (double)cmz2.b() + random.nextDouble() * 0.5 + 0.5;
                    double d7 = (double)cmz2.c() + random.nextDouble();
                    iu2.a(lz.m, d5, d6, d7, 0.0, 0.0, 0.0, new int[0]);
                }
                break block12;
            }
            if (blg.ab.c((bnj)iu2, cmz2.k())) {
                for (n2 = 0; n2 < 2; ++n2) {
                    d4 = (double)cmz2.a() + random.nextDouble() * (double)0.1f;
                    d3 = (double)cmz2.b() + random.nextDouble();
                    d2 = (double)cmz2.c() + random.nextDouble();
                    iu2.a(lz.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (blg.ab.c((bnj)iu2, cmz2.l())) {
                for (n2 = 0; n2 < 2; ++n2) {
                    d4 = (double)(cmz2.a() + 1) - random.nextDouble() * (double)0.1f;
                    d3 = (double)cmz2.b() + random.nextDouble();
                    d2 = (double)cmz2.c() + random.nextDouble();
                    iu2.a(lz.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (blg.ab.c((bnj)iu2, cmz2.i())) {
                for (n2 = 0; n2 < 2; ++n2) {
                    d4 = (double)cmz2.a() + random.nextDouble();
                    d3 = (double)cmz2.b() + random.nextDouble();
                    d2 = (double)cmz2.c() + random.nextDouble() * (double)0.1f;
                    iu2.a(lz.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (blg.ab.c((bnj)iu2, cmz2.j())) {
                for (n2 = 0; n2 < 2; ++n2) {
                    d4 = (double)cmz2.a() + random.nextDouble();
                    d3 = (double)cmz2.b() + random.nextDouble();
                    d2 = (double)(cmz2.c() + 1) - random.nextDouble() * (double)0.1f;
                    iu2.a(lz.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (!blg.ab.c((bnj)iu2, cmz2.g())) break block12;
            for (n2 = 0; n2 < 2; ++n2) {
                d4 = (double)cmz2.a() + random.nextDouble();
                d3 = (double)(cmz2.b() + 1) - random.nextDouble() * (double)0.1f;
                d2 = (double)cmz2.c() + random.nextDouble();
                iu2.a(lz.m, d4, d3, d2, 0.0, 0.0, 0.0, new int[0]);
            }
        }
    }

    @Override
    public bif a(dbk dbk2) {
        return bif.f;
    }

    @Override
    public kj b() {
        return kj.c;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b, c, d, e, f);
    }
}

