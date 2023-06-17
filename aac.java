/*
 * Decompiled with CFR 0.150.
 */
public enum aac implements hn
{
    a(0, "sand", "default", bif.d, -2370656),
    b(1, "red_sand", "red", bif.q, -5679071);

    private static final aac[] c;
    private final int d;
    private final String e;
    private final bif f;
    private final String g;
    private final int h;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aac(String string, bif bif2, int n3) {
        void var7_5;
        void var6_4;
        this.d = (int)string;
        this.e = bif2;
        this.f = var6_4;
        this.g = (String)n3;
        this.h = var7_5;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }

    public bif d() {
        return this.f;
    }

    public static aac a(int n2) {
        if (n2 < 0 || n2 >= c.length) {
            n2 = 0;
        }
        return c[n2];
    }

    @Override
    public String a() {
        return this.e;
    }

    public String e() {
        return this.g;
    }

    static {
        c = new aac[aac.values().length];
        aac[] arraac = aac.values();
        int n2 = arraac.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            aac aac2;
            aac.c[aac2.c()] = aac2 = arraac[i2];
        }
    }
}

