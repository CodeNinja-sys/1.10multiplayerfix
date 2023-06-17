/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.g;

import java.nio.FloatBuffer;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.g.a;
import net.minecraft.client.g.v;
import net.minecraft.u.b.n;

public class b
extends a {
    private static final b e = new b();
    private final FloatBuffer f = v.e(16);
    private final FloatBuffer g = v.e(16);
    private final FloatBuffer h = v.e(16);

    public static a a() {
        e.b();
        return e;
    }

    private void a(float[] arrf) {
        float f2 = n.c(arrf[0] * arrf[0] + arrf[1] * arrf[1] + arrf[2] * arrf[2]);
        arrf[0] = arrf[0] / f2;
        arrf[1] = arrf[1] / f2;
        arrf[2] = arrf[2] / f2;
        arrf[3] = arrf[3] / f2;
    }

    public void b() {
        this.f.clear();
        this.g.clear();
        this.h.clear();
        bd.c(2983, this.f);
        bd.c(2982, this.g);
        float[] arrf = this.b;
        float[] arrf2 = this.c;
        this.f.flip().limit(16);
        this.f.get(arrf);
        this.g.flip().limit(16);
        this.g.get(arrf2);
        this.d[0] = arrf2[0] * arrf[0] + arrf2[1] * arrf[4] + arrf2[2] * arrf[8] + arrf2[3] * arrf[12];
        this.d[1] = arrf2[0] * arrf[1] + arrf2[1] * arrf[5] + arrf2[2] * arrf[9] + arrf2[3] * arrf[13];
        this.d[2] = arrf2[0] * arrf[2] + arrf2[1] * arrf[6] + arrf2[2] * arrf[10] + arrf2[3] * arrf[14];
        this.d[3] = arrf2[0] * arrf[3] + arrf2[1] * arrf[7] + arrf2[2] * arrf[11] + arrf2[3] * arrf[15];
        this.d[4] = arrf2[4] * arrf[0] + arrf2[5] * arrf[4] + arrf2[6] * arrf[8] + arrf2[7] * arrf[12];
        this.d[5] = arrf2[4] * arrf[1] + arrf2[5] * arrf[5] + arrf2[6] * arrf[9] + arrf2[7] * arrf[13];
        this.d[6] = arrf2[4] * arrf[2] + arrf2[5] * arrf[6] + arrf2[6] * arrf[10] + arrf2[7] * arrf[14];
        this.d[7] = arrf2[4] * arrf[3] + arrf2[5] * arrf[7] + arrf2[6] * arrf[11] + arrf2[7] * arrf[15];
        this.d[8] = arrf2[8] * arrf[0] + arrf2[9] * arrf[4] + arrf2[10] * arrf[8] + arrf2[11] * arrf[12];
        this.d[9] = arrf2[8] * arrf[1] + arrf2[9] * arrf[5] + arrf2[10] * arrf[9] + arrf2[11] * arrf[13];
        this.d[10] = arrf2[8] * arrf[2] + arrf2[9] * arrf[6] + arrf2[10] * arrf[10] + arrf2[11] * arrf[14];
        this.d[11] = arrf2[8] * arrf[3] + arrf2[9] * arrf[7] + arrf2[10] * arrf[11] + arrf2[11] * arrf[15];
        this.d[12] = arrf2[12] * arrf[0] + arrf2[13] * arrf[4] + arrf2[14] * arrf[8] + arrf2[15] * arrf[12];
        this.d[13] = arrf2[12] * arrf[1] + arrf2[13] * arrf[5] + arrf2[14] * arrf[9] + arrf2[15] * arrf[13];
        this.d[14] = arrf2[12] * arrf[2] + arrf2[13] * arrf[6] + arrf2[14] * arrf[10] + arrf2[15] * arrf[14];
        this.d[15] = arrf2[12] * arrf[3] + arrf2[13] * arrf[7] + arrf2[14] * arrf[11] + arrf2[15] * arrf[15];
        float[] arrf3 = this.a[0];
        arrf3[0] = this.d[3] - this.d[0];
        arrf3[1] = this.d[7] - this.d[4];
        arrf3[2] = this.d[11] - this.d[8];
        arrf3[3] = this.d[15] - this.d[12];
        this.a(arrf3);
        float[] arrf4 = this.a[1];
        arrf4[0] = this.d[3] + this.d[0];
        arrf4[1] = this.d[7] + this.d[4];
        arrf4[2] = this.d[11] + this.d[8];
        arrf4[3] = this.d[15] + this.d[12];
        this.a(arrf4);
        float[] arrf5 = this.a[2];
        arrf5[0] = this.d[3] + this.d[1];
        arrf5[1] = this.d[7] + this.d[5];
        arrf5[2] = this.d[11] + this.d[9];
        arrf5[3] = this.d[15] + this.d[13];
        this.a(arrf5);
        float[] arrf6 = this.a[3];
        arrf6[0] = this.d[3] - this.d[1];
        arrf6[1] = this.d[7] - this.d[5];
        arrf6[2] = this.d[11] - this.d[9];
        arrf6[3] = this.d[15] - this.d[13];
        this.a(arrf6);
        float[] arrf7 = this.a[4];
        arrf7[0] = this.d[3] - this.d[2];
        arrf7[1] = this.d[7] - this.d[6];
        arrf7[2] = this.d[11] - this.d[10];
        arrf7[3] = this.d[15] - this.d[14];
        this.a(arrf7);
        float[] arrf8 = this.a[5];
        arrf8[0] = this.d[3] + this.d[2];
        arrf8[1] = this.d[7] + this.d[6];
        arrf8[2] = this.d[11] + this.d[10];
        arrf8[3] = this.d[15] + this.d[14];
        this.a(arrf8);
    }
}

