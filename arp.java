/*
 * Decompiled with CFR 0.150.
 */
public class arp
extends bcf {
    private static final bpx a = new bpx("textures/entity/creeper/creeper.png");

    public arp(bid bid2) {
        super(bid2, new bkv(), 0.5f);
        this.a(new ki(this));
    }

    protected void a(ddh ddh2, float f2) {
        float f3 = ddh2.d(f2);
        float f4 = 1.0f + cmk.a(f3 * 100.0f) * f3 * 0.01f;
        f3 = cmk.a(f3, 0.0f, 1.0f);
        f3 *= f3;
        f3 *= f3;
        float f5 = (1.0f + f3 * 0.4f) * f4;
        float f6 = (1.0f + f3 * 0.1f) / f4;
        cja.b(f5, f6, f5);
    }

    protected int a(ddh ddh2, float f2, float f3) {
        float f4 = ddh2.d(f3);
        if ((int)(f4 * 10.0f) % 2 == 0) {
            return 0;
        }
        int n2 = (int)(f4 * 0.2f * 255.0f);
        n2 = cmk.a(n2, 0, 255);
        return n2 << 24 | 0x30FFFFFF;
    }

    protected bpx a(ddh ddh2) {
        return a;
    }
}

