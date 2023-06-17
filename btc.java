/*
 * Decompiled with CFR 0.150.
 */
public abstract class btc
extends Enum
implements hn {
    public static final /* enum */ btc a = new azn(0, "stone");
    public static final /* enum */ btc b = new dey(1, "cobblestone", "cobble");
    public static final /* enum */ btc c = new abz(2, "stone_brick", "brick");
    public static final /* enum */ btc d = new cdy(3, "mossy_brick", "mossybrick");
    public static final /* enum */ btc e = new bbo(4, "cracked_brick", "crackedbrick");
    public static final /* enum */ btc f = new lm(5, "chiseled_brick", "chiseledbrick");
    private static final btc[] g;
    private final int h;
    private final String i;
    private final String j;
    private static final /* synthetic */ btc[] k;

    public static btc[] values() {
        return (btc[])k.clone();
    }

    public static btc valueOf(String string) {
        return Enum.valueOf(btc.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private btc() {
        this((String)var1_-1, (int)var2_-1, (int)var3_1, (String)var4_2, (String)var4_2);
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private btc(String string) {
        void var5_3;
        void var4_2;
        void var2_-1;
        void var1_-1;
        this.h = (int)string;
        this.i = var4_2;
        this.j = var5_3;
    }

    public int c() {
        return this.h;
    }

    public String toString() {
        return this.i;
    }

    public static btc a(int n2) {
        if (n2 < 0 || n2 >= g.length) {
            n2 = 0;
        }
        return g[n2];
    }

    @Override
    public String a() {
        return this.i;
    }

    public String d() {
        return this.j;
    }

    public abstract dbk b();

    public static btc a(dbk dbk2) {
        for (btc btc2 : btc.values()) {
            if (dbk2 != btc2.b()) continue;
            return btc2;
        }
        return a;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ btc(int n2, String string, aks aks2) {
        this((String)var1_-1, (int)string, (int)aks2, (String)var4_3);
        void var4_3;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ btc(int n2, String string, String string2, aks aks2) {
        this((String)var1_-1, (int)string, (int)string2, (String)((Object)aks2), (String)var5_4);
        void var5_4;
        void var1_-1;
    }

    static {
        k = new btc[]{a, b, c, d, e, f};
        g = new btc[btc.values().length];
        btc[] arrbtc = btc.values();
        int n2 = arrbtc.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            btc btc2;
            btc.g[btc2.c()] = btc2 = arrbtc[i2];
        }
    }
}

