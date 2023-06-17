/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.p;
import net.minecraft.g.gy;
import net.minecraft.h.ar;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.w.a.b;

class g
extends r {
    final /* synthetic */ ar a;
    private final /* synthetic */ k f;
    private final /* synthetic */ net.minecraft.u.b.b g;

    g(ar ar2, y y2, int n2, int n3, int n4, k k2, net.minecraft.u.b.b b2) {
        this.a = ar2;
        this.f = k2;
        this.g = b2;
        super(y2, n2, n3, n4);
    }

    @Override
    public boolean a(cu cu2) {
        return false;
    }

    @Override
    public boolean a(b b2) {
        return (b2.J.d || b2.K >= this.a.a) && this.a.a > 0 && this.c();
    }

    @Override
    public void a(b b2, cu cu2) {
        Object object;
        if (!b2.J.d) {
            b2.g(-this.a.a);
        }
        ar.a(this.a).a(0, null);
        if (ar.b(this.a) > 0) {
            object = ar.a(this.a).a(1);
            if (object != null && ((cu)object).b > ar.b(this.a)) {
                ((cu)object).b -= ar.b(this.a);
                ar.a(this.a).a(1, (cu)object);
            } else {
                ar.a(this.a).a(1, null);
            }
        } else {
            ar.a(this.a).a(1, null);
        }
        this.a.a = 0;
        object = this.f.n(this.g);
        if (!b2.J.d && !this.f.C && object.c() == p.cf && b2.bd().nextFloat() < 0.12f) {
            int n2 = (Integer)object.a(gy.c);
            if (++n2 > 2) {
                this.f.f(this.g);
                this.f.b(1029, this.g, 0);
            } else {
                this.f.a(this.g, object.a(gy.c, Integer.valueOf(n2)), 2);
                this.f.b(1030, this.g, 0);
            }
        } else if (!this.f.C) {
            this.f.b(1030, this.g, 0);
        }
    }
}

