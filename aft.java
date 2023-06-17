/*
 * Decompiled with CFR 0.150.
 */
public class aft
extends bcf {
    private static final bpx a = new bpx("textures/entity/wither/wither_invulnerable.png");
    private static final bpx b = new bpx("textures/entity/wither/wither.png");

    public aft(bid bid2) {
        super(bid2, new adh(0.0f), 1.0f);
        this.a(new wj(this));
    }

    protected bpx a(dga dga2) {
        int n2 = dga2.aL();
        if (n2 <= 0 || n2 <= 80 && n2 / 5 % 2 == 1) {
            return b;
        }
        return a;
    }

    protected void a(dga dga2, float f2) {
        float f3 = 2.0f;
        int n2 = dga2.aL();
        if (n2 > 0) {
            f3 -= ((float)n2 - f2) / 220.0f * 0.5f;
        }
        cja.b(f3, f3, f3);
    }
}

