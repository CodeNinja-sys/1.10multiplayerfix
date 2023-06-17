/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.aj;
import net.minecraft.h.k;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.w.f;

class am
extends r {
    final /* synthetic */ aj a;
    private final /* synthetic */ k f;

    am(aj aj2, y y2, int n2, int n3, int n4, k k2) {
        this.a = aj2;
        this.f = k2;
        super(y2, n2, n3, n4);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public boolean a(cu cu2) {
        if (cu2 == null) {
            return false;
        }
        k k2 = net.minecraft.w.f.c(cu2);
        return k2 == this.f;
    }

    @Override
    public String e() {
        return dn.a[this.f.b()];
    }
}

