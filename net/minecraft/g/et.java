/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.b.c;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.t;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.c.f;
import net.minecraft.w.f.af;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class et
extends cn {
    public static final c a = c.b("explode");

    public et() {
        super(h.u);
        this.z(this.O.b().a(a, Boolean.valueOf(false)));
        this.a(d.d);
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        super.b(k2, b2, b3);
        if (k2.x(b2)) {
            this.a_(k2, b2, b3.a(a, Boolean.valueOf(true)));
            k2.f(b2);
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (k2.x(b3)) {
            this.a_(k2, b3, b2.a(a, Boolean.valueOf(true)));
            k2.f(b3);
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, t t2) {
        if (!k2.C) {
            af af2 = new af(k2, (float)b2.cy_() + 0.5f, b2.k(), (float)b2.l() + 0.5f, t2.c());
            af2.b((short)(k2.p.nextInt(af2.f() / 4) + af2.f() / 8));
            k2.a(af2);
        }
    }

    @Override
    public void a_(k k2, net.minecraft.u.b.b b2, b b3) {
        this.a(k2, b2, b3, (l)null);
    }

    public void a(k k2, net.minecraft.u.b.b b2, b b3, l l2) {
        if (!k2.C && ((Boolean)b3.a(a)).booleanValue()) {
            af af2 = new af(k2, (float)b2.cy_() + 0.5f, b2.k(), (float)b2.l() + 0.5f, l2);
            k2.a(af2);
            k2.a(null, af2.aU, af2.aV, af2.aW, net.minecraft.a.f.gz, bu.e, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean a(k k2, net.minecraft.u.b.b b2, b b3, net.minecraft.w.a.b b4, ah ah2, cu cu2, ad ad2, float f2, float f3, float f4) {
        if (cu2 != null && (cu2.a() == net.minecraft.a.w.d || cu2.a() == net.minecraft.a.w.bV)) {
            this.a(k2, b2, b3.a(a, Boolean.valueOf(true)), (l)b4);
            k2.a(b2, p.a.v(), 11);
            if (cu2.a() == net.minecraft.a.w.d) {
                cu2.a(1, (l)b4);
            } else if (!b4.J.d) {
                --cu2.b;
            }
            return true;
        }
        return super.a(k2, b2, b3, b4, ah2, cu2, ad2, f2, f3, f4);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, n n2) {
        f f2;
        if (!k2.C && n2 instanceof f && (f2 = (f)n2).cy()) {
            this.a(k2, b2, k2.n(b2).a(a, Boolean.valueOf(true)), f2.e instanceof l ? (l)f2.e : null);
            k2.f(b2);
        }
    }

    @Override
    public boolean a(t t2) {
        return false;
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, Boolean.valueOf((n2 & 1) > 0));
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

