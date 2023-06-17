/*
 * Decompiled with CFR 0.150.
 */
public class btl
implements ds {
    private double a;
    private double b;
    private double c;
    private float d;
    private float e;

    public btl() {
    }

    public btl(cpk cpk2) {
        this.a = cpk2.aU;
        this.b = cpk2.aV;
        this.c = cpk2.aW;
        this.d = cpk2.ba;
        this.e = cpk2.bb;
    }

    @Override
    public void a(si si2) {
        this.a = si2.P();
        this.b = si2.P();
        this.c = si2.P();
        this.d = si2.O();
        this.e = si2.O();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
        si2.a(this.c);
        si2.a(this.d);
        si2.a(this.e);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public double a() {
        return this.a;
    }

    public double b() {
        return this.b;
    }

    public double c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }
}

