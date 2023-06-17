/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;
import net.minecraft.u.c;
import net.minecraft.v.d;

public class ft
extends cn {
    protected static final a d = new a(0.3f, 0.0, 0.3f, 0.7f, 0.6f, 0.7f);

    protected ft() {
        this(h.k);
    }

    protected ft(h h2) {
        this(h2, h2.p());
    }

    protected ft(h h2, e e2) {
        super(h2, e2);
        this.b(true);
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) && this.i(k2.n(b2.c()));
    }

    protected boolean i(b b2) {
        return b2.c() == p.c || b2.c() == p.d || b2.c() == p.ak;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        super.a(b2, k2, b3, cn2);
        this.b_(k2, b3, b2);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        this.b_(k2, b2, b3);
    }

    protected void b_(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!this.e(k2, b2, b3)) {
            this.b(k2, b2, b3, 0);
            k2.a(b2, p.a.v(), 3);
        }
    }

    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        return this.i(k2.n(b2.c()));
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return d;
    }

    @Override
    public a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public c bR_() {
        return c.c;
    }
}

