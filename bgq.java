/*
 * Decompiled with CFR 0.150.
 */
public class bgq
extends azg {
    public bgq() {
        this.a(zm.e);
        this.d(1);
        this.e(25);
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
        if (bdl2.cp() && bdl2.cL() instanceof cna) {
            cna cna2 = (cna)bdl2.cL();
            if (bhl2.i() - bhl2.h() >= 7 && cna2.aP()) {
                bhl2.a(7, (bga)bdl2);
                if (bhl2.b == 0) {
                    bhl bhl3 = new bhl(hp.aY);
                    bhl3.d(bhl2.o());
                    return new wx(cey.a, bhl3);
                }
                return new wx(cey.a, bhl2);
            }
        }
        bdl2.a(bpv.b(this));
        return new wx(cey.b, bhl2);
    }
}

