/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.a.aa;
import net.minecraft.h.k;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class p
extends j {
    public p(q q2, k ... arrk) {
        super(q2, ae.c, arrk);
        this.b("waterWalker");
    }

    @Override
    public int a(int n2) {
        return n2 * 10;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public boolean a(j j2) {
        return super.a(j2) && j2 != aa.j;
    }
}

