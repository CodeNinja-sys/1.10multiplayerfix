/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import com.a.a.d.vi;
import java.util.Set;
import net.minecraft.g.c.b;
import net.minecraft.h.k;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.p;
import net.minecraft.w.b.a.h;
import net.minecraft.w.d;
import net.minecraft.w.l;

public class bd
extends cg {
    private final Set l;
    protected float a = 4.0f;
    protected float b;
    protected float c;
    protected p d;

    protected bd(float f2, float f3, p p2, Set set) {
        this.d = p2;
        this.l = set;
        this.i = 1;
        this.e(p2.a());
        this.a = p2.b();
        this.b = f2 + p2.c();
        this.c = f3;
        this.a(net.minecraft.v.d.i);
    }

    protected bd(p p2, Set set) {
        this(0.0f, 0.0f, p2, set);
    }

    @Override
    public float a(cu cu2, b b2) {
        return this.l.contains(b2.c()) ? this.a : 1.0f;
    }

    @Override
    public boolean a(cu cu2, l l2, l l3) {
        cu2.a(2, l3);
        return true;
    }

    @Override
    public boolean a(cu cu2, net.minecraft.q.k k2, b b2, net.minecraft.u.b.b b3, l l2) {
        if ((double)b2.b(k2, b3) != 0.0) {
            cu2.a(1, l2);
        }
        return true;
    }

    @Override
    public boolean c() {
        return true;
    }

    public p e() {
        return this.d;
    }

    @Override
    public int cx_() {
        return this.d.e();
    }

    public String g() {
        return this.d.toString();
    }

    @Override
    public boolean a(cu cu2, cu cu3) {
        return this.d.f() == cu3.a() ? true : super.a(cu2, cu3);
    }

    @Override
    public vi a(k k2) {
        vi vi2 = super.a(k2);
        if (k2 == net.minecraft.h.k.a) {
            vi2.a(net.minecraft.w.d.e.b(), new h(f, "Tool modifier", this.b, 0));
            vi2.a(net.minecraft.w.d.f.b(), new h(g, "Tool modifier", this.c, 0));
        }
        return vi2;
    }
}

