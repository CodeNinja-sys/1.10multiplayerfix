/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.bq;

public enum bi {
    a("no_mirror"),
    b("mirror_left_right"),
    c("mirror_front_back");

    private final String d;
    private static final String[] e;
    private static /* synthetic */ int[] f;

    static {
        e = new String[bi.values().length];
        int n2 = 0;
        for (bi bi2 : bi.values()) {
            bi.e[n2++] = bi2.d;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bi() {
        void var3_1;
        this.d = var3_1;
    }

    public int a(int n2, int n3) {
        int n4 = n3 / 2;
        int n5 = n2 > n4 ? n2 - n3 : n2;
        switch (bi.a()[this.ordinal()]) {
            case 3: {
                return (n3 - n5) % n3;
            }
            case 2: {
                return (n4 - n5 + n3) % n3;
            }
        }
        return n2;
    }

    public bq a(ad ad2) {
        ae ae2 = ad2.l();
        return !(this == b && ae2 == ae.c || this == c && ae2 == ae.a) ? bq.a : bq.c;
    }

    public ad b(ad ad2) {
        switch (bi.a()[this.ordinal()]) {
            case 3: {
                if (ad2 == ad.e) {
                    return ad.f;
                }
                if (ad2 == ad.f) {
                    return ad.e;
                }
                return ad2;
            }
            case 2: {
                if (ad2 == ad.c) {
                    return ad.d;
                }
                if (ad2 == ad.d) {
                    return ad.c;
                }
                return ad2;
            }
        }
        return ad2;
    }

    static /* synthetic */ int[] a() {
        if (f != null) {
            return f;
        }
        int[] arrn = new int[bi.values().length];
        try {
            arrn[bi.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bi.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bi.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        f = arrn;
        return arrn;
    }
}

