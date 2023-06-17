/*
 * Decompiled with CFR 0.150.
 */
final class byg
extends ckc {
    private boolean a = true;

    byg() {
    }

    @Override
    protected bhl a(bcl bcl2, bhl bhl2) {
        cmz cmz2;
        iu iu2 = bcl2.a();
        if (iu2.c(cmz2 = bcl2.e().c((bqk)((Object)bcl2.f().b(crh.a))))) {
            iu2.a(cmz2, blg.ab.s());
            if (bhl2.a(1, iu2.p)) {
                bhl2.b = 0;
            }
        } else if (iu2.n(cmz2).t() == blg.W) {
            blg.W.a_(iu2, cmz2, blg.W.s().a(rp.a, Boolean.valueOf(true)));
            iu2.f(cmz2);
        } else {
            this.a = false;
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

