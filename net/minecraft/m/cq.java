/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import java.util.List;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.v.d;

public class cq
extends cg {
    public cq() {
        this.a(true);
        this.e(0);
        this.a(d.l);
    }

    @Override
    public String d(cu cu2) {
        return cu2.h() == 1 ? "item.charcoal" : "item.coal";
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        list.add(new cu(cg2, 1, 0));
        list.add(new cu(cg2, 1, 1));
    }
}

