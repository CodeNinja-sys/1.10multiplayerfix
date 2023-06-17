/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.b;
import net.minecraft.client.j.w;
import net.minecraft.w.e.d;
import net.minecraft.w.n;

public class h
extends b {
    public h() {
        this(0.0f, 0.0f, false);
    }

    public h(float f2, float f3, boolean bl2) {
        super(f2, 0.0f, 64, bl2 ? 32 : 64);
        if (bl2) {
            this.a = new w(this, 0, 0);
            this.a.a(-4.0f, -10.0f, -4.0f, 8, 8, 8, f2);
            this.a.a(0.0f, 0.0f + f3, 0.0f);
            this.c = new w(this, 16, 16);
            this.c.a(0.0f, 0.0f + f3, 0.0f);
            this.c.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2 + 0.1f);
            this.f = new w(this, 0, 16);
            this.f.a(-2.0f, 12.0f + f3, 0.0f);
            this.f.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.1f);
            this.g = new w(this, 0, 16);
            this.g.i = true;
            this.g.a(2.0f, 12.0f + f3, 0.0f);
            this.g.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2 + 0.1f);
        } else {
            this.a = new w(this, 0, 0);
            this.a.a(0.0f, f3, 0.0f);
            this.a.a(0, 0).a(-4.0f, -10.0f, -4.0f, 8, 10, 8, f2);
            this.a.a(24, 0).a(-1.0f, -3.0f, -6.0f, 2, 4, 2, f2);
            this.c = new w(this, 16, 20);
            this.c.a(0.0f, 0.0f + f3, 0.0f);
            this.c.a(-4.0f, 0.0f, -3.0f, 8, 12, 6, f2);
            this.c.a(0, 38).a(-4.0f, 0.0f, -3.0f, 8, 18, 6, f2 + 0.05f);
            this.d = new w(this, 44, 38);
            this.d.a(-3.0f, -2.0f, -2.0f, 4, 12, 4, f2);
            this.d.a(-5.0f, 2.0f + f3, 0.0f);
            this.e = new w(this, 44, 38);
            this.e.i = true;
            this.e.a(-1.0f, -2.0f, -2.0f, 4, 12, 4, f2);
            this.e.a(5.0f, 2.0f + f3, 0.0f);
            this.f = new w(this, 0, 22);
            this.f.a(-2.0f, 12.0f + f3, 0.0f);
            this.f.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
            this.g = new w(this, 0, 22);
            this.g.i = true;
            this.g.a(2.0f, 12.0f + f3, 0.0f);
            this.g.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        float f8;
        super.a(f2, f3, f4, f5, f6, f7, n2);
        d d2 = (d)n2;
        float f9 = net.minecraft.u.b.n.a(this.p * (float)Math.PI);
        float f10 = net.minecraft.u.b.n.a((1.0f - (1.0f - this.p) * (1.0f - this.p)) * (float)Math.PI);
        this.d.h = 0.0f;
        this.e.h = 0.0f;
        this.d.g = -(0.1f - f9 * 0.6f);
        this.e.g = 0.1f - f9 * 0.6f;
        this.d.f = f8 = (float)(-Math.PI) / (d2.p() ? 1.5f : 2.25f);
        this.e.f = f8;
        this.d.f += f9 * 1.2f - f10 * 0.4f;
        this.e.f += f9 * 1.2f - f10 * 0.4f;
        this.d.h += net.minecraft.u.b.n.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.e.h -= net.minecraft.u.b.n.b(f4 * 0.09f) * 0.05f + 0.05f;
        this.d.f += net.minecraft.u.b.n.a(f4 * 0.067f) * 0.05f;
        this.e.f -= net.minecraft.u.b.n.a(f4 * 0.067f) * 0.05f;
    }
}

