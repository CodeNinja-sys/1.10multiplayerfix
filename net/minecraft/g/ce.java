/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.ad;
import net.minecraft.u.ag;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class ce
extends cn {
    public static final c a = net.minecraft.g.b.c.b("north");
    public static final c b = net.minecraft.g.b.c.b("east");
    public static final c c = net.minecraft.g.b.c.b("south");
    public static final c d = net.minecraft.g.b.c.b("west");
    public static final c e = net.minecraft.g.b.c.b("up");
    public static final c f = net.minecraft.g.b.c.b("down");

    protected ce() {
        super(h.k);
        this.a(net.minecraft.v.d.c);
        this.z(this.O.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)).a(f, Boolean.valueOf(false)));
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        cn cn2 = n2.n(b3.c()).c();
        cn cn3 = n2.n(b3.b()).c();
        cn cn4 = n2.n(b3.d()).c();
        cn cn5 = n2.n(b3.g()).c();
        cn cn6 = n2.n(b3.e()).c();
        cn cn7 = n2.n(b3.f()).c();
        return b2.a(f, Boolean.valueOf(cn2 == this || cn2 == p.cS || cn2 == p.bH)).a(e, Boolean.valueOf(cn3 == this || cn3 == p.cS)).a(a, Boolean.valueOf(cn4 == this || cn4 == p.cS)).a(b, Boolean.valueOf(cn5 == this || cn5 == p.cS)).a(c, Boolean.valueOf(cn6 == this || cn6 == p.cS)).a(d, Boolean.valueOf(cn7 == this || cn7 == p.cS));
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        b2 = b2.b(n2, b3);
        float f2 = 0.1875f;
        float f3 = (Boolean)b2.a(d) != false ? 0.0f : 0.1875f;
        float f4 = (Boolean)b2.a(f) != false ? 0.0f : 0.1875f;
        float f5 = (Boolean)b2.a(a) != false ? 0.0f : 0.1875f;
        float f6 = (Boolean)b2.a(b) != false ? 1.0f : 0.8125f;
        float f7 = (Boolean)b2.a(e) != false ? 1.0f : 0.8125f;
        float f8 = (Boolean)b2.a(c) != false ? 1.0f : 0.8125f;
        return new a(f3, f4, f5, f6, f7, f8);
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, a a2, List list, net.minecraft.w.n n2) {
        b2 = b2.b((n)k2, b3);
        float f2 = 0.1875f;
        float f3 = 0.8125f;
        ce.a(b3, a2, list, new a(0.1875, 0.1875, 0.1875, 0.8125, 0.8125, 0.8125));
        if (((Boolean)b2.a(d)).booleanValue()) {
            ce.a(b3, a2, list, new a(0.0, 0.1875, 0.1875, 0.1875, 0.8125, 0.8125));
        }
        if (((Boolean)b2.a(b)).booleanValue()) {
            ce.a(b3, a2, list, new a(0.8125, 0.1875, 0.1875, 1.0, 0.8125, 0.8125));
        }
        if (((Boolean)b2.a(e)).booleanValue()) {
            ce.a(b3, a2, list, new a(0.1875, 0.8125, 0.1875, 0.8125, 1.0, 0.8125));
        }
        if (((Boolean)b2.a(f)).booleanValue()) {
            ce.a(b3, a2, list, new a(0.1875, 0.0, 0.1875, 0.8125, 0.1875, 0.8125));
        }
        if (((Boolean)b2.a(a)).booleanValue()) {
            ce.a(b3, a2, list, new a(0.1875, 0.1875, 0.0, 0.8125, 0.8125, 0.1875));
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            ce.a(b3, a2, list, new a(0.1875, 0.1875, 0.8125, 0.8125, 0.8125, 1.0));
        }
    }

    @Override
    public int b(b b2) {
        return 0;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!this.c(k2, b2)) {
            k2.b(b2, true);
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.cS;
    }

    @Override
    public int a(Random random) {
        return random.nextInt(2);
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return super.a_(k2, b2) ? this.c(k2, b2) : false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!this.c(k2, b3)) {
            k2.a(b3, (cn)this, 1);
        }
    }

    public boolean c(k k2, net.minecraft.u.b.b b2) {
        Object object2;
        boolean bl2 = k2.c(b2.b());
        boolean bl3 = k2.c(b2.c());
        for (Object object2 : ag.a) {
            net.minecraft.u.b.b b3 = b2.a((ad)object2);
            cn cn2 = k2.n(b3).c();
            if (cn2 != this) continue;
            if (!bl2 && !bl3) {
                return false;
            }
            cn cn3 = k2.n(b3.c()).c();
            if (cn3 != this && cn3 != p.bH) continue;
            return true;
        }
        object2 = k2.n(b2.c()).c();
        return object2 == this || object2 == p.bH;
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public boolean a(b b2, n n2, net.minecraft.u.b.b b3, ad ad2) {
        cn cn2 = n2.n(b3.a(ad2)).c();
        return cn2 != this && cn2 != p.cS && (ad2 != ad.a || cn2 != p.bH);
    }

    @Override
    protected i a() {
        return new i(this, a, b, c, d, e, f);
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return false;
    }
}

