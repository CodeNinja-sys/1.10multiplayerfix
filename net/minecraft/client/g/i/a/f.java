/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.l;
import net.minecraft.u.bp;
import net.minecraft.w.e.au;

public class f
implements s {
    private static final bp a = new bp("textures/entity/enderman/enderman_eyes.png");
    private final l b;

    public f(l l2) {
        this.b = l2;
    }

    public void a(au au2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.b.a(a);
        bd.l();
        bd.c();
        bd.a(ad.e, bc.e);
        bd.f();
        bd.a(!au2.cD());
        int n2 = 61680;
        int n3 = 61680;
        boolean bl2 = false;
        ay.a(ay.r, 61680.0f, 0.0f);
        bd.e();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.f().a(au2, f2, f3, f5, f6, f7, f8);
        this.b.a(au2, f4);
        bd.a(true);
        bd.k();
        bd.d();
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

