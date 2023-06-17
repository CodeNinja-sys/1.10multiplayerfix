/*
 * Decompiled with CFR 0.150.
 */
class aiq
implements awp {
    final /* synthetic */ cvn a;

    aiq(cvn cvn2) {
        this.a = cvn2;
    }

    public String a() {
        return String.format("%d game time, %d day time", cvn.g(this.a), cvn.h(this.a));
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

