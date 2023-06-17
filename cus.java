/*
 * Decompiled with CFR 0.150.
 */
public class cus
implements ds {
    private int a;
    private double b;
    private double c;
    private double d;
    private int e;

    public cus() {
    }

    public cus(cpk cpk2) {
        this.a = cpk2.bW();
        this.b = cpk2.aU;
        this.c = cpk2.aV;
        this.d = cpk2.aW;
        if (cpk2 instanceof tz) {
            this.e = 1;
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.e = si2.E();
        this.b = si2.P();
        this.c = si2.P();
        this.d = si2.P();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.B(this.e);
        si2.a(this.b);
        si2.a(this.c);
        si2.a(this.d);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public double d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }
}

