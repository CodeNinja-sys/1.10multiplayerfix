/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.w;
import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.m.do;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;

class a
extends b {
    private final b a = new b();

    a() {
    }

    @Override
    public cu a(g g2, cu cu2) {
        do do_ = (do)cu2.a();
        net.minecraft.u.b.b b2 = g2.e().a((ad)((Object)g2.f().a(en.a)));
        if (do_.a(null, g2.a(), b2)) {
            cu2.a(w.ay);
            cu2.b = 1;
            return cu2;
        }
        return this.a.a_(g2, cu2);
    }
}

