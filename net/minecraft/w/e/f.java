/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.b.aa;
import net.minecraft.w.e.n;
import net.minecraft.w.l;

class f
extends aa {
    final /* synthetic */ n h;

    public f(n n2) {
        this.h = n2;
        super(n2, 1.25, true);
    }

    @Override
    protected void a(l l2, double d2) {
        double d3 = this.a(l2);
        if (d2 <= d3 && this.c <= 0) {
            this.c = 20;
            this.b.j(l2);
            this.h.a(false);
        } else if (d2 <= d3 * 2.0) {
            if (this.c <= 0) {
                this.h.a(false);
                this.c = 20;
            }
            if (this.c <= 10) {
                this.h.a(true);
                this.h.p();
            }
        } else {
            this.c = 20;
            this.h.a(false);
        }
    }

    @Override
    public void c() {
        this.h.a(false);
        super.c();
    }

    @Override
    protected double a(l l2) {
        return 4.0f + l2.bl;
    }
}

