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
import net.minecraft.g.b.c;
import net.minecraft.g.bl;
import net.minecraft.g.c.i;
import net.minecraft.g.cd;
import net.minecraft.g.hx;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.d.b.a;
import net.minecraft.v.d;

public abstract class ec
extends bl {
    public static final c a = net.minecraft.g.b.c.b("seamless");
    public static final net.minecraft.g.b.e e = net.minecraft.g.b.e.a("variant", hx.class);

    public ec() {
        super(h.e);
        net.minecraft.g.c.b b2 = this.O.b();
        b2 = this.c() ? b2.a(a, Boolean.valueOf(false)) : b2.a(b, (Comparable)((Object)cd.b));
        this.z(b2.a(e, (Comparable)((Object)hx.a)));
        this.a(net.minecraft.v.d.b);
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a(String.valueOf(this.p()) + ".red_sandstone.name");
    }

    @Override
    public cg a(net.minecraft.g.c.b b2, Random random, int n2) {
        return cg.a(p.cP);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, net.minecraft.g.c.b b3) {
        return new cu(p.cP, 1, ((hx)((Object)b3.a(e))).b());
    }

    @Override
    public String b(int n2) {
        return String.valueOf(super.p()) + "." + hx.a(n2).d();
    }

    @Override
    public b e() {
        return e;
    }

    @Override
    public Comparable a(cu cu2) {
        return hx.a(cu2.h() & 7);
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        if (cg2 != cg.a(p.cO)) {
            for (hx hx2 : hx.values()) {
                list.add(new cu(cg2, 1, hx2.b()));
            }
        }
    }

    @Override
    public net.minecraft.g.c.b a(int n2) {
        net.minecraft.g.c.b b2 = this.v().a(e, (Comparable)((Object)hx.a(n2 & 7)));
        b2 = this.c() ? b2.a(a, Boolean.valueOf((n2 & 8) != 0)) : b2.a(b, (Comparable)((Object)((n2 & 8) == 0 ? cd.b : cd.a)));
        return b2;
    }

    @Override
    public int b(net.minecraft.g.c.b b2) {
        int n2 = 0;
        n2 |= ((hx)((Object)b2.a(e))).b();
        if (this.c()) {
            if (((Boolean)b2.a(a)).booleanValue()) {
                n2 |= 8;
            }
        } else if (b2.a(b) == cd.a) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    protected i a() {
        return this.c() ? new i(this, a, e) : new i(this, b, e);
    }

    @Override
    public e g(net.minecraft.g.c.b b2) {
        return ((hx)((Object)b2.a(e))).c();
    }

    @Override
    public int k(net.minecraft.g.c.b b2) {
        return ((hx)((Object)b2.a(e))).b();
    }
}

