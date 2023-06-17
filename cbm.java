/*
 * Decompiled with CFR 0.150.
 */
public class cbm
extends bcf {
    private static final bpx a = new bpx("textures/entity/iron_golem.png");

    public cbm(bid bid2) {
        super(bid2, new bba(), 0.5f);
        this.a(new bbd(this));
    }

    protected bpx a(hx hx2) {
        return a;
    }

    protected void a(hx hx2, float f2, float f3, float f4) {
        super.a((bga)hx2, f2, f3, f4);
        if ((double)hx2.aa < 0.01) {
            return;
        }
        float f5 = 13.0f;
        float f6 = hx2.ab - hx2.aa * (1.0f - f4) + 6.0f;
        float f7 = (Math.abs(f6 % 13.0f - 6.5f) - 3.25f) / 3.25f;
        cja.b(6.5f * f7, 0.0f, 0.0f, 1.0f);
    }
}

