/*
 * Decompiled with CFR 0.150.
 */
public enum bzb implements hn
{
    a(0, "prismarine", "rough"),
    b(1, "prismarine_bricks", "bricks"),
    c(2, "dark_prismarine", "dark");

    private static final bzb[] d;
    private final int e;
    private final String f;
    private final String g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bzb(String string) {
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

    public static bzb a(int n2) {
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
        d = new bzb[bzb.values().length];
        bzb[] arrbzb = bzb.values();
        int n2 = arrbzb.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bzb bzb2;
            bzb.d[bzb2.b()] = bzb2 = arrbzb[i2];
        }
    }
}

