/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.w;
import net.minecraft.m.cu;
import net.minecraft.m.t;
import net.minecraft.q.a.y;
import net.minecraft.q.k;
import net.minecraft.r.o;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.v.d;
import net.minecraft.w.a.b;

public class f
extends t {
    protected f() {
        this.a(d.f);
    }

    @Override
    public a a(cu cu2, k k2, b b2, ah ah2) {
        cu cu3 = new cu(w.bk, 1, k2.b("map"));
        String string = "map_" + cu3.h();
        y y2 = new y(string);
        k2.a(string, y2);
        y2.e = 0;
        y2.a(b2.aU, b2.aW, y2.e);
        y2.c = (byte)k2.q.a().a();
        y2.d = true;
        y2.d();
        --cu2.b;
        if (cu2.b <= 0) {
            return new a(ab.a, cu3);
        }
        if (!b2.q.c(cu3.j())) {
            b2.a(cu3, false);
        }
        b2.a(o.b(this));
        return new a(ab.a, cu2);
    }
}

