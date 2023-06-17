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
import net.minecraft.u.b.n;
import net.minecraft.v.d;

public class j
extends cn {
    public j(h h2) {
        super(h2);
        this.a(d.b);
    }

    @Override
    public int a(Random random) {
        return 2 + random.nextInt(2);
    }

    @Override
    public int a(int n2, Random random) {
        return n.a(this.a(random) + random.nextInt(n2 + 1), 1, 5);
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return net.minecraft.a.w.cN;
    }

    @Override
    public e g(b b2) {
        return e.p;
    }

    @Override
    protected boolean bQ_() {
        return true;
    }
}

