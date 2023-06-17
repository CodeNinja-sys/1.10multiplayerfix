/*
 * Decompiled with CFR 0.150.
 */
public enum afg implements hn
{
    a(1, "north_west"),
    b(2, "north"),
    c(3, "north_east"),
    d(4, "west"),
    e(5, "center"),
    f(6, "east"),
    g(7, "south_west"),
    h(8, "south"),
    i(9, "south_east"),
    j(10, "stem"),
    k(0, "all_inside"),
    l(14, "all_outside"),
    m(15, "all_stem");

    private static final afg[] n;
    private final int o;
    private final String p;

    /*
     * WARNING - void declaration
     */
    private afg() {
        void var4_2;
        void var3_1;
        this.o = var3_1;
        this.p = var4_2;
    }

    public int b() {
        return this.o;
    }

    public String toString() {
        return this.p;
    }

    public static afg a(int n2) {
        afg afg2;
        if (n2 < 0 || n2 >= n.length) {
            n2 = 0;
        }
        return (afg2 = n[n2]) == null ? n[0] : afg2;
    }

    @Override
    public String a() {
        return this.p;
    }

    static {
        n = new afg[16];
        afg[] arrafg = afg.values();
        int n2 = arrafg.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            afg afg2;
            afg.n[afg2.b()] = afg2 = arrafg[i2];
        }
    }
}

