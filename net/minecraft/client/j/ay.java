/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class ay
extends ap {
    w a;
    w[] b = new w[8];

    public ay() {
        int n2 = -16;
        this.a = new w(this, 0, 0);
        this.a.a(-6.0f, -8.0f, -6.0f, 12, 16, 12);
        this.a.d += 8.0f;
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = new w(this, 48, 0);
            double d2 = (double)i2 * Math.PI * 2.0 / (double)this.b.length;
            float f2 = (float)Math.cos(d2) * 5.0f;
            float f3 = (float)Math.sin(d2) * 5.0f;
            this.b[i2].a(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.b[i2].c = f2;
            this.b[i2].e = f3;
            this.b[i2].d = 15.0f;
            d2 = (double)i2 * Math.PI * -2.0 / (double)this.b.length + 1.5707963267948966;
            this.b[i2].g = (float)d2;
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        w[] arrw = this.b;
        int n3 = this.b.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            w w2 = arrw[i2];
            w2.f = f4;
        }
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        this.a.a(f7);
        w[] arrw = this.b;
        int n3 = this.b.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            w w2 = arrw[i2];
            w2.a(f7);
        }
    }
}

