/*
 * Decompiled with CFR 0.150.
 */
public class ly
extends kh {
    private final dfp a = bxy.B().ac();

    public void a(csv csv2, double d2, double d3, double d4, float f2, int n2) {
        cmz cmz2 = csv2.y();
        dbk dbk2 = csv2.f();
        bfa bfa2 = dbk2.t();
        if (dbk2.a() == ahk.a || csv2.a(f2) >= 1.0f) {
            return;
        }
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        this.a(dam.g);
        bjr.a();
        cja.a(bjt.l, afi.j);
        cja.l();
        cja.q();
        if (bxy.A()) {
            cja.j(7425);
        } else {
            cja.j(7424);
        }
        bix2.a(7, bxb.a);
        bix2.c((double)((float)d2 - (float)cmz2.a() + csv2.b(f2)), (double)((float)d3 - (float)cmz2.b() + csv2.c(f2)), (double)((float)d4 - (float)cmz2.c() + csv2.d(f2)));
        iu iu2 = this.a();
        if (bfa2 == blg.K && csv2.a(f2) < 0.5f) {
            dbk2 = dbk2.a(ln.b, Boolean.valueOf(true));
            this.a(cmz2, dbk2, bix2, iu2, true);
        } else if (csv2.k() && !csv2.g()) {
            cu cu2 = bfa2 == blg.F ? cu.b : cu.a;
            dbk dbk3 = blg.K.s().a(ln.a, (Comparable)((Object)cu2)).a(ln.o, dbk2.b(ath.o));
            dbk3 = dbk3.a(ln.b, Boolean.valueOf(csv2.a(f2) >= 0.5f));
            this.a(cmz2, dbk3, bix2, iu2, true);
            bix2.c((double)((float)d2 - (float)cmz2.a()), (double)((float)d3 - (float)cmz2.b()), (double)((float)d4 - (float)cmz2.c()));
            dbk2 = dbk2.a(ath.a, Boolean.valueOf(true));
            this.a(cmz2, dbk2, bix2, iu2, true);
        } else {
            this.a(cmz2, dbk2, bix2, iu2, false);
        }
        bix2.c(0.0, 0.0, 0.0);
        bha2.b();
        bjr.b();
    }

    private boolean a(cmz cmz2, dbk dbk2, bix bix2, iu iu2, boolean bl2) {
        return this.a.b().a(iu2, this.a.a(dbk2), dbk2, cmz2, bix2, bl2);
    }
}

