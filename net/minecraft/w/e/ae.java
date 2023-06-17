/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.s;
import net.minecraft.w.b.bm;
import net.minecraft.w.c.g;
import net.minecraft.w.e.bn;
import net.minecraft.w.l;

class ae
extends bm {
    private final bn b;
    public int a;

    public ae(bn bn2) {
        this.b = bn2;
    }

    @Override
    public boolean e() {
        return this.b.W() != null;
    }

    @Override
    public void b() {
        this.a = 0;
    }

    @Override
    public void c() {
        this.b.a(false);
    }

    @Override
    public void d() {
        l l2 = this.b.W();
        double d2 = 64.0;
        if (l2.n(this.b) < 4096.0 && this.b.l(l2)) {
            k k2 = this.b.aQ;
            ++this.a;
            if (this.a == 10) {
                k2.a(null, 1015, new b(this.b), 0);
            }
            if (this.a == 20) {
                double d3 = 4.0;
                s s2 = this.b.i(1.0f);
                double d4 = l2.aU - (this.b.aU + s2.b * 4.0);
                double d5 = l2.cT().b + (double)(l2.bm / 2.0f) - (0.5 + this.b.aV + (double)(this.b.bm / 2.0f));
                double d6 = l2.aW - (this.b.aW + s2.d * 4.0);
                k2.a(null, 1016, new b(this.b), 0);
                g g2 = new g(k2, this.b, d4, d5, d6);
                g2.a = this.b.p();
                g2.aU = this.b.aU + s2.b * 4.0;
                g2.aV = this.b.aV + (double)(this.b.bm / 2.0f) + 0.5;
                g2.aW = this.b.aW + s2.d * 4.0;
                k2.a(g2);
                this.a = -40;
            }
        } else if (this.a > 0) {
            --this.a;
        }
        this.b.a(this.a > 10);
    }
}

