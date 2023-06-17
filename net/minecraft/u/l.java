/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.m.cg;
import net.minecraft.u.j;
import net.minecraft.w.a.g;
import net.minecraft.x.d.b.u;

public class l
extends j {
    private final g a;

    public l(g g2) {
        this.a = g2;
    }

    @Override
    protected void b(cg cg2, int n2) {
        super.b(cg2, n2);
        this.a.a.a(new u(cg2, n2));
    }

    @Override
    protected void c(cg cg2) {
        super.c(cg2);
        this.a.a.a(new u(cg2, 0));
    }
}

