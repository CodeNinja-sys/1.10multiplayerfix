/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.v;
import net.minecraft.client.j.e;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;

public class y
implements s {
    private static final bp a = new bp("textures/entity/wither/wither_armor.png");
    private final v b;
    private final e c = new e(0.5f);

    public y(v v2) {
        this.b = v2;
    }

    public void a(net.minecraft.w.d.e e2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (e2.q()) {
            bd.a(!e2.cD());
            this.b.a(a);
            bd.l(5890);
            bd.C();
            float f9 = (float)e2.by + f4;
            float f10 = n.b(f9 * 0.02f) * 3.0f;
            float f11 = f9 * 0.01f;
            bd.c(f10, f11, 0.0f);
            bd.l(5888);
            bd.l();
            float f12 = 0.5f;
            bd.c(0.5f, 0.5f, 0.5f, 1.0f);
            bd.f();
            bd.a(ad.e, bc.e);
            this.c.a(e2, f2, f3, f4);
            this.c.a(this.b.f());
            this.c.a(e2, f2, f3, f5, f6, f7, f8);
            bd.l(5890);
            bd.C();
            bd.l(5888);
            bd.e();
            bd.k();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

