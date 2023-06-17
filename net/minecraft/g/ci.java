/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.v.d;

public class ci
extends cn {
    protected ci() {
        super(h.C, e.u);
        this.a(d.b);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.bm;
    }

    @Override
    public int a(Random random) {
        return 3 + random.nextInt(5);
    }

    @Override
    public int a(int n2, Random random) {
        return Math.min(9, this.a(random) + random.nextInt(1 + n2));
    }
}

