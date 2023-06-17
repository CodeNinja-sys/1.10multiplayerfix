/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.l;
import net.minecraft.w.n;

public class bh
extends ap {
    w[] a = new w[8];
    w b;

    public bh() {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            int n2 = 0;
            int n3 = i2;
            if (i2 == 2) {
                n2 = 24;
                n3 = 10;
            } else if (i2 == 3) {
                n2 = 24;
                n3 = 19;
            }
            this.a[i2] = new w(this, n2, n3);
            this.a[i2].a(-4.0f, 16 + i2, -4.0f, 8, 1, 8);
        }
        this.b = new w(this, 0, 16);
        this.b.a(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }

    @Override
    public void a(l l2, float f2, float f3, float f4) {
        net.minecraft.w.e.bh bh2 = (net.minecraft.w.e.bh)l2;
        float f5 = bh2.c + (bh2.b - bh2.c) * f4;
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2].d = (float)(-(4 - i2)) * f5 * 1.7f;
        }
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
}

