/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.f;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.eb;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.bu;

public class dw
extends eb {
    public static final g a = g.a("power", 0, 15);
    private final int e;

    protected dw(h h2, int n2) {
        this(h2, n2, h2.p());
    }

    protected dw(h h2, int n2, e e2) {
        super(h2, e2);
        this.z(this.O.b().a(a, Integer.valueOf(0)));
        this.e = n2;
    }

    @Override
    protected int c(k k2, net.minecraft.u.b.b b2) {
        int n2 = Math.min(k2.a(net.minecraft.w.n.class, d.a(b2)).size(), this.e);
        if (n2 > 0) {
            float f2 = (float)Math.min(this.e, n2) / (float)this.e;
            return n.f(f2 * 15.0f);
        }
        return 0;
    }

    @Override
    protected void d(k k2, net.minecraft.u.b.b b2) {
        k2.a(null, b2, f.dy, bu.e, 0.3f, 0.90000004f);
    }

    @Override
    protected void e(k k2, net.minecraft.u.b.b b2) {
        k2.a(null, b2, f.dx, bu.e, 0.3f, 0.75f);
    }

    @Override
    protected int l(b b2) {
        return (Integer)b2.a(a);
    }

    @Override
    protected b a(b b2, int n2) {
        return b2.a(a, Integer.valueOf(n2));
    }

    @Override
    public int a(k k2) {
        return 10;
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
    protected i a() {
        return new i(this, a);
    }
}

