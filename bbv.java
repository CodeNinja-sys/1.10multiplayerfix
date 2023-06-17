/*
 * Decompiled with CFR 0.150.
 */
public class bbv
implements ds {
    private int a;
    private double b;
    private double c;
    private double d;
    private int e;

    public bbv() {
    }

    public bbv(cvs cvs2) {
        this.a = cvs2.bW();
        this.b = cvs2.aU;
        this.c = cvs2.aV;
        this.d = cvs2.aW;
        this.e = cvs2.n();
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.P();
        this.c = si2.P();
        this.d = si2.P();
        this.e = si2.G();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.a(this.c);
        si2.a(this.d);
        si2.C(this.e);
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

