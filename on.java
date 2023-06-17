/*
 * Decompiled with CFR 0.150.
 */
public class on {
    private final xy a;
    private float b;
    private float c;
    private boolean d;
    private double e;
    private double f;
    private double g;

    public on(xy xy2) {
        this.a = xy2;
    }

    public void a(cpk cpk2, float f2, float f3) {
        this.e = cpk2.aU;
        this.f = cpk2 instanceof bga ? cpk2.aV + (double)cpk2.A() : (cpk2.cD().b + cpk2.cD().e) / 2.0;
        this.g = cpk2.aW;
        this.b = f2;
        this.c = f3;
        this.d = true;
    }

    public void a(double d2, double d3, double d4, float f2, float f3) {
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.b = f2;
        this.c = f3;
        this.d = true;
    }

    public void a() {
        this.a.bb = 0.0f;
        if (this.d) {
            this.d = false;
            double d2 = this.e - this.a.aU;
            double d3 = this.f - (this.a.aV + (double)this.a.A());
            double d4 = this.g - this.a.aW;
            double d5 = cmk.a(d2 * d2 + d4 * d4);
            float f2 = (float)(cmk.b(d4, d2) * 57.2957763671875) - 90.0f;
            float f3 = (float)(-(cmk.b(d3, d5) * 57.2957763671875));
            this.a.bb = this.a(this.a.bb, f3, this.c);
            this.a.aj = this.a(this.a.aj, f2, this.b);
        } else {
            this.a.aj = this.a(this.a.aj, this.a.ah, 10.0f);
        }
        float f4 = cmk.g(this.a.aj - this.a.ah);
        if (!this.a.ap().m()) {
            if (f4 < -75.0f) {
                this.a.aj = this.a.ah - 75.0f;
            }
            if (f4 > 75.0f) {
                this.a.aj = this.a.ah + 75.0f;
            }
        }
    }

    private float a(float f2, float f3, float f4) {
        float f5 = cmk.g(f3 - f2);
        if (f5 > f4) {
            f5 = f4;
        }
        if (f5 < -f4) {
            f5 = -f4;
        }
        return f2 + f5;
    }

    public boolean b() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    public double d() {
        return this.f;
    }

    public double e() {
        return this.g;
    }
}

