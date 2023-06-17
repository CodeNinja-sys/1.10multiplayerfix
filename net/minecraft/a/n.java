/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.p;
import net.minecraft.g.en;
import net.minecraft.g.et;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;

class n
extends b {
    private boolean a = true;

    n() {
    }

    @Override
    protected cu a(g g2, cu cu2) {
        net.minecraft.u.b.b b2;
        k k2 = g2.a();
        if (k2.c(b2 = g2.e().a((ad)((Object)g2.f().a(en.a))))) {
            k2.b(b2, p.ab.v());
            if (cu2.a(1, k2.p)) {
                cu2.b = 0;
            }
        } else if (k2.n(b2).c() == p.W) {
            p.W.a_(k2, b2, p.W.v().a(et.a, Boolean.valueOf(true)));
            k2.f(b2);
        } else {
            this.a = false;
        }
        return cu2;
    }

    @Override
    protected void a(g g2) {
        if (this.a) {
            g2.a().b(1000, g2.e(), 0);
        } else {
            g2.a().b(1001, g2.e(), 0);
        }
    }
}

