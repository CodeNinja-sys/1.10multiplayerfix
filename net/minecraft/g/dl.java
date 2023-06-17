/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.hq;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;
import net.minecraft.u.bi;
import net.minecraft.u.bq;

public class dl
extends hq {
    public dl() {
        this.z(this.O.b().a(f, Integer.valueOf(0)));
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return g;
    }

    @Override
    public b a(b b2, bq bq2) {
        return b2.a(f, Integer.valueOf(bq2.a((Integer)b2.a(f), 16)));
    }

    @Override
    public b a(b b2, bi bi2) {
        return b2.a(f, Integer.valueOf(bi2.a((Integer)b2.a(f), 16)));
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
        return this.v().a(f, Integer.valueOf(n2));
    }

    @Override
    public int b(b b2) {
        return (Integer)b2.a(f);
    }

    @Override
    protected i a() {
        return new i(this, f);
    }
}

