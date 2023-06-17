/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.n;
import net.minecraft.client.g.c.o;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.g.v;
import net.minecraft.client.r;
import net.minecraft.f.am;
import net.minecraft.m.cd;
import net.minecraft.u.bp;

public class h
extends o {
    private static final bp d = new bp("textures/environment/end_sky.png");
    private static final bp e = new bp("textures/entity/end_portal.png");
    private static final bp f = new bp("textures/entity/end_gateway_beam.png");
    private static final Random g = new Random(31100L);
    private static final FloatBuffer h = v.e(16);
    private static final FloatBuffer i = v.e(16);
    FloatBuffer a = v.e(16);

    public void a(am am2, double d2, double d3, double d4, float f2, int n2) {
        int n3;
        bd.o();
        if (am2.g() || am2.h()) {
            bd.a(516, 0.1f);
            this.a(f);
            float f3 = am2.g() ? am2.i() : am2.j();
            double d5 = am2.g() ? 256.0 - d3 : 25.0;
            f3 = net.minecraft.u.b.n.a(f3 * (float)Math.PI);
            n3 = net.minecraft.u.b.n.c((double)f3 * d5);
            float[] arrf = net.minecraft.w.h.ad.a(am2.g() ? cd.c : cd.e);
            n.a(d2, d3, d4, f2, f3, am2.cD_().B(), 0, n3, arrf, 0.15, 0.175);
            n.a(d2, d3, d4, f2, f3, am2.cD_().B(), 0, -n3, arrf, 0.15, 0.175);
        }
        bd.f();
        g.setSeed(31100L);
        bd.c(2982, h);
        bd.c(2983, i);
        double d6 = d2 * d2 + d3 * d3 + d4 * d4;
        int n4 = d6 > 36864.0 ? 2 : (d6 > 25600.0 ? 4 : (d6 > 16384.0 ? 6 : (d6 > 9216.0 ? 8 : (d6 > 4096.0 ? 10 : (d6 > 1024.0 ? 12 : (d6 > 576.0 ? 14 : (d6 > 256.0 ? 15 : 16)))))));
        for (n3 = 0; n3 < n4; ++n3) {
            bd.D();
            float f4 = 2.0f / (float)(18 - n3);
            if (n3 == 0) {
                this.a(d);
                f4 = 0.15f;
                bd.l();
                bd.a(ad.l, bc.j);
            }
            if (n3 >= 1) {
                this.a(e);
            }
            if (n3 == 1) {
                bd.l();
                bd.a(ad.e, bc.e);
            }
            bd.a(net.minecraft.client.g.d.a, 9216);
            bd.a(net.minecraft.client.g.d.b, 9216);
            bd.a(net.minecraft.client.g.d.c, 9216);
            bd.a(net.minecraft.client.g.d.a, 9474, this.a(1.0f, 0.0f, 0.0f, 0.0f));
            bd.a(net.minecraft.client.g.d.b, 9474, this.a(0.0f, 1.0f, 0.0f, 0.0f));
            bd.a(net.minecraft.client.g.d.c, 9474, this.a(0.0f, 0.0f, 1.0f, 0.0f));
            bd.a(net.minecraft.client.g.d.a);
            bd.a(net.minecraft.client.g.d.b);
            bd.a(net.minecraft.client.g.d.c);
            bd.E();
            bd.l(5890);
            bd.D();
            bd.C();
            bd.c(0.5f, 0.5f, 0.0f);
            bd.b(0.5f, 0.5f, 1.0f);
            float f5 = n3 + 1;
            bd.c(17.0f / f5, (2.0f + f5 / 1.5f) * ((float)r.I() % 800000.0f / 800000.0f), 0.0f);
            bd.b((f5 * f5 * 4321.0f + f5 * 9.0f) * 2.0f, 0.0f, 0.0f, 1.0f);
            bd.b(4.5f - f5 / 4.0f, 4.5f - f5 / 4.0f, 1.0f);
            bd.a(i);
            bd.a(h);
            ci ci2 = ci.a();
            g g2 = ci2.c();
            g2.a(7, net.minecraft.client.g.d.b.f);
            float f6 = (g.nextFloat() * 0.5f + 0.1f) * f4;
            float f7 = (g.nextFloat() * 0.5f + 0.4f) * f4;
            float f8 = (g.nextFloat() * 0.5f + 0.5f) * f4;
            if (am2.a(net.minecraft.u.ad.d)) {
                g2.b(d2, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
            }
            if (am2.a(net.minecraft.u.ad.c)) {
                g2.b(d2, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3, d4).a(f6, f7, f8, 1.0f).d();
                g2.b(d2, d3, d4).a(f6, f7, f8, 1.0f).d();
            }
            if (am2.a(net.minecraft.u.ad.f)) {
                g2.b(d2 + 1.0, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3, d4).a(f6, f7, f8, 1.0f).d();
            }
            if (am2.a(net.minecraft.u.ad.e)) {
                g2.b(d2, d3, d4).a(f6, f7, f8, 1.0f).d();
                g2.b(d2, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
            }
            if (am2.a(net.minecraft.u.ad.a)) {
                g2.b(d2, d3, d4).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3, d4).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2, d3, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
            }
            if (am2.a(net.minecraft.u.ad.b)) {
                g2.b(d2, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3 + 1.0, d4 + 1.0).a(f6, f7, f8, 1.0f).d();
                g2.b(d2 + 1.0, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
                g2.b(d2, d3 + 1.0, d4).a(f6, f7, f8, 1.0f).d();
            }
            ci2.b();
            bd.E();
            bd.l(5888);
            this.a(d);
        }
        bd.k();
        bd.b(net.minecraft.client.g.d.a);
        bd.b(net.minecraft.client.g.d.b);
        bd.b(net.minecraft.client.g.d.c);
        bd.e();
        bd.n();
    }

    private FloatBuffer a(float f2, float f3, float f4, float f5) {
        this.a.clear();
        this.a.put(f2).put(f3).put(f4).put(f5);
        this.a.flip();
        return this.a;
    }

    public boolean a(am am2) {
        return am2.g() || am2.h();
    }
}

