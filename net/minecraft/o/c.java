/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.a.aa;
import net.minecraft.h.k;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class c
extends j {
    protected c(q q2, k ... arrk) {
        super(q2, ae.h, arrk);
        this.b("untouching");
    }

    @Override
    public int a(int n2) {
        return 15;
    }

    @Override
    public int b(int n2) {
        return super.a(n2) + 50;
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public boolean a(j j2) {
        return super.a(j2) && j2 != aa.t;
    }
}

