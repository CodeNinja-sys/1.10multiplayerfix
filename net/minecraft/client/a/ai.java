/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.g;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.w.n;

public class ai
extends cb {
    private int a;
    private final int b = 8;

    protected ai(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
    }

    @Override
    public void a(g g2, n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
    }

    @Override
    public void b() {
        for (int i2 = 0; i2 < 6; ++i2) {
            double d2 = this.g + (this.r.nextDouble() - this.r.nextDouble()) * 4.0;
            double d3 = this.h + (this.r.nextDouble() - this.r.nextDouble()) * 4.0;
            double d4 = this.i + (this.r.nextDouble() - this.r.nextDouble()) * 4.0;
            this.c.a(aj.b, d2, d3, d4, (double)((float)this.a / 8.0f), 0.0, 0.0, new int[0]);
        }
        ++this.a;
        if (this.a == 8) {
            this.h();
        }
    }

    @Override
    public int a() {
        return 1;
    }
}

