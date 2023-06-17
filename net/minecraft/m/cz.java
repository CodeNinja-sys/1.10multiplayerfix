/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.f;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.ah;
import net.minecraft.u.bu;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

public class cz
extends cg {
    public cz() {
        this.i = 1;
        this.a(d.e);
    }

    @Override
    public boolean a(cu cu2, b b2, l l2, ah ah2) {
        if (l2 instanceof net.minecraft.w.h.l) {
            net.minecraft.w.h.l l3 = (net.minecraft.w.h.l)l2;
            if (!l3.p() && !l3.ba()) {
                l3.a(true);
                l3.aQ.a(b2, l3.aU, l3.aV, l3.aW, net.minecraft.a.f.dY, bu.g, 0.5f, 1.0f);
                --cu2.b;
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean a(cu cu2, l l2, l l3) {
        this.a(cu2, null, l2, ah.a);
        return true;
    }
}

