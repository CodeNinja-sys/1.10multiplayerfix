/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.ee;
import net.minecraft.g.gc;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class dy
extends ee {
    protected dy(h h2) {
        super(h2);
        this.b(false);
        if (h2 == h.i) {
            this.b(true);
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!this.e(k2, b3, b2)) {
            this.f(k2, b3, b2);
        }
    }

    private void f(k k2, net.minecraft.u.b.b b2, b b3) {
        gc gc2 = dy.a(this.L);
        k2.a(b2, gc2.v().a(a, (Integer)b3.a(a)), 2);
        k2.a(b2, (cn)gc2, this.a(k2));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        block7: {
            if (this.L != h.i || !k2.G().b("doFireTick")) break block7;
            int n2 = random.nextInt(3);
            if (n2 > 0) {
                net.minecraft.u.b.b b4 = b2;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if ((b4 = b4.a(random.nextInt(3) - 1, 1, random.nextInt(3) - 1)).k() >= 0 && b4.k() < 256 && !k2.d(b4)) {
                        return;
                    }
                    cn cn2 = k2.n(b4).c();
                    if (cn2.L == h.a) {
                        if (!this.c(k2, b4)) continue;
                        k2.b(b4, p.ab.v());
                        return;
                    }
                    if (!cn2.L.c()) continue;
                    return;
                }
            } else {
                for (int i3 = 0; i3 < 3; ++i3) {
                    net.minecraft.u.b.b b5 = b2.a(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
                    if (b5.k() >= 0 && b5.k() < 256 && !k2.d(b5)) {
                        return;
                    }
                    if (!k2.c(b5.b()) || !this.e(k2, b5)) continue;
                    k2.b(b5.b(), p.ab.v());
                }
            }
        }
    }

    protected boolean c(k k2, net.minecraft.u.b.b b2) {
        for (ad ad2 : ad.values()) {
            if (!this.e(k2, b2.a(ad2))) continue;
            return true;
        }
        return false;
    }

    private boolean e(k k2, net.minecraft.u.b.b b2) {
        return b2.k() >= 0 && b2.k() < 256 && !k2.d(b2) ? false : k2.n(b2).d().g();
    }
}

