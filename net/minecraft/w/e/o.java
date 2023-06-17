/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.u.b.n;
import net.minecraft.w.b.bm;
import net.minecraft.w.e.bn;
import net.minecraft.w.l;

class o
extends bm {
    private final bn a;

    public o(bn bn2) {
        this.a = bn2;
        this.b(2);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public void d() {
        if (this.a.W() == null) {
            this.a.ak = this.a.ba = -((float)n.b(this.a.aX, this.a.aZ)) * 57.295776f;
        } else {
            l l2 = this.a.W();
            double d2 = 64.0;
            if (l2.n(this.a) < 4096.0) {
                double d3 = l2.aU - this.a.aU;
                double d4 = l2.aW - this.a.aW;
                this.a.ak = this.a.ba = -((float)n.b(d3, d4)) * 57.295776f;
            }
        }
    }
}

