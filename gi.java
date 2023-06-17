/*
 * Decompiled with CFR 0.150.
 */
public class gi
implements ds {
    private int a;
    private int b;
    private int c;
    private int d;

    public gi() {
    }

    public gi(cpk cpk2) {
        this(cpk2.bW(), cpk2.aX, cpk2.aY, cpk2.aZ);
    }

    public gi(int n2, double d2, double d3, double d4) {
        this.a = n2;
        double d5 = 3.9;
        if (d2 < -3.9) {
            d2 = -3.9;
        }
        if (d3 < -3.9) {
            d3 = -3.9;
        }
        if (d4 < -3.9) {
            d4 = -3.9;
        }
        if (d2 > 3.9) {
            d2 = 3.9;
        }
        if (d3 > 3.9) {
            d3 = 3.9;
        }
        if (d4 > 3.9) {
            d4 = 3.9;
        }
        this.b = (int)(d2 * 8000.0);
        this.c = (int)(d3 * 8000.0);
        this.d = (int)(d4 * 8000.0);
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.G();
        this.c = si2.G();
        this.d = si2.G();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.C(this.b);
        si2.C(this.c);
        si2.C(this.d);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}

