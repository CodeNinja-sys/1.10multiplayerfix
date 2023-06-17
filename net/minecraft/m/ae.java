/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.w;
import net.minecraft.d.j;
import net.minecraft.d.m;
import net.minecraft.m.av;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

public class ae
extends cg {
    public ae() {
        this.d(1);
        this.a(d.k);
    }

    @Override
    public cu a(cu cu2, k k2, l l2) {
        b b2;
        b b3 = b2 = l2 instanceof b ? (b)l2 : null;
        if (b2 == null || !b2.J.d) {
            --cu2.b;
        }
        if (!k2.C) {
            for (j j2 : m.a(cu2)) {
                l2.c(new j(j2));
            }
        }
        if (b2 != null) {
            b2.a(o.b(this));
        }
        if (b2 == null || !b2.J.d) {
            if (cu2.b <= 0) {
                return new cu(w.bJ);
            }
            if (b2 != null) {
                b2.q.c(new cu(w.bJ));
            }
        }
        return cu2;
    }

    @Override
    public int c(cu cu2) {
        return 32;
    }

    @Override
    public av b(cu cu2) {
        return av.c;
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        b2.b(ah2);
        return new a(ab.a, cu2);
    }

    @Override
    public String a(cu cu2) {
        return net.minecraft.u.d.b.a.a(m.c(cu2).b("potion.effect."));
    }

    @Override
    public void a(cu cu2, b b2, List list, boolean bl2) {
        m.a(cu2, list, 1.0f);
    }

    @Override
    public boolean e(cu cu2) {
        return !m.a(cu2).isEmpty();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (net.minecraft.d.b b2 : net.minecraft.d.b.a) {
            list.add(m.a(new cu(cg2), b2));
        }
    }
}

