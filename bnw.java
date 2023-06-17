/*
 * Decompiled with CFR 0.150.
 */
public enum bnw {
    a(0, "SuccessCount"),
    b(1, "AffectedBlocks"),
    c(2, "AffectedEntities"),
    d(3, "AffectedItems"),
    e(4, "QueryResult");

    final int f;
    final String g;

    /*
     * WARNING - void declaration
     */
    private bnw() {
        void var4_2;
        void var3_1;
        this.f = var3_1;
        this.g = var4_2;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public static String[] c() {
        String[] arrstring = new String[bnw.values().length];
        int n2 = 0;
        for (bnw bnw2 : bnw.values()) {
            arrstring[n2++] = bnw2.b();
        }
        return arrstring;
    }

    public static bnw a(String string) {
        for (bnw bnw2 : bnw.values()) {
            if (!bnw2.b().equals(string)) continue;
            return bnw2;
        }
        return null;
    }
}

