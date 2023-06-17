/*
 * Decompiled with CFR 0.150.
 */
public class bad
extends bcf {
    private static final bpx a = new bpx("textures/entity/wolf/wolf.png");
    private static final bpx b = new bpx("textures/entity/wolf/wolf_tame.png");
    private static final bpx k = new bpx("textures/entity/wolf/wolf_angry.png");

    public bad(bid bid2, axg axg2, float f2) {
        super(bid2, axg2, f2);
        this.a(new ayw(this));
    }

    protected float a(cqw cqw2, float f2) {
        return cqw2.aP();
    }

    public void a(cqw cqw2, double d2, double d3, double d4, float f2, float f3) {
        if (cqw2.T()) {
            float f4 = cqw2.a(f3) * cqw2.d(f3);
            cja.d(f4, f4, f4);
        }
        super.a(cqw2, d2, d3, d4, f2, f3);
    }

    protected bpx a(cqw cqw2) {
        if (cqw2.B()) {
            return b;
        }
        if (cqw2.aQ()) {
            return k;
        }
        return a;
    }

    @Override
    protected /* synthetic */ float e(bga bga2, float f2) {
        return this.a((cqw)bga2, f2);
    }
}

