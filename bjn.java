/*
 * Decompiled with CFR 0.150.
 */
public enum bjn implements hn
{
    a(0, "default", "default"),
    b(1, "chiseled", "chiseled"),
    c(2, "lines_y", "lines"),
    d(3, "lines_x", "lines"),
    e(4, "lines_z", "lines");

    private static final bjn[] f;
    private final int g;
    private final String h;
    private final String i;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bjn(String string) {
        void var5_3;
        void var4_2;
        this.g = (int)string;
        this.h = var4_2;
        this.i = var5_3;
    }

    public int b() {
        return this.g;
    }

    public String toString() {
        return this.i;
    }

    public static bjn a(int n2) {
        if (n2 < 0 || n2 >= f.length) {
            n2 = 0;
        }
        return f[n2];
    }

    @Override
    public String a() {
        return this.h;
    }

    static {
        f = new bjn[bjn.values().length];
        bjn[] arrbjn = bjn.values();
        int n2 = arrbjn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bjn bjn2;
            bjn.f[bjn2.b()] = bjn2 = arrbjn[i2];
        }
    }
}

