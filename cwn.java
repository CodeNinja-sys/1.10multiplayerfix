/*
 * Decompiled with CFR 0.150.
 */
public class cwn
extends bkk {
    public cwn(bfa bfa2) {
        super(bfa2, false);
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        auu auu2 = this.a(iu2, bdl2, true);
        if (auu2 == null) {
            return new wx(cey.b, bhl2);
        }
        if (auu2.a == bmw.b) {
            cmz cmz2 = auu2.a();
            if (!iu2.a(bdl2, cmz2) || !bdl2.a(cmz2.c(auu2.b), auu2.b, bhl2)) {
                return new wx(cey.c, bhl2);
            }
            cmz cmz3 = cmz2.g();
            dbk dbk2 = iu2.n(cmz2);
            if (dbk2.a() == ahk.h && (Integer)dbk2.b(en.a) == 0 && iu2.c(cmz3)) {
                iu2.a(cmz3, blg.bx.s(), 11);
                if (!bdl2.G.d) {
                    --bhl2.b;
                }
                bdl2.a(bpv.b(this));
                iu2.a(bdl2, cmz2, dah.gL, csg.e, 1.0f, 1.0f);
                return new wx(cey.a, bhl2);
            }
        }
        return new wx(cey.c, bhl2);
    }
}

