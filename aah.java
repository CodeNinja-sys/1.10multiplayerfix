/*
 * Decompiled with CFR 0.150.
 */
public class aah
extends acm {
    public aah(iu iu2) {
        super(iu2);
        this.a_(this.bl * 6.0f, this.bm * 6.0f);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Giant");
    }

    @Override
    public float A() {
        return 10.440001f;
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(100.0);
        this.a(cgz.d).a(0.5);
        this.a(cgz.e).a(50.0);
    }

    @Override
    public float a(cmz cmz2) {
        return this.aQ.m(cmz2) - 0.5f;
    }

    @Override
    protected bpx u() {
        return bvm.t;
    }
}

