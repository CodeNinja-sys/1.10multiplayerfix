/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum ck implements at
{
    a(1, "north_west"),
    b(2, "north"),
    c(3, "north_east"),
    d(4, "west"),
    e(5, "center"),
    f(6, "east"),
    g(7, "south_west"),
    h(8, "south"),
    i(9, "south_east"),
    j(10, "stem"),
    k(0, "all_inside"),
    l(14, "all_outside"),
    m(15, "all_stem");

    private static final ck[] n;
    private final int o;
    private final String p;

    static {
        n = new ck[16];
        ck[] arrck = ck.values();
        int n2 = arrck.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ck ck2;
            ck.n[ck2.b()] = ck2 = arrck[i2];
        }
    }

    /*
     * WARNING - void declaration
     */
    private ck() {
        void var4_2;
        void var3_1;
        this.o = var3_1;
        this.p = var4_2;
    }

    public int b() {
        return this.o;
    }

    public String toString() {
        return this.p;
    }

    public static ck a(int n2) {
        ck ck2;
        if (n2 < 0 || n2 >= n.length) {
            n2 = 0;
        }
        return (ck2 = n[n2]) == null ? n[0] : ck2;
    }

    @Override
    public String a() {
        return this.p;
    }
}

