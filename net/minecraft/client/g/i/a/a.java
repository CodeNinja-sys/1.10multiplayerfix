/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.ab;

public class a
implements s {
    private final ab a;

    public a(ab ab2) {
        this.a = ab2;
    }

    public void a(net.minecraft.client.h.a a2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if ("deadmau5".equals(a2.X()) && a2.f() && !a2.cD()) {
            this.a.a(a2.g());
            for (int i2 = 0; i2 < 2; ++i2) {
                float f9 = a2.bc + (a2.ba - a2.bc) * f4 - (a2.al + (a2.ak - a2.al) * f4);
                float f10 = a2.bd + (a2.bb - a2.bd) * f4;
                bd.D();
                bd.b(f9, 0.0f, 1.0f, 0.0f);
                bd.b(f10, 1.0f, 0.0f, 0.0f);
                bd.c(0.375f * (float)(i2 * 2 - 1), 0.0f, 0.0f);
                bd.c(0.0f, -0.375f, 0.0f);
                bd.b(-f10, 1.0f, 0.0f, 0.0f);
                bd.b(-f9, 0.0f, 1.0f, 0.0f);
                float f11 = 1.3333334f;
                bd.b(1.3333334f, 1.3333334f, 1.3333334f);
                this.a.e().a(0.0625f);
                bd.E();
            }
        }
    }

    @Override
    public boolean bZ_() {
        return true;
    }
}

