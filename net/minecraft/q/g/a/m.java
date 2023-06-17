/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.bm;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.es;
import net.minecraft.g.gu;
import net.minecraft.q.g.a.q;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.g;

public class m
extends q {
    private static final b a = p.s.v().a(es.a, (Comparable)((Object)net.minecraft.g.b.e));
    private static final b b = p.u.v().a(gu.a, (Comparable)((Object)net.minecraft.g.b.e)).a(bm.c, Boolean.valueOf(false));

    public m(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2 = random.nextInt(3) + random.nextInt(3) + 5;
        boolean bl2 = true;
        if (b2.k() >= 1 && b2.k() + n2 + 1 <= 256) {
            int n3;
            int n4;
            for (int i2 = b2.k(); i2 <= b2.k() + 1 + n2; ++i2) {
                int n5 = 1;
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
            if ((cn2 == p.c || cn2 == p.d) && b2.k() < 256 - n2 - 1) {
                int n6;
                this.a(k2, b2.c());
                ad ad2 = ag.a.a(random);
                int n7 = n2 - random.nextInt(4) - 1;
                n4 = 3 - random.nextInt(3);
                n3 = b2.cy_();
                int n8 = b2.l();
                int n9 = 0;
                for (int i3 = 0; i3 < n2; ++i3) {
                    net.minecraft.u.b.b b3;
                    h h2;
                    n6 = b2.k() + i3;
                    if (i3 >= n7 && n4 > 0) {
                        n3 += ad2.h();
                        n8 += ad2.j();
                        --n4;
                    }
                    if ((h2 = k2.n(b3 = new net.minecraft.u.b.b(n3, n6, n8)).d()) != h.a && h2 != h.j) continue;
                    this.b(k2, b3);
                    n9 = n6;
                }
                net.minecraft.u.b.b b4 = new net.minecraft.u.b.b(n3, n9, n8);
                for (n6 = -3; n6 <= 3; ++n6) {
                    for (int i4 = -3; i4 <= 3; ++i4) {
                        if (Math.abs(n6) == 3 && Math.abs(i4) == 3) continue;
                        this.c(k2, b4.a(n6, 0, i4));
                    }
                }
                b4 = b4.b();
                for (n6 = -1; n6 <= 1; ++n6) {
                    for (int i5 = -1; i5 <= 1; ++i5) {
                        this.c(k2, b4.a(n6, 0, i5));
                    }
                }
                this.c(k2, b4.f(2));
                this.c(k2, b4.e(2));
                this.c(k2, b4.d(2));
                this.c(k2, b4.c(2));
                n3 = b2.cy_();
                n8 = b2.l();
                ad ad3 = ag.a.a(random);
                if (ad3 != ad2) {
                    int n10;
                    int n11 = n7 - random.nextInt(2) - 1;
                    int n12 = 1 + random.nextInt(3);
                    n9 = 0;
                    for (int i6 = n11; i6 < n2 && n12 > 0; ++i6, --n12) {
                        if (i6 < 1) continue;
                        n10 = b2.k() + i6;
                        net.minecraft.u.b.b b5 = new net.minecraft.u.b.b(n3 += ad3.h(), n10, n8 += ad3.j());
                        h h3 = k2.n(b5).d();
                        if (h3 != h.a && h3 != h.j) continue;
                        this.b(k2, b5);
                        n9 = n10;
                    }
                    if (n9 > 0) {
                        net.minecraft.u.b.b b6 = new net.minecraft.u.b.b(n3, n9, n8);
                        for (n10 = -2; n10 <= 2; ++n10) {
                            for (int i7 = -2; i7 <= 2; ++i7) {
                                if (Math.abs(n10) == 2 && Math.abs(i7) == 2) continue;
                                this.c(k2, b6.a(n10, 0, i7));
                            }
                        }
                        b6 = b6.b();
                        for (n10 = -1; n10 <= 1; ++n10) {
                            for (int i8 = -1; i8 <= 1; ++i8) {
                                this.c(k2, b6.a(n10, 0, i8));
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

    private void b(k k2, net.minecraft.u.b.b b2) {
        this.a(k2, b2, a);
    }

    private void c(k k2, net.minecraft.u.b.b b2) {
        h h2 = k2.n(b2).d();
        if (h2 == h.a || h2 == h.j) {
            this.a(k2, b2, b);
        }
    }
}

