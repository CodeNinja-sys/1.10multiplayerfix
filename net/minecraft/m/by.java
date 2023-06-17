/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.a.w;
import net.minecraft.g.en;
import net.minecraft.h.k;
import net.minecraft.m.am;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.u.a;
import net.minecraft.u.ab;
import net.minecraft.u.ah;
import net.minecraft.u.bp;
import net.minecraft.v.d;
import net.minecraft.w.a.b;
import net.minecraft.w.f;

public class by
extends cg {
    public by() {
        this.i = 1;
        this.e(432);
        this.a(d.e);
        this.a(new bp("broken"), new am(this));
        en.c.a(this, dn.b);
    }

    public static boolean h(cu cu2) {
        return cu2.g() < cu2.i() - 1;
    }

    @Override
    public boolean a(cu cu2, cu cu3) {
        return cu3.a() == w.aM;
    }

    @Override
    public a a(cu cu2, net.minecraft.q.k k2, b b2, ah ah2) {
        k k3 = net.minecraft.w.f.c(cu2);
        cu cu3 = b2.a(k3);
        if (cu3 == null) {
            b2.a(k3, cu2.j());
            cu2.b = 0;
            return new a(ab.a, cu2);
        }
        return new a(ab.c, cu2);
    }
}

