/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.a.p;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.ap;
import net.minecraft.client.g.j;
import net.minecraft.client.r;
import net.minecraft.w.e.bj;

public class k
implements s {
    private final ap a;

    public k(ap ap2) {
        this.a = ap2;
    }

    public void a(bj bj2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (bj2.q() != 0) {
            j j2 = r.z().aa();
            bd.A();
            bd.D();
            bd.b(5.0f + 180.0f * ((net.minecraft.client.j.k)this.a.f()).c.f / (float)Math.PI, 1.0f, 0.0f, 0.0f);
            bd.b(90.0f, 1.0f, 0.0f, 0.0f);
            bd.c(-0.9375f, -0.625f, -0.9375f);
            float f9 = 0.5f;
            bd.b(0.5f, -0.5f, 0.5f);
            int n2 = bj2.m(f4);
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            ay.a(ay.r, n3, (float)n4);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a.a(f.b);
            j2.a(p.O.v(), 1.0f);
            bd.E();
            bd.B();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

