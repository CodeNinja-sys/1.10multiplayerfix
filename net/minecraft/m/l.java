/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.bm;
import net.minecraft.m.ar;
import net.minecraft.m.cu;

public class l
extends ar {
    private final bm b;

    public l(bm bm2) {
        super(bm2);
        this.b = bm2;
        this.e(0);
        this.a(true);
    }

    @Override
    public int a(int n2) {
        return n2 | 4;
    }

    @Override
    public String d(cu cu2) {
        return String.valueOf(super.cw_()) + "." + this.b.b(cu2.h()).d();
    }
}

