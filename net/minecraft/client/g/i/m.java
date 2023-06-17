/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.am;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.aa;
import net.minecraft.client.g.i.f;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.w.f.e;

public class m
extends aa {
    private static final bp a = new bp("textures/entity/experience_orb.png");

    public m(f f2) {
        super(f2);
        this.d = 0.15f;
        this.e = 0.75f;
    }

    public void a(e e2, double d2, double d3, double d4, float f2, float f3) {
        if (!this.f) {
            bd.D();
            bd.c((float)d2, (float)d3, (float)d4);
            this.e(e2);
            am.b();
            int n2 = e2.c();
            float f4 = (float)(n2 % 4 * 16 + 0) / 64.0f;
            float f5 = (float)(n2 % 4 * 16 + 16) / 64.0f;
            float f6 = (float)(n2 / 4 * 16 + 0) / 64.0f;
            float f7 = (float)(n2 / 4 * 16 + 16) / 64.0f;
            float f8 = 1.0f;
            float f9 = 0.5f;
            float f10 = 0.25f;
            int n3 = e2.m(f3);
            int n4 = n3 % 65536;
            int n5 = n3 / 65536;
            ay.a(ay.r, n4, (float)n5);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            float f11 = 255.0f;
            float f12 = ((float)e2.a + f3) / 2.0f;
            n5 = (int)((n.a(f12 + 0.0f) + 1.0f) * 0.5f * 255.0f);
            int n6 = 255;
            int n7 = (int)((n.a(f12 + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
            bd.c(0.0f, 0.1f, 0.0f);
            bd.b(180.0f - this.c.e, 0.0f, 1.0f, 0.0f);
            bd.b((float)(this.c.g.as == 2 ? -1 : 1) * -this.c.f, 1.0f, 0.0f, 0.0f);
            float f13 = 0.3f;
            bd.b(0.3f, 0.3f, 0.3f);
            ci ci2 = ci.a();
            g g2 = ci2.c();
            g2.a(7, b.l);
            g2.b(-0.5, -0.25, 0.0).a(f4, f7).b(n5, 255, n7, 128).c(0.0f, 1.0f, 0.0f).d();
            g2.b(0.5, -0.25, 0.0).a(f5, f7).b(n5, 255, n7, 128).c(0.0f, 1.0f, 0.0f).d();
            g2.b(0.5, 0.75, 0.0).a(f5, f6).b(n5, 255, n7, 128).c(0.0f, 1.0f, 0.0f).d();
            g2.b(-0.5, 0.75, 0.0).a(f4, f6).b(n5, 255, n7, 128).c(0.0f, 1.0f, 0.0f).d();
            ci2.b();
            bd.k();
            bd.B();
            bd.E();
            super.a((net.minecraft.w.n)e2, d2, d3, d4, f2, f3);
        }
    }

    protected bp a(e e2) {
        return a;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((e)n2);
    }
}

