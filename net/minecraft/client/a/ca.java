/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.w.n;

public class ca
extends cb {
    private final n a;
    private int b;
    private final int L;
    private final aj M;

    public ca(k k2, n n2, aj aj2) {
        super(k2, n2.aU, n2.cT().b + (double)(n2.bm / 2.0f), n2.aW, n2.aX, n2.aY, n2.aZ);
        this.a = n2;
        this.L = 3;
        this.M = aj2;
        this.b();
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void b() {
        for (int i2 = 0; i2 < 16; ++i2) {
            double d2;
            double d3;
            double d4 = this.r.nextFloat() * 2.0f - 1.0f;
            if (!(d4 * d4 + (d3 = (double)(this.r.nextFloat() * 2.0f - 1.0f)) * d3 + (d2 = (double)(this.r.nextFloat() * 2.0f - 1.0f)) * d2 <= 1.0)) continue;
            double d5 = this.a.aU + d4 * (double)this.a.bl / 4.0;
            double d6 = this.a.cT().b + (double)(this.a.bm / 2.0f) + d3 * (double)this.a.bm / 4.0;
            double d7 = this.a.aW + d2 * (double)this.a.bl / 4.0;
            this.c.a(this.M, false, d5, d6, d7, d4, d3 + 0.2, d2, new int[0]);
        }
        ++this.b;
        if (this.b >= this.L) {
            this.h();
        }
    }

    @Override
    public int a() {
        return 3;
    }
}

