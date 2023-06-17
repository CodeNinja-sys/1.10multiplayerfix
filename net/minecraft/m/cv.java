/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.d.m;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.j;
import net.minecraft.q.k;
import net.minecraft.u.d.b.a;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.c.f;
import net.minecraft.w.c.i;
import net.minecraft.w.l;

public class cv
extends j {
    @Override
    public f a(k k2, cu cu2, l l2) {
        i i2 = new i(k2, l2);
        i2.a(cu2);
        return i2;
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (net.minecraft.d.b b2 : net.minecraft.d.b.a) {
            list.add(m.a(new cu(cg2), b2));
        }
    }

    @Override
    public void a(cu cu2, b b2, List list, boolean bl2) {
        m.a(cu2, list, 0.125f);
    }

    @Override
    public String a(cu cu2) {
        return a.a(m.c(cu2).b("tipped_arrow.effect."));
    }
}

