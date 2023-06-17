/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class m
extends ap {
    public w[] a = new w[7];

    public m() {
        this.a[0] = new w(this, 0, 10);
        this.a[1] = new w(this, 0, 0);
        this.a[2] = new w(this, 0, 0);
        this.a[3] = new w(this, 0, 0);
        this.a[4] = new w(this, 0, 0);
        this.a[5] = new w(this, 44, 10);
        int n2 = 20;
        int n3 = 8;
        int n4 = 16;
        int n5 = 4;
        this.a[0].a(-10.0f, -8.0f, -1.0f, 20, 16, 2, 0.0f);
        this.a[0].a(0.0f, 4.0f, 0.0f);
        this.a[5].a(-9.0f, -7.0f, -1.0f, 18, 14, 1, 0.0f);
        this.a[5].a(0.0f, 4.0f, 0.0f);
        this.a[1].a(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.a[1].a(-9.0f, 4.0f, 0.0f);
        this.a[2].a(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.a[2].a(9.0f, 4.0f, 0.0f);
        this.a[3].a(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.a[3].a(0.0f, 4.0f, -7.0f);
        this.a[4].a(-8.0f, -9.0f, -1.0f, 16, 8, 2, 0.0f);
        this.a[4].a(0.0f, 4.0f, 7.0f);
        this.a[0].f = 1.5707964f;
        this.a[1].g = 4.712389f;
        this.a[2].g = 1.5707964f;
        this.a[3].g = (float)Math.PI;
        this.a[5].f = -1.5707964f;
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a[5].d = 4.0f - f4;
        for (int i2 = 0; i2 < 6; ++i2) {
            this.a[i2].a(f7);
        }
    }
}

