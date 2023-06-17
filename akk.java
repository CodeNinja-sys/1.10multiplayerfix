/*
 * Decompiled with CFR 0.150.
 */
final class akk
extends ckc {
    private final ckc a = new ckc();

    akk() {
    }

    @Override
    public bhl a(bcl bcl2, bhl bhl2) {
        azg azg2;
        iu iu2 = bcl2.a();
        cmz cmz2 = bcl2.e().c((bqk)((Object)bcl2.f().b(crh.a)));
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        ahk ahk2 = dbk2.a();
        if (ahk.h.equals(ahk2) && bfa2 instanceof en && (Integer)dbk2.b(en.a) == 0) {
            azg2 = hp.az;
        } else if (ahk.i.equals(ahk2) && bfa2 instanceof en && (Integer)dbk2.b(en.a) == 0) {
            azg2 = hp.aA;
        } else {
            return super.a(bcl2, bhl2);
        }
        iu2.f(cmz2);
        if (--bhl2.b == 0) {
            bhl2.a(azg2);
            bhl2.b = 1;
        } else if (((bqo)bcl2.g()).a(new bhl(azg2)) < 0) {
            this.a.b(bcl2, new bhl(azg2));
        }
        return bhl2;
    }
}

