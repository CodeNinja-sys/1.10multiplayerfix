/*
 * Decompiled with CFR 0.150.
 */
public enum ade implements hn
{
    a(0, bif.m, "stone"),
    b(1, bif.l, "granite"),
    c(2, bif.l, "smooth_granite", "graniteSmooth"),
    d(3, bif.p, "diorite"),
    e(4, bif.p, "smooth_diorite", "dioriteSmooth"),
    f(5, bif.m, "andesite"),
    g(6, bif.m, "smooth_andesite", "andesiteSmooth");

    private static final ade[] h;
    private final int i;
    private final String j;
    private final String k;
    private final bif l;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ade(String string) {
        this((String)var1_-1, (int)var2_-1, (int)string, (bif)var4_2, (String)var5_3, (String)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ade(String string, String string2) {
        void var6_4;
        void var5_3;
        this.i = (int)string;
        this.j = var5_3;
        this.k = var6_4;
        this.l = string2;
    }

    public int b() {
        return this.i;
    }

    public bif c() {
        return this.l;
    }

    public String toString() {
        return this.j;
    }

    public static ade a(int n2) {
        if (n2 < 0 || n2 >= h.length) {
            n2 = 0;
        }
        return h[n2];
    }

    @Override
    public String a() {
        return this.j;
    }

    public String d() {
        return this.k;
    }

    static {
        h = new ade[ade.values().length];
        ade[] arrade = ade.values();
        int n2 = arrade.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ade ade2;
            ade.h[ade2.b()] = ade2 = arrade[i2];
        }
    }
}

