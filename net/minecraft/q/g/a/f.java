/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.em;
import net.minecraft.g.m;
import net.minecraft.g.s;
import net.minecraft.q.g.a.q;
import net.minecraft.q.k;
import net.minecraft.u.b.g;

public class f
extends q {
    private static final b a = p.r.v().a(s.a, (Comparable)((Object)net.minecraft.g.b.a));
    private static final b b = p.t.v().a(m.a, (Comparable)((Object)net.minecraft.g.b.a)).a(m.c, Boolean.valueOf(false));

    public f() {
        super(false);
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2 = random.nextInt(4) + 5;
        while (k2.n(b2.c()).d() == h.h) {
            b2 = b2.c();
        }
        boolean bl2 = true;
        if (b2.k() >= 1 && b2.k() + n2 + 1 <= 256) {
            int n3;
            int n4;
            Object object;
            int n5;
            for (int i2 = b2.k(); i2 <= b2.k() + 1 + n2; ++i2) {
                n5 = 1;
                if (i2 == b2.k()) {
                    n5 = 0;
                }
                if (i2 >= b2.k() + 1 + n2 - 2) {
                    n5 = 3;
                }
                object = new g();
                for (n4 = b2.cy_() - n5; n4 <= b2.cy_() + n5 && bl2; ++n4) {
                    for (n3 = b2.l() - n5; n3 <= b2.l() + n5 && bl2; ++n3) {
                        if (i2 >= 0 && i2 < 256) {
                            b b3 = k2.n(((g)object).b(n4, i2, n3));
                            cn cn2 = b3.c();
                            if (b3.d() == h.a || b3.d() == h.j) continue;
                            if (cn2 != p.j && cn2 != p.i) {
                                bl2 = false;
                                continue;
                            }
                            if (i2 <= b2.k()) continue;
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
            cn cn3 = k2.n(b2.c()).c();
            if ((cn3 == p.c || cn3 == p.d) && b2.k() < 256 - n2 - 1) {
                net.minecraft.u.b.b b4;
                this.a(k2, b2.c());
                for (n5 = b2.k() - 3 + n2; n5 <= b2.k() + n2; ++n5) {
                    int n6 = n5 - (b2.k() + n2);
                    n4 = 2 - n6 / 2;
                    for (n3 = b2.cy_() - n4; n3 <= b2.cy_() + n4; ++n3) {
                        int n7 = n3 - b2.cy_();
                        for (int i3 = b2.l() - n4; i3 <= b2.l() + n4; ++i3) {
                            int n8 = i3 - b2.l();
                            if (Math.abs(n7) == n4 && Math.abs(n8) == n4 && (random.nextInt(2) == 0 || n6 == 0) || k2.n(b4 = new net.minecraft.u.b.b(n3, n5, i3)).e()) continue;
                            this.a(k2, b4, b);
                        }
                    }
                }
                for (n5 = 0; n5 < n2; ++n5) {
                    object = k2.n(b2.a(n5));
                    cn cn4 = object.c();
                    if (object.d() != h.a && object.d() != h.j && cn4 != p.i && cn4 != p.j) continue;
                    this.a(k2, b2.a(n5), a);
                }
                for (n5 = b2.k() - 3 + n2; n5 <= b2.k() + n2; ++n5) {
                    int n9 = n5 - (b2.k() + n2);
                    int n10 = 2 - n9 / 2;
                    g g2 = new g();
                    for (int i4 = b2.cy_() - n10; i4 <= b2.cy_() + n10; ++i4) {
                        for (int i5 = b2.l() - n10; i5 <= b2.l() + n10; ++i5) {
                            g2.b(i4, n5, i5);
                            if (k2.n(g2).d() != h.j) continue;
                            net.minecraft.u.b.b b5 = g2.f();
                            b4 = g2.g();
                            net.minecraft.u.b.b b6 = g2.d();
                            net.minecraft.u.b.b b7 = g2.e();
                            if (random.nextInt(4) == 0 && k2.n(b5).d() == h.a) {
                                this.a(k2, b5, em.c);
                            }
                            if (random.nextInt(4) == 0 && k2.n(b4).d() == h.a) {
                                this.a(k2, b4, em.e);
                            }
                            if (random.nextInt(4) == 0 && k2.n(b6).d() == h.a) {
                                this.a(k2, b6, em.d);
                            }
                            if (random.nextInt(4) != 0 || k2.n(b7).d() != h.a) continue;
                            this.a(k2, b7, em.b);
                        }
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private void a(k k2, net.minecraft.u.b.b b2, c c2) {
        b b3 = p.bn.v().a(c2, Boolean.valueOf(true));
        this.a(k2, b2, b3);
        b2 = b2.c();
        for (int i2 = 4; k2.n(b2).d() == h.a && i2 > 0; --i2) {
            this.a(k2, b2, b3);
            b2 = b2.c();
        }
    }
}

