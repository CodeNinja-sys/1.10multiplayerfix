/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.n;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.w.h.al;
import net.minecraft.w.h.z;

class ak
extends r {
    final /* synthetic */ n a;
    private final /* synthetic */ al f;

    ak(n n2, y y2, int n3, int n4, int n5, al al2) {
        this.a = n2;
        this.f = al2;
        super(y2, n3, n4, n5);
    }

    @Override
    public boolean a(cu cu2) {
        return super.a(cu2) && this.f.p().j() && z.b(cu2.a());
    }

    @Override
    public boolean f() {
        return this.f.p().j();
    }
}

