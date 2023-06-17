/*
 * Decompiled with CFR 0.150.
 */
public class za
implements ds {
    private cbg a;
    private cbg b;

    public za() {
    }

    public za(cbg cbg2) {
        this.a = cbg2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.d();
        this.b = si2.d();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cbg a() {
        return this.a;
    }

    public cbg b() {
        return this.b;
    }
}

