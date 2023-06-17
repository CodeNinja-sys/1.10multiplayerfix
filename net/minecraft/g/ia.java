/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.ad;
import net.minecraft.u.at;

public enum ia implements at
{
    a(0, "down_x", ad.a),
    b(1, "east", ad.f),
    c(2, "west", ad.e),
    d(3, "south", ad.d),
    e(4, "north", ad.c),
    f(5, "up_z", ad.b),
    g(6, "up_x", ad.b),
    h(7, "down_z", ad.a);

    private static final ia[] i;
    private final int j;
    private final String k;
    private final ad l;

    static {
        i = new ia[ia.values().length];
        ia[] arria = ia.values();
        int n2 = arria.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ia ia2;
            ia.i[ia2.b()] = ia2 = arria[i2];
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ia(ad ad2) {
        void var5_3;
        void var4_2;
        this.j = (int)ad2;
        this.k = var4_2;
        this.l = var5_3;
    }

    public int b() {
        return this.j;
    }

    public ad c() {
        return this.l;
    }

    public String toString() {
        return this.k;
    }

    public static ia a(int n2) {
        if (n2 < 0 || n2 >= i.length) {
            n2 = 0;
        }
        return i[n2];
    }

    public static ia a(ad ad2, ad ad3) {
        switch (ad2) {
            case a: {
                switch (ad3.l()) {
                    case a: {
                        return a;
                    }
                    case c: {
                        return h;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + ad3 + " for facing " + ad2);
            }
            case b: {
                switch (ad3.l()) {
                    case a: {
                        return g;
                    }
                    case c: {
                        return f;
                    }
                }
                throw new IllegalArgumentException("Invalid entityFacing " + ad3 + " for facing " + ad2);
            }
            case c: {
                return e;
            }
            case d: {
                return d;
            }
            case e: {
                return c;
            }
            case f: {
                return b;
            }
        }
        throw new IllegalArgumentException("Invalid facing: " + ad2);
    }

    @Override
    public String a() {
        return this.k;
    }
}

