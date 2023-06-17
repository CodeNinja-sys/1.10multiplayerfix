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
import net.minecraft.g.eg;
import net.minecraft.g.ic;
import net.minecraft.g.m;
import net.minecraft.g.s;
import net.minecraft.q.g.a.aq;
import net.minecraft.q.k;
import net.minecraft.u.b.n;

public class av
extends aq {
    private static final b e = p.r.v().a(s.a, (Comparable)((Object)net.minecraft.g.b.b));
    private static final b f = p.t.v().a(m.a, (Comparable)((Object)net.minecraft.g.b.b)).a(bm.c, Boolean.valueOf(false));
    private static final b g = p.d.v().a(eg.a, (Comparable)((Object)ic.c));
    private final boolean h;

    public av(boolean bl2, boolean bl3) {
        super(bl2, 13, 15, e, f);
        this.h = bl3;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2) {
        int n2 = this.a(random);
        if (!this.a(k2, random, b2, n2)) {
            return false;
        }
        this.a(k2, b2.cy_(), b2.l(), b2.k() + n2, 0, random);
        for (int i2 = 0; i2 < n2; ++i2) {
            b b3 = k2.n(b2.a(i2));
            if (b3.d() == net.minecraft.g.a.h.a || b3.d() == net.minecraft.g.a.h.j) {
                this.a(k2, b2.a(i2), this.b);
            }
            if (i2 >= n2 - 1) continue;
            b3 = k2.n(b2.a(1, i2, 0));
            if (b3.d() == net.minecraft.g.a.h.a || b3.d() == net.minecraft.g.a.h.j) {
                this.a(k2, b2.a(1, i2, 0), this.b);
            }
            if ((b3 = k2.n(b2.a(1, i2, 1))).d() == net.minecraft.g.a.h.a || b3.d() == net.minecraft.g.a.h.j) {
                this.a(k2, b2.a(1, i2, 1), this.b);
            }
            if ((b3 = k2.n(b2.a(0, i2, 1))).d() != net.minecraft.g.a.h.a && b3.d() != net.minecraft.g.a.h.j) continue;
            this.a(k2, b2.a(0, i2, 1), this.b);
        }
        return true;
    }

    private void a(k k2, int n2, int n3, int n4, int n5, Random random) {
        int n6 = random.nextInt(5) + (this.h ? this.a : 3);
        int n7 = 0;
        for (int i2 = n4 - n6; i2 <= n4; ++i2) {
            int n8 = n4 - i2;
            int n9 = n5 + n.d((float)n8 / (float)n6 * 3.5f);
            this.a(k2, new net.minecraft.u.b.b(n2, i2, n3), n9 + (n8 > 0 && n9 == n7 && (i2 & 1) == 0 ? 1 : 0));
            n7 = n9;
        }
    }

    @Override
    public void b(k k2, Random random, net.minecraft.u.b.b b2) {
        this.b(k2, b2.f().d());
        this.b(k2, b2.f(2).d());
        this.b(k2, b2.f().d(2));
        this.b(k2, b2.f(2).d(2));
        for (int i2 = 0; i2 < 5; ++i2) {
            int n2 = random.nextInt(64);
            int n3 = n2 % 8;
            int n4 = n2 / 8;
            if (n3 != 0 && n3 != 7 && n4 != 0 && n4 != 7) continue;
            this.b(k2, b2.a(-3 + n3, 0, -3 + n4));
        }
    }

    private void b(k k2, net.minecraft.u.b.b b2) {
        for (int i2 = -2; i2 <= 2; ++i2) {
            for (int i3 = -2; i3 <= 2; ++i3) {
                if (Math.abs(i2) == 2 && Math.abs(i3) == 2) continue;
                this.c(k2, b2.a(i2, 0, i3));
            }
        }
    }

    private void c(k k2, net.minecraft.u.b.b b2) {
        for (int i2 = 2; i2 >= -3; --i2) {
            net.minecraft.u.b.b b3 = b2.a(i2);
            b b4 = k2.n(b3);
            cn cn2 = b4.c();
            if (cn2 == p.c || cn2 == p.d) {
                this.a(k2, b3, g);
                break;
            }
            if (b4.d() != net.minecraft.g.a.h.a && i2 < 0) break;
        }
    }
}

