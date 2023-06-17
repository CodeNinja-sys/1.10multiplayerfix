/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.ic;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.v.d;

public class eg
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", ic.class);
    public static final c b = c.b("snowy");

    protected eg() {
        super(h.c);
        this.z(this.O.b().a(a, (Comparable)((Object)ic.a)).a(b, Boolean.valueOf(false)));
        this.a(d.b);
    }

    @Override
    public e g(b b2) {
        return ((ic)((Object)b2.a(a))).d();
    }

    @Override
    public b b(b b2, n n2, net.minecraft.u.b.b b3) {
        if (b2.a(a) == ic.c) {
            cn cn2 = n2.n(b3.b()).c();
            b2 = b2.a(b, Boolean.valueOf(cn2 == p.aJ || cn2 == p.aH));
        }
        return b2;
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(this, 1, ic.a.b()));
        list.add(new cu(this, 1, ic.b.b()));
        list.add(new cu(this, 1, ic.c.b()));
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(this, 1, ((ic)((Object)b3.a(a))).b());
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)ic.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((ic)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a, b);
    }

    @Override
    public int k(b b2) {
        ic ic2 = (ic)((Object)b2.a(a));
        if (ic2 == ic.c) {
            ic2 = ic.a;
        }
        return ic2.b();
    }
}

