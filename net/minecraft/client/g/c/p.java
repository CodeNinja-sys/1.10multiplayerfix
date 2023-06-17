/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.bm;
import net.minecraft.client.g.c.o;
import net.minecraft.client.j.bb;
import net.minecraft.f.w;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;

public class p
extends o {
    private final bb a = new bb();

    public void a(w w2, double d2, double d3, double d4, float f2, int n2) {
        float f3;
        boolean bl2 = w2.cD_() != null;
        boolean bl3 = !bl2 || w2.E() == net.minecraft.a.p.cK;
        int n3 = bl2 ? w2.bL_() : 0;
        long l2 = bl2 ? w2.cD_().B() : 0L;
        bd.D();
        float f4 = 0.6666667f;
        if (bl3) {
            bd.c((float)d2 + 0.5f, (float)d3 + 0.5f, (float)d4 + 0.5f);
            f3 = (float)(n3 * 360) / 16.0f;
            bd.b(-f3, 0.0f, 1.0f, 0.0f);
            this.a.b.j = true;
        } else {
            f3 = 0.0f;
            if (n3 == 2) {
                f3 = 180.0f;
            }
            if (n3 == 4) {
                f3 = 90.0f;
            }
            if (n3 == 5) {
                f3 = -90.0f;
            }
            bd.c((float)d2 + 0.5f, (float)d3 - 0.16666667f, (float)d4 + 0.5f);
            bd.b(-f3, 0.0f, 1.0f, 0.0f);
            bd.c(0.0f, -0.3125f, -0.4375f);
            this.a.b.j = false;
        }
        b b2 = w2.D();
        float f5 = (float)(b2.cy_() * 7 + b2.k() * 9 + b2.l() * 13) + (float)l2 + f2;
        this.a.a.f = (-0.0125f + 0.01f * n.b(f5 * (float)Math.PI * 0.02f)) * (float)Math.PI;
        bd.A();
        bp bp2 = this.a(w2);
        if (bp2 != null) {
            this.a(bp2);
            bd.D();
            bd.b(0.6666667f, -0.6666667f, -0.6666667f);
            this.a.a();
            bd.E();
        }
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.E();
    }

    private bp a(w w2) {
        return bm.a.a(w2.j(), w2.g(), w2.i());
    }
}

