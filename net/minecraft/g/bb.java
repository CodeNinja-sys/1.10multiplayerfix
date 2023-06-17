/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.f.ap;
import net.minecraft.f.aq;
import net.minecraft.g.a;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.hu;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.ac;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.ao;
import net.minecraft.u.c;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class bb
extends a {
    public bb() {
        super(h.s, e.G);
        this.c(3.0f);
        this.a(d.f);
    }

    @Override
    public ap a(k k2, int n2) {
        return new aq();
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (k2.C) {
            return true;
        }
        ap ap2 = k2.q(b2);
        if (ap2 instanceof aq) {
            b4.a((aq)ap2);
            b4.a(o.P);
        }
        return true;
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public boolean e(b b2) {
        return false;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2, cu cu2) {
        ap ap2;
        super.a(k2, b2, b3, l2, cu2);
        if (cu2.s() && (ap2 = k2.q(b2)) instanceof aq) {
            ((aq)ap2).a(cu2.q());
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        ap ap2 = k2.q(b3);
        if (ap2 instanceof aq) {
            ((aq)ap2).k();
            k2.c(b3, this, 1, 0);
        }
    }

    @Override
    public c bR_() {
        return c.c;
    }

    public static void c(k k2, net.minecraft.u.b.b b2) {
        ao.a.a(new hu(k2, b2));
    }
}

