/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ao;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.o;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.v;
import net.minecraft.client.r;
import net.minecraft.u.bp;

public class l
extends o {
    private static final bp d = new bp("textures/environment/end_sky.png");
    private static final bp e = new bp("textures/entity/end_portal.png");
    private static final Random f = new Random(31100L);
    FloatBuffer a = v.e(16);

    public void a(net.minecraft.f.ao ao2, double d2, double d3, double d4, float f2, int n2) {
        float f3 = (float)this.c.k;
        float f4 = (float)this.c.l;
        float f5 = (float)this.c.m;
        bd.f();
        f.setSeed(31100L);
        float f6 = 0.75f;
        for (int i2 = 0; i2 < 16; ++i2) {
            bd.D();
            float f7 = 16 - i2;
            float f8 = 0.0625f;
            float f9 = 1.0f / (f7 + 1.0f);
            if (i2 == 0) {
                this.a(d);
                f9 = 0.1f;
                f7 = 65.0f;
                f8 = 0.125f;
                bd.l();
                bd.a(ad.l, bc.j);
            }
            if (i2 >= 1) {
                this.a(e);
            }
            if (i2 == 1) {
                bd.l();
                bd.a(ad.e, bc.e);
                f8 = 0.5f;
            }
            float f10 = (float)(-(d3 + 0.75));
            float f11 = f10 + (float)ao.a().c;
            float f12 = f10 + f7 + (float)ao.a().c;
            float f13 = f11 / f12;
            f13 = (float)(d3 + 0.75) + f13;
            bd.c(f3, f13, f5);
            bd.a(net.minecraft.client.g.d.a, 9217);
            bd.a(net.minecraft.client.g.d.b, 9217);
            bd.a(net.minecraft.client.g.d.c, 9217);
            bd.a(net.minecraft.client.g.d.d, 9216);
            bd.a(net.minecraft.client.g.d.a, 9473, this.a(1.0f, 0.0f, 0.0f, 0.0f));
            bd.a(net.minecraft.client.g.d.b, 9473, this.a(0.0f, 0.0f, 1.0f, 0.0f));
            bd.a(net.minecraft.client.g.d.c, 9473, this.a(0.0f, 0.0f, 0.0f, 1.0f));
            bd.a(net.minecraft.client.g.d.d, 9474, this.a(0.0f, 1.0f, 0.0f, 0.0f));
            bd.a(net.minecraft.client.g.d.a);
            bd.a(net.minecraft.client.g.d.b);
            bd.a(net.minecraft.client.g.d.c);
            bd.a(net.minecraft.client.g.d.d);
            bd.E();
            bd.l(5890);
            bd.D();
            bd.C();
            bd.c(0.0f, (float)(r.I() % 700000L) / 700000.0f, 0.0f);
            bd.b(f8, f8, f8);
            bd.c(0.5f, 0.5f, 0.0f);
            bd.b((float)(i2 * i2 * 4321 + i2 * 9) * 2.0f, 0.0f, 0.0f, 1.0f);
            bd.c(-0.5f, -0.5f, 0.0f);
            bd.c(-f3, -f5, -f4);
            f11 = f10 + (float)ao.a().c;
            bd.c((float)ao.a().b * f7 / f11, (float)ao.a().d * f7 / f11, -f4);
            ci ci2 = ci.a();
            g g2 = ci2.c();
            g2.a(7, net.minecraft.client.g.d.b.f);
            float f14 = (f.nextFloat() * 0.5f + 0.1f) * f9;
            float f15 = (f.nextFloat() * 0.5f + 0.4f) * f9;
            float f16 = (f.nextFloat() * 0.5f + 0.5f) * f9;
            g2.b(d2, d3 + 0.75, d4).a(f14, f15, f16, 1.0f).d();
            g2.b(d2, d3 + 0.75, d4 + 1.0).a(f14, f15, f16, 1.0f).d();
            g2.b(d2 + 1.0, d3 + 0.75, d4 + 1.0).a(f14, f15, f16, 1.0f).d();
            g2.b(d2 + 1.0, d3 + 0.75, d4).a(f14, f15, f16, 1.0f).d();
            ci2.b();
            bd.E();
            bd.l(5888);
            this.a(d);
        }
        bd.k();
        bd.b(net.minecraft.client.g.d.a);
        bd.b(net.minecraft.client.g.d.b);
        bd.b(net.minecraft.client.g.d.c);
        bd.b(net.minecraft.client.g.d.d);
        bd.e();
    }

    private FloatBuffer a(float f2, float f3, float f4, float f5) {
        this.a.clear();
        this.a.put(f2).put(f3).put(f4).put(f5);
        this.a.flip();
        return this.a;
    }
}

