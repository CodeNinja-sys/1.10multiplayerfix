/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.g.c.b;
import net.minecraft.q.g.c.ak;
import net.minecraft.q.g.c.aw;
import net.minecraft.q.g.c.bg;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.n;

public class bz
extends bg {
    private int a;
    private static /* synthetic */ int[] d;

    public bz() {
    }

    public bz(ak ak2, int n2, Random random, dc dc2, ad ad2) {
        super(ak2, n2);
        this.a(ad2);
        this.b = dc2;
        this.a = Math.max(dc2.c(), dc2.e());
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("Length", this.a);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.a = e2.h("Length");
    }

    @Override
    public void a(r r2, List list, Random random) {
        r r3;
        int n2;
        boolean bl2 = false;
        for (n2 = random.nextInt(5); n2 < this.a - 8; n2 += 2 + random.nextInt(5)) {
            r3 = this.a((ak)r2, list, random, 0, n2);
            if (r3 == null) continue;
            n2 += Math.max(r3.b.c(), r3.b.e());
            bl2 = true;
        }
        for (n2 = random.nextInt(5); n2 < this.a - 8; n2 += 2 + random.nextInt(5)) {
            r3 = this.b((ak)r2, list, random, 0, n2);
            if (r3 == null) continue;
            n2 += Math.max(r3.b.c(), r3.b.e());
            bl2 = true;
        }
        ad ad2 = this.i();
        if (bl2 && random.nextInt(3) > 0 && ad2 != null) {
            switch (bz.a()[ad2.ordinal()]) {
                default: {
                    aw.a((ak)r2, list, random, this.b.a - 1, this.b.b, this.b.c, ad.e, this.g());
                    break;
                }
                case 4: {
                    aw.a((ak)r2, list, random, this.b.a - 1, this.b.b, this.b.f - 2, ad.e, this.g());
                    break;
                }
                case 5: {
                    aw.a((ak)r2, list, random, this.b.a, this.b.b, this.b.c - 1, ad.c, this.g());
                    break;
                }
                case 6: {
                    aw.a((ak)r2, list, random, this.b.d - 2, this.b.b, this.b.c - 1, ad.c, this.g());
                }
            }
        }
        if (bl2 && random.nextInt(3) > 0 && ad2 != null) {
            switch (bz.a()[ad2.ordinal()]) {
                default: {
                    aw.a((ak)r2, list, random, this.b.d + 1, this.b.b, this.b.c, ad.f, this.g());
                    break;
                }
                case 4: {
                    aw.a((ak)r2, list, random, this.b.d + 1, this.b.b, this.b.f - 2, ad.f, this.g());
                    break;
                }
                case 5: {
                    aw.a((ak)r2, list, random, this.b.a, this.b.b, this.b.f + 1, ad.d, this.g());
                    break;
                }
                case 6: {
                    aw.a((ak)r2, list, random, this.b.d - 2, this.b.b, this.b.f + 1, ad.d, this.g());
                }
            }
        }
    }

    public static dc a(ak ak2, List list, Random random, int n2, int n3, int n4, ad ad2) {
        for (int i2 = 7 * n.a(random, 3, 5); i2 >= 7; i2 -= 7) {
            dc dc2 = dc.a(n2, n3, n4, 0, 0, 0, 3, 3, i2, ad2);
            if (r.a(list, dc2) != null) continue;
            return dc2;
        }
        return null;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        b b2 = this.a(p.da.v());
        b b3 = this.a(p.f.v());
        b b4 = this.a(p.n.v());
        b b5 = this.a(p.e.v());
        for (int i2 = this.b.a; i2 <= this.b.d; ++i2) {
            block1: for (int i3 = this.b.c; i3 <= this.b.f; ++i3) {
                net.minecraft.u.b.b b6 = new net.minecraft.u.b.b(i2, 64, i3);
                if (!dc2.a(b6)) continue;
                if ((b6 = k2.p(b6).c()).k() < k2.x()) {
                    b6 = new net.minecraft.u.b.b(b6.cy_(), k2.x() - 1, b6.l());
                }
                while (b6.k() >= k2.x() - 1) {
                    b b7 = k2.n(b6);
                    if (b7.c() == p.c && k2.c(b6.b())) {
                        k2.a(b6, b2, 2);
                        continue block1;
                    }
                    if (b7.d().d()) {
                        k2.a(b6, b3, 2);
                        continue block1;
                    }
                    if (b7.c() == p.m || b7.c() == p.A || b7.c() == p.cM) {
                        k2.a(b6, b4, 2);
                        k2.a(b6.c(), b5, 2);
                        continue block1;
                    }
                    b6 = b6.c();
                }
            }
        }
        return true;
    }

    static /* synthetic */ int[] a() {
        if (d != null) {
            return d;
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
        d = arrn;
        return arrn;
    }
}

