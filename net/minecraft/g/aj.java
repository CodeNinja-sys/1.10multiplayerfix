/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.g.eg;
import net.minecraft.g.fi;
import net.minecraft.g.ft;
import net.minecraft.g.ic;
import net.minecraft.q.g.a.ae;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;

public class aj
extends ft
implements fi {
    protected static final a a = new a(0.3f, 0.0, 0.3f, 0.7f, 0.4f, 0.7f);

    protected aj() {
        this.b(true);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return a;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (random.nextInt(25) == 0) {
            net.minecraft.u.b.b b42;
            int n2 = 5;
            int n3 = 4;
            for (net.minecraft.u.b.b b42 : net.minecraft.u.b.b.b(b2.a(-4, -1, -4), b2.a(4, 1, 4))) {
                if (k2.n(b42).c() != this || --n2 > 0) continue;
                return;
            }
            b42 = b2.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            for (int i2 = 0; i2 < 4; ++i2) {
                if (k2.c(b42) && this.e(k2, b42, this.v())) {
                    b2 = b42;
                }
                b42 = b2.a(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }
            if (k2.c(b42) && this.e(k2, b42, this.v())) {
                k2.a(b42, this.v(), 2);
            }
        }
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) && this.e(k2, b2, this.v());
    }

    @Override
    protected boolean i(b b2) {
        return b2.e();
    }

    @Override
    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (b2.k() >= 0 && b2.k() < 256) {
            b b4 = k2.n(b2.c());
            return b4.c() == p.bw ? true : (b4.c() == p.d && b4.a(eg.a) == ic.c ? true : k2.i(b2) < 13 && this.i(b4));
        }
        return false;
    }

    public boolean c(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        k2.f(b2);
        ae ae2 = null;
        if (this == p.P) {
            ae2 = new ae(p.bg);
        } else if (this == p.Q) {
            ae2 = new ae(p.bh);
        }
        if (ae2 != null && ((net.minecraft.q.g.a.aj)ae2).a(k2, random, b2)) {
            return true;
        }
        k2.a(b2, b3, 3);
        return false;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2) {
        return true;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void b(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        this.c(k2, b2, b3, random);
    }
}

