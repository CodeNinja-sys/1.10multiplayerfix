/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.util.a.n;

public class j
extends n {
    private static final float[] a = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static final FloatBuffer b = BufferUtils.f(16);
    private static final FloatBuffer c = BufferUtils.f(16);
    private static final FloatBuffer d = BufferUtils.f(16);
    private static final float[] e = new float[4];
    private static final float[] f = new float[4];
    private static final float[] g = new float[3];
    private static final float[] h = new float[3];
    private static final float[] i = new float[3];

    private static void a(FloatBuffer floatBuffer) {
        int n2 = floatBuffer.position();
        floatBuffer.put(a);
        floatBuffer.position(n2);
    }

    private static void a(FloatBuffer floatBuffer, float[] arrf, float[] arrf2) {
        for (int i2 = 0; i2 < 4; ++i2) {
            arrf2[i2] = arrf[0] * floatBuffer.get(floatBuffer.position() + 0 + i2) + arrf[1] * floatBuffer.get(floatBuffer.position() + 4 + i2) + arrf[2] * floatBuffer.get(floatBuffer.position() + 8 + i2) + arrf[3] * floatBuffer.get(floatBuffer.position() + 12 + i2);
        }
    }

    private static boolean a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        int n2;
        FloatBuffer floatBuffer3 = d;
        for (n2 = 0; n2 < 16; ++n2) {
            floatBuffer3.put(n2, floatBuffer.get(n2 + floatBuffer.position()));
        }
        j.a(floatBuffer2);
        for (n2 = 0; n2 < 4; ++n2) {
            float f2;
            int n3;
            int n4;
            int n5 = n2;
            for (n4 = n2 + 1; n4 < 4; ++n4) {
                if (!(Math.abs(floatBuffer3.get(n4 * 4 + n2)) > Math.abs(floatBuffer3.get(n2 * 4 + n2)))) continue;
                n5 = n4;
            }
            if (n5 != n2) {
                for (n3 = 0; n3 < 4; ++n3) {
                    f2 = floatBuffer3.get(n2 * 4 + n3);
                    floatBuffer3.put(n2 * 4 + n3, floatBuffer3.get(n5 * 4 + n3));
                    floatBuffer3.put(n5 * 4 + n3, f2);
                    f2 = floatBuffer2.get(n2 * 4 + n3);
                    floatBuffer2.put(n2 * 4 + n3, floatBuffer2.get(n5 * 4 + n3));
                    floatBuffer2.put(n5 * 4 + n3, f2);
                }
            }
            if (floatBuffer3.get(n2 * 4 + n2) == 0.0f) {
                return false;
            }
            f2 = floatBuffer3.get(n2 * 4 + n2);
            for (n3 = 0; n3 < 4; ++n3) {
                floatBuffer3.put(n2 * 4 + n3, floatBuffer3.get(n2 * 4 + n3) / f2);
                floatBuffer2.put(n2 * 4 + n3, floatBuffer2.get(n2 * 4 + n3) / f2);
            }
            for (n4 = 0; n4 < 4; ++n4) {
                if (n4 == n2) continue;
                f2 = floatBuffer3.get(n4 * 4 + n2);
                for (n3 = 0; n3 < 4; ++n3) {
                    floatBuffer3.put(n4 * 4 + n3, floatBuffer3.get(n4 * 4 + n3) - floatBuffer3.get(n2 * 4 + n3) * f2);
                    floatBuffer2.put(n4 * 4 + n3, floatBuffer2.get(n4 * 4 + n3) - floatBuffer2.get(n2 * 4 + n3) * f2);
                }
            }
        }
        return true;
    }

    private static void a(FloatBuffer floatBuffer, FloatBuffer floatBuffer2, FloatBuffer floatBuffer3) {
        for (int i2 = 0; i2 < 4; ++i2) {
            for (int i3 = 0; i3 < 4; ++i3) {
                floatBuffer3.put(floatBuffer3.position() + i2 * 4 + i3, floatBuffer.get(floatBuffer.position() + i2 * 4 + 0) * floatBuffer2.get(floatBuffer2.position() + 0 + i3) + floatBuffer.get(floatBuffer.position() + i2 * 4 + 1) * floatBuffer2.get(floatBuffer2.position() + 4 + i3) + floatBuffer.get(floatBuffer.position() + i2 * 4 + 2) * floatBuffer2.get(floatBuffer2.position() + 8 + i3) + floatBuffer.get(floatBuffer.position() + i2 * 4 + 3) * floatBuffer2.get(floatBuffer2.position() + 12 + i3));
            }
        }
    }

    public static void a(float f2, float f3, float f4, float f5) {
        float f6 = f2 / 2.0f * (float)Math.PI / 180.0f;
        float f7 = f5 - f4;
        float f8 = (float)Math.sin(f6);
        if (f7 == 0.0f || f8 == 0.0f || f3 == 0.0f) {
            return;
        }
        float f9 = (float)Math.cos(f6) / f8;
        j.a(b);
        b.put(0, f9 / f3);
        b.put(5, f9);
        b.put(10, -(f5 + f4) / f7);
        b.put(11, -1.0f);
        b.put(14, -2.0f * f4 * f5 / f7);
        b.put(15, 0.0f);
        GL11.b(b);
    }

    public static void a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        float[] arrf = g;
        float[] arrf2 = h;
        float[] arrf3 = i;
        arrf[0] = f5 - f2;
        arrf[1] = f6 - f3;
        arrf[2] = f7 - f4;
        arrf3[0] = f8;
        arrf3[1] = f9;
        arrf3[2] = f10;
        j.a(arrf);
        j.a(arrf, arrf3, arrf2);
        j.a(arrf2);
        j.a(arrf2, arrf, arrf3);
        j.a(b);
        b.put(0, arrf2[0]);
        b.put(4, arrf2[1]);
        b.put(8, arrf2[2]);
        b.put(1, arrf3[0]);
        b.put(5, arrf3[1]);
        b.put(9, arrf3[2]);
        b.put(2, -arrf[0]);
        b.put(6, -arrf[1]);
        b.put(10, -arrf[2]);
        GL11.b(b);
        GL11.f(-f2, -f3, -f4);
    }

    public static boolean a(float f2, float f3, float f4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, IntBuffer intBuffer, FloatBuffer floatBuffer3) {
        float[] arrf = e;
        float[] arrf2 = f;
        arrf[0] = f2;
        arrf[1] = f3;
        arrf[2] = f4;
        arrf[3] = 1.0f;
        j.a(floatBuffer, arrf, arrf2);
        j.a(floatBuffer2, arrf2, arrf);
        if ((double)arrf[3] == 0.0) {
            return false;
        }
        arrf[3] = 1.0f / arrf[3] * 0.5f;
        arrf[0] = arrf[0] * arrf[3] + 0.5f;
        arrf[1] = arrf[1] * arrf[3] + 0.5f;
        arrf[2] = arrf[2] * arrf[3] + 0.5f;
        floatBuffer3.put(0, arrf[0] * (float)intBuffer.get(intBuffer.position() + 2) + (float)intBuffer.get(intBuffer.position() + 0));
        floatBuffer3.put(1, arrf[1] * (float)intBuffer.get(intBuffer.position() + 3) + (float)intBuffer.get(intBuffer.position() + 1));
        floatBuffer3.put(2, arrf[2]);
        return true;
    }

    public static boolean b(float f2, float f3, float f4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, IntBuffer intBuffer, FloatBuffer floatBuffer3) {
        float[] arrf = e;
        float[] arrf2 = f;
        j.a(floatBuffer, floatBuffer2, c);
        if (!j.a(c, c)) {
            return false;
        }
        arrf[0] = f2;
        arrf[1] = f3;
        arrf[2] = f4;
        arrf[3] = 1.0f;
        arrf[0] = (arrf[0] - (float)intBuffer.get(intBuffer.position() + 0)) / (float)intBuffer.get(intBuffer.position() + 2);
        arrf[1] = (arrf[1] - (float)intBuffer.get(intBuffer.position() + 1)) / (float)intBuffer.get(intBuffer.position() + 3);
        arrf[0] = arrf[0] * 2.0f - 1.0f;
        arrf[1] = arrf[1] * 2.0f - 1.0f;
        arrf[2] = arrf[2] * 2.0f - 1.0f;
        j.a(c, arrf, arrf2);
        if ((double)arrf2[3] == 0.0) {
            return false;
        }
        arrf2[3] = 1.0f / arrf2[3];
        floatBuffer3.put(floatBuffer3.position() + 0, arrf2[0] * arrf2[3]);
        floatBuffer3.put(floatBuffer3.position() + 1, arrf2[1] * arrf2[3]);
        floatBuffer3.put(floatBuffer3.position() + 2, arrf2[2] * arrf2[3]);
        return true;
    }

    public static void a(float f2, float f3, float f4, float f5, IntBuffer intBuffer) {
        if (f4 <= 0.0f || f5 <= 0.0f) {
            return;
        }
        GL11.f(((float)intBuffer.get(intBuffer.position() + 2) - 2.0f * (f2 - (float)intBuffer.get(intBuffer.position() + 0))) / f4, ((float)intBuffer.get(intBuffer.position() + 3) - 2.0f * (f3 - (float)intBuffer.get(intBuffer.position() + 1))) / f5, 0.0f);
        GL11.c((float)intBuffer.get(intBuffer.position() + 2) / f4, (float)intBuffer.get(intBuffer.position() + 3) / f5, 1.0f);
    }
}

