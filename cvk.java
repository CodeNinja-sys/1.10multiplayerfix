/*
 * Decompiled with CFR 0.150.
 */
public class cvk
extends azg {
    private final bfa a;

    public cvk(bfa bfa2) {
        this.k = 1;
        this.a = bfa2;
        this.a(zm.f);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        boolean bl2 = this.a == blg.a;
        auu auu2 = this.a(iu2, bdl2, bl2);
        if (auu2 == null) {
            return new wx(cey.b, bhl2);
        }
        if (auu2.a == bmw.b) {
            cmz cmz2;
            cmz cmz3 = auu2.a();
            if (!iu2.a(bdl2, cmz3)) {
                return new wx(cey.c, bhl2);
            }
            if (bl2) {
                if (!bdl2.a(cmz3.c(auu2.b), auu2.b, bhl2)) {
                    return new wx(cey.c, bhl2);
                }
                dbk dbk2 = iu2.n(cmz3);
                ahk ahk2 = dbk2.a();
                if (ahk2 == ahk.h && (Integer)dbk2.b(en.a) == 0) {
                    iu2.a(cmz3, blg.a.s(), 11);
                    bdl2.a(bpv.b(this));
                    bdl2.a(dah.N, 1.0f, 1.0f);
                    return new wx(cey.a, this.a(bhl2, bdl2, hp.az));
                }
                if (ahk2 == ahk.i && (Integer)dbk2.b(en.a) == 0) {
                    bdl2.a(dah.O, 1.0f, 1.0f);
                    iu2.a(cmz3, blg.a.s(), 11);
                    bdl2.a(bpv.b(this));
                    return new wx(cey.a, this.a(bhl2, bdl2, hp.aA));
                }
                return new wx(cey.c, bhl2);
            }
            boolean bl3 = iu2.n(cmz3).t().a_((bnj)iu2, cmz3);
            cmz cmz4 = cmz2 = bl3 && auu2.b == bqk.b ? cmz3 : cmz3.c(auu2.b);
            if (!bdl2.a(cmz2, auu2.b, bhl2)) {
                return new wx(cey.c, bhl2);
            }
            if (this.a(bdl2, iu2, cmz2)) {
                bdl2.a(bpv.b(this));
                if (!bdl2.G.d) {
                    return new wx(cey.a, new bhl(hp.ay));
                }
                return new wx(cey.a, bhl2);
            }
            return new wx(cey.c, bhl2);
        }
        return new wx(cey.b, bhl2);
    }

    private bhl a(bhl bhl2, bdl bdl2, azg azg2) {
        if (bdl2.G.d) {
            return bhl2;
        }
        if (--bhl2.b <= 0) {
            return new bhl(azg2);
        }
        if (!bdl2.n.c(new bhl(azg2))) {
            bdl2.a(new bhl(azg2), false);
        }
        return bhl2;
    }

    public boolean a(bdl bdl2, iu iu2, cmz cmz2) {
        if (this.a == blg.a) {
            return false;
        }
        dbk dbk2 = iu2.n(cmz2);
        ahk ahk2 = dbk2.a();
        boolean bl2 = !ahk2.a();
        boolean bl3 = dbk2.t().a_((bnj)iu2, cmz2);
        if (iu2.c(cmz2) || bl2 || bl3) {
            if (iu2.q.m() && this.a == blg.i) {
                int n2 = cmz2.a();
                int n3 = cmz2.b();
                int n4 = cmz2.c();
                iu2.a(bdl2, cmz2, dah.bx, csg.e, 0.5f, 2.6f + (iu2.p.nextFloat() - iu2.p.nextFloat()) * 0.8f);
                for (int i2 = 0; i2 < 8; ++i2) {
                    iu2.a(lz.m, (double)n2 + Math.random(), (double)n3 + Math.random(), (double)n4 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
                }
            } else {
                if (!iu2.C && (bl2 || bl3) && !ahk2.d()) {
                    iu2.b(cmz2, true);
                }
                bi bi2 = this.a == blg.k ? dah.M : dah.L;
                iu2.a(bdl2, cmz2, bi2, csg.e, 1.0f, 1.0f);
                iu2.a(cmz2, this.a.s(), 11);
            }
            return true;
        }
        return false;
    }
}

