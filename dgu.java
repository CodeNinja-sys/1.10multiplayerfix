/*
 * Decompiled with CFR 0.150.
 */
public enum dgu implements hn
{
    a(0, "dirt", "default", bif.l),
    b(1, "coarse_dirt", "coarse", bif.l),
    c(2, "podzol", bif.J);

    private static final dgu[] d;
    private final int e;
    private final String f;
    private final String g;
    private final bif h;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dgu(bif bif2) {
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
    private dgu(String string, bif bif2) {
        void var6_4;
        void var5_3;
        this.e = (int)string;
        this.f = bif2;
        this.g = var5_3;
        this.h = var6_4;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.g;
    }

    public bif d() {
        return this.h;
    }

    public String toString() {
        return this.f;
    }

    public static dgu a(int n2) {
        if (n2 < 0 || n2 >= d.length) {
            n2 = 0;
        }
        return d[n2];
    }

    @Override
    public String a() {
        return this.f;
    }

    static {
        d = new dgu[dgu.values().length];
        dgu[] arrdgu = dgu.values();
        int n2 = arrdgu.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dgu dgu2;
            dgu.d[dgu2.b()] = dgu2 = arrdgu[i2];
        }
    }
}

