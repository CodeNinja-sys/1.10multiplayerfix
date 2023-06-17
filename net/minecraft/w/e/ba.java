/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.u.b.n;
import net.minecraft.w.b.ad;
import net.minecraft.w.b.aw;
import net.minecraft.w.b.ax;
import net.minecraft.w.d;
import net.minecraft.w.e.g;

class ba
extends ad {
    private final g i;

    public ba(g g2) {
        super(g2);
        this.i = g2;
    }

    @Override
    public void c() {
        if (this.h == ax.b && !this.i.N().l()) {
            double d2 = this.b - this.i.aU;
            double d3 = this.c - this.i.aV;
            double d4 = this.d - this.i.aW;
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            d5 = n.a(d5);
            float f2 = (float)(n.b(d4, d2) * 57.29577951308232) - 90.0f;
            this.i.ak = this.i.ba = this.a(this.i.ba, f2, 90.0f);
            float f3 = (float)(this.e * this.i.a(net.minecraft.w.d.d).f());
            this.i.e_(this.i.ak() + (f3 - this.i.ak()) * 0.125f);
            double d6 = Math.sin((double)(this.i.by + this.i.ca()) * 0.5) * 0.05;
            double d7 = Math.cos(this.i.ba * ((float)Math.PI / 180));
            double d8 = Math.sin(this.i.ba * ((float)Math.PI / 180));
            this.i.aX += d6 * d7;
            this.i.aZ += d6 * d8;
            d6 = Math.sin((double)(this.i.by + this.i.ca()) * 0.75) * 0.05;
            this.i.aY += d6 * (d8 + d7) * 0.25;
            this.i.aY += (double)this.i.ak() * (d3 /= d5) * 0.1;
            aw aw2 = this.i.I();
            double d9 = this.i.aU + d2 / d5 * 2.0;
            double d10 = (double)this.i.ce_() + this.i.aV + d3 / d5;
            double d11 = this.i.aW + d4 / d5 * 2.0;
            double d12 = aw2.c();
            double d13 = aw2.d();
            double d14 = aw2.e();
            if (!aw2.b()) {
                d12 = d9;
                d13 = d10;
                d14 = d11;
            }
            this.i.I().a(d12 + (d9 - d12) * 0.125, d13 + (d10 - d13) * 0.125, d14 + (d11 - d14) * 0.125, 10.0f, 40.0f);
            net.minecraft.w.e.g.a(this.i, true);
        } else {
            this.i.e_(0.0f);
            net.minecraft.w.e.g.a(this.i, false);
        }
    }
}

