/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.c.m;

public class cm
extends cg {
    public cm() {
        this.i = 16;
        this.a(d.l);
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        if (!b2.J.d) {
            --cu2.b;
        }
        k2.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.aC, bu.g, 0.5f, 0.4f / (h.nextFloat() * 0.4f + 0.8f));
        if (!k2.C) {
            m m2 = new m(k2, b2);
            m2.a(b2, b2.bb, b2.ba, 0.0f, 1.5f, 1.0f);
            k2.a(m2);
        }
        b2.a(o.b(this));
        return new a(ab.a, cu2);
    }
}

