/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.a.c;
import net.minecraft.m.cb;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dd;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.v.d;
import net.minecraft.w.a.b;

public class af
extends cb {
    public af(int n2, float f2, boolean bl2) {
        super(n2, f2, bl2);
        this.a(true);
    }

    @Override
    public boolean e(cu cu2) {
        return cu2.h() > 0;
    }

    @Override
    public dd f(cu cu2) {
        return cu2.h() == 0 ? dd.c : dd.d;
    }

    @Override
    protected void a(cu cu2, net.minecraft.q.k k2, b b2) {
        if (!k2.C) {
            if (cu2.h() > 0) {
                b2.a((k)net.minecraft.r.j.M);
                b2.c(new net.minecraft.d.j(c.j, 400, 1));
                b2.c(new net.minecraft.d.j(c.k, 6000, 0));
                b2.c(new net.minecraft.d.j(c.l, 6000, 0));
                b2.c(new net.minecraft.d.j(c.v, 2400, 3));
            } else {
                b2.c(new net.minecraft.d.j(c.j, 100, 1));
                b2.c(new net.minecraft.d.j(c.v, 2400, 0));
            }
        }
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(cg2));
        list.add(new cu(cg2, 1, 1));
    }
}

