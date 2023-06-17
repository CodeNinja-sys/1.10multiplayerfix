/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class ckd
extends chw {
    public ckd(iu iu2) {
        super(iu2);
        this.a_(0.3125f, 0.3125f);
    }

    public ckd(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(iu2, d2, d3, d4, d5, d6, d7);
        this.a_(0.3125f, 0.3125f);
    }

    public ckd(iu iu2, bga bga2, double d2, double d3, double d4) {
        super(iu2, bga2, d2, d3, d4);
        this.a_(0.3125f, 0.3125f);
    }

    public static void a(cgy cgy2) {
        chw.a(cgy2, "DragonFireball");
    }

    @Override
    protected void a(auu auu2) {
        if (!this.aQ.C) {
            List list = this.aQ.a(bga.class, this.cD().b(4.0, 2.0, 4.0));
            gw gw2 = new gw(this.aQ, this.aU, this.aV, this.aW);
            gw2.a(this.a);
            gw2.a(lz.Q);
            gw2.c(3.0f);
            gw2.f(2400);
            gw2.e((7.0f - gw2.f()) / (float)gw2.q());
            gw2.a(new cko(ake.g, 1, 1));
            if (!list.isEmpty()) {
                for (bga bga2 : list) {
                    double d2 = this.l(bga2);
                    if (!(d2 < 16.0)) continue;
                    gw2.d(bga2.aU, bga2.aV, bga2.aW);
                    break;
                }
            }
            this.aQ.b(2006, new cmz(this.aU, this.aV, this.aW), 0);
            this.aQ.b(gw2);
            this.ak_();
        }
    }

    @Override
    public boolean bc_() {
        return false;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        return false;
    }

    @Override
    protected lz p() {
        return lz.Q;
    }

    @Override
    protected boolean n() {
        return false;
    }
}

