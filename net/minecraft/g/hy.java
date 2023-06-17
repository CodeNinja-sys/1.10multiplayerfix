/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.u.at;

public enum hy implements at
{
    a(0, "sand", "default", net.minecraft.g.a.e.d, -2370656),
    b(1, "red_sand", "red", net.minecraft.g.a.e.q, -5679071);

    private static final hy[] c;
    private final int d;
    private final String e;
    private final e f;
    private final String g;
    private final int h;

    static {
        c = new hy[hy.values().length];
        hy[] arrhy = hy.values();
        int n2 = arrhy.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            hy hy2;
            hy.c[hy2.c()] = hy2 = arrhy[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private hy(String string, e e2, int n3) {
        void var7_5;
        void var6_4;
        this.d = (int)string;
        this.e = e2;
        this.f = var6_4;
        this.g = (String)n3;
        this.h = var7_5;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }

    public e d() {
        return this.f;
    }

    public static hy a(int n2) {
        if (n2 < 0 || n2 >= c.length) {
            n2 = 0;
        }
        return c[n2];
    }

    @Override
    public String a() {
        return this.e;
    }

    public String e() {
        return this.g;
    }
}

