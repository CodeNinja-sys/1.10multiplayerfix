/*
 * Decompiled with CFR 0.150.
 */
public class bgp {
    private final ct a;
    private final float b;

    public bgp(ct ct2, long l2, long l3, float f2) {
        this.a = ct2;
        this.b = this.a(ct2, l2, l3, f2);
    }

    public float a() {
        return this.b;
    }

    public boolean b() {
        return this.b >= (float)ct.d.ordinal();
    }

    public float c() {
        if (this.b < 2.0f) {
            return 0.0f;
        }
        if (this.b > 4.0f) {
            return 1.0f;
        }
        return (this.b - 2.0f) / 2.0f;
    }

    private float a(ct ct2, long l2, long l3, float f2) {
        if (ct2 == ct.a) {
            return 0.0f;
        }
        boolean bl2 = ct2 == ct.d;
        float f3 = 0.75f;
        float f4 = cmk.a(((float)l2 + -72000.0f) / 1440000.0f, 0.0f, 1.0f) * 0.25f;
        f3 += f4;
        float f5 = 0.0f;
        f5 += cmk.a((float)l3 / 3600000.0f, 0.0f, 1.0f) * (bl2 ? 1.0f : 0.75f);
        f5 += cmk.a(f2 * 0.25f, 0.0f, f4);
        if (ct2 == ct.b) {
            f5 *= 0.5f;
        }
        return (float)ct2.a() * (f3 += f5);
    }
}

