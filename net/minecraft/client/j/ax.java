/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.bj;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.d.a;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class ax
extends ap {
    private final w a;
    private final w b;
    private final w c;
    private final w d;
    private final w e;
    private final w f;
    private final w g;
    private final w h;
    private final w i;
    private final w j;
    private final w k;
    private final w l;
    private float m;

    public ax(float f2) {
        this.t = 256;
        this.u = 256;
        this.a("body.body", 0, 0);
        this.a("wing.skin", -56, 88);
        this.a("wingtip.skin", -56, 144);
        this.a("rearleg.main", 0, 0);
        this.a("rearfoot.main", 112, 0);
        this.a("rearlegtip.main", 196, 0);
        this.a("head.upperhead", 112, 30);
        this.a("wing.bone", 112, 88);
        this.a("head.upperlip", 176, 44);
        this.a("jaw.jaw", 176, 65);
        this.a("frontleg.main", 112, 104);
        this.a("wingtip.bone", 112, 136);
        this.a("frontfoot.main", 144, 104);
        this.a("neck.box", 192, 104);
        this.a("frontlegtip.main", 226, 138);
        this.a("body.scale", 220, 53);
        this.a("head.scale", 0, 0);
        this.a("neck.scale", 48, 0);
        this.a("head.nostril", 112, 0);
        float f3 = -16.0f;
        this.a = new w(this, "head");
        this.a.a("upperlip", -6.0f, -1.0f, -24.0f, 12, 5, 16);
        this.a.a("upperhead", -8.0f, -8.0f, -10.0f, 16, 16, 16);
        this.a.i = true;
        this.a.a("scale", -5.0f, -12.0f, -4.0f, 2, 4, 6);
        this.a.a("nostril", -5.0f, -3.0f, -22.0f, 2, 2, 4);
        this.a.i = false;
        this.a.a("scale", 3.0f, -12.0f, -4.0f, 2, 4, 6);
        this.a.a("nostril", 3.0f, -3.0f, -22.0f, 2, 2, 4);
        this.c = new w(this, "jaw");
        this.c.a(0.0f, 4.0f, -8.0f);
        this.c.a("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.a.a(this.c);
        this.b = new w(this, "neck");
        this.b.a("box", -5.0f, -5.0f, -5.0f, 10, 10, 10);
        this.b.a("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6);
        this.d = new w(this, "body");
        this.d.a(0.0f, 4.0f, 8.0f);
        this.d.a("body", -12.0f, 0.0f, -16.0f, 24, 24, 64);
        this.d.a("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12);
        this.d.a("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12);
        this.d.a("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12);
        this.k = new w(this, "wing");
        this.k.a(-12.0f, 5.0f, 2.0f);
        this.k.a("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.k.a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.l = new w(this, "wingtip");
        this.l.a(-56.0f, 0.0f, 0.0f);
        this.l.a("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.l.a("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.k.a(this.l);
        this.f = new w(this, "frontleg");
        this.f.a(-12.0f, 20.0f, 2.0f);
        this.f.a("main", -4.0f, -4.0f, -4.0f, 8, 24, 8);
        this.h = new w(this, "frontlegtip");
        this.h.a(0.0f, 20.0f, -1.0f);
        this.h.a("main", -3.0f, -1.0f, -3.0f, 6, 24, 6);
        this.f.a(this.h);
        this.j = new w(this, "frontfoot");
        this.j.a(0.0f, 23.0f, 0.0f);
        this.j.a("main", -4.0f, 0.0f, -12.0f, 8, 4, 16);
        this.h.a(this.j);
        this.e = new w(this, "rearleg");
        this.e.a(-16.0f, 16.0f, 42.0f);
        this.e.a("main", -8.0f, -4.0f, -8.0f, 16, 32, 16);
        this.g = new w(this, "rearlegtip");
        this.g.a(0.0f, 32.0f, -4.0f);
        this.g.a("main", -6.0f, -2.0f, 0.0f, 12, 32, 12);
        this.e.a(this.g);
        this.i = new w(this, "rearfoot");
        this.i.a(0.0f, 31.0f, 4.0f);
        this.i.a("main", -9.0f, 0.0f, -20.0f, 18, 6, 24);
        this.g.a(this.i);
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        this.m = f4;
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        bd.D();
        a a2 = (a)n2;
        float f9 = a2.v + (a2.w - a2.v) * this.m;
        this.c.f = (float)(Math.sin(f9 * ((float)Math.PI * 2)) + 1.0) * 0.2f;
        float f10 = (float)(Math.sin(f9 * ((float)Math.PI * 2) - 1.0f) + 1.0);
        f10 = (f10 * f10 + f10 * 2.0f) * 0.05f;
        bd.c(0.0f, f10 - 2.0f, -3.0f);
        bd.b(f10 * 2.0f, 1.0f, 0.0f, 0.0f);
        float f11 = -30.0f;
        float f12 = 0.0f;
        float f13 = 1.5f;
        double[] arrd = a2.a(6, this.m);
        float f14 = this.a(a2.a(5, this.m)[0] - a2.a(10, this.m)[0]);
        float f15 = this.a(a2.a(5, this.m)[0] + (double)(f14 / 2.0f));
        float f16 = f9 * ((float)Math.PI * 2);
        f11 = 20.0f;
        float f17 = -12.0f;
        for (int i2 = 0; i2 < 5; ++i2) {
            double[] arrd2 = a2.a(5 - i2, this.m);
            f8 = (float)Math.cos((float)i2 * 0.45f + f16) * 0.15f;
            this.b.g = this.a(arrd2[0] - arrd[0]) * ((float)Math.PI / 180) * 1.5f;
            this.b.f = f8 + a2.a(i2, arrd, arrd2) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            this.b.h = -this.a(arrd2[0] - (double)f15) * ((float)Math.PI / 180) * 1.5f;
            this.b.d = f11;
            this.b.e = f17;
            this.b.c = f12;
            f11 = (float)((double)f11 + Math.sin(this.b.f) * 10.0);
            f17 = (float)((double)f17 - Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0);
            f12 = (float)((double)f12 - Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0);
            this.b.a(f7);
        }
        this.a.d = f11;
        this.a.e = f17;
        this.a.c = f12;
        double[] arrd3 = a2.a(0, this.m);
        this.a.g = this.a(arrd3[0] - arrd[0]) * ((float)Math.PI / 180);
        this.a.f = this.a(a2.a(6, arrd, arrd3)) * ((float)Math.PI / 180) * 1.5f * 5.0f;
        this.a.h = -this.a(arrd3[0] - (double)f15) * ((float)Math.PI / 180);
        this.a.a(f7);
        bd.D();
        bd.c(0.0f, 1.0f, 0.0f);
        bd.b(-f14 * 1.5f, 0.0f, 0.0f, 1.0f);
        bd.c(0.0f, -1.0f, 0.0f);
        this.d.h = 0.0f;
        this.d.a(f7);
        for (int i3 = 0; i3 < 2; ++i3) {
            bd.p();
            f8 = f9 * ((float)Math.PI * 2);
            this.k.f = 0.125f - (float)Math.cos(f8) * 0.2f;
            this.k.g = 0.25f;
            this.k.h = (float)(Math.sin(f8) + 0.125) * 0.8f;
            this.l.h = -((float)(Math.sin(f8 + 2.0f) + 0.5)) * 0.75f;
            this.e.f = 1.0f + f10 * 0.1f;
            this.g.f = 0.5f + f10 * 0.1f;
            this.i.f = 0.75f + f10 * 0.1f;
            this.f.f = 1.3f + f10 * 0.1f;
            this.h.f = -0.5f - f10 * 0.1f;
            this.j.f = 0.75f + f10 * 0.1f;
            this.k.a(f7);
            this.f.a(f7);
            this.e.a(f7);
            bd.b(-1.0f, 1.0f, 1.0f);
            if (i3 != 0) continue;
            bd.a(bj.a);
        }
        bd.E();
        bd.a(bj.b);
        bd.q();
        float f18 = -((float)Math.sin(f9 * ((float)Math.PI * 2))) * 0.0f;
        f16 = f9 * ((float)Math.PI * 2);
        f11 = 10.0f;
        f17 = 60.0f;
        f12 = 0.0f;
        arrd = a2.a(11, this.m);
        for (int i4 = 0; i4 < 12; ++i4) {
            arrd3 = a2.a(12 + i4, this.m);
            f18 = (float)((double)f18 + Math.sin((float)i4 * 0.45f + f16) * (double)0.05f);
            this.b.g = (this.a(arrd3[0] - arrd[0]) * 1.5f + 180.0f) * ((float)Math.PI / 180);
            this.b.f = f18 + (float)(arrd3[1] - arrd[1]) * ((float)Math.PI / 180) * 1.5f * 5.0f;
            this.b.h = this.a(arrd3[0] - (double)f15) * ((float)Math.PI / 180) * 1.5f;
            this.b.d = f11;
            this.b.e = f17;
            this.b.c = f12;
            f11 = (float)((double)f11 + Math.sin(this.b.f) * 10.0);
            f17 = (float)((double)f17 - Math.cos(this.b.g) * Math.cos(this.b.f) * 10.0);
            f12 = (float)((double)f12 - Math.sin(this.b.g) * Math.cos(this.b.f) * 10.0);
            this.b.a(f7);
        }
        bd.E();
    }

    private float a(double d2) {
        while (d2 >= 180.0) {
            d2 -= 360.0;
        }
        while (d2 < -180.0) {
            d2 += 360.0;
        }
        return (float)d2;
    }
}

