/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.cx;
import net.minecraft.q.k;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class gt
extends cx {
    public static final g a = g.a("rotation", 0, 15);

    public gt() {
        this.z(this.O.b().a(a, Integer.valueOf(0)));
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.n(b3.c()).d().a()) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
        super.a(b2, k2, b3, cn2);
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Integer.valueOf(n2));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(a, Integer.valueOf(bq2.a((Integer)b2.a(a), 16)));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(a, Integer.valueOf(bi2.a((Integer)b2.a(a), 16)));
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

