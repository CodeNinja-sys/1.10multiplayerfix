/*
 * Decompiled with CFR 0.150.
 */
public class azq
implements ds {
    private cmz a;

    public azq() {
    }

    public azq(cmz cmz2) {
        this.a = cmz2;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.c();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
    }

    public cmz a() {
        return this.a;
    }
}

