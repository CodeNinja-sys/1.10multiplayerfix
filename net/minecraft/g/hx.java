/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.g.hy;
import net.minecraft.u.at;

public enum hx implements at
{
    a(0, "red_sandstone", hy.b.d());

    private static final hx[] b;
    private final int c;
    private final String d;
    private final e e;

    static {
        b = new hx[hx.values().length];
        hx[] arrhx = hx.values();
        int n2 = arrhx.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            hx hx2;
            hx.b[hx2.b()] = hx2 = arrhx[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hx(e e2) {
        void var5_3;
        void var4_2;
        this.c = (int)e2;
        this.d = var4_2;
        this.e = var5_3;
    }

    public int b() {
        return this.c;
    }

    public e c() {
        return this.e;
    }

    public String toString() {
        return this.d;
    }

    public static hx a(int n2) {
        if (n2 < 0 || n2 >= b.length) {
            n2 = 0;
        }
        return b[n2];
    }

    @Override
    public String a() {
        return this.d;
    }

    public String d() {
        return this.d;
    }
}

