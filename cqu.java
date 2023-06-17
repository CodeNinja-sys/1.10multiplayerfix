/*
 * Decompiled with CFR 0.150.
 */
public enum cqu {
    a(new bje[]{new bje(bwl.f, bwl.e, bwl.a, null), new bje(bwl.f, bwl.e, bwl.d, null), new bje(bwl.c, bwl.e, bwl.d, null), new bje(bwl.c, bwl.e, bwl.a, null)}),
    b(new bje[]{new bje(bwl.f, bwl.b, bwl.d, null), new bje(bwl.f, bwl.b, bwl.a, null), new bje(bwl.c, bwl.b, bwl.a, null), new bje(bwl.c, bwl.b, bwl.d, null)}),
    c(new bje[]{new bje(bwl.c, bwl.b, bwl.d, null), new bje(bwl.c, bwl.e, bwl.d, null), new bje(bwl.f, bwl.e, bwl.d, null), new bje(bwl.f, bwl.b, bwl.d, null)}),
    d(new bje[]{new bje(bwl.f, bwl.b, bwl.a, null), new bje(bwl.f, bwl.e, bwl.a, null), new bje(bwl.c, bwl.e, bwl.a, null), new bje(bwl.c, bwl.b, bwl.a, null)}),
    e(new bje[]{new bje(bwl.f, bwl.b, bwl.d, null), new bje(bwl.f, bwl.e, bwl.d, null), new bje(bwl.f, bwl.e, bwl.a, null), new bje(bwl.f, bwl.b, bwl.a, null)}),
    f(new bje[]{new bje(bwl.c, bwl.b, bwl.a, null), new bje(bwl.c, bwl.e, bwl.a, null), new bje(bwl.c, bwl.e, bwl.d, null), new bje(bwl.c, bwl.b, bwl.d, null)});

    private static final cqu[] g;
    private final bje[] h;

    public static cqu a(bqk bqk2) {
        return g[bqk2.b()];
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cqu() {
        void var3_1;
        this.h = var3_1;
    }

    public bje a(int n2) {
        return this.h[n2];
    }

    static {
        g = new cqu[6];
        cqu.g[bwl.e] = a;
        cqu.g[bwl.b] = b;
        cqu.g[bwl.d] = c;
        cqu.g[bwl.a] = d;
        cqu.g[bwl.f] = e;
        cqu.g[bwl.c] = f;
    }
}

