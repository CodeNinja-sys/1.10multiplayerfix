/*
 * Decompiled with CFR 0.150.
 */
public class aec
extends azg {
    public aec() {
        this.d(1);
        this.a(zm.f);
    }

    @Override
    public bhl a(bhl bhl2, iu iu2, bga bga2) {
        if (bga2 instanceof bdl && !((bdl)bga2).G.d) {
            --bhl2.b;
        }
        if (!iu2.C) {
            bga2.be();
        }
        if (bga2 instanceof bdl) {
            ((bdl)bga2).a(bpv.b(this));
        }
        if (bhl2.b <= 0) {
            return new bhl(hp.ay);
        }
        return bhl2;
    }

    @Override
    public int e_(bhl bhl2) {
        return 32;
    }

    @Override
    public cga d_(bhl bhl2) {
        return cga.c;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        bdl2.b(bqp2);
        return new wx(cey.a, bhl2);
    }
}

