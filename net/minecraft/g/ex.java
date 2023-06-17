/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.w;
import net.minecraft.g.c.b;
import net.minecraft.g.z;
import net.minecraft.m.cg;
import net.minecraft.q.n;
import net.minecraft.u.b.a;

public class ex
extends z {
    private static final a[] b = new a[]{new a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.4375, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0)};

    @Override
    protected cg f() {
        return net.minecraft.a.w.cb;
    }

    @Override
    protected cg g() {
        return net.minecraft.a.w.cb;
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b[(Integer)b2.a(this.d())];
    }
}

