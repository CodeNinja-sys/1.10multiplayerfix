/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class aat
extends xi {
    private static final Set e = aad.a(blg.aL, blg.d, blg.ak, blg.c, blg.n, blg.bw, blg.m, blg.aJ, blg.aH, blg.aW, blg.da);

    public aat(avx avx2) {
        super(1.5f, -3.0f, avx2, e);
    }

    @Override
    public boolean a(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.aH) {
            return true;
        }
        return bfa2 == blg.aJ;
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        if (!bdl2.a(cmz2.c(bqk2), bqk2, bhl2)) {
            return cey.c;
        }
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        if (bqk2 == bqk.a || iu2.n(cmz2.g()).a() != ahk.a || bfa2 != blg.c) {
            return cey.b;
        }
        dbk dbk3 = blg.da.s();
        iu2.a(bdl2, cmz2, dah.fe, csg.e, 1.0f, 1.0f);
        if (!iu2.C) {
            iu2.a(cmz2, dbk3, 11);
            bhl2.a(1, (bga)bdl2);
        }
        return cey.a;
    }
}

