/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.h;

import net.minecraft.client.g.h.d;
import net.minecraft.client.g.h.g;
import net.minecraft.f.ap;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.ar;
import net.minecraft.m.cg;
import net.minecraft.q.n;

class x
implements d {
    private final /* synthetic */ g a;

    x(g g2) {
        this.a = g2;
    }

    @Override
    public int a(b b2, n n2, net.minecraft.u.b.b b3, int n3) {
        if (n2 != null && b3 != null) {
            cg cg2;
            ap ap2 = n2.q(b3);
            if (ap2 instanceof net.minecraft.f.g && (cg2 = ((net.minecraft.f.g)ap2).b()) instanceof ar) {
                b b4 = cn.a(cg2).v();
                return this.a.a(b4, n2, b3, n3);
            }
            return -1;
        }
        return -1;
    }
}

