/*
 * Decompiled with CFR 0.150.
 */
public class cje {
    private final bga a;
    private int b;
    private float c;

    public cje(bga bga2) {
        this.a = bga2;
    }

    public void a() {
        double d2 = this.a.aU - this.a.aR;
        double d3 = this.a.aW - this.a.aT;
        if (d2 * d2 + d3 * d3 > 2.500000277905201E-7) {
            this.a.ah = this.a.ba;
            this.c = this.a.aj = this.a(this.a.ah, this.a.aj, 75.0f);
            this.b = 0;
            return;
        }
        if (this.a.cH().isEmpty() || !(this.a.cH().get(0) instanceof xy)) {
            float f2 = 75.0f;
            if (Math.abs(this.a.aj - this.c) > 15.0f) {
                this.b = 0;
                this.c = this.a.aj;
            } else {
                ++this.b;
                int n2 = 10;
                if (this.b > 10) {
                    f2 = Math.max(1.0f - (float)(this.b - 10) / 10.0f, 0.0f) * 75.0f;
                }
            }
            this.a.ah = this.a(this.a.aj, this.a.ah, f2);
        }
    }

    private float a(float f2, float f3, float f4) {
        float f5 = cmk.g(f2 - f3);
        if (f5 < -f4) {
            f5 = -f4;
        }
        if (f5 >= f4) {
            f5 = f4;
        }
        return f2 - f5;
    }
}

