/*
 * Decompiled with CFR 0.150.
 */
public enum crt implements hn
{
    a(0, "stonebrick", "default"),
    b(1, "mossy_stonebrick", "mossy"),
    c(2, "cracked_stonebrick", "cracked"),
    d(3, "chiseled_stonebrick", "chiseled");

    private static final crt[] e;
    private final int f;
    private final String g;
    private final String h;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private crt(String string) {
        void var5_3;
        void var4_2;
        this.f = (int)string;
        this.g = var4_2;
        this.h = var5_3;
    }

    public int b() {
        return this.f;
    }

    public String toString() {
        return this.g;
    }

    public static crt a(int n2) {
        if (n2 < 0 || n2 >= e.length) {
            n2 = 0;
        }
        return e[n2];
    }

    @Override
    public String a() {
        return this.g;
    }

    public String c() {
        return this.h;
    }

    static {
        e = new crt[crt.values().length];
        crt[] arrcrt = crt.values();
        int n2 = arrcrt.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            crt crt2;
            crt.e[crt2.b()] = crt2 = arrcrt[i2];
        }
    }
}

