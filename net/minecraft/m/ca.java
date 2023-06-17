/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.vi;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.h.k;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.p;
import net.minecraft.w.b.a.h;
import net.minecraft.w.d;
import net.minecraft.w.l;

public class ca
extends cg {
    private final float a;
    private final p b;

    public ca(p p2) {
        this.b = p2;
        this.i = 1;
        this.e(p2.a());
        this.a(net.minecraft.v.d.j);
        this.a = 3.0f + p2.c();
    }

    public float e() {
        return this.b.c();
    }

    @Override
    public float a(cu cu2, b b2) {
        cn cn2 = b2.c();
        if (cn2 == net.minecraft.a.p.G) {
            return 15.0f;
        }
        net.minecraft.g.a.h h2 = b2.d();
        return h2 != net.minecraft.g.a.h.k && h2 != net.minecraft.g.a.h.l && h2 != net.minecraft.g.a.h.v && h2 != net.minecraft.g.a.h.j && h2 != net.minecraft.g.a.h.C ? 1.0f : 1.5f;
    }

    @Override
    public boolean a(cu cu2, l l2, l l3) {
        cu2.a(1, l3);
        return true;
    }

    @Override
    public boolean a(cu cu2, net.minecraft.q.k k2, b b2, net.minecraft.u.b.b b3, l l2) {
        if ((double)b2.b(k2, b3) != 0.0) {
            cu2.a(2, l2);
        }
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean a(b b2) {
        return b2.c() == net.minecraft.a.p.G;
    }

    @Override
    public int cx_() {
        return this.b.e();
    }

    public String g() {
        return this.b.toString();
    }

    @Override
    public boolean a(cu cu2, cu cu3) {
        return this.b.f() == cu3.a() ? true : super.a(cu2, cu3);
    }

    @Override
    public vi a(k k2) {
        vi vi2 = super.a(k2);
        if (k2 == net.minecraft.h.k.a) {
            vi2.a(d.e.b(), new h(f, "Weapon modifier", this.a, 0));
            vi2.a(d.f.b(), new h(g, "Weapon modifier", -2.4f, 0));
        }
        return vi2;
    }
}

