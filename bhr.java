/*
 * Decompiled with CFR 0.150.
 */
class bhr
implements awp {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ aet c;

    bhr(aet aet2, int n2, int n3) {
        this.c = aet2;
        this.a = n2;
        this.b = n3;
    }

    public String a() {
        return this.c.a(this.a, this.b) ? "True" : "False";
    }

    public /* synthetic */ Object call() {
        return this.a();
    }
}

