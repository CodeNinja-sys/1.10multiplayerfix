/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.g;

public class a {
    public float[][] a = new float[6][4];
    public float[] b = new float[16];
    public float[] c = new float[16];
    public float[] d = new float[16];

    private double a(float[] arrf, double d2, double d3, double d4) {
        return (double)arrf[0] * d2 + (double)arrf[1] * d3 + (double)arrf[2] * d4 + (double)arrf[3];
    }

    public boolean a(double d2, double d3, double d4, double d5, double d6, double d7) {
        for (int i2 = 0; i2 < 6; ++i2) {
            float[] arrf = this.a[i2];
            if (!(this.a(arrf, d2, d3, d4) <= 0.0) || !(this.a(arrf, d5, d3, d4) <= 0.0) || !(this.a(arrf, d2, d6, d4) <= 0.0) || !(this.a(arrf, d5, d6, d4) <= 0.0) || !(this.a(arrf, d2, d3, d7) <= 0.0) || !(this.a(arrf, d5, d3, d7) <= 0.0) || !(this.a(arrf, d2, d6, d7) <= 0.0) || !(this.a(arrf, d5, d6, d7) <= 0.0)) continue;
            return false;
        }
        return true;
    }
}

