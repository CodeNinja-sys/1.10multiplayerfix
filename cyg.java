/*
 * Decompiled with CFR 0.150.
 */
public class cyg
implements ds {
    protected double a;
    protected double b;
    protected double c;
    protected float d;
    protected float e;
    protected boolean f;
    protected boolean g;
    protected boolean h;

    public cyg() {
    }

    public cyg(boolean bl2) {
        this.f = bl2;
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    @Override
    public void a(si si2) {
        this.f = si2.F() != 0;
    }

    @Override
    public void b(si si2) {
        si2.B(this.f ? 1 : 0);
    }

    public double a(double d2) {
        return this.g ? this.a : d2;
    }

    public double b(double d2) {
        return this.g ? this.b : d2;
    }

    public double c(double d2) {
        return this.g ? this.c : d2;
    }

    public float a(float f2) {
        return this.h ? this.d : f2;
    }

    public float b(float f2) {
        return this.h ? this.e : f2;
    }

    public boolean a() {
        return this.f;
    }
}

