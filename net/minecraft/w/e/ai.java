/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.Random;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.b.o;
import net.minecraft.u.b.s;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.au;

class ai
extends bm {
    private final au a;

    public ai(au au2) {
        this.a = au2;
    }

    @Override
    public boolean e() {
        return this.a.q() != null ? false : (!this.a.aQ.G().b("mobGriefing") ? false : this.a.bd().nextInt(20) == 0);
    }

    @Override
    public void d() {
        boolean bl2;
        Random random = this.a.bd();
        k k2 = this.a.aQ;
        int n2 = n.c(this.a.aU - 2.0 + random.nextDouble() * 4.0);
        int n3 = n.c(this.a.aV + random.nextDouble() * 3.0);
        int n4 = n.c(this.a.aW - 2.0 + random.nextDouble() * 4.0);
        net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2, n3, n4);
        b b3 = k2.n(b2);
        cn cn2 = b3.c();
        o o2 = k2.a(new s((float)n.c(this.a.aU) + 0.5f, (float)n3 + 0.5f, (float)n.c(this.a.aW) + 0.5f), new s((float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f), false, true, false);
        boolean bl3 = bl2 = o2 != null && o2.a().equals(b2);
        if (au.s().contains(cn2) && bl2) {
            this.a.a(b3);
            k2.f(b2);
        }
    }
}

