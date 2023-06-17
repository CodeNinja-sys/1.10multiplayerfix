/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.a.w;
import net.minecraft.g.c.b;
import net.minecraft.g.z;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.q.n;
import net.minecraft.u.b.a;

public class he
extends z {
    private static final a[] b = new a[]{new a(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.4375, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new a(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0)};

    @Override
    protected cg f() {
        return net.minecraft.a.w.cc;
    }

    @Override
    protected cg g() {
        return net.minecraft.a.w.cc;
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        super.a(k2, b2, b3, f2, n2);
        if (!k2.C && this.m(b3) && k2.p.nextInt(50) == 0) {
            he.a(k2, b2, new cu(net.minecraft.a.w.ce));
        }
    }

    @Override
    public a a(b b2, n n2, net.minecraft.u.b.b b3) {
        return b[(Integer)b2.a(this.d())];
    }
}

