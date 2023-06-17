/*
 * Decompiled with CFR 0.150.
 */
public enum cns {
    a(zg.a.b(), "oak"),
    b(zg.b.b(), "spruce"),
    c(zg.c.b(), "birch"),
    d(zg.d.b(), "jungle"),
    e(zg.e.b(), "acacia"),
    f(zg.f.b(), "dark_oak");

    private final String g;
    private final int h;

    /*
     * WARNING - void declaration
     */
    private cns() {
        void var3_1;
        void var4_2;
        this.g = var4_2;
        this.h = var3_1;
    }

    public String a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    public String toString() {
        return this.g;
    }

    public static cns a(int n2) {
        if (n2 < 0 || n2 >= cns.values().length) {
            n2 = 0;
        }
        return cns.values()[n2];
    }

    public static cns a(String string) {
        for (int i2 = 0; i2 < cns.values().length; ++i2) {
            if (!cns.values()[i2].a().equals(string)) continue;
            return cns.values()[i2];
        }
        return cns.values()[0];
    }
}

