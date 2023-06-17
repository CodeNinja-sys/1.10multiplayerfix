/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.m.ch;
import net.minecraft.m.cu;
import net.minecraft.m.cy;
import net.minecraft.q.k;
import net.minecraft.w.l;
import net.minecraft.w.n;

class aj
implements cy {
    double a;
    double b;
    long c;
    final /* synthetic */ ch d;

    aj(ch ch2) {
        this.d = ch2;
    }

    @Override
    public float a(cu cu2, k k2, l l2) {
        n n2;
        boolean bl2 = l2 != null;
        n n3 = n2 = bl2 ? l2 : cu2.z();
        if (k2 == null && n2 != null) {
            k2 = n2.aQ;
        }
        if (k2 == null) {
            return 0.0f;
        }
        double d2 = k2.q.e() ? (double)k2.c(1.0f) : Math.random();
        d2 = this.a(k2, d2);
        return net.minecraft.u.b.n.b((float)d2, 1.0f);
    }

    private double a(k k2, double d2) {
        if (k2.B() != this.c) {
            this.c = k2.B();
            double d3 = d2 - this.a;
            if (d3 < -0.5) {
                d3 += 1.0;
            }
            this.b += d3 * 0.1;
            this.b *= 0.9;
            this.a += this.b;
        }
        return this.a;
    }
}

