/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import net.minecraft.w.b.ad;
import net.minecraft.w.h.ae;
import net.minecraft.w.h.am;

class n
extends ad {
    private final am i;
    private double j;

    public n(am am2) {
        super(am2);
        this.i = am2;
    }

    @Override
    public void c() {
        if (this.i.be && !am.b(this.i) && !((ae)am.c(this.i)).c()) {
            this.i.c(0.0);
        } else if (this.a()) {
            this.i.c(this.j);
        }
        super.c();
    }

    @Override
    public void a(double d2, double d3, double d4, double d5) {
        if (this.i.cm()) {
            d5 = 1.5;
        }
        super.a(d2, d3, d4, d5);
        if (d5 > 0.0) {
            this.j = d5;
        }
    }
}

