/*
 * Decompiled with CFR 0.150.
 */
public enum wv implements hn
{
    a(0, "cobblestone", "normal"),
    b(1, "mossy_cobblestone", "mossy");

    private static final wv[] c;
    private final int d;
    private final String e;
    private final String f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private wv(String string) {
        void var5_3;
        void var4_2;
        this.d = (int)string;
        this.e = var4_2;
        this.f = var5_3;
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }

    public static wv a(int n2) {
        if (n2 < 0 || n2 >= c.length) {
            n2 = 0;
        }
        return c[n2];
    }

    @Override
    public String a() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    static {
        c = new wv[wv.values().length];
        wv[] arrwv = wv.values();
        int n2 = arrwv.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            wv wv2;
            wv.c[wv2.b()] = wv2 = arrwv[i2];
        }
    }
}

