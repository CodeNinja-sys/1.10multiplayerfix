/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import net.minecraft.a.p;
import net.minecraft.f.af;
import net.minecraft.f.y;
import net.minecraft.g.c.b;
import net.minecraft.q.k;
import net.minecraft.u.cf;

class o
extends af {
    final /* synthetic */ y a;

    o(y y2) {
        this.a = y2;
    }

    @Override
    public void a(int n2) {
        this.a.k.c(this.a.l, p.ac, n2, 0);
    }

    @Override
    public k a() {
        return this.a.k;
    }

    @Override
    public net.minecraft.u.b.b b() {
        return this.a.l;
    }

    @Override
    public void a(cf cf2) {
        super.a(cf2);
        if (this.a() != null) {
            b b2 = this.a().n(this.b());
            this.a().a(this.a.l, b2, b2, 4);
        }
    }
}

