/*
 * Decompiled with CFR 0.150.
 */
public enum dfm {
    a(dfd.a, 0, 0, "mainhand"),
    b(dfd.a, 1, 5, "offhand"),
    c(dfd.b, 0, 1, "feet"),
    d(dfd.b, 1, 2, "legs"),
    e(dfd.b, 2, 3, "chest"),
    f(dfd.b, 3, 4, "head");

    private final dfd g;
    private final int h;
    private final int i;
    private final String j;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dfm(int n2, String string) {
        void var6_4;
        void var5_3;
        this.g = (dfd)n2;
        this.h = (int)string;
        this.i = var5_3;
        this.j = var6_4;
    }

    public dfd a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public static dfm a(String string) {
        for (dfm dfm2 : dfm.values()) {
            if (!dfm2.d().equals(string)) continue;
            return dfm2;
        }
        throw new IllegalArgumentException("Invalid slot '" + string + "'");
    }
}

