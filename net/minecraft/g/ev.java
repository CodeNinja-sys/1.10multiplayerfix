/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum ev implements at
{
    a(0, "red_sandstone", "default"),
    b(1, "chiseled_red_sandstone", "chiseled"),
    c(2, "smooth_red_sandstone", "smooth");

    private static final ev[] d;
    private final int e;
    private final String f;
    private final String g;

    static {
        d = new ev[ev.values().length];
        ev[] arrev = ev.values();
        int n2 = arrev.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ev ev2;
            ev.d[ev2.b()] = ev2 = arrev[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ev(String string) {
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

    public static ev a(int n2) {
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

