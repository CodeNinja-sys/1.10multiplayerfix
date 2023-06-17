/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.w;
import net.minecraft.m.av;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.l;

public class bu
extends cg {
    public bu() {
        this.d(1);
        this.a(d.f);
    }

    @Override
    public cu a(cu cu2, k k2, l l2) {
        if (l2 instanceof b && !((b)l2).J.d) {
            --cu2.b;
        }
        if (!k2.C) {
            l2.bl();
        }
        if (l2 instanceof b) {
            ((b)l2).a(o.b(this));
        }
        return cu2.b <= 0 ? new cu(w.ay) : cu2;
    }

    @Override
    public int c(cu cu2) {
        return 32;
    }

    @Override
    public av b(cu cu2) {
        return av.c;
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        b2.b(ah2);
        return new a(ab.a, cu2);
    }
}

