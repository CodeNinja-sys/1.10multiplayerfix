/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.v.d;
import net.minecraft.w.l;

public class ak
extends cg {
    public ak() {
        this.d(1);
        this.e(238);
        this.a(d.i);
    }

    @Override
    public boolean a(cu cu2, k k2, b b2, net.minecraft.u.b.b b3, l l2) {
        cu2.a(1, l2);
        cn cn2 = b2.c();
        return b2.d() != net.minecraft.g.a.h.j && cn2 != p.G && cn2 != p.H && cn2 != p.bn && cn2 != p.bS && cn2 != p.L ? super.a(cu2, k2, b2, b3, l2) : true;
    }

    @Override
    public boolean a(b b2) {
        cn cn2 = b2.c();
        return cn2 == p.G || cn2 == p.af || cn2 == p.bS;
    }

    @Override
    public float a(cu cu2, b b2) {
        cn cn2 = b2.c();
        return cn2 != p.G && b2.d() != net.minecraft.g.a.h.j ? (cn2 == p.L ? 5.0f : super.a(cu2, b2)) : 15.0f;
    }
}

