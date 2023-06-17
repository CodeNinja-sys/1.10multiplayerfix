/*
 * Decompiled with CFR 0.150.
 */
class biq
extends cyx {
    final /* synthetic */ aoa a;

    public biq(aoa aoa2, aoa aoa3) {
        this.a = aoa2;
        super((cfl)aoa3, bdl.class, true);
    }

    @Override
    public boolean b() {
        if (this.a.aQ.Q() == ct.a) {
            return false;
        }
        return super.b();
    }

    @Override
    protected cxt a(double d2) {
        bqk bqk2 = ((aoa)this.c).M();
        if (bqk2.l() == ctv.a) {
            return this.c.cD().b(4.0, d2, d2);
        }
        if (bqk2.l() == ctv.c) {
            return this.c.cD().b(d2, d2, 4.0);
        }
        return this.c.cD().b(d2, 4.0, d2);
    }
}

