/*
 * Decompiled with CFR 0.150.
 */
public enum cev implements hn
{
    a(0, bif.m, "stone"),
    b(1, bif.d, "sandstone", "sand"),
    c(2, bif.o, "wood_old", "wood"),
    d(3, bif.m, "cobblestone", "cobble"),
    e(4, bif.D, "brick"),
    f(5, bif.m, "stone_brick", "smoothStoneBrick"),
    g(6, bif.K, "nether_brick", "netherBrick"),
    h(7, bif.p, "quartz");

    private static final cev[] i;
    private final int j;
    private final bif k;
    private final String l;
    private final String m;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cev(String string) {
        this((String)var1_-1, (int)var2_-1, (int)string, (bif)var4_2, (String)var5_3, (String)var5_3);
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cev(String string, String string2) {
        void var6_4;
        void var5_3;
        this.j = (int)string;
        this.k = string2;
        this.l = var5_3;
        this.m = var6_4;
    }

    public int b() {
        return this.j;
    }

    public bif c() {
        return this.k;
    }

    public String toString() {
        return this.l;
    }

    public static cev a(int n2) {
        if (n2 < 0 || n2 >= i.length) {
            n2 = 0;
        }
        return i[n2];
    }

    @Override
    public String a() {
        return this.l;
    }

    public String d() {
        return this.m;
    }

    static {
        i = new cev[cev.values().length];
        cev[] arrcev = cev.values();
        int n2 = arrcev.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            cev cev2;
            cev.i[cev2.b()] = cev2 = arrcev[i2];
        }
    }
}

