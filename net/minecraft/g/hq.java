/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.f.ap;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.b.f;
import net.minecraft.g.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.de;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;

public class hq
extends a {
    public static final f e = de.j;
    public static final g f = net.minecraft.g.b.g.a("rotation", 0, 15);
    protected static final net.minecraft.u.b.a g = new net.minecraft.u.b.a(0.25, 0.0, 0.25, 0.75, 1.0, 0.75);

    protected hq() {
        super(h.d);
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a("item.banner.white.name");
    }

    @Override
    public net.minecraft.u.b.a a(b b2, k k2, net.minecraft.u.b.b b3) {
        return y;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public boolean a(n n2, net.minecraft.u.b.b b2) {
        return true;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public ap a(k k2, int n2) {
        return new net.minecraft.f.w();
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.cO;
    }

    private cu e(k k2, net.minecraft.u.b.b b2, b b3) {
        ap ap2 = k2.q(b2);
        if (ap2 instanceof net.minecraft.f.w) {
            cu cu2 = new cu(net.minecraft.a.w.cO, 1, ((net.minecraft.f.w)ap2).b());
            e e2 = ap2.a(new e());
            e2.q("x");
            e2.q("y");
            e2.q("z");
            e2.q("id");
            cu2.a("BlockEntityTag", e2);
            return cu2;
        }
        return null;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        cu cu2 = this.e(k2, b2, b3);
        return cu2 != null ? cu2 : new cu(net.minecraft.a.w.cO);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        cu cu2 = this.e(k2, b2, b3);
        if (cu2 != null) {
            hq.a(k2, b2, cu2);
        } else {
            super.a(k2, b2, b3, f2, n2);
        }
    }

    @Override
    public boolean a_(k k2, net.minecraft.u.b.b b2) {
        return !this.a(k2, b2) && super.a_(k2, b2);
    }

    @Override
    public void a(k k2, net.minecraft.w.a.b b2, net.minecraft.u.b.b b3, b b4, ap ap2, cu cu2) {
        if (ap2 instanceof net.minecraft.f.w) {
            net.minecraft.f.w w2 = (net.minecraft.f.w)ap2;
            cu cu3 = new cu(net.minecraft.a.w.cO, 1, ((net.minecraft.f.w)ap2).b());
            e e2 = new e();
            net.minecraft.f.w.a(e2, w2.b(), w2.h());
            cu3.a("BlockEntityTag", e2);
            hq.a(k2, b3, cu3);
        } else {
            super.a(k2, b2, b3, b4, null, cu2);
        }
    }
}

