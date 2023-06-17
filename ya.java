/*
 * Decompiled with CFR 0.150.
 */
public class ya
extends azg {
    public ya() {
        this.k = 1;
        this.a(zm.e);
    }

    @Override
    public boolean a(bhl bhl2, bdl bdl2, bga bga2, bqp bqp2) {
        if (bga2 instanceof cna) {
            cna cna2 = (cna)bga2;
            if (!cna2.T() && !cna2.R_()) {
                cna2.d(true);
                cna2.aQ.a(bdl2, cna2.aU, cna2.aV, cna2.aW, dah.dY, csg.g, 0.5f, 1.0f);
                --bhl2.b;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(bhl bhl2, bga bga2, bga bga3) {
        this.a(bhl2, null, bga2, bqp.a);
        return true;
    }
}

