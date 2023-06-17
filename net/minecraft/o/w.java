/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.h.k;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class w
extends j {
    public w(q q2, k ... arrk) {
        super(q2, ae.f, arrk);
        this.b("oxygen");
    }

    @Override
    public int a(int n2) {
        return 10 * n2;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 30;
    }

    @Override
    public int a() {
        return 3;
    }
}

