/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.b;
import net.minecraft.m.cu;
import net.minecraft.t.c;
import net.minecraft.t.f;
import net.minecraft.w.c.k;
import net.minecraft.w.s;

class t
extends f {
    final /* synthetic */ b a;
    private final /* synthetic */ cu c;

    t(b b2, cu cu2) {
        this.a = b2;
        this.c = cu2;
    }

    @Override
    protected s a(net.minecraft.q.k k2, c c2, cu cu2) {
        return new k(k2, c2.b(), c2.c(), c2.d(), this.c.j());
    }

    @Override
    protected float a() {
        return super.a() * 0.5f;
    }

    @Override
    protected float b() {
        return super.b() * 1.25f;
    }
}

