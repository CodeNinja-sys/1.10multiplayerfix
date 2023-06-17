/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.a.h;
import net.minecraft.g.b.e;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.fi;
import net.minecraft.g.fo;
import net.minecraft.g.ft;
import net.minecraft.g.gm;
import net.minecraft.g.t;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.b.a;
import net.minecraft.v.d;

public class hi
extends ft
implements fi {
    public static final e a = e.a("type", t.class);
    protected static final a b = new a(0.09999999403953552, 0.0, 0.09999999403953552, 0.9f, 0.8f, 0.9f);

    protected hi() {
        super(h.l);
        this.z(this.O.b().a(a, (Comparable)((Object)t.a)));
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b;
    }

    @Override
    public boolean e(k k2, net.minecraft.u.b.b b2, b b3) {
        return this.i(k2.n(b2.c()));
    }

    @Override
    public boolean b(n n2, net.minecraft.u.b.b b2) {
        return true;
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return random.nextInt(8) == 0 ? net.minecraft.a.w.P : null;
    }

    @Override
    public int a(int n2, Random random) {
        return 1 + random.nextInt(n2 * 2 + 1);
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        if (!k2.C && cu2 != null && cu2.a() == net.minecraft.a.w.bl) {
            b2.a(o.a(this));
            hi.a(k2, b3, new cu(p.H, 1, ((t)((Object)b4.a(a))).b()));
        } else {
            super.a(k2, b2, b3, b4, ap2, cu2);
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(this, 1, b3.c().b(b3));
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (int i2 = 1; i2 < 3; ++i2) {
            list.add(new cu(cg2, 1, i2));
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, boolean bl2) {
        return b3.a(a) != t.a;
    }

    @Override
    public boolean a(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        return true;
    }

    @Override
    public void b(k k2, Random random, net.minecraft.u.b.b b2, b b3) {
        gm gm2 = gm.c;
        if (b3.a(a) == t.c) {
            gm2 = gm.d;
        }
        if (p.cF.a_(k2, b2)) {
            p.cF.a(k2, b2, gm2, 2);
        }
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)t.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((t)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }

    @Override
    public fo bS_() {
        return fo.c;
    }
}

