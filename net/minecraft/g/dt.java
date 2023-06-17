/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.q.au;
import net.minecraft.q.k;
import net.minecraft.v.d;

public class dt
extends cn {
    protected dt() {
        super(h.z);
        this.b(true);
        this.a(d.b);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.aF;
    }

    @Override
    public int a(Random random) {
        return 4;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (k2.b(au.b, b2) > 11) {
            this.b(k2, b2, k2.n(b2), 0);
            k2.f(b2);
        }
    }
}

