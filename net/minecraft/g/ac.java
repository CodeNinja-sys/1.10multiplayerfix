/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.z;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;

public class ac
extends z {
    public static final g b = g.a("age", 0, 3);
    private static final a[] c = new a[]{new a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0)};

    @Override
    protected g d() {
        return b;
    }

    @Override
    public int e() {
        return 3;
    }

    @Override
    protected cg f() {
        return net.minecraft.a.w.cU;
    }

    @Override
    protected cg g() {
        return net.minecraft.a.w.cV;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (random.nextInt(3) == 0) {
            this.b_(k2, b2, b3);
        } else {
            super.a(k2, b2, b3, random);
        }
    }

    @Override
    protected int b(k k2) {
        return super.b(k2) / 3;
    }

    @Override
    protected i a() {
        return new i(this, b);
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return c[(Integer)b2.a(this.d())];
    }
}

