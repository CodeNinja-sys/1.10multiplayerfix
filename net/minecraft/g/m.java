/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.g.b.e;
import net.minecraft.g.bm;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.hr;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.v.d;

public class m
extends bm {
    public static final e a = net.minecraft.g.b.e.a("variant", net.minecraft.g.b.class, new hr());

    public m() {
        this.z(this.O.b().a(a, (Comparable)((Object)net.minecraft.g.b.a)).a(c, Boolean.valueOf(true)).a(b, Boolean.valueOf(true)));
    }

    @Override
    protected void a(k k2, net.minecraft.u.b.b b2, b b3, int n2) {
        if (b3.a(a) == net.minecraft.g.b.a && k2.p.nextInt(n2) == 0) {
            m.a(k2, b2, new cu(net.minecraft.a.w.e));
        }
    }

    @Override
    protected int i(b b2) {
        return b2.a(a) == net.minecraft.g.b.d ? 40 : super.i(b2);
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(cg2, 1, net.minecraft.g.b.a.b()));
        list.add(new cu(cg2, 1, net.minecraft.g.b.b.b()));
        list.add(new cu(cg2, 1, net.minecraft.g.b.c.b()));
        list.add(new cu(cg2, 1, net.minecraft.g.b.d.b()));
    }

    @Override
    protected cu j(b b2) {
        return new cu(cg.a(this), 1, ((net.minecraft.g.b)((Object)b2.a(a))).b());
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)this.b(n2))).a(b, Boolean.valueOf((n2 & 4) == 0)).a(c, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        n2 |= ((net.minecraft.g.b)((Object)b2.a(a))).b();
        if (!((Boolean)b2.a(b)).booleanValue()) {
            n2 |= 4;
        }
        if (((Boolean)b2.a(c)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public net.minecraft.g.b b(int n2) {
        return net.minecraft.g.b.a((n2 & 3) % 4);
    }

    @Override
    protected i a() {
        return new i(this, a, c, b);
    }

    @Override
    public int k(b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).b();
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        if (!k2.C && cu2 != null && cu2.a() == net.minecraft.a.w.bl) {
            b2.a(o.a(this));
            m.a(k2, b3, new cu(cg.a(this), 1, ((net.minecraft.g.b)((Object)b4.a(a))).b()));
        } else {
            super.a(k2, b2, b3, b4, ap2, cu2);
        }
    }
}

