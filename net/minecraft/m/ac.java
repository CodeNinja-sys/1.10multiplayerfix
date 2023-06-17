/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.vi;
import net.minecraft.a.f;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.eg;
import net.minecraft.g.ic;
import net.minecraft.h.k;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.p;
import net.minecraft.u.ab;
import net.minecraft.u.ad;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.w.b.a.h;
import net.minecraft.w.d;
import net.minecraft.w.l;

public class ac
extends cg {
    private final float b;
    protected p a;

    public ac(p p2) {
        this.a = p2;
        this.i = 1;
        this.e(p2.a());
        this.a(net.minecraft.v.d.i);
        this.b = p2.c() + 1.0f;
    }

    @Override
    public ab a(cu cu2, net.minecraft.w.a.b b2, net.minecraft.q.k k2, net.minecraft.u.b.b b3, ah ah2, ad ad2, float f2, float f3, float f4) {
        if (!b2.a(b3.a(ad2), ad2, cu2)) {
            return ab.c;
        }
        b b4 = k2.n(b3);
        cn cn2 = b4.c();
        if (ad2 != ad.a && k2.n(b3.b()).d() == net.minecraft.g.a.h.a) {
            if (cn2 == net.minecraft.a.p.c || cn2 == net.minecraft.a.p.da) {
                this.a(cu2, b2, k2, b3, net.minecraft.a.p.ak.v());
                return ab.a;
            }
            if (cn2 == net.minecraft.a.p.d) {
                switch ((ic)((Object)b4.a(eg.a))) {
                    case a: {
                        this.a(cu2, b2, k2, b3, net.minecraft.a.p.ak.v());
                        return ab.a;
                    }
                    case b: {
                        this.a(cu2, b2, k2, b3, net.minecraft.a.p.d.v().a(eg.a, (Comparable)((Object)ic.a)));
                        return ab.a;
                    }
                }
            }
        }
        return ab.b;
    }

    @Override
    public boolean a(cu cu2, l l2, l l3) {
        cu2.a(1, l3);
        return true;
    }

    protected void a(cu cu2, net.minecraft.w.a.b b2, net.minecraft.q.k k2, net.minecraft.u.b.b b3, b b4) {
        k2.a(b2, b3, net.minecraft.a.f.co, bu.e, 1.0f, 1.0f);
        if (!k2.C) {
            k2.a(b3, b4, 11);
            cu2.a(1, (l)b2);
        }
    }

    @Override
    public boolean c() {
        return true;
    }

    public String d() {
        return this.a.toString();
    }

    @Override
    public vi a(k k2) {
        vi vi2 = super.a(k2);
        if (k2 == net.minecraft.h.k.a) {
            vi2.a(d.e.b(), new h(f, "Weapon modifier", 0.0, 0));
            vi2.a(d.f.b(), new h(g, "Weapon modifier", this.b - 4.0f, 0));
        }
        return vi2;
    }
}

