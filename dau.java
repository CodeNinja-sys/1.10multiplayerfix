/*
 * Decompiled with CFR 0.150.
 */
final class dau
implements ccd {
    dau() {
    }

    public void a(si si2, cig cig2) {
        si2.a(cig2.b());
        si2.a(cig2.c());
        si2.a(cig2.d());
    }

    public cig a(si si2) {
        return new cig(si2.O(), si2.O(), si2.O());
    }

    @Override
    public bcz a(int n2) {
        return new bcz(n2, this);
    }

    @Override
    public /* synthetic */ Object b(si si2) {
        return this.a(si2);
    }
}

