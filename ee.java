/*
 * Decompiled with CFR 0.150.
 */
public class ee {
    private final Object[][] a = new Object[][]{{blg.R, new bhl(hp.m, 9)}, {blg.S, new bhl(hp.l, 9)}, {blg.ah, new bhl(hp.k, 9)}, {blg.bT, new bhl(hp.bY, 9)}, {blg.y, new bhl(hp.bd, 9, dck.l.c())}, {blg.cn, new bhl(hp.aE, 9)}, {blg.cA, new bhl(hp.j, 9, 0)}, {blg.cx, new bhl(hp.Q, 9)}, {blg.cE, new bhl(hp.aT, 9)}};

    public void a(gx gx2) {
        for (Object[] arrobject : this.a) {
            bfa bfa2 = (bfa)arrobject[0];
            bhl bhl2 = (bhl)arrobject[1];
            gx2.a(new bhl(bfa2), "###", "###", "###", Character.valueOf('#'), bhl2);
            gx2.a(bhl2, "#", Character.valueOf('#'), bfa2);
        }
        gx2.a(new bhl(hp.m), "###", "###", "###", Character.valueOf('#'), hp.bE);
        gx2.a(new bhl(hp.bE, 9), "#", Character.valueOf('#'), hp.m);
    }
}

