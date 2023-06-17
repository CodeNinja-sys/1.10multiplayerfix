/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.ba;
import net.minecraft.client.j.a;
import net.minecraft.m.cd;
import net.minecraft.u.bp;
import net.minecraft.w.h.ad;

public class b
implements s {
    private static final bp a = new bp("textures/entity/sheep/sheep_fur.png");
    private final ba b;
    private final a c = new a();

    public b(ba ba2) {
        this.b = ba2;
    }

    public void a(ad ad2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!ad2.q() && !ad2.cD()) {
            this.b.a(a);
            if (ad2.bO_() && "jeb_".equals(ad2.cP())) {
                int n2 = 25;
                int n3 = ad2.by / 25 + ad2.ca();
                int n4 = cd.values().length;
                int n5 = n3 % n4;
                int n6 = (n3 + 1) % n4;
                float f9 = ((float)(ad2.by % 25) + f4) / 25.0f;
                float[] arrf = ad.a(cd.b(n5));
                float[] arrf2 = ad.a(cd.b(n6));
                bd.d(arrf[0] * (1.0f - f9) + arrf2[0] * f9, arrf[1] * (1.0f - f9) + arrf2[1] * f9, arrf[2] * (1.0f - f9) + arrf2[2] * f9);
            } else {
                float[] arrf = ad.a(ad2.p());
                bd.d(arrf[0], arrf[1], arrf[2]);
            }
            this.c.a(this.b.f());
            this.c.a(ad2, f2, f3, f4);
            this.c.a(ad2, f2, f3, f5, f6, f7, f8);
        }
    }

    @Override
    public boolean bZ_() {
        return true;
    }
}

