/*
 * Decompiled with CFR 0.150.
 */
public enum bon implements hn
{
    a(0, "sunflower"),
    b(1, "syringa"),
    c(2, "double_grass", "grass"),
    d(3, "double_fern", "fern"),
    e(4, "double_rose", "rose"),
    f(5, "paeonia");

    private static final bon[] g;
    private final int h;
    private final String i;
    private final String j;

    /*
     * WARNING - void declaration
     */
    private bon() {
        this((String)var1_-1, (int)var2_-1, (int)var3_1, (String)var4_2, (String)var4_2);
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bon(String string) {
        void var5_3;
        void var4_2;
        this.h = (int)string;
        this.i = var4_2;
        this.j = var5_3;
    }

    public int b() {
        return this.h;
    }

    public String toString() {
        return this.i;
    }

    public static bon a(int n2) {
        if (n2 < 0 || n2 >= g.length) {
            n2 = 0;
        }
        return g[n2];
    }

    @Override
    public String a() {
        return this.i;
    }

    public String c() {
        return this.j;
    }

    static {
        g = new bon[bon.values().length];
        bon[] arrbon = bon.values();
        int n2 = arrbon.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bon bon2;
            bon.g[bon2.b()] = bon2 = arrbon[i2];
        }
    }
}

