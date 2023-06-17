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

public class ad
extends q {
    private static final b a = p.r.v().a(s.a, (Comparable)((Object)net.minecraft.g.b.b));
    private static final b b = p.t.v().a(m.a, (Comparable)((Object)net.minecraft.g.b.b)).a(bm.c, Boolean.valueOf(false));

    public ad() {
        super(false);
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2 = random.nextInt(5) + 7;
        int n3 = n2 - random.nextInt(2) - 3;
        int n4 = n2 - n3;
        int n5 = 1 + random.nextInt(n4 + 1);
        if (b2.k() >= 1 && b2.k() + n2 + 1 <= 256) {
            int n6;
            int n7;
            int n8;
            boolean bl2 = true;
            for (int i2 = b2.k(); i2 <= b2.k() + 1 + n2 && bl2; ++i2) {
                n8 = 1;
                n8 = i2 - b2.k() < n3 ? 0 : n5;
                g g2 = new g();
                for (n7 = b2.cy_() - n8; n7 <= b2.cy_() + n8 && bl2; ++n7) {
                    for (n6 = b2.l() - n8; n6 <= b2.l() + n8 && bl2; ++n6) {
                        if (i2 >= 0 && i2 < 256) {
                            if (this.a(k2.n(g2.b(n7, i2, n6)).c())) continue;
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
                int n9;
                this.a(k2, b2.c());
                n8 = 0;
                for (n9 = b2.k() + n2; n9 >= b2.k() + n3; --n9) {
                    for (n7 = b2.cy_() - n8; n7 <= b2.cy_() + n8; ++n7) {
                        n6 = n7 - b2.cy_();
                        for (int i3 = b2.l() - n8; i3 <= b2.l() + n8; ++i3) {
                            net.minecraft.u.b.b b3;
                            int n10 = i3 - b2.l();
                            if (Math.abs(n6) == n8 && Math.abs(n10) == n8 && n8 > 0 || k2.n(b3 = new net.minecraft.u.b.b(n7, n9, i3)).e()) continue;
                            this.a(k2, b3, b);
                        }
                    }
                    if (n8 >= 1 && n9 == b2.k() + n3 + 1) {
                        --n8;
                        continue;
                    }
                    if (n8 >= n5) continue;
                    ++n8;
                }
                for (n9 = 0; n9 < n2 - 1; ++n9) {
                    h h2 = k2.n(b2.a(n9)).d();
                    if (h2 != h.a && h2 != h.j) continue;
                    this.a(k2, b2.a(n9), a);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

