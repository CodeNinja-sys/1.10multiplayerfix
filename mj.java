/*
 * Decompiled with CFR 0.150.
 */
class mj
extends ck {
    private int b;
    final /* synthetic */ aoa a;

    public mj(aoa aoa2) {
        this.a = aoa2;
        this.a(3);
    }

    @Override
    public boolean b() {
        bga bga2 = this.a.ar();
        if (bga2 == null || !bga2.bj()) {
            return false;
        }
        return this.a.aQ.Q() != ct.a;
    }

    @Override
    public void c() {
        this.b = 20;
        this.a.d(100);
    }

    @Override
    public void d() {
        this.a.d(0);
    }

    @Override
    public void e() {
        if (this.a.aQ.Q() == ct.a) {
            return;
        }
        --this.b;
        bga bga2 = this.a.ar();
        this.a.am().a(bga2, 180.0f, 180.0f);
        double d2 = this.a.l(bga2);
        if (d2 < 400.0) {
            if (this.b <= 0) {
                this.b = 20 + aoa.c(this.a).nextInt(10) * 20 / 2;
                dcg dcg2 = new dcg(this.a.aQ, this.a, bga2, this.a.M().l());
                this.a.aQ.b(dcg2);
                this.a.a(dah.fn, 2.0f, (aoa.d(this.a).nextFloat() - aoa.e(this.a).nextFloat()) * 0.2f + 1.0f);
            }
        } else {
            this.a.b((bga)null);
        }
        super.e();
    }
}

