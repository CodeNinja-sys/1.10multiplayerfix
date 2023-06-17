/*
 * Decompiled with CFR 0.150.
 */
public enum byj implements hn
{
    a(0, "red_sandstone", "default"),
    b(1, "chiseled_red_sandstone", "chiseled"),
    c(2, "smooth_red_sandstone", "smooth");

    private static final byj[] d;
    private final int e;
    private final String f;
    private final String g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private byj(String string) {
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

    public static byj a(int n2) {
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
        d = new byj[byj.values().length];
        byj[] arrbyj = byj.values();
        int n2 = arrbyj.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            byj byj2;
            byj.d[byj2.b()] = byj2 = arrbyj[i2];
        }
    }
}

