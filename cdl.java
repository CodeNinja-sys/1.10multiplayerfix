/*
 * Decompiled with CFR 0.150.
 */
public class cdl {
    private int a = 20;
    private float b = 5.0f;
    private float c;
    private int d;
    private int e = 20;

    public void a(int n2, float f2) {
        this.a = Math.min(n2 + this.a, 20);
        this.b = Math.min(this.b + (float)n2 * f2 * 2.0f, (float)this.a);
    }

    public void a(aeu aeu2, bhl bhl2) {
        this.a(aeu2.g(bhl2), aeu2.h(bhl2));
    }

    public void a(bdl bdl2) {
        boolean bl2;
        ct ct2 = bdl2.aQ.Q();
        this.e = this.a;
        if (this.c > 4.0f) {
            this.c -= 4.0f;
            if (this.b > 0.0f) {
                this.b = Math.max(this.b - 1.0f, 0.0f);
            } else if (ct2 != ct.a) {
                this.a = Math.max(this.a - 1, 0);
            }
        }
        if ((bl2 = bdl2.aQ.F().b("naturalRegeneration")) && this.b > 0.0f && bdl2.aF() && this.a >= 20) {
            ++this.d;
            if (this.d >= 10) {
                float f2 = Math.min(this.b, 4.0f);
                bdl2.b_(f2 / 4.0f);
                this.a(f2);
                this.d = 0;
            }
        } else if (bl2 && this.a >= 18 && bdl2.aF()) {
            ++this.d;
            if (this.d >= 80) {
                bdl2.b_(1.0f);
                this.a(4.0f);
                this.d = 0;
            }
        } else if (this.a <= 0) {
            ++this.d;
            if (this.d >= 80) {
                if (bdl2.bh() > 10.0f || ct2 == ct.d || bdl2.bh() > 1.0f && ct2 == ct.c) {
                    bdl2.a(ahy.h, 1.0f);
                }
                this.d = 0;
            }
        } else {
            this.d = 0;
        }
    }

    public void a(bvp bvp2) {
        if (bvp2.b("foodLevel", 99)) {
            this.a = bvp2.h("foodLevel");
            this.d = bvp2.h("foodTickTimer");
            this.b = bvp2.j("foodSaturationLevel");
            this.c = bvp2.j("foodExhaustionLevel");
        }
    }

    public void b(bvp bvp2) {
        bvp2.a("foodLevel", this.a);
        bvp2.a("foodTickTimer", this.d);
        bvp2.a("foodSaturationLevel", this.b);
        bvp2.a("foodExhaustionLevel", this.c);
    }

    public int a() {
        return this.a;
    }

    public boolean b() {
        return this.a < 20;
    }

    public void a(float f2) {
        this.c = Math.min(this.c + f2, 40.0f);
    }

    public float c() {
        return this.b;
    }

    public void a(int n2) {
        this.a = n2;
    }

    public void b(float f2) {
        this.b = f2;
    }
}

