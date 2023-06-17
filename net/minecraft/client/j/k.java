/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.e.bj;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class k
extends ap {
    public w a;
    public w b;
    public w c;
    public w d;
    public w e;
    public w f;

    public k() {
        this(0.0f);
    }

    public k(float f2) {
        this(f2, -7.0f);
    }

    public k(float f2, float f3) {
        int n2 = 128;
        int n3 = 128;
        this.a = new w(this).b(128, 128);
        this.a.a(0.0f, 0.0f + f3, -2.0f);
        this.a.a(0, 0).a(-4.0f, -12.0f, -5.5f, 8, 10, 8, f2);
        this.a.a(24, 0).a(-1.0f, -5.0f, -7.5f, 2, 4, 2, f2);
        this.b = new w(this).b(128, 128);
        this.b.a(0.0f, 0.0f + f3, 0.0f);
        this.b.a(0, 40).a(-9.0f, -2.0f, -6.0f, 18, 12, 11, f2);
        this.b.a(0, 70).a(-4.5f, 10.0f, -3.0f, 9, 5, 6, f2 + 0.5f);
        this.c = new w(this).b(128, 128);
        this.c.a(0.0f, -7.0f, 0.0f);
        this.c.a(60, 21).a(-13.0f, -2.5f, -3.0f, 4, 30, 6, f2);
        this.d = new w(this).b(128, 128);
        this.d.a(0.0f, -7.0f, 0.0f);
        this.d.a(60, 58).a(9.0f, -2.5f, -3.0f, 4, 30, 6, f2);
        this.e = new w(this, 0, 22).b(128, 128);
        this.e.a(-4.0f, 18.0f + f3, 0.0f);
        this.e.a(37, 0).a(-3.5f, -3.0f, -3.0f, 6, 16, 5, f2);
        this.f = new w(this, 0, 22).b(128, 128);
        this.f.i = true;
        this.f.a(60, 0).a(5.0f, 18.0f + f3, 0.0f);
        this.f.a(-3.5f, -3.0f, -3.0f, 6, 16, 5, f2);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
        this.b.a(f7);
        this.e.a(f7);
        this.f.a(f7);
        this.c.a(f7);
        this.d.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
        this.e.f = -1.5f * this.a(f2, 13.0f) * f3;
        this.f.f = 1.5f * this.a(f2, 13.0f) * f3;
        this.e.g = 0.0f;
        this.f.g = 0.0f;
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        bj bj2 = (bj)l2;
        int n2 = bj2.p();
        if (n2 > 0) {
            this.c.f = -2.0f + 1.5f * this.a((float)n2 - f4, 10.0f);
            this.d.f = -2.0f + 1.5f * this.a((float)n2 - f4, 10.0f);
        } else {
            int n3 = bj2.q();
            if (n3 > 0) {
                this.c.f = -0.8f + 0.025f * this.a(n3, 70.0f);
                this.d.f = 0.0f;
            } else {
                this.c.f = (-0.2f + 1.5f * this.a(f2, 13.0f)) * f3;
                this.d.f = (-0.2f - 1.5f * this.a(f2, 13.0f)) * f3;
            }
        }
    }

    private float a(float f2, float f3) {
        return (Math.abs(f2 % f3 - f3 * 0.5f) - f3 * 0.25f) / (f3 * 0.25f);
    }
}

