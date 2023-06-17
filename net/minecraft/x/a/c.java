/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.a;

import net.minecraft.u.b.q;
import net.minecraft.x.a;
import net.minecraft.x.a.g;
import net.minecraft.x.a.m;

class c
implements m {
    c() {
    }

    public void a(a a2, q q2) {
        a2.a(q2.b());
        a2.a(q2.c());
        a2.a(q2.d());
    }

    public q a(a a2) {
        return new q(a2.O(), a2.O(), a2.O());
    }

    @Override
    public g a(int n2) {
        return new g(n2, this);
    }

    @Override
    public /* synthetic */ Object b(a a2) {
        return this.a(a2);
    }
}

