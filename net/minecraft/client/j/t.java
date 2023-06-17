/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.g.bd;
import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class t
extends ap {
    public w a = new w(this, 0, 0);
    public w b;
    public w c;
    public w d;
    public w e;
    public w f;
    protected float g = 8.0f;
    protected float h = 4.0f;

    public t(int n2, float f2) {
        this.a.a(-4.0f, -4.0f, -8.0f, 8, 8, 8, f2);
        this.a.a(0.0f, 18 - n2, -6.0f);
        this.b = new w(this, 28, 8);
        this.b.a(-5.0f, -10.0f, -7.0f, 10, 16, 8, f2);
        this.b.a(0.0f, 17 - n2, 2.0f);
        this.c = new w(this, 0, 16);
        this.c.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.c.a(-3.0f, 24 - n2, 7.0f);
        this.d = new w(this, 0, 16);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.d.a(3.0f, 24 - n2, 7.0f);
        this.e = new w(this, 0, 16);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.e.a(-3.0f, 24 - n2, -5.0f);
        this.f = new w(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, n2, 4, f2);
        this.f.a(3.0f, 24 - n2, -5.0f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        if (this.r) {
            float f8 = 2.0f;
            bd.D();
            bd.c(0.0f, this.g * f7, this.h * f7);
            this.a.a(f7);
            bd.E();
            bd.D();
            bd.b(0.5f, 0.5f, 0.5f);
            bd.c(0.0f, 24.0f * f7, 0.0f);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
            bd.E();
        } else {
            this.a.a(f7);
            this.b.a(f7);
            this.c.a(f7);
            this.d.a(f7);
            this.e.a(f7);
            this.f.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        this.a.f = f6 * ((float)Math.PI / 180);
        this.a.g = f5 * ((float)Math.PI / 180);
        this.b.f = 1.5707964f;
        this.c.f = net.minecraft.u.b.n.b(f2 * 0.6662f) * 1.4f * f3;
        this.d.f = net.minecraft.u.b.n.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.e.f = net.minecraft.u.b.n.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.f.f = net.minecraft.u.b.n.b(f2 * 0.6662f) * 1.4f * f3;
    }
}

