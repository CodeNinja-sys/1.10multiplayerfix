/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.h.am;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class an
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

    public an() {
        this.a("head.main", 0, 0);
        this.a("head.nose", 0, 24);
        this.a("head.ear1", 0, 10);
        this.a("head.ear2", 6, 10);
        this.a = new w(this, 26, 24);
        this.a.a(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.a.a(3.0f, 17.5f, 3.7f);
        this.a.i = true;
        this.a(this.a, 0.0f, 0.0f, 0.0f);
        this.b = new w(this, 8, 24);
        this.b.a(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.b.a(-3.0f, 17.5f, 3.7f);
        this.b.i = true;
        this.a(this.b, 0.0f, 0.0f, 0.0f);
        this.c = new w(this, 30, 15);
        this.c.a(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.c.a(3.0f, 17.5f, 3.7f);
        this.c.i = true;
        this.a(this.c, -0.34906584f, 0.0f, 0.0f);
        this.d = new w(this, 16, 15);
        this.d.a(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.d.a(-3.0f, 17.5f, 3.7f);
        this.d.i = true;
        this.a(this.d, -0.34906584f, 0.0f, 0.0f);
        this.e = new w(this, 0, 0);
        this.e.a(-3.0f, -2.0f, -10.0f, 6, 5, 10);
        this.e.a(0.0f, 19.0f, 8.0f);
        this.e.i = true;
        this.a(this.e, -0.34906584f, 0.0f, 0.0f);
        this.f = new w(this, 8, 15);
        this.f.a(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.f.a(3.0f, 17.0f, -1.0f);
        this.f.i = true;
        this.a(this.f, -0.17453292f, 0.0f, 0.0f);
        this.g = new w(this, 0, 15);
        this.g.a(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.g.a(-3.0f, 17.0f, -1.0f);
        this.g.i = true;
        this.a(this.g, -0.17453292f, 0.0f, 0.0f);
        this.h = new w(this, 32, 0);
        this.h.a(-2.5f, -4.0f, -5.0f, 5, 4, 5);
        this.h.a(0.0f, 16.0f, -1.0f);
        this.h.i = true;
        this.a(this.h, 0.0f, 0.0f, 0.0f);
        this.i = new w(this, 52, 0);
        this.i.a(-2.5f, -9.0f, -1.0f, 2, 5, 1);
        this.i.a(0.0f, 16.0f, -1.0f);
        this.i.i = true;
        this.a(this.i, 0.0f, -0.2617994f, 0.0f);
        this.j = new w(this, 58, 0);
        this.j.a(0.5f, -9.0f, -1.0f, 2, 5, 1);
        this.j.a(0.0f, 16.0f, -1.0f);
        this.j.i = true;
        this.a(this.j, 0.0f, 0.2617994f, 0.0f);
        this.k = new w(this, 52, 6);
        this.k.a(-1.5f, -1.5f, 0.0f, 3, 3, 2);
        this.k.a(0.0f, 20.0f, 7.0f);
        this.k.i = true;
        this.a(this.k, -0.3490659f, 0.0f, 0.0f);
        this.l = new w(this, 32, 9);
        this.l.a(-0.5f, -2.5f, -5.5f, 1, 1, 1);
        this.l.a(0.0f, 16.0f, -1.0f);
        this.l.i = true;
        this.a(this.l, 0.0f, 0.0f, 0.0f);
    }

    private void a(w w2, float f2, float f3, float f4) {
        w2.f = f2;
        w2.g = f3;
        w2.h = f4;
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        if (this.r) {
            float f8 = 1.5f;
            bd.D();
            bd.b(0.56666666f, 0.56666666f, 0.56666666f);
            bd.c(0.0f, 22.0f * f7, 2.0f * f7);
            this.h.a(f7);
            this.j.a(f7);
            this.i.a(f7);
            this.l.a(f7);
            bd.E();
            bd.D();
            bd.b(0.4f, 0.4f, 0.4f);
            bd.c(0.0f, 36.0f * f7, 0.0f);
            this.a.a(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            this.g.a(f7);
            this.k.a(f7);
            bd.E();
        } else {
            bd.D();
            bd.b(0.6f, 0.6f, 0.6f);
            bd.c(0.0f, 16.0f * f7, 0.0f);
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
            this.l.a(f7);
            bd.E();
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        float f8 = f4 - (float)n2.by;
        am am2 = (am)n2;
        this.l.f = f6 * ((float)Math.PI / 180);
        this.h.f = f6 * ((float)Math.PI / 180);
        this.i.f = f6 * ((float)Math.PI / 180);
        this.j.f = f6 * ((float)Math.PI / 180);
        this.l.g = f5 * ((float)Math.PI / 180);
        this.h.g = f5 * ((float)Math.PI / 180);
        this.i.g = this.l.g - 0.2617994f;
        this.j.g = this.l.g + 0.2617994f;
        this.m = net.minecraft.u.b.n.a(am2.q(f8) * (float)Math.PI);
        this.c.f = (this.m * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.d.f = (this.m * 50.0f - 21.0f) * ((float)Math.PI / 180);
        this.a.f = this.m * 50.0f * ((float)Math.PI / 180);
        this.b.f = this.m * 50.0f * ((float)Math.PI / 180);
        this.f.f = (this.m * -40.0f - 11.0f) * ((float)Math.PI / 180);
        this.g.f = (this.m * -40.0f - 11.0f) * ((float)Math.PI / 180);
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        super.a(l2, f2, f3, f4);
        this.m = net.minecraft.u.b.n.a(((am)l2).q(f4) * (float)Math.PI);
    }
}

