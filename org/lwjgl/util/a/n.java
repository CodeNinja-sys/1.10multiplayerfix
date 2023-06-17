/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.a;

import java.nio.IntBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class n {
    private static IntBuffer a = BufferUtils.d(16);

    protected static int a(int n2, int n3) {
        return n2 % n3 == 0 ? n2 / n3 : n2 / n3 + 1;
    }

    protected static float[] a(float[] arrf) {
        float f2 = (float)Math.sqrt(arrf[0] * arrf[0] + arrf[1] * arrf[1] + arrf[2] * arrf[2]);
        if ((double)f2 == 0.0) {
            return arrf;
        }
        f2 = 1.0f / f2;
        arrf[0] = arrf[0] * f2;
        arrf[1] = arrf[1] * f2;
        arrf[2] = arrf[2] * f2;
        return arrf;
    }

    protected static void a(float[] arrf, float[] arrf2, float[] arrf3) {
        arrf3[0] = arrf[1] * arrf2[2] - arrf[2] * arrf2[1];
        arrf3[1] = arrf[2] * arrf2[0] - arrf[0] * arrf2[2];
        arrf3[2] = arrf[0] * arrf2[1] - arrf[1] * arrf2[0];
    }

    protected static int b(int n2) {
        switch (n2) {
            case 6400: 
            case 6401: 
            case 6402: 
            case 6403: 
            case 6404: 
            case 6405: 
            case 6406: 
            case 6409: {
                return 1;
            }
            case 6410: {
                return 2;
            }
            case 6407: 
            case 32992: {
                return 3;
            }
            case 6408: 
            case 32993: {
                return 4;
            }
        }
        return -1;
    }

    protected static int c(int n2) {
        int n3 = 1;
        if (n2 == 0) {
            return -1;
        }
        while (n2 != 1) {
            if (n2 == 3) {
                return n3 << 2;
            }
            n2 >>= 1;
            n3 <<= 1;
        }
        return n3;
    }

    protected static int b(int n2, int n3) {
        int n4;
        int n5;
        switch (n2) {
            case 6400: 
            case 6401: 
            case 6402: 
            case 6403: 
            case 6404: 
            case 6405: 
            case 6406: 
            case 6409: {
                n5 = 1;
                break;
            }
            case 6410: {
                n5 = 2;
                break;
            }
            case 6407: 
            case 32992: {
                n5 = 3;
                break;
            }
            case 6408: 
            case 32993: {
                n5 = 4;
                break;
            }
            default: {
                n5 = 0;
            }
        }
        switch (n3) {
            case 5121: {
                n4 = 1;
                break;
            }
            case 5120: {
                n4 = 1;
                break;
            }
            case 6656: {
                n4 = 1;
                break;
            }
            case 5123: {
                n4 = 2;
                break;
            }
            case 5122: {
                n4 = 2;
                break;
            }
            case 5125: {
                n4 = 4;
                break;
            }
            case 5124: {
                n4 = 4;
                break;
            }
            case 5126: {
                n4 = 4;
                break;
            }
            default: {
                n4 = 0;
            }
        }
        return n5 * n4;
    }

    protected static int d(int n2) {
        a.rewind();
        GL11.c(n2, a);
        return a.get();
    }
}

