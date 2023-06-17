/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.g.a.d;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.d.b;
import net.minecraft.client.g.g;
import net.minecraft.client.k.ce;
import net.minecraft.u.bp;

public class de {
    public static final bp y = new bp("textures/gui/options_background.png");
    public static final bp z = new bp("textures/gui/container/stats_icons.png");
    public static final bp A = new bp("textures/gui/icons.png");
    protected float B;

    protected void a(int n2, int n3, int n4, int n5) {
        if (n3 < n2) {
            int n6 = n2;
            n2 = n3;
            n3 = n6;
        }
        de.a(n2, n4, n3 + 1, n4 + 1, n5);
    }

    protected void b(int n2, int n3, int n4, int n5) {
        if (n4 < n3) {
            int n6 = n3;
            n3 = n4;
            n4 = n6;
        }
        de.a(n2, n3 + 1, n2 + 1, n4, n5);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (n2 < n4) {
            n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        if (n3 < n5) {
            n7 = n3;
            n3 = n5;
            n5 = n7;
        }
        float f2 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n6 & 0xFF) / 255.0f;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        bd.l();
        bd.w();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.c(f3, f4, f5, f2);
        g2.a(7, b.e);
        g2.b((double)n2, (double)n5, 0.0).d();
        g2.b((double)n4, (double)n5, 0.0).d();
        g2.b((double)n4, (double)n3, 0.0).d();
        g2.b((double)n2, (double)n3, 0.0).d();
        ci2.b();
        bd.v();
        bd.k();
    }

    protected void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        float f2 = (float)(n6 >> 24 & 0xFF) / 255.0f;
        float f3 = (float)(n6 >> 16 & 0xFF) / 255.0f;
        float f4 = (float)(n6 >> 8 & 0xFF) / 255.0f;
        float f5 = (float)(n6 & 0xFF) / 255.0f;
        float f6 = (float)(n7 >> 24 & 0xFF) / 255.0f;
        float f7 = (float)(n7 >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n7 >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n7 & 0xFF) / 255.0f;
        bd.w();
        bd.l();
        bd.c();
        bd.a(ad.l, bc.j, ad.e, bc.n);
        bd.j(7425);
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, b.f);
        g2.b((double)n4, (double)n3, (double)this.B).a(f3, f4, f5, f2).d();
        g2.b((double)n2, (double)n3, (double)this.B).a(f3, f4, f5, f2).d();
        g2.b((double)n2, (double)n5, (double)this.B).a(f7, f8, f9, f6).d();
        g2.b((double)n4, (double)n5, (double)this.B).a(f7, f8, f9, f6).d();
        ci2.b();
        bd.j(7424);
        bd.k();
        bd.d();
        bd.v();
    }

    public void a(ce ce2, String string, int n2, int n3, int n4) {
        ce2.a(string, (float)(n2 - ce2.a(string) / 2), (float)n3, n4);
    }

    public void b(ce ce2, String string, int n2, int n3, int n4) {
        ce2.a(string, (float)n2, (float)n3, n4);
    }

    public void a_(int n2, int n3, int n4, int n5, int n6, int n7) {
        float f2 = 0.00390625f;
        float f3 = 0.00390625f;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, b.g);
        g2.b((double)(n2 + 0), (double)(n3 + n7), (double)this.B).a((float)(n4 + 0) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).d();
        g2.b((double)(n2 + n6), (double)(n3 + n7), (double)this.B).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + n7) * 0.00390625f).d();
        g2.b((double)(n2 + n6), (double)(n3 + 0), (double)this.B).a((float)(n4 + n6) * 0.00390625f, (float)(n5 + 0) * 0.00390625f).d();
        g2.b((double)(n2 + 0), (double)(n3 + 0), (double)this.B).a((float)(n4 + 0) * 0.00390625f, (float)(n5 + 0) * 0.00390625f).d();
        ci2.b();
    }

    public void a(float f2, float f3, int n2, int n3, int n4, int n5) {
        float f4 = 0.00390625f;
        float f5 = 0.00390625f;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, b.g);
        g2.b((double)(f2 + 0.0f), (double)(f3 + (float)n5), (double)this.B).a((float)(n2 + 0) * 0.00390625f, (float)(n3 + n5) * 0.00390625f).d();
        g2.b((double)(f2 + (float)n4), (double)(f3 + (float)n5), (double)this.B).a((float)(n2 + n4) * 0.00390625f, (float)(n3 + n5) * 0.00390625f).d();
        g2.b((double)(f2 + (float)n4), (double)(f3 + 0.0f), (double)this.B).a((float)(n2 + n4) * 0.00390625f, (float)(n3 + 0) * 0.00390625f).d();
        g2.b((double)(f2 + 0.0f), (double)(f3 + 0.0f), (double)this.B).a((float)(n2 + 0) * 0.00390625f, (float)(n3 + 0) * 0.00390625f).d();
        ci2.b();
    }

    public void a(int n2, int n3, d d2, int n4, int n5) {
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, b.g);
        g2.b((double)(n2 + 0), (double)(n3 + n5), (double)this.B).a(d2.e(), d2.h()).d();
        g2.b((double)(n2 + n4), (double)(n3 + n5), (double)this.B).a(d2.f(), d2.h()).d();
        g2.b((double)(n2 + n4), (double)(n3 + 0), (double)this.B).a(d2.f(), d2.g()).d();
        g2.b((double)(n2 + 0), (double)(n3 + 0), (double)this.B).a(d2.e(), d2.g()).d();
        ci2.b();
    }

    public static void a(int n2, int n3, float f2, float f3, int n4, int n5, float f4, float f5) {
        float f6 = 1.0f / f4;
        float f7 = 1.0f / f5;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, b.g);
        g2.b((double)n2, (double)(n3 + n5), 0.0).a(f2 * f6, (f3 + (float)n5) * f7).d();
        g2.b((double)(n2 + n4), (double)(n3 + n5), 0.0).a((f2 + (float)n4) * f6, (f3 + (float)n5) * f7).d();
        g2.b((double)(n2 + n4), (double)n3, 0.0).a((f2 + (float)n4) * f6, f3 * f7).d();
        g2.b((double)n2, (double)n3, 0.0).a(f2 * f6, f3 * f7).d();
        ci2.b();
    }

    public static void a(int n2, int n3, float f2, float f3, int n4, int n5, int n6, int n7, float f4, float f5) {
        float f6 = 1.0f / f4;
        float f7 = 1.0f / f5;
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, b.g);
        g2.b((double)n2, (double)(n3 + n7), 0.0).a(f2 * f6, (f3 + (float)n5) * f7).d();
        g2.b((double)(n2 + n6), (double)(n3 + n7), 0.0).a((f2 + (float)n4) * f6, (f3 + (float)n5) * f7).d();
        g2.b((double)(n2 + n6), (double)n3, 0.0).a((f2 + (float)n4) * f6, f3 * f7).d();
        g2.b((double)n2, (double)n3, 0.0).a(f2 * f6, f3 * f7).d();
        ci2.b();
    }
}

