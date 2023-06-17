/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.bb;
import net.minecraft.u.bp;
import net.minecraft.w.e.c;

public class t
implements s {
    private static final bp a = new bp("textures/entity/spider_eyes.png");
    private final bb b;

    public t(bb bb2) {
        this.b = bb2;
    }

    public void a(c c2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.b.a(a);
        bd.l();
        bd.c();
        bd.a(ad.e, bc.e);
        if (c2.cD()) {
            bd.a(false);
        } else {
            bd.a(true);
        }
        int n2 = 61680;
        int n3 = n2 % 65536;
        int n4 = n2 / 65536;
        ay.a(ay.r, n3, (float)n4);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.b.f().a(c2, f2, f3, f5, f6, f7, f8);
        n2 = c2.m(f4);
        n3 = n2 % 65536;
        n4 = n2 / 65536;
        ay.a(ay.r, n3, (float)n4);
        this.b.a(c2, f4);
        bd.k();
        bd.d();
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

