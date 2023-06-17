/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.f.af;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.f.aa;
import net.minecraft.w.n;

class ac
extends af {
    final /* synthetic */ aa a;

    ac(aa aa2) {
        this.a = aa2;
    }

    @Override
    public void a(int n2) {
        this.a.aQ.a((n)this.a, (byte)n2);
    }

    @Override
    public k a() {
        return this.a.aQ;
    }

    @Override
    public b b() {
        return new b(this.a);
    }
}

