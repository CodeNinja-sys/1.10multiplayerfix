/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class ag
extends ap {
    private final w[] a = new w[12];
    private final w b;

    public ag() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new w(this, 0, 16);
            this.a[i2].a(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        this.b = new w(this, 0, 0);
        this.b.a(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.b.a(f7);
        w[] arrw = this.a;
        int n3 = this.a.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            w w2 = arrw[i2];
            w2.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        int n3;
        float f8 = f4 * (float)Math.PI * -0.1f;
        for (n3 = 0; n3 < 4; ++n3) {
            this.a[n3].d = -2.0f + net.minecraft.u.b.n.b(((float)(n3 * 2) + f4) * 0.25f);
            this.a[n3].c = net.minecraft.u.b.n.b(f8) * 9.0f;
            this.a[n3].e = net.minecraft.u.b.n.a(f8) * 9.0f;
            f8 += 1.0f;
        }
        f8 = 0.7853982f + f4 * (float)Math.PI * 0.03f;
        for (n3 = 4; n3 < 8; ++n3) {
            this.a[n3].d = 2.0f + net.minecraft.u.b.n.b(((float)(n3 * 2) + f4) * 0.25f);
            this.a[n3].c = net.minecraft.u.b.n.b(f8) * 7.0f;
            this.a[n3].e = net.minecraft.u.b.n.a(f8) * 7.0f;
            f8 += 1.0f;
        }
        f8 = 0.47123894f + f4 * (float)Math.PI * -0.05f;
        for (n3 = 8; n3 < 12; ++n3) {
            this.a[n3].d = 11.0f + net.minecraft.u.b.n.b(((float)n3 * 1.5f + f4) * 0.5f);
            this.a[n3].c = net.minecraft.u.b.n.b(f8) * 5.0f;
            this.a[n3].e = net.minecraft.u.b.n.a(f8) * 5.0f;
            f8 += 1.0f;
        }
        this.b.g = f5 * ((float)Math.PI / 180);
        this.b.f = f6 * ((float)Math.PI / 180);
    }
}

