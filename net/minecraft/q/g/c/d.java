/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.e.e;
import net.minecraft.q.g.c.al;
import net.minecraft.q.g.c.bu;
import net.minecraft.q.g.c.cc;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.o;
import net.minecraft.q.g.c.r;
import net.minecraft.u.ad;

abstract class d
extends r {
    private static /* synthetic */ int[] a;

    public d() {
    }

    protected d(int n2) {
        super(n2);
    }

    @Override
    protected void b(e e2) {
    }

    @Override
    protected void a(e e2) {
    }

    private int a(List list) {
        boolean bl2 = false;
        int n2 = 0;
        for (o o2 : list) {
            if (o2.d > 0 && o2.c < o2.d) {
                bl2 = true;
            }
            n2 += o2.b;
        }
        return bl2 ? n2 : -1;
    }

    private d a(cc cc2, List list, List list2, Random random, int n2, int n3, int n4, ad ad2, int n5) {
        int n6 = this.a(list);
        boolean bl2 = n6 > 0 && n5 <= 30;
        int n7 = 0;
        block0: while (n7 < 5 && bl2) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (o o2 : list) {
                if ((n8 -= o2.b) >= 0) continue;
                if (!o2.a(n5) || o2 == cc2.a && !o2.e) continue block0;
                d d2 = bu.a(o2, list2, random, n2, n3, n4, ad2, n5);
                if (d2 == null) continue;
                ++o2.c;
                cc2.a = o2;
                if (!o2.a()) {
                    list.remove(o2);
                }
                return d2;
            }
        }
        return al.a(list2, random, n2, n3, n4, ad2, n5);
    }

    private r a(cc cc2, List list, Random random, int n2, int n3, int n4, ad ad2, int n5, boolean bl2) {
        if (Math.abs(n2 - cc2.f().a) <= 112 && Math.abs(n4 - cc2.f().c) <= 112) {
            d d2;
            List list2 = cc2.d;
            if (bl2) {
                list2 = cc2.e;
            }
            if ((d2 = this.a(cc2, list2, list, random, n2, n3, n4, ad2, n5 + 1)) != null) {
                list.add(d2);
                cc2.f.add(d2);
            }
            return d2;
        }
        return al.a(list, random, n2, n3, n4, ad2, n5);
    }

    protected r a(cc cc2, List list, Random random, int n2, int n3, boolean bl2) {
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (d.a()[ad2.ordinal()]) {
                case 3: {
                    return this.a(cc2, list, random, this.b.a + n2, this.b.b + n3, this.b.c - 1, ad2, this.g(), bl2);
                }
                case 4: {
                    return this.a(cc2, list, random, this.b.a + n2, this.b.b + n3, this.b.f + 1, ad2, this.g(), bl2);
                }
                case 5: {
                    return this.a(cc2, list, random, this.b.a - 1, this.b.b + n3, this.b.c + n2, ad2, this.g(), bl2);
                }
                case 6: {
                    return this.a(cc2, list, random, this.b.d + 1, this.b.b + n3, this.b.c + n2, ad2, this.g(), bl2);
                }
            }
        }
        return null;
    }

    protected r b(cc cc2, List list, Random random, int n2, int n3, boolean bl2) {
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (d.a()[ad2.ordinal()]) {
                case 3: {
                    return this.a(cc2, list, random, this.b.a - 1, this.b.b + n2, this.b.c + n3, ad.e, this.g(), bl2);
                }
                case 4: {
                    return this.a(cc2, list, random, this.b.a - 1, this.b.b + n2, this.b.c + n3, ad.e, this.g(), bl2);
                }
                case 5: {
                    return this.a(cc2, list, random, this.b.a + n3, this.b.b + n2, this.b.c - 1, ad.c, this.g(), bl2);
                }
                case 6: {
                    return this.a(cc2, list, random, this.b.a + n3, this.b.b + n2, this.b.c - 1, ad.c, this.g(), bl2);
                }
            }
        }
        return null;
    }

    protected r c(cc cc2, List list, Random random, int n2, int n3, boolean bl2) {
        ad ad2 = this.i();
        if (ad2 != null) {
            switch (d.a()[ad2.ordinal()]) {
                case 3: {
                    return this.a(cc2, list, random, this.b.d + 1, this.b.b + n2, this.b.c + n3, ad.f, this.g(), bl2);
                }
                case 4: {
                    return this.a(cc2, list, random, this.b.d + 1, this.b.b + n2, this.b.c + n3, ad.f, this.g(), bl2);
                }
                case 5: {
                    return this.a(cc2, list, random, this.b.a + n3, this.b.b + n2, this.b.f + 1, ad.d, this.g(), bl2);
                }
                case 6: {
                    return this.a(cc2, list, random, this.b.a + n3, this.b.b + n2, this.b.f + 1, ad.d, this.g(), bl2);
                }
            }
        }
        return null;
    }

    protected static boolean a(dc dc2) {
        return dc2 != null && dc2.b > 10;
    }

    static /* synthetic */ int[] a() {
        if (a != null) {
            return a;
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
        a = arrn;
        return arrn;
    }
}

