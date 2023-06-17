/*
 * Decompiled with CFR 0.150.
 */
class bbq
extends cyx {
    public bbq(aoa aoa2) {
        super(aoa2, bga.class, 10, true, false, new bju());
    }

    @Override
    public boolean b() {
        if (this.c.as_() == null) {
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

