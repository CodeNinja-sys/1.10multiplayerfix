/*
 * Decompiled with CFR 0.150.
 */
public enum cot {
    a(0),
    b(5, "iron", "meo"),
    c(7, "gold", "goo"),
    d(11, "diamond", "dio");

    private final String e;
    private final String f;
    private final int g;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cot() {
        void var3_1;
        this.g = var3_1;
        this.e = null;
        this.f = "";
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cot(String string) {
        void var5_3;
        void var4_2;
        this.g = (int)string;
        this.e = "textures/entity/horse/armor/horse_armor_" + (String)var4_2 + ".png";
        this.f = var5_3;
    }

    public int a() {
        return this.ordinal();
    }

    public String b() {
        return this.f;
    }

    public int c() {
        return this.g;
    }

    public String d() {
        return this.e;
    }

    public static cot a(int n2) {
        return cot.values()[n2];
    }

    public static cot a(bhl bhl2) {
        return bhl2 == null ? a : cot.a(bhl2.a());
    }

    public static cot a(azg azg2) {
        if (azg2 == hp.cu) {
            return b;
        }
        if (azg2 == hp.cv) {
            return c;
        }
        if (azg2 == hp.cw) {
            return d;
        }
        return a;
    }

    public static boolean b(azg azg2) {
        return cot.a(azg2) != a;
    }
}

