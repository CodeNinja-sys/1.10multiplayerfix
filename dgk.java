/*
 * Decompiled with CFR 0.150.
 */
public enum dgk implements hn
{
    a(0, "red_sandstone", aac.b.d());

    private static final dgk[] b;
    private final int c;
    private final String d;
    private final bif e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dgk(bif bif2) {
        void var5_3;
        void var4_2;
        this.c = (int)bif2;
        this.d = var4_2;
        this.e = var5_3;
    }

    public int b() {
        return this.c;
    }

    public bif c() {
        return this.e;
    }

    public String toString() {
        return this.d;
    }

    public static dgk a(int n2) {
        if (n2 < 0 || n2 >= b.length) {
            n2 = 0;
        }
        return b[n2];
    }

    @Override
    public String a() {
        return this.d;
    }

    public String d() {
        return this.d;
    }

    static {
        b = new dgk[dgk.values().length];
        dgk[] arrdgk = dgk.values();
        int n2 = arrdgk.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dgk dgk2;
            dgk.b[dgk2.b()] = dgk2 = arrdgk[i2];
        }
    }
}

