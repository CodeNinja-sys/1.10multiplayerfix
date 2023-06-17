/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.w;
import net.minecraft.f.aa;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;

public class av
extends r {
    public av(y y2, int n2, int n3, int n4) {
        super(y2, n2, n3, n4);
    }

    @Override
    public boolean a(cu cu2) {
        return aa.c(cu2) || av.b(cu2);
    }

    @Override
    public int e(cu cu2) {
        return av.b(cu2) ? 1 : super.e(cu2);
    }

    public static boolean b(cu cu2) {
        return cu2 != null && cu2.a() != null && cu2.a() == w.ay;
    }
}

