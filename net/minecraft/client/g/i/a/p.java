/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.af;
import net.minecraft.client.j.l;
import net.minecraft.u.bp;
import net.minecraft.w.e.bi;

public class p
implements s {
    private static final bp a = new bp("textures/entity/creeper/creeper_armor.png");
    private final af b;
    private final l c = new l(2.0f);

    public p(af af2) {
        this.b = af2;
    }

    public void a(bi bi2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (bi2.c()) {
            boolean bl2 = bi2.cD();
            bd.a(!bl2);
            this.b.a(a);
            bd.l(5890);
            bd.C();
            float f9 = (float)bi2.by + f4;
            bd.c(f9 * 0.01f, f9 * 0.01f, 0.0f);
            bd.l(5888);
            bd.l();
            float f10 = 0.5f;
            bd.c(0.5f, 0.5f, 0.5f, 1.0f);
            bd.f();
            bd.a(ad.e, bc.e);
            this.c.a(this.b.f());
            this.c.a(bi2, f2, f3, f5, f6, f7, f8);
            bd.l(5890);
            bd.C();
            bd.l(5888);
            bd.e();
            bd.k();
            bd.a(bl2);
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

