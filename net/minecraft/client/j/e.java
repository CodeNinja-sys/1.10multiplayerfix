/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class e
extends ap {
    private final w[] a;
    private final w[] b;

    public e(float f2) {
        this.t = 64;
        this.u = 64;
        this.a = new w[3];
        this.a[0] = new w(this, 0, 16);
        this.a[0].a(-10.0f, 3.9f, -0.5f, 20, 3, 3, f2);
        this.a[1] = new w(this).b(this.t, this.u);
        this.a[1].a(-2.0f, 6.9f, -0.5f);
        this.a[1].a(0, 22).a(0.0f, 0.0f, 0.0f, 3, 10, 3, f2);
        this.a[1].a(24, 22).a(-4.0f, 1.5f, 0.5f, 11, 2, 2, f2);
        this.a[1].a(24, 22).a(-4.0f, 4.0f, 0.5f, 11, 2, 2, f2);
        this.a[1].a(24, 22).a(-4.0f, 6.5f, 0.5f, 11, 2, 2, f2);
        this.a[2] = new w(this, 12, 22);
        this.a[2].a(0.0f, 0.0f, 0.0f, 3, 6, 3, f2);
        this.b = new w[3];
        this.b[0] = new w(this, 0, 0);
        this.b[0].a(-4.0f, -4.0f, -4.0f, 8, 8, 8, f2);
        this.b[1] = new w(this, 32, 0);
        this.b[1].a(-4.0f, -4.0f, -4.0f, 6, 6, 6, f2);
        this.b[1].c = -8.0f;
        this.b[1].d = 4.0f;
        this.b[2] = new w(this, 32, 0);
        this.b[2].a(-4.0f, -4.0f, -4.0f, 6, 6, 6, f2);
        this.b[2].c = 10.0f;
        this.b[2].d = 4.0f;
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        w w2;
        int n3;
        this.a(f2, f3, f4, f5, f6, f7, n2);
        w[] arrw = this.b;
        int n4 = this.b.length;
        for (n3 = 0; n3 < n4; ++n3) {
            w2 = arrw[n3];
            w2.a(f7);
        }
        arrw = this.a;
        n4 = this.a.length;
        for (n3 = 0; n3 < n4; ++n3) {
            w2 = arrw[n3];
            w2.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        float f8 = net.minecraft.u.b.n.b(f4 * 0.1f);
        this.a[1].f = (0.065f + 0.05f * f8) * (float)Math.PI;
        this.a[2].a(-2.0f, 6.9f + net.minecraft.u.b.n.b(this.a[1].f) * 10.0f, -0.5f + net.minecraft.u.b.n.a(this.a[1].f) * 10.0f);
        this.a[2].f = (0.265f + 0.1f * f8) * (float)Math.PI;
        this.b[0].g = f5 * ((float)Math.PI / 180);
        this.b[0].f = f6 * ((float)Math.PI / 180);
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        net.minecraft.w.d.e e2 = (net.minecraft.w.d.e)l2;
        for (int i2 = 1; i2 < 3; ++i2) {
            this.b[i2].g = (e2.b(i2 - 1) - l2.ak) * ((float)Math.PI / 180);
            this.b[i2].f = e2.c(i2 - 1) * ((float)Math.PI / 180);
        }
    }
}

