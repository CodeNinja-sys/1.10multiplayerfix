/*
 * Decompiled with CFR 0.150.
 */
class cca
implements awp {
    final /* synthetic */ cvn a;

    cca(cvn cvn2) {
        this.a = cvn2;
    }

    public String a() {
        return String.format("Rain time: %d (now: %b), thunder time: %d (now: %b)", cvn.k(this.a), cvn.l(this.a), cvn.m(this.a), cvn.n(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

