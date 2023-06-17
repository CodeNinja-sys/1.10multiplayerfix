/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.f;
import net.minecraft.d.m;
import net.minecraft.m.ae;
import net.minecraft.m.cu;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.w.a.b;
import net.minecraft.w.c.k;

public class de
extends ae {
    @Override
    public String a(cu cu2) {
        return net.minecraft.u.d.b.a.a(m.c(cu2).b("lingering_potion.effect."));
    }

    @Override
    public void a(cu cu2, b b2, List list, boolean bl2) {
        m.a(cu2, list, 0.25f);
    }

    @Override
    public a a(cu cu2, net.minecraft.q.k k2, b b2, ah ah2) {
        if (!b2.J.d) {
            --cu2.b;
        }
        k2.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.do, bu.g, 0.5f, 0.4f / (h.nextFloat() * 0.4f + 0.8f));
        if (!k2.C) {
            k k3 = new k(k2, b2, cu2);
            k3.a(b2, b2.bb, b2.ba, -20.0f, 0.5f, 1.0f);
            k2.a(k3);
        }
        b2.a(o.b(this));
        return new a(ab.a, cu2);
    }
}

