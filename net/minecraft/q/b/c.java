/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import java.util.Random;
import net.minecraft.g.gm;
import net.minecraft.q.b.ab;
import net.minecraft.q.b.am;
import net.minecraft.q.b.q;
import net.minecraft.q.g.a.m;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.h.al;

public class c
extends q {
    private static final m a = new m(false);

    protected c(ab ab2) {
        super(ab2);
        this.y.add(new am(al.class, 1, 2, 6));
        this.w.A = 1;
        this.w.C = 4;
        this.w.D = 20;
    }

    @Override
    public net.minecraft.q.g.a.q a(Random random) {
        return random.nextInt(5) > 0 ? a : q;
    }

    @Override
    public void a(k k2, Random random, b b2) {
        p.a(gm.c);
        for (int i2 = 0; i2 < 7; ++i2) {
            int n2 = random.nextInt(16) + 8;
            int n3 = random.nextInt(16) + 8;
            int n4 = random.nextInt(k2.k(b2.a(n2, 0, n3)).k() + 32);
            p.a(k2, random, b2.a(n2, n4, n3));
        }
        super.a(k2, random, b2);
    }

    @Override
    public Class a() {
        return c.class;
    }
}

