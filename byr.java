/*
 * Decompiled with CFR 0.150.
 */
public enum byr implements hn
{
    a(0, "sandstone", "default"),
    b(1, "chiseled_sandstone", "chiseled"),
    c(2, "smooth_sandstone", "smooth");

    private static final byr[] d;
    private final int e;
    private final String f;
    private final String g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private byr(String string) {
        void var5_3;
        void var4_2;
        this.e = (int)string;
        this.f = var4_2;
        this.g = var5_3;
    }

    public int b() {
        return this.e;
    }

    public String toString() {
        return this.f;
    }

    public static byr a(int n2) {
        if (n2 < 0 || n2 >= d.length) {
            n2 = 0;
        }
        return d[n2];
    }

    @Override
    public String a() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    static {
        d = new byr[byr.values().length];
        byr[] arrbyr = byr.values();
        int n2 = arrbyr.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byr byr2;
            byr.d[byr2.b()] = byr2 = arrbyr[i2];
        }
    }
}

