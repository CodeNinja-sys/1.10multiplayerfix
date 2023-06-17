/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.h.aj;
import net.minecraft.w.n;

public class bf
extends ap {
    private final w a;
    private final w b;
    private final w c;
    private final w d;
    private final w e;
    private final w f;

    public bf() {
        this.t = 64;
        this.u = 64;
        this.a = new w(this, 0, 0);
        this.a.a(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        w w2 = new w(this, 24, 0);
        w2.a(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.a.a(w2);
        w w3 = new w(this, 24, 0);
        w3.i = true;
        w3.a(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.a.a(w3);
        this.b = new w(this, 0, 16);
        this.b.a(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.b.a(0, 34).a(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        this.c = new w(this, 42, 0);
        this.c.a(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        this.e = new w(this, 24, 16);
        this.e.a(-12.0f, 1.0f, 1.5f);
        this.e.a(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.d = new w(this, 42, 0);
        this.d.i = true;
        this.d.a(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.f = new w(this, 24, 16);
        this.f.i = true;
        this.f.a(12.0f, 1.0f, 1.5f);
        this.f.a(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.b.a(this.c);
        this.b.a(this.d);
        this.c.a(this.e);
        this.d.a(this.f);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
        this.b.a(f7);
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        if (((aj)n2).c()) {
            this.a.f = f6 * ((float)Math.PI / 180);
            this.a.g = (float)Math.PI - f5 * ((float)Math.PI / 180);
            this.a.h = (float)Math.PI;
            this.a.a(0.0f, -2.0f, 0.0f);
            this.c.a(-3.0f, 0.0f, 3.0f);
            this.d.a(3.0f, 0.0f, 3.0f);
            this.b.f = (float)Math.PI;
            this.c.f = -0.15707964f;
            this.c.g = -1.2566371f;
            this.e.g = -1.7278761f;
            this.d.f = this.c.f;
            this.d.g = -this.c.g;
            this.f.g = -this.e.g;
        } else {
            this.a.f = f6 * ((float)Math.PI / 180);
            this.a.g = f5 * ((float)Math.PI / 180);
            this.a.h = 0.0f;
            this.a.a(0.0f, 0.0f, 0.0f);
            this.c.a(0.0f, 0.0f, 0.0f);
            this.d.a(0.0f, 0.0f, 0.0f);
            this.b.f = 0.7853982f + net.minecraft.u.b.n.b(f4 * 0.1f) * 0.15f;
            this.b.g = 0.0f;
            this.c.g = net.minecraft.u.b.n.b(f4 * 1.3f) * (float)Math.PI * 0.25f;
            this.d.g = -this.c.g;
            this.e.g = this.c.g * 0.5f;
            this.f.g = -this.c.g * 0.5f;
        }
    }
}

