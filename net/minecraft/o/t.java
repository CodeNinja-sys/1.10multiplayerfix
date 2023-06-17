/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import net.minecraft.h.k;
import net.minecraft.o.ae;
import net.minecraft.o.j;
import net.minecraft.o.q;

public class t
extends j {
    public t(q q2, k ... arrk) {
        super(q2, ae.j, arrk);
        this.b("mending");
    }

    @Override
    public int a(int n2) {
        return n2 * 25;
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + 50;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int a() {
        return 1;
    }
}

