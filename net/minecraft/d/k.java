/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import net.minecraft.d.c;
import net.minecraft.w.b.a.h;

public class k
extends c {
    protected final double b;

    protected k(boolean bl2, int n2, double d2) {
        super(bl2, n2);
        this.b = d2;
    }

    @Override
    public double a(int n2, h h2) {
        return this.b * (double)(n2 + 1);
    }
}

