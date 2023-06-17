/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.g.a.q;
import net.minecraft.q.k;

public abstract class aq
extends q {
    protected final int a;
    protected final b b;
    protected final b c;
    protected int d;

    public aq(boolean bl2, int n2, int n3, b b2, b b3) {
        super(bl2);
        this.a = n2;
        this.d = n3;
        this.b = b2;
        this.c = b3;
    }

    protected int a(Random random) {
        int n2 = random.nextInt(3) + this.a;
        if (this.d > 1) {
            n2 += random.nextInt(this.d);
        }
        return n2;
    }

    private boolean c(k k2, net.minecraft.u.b.b b2, int n2) {
        boolean bl2 = true;
        if (b2.k() >= 1 && b2.k() + n2 + 1 <= 256) {
            for (int i2 = 0; i2 <= 1 + n2; ++i2) {
                int n3 = 2;
                if (i2 == 0) {
                    n3 = 1;
                } else if (i2 >= 1 + n2 - 2) {
                    n3 = 2;
                }
                for (int i3 = -n3; i3 <= n3 && bl2; ++i3) {
                    for (int i4 = -n3; i4 <= n3 && bl2; ++i4) {
                        if (b2.k() + i2 >= 0 && b2.k() + i2 < 256 && this.a(k2.n(b2.a(i3, i2, i4)).c())) continue;
                        bl2 = false;
                    }
                }
            }
            return bl2;
        }
        return false;
    }

    private boolean a(net.minecraft.u.b.b b2, k k2) {
        net.minecraft.u.b.b b3 = b2.c();
        cn cn2 = k2.n(b3).c();
        if ((cn2 == p.c || cn2 == p.d) && b2.k() >= 2) {
            this.a(k2, b3);
            this.a(k2, b3.g());
            this.a(k2, b3.e());
            this.a(k2, b3.e().g());
            return true;
        }
        return false;
    }

    protected boolean a(k k2, Random random, net.minecraft.u.b.b b2, int n2) {
        return this.c(k2, b2, n2) && this.a(b2, k2);
    }

    protected void a(k k2, net.minecraft.u.b.b b2, int n2) {
        int n3 = n2 * n2;
        for (int i2 = -n2; i2 <= n2 + 1; ++i2) {
            for (int i3 = -n2; i3 <= n2 + 1; ++i3) {
                net.minecraft.u.b.b b3;
                h h2;
                int n4 = i2 - 1;
                int n5 = i3 - 1;
                if (i2 * i2 + i3 * i3 > n3 && n4 * n4 + n5 * n5 > n3 && i2 * i2 + n5 * n5 > n3 && n4 * n4 + i3 * i3 > n3 || (h2 = k2.n(b3 = b2.a(i2, 0, i3)).d()) != h.a && h2 != h.j) continue;
                this.a(k2, b3, this.c);
            }
        }
    }

    protected void b(k k2, net.minecraft.u.b.b b2, int n2) {
        int n3 = n2 * n2;
        for (int i2 = -n2; i2 <= n2; ++i2) {
            for (int i3 = -n2; i3 <= n2; ++i3) {
                net.minecraft.u.b.b b3;
                h h2;
                if (i2 * i2 + i3 * i3 > n3 || (h2 = k2.n(b3 = b2.a(i2, 0, i3)).d()) != h.a && h2 != h.j) continue;
                this.a(k2, b3, this.c);
            }
        }
    }
}

