/*
 * Decompiled with CFR 0.150.
 */
final class coe
extends ckc {
    private boolean a = true;

    coe() {
    }

    @Override
    protected bhl a(bcl bcl2, bhl bhl2) {
        iu iu2 = bcl2.a();
        cmz cmz2 = bcl2.e().c((bqk)((Object)bcl2.f().b(crh.a)));
        coj coj2 = (coj)blg.aU;
        if (iu2.c(cmz2) && coj2.c(iu2, cmz2)) {
            if (!iu2.C) {
                iu2.a(cmz2, coj2.s(), 3);
            }
            --bhl2.b;
        } else {
            bhl bhl3 = uh.a(bcl2, bhl2);
            if (bhl3 == null) {
                this.a = false;
            }
        }
        return bhl2;
    }

    @Override
    protected void a(bcl bcl2) {
        if (this.a) {
            bcl2.a().b(1000, bcl2.e(), 0);
        } else {
            bcl2.a().b(1001, bcl2.e(), 0);
        }
    }
}

