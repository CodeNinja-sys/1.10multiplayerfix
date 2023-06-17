/*
 * Decompiled with CFR 0.150.
 */
public class aws
implements apx {
    private final bxy a;

    public aws(bxy bxy2) {
        this.a = bxy2;
    }

    @Override
    public void a(float f2, long l2) {
        ob ob2 = this.a.h;
        ym ym2 = this.a.f;
        double d2 = ob2.br + (ob2.aU - ob2.br) * (double)f2;
        double d3 = ob2.bs + (ob2.aV - ob2.bs) * (double)f2;
        double d4 = ob2.bt + (ob2.aW - ob2.bt) * (double)f2;
        cja.D();
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.w();
        cmz cmz2 = new cmz(ob2.aU, 0.0, ob2.aW);
        Iterable iterable = pj.a(cmz2.e(-40, 0, -40), cmz2.e(40, 0, 40));
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(5, bxb.f);
        for (cmz cmz3 : iterable) {
            int n2;
            if (ym2.n(cmz3.e(0, n2 = ym2.b(cmz3.a(), cmz3.c()), 0).h()) == blg.a.s()) {
                fr.b(bix2, (double)((float)cmz3.a() + 0.25f) - d2, (double)n2 - d3, (double)((float)cmz3.c() + 0.25f) - d4, (double)((float)cmz3.a() + 0.75f) - d2, (double)n2 + 0.09375 - d3, (double)((float)cmz3.c() + 0.75f) - d4, 0.0f, 0.0f, 1.0f, 0.5f);
                continue;
            }
            fr.b(bix2, (double)((float)cmz3.a() + 0.25f) - d2, (double)n2 - d3, (double)((float)cmz3.c() + 0.25f) - d4, (double)((float)cmz3.a() + 0.75f) - d2, (double)n2 + 0.09375 - d3, (double)((float)cmz3.c() + 0.75f) - d4, 0.0f, 1.0f, 0.0f, 0.5f);
        }
        bha2.b();
        cja.v();
        cja.E();
    }
}

