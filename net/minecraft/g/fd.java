/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum fd implements at
{
    a(0, "stonebrick", "default"),
    b(1, "mossy_stonebrick", "mossy"),
    c(2, "cracked_stonebrick", "cracked"),
    d(3, "chiseled_stonebrick", "chiseled");

    private static final fd[] e;
    private final int f;
    private final String g;
    private final String h;

    static {
        e = new fd[fd.values().length];
        fd[] arrfd = fd.values();
        int n2 = arrfd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            fd fd2;
            fd.e[fd2.b()] = fd2 = arrfd[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fd(String string) {
        void var5_3;
        void var4_2;
        this.f = (int)string;
        this.g = var4_2;
        this.h = var5_3;
    }

    public int b() {
        return this.f;
    }

    public String toString() {
        return this.g;
    }

    public static fd a(int n2) {
        if (n2 < 0 || n2 >= e.length) {
            n2 = 0;
        }
        return e[n2];
    }

    @Override
    public String a() {
        return this.g;
    }

    public String c() {
        return this.h;
    }
}

