/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class r
extends ap {
    public w a;
    public w b;
    public w c;
    public w d;
    public w e;
    public w f;
    public w g;
    public w h;
    public w i;
    public w j;
    public w k;

    public r() {
        float f2 = 0.0f;
        int n2 = 15;
        this.a = new w(this, 32, 4);
        this.a.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, 0.0f);
        this.a.a(0.0f, 15.0f, -3.0f);
        this.b = new w(this, 0, 0);
        this.b.a(-3.0f, -3.0f, -3.0f, 6, 6, 6, 0.0f);
        this.b.a(0.0f, 15.0f, 0.0f);
        this.c = new w(this, 0, 12);
        this.c.a(-5.0f, -4.0f, -6.0f, 10, 8, 12, 0.0f);
        this.c.a(0.0f, 15.0f, 9.0f);
        this.d = new w(this, 18, 0);
        this.d.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.d.a(-4.0f, 15.0f, 2.0f);
        this.e = new w(this, 18, 0);
        this.e.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.e.a(4.0f, 15.0f, 2.0f);
        this.f = new w(this, 18, 0);
        this.f.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.f.a(-4.0f, 15.0f, 1.0f);
        this.g = new w(this, 18, 0);
        this.g.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.g.a(4.0f, 15.0f, 1.0f);
        this.h = new w(this, 18, 0);
        this.h.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.h.a(-4.0f, 15.0f, 0.0f);
        this.i = new w(this, 18, 0);
        this.i.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.i.a(4.0f, 15.0f, 0.0f);
        this.j = new w(this, 18, 0);
        this.j.a(-15.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.j.a(-4.0f, 15.0f, -1.0f);
        this.k = new w(this, 18, 0);
        this.k.a(-1.0f, -1.0f, -1.0f, 16, 2, 2, 0.0f);
        this.k.a(4.0f, 15.0f, -1.0f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
        this.b.a(f7);
        this.c.a(f7);
        this.d.a(f7);
        this.e.a(f7);
        this.f.a(f7);
        this.g.a(f7);
        this.h.a(f7);
        this.i.a(f7);
        this.j.a(f7);
        this.k.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
        float f8 = 0.7853982f;
        this.d.h = -0.7853982f;
        this.e.h = 0.7853982f;
        this.f.h = -0.58119464f;
        this.g.h = 0.58119464f;
        this.h.h = -0.58119464f;
        this.i.h = 0.58119464f;
        this.j.h = -0.7853982f;
        this.k.h = 0.7853982f;
        float f9 = -0.0f;
        float f10 = 0.3926991f;
        this.d.g = 0.7853982f;
        this.e.g = -0.7853982f;
        this.f.g = 0.3926991f;
        this.g.g = -0.3926991f;
        this.h.g = -0.3926991f;
        this.i.g = 0.3926991f;
        this.j.g = -0.7853982f;
        this.k.g = 0.7853982f;
        float f11 = -(net.minecraft.u.b.n.b(f2 * 0.6662f * 2.0f + 0.0f) * 0.4f) * f3;
        float f12 = -(net.minecraft.u.b.n.b(f2 * 0.6662f * 2.0f + (float)Math.PI) * 0.4f) * f3;
        float f13 = -(net.minecraft.u.b.n.b(f2 * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * f3;
        float f14 = -(net.minecraft.u.b.n.b(f2 * 0.6662f * 2.0f + 4.712389f) * 0.4f) * f3;
        float f15 = Math.abs(net.minecraft.u.b.n.a(f2 * 0.6662f + 0.0f) * 0.4f) * f3;
        float f16 = Math.abs(net.minecraft.u.b.n.a(f2 * 0.6662f + (float)Math.PI) * 0.4f) * f3;
        float f17 = Math.abs(net.minecraft.u.b.n.a(f2 * 0.6662f + 1.5707964f) * 0.4f) * f3;
        float f18 = Math.abs(net.minecraft.u.b.n.a(f2 * 0.6662f + 4.712389f) * 0.4f) * f3;
        this.d.g += f11;
        this.e.g += -f11;
        this.f.g += f12;
        this.g.g += -f12;
        this.h.g += f13;
        this.i.g += -f13;
        this.j.g += f14;
        this.k.g += -f14;
        this.d.h += f15;
        this.e.h += -f15;
        this.f.h += f16;
        this.g.h += -f16;
        this.h.h += f17;
        this.i.h += -f17;
        this.j.h += f18;
        this.k.h += -f18;
    }
}

