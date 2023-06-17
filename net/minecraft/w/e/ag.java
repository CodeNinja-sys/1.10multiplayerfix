/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import java.util.Random;
import net.minecraft.w.b.ad;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.bn;

class ag
extends bm {
    private final bn a;

    public ag(bn bn2) {
        this.a = bn2;
        this.b(1);
    }

    @Override
    public boolean e() {
        double d2;
        double d3;
        ad ad2 = this.a.L();
        if (!ad2.a()) {
            return true;
        }
        double d4 = ad2.d() - this.a.aU;
        double d5 = d4 * d4 + (d3 = ad2.e() - this.a.aV) * d3 + (d2 = ad2.f() - this.a.aW) * d2;
        return d5 < 1.0 || d5 > 3600.0;
    }

    @Override
    public boolean a() {
        return false;
    }

    @Override
    public void b() {
        Random random = this.a.bd();
        double d2 = this.a.aU + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d3 = this.a.aV + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        double d4 = this.a.aW + (double)((random.nextFloat() * 2.0f - 1.0f) * 16.0f);
        this.a.L().a(d2, d3, d4, 1.0);
    }
}

