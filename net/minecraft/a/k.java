/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.p;
import net.minecraft.g.bt;
import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;

class k
extends b {
    private boolean a = true;

    k() {
    }

    @Override
    protected cu a(g g2, cu cu2) {
        net.minecraft.q.k k2 = g2.a();
        net.minecraft.u.b.b b2 = g2.e().a((ad)((Object)g2.f().a(en.a)));
        bt bt2 = (bt)p.aU;
        if (k2.c(b2) && bt2.c(k2, b2)) {
            if (!k2.C) {
                k2.a(b2, bt2.v(), 3);
            }
            --cu2.b;
        } else {
            cu cu3 = dn.a(g2, cu2);
            if (cu3 == null) {
                this.a = false;
            }
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

