/*
 * Decompiled with CFR 0.150.
 */
public enum ct {
    a(0, "options.difficulty.peaceful"),
    b(1, "options.difficulty.easy"),
    c(2, "options.difficulty.normal"),
    d(3, "options.difficulty.hard");

    private static final ct[] e;
    private final int f;
    private final String g;

    /*
     * WARNING - void declaration
     */
    private ct() {
        void var4_2;
        void var3_1;
        this.f = var3_1;
        this.g = var4_2;
    }

    public int a() {
        return this.f;
    }

    public static ct a(int n2) {
        return e[n2 % e.length];
    }

    public String b() {
        return this.g;
    }

    static {
        e = new ct[ct.values().length];
        ct[] arrct = ct.values();
        int n2 = arrct.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ct ct2;
            ct.e[ct2.f] = ct2 = arrct[i2];
        }
    }
}

