/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.o;
import net.minecraft.a.w;
import net.minecraft.d.m;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.w.a.b;

class z
extends r {
    private final b a;

    public z(b b2, y y2, int n2, int n3, int n4) {
        super(y2, n2, n3, n4);
        this.a = b2;
    }

    @Override
    public boolean a(cu cu2) {
        return z.b(cu2);
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(b b2, cu cu2) {
        if (m.c(cu2) != o.b) {
            this.a.a((k)j.B);
        }
        super.a(b2, cu2);
    }

    public static boolean b(cu cu2) {
        if (cu2 == null) {
            return false;
        }
        cg cg2 = cu2.a();
        return cg2 == w.bG || cg2 == w.bJ || cg2 == w.bH || cg2 == w.bI;
    }
}

