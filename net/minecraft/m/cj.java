/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.f.k;

public class cj
extends cg {
    public cj() {
        this.i = 16;
        this.a(d.f);
    }

    @Override
    public a a(cu cu2, net.minecraft.q.k k2, b b2, ah ah2) {
        if (!b2.J.d) {
            --cu2.b;
        }
        k2.a(null, b2.aU, b2.aV, b2.aW, net.minecraft.a.f.bg, bu.g, 0.5f, 0.4f / (h.nextFloat() * 0.4f + 0.8f));
        b2.aL().a((cg)this, 20);
        if (!k2.C) {
            k k3 = new k(k2, b2);
            k3.a(b2, b2.bb, b2.ba, 0.0f, 1.5f, 1.0f);
            k2.a(k3);
        }
        b2.a(o.b(this));
        return new a(ab.a, cu2);
    }
}

