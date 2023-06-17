/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class ao
extends ap {
    private static final int[][] a = new int[][]{{4, 3, 2}, {6, 4, 5}, {3, 3, 1}, {1, 2, 1}};
    private static final int[][] b;
    private static final int c;
    private final w[] d = new w[c];

    static {
        int[][] arrarrn = new int[4][];
        arrarrn[0] = new int[2];
        int[] arrn = new int[2];
        arrn[1] = 5;
        arrarrn[1] = arrn;
        int[] arrn2 = new int[2];
        arrn2[1] = 14;
        arrarrn[2] = arrn2;
        int[] arrn3 = new int[2];
        arrn3[1] = 18;
        arrarrn[3] = arrn3;
        b = arrarrn;
        c = a.length;
    }

    public ao() {
        float f2 = -3.5f;
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            this.d[i2] = new w(this, b[i2][0], b[i2][1]);
            this.d[i2].a((float)a[i2][0] * -0.5f, 0.0f, (float)a[i2][2] * -0.5f, a[i2][0], a[i2][1], a[i2][2]);
            this.d[i2].a(0.0f, 24 - a[i2][1], f2);
            if (i2 >= this.d.length - 1) continue;
            f2 += (float)(a[i2][2] + a[i2 + 1][2]) * 0.5f;
        }
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(f2, f3, f4, f5, f6, f7, n2);
        w[] arrw = this.d;
        int n3 = this.d.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            w w2 = arrw[i2];
            w2.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            this.d[i2].g = net.minecraft.u.b.n.b(f4 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.01f * (float)(1 + Math.abs(i2 - 2));
            this.d[i2].c = net.minecraft.u.b.n.a(f4 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.1f * (float)Math.abs(i2 - 2);
        }
    }
}

