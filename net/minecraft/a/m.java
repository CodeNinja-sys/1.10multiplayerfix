/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.g.en;
import net.minecraft.m.cd;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.t.g;
import net.minecraft.u.ad;

class m
extends b {
    private boolean a = true;

    m() {
    }

    @Override
    protected cu a(g g2, cu cu2) {
        if (cd.a == cd.a(cu2.h())) {
            net.minecraft.u.b.b b2;
            k k2 = g2.a();
            if (net.minecraft.m.m.a(cu2, k2, b2 = g2.e().a((ad)((Object)g2.f().a(en.a))))) {
                if (!k2.C) {
                    k2.b(2005, b2, 0);
                }
            } else {
                this.a = false;
            }
            return cu2;
        }
        return super.a(g2, cu2);
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

