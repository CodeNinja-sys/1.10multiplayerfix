/*
 * Decompiled with CFR 0.150.
 */
public class bqt
implements ds {
    private int a;
    private double b;
    private double c;
    private double d;
    private byte e;
    private byte f;
    private boolean g;

    public bqt() {
    }

    public bqt(cpk cpk2) {
        this.a = cpk2.bW();
        this.b = cpk2.aU;
        this.c = cpk2.aV;
        this.d = cpk2.aW;
        this.e = (byte)(cpk2.ba * 256.0f / 360.0f);
        this.f = (byte)(cpk2.bb * 256.0f / 360.0f);
        this.g = cpk2.be;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.P();
        this.c = si2.P();
        this.d = si2.P();
        this.e = si2.E();
        this.f = si2.E();
        this.g = si2.D();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
        si2.a(this.c);
        si2.a(this.d);
        si2.B(this.e);
        si2.B(this.f);
        si2.a(this.g);
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

    public byte e() {
        return this.e;
    }

    public byte f() {
        return this.f;
    }

    public boolean g() {
        return this.g;
    }
}

