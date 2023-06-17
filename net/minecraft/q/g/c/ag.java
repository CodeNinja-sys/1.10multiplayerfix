/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.fe;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.do;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.w.e.g;

public abstract class ag
extends r {
    protected static final b a = p.cI.a(fe.b);
    protected static final b d = p.cI.a(fe.c);
    protected static final b e = p.cI.a(fe.d);
    protected static final b f = d;
    protected static final b g = p.cJ.v();
    protected static final b h = p.j.v();
    protected static final int i = ag.b(2, 0, 0);
    protected static final int j = ag.b(2, 2, 0);
    protected static final int k = ag.b(0, 1, 0);
    protected static final int l = ag.b(4, 1, 0);
    protected do m;
    private static /* synthetic */ int[] n;

    protected static final int b(int n2, int n3, int n4) {
        return n3 * 25 + n4 * 5 + n2;
    }

    public ag() {
        super(0);
    }

    public ag(int n2) {
        super(n2);
    }

    public ag(ad ad2, dc dc2) {
        super(1);
        this.a(ad2);
        this.b = dc2;
    }

    protected ag(int n2, ad ad2, do do_, int n3, int n4, int n5) {
        super(n2);
        this.a(ad2);
        this.m = do_;
        int n6 = do_.a;
        int n7 = n6 % 5;
        int n8 = n6 / 5 % 5;
        int n9 = n6 / 25;
        this.b = ad2 != ad.c && ad2 != ad.d ? new dc(0, 0, 0, n5 * 8 - 1, n4 * 4 - 1, n3 * 8 - 1) : new dc(0, 0, 0, n3 * 8 - 1, n4 * 4 - 1, n5 * 8 - 1);
        switch (ag.a()[ad2.ordinal()]) {
            case 3: {
                this.b.a(n7 * 8, n9 * 4, -(n8 + n5) * 8 + 1);
                break;
            }
            case 4: {
                this.b.a(n7 * 8, n9 * 4, n8 * 8);
                break;
            }
            case 5: {
                this.b.a(-(n8 + n5) * 8 + 1, n9 * 4, n7 * 8);
                break;
            }
            default: {
                this.b.a(n8 * 8, n9 * 4, n7 * 8);
            }
        }
    }

    @Override
    protected void a(e e2) {
    }

    @Override
    protected void b(e e2) {
    }

    protected void a(k k2, dc dc2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(k2, i3, i2, i4, dc2).d() == net.minecraft.g.a.h.a) continue;
                    if (this.a(i2) >= k2.x()) {
                        this.a(k2, p.a.v(), i3, i2, i4, dc2);
                        continue;
                    }
                    this.a(k2, h, i3, i2, i4, dc2);
                }
            }
        }
    }

    protected void a(k k2, dc dc2, int n2, int n3, boolean bl2) {
        if (bl2) {
            this.a(k2, dc2, n2 + 0, 0, n3 + 0, n2 + 2, 0, n3 + 8 - 1, a, a, false);
            this.a(k2, dc2, n2 + 5, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, a, a, false);
            this.a(k2, dc2, n2 + 3, 0, n3 + 0, n2 + 4, 0, n3 + 2, a, a, false);
            this.a(k2, dc2, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 8 - 1, a, a, false);
            this.a(k2, dc2, n2 + 3, 0, n3 + 2, n2 + 4, 0, n3 + 2, d, d, false);
            this.a(k2, dc2, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 5, d, d, false);
            this.a(k2, dc2, n2 + 2, 0, n3 + 3, n2 + 2, 0, n3 + 4, d, d, false);
            this.a(k2, dc2, n2 + 5, 0, n3 + 3, n2 + 5, 0, n3 + 4, d, d, false);
        } else {
            this.a(k2, dc2, n2 + 0, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, a, a, false);
        }
    }

    protected void a(k k2, dc dc2, int n2, int n3, int n4, int n5, int n6, int n7, b b2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (this.a(k2, i3, i2, i4, dc2) != h) continue;
                    this.a(k2, b2, i3, i2, i4, dc2);
                }
            }
        }
    }

    protected boolean a(dc dc2, int n2, int n3, int n4, int n5) {
        int n6 = this.a(n2, n3);
        int n7 = this.b(n2, n3);
        int n8 = this.a(n4, n5);
        int n9 = this.b(n4, n5);
        return dc2.a(Math.min(n6, n8), Math.min(n7, n9), Math.max(n6, n8), Math.max(n7, n9));
    }

    protected boolean a(k k2, dc dc2, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        if (dc2.a(new net.minecraft.u.b.b(n7, n6 = this.a(n3), n5 = this.b(n2, n4)))) {
            g g2 = new g(k2);
            g2.a(true);
            g2.a(g2.bw());
            g2.b((double)n7 + 0.5, n6, (double)n5 + 0.5, 0.0f, 0.0f);
            g2.a(k2.C(new net.minecraft.u.b.b(g2)), null);
            k2.a(g2);
            return true;
        }
        return false;
    }

    static /* synthetic */ int[] a() {
        if (n != null) {
            return n;
        }
        int[] arrn = new int[ad.values().length];
        try {
            arrn[ad.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[ad.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        n = arrn;
        return arrn;
    }
}

