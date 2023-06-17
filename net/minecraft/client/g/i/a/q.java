/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.a.p;
import net.minecraft.client.g.b.a.ao;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.r;
import net.minecraft.m.cu;
import net.minecraft.w.e.bb;

public class q
implements s {
    private final net.minecraft.client.g.i.bd a;

    public q(net.minecraft.client.g.i.bd bd2) {
        this.a = bd2;
    }

    public void a(bb bb2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!bb2.cD() && !bb2.c()) {
            bd.D();
            this.a.e().c.c(0.0625f);
            float f9 = 0.625f;
            bd.c(0.0f, -0.34375f, 0.0f);
            bd.b(180.0f, 0.0f, 1.0f, 0.0f);
            bd.b(0.625f, -0.625f, -0.625f);
            r.z().ad().a(bb2, new cu(p.aU, 1), ao.f);
            bd.E();
        }
    }

    @Override
    public boolean bZ_() {
        return true;
    }
}

