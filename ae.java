/*
 * Decompiled with CFR 0.150.
 */
public class ae
implements apx {
    private final bxy a;
    private bdl b;
    private double c;
    private double d;
    private double e;

    public ae(bxy bxy2) {
        this.a = bxy2;
    }

    @Override
    public void a(float f2, long l2) {
        dbk dbk2;
        this.b = this.a.h;
        this.c = this.b.br + (this.b.aU - this.b.br) * (double)f2;
        this.d = this.b.bs + (this.b.aV - this.b.bs) * (double)f2;
        this.e = this.b.bt + (this.b.aW - this.b.bt) * (double)f2;
        cmz cmz2 = this.a.h.k_();
        iu iu2 = this.a.h.aQ;
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.c(0.0f, 1.0f, 0.0f, 0.75f);
        cja.w();
        cja.d(6.0f);
        Iterable iterable = bjb.a(cmz2.e(-10, -10, -10), cmz2.e(10, 10, 10));
        for (cmz cmz3 : iterable) {
            dbk2 = iu2.n(cmz3);
            if (dbk2.t() != blg.j && dbk2.t() != blg.i) continue;
            double d2 = cor.b(dbk2, iu2, cmz3);
            fr.b(new cxt((float)cmz3.a() + 0.01f, (float)cmz3.b() + 0.01f, (float)cmz3.c() + 0.01f, (float)cmz3.a() + 0.99f, d2, (float)cmz3.c() + 0.99f).c(-this.c, -this.d, -this.e), 1.0f, 1.0f, 1.0f, 0.2f);
        }
        iterable = bjb.a(cmz2.e(-10, -10, -10), cmz2.e(10, 10, 10));
        for (cmz cmz3 : iterable) {
            dbk2 = iu2.n(cmz3);
            if (dbk2.t() != blg.j && dbk2.t() != blg.i) continue;
            Integer n2 = (Integer)dbk2.b(en.a);
            double d3 = n2 > 7 ? 0.9 : 1.0 - 0.11 * (double)n2.intValue();
            String string = dbk2.t() == blg.i ? "f" : "s";
            bqw.a(string + " " + n2, (double)cmz3.a() + 0.5, (double)cmz3.b() + d3, (double)cmz3.c() + 0.5, f2, -16777216);
        }
        cja.v();
        cja.k();
    }
}

