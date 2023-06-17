/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.u.at;

public enum r implements at
{
    a("save", 0),
    b("load", 1),
    c("corner", 2),
    d("data", 3);

    private static final r[] e;
    private final String f;
    private final int g;

    static {
        e = new r[r.values().length];
        r[] arrr = r.values();
        int n2 = arrr.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            r r2;
            r.e[r2.b()] = r2 = arrr[i2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private r() {
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

    public static r a(int n2) {
        return n2 >= 0 && n2 < e.length ? e[n2] : e[0];
    }

    static /* synthetic */ String a(r r2) {
        return r2.f;
    }
}

