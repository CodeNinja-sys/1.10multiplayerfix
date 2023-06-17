/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.m;
import net.minecraft.g.s;
import net.minecraft.q.g.a.q;
import net.minecraft.q.k;
import net.minecraft.u.b.g;

public class ah
extends q {
    private static final b a = p.r.v().a(s.a, (Comparable)((Object)net.minecraft.g.b.c));
    private static final b b = p.t.v().a(m.a, (Comparable)((Object)net.minecraft.g.b.c)).a(m.c, Boolean.valueOf(false));
    private final boolean c;

    public ah(boolean bl2, boolean bl3) {
        super(bl2);
        this.c = bl3;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2 = random.nextInt(3) + 5;
        if (this.c) {
            n2 += random.nextInt(7);
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
                    n5 = 2;
                }
                object = new g();
                for (n4 = b2.cy_() - n5; n4 <= b2.cy_() + n5 && bl2; ++n4) {
                    for (n3 = b2.l() - n5; n3 <= b2.l() + n5 && bl2; ++n3) {
                        if (i2 >= 0 && i2 < 256) {
                            if (this.a(k2.n(((g)object).b(n4, i2, n3)).c())) continue;
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
                for (n5 = b2.k() - 3 + n2; n5 <= b2.k() + n2; ++n5) {
                    int n6 = n5 - (b2.k() + n2);
                    n4 = 1 - n6 / 2;
                    for (n3 = b2.cy_() - n4; n3 <= b2.cy_() + n4; ++n3) {
                        int n7 = n3 - b2.cy_();
                        for (int i3 = b2.l() - n4; i3 <= b2.l() + n4; ++i3) {
                            net.minecraft.u.b.b b3;
                            h h2;
                            int n8 = i3 - b2.l();
                            if (Math.abs(n7) == n4 && Math.abs(n8) == n4 && (random.nextInt(2) == 0 || n6 == 0) || (h2 = k2.n(b3 = new net.minecraft.u.b.b(n3, n5, i3)).d()) != h.a && h2 != h.j) continue;
                            this.a(k2, b3, b);
                        }
                    }
                }
                for (n5 = 0; n5 < n2; ++n5) {
                    object = k2.n(b2.a(n5)).d();
                    if (object != h.a && object != h.j) continue;
                    this.a(k2, b2.a(n5), a);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

