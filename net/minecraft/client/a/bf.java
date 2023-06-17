/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.cb;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.g;
import net.minecraft.client.g.i.f;
import net.minecraft.client.r;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.w.l;

public class bf
extends cb {
    private l a;

    protected bf(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.A = 1.0f;
        this.B = 1.0f;
        this.C = 1.0f;
        this.j = 0.0;
        this.k = 0.0;
        this.l = 0.0;
        this.z = 0.0f;
        this.x = 30;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public void b() {
        super.b();
        if (this.a == null) {
            net.minecraft.w.e.g g2 = new net.minecraft.w.e.g(this.c);
            g2.r();
            this.a = g2;
        }
    }

    @Override
    public void a(g g2, net.minecraft.w.n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.a != null) {
            f f8 = net.minecraft.client.r.z().ab();
            f8.a(cb.H, cb.I, cb.J);
            float f9 = 0.42553192f;
            float f10 = ((float)this.w + f2) / (float)this.x;
            bd.a(true);
            bd.l();
            bd.j();
            bd.a(ad.l, bc.j);
            float f11 = 240.0f;
            ay.a(ay.r, 240.0f, 240.0f);
            bd.D();
            float f12 = 0.05f + 0.5f * net.minecraft.u.b.n.a(f10 * (float)Math.PI);
            bd.c(1.0f, 1.0f, 1.0f, f12);
            bd.c(0.0f, 1.8f, 0.0f);
            bd.b(180.0f - n2.ba, 0.0f, 1.0f, 0.0f);
            bd.b(60.0f - 150.0f * f10 - n2.bb, 1.0f, 0.0f, 0.0f);
            bd.c(0.0f, -0.4f, -1.5f);
            bd.b(0.42553192f, 0.42553192f, 0.42553192f);
            this.a.ba = 0.0f;
            this.a.am = 0.0f;
            this.a.bc = 0.0f;
            this.a.an = 0.0f;
            f8.a(this.a, 0.0, 0.0, 0.0, 0.0f, f2, false);
            bd.E();
            bd.j();
        }
    }
}

