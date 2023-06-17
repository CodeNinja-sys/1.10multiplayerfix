/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.ee;
import net.minecraft.g.ft;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;
import net.minecraft.v.d;
import net.minecraft.w.f.ab;

public class ao
extends ft {
    protected static final a a = new a(0.0625, 0.0, 0.0625, 0.9375, 0.09375, 0.9375);

    protected ao() {
        this.a(net.minecraft.v.d.c);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, a a2, List list, net.minecraft.w.n n2) {
        if (!(n2 instanceof ab)) {
            ao.a(b3, a2, list, a);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.n n2) {
        super.a(k2, b2, b3, n2);
        if (n2 instanceof ab) {
            k2.b(new net.minecraft.u.b.b(b2), true);
        }
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return a;
    }

    @Override
    protected boolean i(b b2) {
        return b2.c() == p.j || b2.d() == h.w;
    }

    @Override
    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        if (b2.k() >= 0 && b2.k() < 256) {
            b b4 = k2.n(b2.c());
            h h2 = b4.d();
            return h2 == h.h && (Integer)b4.a(ee.a) == 0 || h2 == h.w;
        }
        return false;
    }

    @Override
    public int b(b b2) {
        return 0;
    }
}

