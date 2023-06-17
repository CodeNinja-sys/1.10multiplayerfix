/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum r implements at
{
    a(0, "sandstone", "default"),
    b(1, "chiseled_sandstone", "chiseled"),
    c(2, "smooth_sandstone", "smooth");

    private static final r[] d;
    private final int e;
    private final String f;
    private final String g;

    static {
        d = new r[r.values().length];
        r[] arrr = r.values();
        int n2 = arrr.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            r r2;
            r.d[r2.b()] = r2 = arrr[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private r(String string) {
        void var5_3;
        void var4_2;
        this.e = (int)string;
        this.f = var4_2;
        this.g = var5_3;
    }

    public int b() {
        return this.e;
    }

    public String toString() {
        return this.f;
    }

    public static r a(int n2) {
        if (n2 < 0 || n2 >= d.length) {
            n2 = 0;
        }
        return d[n2];
    }

    @Override
    public String a() {
        return this.f;
    }

    public String c() {
        return this.g;
    }
}

