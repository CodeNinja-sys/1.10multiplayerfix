/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.w;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.h.l;

public class ck
extends cg {
    public ck() {
        this.a(d.e);
        this.d(1);
        this.e(25);
    }

    @Override
    public boolean c() {
        return true;
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        if (b2.cz() && b2.df() instanceof l) {
            l l2 = (l)b2.df();
            if (cu2.i() - cu2.h() >= 7 && l2.q()) {
                cu2.a(7, (net.minecraft.w.l)b2);
                if (cu2.b == 0) {
                    cu cu3 = new cu(w.aY);
                    cu3.d(cu2.o());
                    return new a(ab.a, cu3);
                }
                return new a(ab.a, cu2);
            }
        }
        b2.a(o.b(this));
        return new a(ab.b, cu2);
    }
}

