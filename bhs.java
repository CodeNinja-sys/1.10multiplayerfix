/*
 * Decompiled with CFR 0.150.
 */
public enum bhs {
    a(bqk.a, false),
    b(bqk.b, false),
    c(bqk.c, false),
    d(bqk.d, false),
    e(bqk.e, false),
    f(bqk.f, false),
    g(bqk.a, true),
    h(bqk.b, true),
    i(bqk.c, true),
    j(bqk.d, true),
    k(bqk.e, true),
    l(bqk.f, true);

    private final int m;

    /*
     * WARNING - void declaration
     */
    private bhs() {
        void var4_2;
        void var3_1;
        this.m = var3_1.b() + (var4_2 != false ? bqk.values().length : 0);
    }

    static /* synthetic */ int a(bhs bhs2) {
        return bhs2.m;
    }
}

