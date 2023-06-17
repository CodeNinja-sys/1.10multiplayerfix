/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum dk implements at
{
    a(0, "prismarine", "rough"),
    b(1, "prismarine_bricks", "bricks"),
    c(2, "dark_prismarine", "dark");

    private static final dk[] d;
    private final int e;
    private final String f;
    private final String g;

    static {
        d = new dk[dk.values().length];
        dk[] arrdk = dk.values();
        int n2 = arrdk.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            dk dk2;
            dk.d[dk2.b()] = dk2 = arrdk[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dk(String string) {
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

    public static dk a(int n2) {
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

