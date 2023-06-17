/*
 * Decompiled with CFR 0.150.
 */
public enum dck implements hn
{
    a(0, 15, "white", "white", bif.j, aug.p),
    b(1, 14, "orange", "orange", bif.q, aug.g),
    c(2, 13, "magenta", "magenta", bif.r, aug.l),
    d(3, 12, "light_blue", "lightBlue", bif.s, aug.j),
    e(4, 11, "yellow", "yellow", bif.t, aug.o),
    f(5, 10, "lime", "lime", bif.u, aug.k),
    g(6, 9, "pink", "pink", bif.v, aug.n),
    h(7, 8, "gray", "gray", bif.w, aug.i),
    i(8, 7, "silver", "silver", bif.x, aug.h),
    j(9, 6, "cyan", "cyan", bif.y, aug.d),
    k(10, 5, "purple", "purple", bif.z, aug.f),
    l(11, 4, "blue", "blue", bif.A, aug.b),
    m(12, 3, "brown", "brown", bif.B, aug.g),
    n(13, 2, "green", "green", bif.C, aug.c),
    o(14, 1, "red", "red", bif.D, aug.e),
    p(15, 0, "black", "black", bif.E, aug.a);

    private static final dck[] q;
    private static final dck[] r;
    private final int s;
    private final int t;
    private final String u;
    private final String v;
    private final bif w;
    private final aug x;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dck(String string, String string2, bif bif2, aug aug2) {
        void var8_6;
        void var7_5;
        this.s = (int)string;
        this.t = (int)string2;
        this.u = bif2;
        this.v = aug2;
        this.w = var7_5;
        this.x = var8_6;
    }

    public int b() {
        return this.s;
    }

    public int c() {
        return this.t;
    }

    public String d() {
        return this.v;
    }

    public bif e() {
        return this.w;
    }

    public static dck a(int n2) {
        if (n2 < 0 || n2 >= r.length) {
            n2 = 0;
        }
        return r[n2];
    }

    public static dck b(int n2) {
        if (n2 < 0 || n2 >= q.length) {
            n2 = 0;
        }
        return q[n2];
    }

    public String toString() {
        return this.v;
    }

    @Override
    public String a() {
        return this.u;
    }

    static {
        q = new dck[dck.values().length];
        r = new dck[dck.values().length];
        dck[] arrdck = dck.values();
        int n2 = arrdck.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dck dck2;
            dck.q[dck2.b()] = dck2 = arrdck[i2];
            dck.r[dck2.c()] = dck2;
        }
    }
}

