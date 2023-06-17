/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.b.n;
import net.minecraft.u.b.p;
import net.minecraft.u.b.s;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.f.t;

public class o
extends cg {
    private final t a;

    public o(t t2) {
        this.a = t2;
        this.i = 1;
        this.a(d.e);
        this.b("boat." + t2.a());
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        Object object;
        float f2 = 1.0f;
        float f3 = b2.bd + (b2.bb - b2.bd) * 1.0f;
        float f4 = b2.bc + (b2.ba - b2.bc) * 1.0f;
        double d2 = b2.aR + (b2.aU - b2.aR) * 1.0;
        double d3 = b2.aS + (b2.aV - b2.aS) * 1.0 + (double)b2.ce_();
        double d4 = b2.aT + (b2.aW - b2.aT) * 1.0;
        s s2 = new s(d2, d3, d4);
        float f5 = n.b(-f4 * ((float)Math.PI / 180) - (float)Math.PI);
        float f6 = n.a(-f4 * ((float)Math.PI / 180) - (float)Math.PI);
        float f7 = -n.b(-f3 * ((float)Math.PI / 180));
        float f8 = n.a(-f3 * ((float)Math.PI / 180));
        float f9 = f6 * f7;
        float f10 = f5 * f7;
        double d5 = 5.0;
        s s3 = s2.b((double)f9 * 5.0, (double)f8 * 5.0, (double)f10 * 5.0);
        net.minecraft.u.b.o o2 = k2.a(s2, s3, true);
        if (o2 == null) {
            return new a(ab.b, cu2);
        }
        s s4 = b2.i(1.0f);
        boolean bl2 = false;
        List list = k2.b((net.minecraft.w.n)b2, b2.cT().a(s4.b * 5.0, s4.c * 5.0, s4.d * 5.0).b(1.0));
        for (int i2 = 0; i2 < list.size(); ++i2) {
            net.minecraft.w.n n2 = (net.minecraft.w.n)list.get(i2);
            if (!n2.cg_() || !((net.minecraft.u.b.a)(object = n2.cT().b(n2.cu()))).a(s2)) continue;
            bl2 = true;
        }
        if (bl2) {
            return new a(ab.b, cu2);
        }
        if (o2.a != p.b) {
            return new a(ab.b, cu2);
        }
        cn cn2 = k2.n(o2.a()).c();
        boolean bl3 = cn2 == net.minecraft.a.p.j || cn2 == net.minecraft.a.p.i;
        object = new net.minecraft.w.f.ab(k2, o2.c.b, bl3 ? o2.c.c - 0.12 : o2.c.c, o2.c.d);
        ((net.minecraft.w.f.ab)object).a(this.a);
        ((net.minecraft.w.f.ab)object).ba = b2.ba;
        if (!k2.a((net.minecraft.w.n)object, ((net.minecraft.w.n)object).cT().b(-0.1)).isEmpty()) {
            return new a(ab.c, cu2);
        }
        if (!k2.C) {
            k2.a((net.minecraft.w.n)object);
        }
        if (!b2.J.d) {
            --cu2.b;
        }
        b2.a(net.minecraft.r.o.b(this));
        return new a(ab.a, cu2);
    }
}

