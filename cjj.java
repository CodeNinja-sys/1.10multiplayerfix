/*
 * Decompiled with CFR 0.150.
 */
public class cjj
implements ds {
    private cmz a;
    private dbk b;

    public cjj() {
    }

    public cjj(iu iu2, cmz cmz2) {
        this.a = cmz2;
        this.b = iu2.n(cmz2);
    }

    @Override
    public void a(si si2) {
        this.a = si2.c();
        this.b = (dbk)bfa.w.a(si2.e());
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.d(bfa.w.a(this.b));
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public dbk a() {
        return this.b;
    }

    public cmz b() {
        return this.a;
    }
}

