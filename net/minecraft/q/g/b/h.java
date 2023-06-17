/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.b;

import net.minecraft.q.g.b.g;
import net.minecraft.q.g.b.l;
import net.minecraft.q.g.b.p;

public class h
extends g {
    private final l c;
    private static /* synthetic */ int[] d;

    public h(long l2, g g2, l l3) {
        super(l2);
        this.a = g2;
        this.c = l3;
    }

    @Override
    public int[] a(int n2, int n3, int n4, int n5) {
        switch (h.a()[this.c.ordinal()]) {
            default: {
                return this.c(n2, n3, n4, n5);
            }
            case 2: {
                return this.d(n2, n3, n4, n5);
            }
            case 3: 
        }
        return this.e(n2, n3, n4, n5);
    }

    private int[] c(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = 1 + n4 + 1;
        int n9 = 1 + n5 + 1;
        int[] arrn = this.a.a(n6, n7, n8, n9);
        int[] arrn2 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n10 = arrn[i3 + 1 + (i2 + 1) * n8];
                if (n10 == 1) {
                    boolean bl2;
                    int n11 = arrn[i3 + 1 + (i2 + 1 - 1) * n8];
                    int n12 = arrn[i3 + 1 + 1 + (i2 + 1) * n8];
                    int n13 = arrn[i3 + 1 - 1 + (i2 + 1) * n8];
                    int n14 = arrn[i3 + 1 + (i2 + 1 + 1) * n8];
                    boolean bl3 = n11 == 3 || n12 == 3 || n13 == 3 || n14 == 3;
                    boolean bl4 = bl2 = n11 == 4 || n12 == 4 || n13 == 4 || n14 == 4;
                    if (bl3 || bl2) {
                        n10 = 2;
                    }
                }
                arrn2[i3 + i2 * n4] = n10;
            }
        }
        return arrn2;
    }

    private int[] d(int n2, int n3, int n4, int n5) {
        int n6 = n2 - 1;
        int n7 = n3 - 1;
        int n8 = 1 + n4 + 1;
        int n9 = 1 + n5 + 1;
        int[] arrn = this.a.a(n6, n7, n8, n9);
        int[] arrn2 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                int n10 = arrn[i3 + 1 + (i2 + 1) * n8];
                if (n10 == 4) {
                    boolean bl2;
                    int n11 = arrn[i3 + 1 + (i2 + 1 - 1) * n8];
                    int n12 = arrn[i3 + 1 + 1 + (i2 + 1) * n8];
                    int n13 = arrn[i3 + 1 - 1 + (i2 + 1) * n8];
                    int n14 = arrn[i3 + 1 + (i2 + 1 + 1) * n8];
                    boolean bl3 = n11 == 2 || n12 == 2 || n13 == 2 || n14 == 2;
                    boolean bl4 = bl2 = n11 == 1 || n12 == 1 || n13 == 1 || n14 == 1;
                    if (bl2 || bl3) {
                        n10 = 3;
                    }
                }
                arrn2[i3 + i2 * n4] = n10;
            }
        }
        return arrn2;
    }

    private int[] e(int n2, int n3, int n4, int n5) {
        int[] arrn = this.a.a(n2, n3, n4, n5);
        int[] arrn2 = p.a(n4 * n5);
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = 0; i3 < n4; ++i3) {
                this.a((long)(i3 + n2), (long)(i2 + n3));
                int n6 = arrn[i3 + i2 * n4];
                if (n6 != 0 && this.a(13) == 0) {
                    n6 |= 1 + this.a(15) << 8 & 0xF00;
                }
                arrn2[i3 + i2 * n4] = n6;
            }
        }
        return arrn2;
    }

    static /* synthetic */ int[] a() {
        if (d != null) {
            return d;
        }
        int[] arrn = new int[l.values().length];
        try {
            arrn[l.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[l.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[l.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        d = arrn;
        return arrn;
    }
}

