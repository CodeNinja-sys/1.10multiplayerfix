/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bq;
import net.minecraft.client.g.d;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GLContext;

class ae
extends bq {
    @Override
    public void a() {
        bd.c();
        bd.a(519, 0.0f);
        bd.f();
        GL11.e(2899, am.a(0.2f, 0.2f, 0.2f, 1.0f));
        for (int i2 = 0; i2 < 8; ++i2) {
            bd.b(i2);
            GL11.j(16384 + i2, 4608, am.a(0.0f, 0.0f, 0.0f, 1.0f));
            GL11.j(16384 + i2, 4611, am.a(0.0f, 0.0f, 1.0f, 0.0f));
            if (i2 == 0) {
                GL11.j(16384 + i2, 4609, am.a(1.0f, 1.0f, 1.0f, 1.0f));
                GL11.j(16384 + i2, 4610, am.a(1.0f, 1.0f, 1.0f, 1.0f));
                continue;
            }
            GL11.j(16384 + i2, 4609, am.a(0.0f, 0.0f, 0.0f, 1.0f));
            GL11.j(16384 + i2, 4610, am.a(0.0f, 0.0f, 0.0f, 1.0f));
        }
        bd.h();
        bd.a(1032, 5634);
        bd.i();
        bd.c(513);
        bd.a(true);
        bd.k();
        bd.a(ad.e, bc.n);
        bd.a(ad.e, bc.n, ad.e, bc.n);
        GL14.a(32774);
        bd.o();
        GL11.f(2917, 2048);
        bd.a(1.0f);
        bd.b(0.0f);
        bd.c(1.0f);
        GL11.d(2918, am.a(0.0f, 0.0f, 0.0f, 0.0f));
        if (GLContext.a().fk) {
            GL11.f(2917, 34140);
        }
        bd.a(0.0f, 0.0f);
        bd.u();
        bd.f(5379);
        bd.b(d.a);
        bd.a(d.a, 9216);
        bd.a(d.a, 9474, am.a(1.0f, 0.0f, 0.0f, 0.0f));
        bd.a(d.a, 9217, am.a(1.0f, 0.0f, 0.0f, 0.0f));
        bd.b(d.b);
        bd.a(d.b, 9216);
        bd.a(d.b, 9474, am.a(0.0f, 1.0f, 0.0f, 0.0f));
        bd.a(d.b, 9217, am.a(0.0f, 1.0f, 0.0f, 0.0f));
        bd.b(d.c);
        bd.a(d.c, 9216);
        bd.a(d.c, 9474, am.a(0.0f, 0.0f, 0.0f, 0.0f));
        bd.a(d.c, 9217, am.a(0.0f, 0.0f, 0.0f, 0.0f));
        bd.b(d.d);
        bd.a(d.d, 9216);
        bd.a(d.d, 9474, am.a(0.0f, 0.0f, 0.0f, 0.0f));
        bd.a(d.d, 9217, am.a(0.0f, 0.0f, 0.0f, 0.0f));
        bd.g(0);
        GL11.k(3553, 10240, 9729);
        GL11.k(3553, 10241, 9986);
        GL11.k(3553, 10242, 10497);
        GL11.k(3553, 10243, 10497);
        GL11.k(3553, 33085, 1000);
        GL11.k(3553, 33083, 1000);
        GL11.k(3553, 33082, -1000);
        GL11.c(3553, 34049, 0.0f);
        GL11.m(8960, 8704, 8448);
        GL11.n(8960, 8705, am.a(0.0f, 0.0f, 0.0f, 0.0f));
        GL11.m(8960, 34161, 8448);
        GL11.m(8960, 34162, 8448);
        GL11.m(8960, 34176, 5890);
        GL11.m(8960, 34177, 34168);
        GL11.m(8960, 34178, 34166);
        GL11.m(8960, 34184, 5890);
        GL11.m(8960, 34185, 34168);
        GL11.m(8960, 34186, 34166);
        GL11.m(8960, 34192, 768);
        GL11.m(8960, 34193, 768);
        GL11.m(8960, 34194, 770);
        GL11.m(8960, 34200, 770);
        GL11.m(8960, 34201, 770);
        GL11.m(8960, 34202, 770);
        GL11.e(8960, 34163, 1.0f);
        GL11.e(8960, 3356, 1.0f);
        bd.z();
        bd.j(7425);
        bd.B();
        bd.a(true, true, true, true);
        bd.a(1.0);
        GL11.b(1.0f);
        GL11.b(0.0f, 0.0f, 1.0f);
        GL11.p(1028, 6914);
        GL11.p(1029, 6914);
    }

    @Override
    public void b() {
    }
}

