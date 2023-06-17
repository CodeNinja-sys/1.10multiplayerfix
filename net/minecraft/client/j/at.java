/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.b;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class at
extends b {
    public boolean k;
    public boolean l;

    public at(float f2) {
        super(0.0f, -14.0f, 64, 32);
        float f3 = -14.0f;
        this.b = new w(this, 0, 16);
        this.b.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 - 0.5f);
        this.b.a(0.0f, -14.0f, 0.0f);
        this.c = new w(this, 32, 16);
        this.c.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.c.a(0.0f, -14.0f, 0.0f);
        this.d = new w(this, 56, 0);
        this.d.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, f2);
        this.d.a(-3.0f, -12.0f, 0.0f);
        this.e = new w(this, 56, 0);
        this.e.i = true;
        this.e.a(-1.0f, -2.0f, -1.0f, 2, 30, 2, f2);
        this.e.a(5.0f, -12.0f, 0.0f);
        this.f = new w(this, 56, 0);
        this.f.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, f2);
        this.f.a(-2.0f, -2.0f, 0.0f);
        this.g = new w(this, 56, 0);
        this.g.i = true;
        this.g.a(-1.0f, 0.0f, -1.0f, 2, 30, 2, f2);
        this.g.a(2.0f, -2.0f, 0.0f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.j = true;
        float f8 = -14.0f;
        this.c.f = 0.0f;
        this.c.d = -14.0f;
        this.c.e = -0.0f;
        this.f.f -= 0.0f;
        this.g.f -= 0.0f;
        this.d.f = (float)((double)this.d.f * 0.5);
        this.e.f = (float)((double)this.e.f * 0.5);
        this.f.f = (float)((double)this.f.f * 0.5);
        this.g.f = (float)((double)this.g.f * 0.5);
        float f9 = 0.4f;
        if (this.d.f > 0.4f) {
            this.d.f = 0.4f;
        }
        if (this.e.f > 0.4f) {
            this.e.f = 0.4f;
        }
        if (this.d.f < -0.4f) {
            this.d.f = -0.4f;
        }
        if (this.e.f < -0.4f) {
            this.e.f = -0.4f;
        }
        if (this.f.f > 0.4f) {
            this.f.f = 0.4f;
        }
        if (this.g.f > 0.4f) {
            this.g.f = 0.4f;
        }
        if (this.f.f < -0.4f) {
            this.f.f = -0.4f;
        }
        if (this.g.f < -0.4f) {
            this.g.f = -0.4f;
        }
        if (this.k) {
            this.d.f = -0.5f;
            this.e.f = -0.5f;
            this.d.h = 0.05f;
            this.e.h = -0.05f;
        }
        this.d.e = 0.0f;
        this.e.e = 0.0f;
        this.f.e = 0.0f;
        this.g.e = 0.0f;
        this.f.d = -5.0f;
        this.g.d = -5.0f;
        this.a.e = -0.0f;
        this.a.d = -13.0f;
        this.b.c = this.a.c;
        this.b.d = this.a.d;
        this.b.e = this.a.e;
        this.b.f = this.a.f;
        this.b.g = this.a.g;
        this.b.h = this.a.h;
        if (this.l) {
            float f10 = 1.0f;
            this.a.d -= 5.0f;
        }
    }
}

