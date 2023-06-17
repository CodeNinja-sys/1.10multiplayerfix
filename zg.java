/*
 * Decompiled with CFR 0.150.
 */
public enum zg implements hn
{
    a(0, "oak", bif.o),
    b(1, "spruce", bif.J),
    c(2, "birch", bif.d),
    d(3, "jungle", bif.l),
    e(4, "acacia", bif.q),
    f(5, "dark_oak", "big_oak", bif.B);

    private static final zg[] g;
    private final int h;
    private final String i;
    private final String j;
    private final bif k;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zg(bif bif2) {
        this((String)var1_-1, (int)var2_-1, (int)bif2, (String)var4_2, (String)var4_2, (bif)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zg(String string, bif bif2) {
        void var6_4;
        void var5_3;
        this.h = (int)string;
        this.i = bif2;
        this.j = var5_3;
        this.k = var6_4;
    }

    public int b() {
        return this.h;
    }

    public bif c() {
        return this.k;
    }

    public String toString() {
        return this.i;
    }

    public static zg a(int n2) {
        if (n2 < 0 || n2 >= g.length) {
            n2 = 0;
        }
        return g[n2];
    }

    @Override
    public String a() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    static {
        g = new zg[zg.values().length];
        zg[] arrzg = zg.values();
        int n2 = arrzg.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            zg zg2;
            zg.g[zg2.b()] = zg2 = arrzg[i2];
        }
    }
}

