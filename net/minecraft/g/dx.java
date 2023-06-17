/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.a.f;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cl;
import net.minecraft.g.eb;
import net.minecraft.q.k;
import net.minecraft.u.b.a;
import net.minecraft.u.bu;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class dx
extends eb {
    public static final c a = net.minecraft.g.b.c.b("powered");
    private final cl e;

    protected dx(h h2, cl cl2) {
        super(h2);
        this.z(this.O.b().a(a, Boolean.valueOf(false)));
        this.e = cl2;
    }

    @Override
    protected int l(b b2) {
        return (Boolean)b2.a(a) != false ? 15 : 0;
    }

    @Override
    protected b a(b b2, int n2) {
        return b2.a(a, Boolean.valueOf(n2 > 0));
    }

    @Override
    protected void d(k k2, net.minecraft.u.b.b b2) {
        if (this.L == h.d) {
            k2.a(null, b2, net.minecraft.a.f.hy, bu.e, 0.3f, 0.8f);
        } else {
            k2.a(null, b2, net.minecraft.a.f.gs, bu.e, 0.3f, 0.6f);
        }
    }

    @Override
    protected void e(k k2, net.minecraft.u.b.b b2) {
        if (this.L == h.d) {
            k2.a(null, b2, net.minecraft.a.f.hx, bu.e, 0.3f, 0.7f);
        } else {
            k2.a(null, b2, net.minecraft.a.f.gr, bu.e, 0.3f, 0.5f);
        }
    }

    @Override
    protected int c(k k2, net.minecraft.u.b.b b2) {
        List list;
        a a2 = d.a(b2);
        switch (this.e) {
            case a: {
                list = k2.b(null, a2);
                break;
            }
            case b: {
                list = k2.a(l.class, a2);
                break;
            }
            default: {
                return 0;
            }
        }
        if (!list.isEmpty()) {
            for (n n2 : list) {
                if (n2.cK()) continue;
                return 15;
            }
        }
        return 0;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Boolean.valueOf(n2 == 1));
    }

    @Override
    public int b(b b2) {
        return (Boolean)b2.a(a) != false ? 1 : 0;
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

