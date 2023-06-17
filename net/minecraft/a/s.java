/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.q;
import net.minecraft.m.cu;
import net.minecraft.t.c;
import net.minecraft.t.f;
import net.minecraft.w.c.k;

class s
extends f {
    final /* synthetic */ q a;
    private final /* synthetic */ cu c;

    s(q q2, cu cu2) {
        this.a = q2;
        this.c = cu2;
    }

    @Override
    protected net.minecraft.w.s a(net.minecraft.q.k k2, c c2, cu cu2) {
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

