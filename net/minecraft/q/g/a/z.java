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

public class z
extends q {
    private static final b a = p.s.v().a(es.a, (Comparable)((Object)net.minecraft.g.b.f));
    private static final b b = p.u.v().a(gu.a, (Comparable)((Object)net.minecraft.g.b.f)).a(bm.c, Boolean.valueOf(false));

    public z(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2 = random.nextInt(3) + random.nextInt(2) + 6;
        int n3 = b2.cy_();
        int n4 = b2.k();
        int n5 = b2.l();
        if (n4 >= 1 && n4 + n2 + 1 < 256) {
            int n6;
            int n7;
            net.minecraft.u.b.b b3 = b2.c();
            cn cn2 = k2.n(b3).c();
            if (cn2 != p.c && cn2 != p.d) {
                return false;
            }
            if (!this.a(k2, b2, n2)) {
                return false;
            }
            this.a(k2, b3);
            this.a(k2, b3.g());
            this.a(k2, b3.e());
            this.a(k2, b3.e().g());
            ad ad2 = ag.a.a(random);
            int n8 = n2 - random.nextInt(4);
            int n9 = 2 - random.nextInt(3);
            int n10 = n3;
            int n11 = n5;
            int n12 = n4 + n2 - 1;
            for (n7 = 0; n7 < n2; ++n7) {
                net.minecraft.u.b.b b4;
                h h2;
                if (n7 >= n8 && n9 > 0) {
                    n10 += ad2.h();
                    n11 += ad2.j();
                    --n9;
                }
                if ((h2 = k2.n(b4 = new net.minecraft.u.b.b(n10, n6 = n4 + n7, n11)).d()) != h.a && h2 != h.j) continue;
                this.b(k2, b4);
                this.b(k2, b4.g());
                this.b(k2, b4.e());
                this.b(k2, b4.g().e());
            }
            for (n7 = -2; n7 <= 0; ++n7) {
                for (n6 = -2; n6 <= 0; ++n6) {
                    int n13 = -1;
                    this.a(k2, n10 + n7, n12 + n13, n11 + n6);
                    this.a(k2, 1 + n10 - n7, n12 + n13, n11 + n6);
                    this.a(k2, n10 + n7, n12 + n13, 1 + n11 - n6);
                    this.a(k2, 1 + n10 - n7, n12 + n13, 1 + n11 - n6);
                    if (n7 <= -2 && n6 <= -1 || n7 == -1 && n6 == -2) continue;
                    n13 = 1;
                    this.a(k2, n10 + n7, n12 + n13, n11 + n6);
                    this.a(k2, 1 + n10 - n7, n12 + n13, n11 + n6);
                    this.a(k2, n10 + n7, n12 + n13, 1 + n11 - n6);
                    this.a(k2, 1 + n10 - n7, n12 + n13, 1 + n11 - n6);
                }
            }
            if (random.nextBoolean()) {
                this.a(k2, n10, n12 + 2, n11);
                this.a(k2, n10 + 1, n12 + 2, n11);
                this.a(k2, n10 + 1, n12 + 2, n11 + 1);
                this.a(k2, n10, n12 + 2, n11 + 1);
            }
            for (n7 = -3; n7 <= 4; ++n7) {
                for (n6 = -3; n6 <= 4; ++n6) {
                    if (n7 == -3 && n6 == -3 || n7 == -3 && n6 == 4 || n7 == 4 && n6 == -3 || n7 == 4 && n6 == 4 || Math.abs(n7) >= 3 && Math.abs(n6) >= 3) continue;
                    this.a(k2, n10 + n7, n12, n11 + n6);
                }
            }
            for (n7 = -1; n7 <= 2; ++n7) {
                for (n6 = -1; n6 <= 2; ++n6) {
                    int n14;
                    int n15;
                    if (n7 >= 0 && n7 <= 1 && n6 >= 0 && n6 <= 1 || random.nextInt(3) > 0) continue;
                    int n16 = random.nextInt(3) + 2;
                    for (n15 = 0; n15 < n16; ++n15) {
                        this.b(k2, new net.minecraft.u.b.b(n3 + n7, n12 - n15 - 1, n5 + n6));
                    }
                    for (n15 = -1; n15 <= 1; ++n15) {
                        for (n14 = -1; n14 <= 1; ++n14) {
                            this.a(k2, n10 + n7 + n15, n12, n11 + n6 + n14);
                        }
                    }
                    for (n15 = -2; n15 <= 2; ++n15) {
                        for (n14 = -2; n14 <= 2; ++n14) {
                            if (Math.abs(n15) == 2 && Math.abs(n14) == 2) continue;
                            this.a(k2, n10 + n7 + n15, n12 - 1, n11 + n6 + n14);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    private boolean a(k k2, net.minecraft.u.b.b b2, int n2) {
        int n3 = b2.cy_();
        int n4 = b2.k();
        int n5 = b2.l();
        g g2 = new g();
        for (int i2 = 0; i2 <= n2 + 1; ++i2) {
            int n6 = 1;
            if (i2 == 0) {
                n6 = 0;
            }
            if (i2 >= n2 - 1) {
                n6 = 2;
            }
            for (int i3 = -n6; i3 <= n6; ++i3) {
                for (int i4 = -n6; i4 <= n6; ++i4) {
                    if (this.a(k2.n(g2.b(n3 + i3, n4 + i2, n5 + i4)).c())) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private void b(k k2, net.minecraft.u.b.b b2) {
        if (this.a(k2.n(b2).c())) {
            this.a(k2, b2, a);
        }
    }

    private void a(k k2, int n2, int n3, int n4) {
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2, n3, n4);
        h h2 = k2.n(b2).d();
        if (h2 == h.a) {
            this.a(k2, b2, b);
        }
    }
}

