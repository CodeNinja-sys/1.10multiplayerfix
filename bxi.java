/*
 * Decompiled with CFR 0.150.
 */
public class bxi
implements ds {
    private cmz a;

    public bxi() {
    }

    public bxi(cmz cmz2) {
        this.a = cmz2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.c();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cmz a() {
        return this.a;
    }
}

