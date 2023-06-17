/*
 * Decompiled with CFR 0.150.
 */
public class bmg
implements ds {
    private cbg a;

    public bmg() {
    }

    public bmg(cbg cbg2) {
        this.a = cbg2;
    }

    @Override
    public void a(si si2) {
        this.a = zf.b(si2.e(32767));
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
    }

    public void a(su su2) {
        su2.a(this);
    }

    public cbg a() {
        return this.a;
    }
}

