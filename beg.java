/*
 * Decompiled with CFR 0.150.
 */
final class beg
implements Runnable {
    final /* synthetic */ iu a;
    final /* synthetic */ cmz b;

    beg(iu iu2, cmz cmz2) {
        this.a = iu2;
        this.b = cmz2;
    }

    @Override
    public void run() {
        cmz cmz2;
        bhm bhm2 = this.a.e(this.b);
        for (int i2 = this.b.b() - 1; i2 >= 0 && bhm2.d(cmz2 = new cmz(this.b.a(), i2, this.b.c())); --i2) {
            dbk dbk2 = this.a.n(cmz2);
            if (dbk2.t() != blg.bY) continue;
            ((alj)this.a).a(new dfx(this, cmz2));
        }
    }
}

