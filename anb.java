/*
 * Decompiled with CFR 0.150.
 */
public class anb
extends azg {
    public anb() {
        this.k = 1;
        this.e(432);
        this.a(zm.e);
        this.a(new bpx("broken"), new oq(this));
        crh.c.a(this, uh.b);
    }

    public static boolean g(bhl bhl2) {
        return bhl2.g() < bhl2.i() - 1;
    }

    @Override
    public boolean a(bhl bhl2, bhl bhl3) {
        return bhl3.a() == hp.aM;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        dfm dfm2 = xy.c(bhl2);
        bhl bhl3 = bdl2.a(dfm2);
        if (bhl3 == null) {
            bdl2.a(dfm2, bhl2.j());
            bhl2.b = 0;
            return new wx(cey.a, bhl2);
        }
        return new wx(cey.c, bhl2);
    }
}

