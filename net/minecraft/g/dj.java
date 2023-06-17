/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.p;
import net.minecraft.g.a.b;
import net.minecraft.g.a.h;
import net.minecraft.g.by;
import net.minecraft.g.cn;
import net.minecraft.g.gr;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;
import net.minecraft.u.c;
import net.minecraft.v.d;

public abstract class dj
extends cn {
    protected static final a c = new a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
    protected final boolean d;

    public static boolean c(k k2, net.minecraft.u.b.b b2) {
        return dj.l(k2.n(b2));
    }

    public static boolean l(net.minecraft.g.c.b b2) {
        cn cn2 = b2.c();
        return cn2 == p.av || cn2 == p.D || cn2 == p.E || cn2 == p.cs;
    }

    protected dj(boolean bl2) {
        super(h.q);
        this.d = bl2;
        this.a(net.minecraft.v.d.e);
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
    public a a(net.minecraft.g.c.b b2, n n2, net.minecraft.u.b.b b3) {
        by by2 = b2.c() == this ? (by)((Object)b2.a(this.h())) : null;
        return by2 != null && by2.c() ? x : c;
    }

    @Override
    public boolean e(net.minecraft.g.c.b b2) {
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return k2.n(b2.c()).t();
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        if (!k2.C) {
            b3 = this.a(k2, b2, b3, true);
            if (this.d) {
                b3.a(k2, b2, this);
            }
        }
    }

    @Override
    public void a(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.C) {
            by by2 = (by)((Object)b2.a(this.h()));
            boolean bl2 = false;
            if (!k2.n(b3.c()).t()) {
                bl2 = true;
            }
            if (by2 == by.c && !k2.n(b3.g()).t()) {
                bl2 = true;
            } else if (by2 == by.d && !k2.n(b3.f()).t()) {
                bl2 = true;
            } else if (by2 == by.e && !k2.n(b3.d()).t()) {
                bl2 = true;
            } else if (by2 == by.f && !k2.n(b3.e()).t()) {
                bl2 = true;
            }
            if (bl2 && !k2.c(b3)) {
                this.b(k2, b3, b2, 0);
                k2.f(b3);
            } else {
                this.b(b2, k2, b3, cn2);
            }
        }
    }

    protected void b(net.minecraft.g.c.b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
    }

    protected net.minecraft.g.c.b a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3, boolean bl2) {
        return k2.C ? b3 : new gr(this, k2, b2, b3).a(k2.x(b2), bl2).c();
    }

    @Override
    public b a_(net.minecraft.g.c.b b2) {
        return b.a;
    }

    @Override
    public c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        super.a(k2, b2, b3);
        if (((by)((Object)b3.a(this.h()))).c()) {
            k2.b(b2.b(), this);
        }
        if (this.d) {
            k2.b(b2, this);
            k2.b(b2.c(), this);
        }
    }

    public abstract net.minecraft.g.b.b h();
}

