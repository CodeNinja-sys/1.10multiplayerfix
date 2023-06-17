/*
 * Decompiled with CFR 0.150.
 */
final class aqm
extends ckc {
    private boolean a = true;

    aqm() {
    }

    @Override
    protected bhl a(bcl bcl2, bhl bhl2) {
        if (dck.a == dck.a(bhl2.h())) {
            cmz cmz2;
            iu iu2 = bcl2.a();
            if (hr.a(bhl2, iu2, cmz2 = bcl2.e().c((bqk)((Object)bcl2.f().b(crh.a))))) {
                if (!iu2.C) {
                    iu2.b(2005, cmz2, 0);
                }
            } else {
                this.a = false;
            }
            return bhl2;
        }
        return super.a(bcl2, bhl2);
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

