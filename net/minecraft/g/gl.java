/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.f.ap;
import net.minecraft.f.j;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.h.aq;
import net.minecraft.h.y;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.r.o;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.aj;
import net.minecraft.w.l;

public class gl
extends a {
    public static final c[] a = new c[]{net.minecraft.g.b.c.b("has_bottle_0"), net.minecraft.g.b.c.b("has_bottle_1"), net.minecraft.g.b.c.b("has_bottle_2")};
    protected static final net.minecraft.u.b.a b = new net.minecraft.u.b.a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0);
    protected static final net.minecraft.u.b.a c = new net.minecraft.u.b.a(0.4375, 0.0, 0.4375, 0.5625, 0.875, 0.5625);

    public gl() {
        super(h.f);
        this.z(this.O.b().a(a[0], Boolean.valueOf(false)).a(a[1], Boolean.valueOf(false)).a(a[2], Boolean.valueOf(false)));
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a("item.brewingStand.name");
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public ap a(k k2, int n2) {
        return new j();
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, net.minecraft.u.b.a a2, List list, net.minecraft.w.n n2) {
        gl.a(b3, a2, list, c);
        gl.a(b3, a2, list, b);
    }

    @Override
    public net.minecraft.u.b.a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b;
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        ap ap2 = k2.q(b2);
        if (ap2 instanceof j) {
            b4.a((j)ap2);
            b4.a(o.O);
        }
        return true;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ap ap2;
        if (cu2.s() && (ap2 = k2.q(b2)) instanceof j) {
            ((j)ap2).a(cu2.q());
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, Random random) {
        double d2 = (float)b3.cy_() + 0.4f + random.nextFloat() * 0.2f;
        double d3 = (float)b3.k() + 0.7f + random.nextFloat() * 0.3f;
        double d4 = (float)b3.l() + 0.4f + random.nextFloat() * 0.2f;
        k2.a(aj.l, d2, d3, d4, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3) {
        ap ap2 = k2.q(b2);
        if (ap2 instanceof j) {
            net.minecraft.h.a.a(k2, b2, (y)((j)ap2));
        }
        super.a(k2, b2, b3);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.bP;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(net.minecraft.a.w.bP);
    }

    @Override
    public boolean c(b b2) {
        return true;
    }

    @Override
    public int b(b b2, k k2, net.minecraft.u.b.b b3) {
        return aq.a(k2.q(b3));
    }

    @Override
    public net.minecraft.u.c bR_() {
        return net.minecraft.u.c.c;
    }

    @Override
    public b a(int n2) {
        b b2 = this.v();
        for (int i2 = 0; i2 < 3; ++i2) {
            b2 = b2.a(a[i2], Boolean.valueOf((n2 & 1 << i2) > 0));
        }
        return b2;
    }

    @Override
    public int b(b b2) {
        int n2 = 0;
        for (int i2 = 0; i2 < 3; ++i2) {
            if (!((Boolean)b2.a(a[i2])).booleanValue()) continue;
            n2 |= 1 << i2;
        }
        return n2;
    }

    @Override
    protected i a() {
        return new i(this, a[0], a[1], a[2]);
    }
}

