/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class l
extends ap {
    public w a;
    public w b;
    public w c;
    public w d;
    public w e;
    public w f;
    public w g;

    public l() {
        this(0.0f);
    }

    public l(float f2) {
        int n2 = 6;
        this.a = new w(this, 0, 0);
        this.a.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2);
        this.a.a(0.0f, 6.0f, 0.0f);
        this.b = new w(this, 32, 0);
        this.b.a(-4.0f, -8.0f, -4.0f, 8, 8, 8, f2 + 0.5f);
        this.b.a(0.0f, 6.0f, 0.0f);
        this.c = new w(this, 16, 16);
        this.c.a(-4.0f, 0.0f, -2.0f, 8, 12, 4, f2);
        this.c.a(0.0f, 6.0f, 0.0f);
        this.d = new w(this, 0, 16);
        this.d.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.d.a(-2.0f, 18.0f, 4.0f);
        this.e = new w(this, 0, 16);
        this.e.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.e.a(2.0f, 18.0f, 4.0f);
        this.f = new w(this, 0, 16);
        this.f.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.f.a(-2.0f, 18.0f, -4.0f);
        this.g = new w(this, 0, 16);
        this.g.a(-2.0f, 0.0f, -2.0f, 4, 6, 4, f2);
        this.g.a(2.0f, 18.0f, -4.0f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
        this.c.a(f7);
        this.d.a(f7);
        this.e.a(f7);
        this.f.a(f7);
        this.g.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        this.a.g = f5 * ((float)Math.PI / 180);
        this.a.f = f6 * ((float)Math.PI / 180);
        this.d.f = net.minecraft.u.b.n.b(f2 * 0.6662f) * 1.4f * f3;
        this.e.f = net.minecraft.u.b.n.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.f.f = net.minecraft.u.b.n.b(f2 * 0.6662f + (float)Math.PI) * 1.4f * f3;
        this.g.f = net.minecraft.u.b.n.b(f2 * 0.6662f) * 1.4f * f3;
    }
}

