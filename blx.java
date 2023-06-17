/*
 * Decompiled with CFR 0.150.
 */
public class blx
extends cof {
    public blx(iu iu2) {
        super(iu2);
        this.a_(0.9f, 1.4f);
        this.v = blg.bw;
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "MushroomCow");
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null && bhl2.a() == hp.B && this.aL() >= 0 && !bdl2.G.d) {
            if (--bhl2.b == 0) {
                bdl2.a(bqp2, new bhl(hp.C));
            } else if (!bdl2.n.c(new bhl(hp.C))) {
                bdl2.a(new bhl(hp.C), false);
            }
            return true;
        }
        if (bhl2 != null && bhl2.a() == hp.bl && this.aL() >= 0) {
            this.ak_();
            this.aQ.a(lz.b, this.aU, this.aV + (double)(this.bm / 2.0f), this.aW, 0.0, 0.0, 0.0, new int[0]);
            if (!this.aQ.C) {
                cof cof2 = new cof(this.aQ);
                cof2.a_(this.aU, this.aV, this.aW, this.ba, this.bb);
                cof2.k(this.bh());
                cof2.ah = this.ah;
                if (this.j_()) {
                    cof2.g(this.cA());
                }
                this.aQ.b(cof2);
                for (int i2 = 0; i2 < 5; ++i2) {
                    this.aQ.b(new er(this.aQ, this.aU, this.aV + (double)this.bm, this.aW, new bhl(blg.Q)));
                }
                bhl2.a(1, (bga)bdl2);
                this.a(dah.dC, 1.0f, 1.0f);
            }
            return true;
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    public blx a(alf alf2) {
        return new blx(this.aQ);
    }

    @Override
    protected bpx u() {
        return bvm.J;
    }

    @Override
    public /* synthetic */ cof c(alf alf2) {
        return this.a(alf2);
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.a(alf2);
    }
}

