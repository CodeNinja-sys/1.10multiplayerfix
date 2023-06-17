/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.w;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;

class b
extends r {
    public b(y y2, int n2, int n3, int n4) {
        super(y2, n2, n3, n4);
    }

    @Override
    public boolean a(cu cu2) {
        return net.minecraft.h.b.b(cu2);
    }

    public static boolean b(cu cu2) {
        return cu2 != null && cu2.a() == w.bN;
    }

    @Override
    public int a() {
        return 64;
    }
}

