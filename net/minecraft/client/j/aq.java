/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class aq
extends ap {
    public w a;
    public w b;
    public w c;
    public w d;
    public w e;

    public aq() {
        float f2 = 4.0f;
        float f3 = 0.0f;
        this.c = new w(this, 0, 0).b(64, 64);
        this.c.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, -0.5f);
        this.c.a(0.0f, 4.0f, 0.0f);
        this.d = new w(this, 32, 0).b(64, 64);
        this.d.a(-1.0f, 0.0f, -1.0f, 12, 2, 2, -0.5f);
        this.d.a(0.0f, 6.0f, 0.0f);
        this.e = new w(this, 32, 0).b(64, 64);
        this.e.a(-1.0f, 0.0f, -1.0f, 12, 2, 2, -0.5f);
        this.e.a(0.0f, 6.0f, 0.0f);
        this.a = new w(this, 0, 16).b(64, 64);
        this.a.a(-5.0f, -10.0f, -5.0f, 10, 10, 10, -0.5f);
        this.a.a(0.0f, 13.0f, 0.0f);
        this.b = new w(this, 0, 36).b(64, 64);
        this.b.a(-6.0f, -12.0f, -6.0f, 12, 12, 12, -0.5f);
        this.b.a(0.0f, 24.0f, 0.0f);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        super.a(f2, f3, f4, f5, f6, f7, n2);
        this.c.g = f5 * ((float)Math.PI / 180);
        this.c.f = f6 * ((float)Math.PI / 180);
        this.a.g = f5 * ((float)Math.PI / 180) * 0.25f;
        float f8 = net.minecraft.u.b.n.a(this.a.g);
        float f9 = net.minecraft.u.b.n.b(this.a.g);
        this.d.h = 1.0f;
        this.e.h = -1.0f;
        this.d.g = 0.0f + this.a.g;
        this.e.g = (float)Math.PI + this.a.g;
        this.d.c = f9 * 5.0f;
        this.d.e = -f8 * 5.0f;
        this.e.c = -f9 * 5.0f;
        this.e.e = f8 * 5.0f;
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
        this.b.a(f7);
        this.c.a(f7);
        this.d.a(f7);
        this.e.a(f7);
    }
}

