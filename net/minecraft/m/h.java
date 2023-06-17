/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.ah;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.f;
import net.minecraft.w.l;

public class h
extends cg {
    public h() {
        this.a(d.i);
    }

    @Override
    public boolean a(cu cu2, b b2, l l2, ah ah2) {
        if (!cu2.s()) {
            return false;
        }
        if (l2 instanceof f) {
            f f2 = (f)l2;
            f2.g(cu2.q());
            f2.aJ();
            --cu2.b;
            return true;
        }
        return super.a(cu2, b2, l2, ah2);
    }
}

