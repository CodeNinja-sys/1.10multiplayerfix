/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.h.e;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class au
extends ap {
    public w a;
    public w b;
    public w c;
    public w d;
    public w e;
    public w f;
    w g;
    w h;

    public au() {
        float f2 = 0.0f;
        float f3 = 13.5f;
        this.a = new w(this, 0, 0);
        this.a.a(-2.0f, -3.0f, -2.0f, 6, 6, 4, 0.0f);
        this.a.a(-1.0f, 13.5f, -7.0f);
        this.b = new w(this, 18, 14);
        this.b.a(-3.0f, -2.0f, -3.0f, 6, 9, 6, 0.0f);
        this.b.a(0.0f, 14.0f, 2.0f);
        this.h = new w(this, 21, 0);
        this.h.a(-3.0f, -3.0f, -3.0f, 8, 6, 7, 0.0f);
        this.h.a(-1.0f, 14.0f, 2.0f);
        this.c = new w(this, 0, 18);
        this.c.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.c.a(-2.5f, 16.0f, 7.0f);
        this.d = new w(this, 0, 18);
        this.d.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.d.a(0.5f, 16.0f, 7.0f);
        this.e = new w(this, 0, 18);
        this.e.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.e.a(-2.5f, 16.0f, -4.0f);
        this.f = new w(this, 0, 18);
        this.f.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.f.a(0.5f, 16.0f, -4.0f);
        this.g = new w(this, 9, 18);
        this.g.a(0.0f, 0.0f, -1.0f, 2, 8, 2, 0.0f);
        this.g.a(-1.0f, 12.0f, 8.0f);
        this.a.a(16, 14).a(-2.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        this.a.a(16, 14).a(2.0f, -5.0f, 0.0f, 2, 2, 1, 0.0f);
        this.a.a(0, 10).a(-0.5f, 0.0f, -5.0f, 3, 3, 4, 0.0f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(n2, f2, f3, f4, f5, f6, f7);
        this.a(f2, f3, f4, f5, f6, f7, n2);
        if (this.r) {
            float f8 = 2.0f;
            bd.D();
            bd.c(0.0f, 5.0f * f7, 2.0f * f7);
            this.a.b(f7);
            bd.E();
            bd.D();
            bd.b(0.5f, 0.5f, 0.5f);
            bd.c(0.0f, 24.0f * f7, 0.0f);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.b(f7);
            this.h.a(f7);
            bd.E();
        } else {
            this.a.b(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.b(f7);
            this.h.a(f7);
        }
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        e e2 = (e)l2;
        this.g.g = e2.r() ? 0.0f : net.minecraft.u.b.n.b(f2 * 0.6662f) * 1.4f * f3;
        if (e2.E()) {
            this.h.a(-1.0f, 16.0f, -3.0f);
            this.h.f = 1.2566371f;
            this.h.g = 0.0f;
            this.b.a(0.0f, 18.0f, 0.0f);
            this.b.f = 0.7853982f;
            this.g.a(-1.0f, 21.0f, 6.0f);
            this.c.a(-2.5f, 22.0f, 2.0f);
            this.c.f = 4.712389f;
            this.d.a(0.5f, 22.0f, 2.0f);
            this.d.f = 4.712389f;
            this.e.f = 5.811947f;
            this.e.a(-2.49f, 17.0f, -4.0f);
            this.f.f = 5.811947f;
            this.f.a(0.51f, 17.0f, -4.0f);
        } else {
            this.b.a(0.0f, 14.0f, 2.0f);
            this.b.f = 1.5707964f;
            this.h.a(-1.0f, 14.0f, -3.0f);
            this.h.f = this.b.f;
            this.g.a(-1.0f, 12.0f, 8.0f);
            this.c.a(-2.5f, 16.0f, 7.0f);
            this.d.a(0.5f, 16.0f, 7.0f);
            this.e.a(-2.5f, 16.0f, -4.0f);
            this.f.a(0.5f, 16.0f, -4.0f);
            this.c.f = net.minecraft.u.b.n.b(f2 * 0.6662f) * 1.4f * f3;
            this.d.f = net.minecraft.u.b.n.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
            this.e.f = net.minecraft.u.b.n.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
            this.f.f = net.minecraft.u.b.n.b(f2 * 0.6662f) * 1.4f * f3;
        }
        this.a.h = e2.s(f4) + e2.h(f4, 0.0f);
        this.h.h = e2.h(f4, -0.08f);
        this.b.h = e2.h(f4, -0.16f);
        this.g.h = e2.h(f4, -0.2f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.f = f6 * ((float)Math.PI / 180);
        this.a.g = f5 * ((float)Math.PI / 180);
        this.g.f = f4;
    }
}

