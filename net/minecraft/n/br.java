/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

public enum br {
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
    private br() {
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
        String[] arrstring = new String[br.values().length];
        int n2 = 0;
        for (br br2 : br.values()) {
            arrstring[n2++] = br2.b();
        }
        return arrstring;
    }

    public static br a(String string) {
        for (br br2 : br.values()) {
            if (!br2.b().equals(string)) continue;
            return br2;
        }
        return null;
    }
}

