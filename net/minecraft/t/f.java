/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.t;

import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.t.c;
import net.minecraft.t.g;
import net.minecraft.u.ad;
import net.minecraft.w.n;
import net.minecraft.w.s;

public abstract class f
extends b {
    @Override
    public cu a(g g2, cu cu2) {
        k k2 = g2.a();
        c c2 = en.a(g2);
        ad ad2 = (ad)((Object)g2.f().a(en.a));
        s s2 = this.a(k2, c2, cu2);
        s2.c(ad2.h(), (float)ad2.i() + 0.1f, ad2.j(), this.b(), this.a());
        k2.a((n)((Object)s2));
        cu2.a(1);
        return cu2;
    }

    @Override
    protected void a(g g2) {
        g2.a().b(1002, g2.e(), 0);
    }

    protected abstract s a(k var1, c var2, cu var3);

    protected float a() {
        return 6.0f;
    }

    protected float b() {
        return 1.1f;
    }
}

