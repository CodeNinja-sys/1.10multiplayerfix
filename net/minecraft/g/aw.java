/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.g.ag;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.u.b.n;

public class aw
extends ag {
    public static final g a = g.a("age", 0, 3);

    public aw() {
        this.z(this.O.b().a(a, Integer.valueOf(0)));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Integer.valueOf(n.a(n2, 0, 3)));
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if ((random.nextInt(3) == 0 || this.c(k2, b2) < 4) && k2.j(b2) > 11 - (Integer)b3.a(a) - b3.f()) {
            this.a(k2, b2, b3, random, true);
        } else {
            k2.a(b2, (cn)this, n.a(random, 20, 40));
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        int n2;
        if (cn2 == this && (n2 = this.c(k2, b3)) < 2) {
            this.b(k2, b3);
        }
    }

    private int c(k k2, net.minecraft.u.b.b b2) {
        int n2 = 0;
        for (ad ad2 : ad.values()) {
            if (k2.n(b2.a(ad2)).c() != this || ++n2 < 4) continue;
            return n2;
        }
        return n2;
    }

    protected void a(k k2, net.minecraft.u.b.b b2, b b3, Random random, boolean bl2) {
        int n2 = (Integer)b3.a(a);
        if (n2 < 3) {
            k2.a(b2, b3.a(a, Integer.valueOf(n2 + 1)), 2);
            k2.a(b2, (cn)this, n.a(random, 20, 40));
        } else {
            this.b(k2, b2);
            if (bl2) {
                for (ad ad2 : ad.values()) {
                    net.minecraft.u.b.b b4 = b2.a(ad2);
                    b b5 = k2.n(b4);
                    if (b5.c() != this) continue;
                    this.a(k2, b4, b5, random, false);
                }
            }
        }
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return null;
    }
}

