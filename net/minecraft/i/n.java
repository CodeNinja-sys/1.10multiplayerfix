/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import net.minecraft.g.c.b;
import net.minecraft.i.d;
import net.minecraft.i.g;
import net.minecraft.i.h;
import net.minecraft.u.ad;
import net.minecraft.w.f;

public class n
extends d {
    @Override
    public g b() {
        return this.a(net.minecraft.u.b.n.c(this.b.cT().a), net.minecraft.u.b.n.c(this.b.cT().b + 0.5), net.minecraft.u.b.n.c(this.b.cT().c));
    }

    @Override
    public g a(double d2, double d3, double d4) {
        return this.a(net.minecraft.u.b.n.c(d2 - (double)(this.b.bl / 2.0f)), net.minecraft.u.b.n.c(d3 + 0.5), net.minecraft.u.b.n.c(d4 - (double)(this.b.bl / 2.0f)));
    }

    @Override
    public int a(g[] arrg, g g2, g g3, float f2) {
        int n2 = 0;
        for (ad ad2 : ad.values()) {
            g g4 = this.b(g2.a + ad2.h(), g2.b + ad2.i(), g2.c + ad2.j());
            if (g4 == null || g4.i || !(g4.a(g3) < f2)) continue;
            arrg[n2++] = g4;
        }
        return n2;
    }

    @Override
    public h a(net.minecraft.q.n n2, int n3, int n4, int n5, f f2, int n6, int n7, int n8, boolean bl2, boolean bl3) {
        return net.minecraft.i.h.g;
    }

    @Override
    public h a(net.minecraft.q.n n2, int n3, int n4, int n5) {
        return net.minecraft.i.h.g;
    }

    private g b(int n2, int n3, int n4) {
        h h2 = this.c(n2, n3, n4);
        return h2 == net.minecraft.i.h.g ? this.a(n2, n3, n4) : null;
    }

    private h c(int n2, int n3, int n4) {
        net.minecraft.u.b.g g2 = new net.minecraft.u.b.g();
        for (int i2 = n2; i2 < n2 + this.d; ++i2) {
            for (int i3 = n3; i3 < n3 + this.e; ++i3) {
                for (int i4 = n4; i4 < n4 + this.f; ++i4) {
                    b b2 = this.a.n(g2.b(i2, i3, i4));
                    if (b2.d() == net.minecraft.g.a.h.h) continue;
                    return net.minecraft.i.h.a;
                }
            }
        }
        return net.minecraft.i.h.g;
    }
}

