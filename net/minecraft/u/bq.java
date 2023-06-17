/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.u.ad;
import net.minecraft.u.ae;

public enum bq {
    a("rotate_0"),
    b("rotate_90"),
    c("rotate_180"),
    d("rotate_270");

    private final String e;
    private static final String[] f;
    private static /* synthetic */ int[] g;

    static {
        f = new String[bq.values().length];
        int n2 = 0;
        for (bq bq2 : bq.values()) {
            bq.f[n2++] = bq2.e;
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bq() {
        void var3_1;
        this.e = var3_1;
    }

    public bq a(bq bq2) {
        switch (bq.a()[bq2.ordinal()]) {
            case 3: {
                switch (bq.a()[this.ordinal()]) {
                    case 1: {
                        return c;
                    }
                    case 2: {
                        return d;
                    }
                    case 3: {
                        return a;
                    }
                    case 4: {
                        return b;
                    }
                }
            }
            case 4: {
                switch (bq.a()[this.ordinal()]) {
                    case 1: {
                        return d;
                    }
                    case 2: {
                        return a;
                    }
                    case 3: {
                        return b;
                    }
                    case 4: {
                        return c;
                    }
                }
            }
            case 2: {
                switch (bq.a()[this.ordinal()]) {
                    case 1: {
                        return b;
                    }
                    case 2: {
                        return c;
                    }
                    case 3: {
                        return d;
                    }
                    case 4: {
                        return a;
                    }
                }
            }
        }
        return this;
    }

    public ad a(ad ad2) {
        if (ad2.l() == ae.b) {
            return ad2;
        }
        switch (bq.a()[this.ordinal()]) {
            case 2: {
                return ad2.f();
            }
            case 3: {
                return ad2.e();
            }
            case 4: {
                return ad2.g();
            }
        }
        return ad2;
    }

    public int a(int n2, int n3) {
        switch (bq.a()[this.ordinal()]) {
            case 2: {
                return (n2 + n3 / 4) % n3;
            }
            case 3: {
                return (n2 + n3 / 2) % n3;
            }
            case 4: {
                return (n2 + n3 * 3 / 4) % n3;
            }
        }
        return n2;
    }

    static /* synthetic */ int[] a() {
        if (g != null) {
            return g;
        }
        int[] arrn = new int[bq.values().length];
        try {
            arrn[bq.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[bq.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        g = arrn;
        return arrn;
    }
}

