/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.a.w;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.ab;
import net.minecraft.client.h.a;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.u.b.n;
import net.minecraft.w.a.j;

public class v
implements s {
    private final ab a;

    public v(ab ab2) {
        this.a = ab2;
    }

    public void a(a a2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        cu cu2;
        if (a2.d() && !a2.cD() && a2.a(j.a) && a2.h() != null && ((cu2 = a2.a(k.e)) == null || cu2.a() != w.cR)) {
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a.a(a2.h());
            bd.D();
            bd.c(0.0f, 0.0f, 0.125f);
            double d2 = a2.y + (a2.B - a2.y) * (double)f4 - (a2.aR + (a2.aU - a2.aR) * (double)f4);
            double d3 = a2.z + (a2.C - a2.z) * (double)f4 - (a2.aS + (a2.aV - a2.aS) * (double)f4);
            double d4 = a2.A + (a2.D - a2.A) * (double)f4 - (a2.aT + (a2.aW - a2.aT) * (double)f4);
            float f9 = a2.al + (a2.ak - a2.al) * f4;
            double d5 = n.a(f9 * ((float)Math.PI / 180));
            double d6 = -n.b(f9 * ((float)Math.PI / 180));
            float f10 = (float)d3 * 10.0f;
            f10 = n.a(f10, -6.0f, 32.0f);
            float f11 = (float)(d2 * d5 + d4 * d6) * 100.0f;
            float f12 = (float)(d2 * d6 - d4 * d5) * 100.0f;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            float f13 = a2.v + (a2.w - a2.v) * f4;
            f10 += n.a((a2.bn + (a2.bo - a2.bn) * f4) * 6.0f) * 32.0f * f13;
            if (a2.G()) {
                f10 += 25.0f;
            }
            bd.b(6.0f + f11 / 2.0f + f10, 1.0f, 0.0f, 0.0f);
            bd.b(f12 / 2.0f, 0.0f, 0.0f, 1.0f);
            bd.b(-f12 / 2.0f, 0.0f, 1.0f, 0.0f);
            bd.b(180.0f, 0.0f, 1.0f, 0.0f);
            this.a.e().b(0.0625f);
            bd.E();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

