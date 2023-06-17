/*
 * Decompiled with CFR 0.150.
 */
public class bkm
implements ds {
    private cbg a;

    public bkm() {
    }

    public bkm(cbg cbg2) {
        this.a = cbg2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.d();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cbg a() {
        return this.a;
    }
}

