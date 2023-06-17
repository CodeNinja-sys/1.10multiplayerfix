/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.q.k;
import net.minecraft.t.g;

public class hj
implements g {
    private final k a;
    private final net.minecraft.u.b.b b;

    public hj(k k2, net.minecraft.u.b.b b2) {
        this.a = k2;
        this.b = b2;
    }

    @Override
    public k a() {
        return this.a;
    }

    @Override
    public double b() {
        return (double)this.b.cy_() + 0.5;
    }

    @Override
    public double c() {
        return (double)this.b.k() + 0.5;
    }

    @Override
    public double d() {
        return (double)this.b.l() + 0.5;
    }

    @Override
    public net.minecraft.u.b.b e() {
        return this.b;
    }

    @Override
    public b f() {
        return this.a.n(this.b);
    }

    @Override
    public ap g() {
        return this.a.q(this.b);
    }
}

