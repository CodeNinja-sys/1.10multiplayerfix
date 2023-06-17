/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.a;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.em;
import net.minecraft.q.g.a.aq;
import net.minecraft.u.b.n;

public class k
extends aq {
    public k(boolean bl2, int n2, int n3, b b2, b b3) {
        super(bl2, n2, n3, b2, b3);
    }

    @Override
    public boolean a(net.minecraft.q.k k2, Random random, net.minecraft.u.b.b b2) {
        int n2;
        int n3 = this.a(random);
        if (!this.a(k2, random, b2, n3)) {
            return false;
        }
        this.c(k2, b2.a(n3), 2);
        for (n2 = b2.k() + n3 - 2 - random.nextInt(4); n2 > b2.k() + n3 / 2; n2 -= 2 + random.nextInt(4)) {
            int n4;
            float f2 = random.nextFloat() * ((float)Math.PI * 2);
            int n5 = b2.cy_() + (int)(0.5f + n.b(f2) * 4.0f);
            int n6 = b2.l() + (int)(0.5f + n.a(f2) * 4.0f);
            for (n4 = 0; n4 < 5; ++n4) {
                n5 = b2.cy_() + (int)(1.5f + n.b(f2) * (float)n4);
                n6 = b2.l() + (int)(1.5f + n.a(f2) * (float)n4);
                this.a(k2, new net.minecraft.u.b.b(n5, n2 - 3 + n4 / 2, n6), this.b);
            }
            n4 = 1 + random.nextInt(2);
            int n7 = n2;
            for (int i2 = n2 - n4; i2 <= n7; ++i2) {
                int n8 = i2 - n7;
                this.b(k2, new net.minecraft.u.b.b(n5, i2, n6), 1 - n8);
            }
        }
        for (n2 = 0; n2 < n3; ++n2) {
            net.minecraft.u.b.b b3;
            net.minecraft.u.b.b b4;
            net.minecraft.u.b.b b5 = b2.a(n2);
            if (this.a(k2.n(b5).c())) {
                this.a(k2, b5, this.b);
                if (n2 > 0) {
                    this.a(k2, random, b5.f(), em.c);
                    this.a(k2, random, b5.d(), em.d);
                }
            }
            if (n2 >= n3 - 1) continue;
            net.minecraft.u.b.b b6 = b5.g();
            if (this.a(k2.n(b6).c())) {
                this.a(k2, b6, this.b);
                if (n2 > 0) {
                    this.a(k2, random, b6.g(), em.e);
                    this.a(k2, random, b6.d(), em.d);
                }
            }
            if (this.a(k2.n(b4 = b5.e().g()).c())) {
                this.a(k2, b4, this.b);
                if (n2 > 0) {
                    this.a(k2, random, b4.g(), em.e);
                    this.a(k2, random, b4.e(), em.b);
                }
            }
            if (!this.a(k2.n(b3 = b5.e()).c())) continue;
            this.a(k2, b3, this.b);
            if (n2 <= 0) continue;
            this.a(k2, random, b3.f(), em.c);
            this.a(k2, random, b3.e(), em.b);
        }
        return true;
    }

    private void a(net.minecraft.q.k k2, Random random, net.minecraft.u.b.b b2, c c2) {
        if (random.nextInt(3) > 0 && k2.c(b2)) {
            this.a(k2, b2, p.bn.v().a(c2, Boolean.valueOf(true)));
        }
    }

    private void c(net.minecraft.q.k k2, net.minecraft.u.b.b b2, int n2) {
        int n3 = 2;
        for (int i2 = -2; i2 <= 0; ++i2) {
            this.a(k2, b2.a(i2), n2 + 1 - i2);
        }
    }
}

