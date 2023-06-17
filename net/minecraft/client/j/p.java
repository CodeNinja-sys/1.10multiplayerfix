/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class p
extends ap {
    public w a = new w(this).a(0, 0).a(-6.0f, -5.0f, 0.0f, 6, 10, 0);
    public w b = new w(this).a(16, 0).a(0.0f, -5.0f, 0.0f, 6, 10, 0);
    public w c = new w(this).a(0, 10).a(0.0f, -4.0f, -0.99f, 5, 8, 1);
    public w d = new w(this).a(12, 10).a(0.0f, -4.0f, -0.01f, 5, 8, 1);
    public w e = new w(this).a(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
    public w f = new w(this).a(24, 10).a(0.0f, -4.0f, 0.0f, 5, 8, 0);
    public w g = new w(this).a(12, 0).a(-1.0f, -5.0f, 0.0f, 2, 10, 0);

    public p() {
        this.a.a(0.0f, 0.0f, -1.0f);
        this.b.a(0.0f, 0.0f, 1.0f);
        this.g.g = 1.5707964f;
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
        this.b.a(f7);
        this.g.a(f7);
        this.c.a(f7);
        this.d.a(f7);
        this.e.a(f7);
        this.f.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        float f8 = (net.minecraft.u.b.n.a(f2 * 0.02f) * 0.1f + 1.25f) * f5;
        this.a.g = (float)Math.PI + f8;
        this.b.g = -f8;
        this.c.g = f8;
        this.d.g = -f8;
        this.e.g = f8 - f8 * 2.0f * f3;
        this.f.g = f8 - f8 * 2.0f * f4;
        this.c.c = net.minecraft.u.b.n.a(f8);
        this.d.c = net.minecraft.u.b.n.a(f8);
        this.e.c = net.minecraft.u.b.n.a(f8);
        this.f.c = net.minecraft.u.b.n.a(f8);
    }
}

