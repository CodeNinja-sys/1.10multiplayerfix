/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.f.y;
import net.minecraft.g.a.h;
import net.minecraft.g.ap;
import net.minecraft.g.by;
import net.minecraft.g.c.b;
import net.minecraft.g.eu;
import net.minecraft.q.a.a.j;
import net.minecraft.q.g.c.aj;
import net.minecraft.q.g.c.ci;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.g.c.q;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.bp;
import net.minecraft.w.f.d;

public class av
extends q {
    private boolean d;
    private boolean e;
    private boolean f;
    private int g;
    private static /* synthetic */ int[] h;

    public av() {
    }

    @Override
    protected void a(e e2) {
        super.a(e2);
        e2.a("hr", this.d);
        e2.a("sc", this.e);
        e2.a("hps", this.f);
        e2.a("Num", this.g);
    }

    @Override
    protected void b(e e2) {
        super.b(e2);
        this.d = e2.p("hr");
        this.e = e2.p("sc");
        this.f = e2.p("hps");
        this.g = e2.h("Num");
    }

    public av(int n2, Random random, dc dc2, ad ad2, aj aj2) {
        super(n2, aj2);
        this.a(ad2);
        this.b = dc2;
        this.d = random.nextInt(3) == 0;
        this.e = !this.d && random.nextInt(23) == 0;
        this.g = this.i().l() == ae.c ? dc2.e() / 5 : dc2.c() / 5;
    }

    public static dc a(List list, Random random, int n2, int n3, int n4, ad ad2) {
        int n5;
        dc dc2 = new dc(n2, n3, n4, n2, n3 + 2, n4);
        for (n5 = random.nextInt(3) + 2; n5 > 0; --n5) {
            int n6 = n5 * 5;
            switch (av.a()[ad2.ordinal()]) {
                default: {
                    dc2.d = n2 + 2;
                    dc2.c = n4 - (n6 - 1);
                    break;
                }
                case 4: {
                    dc2.d = n2 + 2;
                    dc2.f = n4 + (n6 - 1);
                    break;
                }
                case 5: {
                    dc2.a = n2 - (n6 - 1);
                    dc2.f = n4 + 2;
                    break;
                }
                case 6: {
                    dc2.d = n2 + (n6 - 1);
                    dc2.f = n4 + 2;
                }
            }
            if (r.a(list, dc2) == null) break;
        }
        return n5 > 0 ? dc2 : null;
    }

    @Override
    public void a(r r2, List list, Random random) {
        block24: {
            int n2 = this.g();
            int n3 = random.nextInt(4);
            ad ad2 = this.i();
            if (ad2 != null) {
                switch (av.a()[ad2.ordinal()]) {
                    default: {
                        if (n3 <= 1) {
                            ci.a(r2, list, random, this.b.a, this.b.b - 1 + random.nextInt(3), this.b.c - 1, ad2, n2);
                            break;
                        }
                        if (n3 == 2) {
                            ci.a(r2, list, random, this.b.a - 1, this.b.b - 1 + random.nextInt(3), this.b.c, ad.e, n2);
                            break;
                        }
                        ci.a(r2, list, random, this.b.d + 1, this.b.b - 1 + random.nextInt(3), this.b.c, ad.f, n2);
                        break;
                    }
                    case 4: {
                        if (n3 <= 1) {
                            ci.a(r2, list, random, this.b.a, this.b.b - 1 + random.nextInt(3), this.b.f + 1, ad2, n2);
                            break;
                        }
                        if (n3 == 2) {
                            ci.a(r2, list, random, this.b.a - 1, this.b.b - 1 + random.nextInt(3), this.b.f - 3, ad.e, n2);
                            break;
                        }
                        ci.a(r2, list, random, this.b.d + 1, this.b.b - 1 + random.nextInt(3), this.b.f - 3, ad.f, n2);
                        break;
                    }
                    case 5: {
                        if (n3 <= 1) {
                            ci.a(r2, list, random, this.b.a - 1, this.b.b - 1 + random.nextInt(3), this.b.c, ad2, n2);
                            break;
                        }
                        if (n3 == 2) {
                            ci.a(r2, list, random, this.b.a, this.b.b - 1 + random.nextInt(3), this.b.c - 1, ad.c, n2);
                            break;
                        }
                        ci.a(r2, list, random, this.b.a, this.b.b - 1 + random.nextInt(3), this.b.f + 1, ad.d, n2);
                        break;
                    }
                    case 6: {
                        if (n3 <= 1) {
                            ci.a(r2, list, random, this.b.d + 1, this.b.b - 1 + random.nextInt(3), this.b.c, ad2, n2);
                            break;
                        }
                        if (n3 == 2) {
                            ci.a(r2, list, random, this.b.d - 3, this.b.b - 1 + random.nextInt(3), this.b.c - 1, ad.c, n2);
                            break;
                        }
                        ci.a(r2, list, random, this.b.d - 3, this.b.b - 1 + random.nextInt(3), this.b.f + 1, ad.d, n2);
                    }
                }
            }
            if (n2 >= 8) break block24;
            if (ad2 != ad.c && ad2 != ad.d) {
                int n4 = this.b.a + 3;
                while (n4 + 3 <= this.b.d) {
                    int n5 = random.nextInt(5);
                    if (n5 == 0) {
                        ci.a(r2, list, random, n4, this.b.b, this.b.c - 1, ad.c, n2 + 1);
                    } else if (n5 == 1) {
                        ci.a(r2, list, random, n4, this.b.b, this.b.f + 1, ad.d, n2 + 1);
                    }
                    n4 += 5;
                }
            } else {
                int n6 = this.b.c + 3;
                while (n6 + 3 <= this.b.f) {
                    int n7 = random.nextInt(5);
                    if (n7 == 0) {
                        ci.a(r2, list, random, this.b.a - 1, this.b.b, n6, ad.e, n2 + 1);
                    } else if (n7 == 1) {
                        ci.a(r2, list, random, this.b.d + 1, this.b.b, n6, ad.f, n2 + 1);
                    }
                    n6 += 5;
                }
            }
        }
    }

    @Override
    protected boolean a(k k2, dc dc2, Random random, int n2, int n3, int n4, bp bp2) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(this.a(n2, n4), this.a(n3), this.b(n2, n4));
        if (dc2.a(b2) && k2.n(b2).d() == net.minecraft.g.a.h.a && k2.n(b2.c()).d() != net.minecraft.g.a.h.a) {
            b b3 = p.av.v().a(eu.a, (Comparable)((Object)(random.nextBoolean() ? by.a : by.b)));
            this.a(k2, b3, n2, n3, n4, dc2);
            d d2 = new d(k2, (float)b2.cy_() + 0.5f, (float)b2.k() + 0.5f, (float)b2.l() + 0.5f);
            d2.a(bp2, random.nextLong());
            k2.a(d2);
            return true;
        }
        return false;
    }

    @Override
    public boolean a(k k2, Random random, dc dc2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (this.a(k2, dc2)) {
            return false;
        }
        boolean bl2 = false;
        int n6 = 2;
        boolean bl3 = false;
        int n7 = 2;
        int n8 = this.g * 5 - 1;
        b b2 = this.b();
        this.a(k2, dc2, 0, 0, 0, 2, 1, n8, p.a.v(), p.a.v(), false);
        this.a(k2, dc2, random, 0.8f, 0, 2, 0, 2, 2, n8, p.a.v(), p.a.v(), false, 0);
        if (this.e) {
            this.a(k2, dc2, random, 0.6f, 0, 0, 0, 2, 1, n8, p.G.v(), p.a.v(), false, 8);
        }
        for (n5 = 0; n5 < this.g; ++n5) {
            int n9;
            n4 = 2 + n5 * 5;
            this.a(k2, dc2, 0, 0, n4, 2, 2, random);
            this.a(k2, dc2, random, 0.1f, 0, 2, n4 - 1);
            this.a(k2, dc2, random, 0.1f, 2, 2, n4 - 1);
            this.a(k2, dc2, random, 0.1f, 0, 2, n4 + 1);
            this.a(k2, dc2, random, 0.1f, 2, 2, n4 + 1);
            this.a(k2, dc2, random, 0.05f, 0, 2, n4 - 2);
            this.a(k2, dc2, random, 0.05f, 2, 2, n4 - 2);
            this.a(k2, dc2, random, 0.05f, 0, 2, n4 + 2);
            this.a(k2, dc2, random, 0.05f, 2, 2, n4 + 2);
            if (random.nextInt(100) == 0) {
                this.a(k2, dc2, random, 2, 0, n4 - 1, j.f);
            }
            if (random.nextInt(100) == 0) {
                this.a(k2, dc2, random, 0, 0, n4 + 1, j.f);
            }
            if (!this.e || this.f) continue;
            n3 = this.a(0);
            int n10 = n4 - 1 + random.nextInt(3);
            n2 = this.a(1, n10);
            net.minecraft.u.b.b b3 = new net.minecraft.u.b.b(n2, n3, n9 = this.b(1, n10));
            if (!dc2.a(b3) || this.b(k2, 1, 0, n10, dc2) >= 8) continue;
            this.f = true;
            k2.a(b3, p.ac.v(), 2);
            net.minecraft.f.ap ap2 = k2.q(b3);
            if (!(ap2 instanceof y)) continue;
            ((y)ap2).b().a("CaveSpider");
        }
        for (n5 = 0; n5 <= 2; ++n5) {
            for (n4 = 0; n4 <= n8; ++n4) {
                n3 = -1;
                b b4 = this.a(k2, n5, -1, n4, dc2);
                if (b4.d() != net.minecraft.g.a.h.a || this.b(k2, n5, -1, n4, dc2) >= 8) continue;
                n2 = -1;
                this.a(k2, b2, n5, -1, n4, dc2);
            }
        }
        if (this.d) {
            b b5 = p.av.v().a(eu.a, (Comparable)((Object)by.a));
            for (n4 = 0; n4 <= n8; ++n4) {
                b b6 = this.a(k2, 1, -1, n4, dc2);
                if (b6.d() == net.minecraft.g.a.h.a || !b6.e()) continue;
                float f2 = this.b(k2, 1, 0, n4, dc2) > 8 ? 0.9f : 0.7f;
                this.a(k2, dc2, random, f2, 1, 0, n4, b5);
            }
        }
        return true;
    }

    private void a(k k2, dc dc2, int n2, int n3, int n4, int n5, int n6, Random random) {
        if (this.a(k2, dc2, n2, n6, n5, n4)) {
            b b2 = this.b();
            b b3 = this.c();
            b b4 = p.a.v();
            this.a(k2, dc2, n2, n3, n4, n2, n5 - 1, n4, b3, b4, false);
            this.a(k2, dc2, n6, n3, n4, n6, n5 - 1, n4, b3, b4, false);
            if (random.nextInt(4) == 0) {
                this.a(k2, dc2, n2, n5, n4, n2, n5, n4, b2, b4, false);
                this.a(k2, dc2, n6, n5, n4, n6, n5, n4, b2, b4, false);
            } else {
                this.a(k2, dc2, n2, n5, n4, n6, n5, n4, b2, b4, false);
                this.a(k2, dc2, random, 0.05f, n2 + 1, n5, n4 - 1, p.aa.v().a(ap.a, (Comparable)((Object)ad.c)));
                this.a(k2, dc2, random, 0.05f, n2 + 1, n5, n4 + 1, p.aa.v().a(ap.a, (Comparable)((Object)ad.d)));
            }
        }
    }

    private void a(k k2, dc dc2, Random random, float f2, int n2, int n3, int n4) {
        if (this.b(k2, n2, n3, n4, dc2) < 8) {
            this.a(k2, dc2, random, f2, n2, n3, n4, p.G.v());
        }
    }

    static /* synthetic */ int[] a() {
        if (h != null) {
            return h;
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
        h = arrn;
        return arrn;
    }
}

