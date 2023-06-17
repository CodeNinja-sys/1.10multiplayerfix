/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.c;
import net.minecraft.d.j;
import net.minecraft.m.cb;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dg;
import net.minecraft.q.k;
import net.minecraft.v.d;
import net.minecraft.w.a.b;

public class az
extends cb {
    private final boolean b;

    public az(boolean bl2) {
        super(0, 0.0f, false);
        this.b = bl2;
    }

    @Override
    public int h(cu cu2) {
        dg dg2 = dg.a(cu2);
        return this.b && dg2.g() ? dg2.e() : dg2.c();
    }

    @Override
    public float i(cu cu2) {
        dg dg2 = dg.a(cu2);
        return this.b && dg2.g() ? dg2.f() : dg2.d();
    }

    @Override
    protected void a(cu cu2, k k2, b b2) {
        dg dg2 = dg.a(cu2);
        if (dg2 == dg.d) {
            b2.c(new j(c.s, 1200, 3));
            b2.c(new j(c.q, 300, 2));
            b2.c(new j(c.i, 300, 1));
        }
        super.a(cu2, k2, b2);
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (dg dg2 : dg.values()) {
            if (this.b && !dg2.g()) continue;
            list.add(new cu(this, 1, dg2.a()));
        }
    }

    @Override
    public String d(cu cu2) {
        dg dg2 = dg.a(cu2);
        return String.valueOf(this.cw_()) + "." + dg2.b() + "." + (this.b && dg2.g() ? "cooked" : "raw");
    }
}

