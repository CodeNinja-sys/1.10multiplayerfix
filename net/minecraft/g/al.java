/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.b.b;
import net.minecraft.g.bl;
import net.minecraft.g.c.i;
import net.minecraft.g.cd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.v.d;

public abstract class al
extends bl {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", net.minecraft.g.b.class);

    public al() {
        super(h.d);
        net.minecraft.g.c.b b2 = this.O.b();
        if (!this.c()) {
            b2 = b2.a(b, (Comparable)((Object)cd.b));
        }
        this.z(b2.a(a, (Comparable)((Object)net.minecraft.g.b.a)));
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public e g(net.minecraft.g.c.b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).c();
    }

    @Override
    public cg a(net.minecraft.g.c.b b2, Random random, int n2) {
        return cg.a(p.bM);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        return new cu(p.bM, 1, ((net.minecraft.g.b)((Object)b3.a(a))).b());
    }

    @Override
    public String b(int n2) {
        return String.valueOf(super.p()) + "." + net.minecraft.g.b.a(n2).d();
    }

    @Override
    public b e() {
        return a;
    }

    @Override
    public Comparable a(cu cu2) {
        return net.minecraft.g.b.a(cu2.h() & 7);
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        if (cg2 != cg.a(p.bL)) {
            for (net.minecraft.g.b b2 : net.minecraft.g.b.values()) {
                list.add(new cu(cg2, 1, b2.b()));
            }
        }
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        net.minecraft.g.c.b b2 = this.v().a(a, (Comparable)((Object)net.minecraft.g.b.a(n2 & 7)));
        if (!this.c()) {
            b2 = b2.a(b, (Comparable)((Object)((n2 & 8) == 0 ? cd.b : cd.a)));
        }
        return b2;
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        int n2 = 0;
        n2 |= ((net.minecraft.g.b)((Object)b2.a(a))).b();
        if (!this.c() && b2.a(b) == cd.a) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected i a() {
        return this.c() ? new i(this, a) : new i(this, b, a);
    }

    @Override
    public int k(net.minecraft.g.c.b b2) {
        return ((net.minecraft.g.b)((Object)b2.a(a))).b();
    }
}

