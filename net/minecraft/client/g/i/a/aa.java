/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.a.f;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.l;
import net.minecraft.client.g.j;
import net.minecraft.client.r;
import net.minecraft.g.c.b;
import net.minecraft.w.e.au;

public class aa
implements s {
    private final l a;

    public aa(l l2) {
        this.a = l2;
    }

    public void a(au au2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        b b2 = au2.q();
        if (b2 != null) {
            j j2 = r.z().aa();
            bd.A();
            bd.D();
            bd.c(0.0f, 0.6875f, -0.75f);
            bd.b(20.0f, 1.0f, 0.0f, 0.0f);
            bd.b(45.0f, 0.0f, 1.0f, 0.0f);
            bd.c(0.25f, 0.1875f, 0.25f);
            float f9 = 0.5f;
            bd.b(-0.5f, -0.5f, 0.5f);
            int n2 = au2.m(f4);
            int n3 = n2 % 65536;
            int n4 = n2 / 65536;
            ay.a(ay.r, n3, (float)n4);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            this.a.a(f.b);
            j2.a(b2, 1.0f);
            bd.E();
            bd.B();
        }
    }

    @Override
    public boolean bZ_() {
        return false;
    }
}

