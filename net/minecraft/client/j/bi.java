/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.client.j.ap;
import net.minecraft.client.j.w;
import net.minecraft.w.n;

public class bi
extends ap {
    private final w[] a = new w[7];
    private final w[] b;
    private final float[] c = new float[7];
    private static final int[][] d = new int[][]{{3, 2, 2}, {4, 3, 2}, {6, 4, 3}, {3, 3, 3}, {2, 2, 3}, {2, 1, 2}, {1, 1, 2}};
    private static final int[][] e;

    static {
        int[][] arrarrn = new int[7][];
        arrarrn[0] = new int[2];
        int[] arrn = new int[2];
        arrn[1] = 4;
        arrarrn[1] = arrn;
        int[] arrn2 = new int[2];
        arrn2[1] = 9;
        arrarrn[2] = arrn2;
        int[] arrn3 = new int[2];
        arrn3[1] = 16;
        arrarrn[3] = arrn3;
        int[] arrn4 = new int[2];
        arrn4[1] = 22;
        arrarrn[4] = arrn4;
        int[] arrn5 = new int[2];
        arrn5[0] = 11;
        arrarrn[5] = arrn5;
        arrarrn[6] = new int[]{13, 4};
        e = arrarrn;
    }

    public bi() {
        float f2 = -3.5f;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new w(this, e[i2][0], e[i2][1]);
            this.a[i2].a((float)d[i2][0] * -0.5f, 0.0f, (float)d[i2][2] * -0.5f, d[i2][0], d[i2][1], d[i2][2]);
            this.a[i2].a(0.0f, 24 - d[i2][1], f2);
            this.c[i2] = f2;
            if (i2 >= this.a.length - 1) continue;
            f2 += (float)(d[i2][2] + d[i2 + 1][2]) * 0.5f;
        }
        this.b = new w[3];
        this.b[0] = new w(this, 20, 0);
        this.b[0].a(-5.0f, 0.0f, (float)d[2][2] * -0.5f, 10, 8, d[2][2]);
        this.b[0].a(0.0f, 16.0f, this.c[2]);
        this.b[1] = new w(this, 20, 11);
        this.b[1].a(-3.0f, 0.0f, (float)d[4][2] * -0.5f, 6, 4, d[4][2]);
        this.b[1].a(0.0f, 20.0f, this.c[4]);
        this.b[2] = new w(this, 20, 18);
        this.b[2].a(-3.0f, 0.0f, (float)d[4][2] * -0.5f, 6, 5, d[1][2]);
        this.b[2].a(0.0f, 19.0f, this.c[1]);
    }

    @Override
    public void a(n n2, float f2, float f3, float f4, float f5, float f6, float f7) {
        w w2;
        int n3;
        this.a(f2, f3, f4, f5, f6, f7, n2);
        w[] arrw = this.a;
        int n4 = this.a.length;
        for (n3 = 0; n3 < n4; ++n3) {
            w2 = arrw[n3];
            w2.a(f7);
        }
        arrw = this.b;
        n4 = this.b.length;
        for (n3 = 0; n3 < n4; ++n3) {
            w2 = arrw[n3];
            w2.a(f7);
        }
    }

    @Override
    public void a(float f2, float f3, float f4, float f5, float f6, float f7, n n2) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2].g = net.minecraft.u.b.n.b(f4 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.05f * (float)(1 + Math.abs(i2 - 2));
            this.a[i2].c = net.minecraft.u.b.n.a(f4 * 0.9f + (float)i2 * 0.15f * (float)Math.PI) * (float)Math.PI * 0.2f * (float)Math.abs(i2 - 2);
        }
        this.b[0].g = this.a[2].g;
        this.b[1].g = this.a[4].g;
        this.b[1].c = this.a[4].c;
        this.b[2].g = this.a[1].g;
        this.b[2].c = this.a[1].c;
    }
}

