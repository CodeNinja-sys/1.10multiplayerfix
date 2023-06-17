/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.o;
import net.minecraft.client.r;
import net.minecraft.f.af;
import net.minecraft.f.y;
import net.minecraft.w.n;

public class s
extends o {
    public void a(y y2, double d2, double d3, double d4, float f2, int n2) {
        bd.D();
        bd.c((float)d2 + 0.5f, (float)d3, (float)d4 + 0.5f);
        s.a(y2.b(), d2, d3, d4, f2);
        bd.E();
    }

    public static void a(af af2, double d2, double d3, double d4, float f2) {
        n n2 = af2.d();
        if (n2 != null) {
            float f3 = 0.53125f;
            float f4 = Math.max(n2.bl, n2.bm);
            if ((double)f4 > 1.0) {
                f3 /= f4;
            }
            bd.c(0.0f, 0.4f, 0.0f);
            bd.b((float)(af2.f() + (af2.e() - af2.f()) * (double)f2) * 10.0f, 0.0f, 1.0f, 0.0f);
            bd.c(0.0f, -0.2f, 0.0f);
            bd.b(-30.0f, 1.0f, 0.0f, 0.0f);
            bd.b(f3, f3, f3);
            n2.b(d2, d3, d4, 0.0f, 0.0f);
            r.z().ab().a(n2, 0.0, 0.0, 0.0, 0.0f, f2, false);
        }
    }
}

