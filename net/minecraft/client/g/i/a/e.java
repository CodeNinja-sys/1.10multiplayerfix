/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.a.w;
import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.az;
import net.minecraft.client.j.q;
import net.minecraft.client.r;
import net.minecraft.g.cn;
import net.minecraft.m.ar;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.w.e.u;

public class e
implements s {
    private final az a;

    public e(az az2) {
        this.a = az2;
    }

    public void a(u u2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        cu cu2 = u2.bC();
        if (cu2 != null) {
            bd.d(1.0f, 1.0f, 1.0f);
            bd.D();
            if (this.a.f().r) {
                bd.c(0.0f, 0.625f, 0.0f);
                bd.b(-20.0f, -1.0f, 0.0f, 0.0f);
                float f9 = 0.5f;
                bd.b(0.5f, 0.5f, 0.5f);
            }
            ((q)this.a.f()).g.c(0.0625f);
            bd.c(-0.0625f, 0.53125f, 0.21875f);
            cg cg2 = cu2.a();
            r r2 = r.z();
            if (cg2 instanceof ar && r2.aa().a(cn.a(cg2))) {
                bd.c(0.0f, 0.0625f, -0.25f);
                bd.b(30.0f, 1.0f, 0.0f, 0.0f);
                bd.b(-5.0f, 0.0f, 1.0f, 0.0f);
                float f10 = 0.375f;
                bd.b(0.375f, -0.375f, 0.375f);
            } else if (cg2 == w.f) {
                bd.c(0.0f, 0.125f, -0.125f);
                bd.b(-45.0f, 0.0f, 1.0f, 0.0f);
                float f11 = 0.625f;
                bd.b(0.625f, -0.625f, 0.625f);
                bd.b(-100.0f, 1.0f, 0.0f, 0.0f);
                bd.b(-20.0f, 0.0f, 1.0f, 0.0f);
            } else if (cg2.c()) {
                if (cg2.n()) {
                    bd.b(180.0f, 0.0f, 0.0f, 1.0f);
                    bd.c(0.0f, -0.0625f, 0.0f);
                }
                this.a.a();
                bd.c(0.0625f, -0.125f, 0.0f);
                float f12 = 0.625f;
                bd.b(0.625f, -0.625f, 0.625f);
                bd.b(0.0f, 1.0f, 0.0f, 0.0f);
                bd.b(0.0f, 0.0f, 1.0f, 0.0f);
            } else {
                bd.c(0.1875f, 0.1875f, 0.0f);
                float f13 = 0.875f;
                bd.b(0.875f, 0.875f, 0.875f);
                bd.b(-20.0f, 0.0f, 0.0f, 1.0f);
                bd.b(-60.0f, 1.0f, 0.0f, 0.0f);
                bd.b(-30.0f, 0.0f, 0.0f, 1.0f);
            }
            bd.b(-15.0f, 1.0f, 0.0f, 0.0f);
            bd.b(40.0f, 0.0f, 0.0f, 1.0f);
            r2.ad().a(u2, cu2, ao.c);
            bd.E();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

