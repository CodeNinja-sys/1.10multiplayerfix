/*
 * Decompiled with CFR 0.150.
 */
public class azd
extends azg {
    public azd() {
        this.k = 1;
        this.e(384);
        this.a(zm.j);
        this.a(new bpx("pull"), new we(this));
        this.a(new bpx("pulling"), new asy(this));
    }

    private bhl a(bdl bdl2) {
        if (this.h(bdl2.c(bqp.b))) {
            return bdl2.c(bqp.b);
        }
        if (this.h(bdl2.c(bqp.a))) {
            return bdl2.c(bqp.a);
        }
        for (int i2 = 0; i2 < bdl2.n.aI_(); ++i2) {
            bhl bhl2 = bdl2.n.a(i2);
            if (!this.h(bhl2)) continue;
            return bhl2;
        }
        return null;
    }

    protected boolean h(bhl bhl2) {
        return bhl2 != null && bhl2.a() instanceof dar;
    }

    @Override
    public void a(bhl bhl2, iu iu2, bga bga2, int n2) {
        boolean bl2;
        int n3;
        float f2;
        if (!(bga2 instanceof bdl)) {
            return;
        }
        bdl bdl2 = (bdl)bga2;
        boolean bl3 = bdl2.G.d || acz.a(bbh.x, bhl2) > 0;
        bhl bhl3 = this.a(bdl2);
        if (bhl3 == null && !bl3) {
            return;
        }
        if (bhl3 == null) {
            bhl3 = new bhl(hp.g);
        }
        if ((double)(f2 = azd.b(n3 = this.e_(bhl2) - n2)) < 0.1) {
            return;
        }
        boolean bl4 = bl2 = bl3 && bhl3.a() == hp.g;
        if (!iu2.C) {
            int n4;
            int n5;
            dar dar2 = (dar)(bhl3.a() instanceof dar ? bhl3.a() : hp.g);
            cwt cwt2 = dar2.a(iu2, bhl3, (bga)bdl2);
            cwt2.a(bdl2, bdl2.bb, bdl2.ba, 0.0f, f2 * 3.0f, 1.0f);
            if (f2 == 1.0f) {
                cwt2.d(true);
            }
            if ((n5 = acz.a(bbh.u, bhl2)) > 0) {
                cwt2.b(cwt2.w() + (double)n5 * 0.5 + 0.5);
            }
            if ((n4 = acz.a(bbh.v, bhl2)) > 0) {
                cwt2.c(n4);
            }
            if (acz.a(bbh.w, bhl2) > 0) {
                cwt2.m(100);
            }
            bhl2.a(1, (bga)bdl2);
            if (bl2) {
                cwt2.c = cok.c;
            }
            iu2.b(cwt2);
        }
        iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.v, csg.g, 1.0f, 1.0f / (j.nextFloat() * 0.4f + 1.2f) + f2 * 0.5f);
        if (!bl2) {
            --bhl3.b;
            if (bhl3.b == 0) {
                bdl2.n.d(bhl3);
            }
        }
        bdl2.a(bpv.b(this));
    }

    public static float b(int n2) {
        float f2 = (float)n2 / 20.0f;
        if ((f2 = (f2 * f2 + f2 * 2.0f) / 3.0f) > 1.0f) {
            f2 = 1.0f;
        }
        return f2;
    }

    @Override
    public int e_(bhl bhl2) {
        return 72000;
    }

    @Override
    public cga d_(bhl bhl2) {
        return cga.e;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        boolean bl2;
        boolean bl3 = bl2 = this.a(bdl2) != null;
        if (bdl2.G.d || bl2) {
            bdl2.b(bqp2);
            return new wx(cey.a, bhl2);
        }
        if (!bl2) {
            return new wx(cey.c, bhl2);
        }
        return new wx(cey.b, bhl2);
    }

    @Override
    public int d() {
        return 1;
    }
}

