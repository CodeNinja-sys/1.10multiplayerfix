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
import net.minecraft.g.m;
import net.minecraft.g.s;
import net.minecraft.q.g.a.q;
import net.minecraft.q.k;
import net.minecraft.u.b.g;

public class v
extends q {
    private static final b a = p.r.v().a(s.a, (Comparable)((Object)net.minecraft.g.b.b));
    private static final b b = p.t.v().a(m.a, (Comparable)((Object)net.minecraft.g.b.b)).a(bm.c, Boolean.valueOf(false));

    public v(boolean bl2) {
        super(bl2);
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2 = random.nextInt(4) + 6;
        int n3 = 1 + random.nextInt(2);
        int n4 = n2 - n3;
        int n5 = 2 + random.nextInt(2);
        boolean bl2 = true;
        if (b2.k() >= 1 && b2.k() + n2 + 1 <= 256) {
            int n6;
            int n7;
            int n8;
            for (int i2 = b2.k(); i2 <= b2.k() + 1 + n2 && bl2; ++i2) {
                n8 = i2 - b2.k() < n3 ? 0 : n5;
                g g2 = new g();
                for (n7 = b2.cy_() - n8; n7 <= b2.cy_() + n8 && bl2; ++n7) {
                    for (n6 = b2.l() - n8; n6 <= b2.l() + n8 && bl2; ++n6) {
                        if (i2 >= 0 && i2 < 256) {
                            h h2 = k2.n(g2.b(n7, i2, n6)).d();
                            if (h2 == h.a || h2 == h.j) continue;
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
                this.a(k2, b2.c());
                n8 = random.nextInt(2);
                int n9 = 1;
                n7 = 0;
                for (n6 = 0; n6 <= n4; ++n6) {
                    int n10 = b2.k() + n2 - n6;
                    for (int i3 = b2.cy_() - n8; i3 <= b2.cy_() + n8; ++i3) {
                        int n11 = i3 - b2.cy_();
                        for (int i4 = b2.l() - n8; i4 <= b2.l() + n8; ++i4) {
                            net.minecraft.u.b.b b3;
                            int n12 = i4 - b2.l();
                            if (Math.abs(n11) == n8 && Math.abs(n12) == n8 && n8 > 0 || k2.n(b3 = new net.minecraft.u.b.b(i3, n10, i4)).e()) continue;
                            this.a(k2, b3, b);
                        }
                    }
                    if (n8 >= n9) {
                        n8 = n7;
                        n7 = 1;
                        if (++n9 <= n5) continue;
                        n9 = n5;
                        continue;
                    }
                    ++n8;
                }
                n6 = random.nextInt(3);
                for (int i5 = 0; i5 < n2 - n6; ++i5) {
                    h h3 = k2.n(b2.a(i5)).d();
                    if (h3 != h.a && h3 != h.j) continue;
                    this.a(k2, b2.a(i5), a);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

