/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.f.ap;
import net.minecraft.f.y;
import net.minecraft.g.a;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ac;
import net.minecraft.u.c;

public class ek
extends a {
    protected ek() {
        super(h.e);
    }

    @Override
    public ap a(k k2, int n2) {
        return new y();
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return null;
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        super.a(k2, b2, b3, f2, n2);
        int n3 = 15 + k2.p.nextInt(15) + k2.p.nextInt(15);
        this.b(k2, b2, n3);
    }

    @Override
    public boolean d(b b2) {
        return false;
    }

    @Override
    public ac a(b b2) {
        return ac.d;
    }

    @Override
    public c bR_() {
        return c.c;
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return null;
    }
}

