/*
 * Decompiled with CFR 0.150.
 */
public class bkr {
    private final cpv a = new cpv(32);

    public static bkr a(gt gt2) {
        bkr bkr2 = new bkr();
        bkr2.a((cmi)new ox(), hp.S, hp.T, hp.U, hp.V);
        bkr2.a((cmi)new uq(), hp.cO, hp.cQ);
        bkr2.a((cmi)new caj(), blg.cF);
        bkr2.a((cmi)new aud(), hp.cm);
        bkr2.a((cmi)new bag(), hp.bG, hp.bH, hp.bI);
        bkr2.a((cmi)new dep(), hp.bT);
        bkr2.a((cmi)new bal(gt2), blg.c, blg.H, blg.bn, blg.t, blg.u, blg.bx);
        bkr2.a((cmi)new bgu(), hp.i);
        return bkr2;
    }

    public int a(bhl bhl2, int n2) {
        cmi cmi2 = (cmi)this.a.a(azg.g.a(bhl2.a()));
        return cmi2 == null ? -1 : cmi2.a(bhl2, n2);
    }

    public void a(cmi cmi2, bfa ... arrbfa) {
        for (bfa bfa2 : arrbfa) {
            this.a.a(cmi2, azg.a(azg.a(bfa2)));
        }
    }

    public void a(cmi cmi2, azg ... arrazg) {
        for (azg azg2 : arrazg) {
            this.a.a(cmi2, azg.a(azg2));
        }
    }
}

