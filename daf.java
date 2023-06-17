/*
 * Decompiled with CFR 0.150.
 */
public class daf
implements cct {
    private final agg a;
    private double b;
    private double c;
    private double d;

    public daf() {
        this(zr.a());
    }

    public daf(agg agg2) {
        this.a = agg2;
    }

    @Override
    public void a(double d2, double d3, double d4) {
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public boolean a(double d2, double d3, double d4, double d5, double d6, double d7) {
        return this.a.a(d2 - this.b, d3 - this.c, d4 - this.d, d5 - this.b, d6 - this.c, d7 - this.d);
    }

    @Override
    public boolean a(cxt cxt2) {
        return this.a(cxt2.a, cxt2.b, cxt2.c, cxt2.d, cxt2.e, cxt2.f);
    }
}

