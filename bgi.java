/*
 * Decompiled with CFR 0.150.
 */
public enum bgi {
    a(0, "options.chat.visibility.full"),
    b(1, "options.chat.visibility.system"),
    c(2, "options.chat.visibility.hidden");

    private static final bgi[] d;
    private final int e;
    private final String f;

    /*
     * WARNING - void declaration
     */
    private bgi() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    public int a() {
        return this.e;
    }

    public static bgi a(int n2) {
        return d[n2 % d.length];
    }

    public String b() {
        return this.f;
    }

    static {
        d = new bgi[bgi.values().length];
        bgi[] arrbgi = bgi.values();
        int n2 = arrbgi.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bgi bgi2;
            bgi.d[bgi2.e] = bgi2 = arrbgi[i2];
        }
    }
}

