/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum ei implements at
{
    a(0, "cobblestone", "normal"),
    b(1, "mossy_cobblestone", "mossy");

    private static final ei[] c;
    private final int d;
    private final String e;
    private final String f;

    static {
        c = new ei[ei.values().length];
        ei[] arrei = ei.values();
        int n2 = arrei.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ei ei2;
            ei.c[ei2.b()] = ei2 = arrei[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ei(String string) {
        void var5_3;
        void var4_2;
        this.d = (int)string;
        this.e = var4_2;
        this.f = var5_3;
    }

    public int b() {
        return this.d;
    }

    public String toString() {
        return this.e;
    }

    public static ei a(int n2) {
        if (n2 < 0 || n2 >= c.length) {
            n2 = 0;
        }
        return c[n2];
    }

    @Override
    public String a() {
        return this.e;
    }

    public String c() {
        return this.f;
    }
}

