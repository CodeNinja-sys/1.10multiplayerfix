/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.a.w;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.h;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.ab;
import net.minecraft.client.h.a;
import net.minecraft.client.j.g;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.u.bp;
import net.minecraft.w.a.j;

public class i
implements s {
    private static final bp a = new bp("textures/entity/elytra.png");
    private final ab b;
    private final g c = new g();

    public i(ab ab2) {
        this.b = ab2;
    }

    public void a(a a2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        cu cu2 = a2.a(k.e);
        if (cu2 != null && cu2.a() == w.cR) {
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.l();
            if (a2.i() && a2.j() != null) {
                this.b.a(a2.j());
            } else if (a2.d() && a2.h() != null && a2.a(j.a)) {
                this.b.a(a2.h());
            } else {
                this.b.a(a);
            }
            bd.D();
            bd.c(0.0f, 0.0f, 0.125f);
            this.c.a(f2, f3, f5, f6, f7, f8, a2);
            this.c.a(a2, f2, f3, f5, f6, f7, f8);
            if (cu2.w()) {
                h.a(this.b, a2, this.c, f2, f3, f4, f5, f6, f7, f8);
            }
            bd.E();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

