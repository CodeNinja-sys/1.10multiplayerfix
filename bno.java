/*
 * Decompiled with CFR 0.150.
 */
public class bno
extends cwt {
    private int f = 200;

    public bno(iu iu2) {
        super(iu2);
    }

    public bno(iu iu2, bga bga2) {
        super(iu2, bga2);
    }

    public bno(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    @Override
    public void bb_() {
        super.bb_();
        if (this.aQ.C && !this.a) {
            this.aQ.a(lz.o, this.aU, this.aV, this.aW, 0.0, 0.0, 0.0, new int[0]);
        }
    }

    @Override
    protected bhl p() {
        return new bhl(hp.h);
    }

    @Override
    protected void b(bga bga2) {
        super.b(bga2);
        cko cko2 = new cko(ake.x, this.f, 0);
        bga2.b(cko2);
    }

    public static void a(cgy cgy2) {
        cwt.a(cgy2, "SpectralArrow");
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.e("Duration")) {
            this.f = bvp2.h("Duration");
        }
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Duration", this.f);
    }
}

