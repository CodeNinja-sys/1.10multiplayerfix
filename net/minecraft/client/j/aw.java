/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class aw
extends ap {
    public w b;
    public w c;
    public w d;
    public w e;
    public w f;
    public w g;

    public aw(float f2) {
        this(f2, 0.0f, 64, 64);
    }

    public aw(float f2, float f3, int n2, int n3) {
        this.b = new w(this).b(n2, n3);
        this.b.a(0.0f, 0.0f + f3, 0.0f);
        this.b.a(0, 0).a(-4.0f, -10.0f, -4.0f, 8, 10, 8, f2);
        this.g = new w(this).b(n2, n3);
        this.g.a(0.0f, f3 - 2.0f, 0.0f);
        this.g.a(24, 0).a(-1.0f, -1.0f, -6.0f, 2, 4, 2, f2);
        this.b.a(this.g);
        this.c = new w(this).b(n2, n3);
        this.c.a(0.0f, 0.0f + f3, 0.0f);
        this.c.a(16, 20).a(-4.0f, 0.0f, -3.0f, 8, 12, 6, f2);
        this.c.a(0, 38).a(-4.0f, 0.0f, -3.0f, 8, 18, 6, f2 + 0.5f);
        this.d = new w(this).b(n2, n3);
        this.d.a(0.0f, 0.0f + f3 + 2.0f, 0.0f);
        this.d.a(44, 22).a(-8.0f, -2.0f, -2.0f, 4, 8, 4, f2);
        this.d.a(44, 22).a(4.0f, -2.0f, -2.0f, 4, 8, 4, f2);
        this.d.a(40, 38).a(-4.0f, 2.0f, -2.0f, 8, 4, 4, f2);
        this.e = new w(this, 0, 22).b(n2, n3);
        this.e.a(-2.0f, 12.0f + f3, 0.0f);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
        this.f = new w(this, 0, 22).b(n2, n3);
        this.f.i = true;
        this.f.a(2.0f, 12.0f + f3, 0.0f);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, 12, 4, f2);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.b.a(f7);
        this.c.a(f7);
        this.e.a(f7);
        this.f.a(f7);
        this.d.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        this.b.g = f5 * ((float)Math.PI / 180);
        this.b.f = f6 * ((float)Math.PI / 180);
        this.d.d = 3.0f;
        this.d.e = -1.0f;
        this.d.f = -0.75f;
        this.e.f = net.minecraft.u.b.n.b(f2 * 0.6662f) * 1.4f * f3 * 0.5f;
        this.f.f = net.minecraft.u.b.n.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3 * 0.5f;
        this.e.g = 0.0f;
        this.f.g = 0.0f;
    }
}

