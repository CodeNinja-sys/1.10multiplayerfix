/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.w;
import net.minecraft.h.ao;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;

class ah
extends r {
    final /* synthetic */ ao a;

    public ah(ao ao2, y y2, int n2, int n3, int n4) {
        this.a = ao2;
        super(y2, n2, n3, n4);
    }

    @Override
    public boolean a(cu cu2) {
        return cu2 == null ? false : cu2.a() == w.bY || cu2.a() == w.k || cu2.a() == w.m || cu2.a() == w.l;
    }

    @Override
    public int a() {
        return 1;
    }
}

