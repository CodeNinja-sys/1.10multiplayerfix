/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.h.k;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class aa
extends j {
    public aa(q q2, k ... arrk) {
        super(q2, ae.k, arrk);
        this.b("arrowDamage");
    }

    @Override
    public int a(int n2) {
        return 1 + (n2 - 1) * 10;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 15;
    }

    @Override
    public int a() {
        return 5;
    }
}

