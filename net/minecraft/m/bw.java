/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.m.cb;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.bu;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

public class bw
extends cb {
    public bw(int n2, float f2) {
        super(n2, f2, false);
    }

    @Override
    public cu a(cu cu2, k k2, l l2) {
        cu cu3 = super.a(cu2, k2, l2);
        if (!k2.C) {
            double d2 = l2.aU;
            double d3 = l2.aV;
            double d4 = l2.aW;
            for (int i2 = 0; i2 < 16; ++i2) {
                double d5 = l2.aU + (l2.bd().nextDouble() - 0.5) * 16.0;
                double d6 = n.a(l2.aV + (double)(l2.bd().nextInt(16) - 8), 0.0, (double)(k2.M() - 1));
                double d7 = l2.aW + (l2.bd().nextDouble() - 0.5) * 16.0;
                if (l2.cz()) {
                    l2.o();
                }
                if (!l2.f(d5, d6, d7)) continue;
                k2.a(null, d2, d3, d4, net.minecraft.a.f.af, bu.h, 1.0f, 1.0f);
                l2.a(net.minecraft.a.f.af, 1.0f, 1.0f);
                break;
            }
            if (l2 instanceof b) {
                ((b)l2).aL().a((cg)this, 20);
            }
        }
        return cu3;
    }
}

