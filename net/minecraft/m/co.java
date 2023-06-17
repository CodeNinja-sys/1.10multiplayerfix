/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.m.cu;
import net.minecraft.m.cy;
import net.minecraft.m.g;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.w.f.l;

class co
implements cy {
    double a;
    double b;
    long c;
    final /* synthetic */ g d;

    co(g g2) {
        this.d = g2;
    }

    @Override
    public float a(cu cu2, k k2, net.minecraft.w.l l2) {
        double d2;
        net.minecraft.w.n n2;
        if (l2 == null && !cu2.y()) {
            return 0.0f;
        }
        boolean bl2 = l2 != null;
        net.minecraft.w.n n3 = n2 = bl2 ? l2 : cu2.z();
        if (k2 == null) {
            k2 = n2.aQ;
        }
        if (k2.q.e()) {
            double d3 = bl2 ? (double)n2.ba : this.a((l)n2);
            double d4 = this.a(k2, n2);
            d2 = Math.PI - (((d3 %= 360.0) - 90.0) * 0.01745329238474369 - d4);
        } else {
            d2 = Math.random() * (Math.PI * 2);
        }
        if (bl2) {
            d2 = this.a(k2, d2);
        }
        float f2 = (float)(d2 / (Math.PI * 2));
        return n.b(f2, 1.0f);
    }

    private double a(k k2, double d2) {
        if (k2.B() != this.c) {
            this.c = k2.B();
            double d3 = d2 - this.a;
            d3 %= Math.PI * 2;
            d3 = n.a(d3, -1.0, 1.0);
            this.b += d3 * 0.1;
            this.b *= 0.8;
            this.a += this.b;
        }
        return this.a;
    }

    private double a(l l2) {
        return n.b(180 + l2.b.c() * 90);
    }

    private double a(k k2, net.minecraft.w.n n2) {
        b b2 = k2.D();
        return Math.atan2((double)b2.l() - n2.aW, (double)b2.cy_() - n2.aU);
    }
}

