/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.al;
import net.minecraft.client.j.b;
import net.minecraft.client.r;
import net.minecraft.m.cu;
import net.minecraft.u.ai;
import net.minecraft.w.l;

public class j
implements s {
    protected final al a;

    public j(al al2) {
        this.a = al2;
    }

    @Override
    public void a(l l2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        cu cu2;
        boolean bl2 = l2.aH() == ai.b;
        cu cu3 = bl2 ? l2.bD() : l2.bC();
        cu cu4 = cu2 = bl2 ? l2.bC() : l2.bD();
        if (cu3 != null || cu2 != null) {
            bd.D();
            if (this.a.f().r) {
                float f9 = 0.5f;
                bd.c(0.0f, 0.625f, 0.0f);
                bd.b(-20.0f, -1.0f, 0.0f, 0.0f);
                bd.b(0.5f, 0.5f, 0.5f);
            }
            this.a(l2, cu2, ao.c, ai.b);
            this.a(l2, cu3, ao.b, ai.a);
            bd.E();
        }
    }

    private void a(l l2, cu cu2, ao ao2, ai ai2) {
        if (cu2 != null) {
            bd.D();
            ((b)this.a.f()).a(0.0625f, ai2);
            if (l2.G()) {
                bd.c(0.0f, 0.2f, 0.0f);
            }
            bd.b(-90.0f, 1.0f, 0.0f, 0.0f);
            bd.b(180.0f, 0.0f, 1.0f, 0.0f);
            boolean bl2 = ai2 == ai.a;
            bd.c((float)(bl2 ? -1 : 1) / 16.0f, 0.125f, -0.625f);
            r.z().ad().a(l2, cu2, ao2, bl2);
            bd.E();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

