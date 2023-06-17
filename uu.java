/*
 * Decompiled with CFR 0.150.
 */
public class uu
extends bcf {
    private static final bpx a = new bpx("textures/entity/bat.png");

    public uu(bid bid2) {
        super(bid2, new fv(), 0.25f);
    }

    protected bpx a(azc azc2) {
        return a;
    }

    protected void a(azc azc2, float f2) {
        cja.b(0.35f, 0.35f, 0.35f);
    }

    protected void a(azc azc2, float f2, float f3, float f4) {
        if (azc2.T()) {
            cja.c(0.0f, -0.1f, 0.0f);
        } else {
            cja.c(0.0f, cmk.b(f2 * 0.3f) * 0.1f, 0.0f);
        }
        super.a((bga)azc2, f2, f3, f4);
    }
}

