/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.bm;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.em;
import net.minecraft.g.m;
import net.minecraft.g.s;
import net.minecraft.q.g.a.q;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.g;

public class x
extends q {
    private static final b a = p.r.v().a(s.a, (Comparable)((Object)net.minecraft.g.b.a));
    private static final b b = p.t.v().a(m.a, (Comparable)((Object)net.minecraft.g.b.a)).a(bm.c, Boolean.valueOf(false));
    private final int c;
    private final boolean d;
    private final b e;
    private final b f;

    public x(boolean bl2) {
        this(bl2, 4, a, b, false);
    }

    public x(boolean bl2, int n2, b b2, b b3, boolean bl3) {
        super(bl2);
        this.c = n2;
        this.e = b2;
        this.f = b3;
        this.d = bl3;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2 = random.nextInt(3) + this.c;
        boolean bl2 = true;
        if (b2.k() >= 1 && b2.k() + n2 + 1 <= 256) {
            int n3;
            int n4;
            int n5;
            for (int i2 = b2.k(); i2 <= b2.k() + 1 + n2; ++i2) {
                n5 = 1;
                if (i2 == b2.k()) {
                    n5 = 0;
                }
                if (i2 >= b2.k() + 1 + n2 - 2) {
                    n5 = 2;
                }
                g g2 = new g();
                for (n4 = b2.cy_() - n5; n4 <= b2.cy_() + n5 && bl2; ++n4) {
                    for (n3 = b2.l() - n5; n3 <= b2.l() + n5 && bl2; ++n3) {
                        if (i2 >= 0 && i2 < 256) {
                            if (this.a(k2.n(g2.b(n4, i2, n3)).c())) continue;
                            bl2 = false;
                            continue;
                        }
                        bl2 = false;
                    }
                }
            }
            if (!bl2) {
                return false;
            }
            cn cn2 = k2.n(b2.c()).c();
            if ((cn2 == p.c || cn2 == p.d || cn2 == p.ak) && b2.k() < 256 - n2 - 1) {
                net.minecraft.u.b.b b3;
                Object object;
                int n6;
                int n7;
                int n8;
                this.a(k2, b2.c());
                n5 = 3;
                boolean bl3 = false;
                for (n4 = b2.k() - 3 + n2; n4 <= b2.k() + n2; ++n4) {
                    n3 = n4 - (b2.k() + n2);
                    n8 = 1 - n3 / 2;
                    for (int i3 = b2.cy_() - n8; i3 <= b2.cy_() + n8; ++i3) {
                        n7 = i3 - b2.cy_();
                        for (n6 = b2.l() - n8; n6 <= b2.l() + n8; ++n6) {
                            int n9 = n6 - b2.l();
                            if (Math.abs(n7) == n8 && Math.abs(n9) == n8 && (random.nextInt(2) == 0 || n3 == 0) || (object = k2.n(b3 = new net.minecraft.u.b.b(i3, n4, n6)).d()) != h.a && object != h.j && object != h.l) continue;
                            this.a(k2, b3, this.f);
                        }
                    }
                }
                for (n4 = 0; n4 < n2; ++n4) {
                    h h2 = k2.n(b2.a(n4)).d();
                    if (h2 != h.a && h2 != h.j && h2 != h.l) continue;
                    this.a(k2, b2.a(n4), this.e);
                    if (!this.d || n4 <= 0) continue;
                    if (random.nextInt(3) > 0 && k2.c(b2.a(-1, n4, 0))) {
                        this.a(k2, b2.a(-1, n4, 0), em.c);
                    }
                    if (random.nextInt(3) > 0 && k2.c(b2.a(1, n4, 0))) {
                        this.a(k2, b2.a(1, n4, 0), em.e);
                    }
                    if (random.nextInt(3) > 0 && k2.c(b2.a(0, n4, -1))) {
                        this.a(k2, b2.a(0, n4, -1), em.d);
                    }
                    if (random.nextInt(3) <= 0 || !k2.c(b2.a(0, n4, 1))) continue;
                    this.a(k2, b2.a(0, n4, 1), em.b);
                }
                if (this.d) {
                    for (n4 = b2.k() - 3 + n2; n4 <= b2.k() + n2; ++n4) {
                        int n10 = n4 - (b2.k() + n2);
                        n8 = 2 - n10 / 2;
                        g g3 = new g();
                        for (n7 = b2.cy_() - n8; n7 <= b2.cy_() + n8; ++n7) {
                            for (n6 = b2.l() - n8; n6 <= b2.l() + n8; ++n6) {
                                g3.b(n7, n4, n6);
                                if (k2.n(g3).d() != h.j) continue;
                                net.minecraft.u.b.b b4 = g3.f();
                                b3 = g3.g();
                                object = g3.d();
                                net.minecraft.u.b.b b5 = g3.e();
                                if (random.nextInt(4) == 0 && k2.n(b4).d() == h.a) {
                                    this.b(k2, b4, em.c);
                                }
                                if (random.nextInt(4) == 0 && k2.n(b3).d() == h.a) {
                                    this.b(k2, b3, em.e);
                                }
                                if (random.nextInt(4) == 0 && k2.n((net.minecraft.u.b.b)object).d() == h.a) {
                                    this.b(k2, (net.minecraft.u.b.b)object, em.d);
                                }
                                if (random.nextInt(4) != 0 || k2.n(b5).d() != h.a) continue;
                                this.b(k2, b5, em.b);
                            }
                        }
                    }
                    if (random.nextInt(5) == 0 && n2 > 5) {
                        for (n4 = 0; n4 < 2; ++n4) {
                            for (ad ad2 : ag.a) {
                                if (random.nextInt(4 - n4) != 0) continue;
                                ad ad3 = ad2.e();
                                this.a(k2, random.nextInt(3), b2.a(ad3.h(), n2 - 5 + n4, ad3.j()), ad2);
                            }
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private void a(k k2, int n2, net.minecraft.u.b.b b2, ad ad2) {
        this.a(k2, b2, p.bN.v().a(net.minecraft.g.x.a, Integer.valueOf(n2)).a(net.minecraft.g.x.j, (Comparable)((Object)ad2)));
    }

    private void a(k k2, net.minecraft.u.b.b b2, c c2) {
        this.a(k2, b2, p.bn.v().a(c2, Boolean.valueOf(true)));
    }

    private void b(k k2, net.minecraft.u.b.b b2, c c2) {
        this.a(k2, b2, c2);
        b2 = b2.c();
        for (int i2 = 4; k2.n(b2).d() == h.a && i2 > 0; --i2) {
            this.a(k2, b2, c2);
            b2 = b2.c();
        }
    }
}

