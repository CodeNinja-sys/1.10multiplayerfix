/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.d.a.a;

import net.minecraft.u.n;
import net.minecraft.w.c.f;
import net.minecraft.w.d.a;
import net.minecraft.w.d.a.a.k;
import net.minecraft.w.d.b;

public abstract class q
extends k {
    public q(a a2) {
        super(a2);
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public float a(b b2, n n2, float f2) {
        if (n2.i() instanceof f) {
            n2.i().k(1);
            return 0.0f;
        }
        return super.a(b2, n2, f2);
    }
}

