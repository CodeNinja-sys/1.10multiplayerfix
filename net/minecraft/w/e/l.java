/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.u.b.a;
import net.minecraft.w.b.ad;
import net.minecraft.w.b.ax;
import net.minecraft.w.e.bn;
import net.minecraft.w.n;

class l
extends ad {
    private final bn i;
    private int j;

    public l(bn bn2) {
        super(bn2);
        this.i = bn2;
    }

    @Override
    public void c() {
        if (this.h == ax.b) {
            double d2 = this.b - this.i.aU;
            double d3 = this.c - this.i.aV;
            double d4 = this.d - this.i.aW;
            double d5 = d2 * d2 + d3 * d3 + d4 * d4;
            if (this.j-- <= 0) {
                this.j += this.i.bd().nextInt(5) + 2;
                if (this.b(this.b, this.c, this.d, d5 = (double)net.minecraft.u.b.n.a(d5))) {
                    this.i.aX += d2 / d5 * 0.1;
                    this.i.aY += d3 / d5 * 0.1;
                    this.i.aZ += d4 / d5 * 0.1;
                } else {
                    this.h = ax.a;
                }
            }
        }
    }

    private boolean b(double d2, double d3, double d4, double d5) {
        double d6 = (d2 - this.i.aU) / d5;
        double d7 = (d3 - this.i.aV) / d5;
        double d8 = (d4 - this.i.aW) / d5;
        a a2 = this.i.cT();
        int n2 = 1;
        while ((double)n2 < d5) {
            if (!this.i.aQ.a((n)this.i, a2 = a2.c(d6, d7, d8)).isEmpty()) {
                return false;
            }
            ++n2;
        }
        return true;
    }
}

