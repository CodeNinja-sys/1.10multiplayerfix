/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import net.minecraft.a.f;
import net.minecraft.g.en;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.t.b;
import net.minecraft.u.ad;
import net.minecraft.u.bu;
import net.minecraft.w.f.af;

class g
extends b {
    g() {
    }

    @Override
    protected cu a(net.minecraft.t.g g2, cu cu2) {
        k k2 = g2.a();
        net.minecraft.u.b.b b2 = g2.e().a((ad)((Object)g2.f().a(en.a)));
        af af2 = new af(k2, (double)b2.cy_() + 0.5, b2.k(), (double)b2.l() + 0.5, null);
        k2.a(af2);
        k2.a(null, af2.aU, af2.aV, af2.aW, f.gz, bu.e, 1.0f, 1.0f);
        --cu2.b;
        return cu2;
    }
}

