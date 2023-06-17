/*
 * Decompiled with CFR 0.150.
 */
public enum cfk implements hn
{
    a("save", 0),
    b("load", 1),
    c("corner", 2),
    d("data", 3);

    private static final cfk[] e;
    private final String f;
    private final int g;

    /*
     * WARNING - void declaration
     */
    private cfk() {
        void var4_2;
        void var3_1;
        this.f = var3_1;
        this.g = var4_2;
    }

    @Override
    public String a() {
        return this.f;
    }

    public int b() {
        return this.g;
    }

    public static cfk a(int n2) {
        if (n2 < 0 || n2 >= e.length) {
            return e[0];
        }
        return e[n2];
    }

    static /* synthetic */ String a(cfk cfk2) {
        return cfk2.f;
    }

    static {
        e = new cfk[cfk.values().length];
        cfk[] arrcfk = cfk.values();
        int n2 = arrcfk.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cfk cfk2;
            cfk.e[cfk2.b()] = cfk2 = arrcfk[i2];
        }
    }
}

