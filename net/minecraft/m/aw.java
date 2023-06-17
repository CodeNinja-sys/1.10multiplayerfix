/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.b.cm;
import java.util.List;
import net.minecraft.a.f;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.m.ad;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.b.o;
import net.minecraft.u.b.p;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a;
import net.minecraft.w.a.b;

public class aw
extends cg {
    public aw() {
        this.a(d.k);
    }

    @Override
    public net.minecraft.u.a a(cu cu2, k k2, b b2, ah ah2) {
        List list = k2.a(a.class, b2.cT().b(2.0), (cm)new ad(this));
        if (!list.isEmpty()) {
            a a2 = (a)list.get(0);
            a2.a(a2.a() - 0.5f);
            k2.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.J, bu.g, 1.0f, 1.0f);
            return new net.minecraft.u.a(ab.a, this.a(cu2, b2, new cu(w.bK)));
        }
        o o2 = this.a(k2, b2, true);
        if (o2 == null) {
            return new net.minecraft.u.a(ab.b, cu2);
        }
        if (o2.a == p.b) {
            net.minecraft.u.b.b b3 = o2.a();
            if (!k2.a(b2, b3) || !b2.a(b3.a(o2.b), o2.b, cu2)) {
                return new net.minecraft.u.a(ab.b, cu2);
            }
            if (k2.n(b3).d() == net.minecraft.g.a.h.h) {
                k2.a(b2, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.I, bu.g, 1.0f, 1.0f);
                return new net.minecraft.u.a(ab.a, this.a(cu2, b2, new cu(w.bG)));
            }
        }
        return new net.minecraft.u.a(ab.b, cu2);
    }

    protected cu a(cu cu2, b b2, cu cu3) {
        --cu2.b;
        b2.a(net.minecraft.r.o.b(this));
        if (cu2.b <= 0) {
            return cu3;
        }
        if (!b2.q.c(cu3)) {
            b2.a(cu3, false);
        }
        return cu2;
    }
}

