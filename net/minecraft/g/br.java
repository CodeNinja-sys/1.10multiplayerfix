/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class br
extends a {
    protected static final net.minecraft.u.b.a a = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 1.0, 0.75, 1.0);

    protected br() {
        super(h.e, e.D);
        this.f(0);
        this.a(d.c);
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return a;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        super.a(b2, k2, b3, random);
        for (int i2 = -2; i2 <= 2; ++i2) {
            block1: for (int i3 = -2; i3 <= 2; ++i3) {
                if (i2 > -2 && i2 < 2 && i3 == -1) {
                    i3 = 2;
                }
                if (random.nextInt(16) != 0) continue;
                for (int i4 = 0; i4 <= 1; ++i4) {
                    net.minecraft.u.b.b b4 = b3.a(i2, i4, i3);
                    if (k2.n(b4).c() != p.X) continue;
                    if (!k2.c(b3.a(i2 / 2, 0, i3 / 2))) continue block1;
                    k2.a(aj.z, (double)b3.cy_() + 0.5, (double)b3.k() + 2.0, (double)b3.l() + 0.5, (double)((float)i2 + random.nextFloat()) - 0.5, (double)((float)i4 - random.nextFloat() - 1.0f), (double)((float)i3 + random.nextFloat()) - 0.5, new int[0]);
                }
            }
        }
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public ap a(k k2, int n2) {
        return new net.minecraft.f.aj();
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        ap ap2 = k2.q(b2);
        if (ap2 instanceof net.minecraft.f.aj) {
            b4.a((net.minecraft.f.aj)ap2);
        }
        return true;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ap ap2;
        super.a(k2, b2, b3, l2, cu2);
        if (cu2.s() && (ap2 = k2.q(b2)) instanceof net.minecraft.f.aj) {
            ((net.minecraft.f.aj)ap2).a(cu2.q());
        }
    }
}

