/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.a.w;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class o
extends j {
    protected o(q q2, k ... arrk) {
        super(q2, ae.h, arrk);
        this.b("digging");
    }

    @Override
    public int a(int n2) {
        return 1 + 10 * (n2 - 1);
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public boolean a(cu cu2) {
        return cu2.a() == w.bl ? true : super.a(cu2);
    }
}

