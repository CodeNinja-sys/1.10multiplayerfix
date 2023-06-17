/*
 * Decompiled with CFR 0.150.
 */
public class bic
extends azg {
    public bic() {
        this.e(64);
        this.d(1);
        this.a(zm.i);
        this.a(new bpx("cast"), new bzi(this));
    }

    @Override
    public boolean aD_() {
        return true;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (bdl2.M != null) {
            int n2 = bdl2.M.n();
            bhl2.a(n2, (bga)bdl2);
            bdl2.a(bqp2);
        } else {
            iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.H, csg.g, 0.5f, 0.4f / (j.nextFloat() * 0.4f + 0.8f));
            if (!iu2.C) {
                iu2.b(new cvo(iu2, bdl2));
            }
            bdl2.a(bqp2);
            bdl2.a(bpv.b(this));
        }
        return new wx(cey.a, bhl2);
    }

    @Override
    public boolean c_(bhl bhl2) {
        return super.c_(bhl2);
    }

    @Override
    public int d() {
        return 1;
    }
}

