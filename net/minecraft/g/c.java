/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.u.b.a;
import net.minecraft.v.d;
import net.minecraft.w.n;

public class c
extends cn {
    protected static final a a = new a(0.0, 0.0, 0.0, 1.0, 0.875, 1.0);

    public c() {
        super(h.p, e.B);
        this.a(d.b);
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return a;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, n n2) {
        n2.aX *= 0.4;
        n2.aZ *= 0.4;
    }
}

