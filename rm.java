/*
 * Decompiled with CFR 0.150.
 */
public class rm
extends buc {
    public rm(bid bid2) {
        super(bid2);
        this.h = 0.5f;
    }

    public void a(azb azb2, double d2, double d3, double d4, float f2, float f3) {
        if (azb2.r() == null) {
            return;
        }
        dbk dbk2 = azb2.r();
        if (dbk2.i() != cpb.d) {
            return;
        }
        iu iu2 = azb2.p();
        if (dbk2 == iu2.n(new cmz(azb2)) || dbk2.i() == cpb.a) {
            return;
        }
        this.a(dam.g);
        cja.D();
        cja.f();
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        if (this.j) {
            cja.g();
            cja.e(this.d(azb2));
        }
        bix2.a(7, bxb.a);
        cmz cmz2 = new cmz(azb2.aU, azb2.cD().e, azb2.aW);
        cja.c((float)(d2 - (double)cmz2.a() - 0.5), (float)(d3 - (double)cmz2.b()), (float)(d4 - (double)cmz2.c() - 0.5));
        dfp dfp2 = bxy.B().ac();
        dfp2.b().a(iu2, dfp2.a(dbk2), dbk2, cmz2, bix2, false, cmk.a(azb2.n()));
        bha2.b();
        if (this.j) {
            cja.m();
            cja.h();
        }
        cja.e();
        cja.E();
        super.a((cpk)azb2, d2, d3, d4, f2, f3);
    }

    protected bpx a(azb azb2) {
        return dam.g;
    }
}

