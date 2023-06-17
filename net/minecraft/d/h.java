/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import net.minecraft.d.c;
import net.minecraft.w.b.a.b;
import net.minecraft.w.l;

public class h
extends c {
    protected h(boolean bl2, int n2) {
        super(bl2, n2);
    }

    @Override
    public void a(l l2, b b2, int n2) {
        l2.f(l2.aB() - (float)(4 * (n2 + 1)));
        super.a(l2, b2, n2);
    }

    @Override
    public void b(l l2, b b2, int n2) {
        l2.f(l2.aB() + (float)(4 * (n2 + 1)));
        super.b(l2, b2, n2);
    }
}

