/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.Random;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.au;

class al
extends bm {
    private final au a;

    public al(au au2) {
        this.a = au2;
    }

    @Override
    public boolean e() {
        return this.a.q() == null ? false : (!this.a.aQ.G().b("mobGriefing") ? false : this.a.bd().nextInt(2000) == 0);
    }

    @Override
    public void d() {
        Random random = this.a.bd();
        k k2 = this.a.aQ;
        int n2 = n.c(this.a.aU - 1.0 + random.nextDouble() * 2.0);
        int n3 = n.c(this.a.aV + random.nextDouble() * 2.0);
        int n4 = n.c(this.a.aW - 1.0 + random.nextDouble() * 2.0);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2, n3, n4);
        b b3 = k2.n(b2);
        b b4 = k2.n(b2.c());
        b b5 = this.a.q();
        if (b5 != null && this.a(k2, b2, b5.c(), b3, b4)) {
            k2.a(b2, b5, 3);
            this.a.a((b)null);
        }
    }

    private boolean a(k k2, net.minecraft.u.b.b b2, cn cn2, b b3, b b4) {
        return !cn2.a_(k2, b2) ? false : (b3.d() != h.a ? false : (b4.d() == h.a ? false : b4.k()));
    }
}

