/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.w;
import net.minecraft.h.n;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;

class d
extends r {
    final /* synthetic */ n a;

    d(n n2, y y2, int n3, int n4, int n5) {
        this.a = n2;
        super(y2, n3, n4, n5);
    }

    @Override
    public boolean a(cu cu2) {
        return super.a(cu2) && cu2.a() == w.aC && !this.c();
    }
}

