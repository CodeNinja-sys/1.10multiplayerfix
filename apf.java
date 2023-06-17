/*
 * Decompiled with CFR 0.150.
 */
public class apf
implements ds {
    private cmz a;
    private bqk b;
    private bqp c;
    private float d;
    private float e;
    private float f;

    public apf() {
    }

    public apf(cmz cmz2, bqk bqk2, bqp bqp2, float f2, float f3, float f4) {
        this.a = cmz2;
        this.b = bqk2;
        this.c = bqp2;
        this.d = f2;
        this.e = f3;
        this.f = f4;
    }

    @Override
    public void a(si si2) {
        this.a = si2.c();
        this.b = (bqk)si2.a(bqk.class);
        this.c = (bqp)si2.a(bqp.class);
        this.d = (float)si2.F() / 16.0f;
        this.e = (float)si2.F() / 16.0f;
        this.f = (float)si2.F() / 16.0f;
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
        si2.a(this.c);
        si2.B((int)(this.d * 16.0f));
        si2.B((int)(this.e * 16.0f));
        si2.B((int)(this.f * 16.0f));
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public cmz a() {
        return this.a;
    }

    public bqk b() {
        return this.b;
    }

    public bqp c() {
        return this.c;
    }

    public float d() {
        return this.d;
    }

    public float e() {
        return this.e;
    }

    public float f() {
        return this.f;
    }
}

