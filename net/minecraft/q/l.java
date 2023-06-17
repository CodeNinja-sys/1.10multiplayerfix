/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

public enum l {
    a(0, "options.difficulty.peaceful"),
    b(1, "options.difficulty.easy"),
    c(2, "options.difficulty.normal"),
    d(3, "options.difficulty.hard");

    private static final l[] e;
    private final int f;
    private final String g;

    static {
        e = new l[l.values().length];
        l[] arrl = l.values();
        int n2 = arrl.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            l l2;
            l.e[l2.f] = l2 = arrl[i2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private l() {
        void var4_2;
        void var3_1;
        this.f = var3_1;
        this.g = var4_2;
    }

    public int a() {
        return this.f;
    }

    public static l a(int n2) {
        return e[n2 % e.length];
    }

    public String b() {
        return this.g;
    }
}

