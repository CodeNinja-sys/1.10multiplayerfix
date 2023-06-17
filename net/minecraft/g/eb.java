/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.g.a.b;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.cn;
import net.minecraft.g.fm;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public abstract class eb
extends cn {
    protected static final a b = new a(0.0625, 0.0, 0.0625, 0.9375, 0.03125, 0.9375);
    protected static final a c = new a(0.0625, 0.0, 0.0625, 0.9375, 0.0625, 0.9375);
    protected static final a d = new a(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

    protected eb(h h2) {
        this(h2, h2.p());
    }

    protected eb(h h2, e e2) {
        super(h2, e2);
        this.a(net.minecraft.v.d.d);
        this.b(true);
    }

    @Override
    public a a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        boolean bl2 = this.l(b2) > 0;
        return bl2 ? b : c;
    }

    @Override
    public int a(k k2) {
        return 20;
    }

    @Override
    public a a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public boolean d(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public boolean e(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return true;
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return this.g(k2, b2.c());
    }

    @Override
    public void a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!this.g(k2, b3.c())) {
            this.b(k2, b3, b2, 0);
            k2.f(b3);
        }
    }

    private boolean g(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2).t() || k2.n(b2).c() instanceof fm;
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, Random random) {
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, Random random) {
        int n2;
        if (!k2.C && (n2 = this.l(b3)) > 0) {
            this.a(k2, b2, b3, n2);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, net.minecraft.w.n n2) {
        int n3;
        if (!k2.C && (n3 = this.l(b3)) == 0) {
            this.a(k2, b2, b3, n3);
        }
    }

    protected void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, int n2) {
        boolean bl2;
        int n3 = this.c(k2, b2);
        boolean bl3 = n2 > 0;
        boolean bl4 = bl2 = n3 > 0;
        if (n2 != n3) {
            b3 = this.a(b3, n3);
            k2.a(b2, b3, 2);
            this.f(k2, b2);
            k2.b(b2, b2);
        }
        if (!bl2 && bl3) {
            this.e(k2, b2);
        } else if (bl2 && !bl3) {
            this.d(k2, b2);
        }
        if (bl2) {
            k2.a(new net.minecraft.u.b.b(b2), (cn)this, this.a(k2));
        }
    }

    protected abstract void d(k var1, net.minecraft.u.b.b var2);

    protected abstract void e(k var1, net.minecraft.u.b.b var2);

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        if (this.l(b3) > 0) {
            this.f(k2, b2);
        }
        super.a(k2, b2, b3);
    }

    protected void f(k k2, net.minecraft.u.b.b b2) {
        k2.b(b2, this);
        k2.b(b2.c(), this);
    }

    @Override
    public int b(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return this.l(b2);
    }

    @Override
    public int c(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        return ad2 == ad.b ? this.l(b2) : 0;
    }

    @Override
    public boolean f(net.minecraft.g.c.b b2) {
        return true;
    }

    @Override
    public b a_(net.minecraft.g.c.b b2) {
        return net.minecraft.g.a.b.b;
    }

    protected abstract int c(k var1, net.minecraft.u.b.b var2);

    protected abstract int l(net.minecraft.g.c.b var1);

    protected abstract net.minecraft.g.c.b a(net.minecraft.g.c.b var1, int var2);
}

