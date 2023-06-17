/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class btt
extends ar {
    public static final yc a = ajj.o;
    public static final ddi b = ddi.b("conditional");

    public btt(bif bif2) {
        super(ahk.f, bif2);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, Boolean.valueOf(false)));
    }

    @Override
    public bql a(iu iu2, int n2) {
        jf jf2 = new jf();
        jf2.b(this == blg.dd);
        return jf2;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        if (iu2.C) {
            return;
        }
        bql bql2 = iu2.q(cmz2);
        if (!(bql2 instanceof jf)) {
            return;
        }
        jf jf2 = (jf)bql2;
        boolean bl2 = iu2.x(cmz2);
        boolean bl3 = jf2.g();
        boolean bl4 = jf2.h();
        if (bl2 && !bl3) {
            jf2.a(true);
            if (jf2.k() != cjt.a && !bl4) {
                boolean bl5 = !jf2.l() || this.e(iu2, cmz2, dbk2);
                jf2.c(bl5);
                iu2.a(cmz2, (bfa)this, this.a(iu2));
                if (bl5) {
                    this.c(iu2, cmz2);
                }
            }
        } else if (!bl2 && bl3) {
            jf2.a(false);
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C) {
            return;
        }
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof jf) {
            jf jf2 = (jf)bql2;
            cxh cxh2 = jf2.d();
            boolean bl2 = !aco.b(cxh2.l());
            cjt cjt2 = jf2.k();
            boolean bl3 = !jf2.l() || this.e(iu2, cmz2, dbk2);
            boolean bl4 = jf2.i();
            boolean bl5 = false;
            if (cjt2 != cjt.a && bl4 && bl2) {
                cxh2.a(iu2);
                bl5 = true;
            }
            if (jf2.g() || jf2.h()) {
                if (cjt2 == cjt.a && bl3 && bl2) {
                    cxh2.a(iu2);
                    bl5 = true;
                }
                if (cjt2 == cjt.b) {
                    iu2.a(cmz2, (bfa)this, this.a(iu2));
                    if (bl3) {
                        this.c(iu2, cmz2);
                    }
                }
            }
            if (!bl5) {
                cxh2.a(0);
            }
            jf2.c(bl3);
            iu2.f(cmz2, this);
        }
    }

    public boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        bql bql2 = iu2.q(cmz2.c(bqk2.e()));
        return bql2 instanceof jf && ((jf)bql2).d().j() > 0;
    }

    @Override
    public int a(iu iu2) {
        return 1;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof jf && bdl2.aU()) {
            bdl2.a((jf)bql2);
            return true;
        }
        return false;
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        bql bql2 = iu2.q(cmz2);
        if (bql2 instanceof jf) {
            return ((jf)bql2).d().j();
        }
        return 0;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, bga bga2, bhl bhl2) {
        bql bql2 = iu2.q(cmz2);
        if (!(bql2 instanceof jf)) {
            return;
        }
        jf jf2 = (jf)bql2;
        cxh cxh2 = jf2.d();
        if (bhl2.s()) {
            cxh2.b(bhl2.q());
        }
        if (!iu2.C) {
            bvp bvp2 = bhl2.o();
            if (bvp2 == null || !bvp2.b("BlockEntityTag", 10)) {
                cxh2.a(iu2.F().b("sendCommandFeedback"));
                jf2.b(this == blg.dd);
            }
            if (jf2.k() == cjt.a) {
                boolean bl2 = iu2.x(cmz2);
                jf2.a(bl2);
            }
        }
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public cpb g(dbk dbk2) {
        return cpb.d;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)bqk.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) != 0));
    }

    @Override
    public int e(dbk dbk2) {
        return ((bqk)((Object)dbk2.b(a))).b() | ((Boolean)dbk2.b(b) != false ? 8 : 0);
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(a))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(a, (Comparable)((Object)ath.a(cmz2, bga2))).a(b, Boolean.valueOf(false));
    }

    public void c(iu iu2, cmz cmz2) {
        dbk dbk2;
        bfa bfa2;
        jf jf2;
        dbk dbk3 = iu2.n(cmz2);
        if (dbk3.t() != blg.bX && dbk3.t() != blg.dc) {
            return;
        }
        pj pj2 = new pj(cmz2);
        pj2.a((bqk)((Object)dbk3.b(a)));
        bql bql2 = iu2.q(pj2);
        while (bql2 instanceof jf && (jf2 = (jf)bql2).k() == cjt.a && (bfa2 = (dbk2 = iu2.n(pj2)).t()) == blg.dd && !iu2.e((cmz)pj2, bfa2)) {
            iu2.a(new cmz(pj2), bfa2, this.a(iu2));
            pj2.a((bqk)((Object)dbk2.b(a)));
            bql2 = iu2.q(pj2);
        }
    }
}

