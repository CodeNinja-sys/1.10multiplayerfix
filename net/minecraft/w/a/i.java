/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.a;

public enum i {
    a(0, "options.chat.visibility.full"),
    b(1, "options.chat.visibility.system"),
    c(2, "options.chat.visibility.hidden");

    private static final i[] d;
    private final int e;
    private final String f;

    static {
        d = new i[i.values().length];
        i[] arri = i.values();
        int n2 = arri.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            i i3;
            i.d[i3.e] = i3 = arri[i2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private i() {
        void var4_2;
        void var3_1;
        this.e = var3_1;
        this.f = var4_2;
    }

    public int a() {
        return this.e;
    }

    public static i a(int n2) {
        return d[n2 % d.length];
    }

    public String b() {
        return this.f;
    }
}

