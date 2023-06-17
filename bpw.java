/*
 * Decompiled with CFR 0.150.
 */
enum bpw {
    a(bqk.b, 0, -1),
    b(bqk.a, 0, 1),
    c(bqk.f, -1, 0),
    d(bqk.e, 1, 0);

    private final bqk e;
    private final int f;
    private final int g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bpw(int n2) {
        void var5_3;
        void var4_2;
        this.e = (bqk)n2;
        this.f = var4_2;
        this.g = var5_3;
    }

    public bqk a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    private boolean d() {
        return this == b || this == a;
    }

    static /* synthetic */ boolean a(bpw bpw2) {
        return bpw2.d();
    }
}

