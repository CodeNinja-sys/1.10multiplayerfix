/*
 * Decompiled with CFR 0.150.
 */
public class cqc
extends dad {
    public final byv a;

    public cqc(bkl bkl2, byv byv2, dfm ... arrdfm) {
        super(bkl2, mo.b, arrdfm);
        this.a = byv2;
        if (byv2 == byv.c) {
            this.c = mo.c;
        }
    }

    @Override
    public int a(int n2) {
        return this.a.b() + (n2 - 1) * this.a.c();
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + this.a.c();
    }

    @Override
    public int a() {
        return 4;
    }

    @Override
    public int a(int n2, ahy ahy2) {
        if (ahy2.i()) {
            return 0;
        }
        if (this.a == byv.a) {
            return n2;
        }
        if (this.a == byv.b && ahy2.o()) {
            return n2 * 2;
        }
        if (this.a == byv.c && ahy2 == ahy.j) {
            return n2 * 3;
        }
        if (this.a == byv.d && ahy2.e()) {
            return n2 * 2;
        }
        if (this.a == byv.e && ahy2.c()) {
            return n2 * 2;
        }
        return 0;
    }

    @Override
    public String c() {
        return "enchantment.protect." + this.a.a();
    }

    @Override
    public boolean a(dad dad2) {
        if (dad2 instanceof cqc) {
            cqc cqc2 = (cqc)dad2;
            if (this.a == cqc2.a) {
                return false;
            }
            return this.a == byv.c || cqc2.a == byv.c;
        }
        return super.a(dad2);
    }

    public static int a(bga bga2, int n2) {
        int n3 = acz.a(bbh.b, bga2);
        if (n3 > 0) {
            n2 -= cmk.d((float)n2 * ((float)n3 * 0.15f));
        }
        return n2;
    }

    public static double a(bga bga2, double d2) {
        int n2 = acz.a(bbh.d, bga2);
        if (n2 > 0) {
            d2 -= (double)cmk.c(d2 * (double)((float)n2 * 0.15f));
        }
        return d2;
    }
}

