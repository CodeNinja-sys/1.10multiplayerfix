/*
 * Decompiled with CFR 0.150.
 */
public enum arz {
    a(new bqk[]{bqk.e, bqk.f, bqk.c, bqk.d}, 0.5f, true, new bhs[]{bhs.k, bhs.d, bhs.k, bhs.j, bhs.e, bhs.j, bhs.e, bhs.d}, new bhs[]{bhs.k, bhs.c, bhs.k, bhs.i, bhs.e, bhs.i, bhs.e, bhs.c}, new bhs[]{bhs.l, bhs.c, bhs.l, bhs.i, bhs.f, bhs.i, bhs.f, bhs.c}, new bhs[]{bhs.l, bhs.d, bhs.l, bhs.j, bhs.f, bhs.j, bhs.f, bhs.d}),
    b(new bqk[]{bqk.f, bqk.e, bqk.c, bqk.d}, 1.0f, true, new bhs[]{bhs.f, bhs.d, bhs.f, bhs.j, bhs.l, bhs.j, bhs.l, bhs.d}, new bhs[]{bhs.f, bhs.c, bhs.f, bhs.i, bhs.l, bhs.i, bhs.l, bhs.c}, new bhs[]{bhs.e, bhs.c, bhs.e, bhs.i, bhs.k, bhs.i, bhs.k, bhs.c}, new bhs[]{bhs.e, bhs.d, bhs.e, bhs.j, bhs.k, bhs.j, bhs.k, bhs.d}),
    c(new bqk[]{bqk.b, bqk.a, bqk.f, bqk.e}, 0.8f, true, new bhs[]{bhs.b, bhs.k, bhs.b, bhs.e, bhs.h, bhs.e, bhs.h, bhs.k}, new bhs[]{bhs.b, bhs.l, bhs.b, bhs.f, bhs.h, bhs.f, bhs.h, bhs.l}, new bhs[]{bhs.a, bhs.l, bhs.a, bhs.f, bhs.g, bhs.f, bhs.g, bhs.l}, new bhs[]{bhs.a, bhs.k, bhs.a, bhs.e, bhs.g, bhs.e, bhs.g, bhs.k}),
    d(new bqk[]{bqk.e, bqk.f, bqk.a, bqk.b}, 0.8f, true, new bhs[]{bhs.b, bhs.k, bhs.h, bhs.k, bhs.h, bhs.e, bhs.b, bhs.e}, new bhs[]{bhs.a, bhs.k, bhs.g, bhs.k, bhs.g, bhs.e, bhs.a, bhs.e}, new bhs[]{bhs.a, bhs.l, bhs.g, bhs.l, bhs.g, bhs.f, bhs.a, bhs.f}, new bhs[]{bhs.b, bhs.l, bhs.h, bhs.l, bhs.h, bhs.f, bhs.b, bhs.f}),
    e(new bqk[]{bqk.b, bqk.a, bqk.c, bqk.d}, 0.6f, true, new bhs[]{bhs.b, bhs.d, bhs.b, bhs.j, bhs.h, bhs.j, bhs.h, bhs.d}, new bhs[]{bhs.b, bhs.c, bhs.b, bhs.i, bhs.h, bhs.i, bhs.h, bhs.c}, new bhs[]{bhs.a, bhs.c, bhs.a, bhs.i, bhs.g, bhs.i, bhs.g, bhs.c}, new bhs[]{bhs.a, bhs.d, bhs.a, bhs.j, bhs.g, bhs.j, bhs.g, bhs.d}),
    f(new bqk[]{bqk.a, bqk.b, bqk.c, bqk.d}, 0.6f, true, new bhs[]{bhs.g, bhs.d, bhs.g, bhs.j, bhs.a, bhs.j, bhs.a, bhs.d}, new bhs[]{bhs.g, bhs.c, bhs.g, bhs.i, bhs.a, bhs.i, bhs.a, bhs.c}, new bhs[]{bhs.h, bhs.c, bhs.h, bhs.i, bhs.b, bhs.i, bhs.b, bhs.c}, new bhs[]{bhs.h, bhs.d, bhs.h, bhs.j, bhs.b, bhs.j, bhs.b, bhs.d});

    private final bqk[] g;
    private final float h;
    private final boolean i;
    private final bhs[] j;
    private final bhs[] k;
    private final bhs[] l;
    private final bhs[] m;
    private static final arz[] n;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private arz(boolean bl2, bhs[] arrbhs, bhs[] arrbhs2, bhs[] arrbhs3, bhs[] arrbhs4) {
        void var9_7;
        void var8_6;
        this.g = (bqk[])bl2;
        this.h = (float)arrbhs;
        this.i = arrbhs2;
        this.j = arrbhs3;
        this.k = arrbhs4;
        this.l = var8_6;
        this.m = var9_7;
    }

    public static arz a(bqk bqk2) {
        return n[bqk2.b()];
    }

    static /* synthetic */ bqk[] a(arz arz2) {
        return arz2.g;
    }

    static /* synthetic */ boolean b(arz arz2) {
        return arz2.i;
    }

    static /* synthetic */ bhs[] c(arz arz2) {
        return arz2.j;
    }

    static /* synthetic */ bhs[] d(arz arz2) {
        return arz2.k;
    }

    static /* synthetic */ bhs[] e(arz arz2) {
        return arz2.l;
    }

    static /* synthetic */ bhs[] f(arz arz2) {
        return arz2.m;
    }

    static {
        n = new arz[6];
        arz.n[bqk.a.b()] = a;
        arz.n[bqk.b.b()] = b;
        arz.n[bqk.c.b()] = c;
        arz.n[bqk.d.b()] = d;
        arz.n[bqk.e.b()] = e;
        arz.n[bqk.f.b()] = f;
    }
}

