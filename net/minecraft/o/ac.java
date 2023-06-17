/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.h.k;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class ac
extends j {
    public ac(q q2, k ... arrk) {
        super(q2, ae.k, arrk);
        this.b("arrowKnockback");
    }

    @Override
    public int a(int n2) {
        return 12 + (n2 - 1) * 20;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 25;
    }

    @Override
    public int a() {
        return 2;
    }
}

