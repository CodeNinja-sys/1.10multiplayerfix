/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.o;
import net.minecraft.u.bp;
import net.minecraft.w.d.a;

public class l
implements s {
    private static final bp a = new bp("textures/entity/enderdragon/dragon_eyes.png");
    private final o b;

    public l(o o2) {
        this.b = o2;
    }

    public void a(a a2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.b.a(a);
        bd.l();
        bd.c();
        bd.a(ad.e, bc.e);
        bd.f();
        bd.c(514);
        int n2 = 61680;
        int n3 = 61680;
        boolean bl2 = false;
        ay.a(ay.r, 61680.0f, 0.0f);
        bd.e();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.f().a(a2, f2, f3, f5, f6, f7, f8);
        this.b.a(a2, f4);
        bd.k();
        bd.d();
        bd.c(515);
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

