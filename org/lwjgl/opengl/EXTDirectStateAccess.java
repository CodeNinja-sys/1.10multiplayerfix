/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.EXTDrawBuffers2;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;

public final class EXTDirectStateAccess {
    public static final int a = 36397;
    public static final int b = 36398;
    public static final int c = 36399;

    private EXTDirectStateAccess() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ov;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglClientAttribDefaultEXT(n2, l2);
    }

    static native void nglClientAttribDefaultEXT(int var0, long var1);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ow;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglPushClientAttribDefaultEXT(n2, l2);
    }

    static native void nglPushClientAttribDefaultEXT(int var0, long var1);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ox;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        EXTDirectStateAccess.nglMatrixLoadfEXT(n2, o.a(floatBuffer), l2);
    }

    static native void nglMatrixLoadfEXT(int var0, long var1, long var3);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        EXTDirectStateAccess.nglMatrixLoaddEXT(n2, o.a(doubleBuffer), l2);
    }

    static native void nglMatrixLoaddEXT(int var0, long var1, long var3);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        EXTDirectStateAccess.nglMatrixMultfEXT(n2, o.a(floatBuffer), l2);
    }

    static native void nglMatrixMultfEXT(int var0, long var1, long var3);

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        EXTDirectStateAccess.nglMatrixMultdEXT(n2, o.a(doubleBuffer), l2);
    }

    static native void nglMatrixMultdEXT(int var0, long var1, long var3);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oB;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixLoadIdentityEXT(n2, l2);
    }

    static native void nglMatrixLoadIdentityEXT(int var0, long var1);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oC;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixRotatefEXT(n2, f2, f3, f4, f5, l2);
    }

    static native void nglMatrixRotatefEXT(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oD;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixRotatedEXT(n2, d2, d3, d4, d5, l2);
    }

    static native void nglMatrixRotatedEXT(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oE;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixScalefEXT(n2, f2, f3, f4, l2);
    }

    static native void nglMatrixScalefEXT(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oF;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixScaledEXT(n2, d2, d3, d4, l2);
    }

    static native void nglMatrixScaledEXT(int var0, double var1, double var3, double var5, long var7);

    public static void b(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oG;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixTranslatefEXT(n2, f2, f3, f4, l2);
    }

    static native void nglMatrixTranslatefEXT(int var0, float var1, float var2, float var3, long var4);

    public static void b(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oH;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixTranslatedEXT(n2, d2, d3, d4, l2);
    }

    static native void nglMatrixTranslatedEXT(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, double d2, double d3, double d4, double d5, double d6, double d7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oI;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixOrthoEXT(n2, d2, d3, d4, d5, d6, d7, l2);
    }

    static native void nglMatrixOrthoEXT(int var0, double var1, double var3, double var5, double var7, double var9, double var11, long var13);

    public static void b(int n2, double d2, double d3, double d4, double d5, double d6, double d7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oJ;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixFrustumEXT(n2, d2, d3, d4, d5, d6, d7, l2);
    }

    static native void nglMatrixFrustumEXT(int var0, double var1, double var3, double var5, double var7, double var9, double var11, long var13);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oK;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixPushEXT(n2, l2);
    }

    static native void nglMatrixPushEXT(int var0, long var1);

    public static void e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oL;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMatrixPopEXT(n2, l2);
    }

    static native void nglMatrixPopEXT(int var0, long var1);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oM;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglTextureParameteriEXT(n2, n3, n4, n5, l2);
    }

    static native void nglTextureParameteriEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglTextureParameterivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglTextureParameterivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oO;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglTextureParameterfEXT(n2, n3, n4, f2, l2);
    }

    static native void nglTextureParameterfEXT(int var0, int var1, int var2, float var3, long var4);

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglTextureParameterfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglTextureParameterfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oQ;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglTextureImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oQ;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglTextureImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oQ;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglTextureImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oQ;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglTextureImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oQ;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglTextureImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(shortBuffer), l2);
    }

    static native void nglTextureImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.oQ;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglTextureImage1DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglTextureImage1DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oR;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglTextureImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oR;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglTextureImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oR;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglTextureImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oR;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglTextureImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oR;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglTextureImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(shortBuffer), l2);
    }

    static native void nglTextureImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.oR;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglTextureImage2DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglTextureImage2DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oS;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglTextureSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oS;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglTextureSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oS;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglTextureSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oS;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglTextureSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oS;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglTextureSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(shortBuffer), l2);
    }

    static native void nglTextureSubImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.oS;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglTextureSubImage1DEXTBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglTextureSubImage1DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oT;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglTextureSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oT;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglTextureSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oT;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglTextureSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oT;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglTextureSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oT;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglTextureSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(shortBuffer), l2);
    }

    static native void nglTextureSubImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.oT;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglTextureSubImage2DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglTextureSubImage2DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oU;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyTextureImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, l2);
    }

    static native void nglCopyTextureImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oV;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyTextureImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2);
    }

    static native void nglCopyTextureImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oW;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyTextureSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    static native void nglCopyTextureSubImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oX;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyTextureSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2);
    }

    static native void nglCopyTextureSubImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oY;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetTextureImageEXT(n2, n3, n4, n5, n6, o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oY;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetTextureImageEXT(n2, n3, n4, n5, n6, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oY;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetTextureImageEXT(n2, n3, n4, n5, n6, o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oY;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetTextureImageEXT(n2, n3, n4, n5, n6, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oY;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetTextureImageEXT(n2, n3, n4, n5, n6, o.a(shortBuffer), l2);
    }

    static native void nglGetTextureImageEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.oY;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        EXTDirectStateAccess.nglGetTextureImageEXTBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglGetTextureImageEXTBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void b(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglGetTextureParameterfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglGetTextureParameterfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static float a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oZ;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = i.c(dt2);
        EXTDirectStateAccess.nglGetTextureParameterfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void b(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pa;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetTextureParameterivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetTextureParameterivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pa;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetTextureParameterivEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglGetTextureLevelParameterfvEXT(n2, n3, n4, n5, o.a(floatBuffer), l2);
    }

    static native void nglGetTextureLevelParameterfvEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static float b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pb;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = i.c(dt2);
        EXTDirectStateAccess.nglGetTextureLevelParameterfvEXT(n2, n3, n4, n5, o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetTextureLevelParameterivEXT(n2, n3, n4, n5, o.a(intBuffer), l2);
    }

    static native void nglGetTextureLevelParameterivEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static int c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pc;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetTextureLevelParameterivEXT(n2, n3, n4, n5, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pd;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, ft.b(byteBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglTextureImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pd;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, ft.b(doubleBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglTextureImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pd;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.b(floatBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglTextureImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pd;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, ft.b(intBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglTextureImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pd;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, ft.b(shortBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglTextureImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(shortBuffer), l2);
    }

    static native void nglTextureImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pd;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglTextureImage3DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2, l3);
    }

    static native void nglTextureImage3DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pe;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglTextureSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pe;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglTextureSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pe;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglTextureSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pe;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglTextureSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pe;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglTextureSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(shortBuffer), l2);
    }

    static native void nglTextureSubImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pe;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglTextureSubImage3DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, l2, l3);
    }

    static native void nglTextureSubImage3DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pf;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyTextureSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2);
    }

    static native void nglCopyTextureSubImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pg;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglBindMultiTextureEXT(n2, n3, n4, l2);
    }

    static native void nglBindMultiTextureEXT(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ph;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        EXTDirectStateAccess.nglMultiTexCoordPointerEXT(n2, n3, 5130, n4, o.a(doubleBuffer), l2);
    }

    public static void c(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ph;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglMultiTexCoordPointerEXT(n2, n3, 5126, n4, o.a(floatBuffer), l2);
    }

    static native void nglMultiTexCoordPointerEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ph;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        EXTDirectStateAccess.nglMultiTexCoordPointerEXTBO(n2, n3, n4, n5, l2, l3);
    }

    static native void nglMultiTexCoordPointerEXTBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void b(int n2, int n3, int n4, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pi;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexEnvfEXT(n2, n3, n4, f2, l2);
    }

    static native void nglMultiTexEnvfEXT(int var0, int var1, int var2, float var3, long var4);

    public static void d(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglMultiTexEnvfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglMultiTexEnvfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pk;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexEnviEXT(n2, n3, n4, n5, l2);
    }

    static native void nglMultiTexEnviEXT(int var0, int var1, int var2, int var3, long var4);

    public static void c(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglMultiTexEnvivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglMultiTexEnvivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pm;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexGendEXT(n2, n3, n4, d2, l2);
    }

    static native void nglMultiTexGendEXT(int var0, int var1, int var2, double var3, long var5);

    public static void b(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTDirectStateAccess.nglMultiTexGendvEXT(n2, n3, n4, o.a(doubleBuffer), l2);
    }

    static native void nglMultiTexGendvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, int n4, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.po;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexGenfEXT(n2, n3, n4, f2, l2);
    }

    static native void nglMultiTexGenfEXT(int var0, int var1, int var2, float var3, long var4);

    public static void e(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglMultiTexGenfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglMultiTexGenfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pq;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexGeniEXT(n2, n3, n4, n5, l2);
    }

    static native void nglMultiTexGeniEXT(int var0, int var1, int var2, int var3, long var4);

    public static void d(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglMultiTexGenivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglMultiTexGenivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void f(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ps;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexEnvfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglGetMultiTexEnvfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pt;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexEnvivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetMultiTexEnvivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexGendvEXT(n2, n3, n4, o.a(doubleBuffer), l2);
    }

    static native void nglGetMultiTexGendvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void g(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexGenfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglGetMultiTexGenfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void f(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexGenivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetMultiTexGenivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void f(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.px;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexParameteriEXT(n2, n3, n4, n5, l2);
    }

    static native void nglMultiTexParameteriEXT(int var0, int var1, int var2, int var3, long var4);

    public static void g(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.py;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglMultiTexParameterivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglMultiTexParameterivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, int n4, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pz;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexParameterfEXT(n2, n3, n4, f2, l2);
    }

    static native void nglMultiTexParameterfEXT(int var0, int var1, int var2, float var3, long var4);

    public static void h(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglMultiTexParameterfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglMultiTexParameterfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pB;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglMultiTexImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pB;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglMultiTexImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pB;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglMultiTexImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pB;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglMultiTexImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pB;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n8, n9, n6));
        }
        EXTDirectStateAccess.nglMultiTexImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, o.b(shortBuffer), l2);
    }

    static native void nglMultiTexImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pB;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglMultiTexImage1DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglMultiTexImage1DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pC;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglMultiTexImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(byteBuffer), l2);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pC;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglMultiTexImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(doubleBuffer), l2);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pC;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglMultiTexImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(floatBuffer), l2);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pC;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglMultiTexImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(intBuffer), l2);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pC;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n9, n10, n6, n7));
        }
        EXTDirectStateAccess.nglMultiTexImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.b(shortBuffer), l2);
    }

    static native void nglMultiTexImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pC;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglMultiTexImage2DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglMultiTexImage2DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pD;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglMultiTexSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pD;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglMultiTexSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pD;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglMultiTexSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pD;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglMultiTexSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pD;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n7, n8, n6, 1, 1));
        EXTDirectStateAccess.nglMultiTexSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, o.a(shortBuffer), l2);
    }

    static native void nglMultiTexSubImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pD;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglMultiTexSubImage1DEXTBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglMultiTexSubImage1DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pE;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglMultiTexSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(byteBuffer), l2);
    }

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pE;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglMultiTexSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(doubleBuffer), l2);
    }

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pE;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglMultiTexSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(floatBuffer), l2);
    }

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pE;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglMultiTexSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(intBuffer), l2);
    }

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pE;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n9, n10, n7, n8, 1));
        EXTDirectStateAccess.nglMultiTexSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, o.a(shortBuffer), l2);
    }

    static native void nglMultiTexSubImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pE;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglMultiTexSubImage2DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglMultiTexSubImage2DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pF;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyMultiTexImage1DEXT(n2, n3, n4, n5, n6, n7, n8, n9, l2);
    }

    static native void nglCopyMultiTexImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pG;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyMultiTexImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2);
    }

    static native void nglCopyMultiTexImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pH;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyMultiTexSubImage1DEXT(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    static native void nglCopyMultiTexSubImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pI;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyMultiTexSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2);
    }

    static native void nglCopyMultiTexSubImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

    public static void b(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pJ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetMultiTexImageEXT(n2, n3, n4, n5, n6, o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pJ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetMultiTexImageEXT(n2, n3, n4, n5, n6, o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pJ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetMultiTexImageEXT(n2, n3, n4, n5, n6, o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pJ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetMultiTexImageEXT(n2, n3, n4, n5, n6, o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pJ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n5, n6, 1, 1, 1));
        EXTDirectStateAccess.nglGetMultiTexImageEXT(n2, n3, n4, n5, n6, o.a(shortBuffer), l2);
    }

    static native void nglGetMultiTexImageEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void b(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pJ;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        EXTDirectStateAccess.nglGetMultiTexImageEXTBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglGetMultiTexImageEXTBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void i(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexParameterfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglGetMultiTexParameterfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static float d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pK;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = i.c(dt2);
        EXTDirectStateAccess.nglGetMultiTexParameterfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void h(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexParameterivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetMultiTexParameterivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int e(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pL;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetMultiTexParameterivEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexLevelParameterfvEXT(n2, n3, n4, n5, o.a(floatBuffer), l2);
    }

    static native void nglGetMultiTexLevelParameterfvEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static float g(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pM;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = i.c(dt2);
        EXTDirectStateAccess.nglGetMultiTexLevelParameterfvEXT(n2, n3, n4, n5, o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void b(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexLevelParameterivEXT(n2, n3, n4, n5, o.a(intBuffer), l2);
    }

    static native void nglGetMultiTexLevelParameterivEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static int h(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pN;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetMultiTexLevelParameterivEXT(n2, n3, n4, n5, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pO;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, ft.b(byteBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglMultiTexImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pO;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, ft.b(doubleBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglMultiTexImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pO;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.b(floatBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglMultiTexImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pO;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, ft.b(intBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglMultiTexImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pO;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, ft.b(shortBuffer, n10, n11, n6, n7, n8));
        }
        EXTDirectStateAccess.nglMultiTexImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, o.b(shortBuffer), l2);
    }

    static native void nglMultiTexImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pO;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglMultiTexImage3DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2, l3);
    }

    static native void nglMultiTexImage3DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pP;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglMultiTexSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pP;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglMultiTexSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pP;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglMultiTexSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pP;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglMultiTexSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pP;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n11, n12, n8, n9, n10));
        EXTDirectStateAccess.nglMultiTexSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, o.a(shortBuffer), l2);
    }

    static native void nglMultiTexSubImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pP;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglMultiTexSubImage3DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, l2, l3);
    }

    static native void nglMultiTexSubImage3DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pQ;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglCopyMultiTexSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2);
    }

    static native void nglCopyMultiTexSubImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pR;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglEnableClientStateIndexedEXT(n2, n3, l2);
    }

    static native void nglEnableClientStateIndexedEXT(int var0, int var1, long var2);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pS;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglDisableClientStateIndexedEXT(n2, n3, l2);
    }

    static native void nglDisableClientStateIndexedEXT(int var0, int var1, long var2);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pT;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglEnableClientStateiEXT(n2, n3, l2);
    }

    static native void nglEnableClientStateiEXT(int var0, int var1, long var2);

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pU;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglDisableClientStateiEXT(n2, n3, l2);
    }

    static native void nglDisableClientStateiEXT(int var0, int var1, long var2);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        EXTDirectStateAccess.nglGetFloatIndexedvEXT(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetFloatIndexedvEXT(int var0, int var1, long var2, long var4);

    public static float e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pV;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = i.c(dt2);
        EXTDirectStateAccess.nglGetFloatIndexedvEXT(n2, n3, o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        EXTDirectStateAccess.nglGetDoubleIndexedvEXT(n2, n3, o.a(doubleBuffer), l2);
    }

    static native void nglGetDoubleIndexedvEXT(int var0, int var1, long var2, long var4);

    public static double f(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pW;
        org.lwjgl.a.a(l2);
        DoubleBuffer doubleBuffer = i.d(dt2);
        EXTDirectStateAccess.nglGetDoubleIndexedvEXT(n2, n3, o.a(doubleBuffer), l2);
        return doubleBuffer.get(0);
    }

    public static ByteBuffer a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.pX;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = EXTDirectStateAccess.nglGetPointerIndexedvEXT(n2, n3, l2, l3);
        return d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetPointerIndexedvEXT(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        EXTDirectStateAccess.nglGetFloati_vEXT(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetFloati_vEXT(int var0, int var1, long var2, long var4);

    public static float g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pY;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = i.c(dt2);
        EXTDirectStateAccess.nglGetFloati_vEXT(n2, n3, o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void b(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        EXTDirectStateAccess.nglGetDoublei_vEXT(n2, n3, o.a(doubleBuffer), l2);
    }

    static native void nglGetDoublei_vEXT(int var0, int var1, long var2, long var4);

    public static double h(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.pZ;
        org.lwjgl.a.a(l2);
        DoubleBuffer doubleBuffer = i.d(dt2);
        EXTDirectStateAccess.nglGetDoublei_vEXT(n2, n3, o.a(doubleBuffer), l2);
        return doubleBuffer.get(0);
    }

    public static ByteBuffer b(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qa;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = EXTDirectStateAccess.nglGetPointeri_vEXT(n2, n3, l2, l3);
        return d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetPointeri_vEXT(int var0, int var1, long var2, long var4);

    public static void i(int n2, int n3) {
        EXTDrawBuffers2.c(n2, n3);
    }

    public static void j(int n2, int n3) {
        EXTDrawBuffers2.d(n2, n3);
    }

    public static boolean k(int n2, int n3) {
        return EXTDrawBuffers2.e(n2, n3);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        EXTDrawBuffers2.a(n2, n3, intBuffer);
    }

    public static int l(int n2, int n3) {
        return EXTDrawBuffers2.b(n2, n3);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        EXTDrawBuffers2.a(n2, n3, byteBuffer);
    }

    public static boolean m(int n2, int n3) {
        return EXTDrawBuffers2.a(n2, n3);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglNamedProgramStringEXT(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglNamedProgramStringEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qb;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedProgramStringEXT(n2, n3, n4, charSequence.length(), i.a(dt2, charSequence), l2);
    }

    public static void a(int n2, int n3, int n4, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qc;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedProgramLocalParameter4dEXT(n2, n3, n4, d2, d3, d4, d5, l2);
    }

    static native void nglNamedProgramLocalParameter4dEXT(int var0, int var1, int var2, double var3, double var5, double var7, double var9, long var11);

    public static void d(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTDirectStateAccess.nglNamedProgramLocalParameter4dvEXT(n2, n3, n4, o.a(doubleBuffer), l2);
    }

    static native void nglNamedProgramLocalParameter4dvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qe;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedProgramLocalParameter4fEXT(n2, n3, n4, f2, f3, f4, f5, l2);
    }

    static native void nglNamedProgramLocalParameter4fEXT(int var0, int var1, int var2, float var3, float var4, float var5, float var6, long var7);

    public static void j(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglNamedProgramLocalParameter4fvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglNamedProgramLocalParameter4fvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTDirectStateAccess.nglGetNamedProgramLocalParameterdvEXT(n2, n3, n4, o.a(doubleBuffer), l2);
    }

    static native void nglGetNamedProgramLocalParameterdvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void k(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTDirectStateAccess.nglGetNamedProgramLocalParameterfvEXT(n2, n3, n4, o.a(floatBuffer), l2);
    }

    static native void nglGetNamedProgramLocalParameterfvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void i(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetNamedProgramivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetNamedProgramivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int f(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qi;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetNamedProgramivEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglGetNamedProgramStringEXT(n2, n3, n4, o.a(byteBuffer), l2);
    }

    static native void nglGetNamedProgramStringEXT(int var0, int var1, int var2, long var3, long var5);

    public static String g(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qj;
        org.lwjgl.a.a(l2);
        int n5 = EXTDirectStateAccess.f(n2, n3, 34343);
        ByteBuffer byteBuffer = i.a(dt2, n5);
        EXTDirectStateAccess.nglGetNamedProgramStringEXT(n2, n3, n4, o.a(byteBuffer), l2);
        byteBuffer.limit(n5);
        return i.a(dt2, byteBuffer);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qk;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedTextureImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void e(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qk;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedTextureImage3DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglCompressedTextureImage3DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ql;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedTextureImage2DEXT(n2, n3, n4, n5, n6, n7, n8, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ql;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedTextureImage2DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglCompressedTextureImage2DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qm;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedTextureImage1DEXT(n2, n3, n4, n5, n6, n7, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qm;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedTextureImage1DEXTBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglCompressedTextureImage1DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qn;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedTextureSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureSubImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qn;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedTextureSubImage3DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, l2, l3);
    }

    static native void nglCompressedTextureSubImage3DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qo;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedTextureSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureSubImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void f(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qo;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedTextureSubImage2DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglCompressedTextureSubImage2DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qp;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedTextureSubImage1DEXT(n2, n3, n4, n5, n6, n7, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureSubImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qp;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedTextureSubImage1DEXTBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglCompressedTextureSubImage1DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void c(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qq;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglGetCompressedTextureImageEXT(n2, n3, n4, o.a(byteBuffer), l2);
    }

    public static void j(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qq;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglGetCompressedTextureImageEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qq;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        EXTDirectStateAccess.nglGetCompressedTextureImageEXT(n2, n3, n4, o.a(shortBuffer), l2);
    }

    static native void nglGetCompressedTextureImageEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qq;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        EXTDirectStateAccess.nglGetCompressedTextureImageEXTBO(n2, n3, n4, l2, l3);
    }

    static native void nglGetCompressedTextureImageEXTBO(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qr;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedMultiTexImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedMultiTexImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void g(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qr;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedMultiTexImage3DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglCompressedMultiTexImage3DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qs;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedMultiTexImage2DEXT(n2, n3, n4, n5, n6, n7, n8, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedMultiTexImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qs;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedMultiTexImage2DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglCompressedMultiTexImage2DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qt;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedMultiTexImage1DEXT(n2, n3, n4, n5, n6, n7, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedMultiTexImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void e(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qt;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedMultiTexImage1DEXTBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglCompressedMultiTexImage1DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qu;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedMultiTexSubImage3DEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedMultiTexSubImage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qu;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedMultiTexSubImage3DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, l2, l3);
    }

    static native void nglCompressedMultiTexSubImage3DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void f(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qv;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedMultiTexSubImage2DEXT(n2, n3, n4, n5, n6, n7, n8, n9, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedMultiTexSubImage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void h(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qv;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedMultiTexSubImage2DEXTBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglCompressedMultiTexSubImage2DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qw;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglCompressedMultiTexSubImage1DEXT(n2, n3, n4, n5, n6, n7, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedMultiTexSubImage1DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void f(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qw;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        EXTDirectStateAccess.nglCompressedMultiTexSubImage1DEXTBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglCompressedMultiTexSubImage1DEXTBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void d(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qx;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglGetCompressedMultiTexImageEXT(n2, n3, n4, o.a(byteBuffer), l2);
    }

    public static void k(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qx;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglGetCompressedMultiTexImageEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qx;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        EXTDirectStateAccess.nglGetCompressedMultiTexImageEXT(n2, n3, n4, o.a(shortBuffer), l2);
    }

    static native void nglGetCompressedMultiTexImageEXT(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qx;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        EXTDirectStateAccess.nglGetCompressedMultiTexImageEXTBO(n2, n3, n4, l2, l3);
    }

    static native void nglGetCompressedMultiTexImageEXTBO(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        EXTDirectStateAccess.nglMatrixLoadTransposefEXT(n2, o.a(floatBuffer), l2);
    }

    static native void nglMatrixLoadTransposefEXT(int var0, long var1, long var3);

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        EXTDirectStateAccess.nglMatrixLoadTransposedEXT(n2, o.a(doubleBuffer), l2);
    }

    static native void nglMatrixLoadTransposedEXT(int var0, long var1, long var3);

    public static void d(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        EXTDirectStateAccess.nglMatrixMultTransposefEXT(n2, o.a(floatBuffer), l2);
    }

    static native void nglMatrixMultTransposefEXT(int var0, long var1, long var3);

    public static void d(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        EXTDirectStateAccess.nglMatrixMultTransposedEXT(n2, o.a(doubleBuffer), l2);
    }

    static native void nglMatrixMultTransposedEXT(int var0, long var1, long var3);

    public static void a(int n2, long l2, int n3) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qC;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglNamedBufferDataEXT(n2, l2, 0L, n3, l3);
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglNamedBufferDataEXT(n2, byteBuffer.remaining(), o.a(byteBuffer), n3, l2);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        EXTDirectStateAccess.nglNamedBufferDataEXT(n2, doubleBuffer.remaining() << 3, o.a(doubleBuffer), n3, l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglNamedBufferDataEXT(n2, floatBuffer.remaining() << 2, o.a(floatBuffer), n3, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglNamedBufferDataEXT(n2, intBuffer.remaining() << 2, o.a(intBuffer), n3, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        EXTDirectStateAccess.nglNamedBufferDataEXT(n2, shortBuffer.remaining() << 1, o.a(shortBuffer), n3, l2);
    }

    static native void nglNamedBufferDataEXT(int var0, long var1, long var3, int var5, long var6);

    public static void a(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qD;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglNamedBufferSubDataEXT(n2, l2, byteBuffer.remaining(), o.a(byteBuffer), l3);
    }

    public static void a(int n2, long l2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qD;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        EXTDirectStateAccess.nglNamedBufferSubDataEXT(n2, l2, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l3);
    }

    public static void a(int n2, long l2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qD;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglNamedBufferSubDataEXT(n2, l2, floatBuffer.remaining() << 2, o.a(floatBuffer), l3);
    }

    public static void a(int n2, long l2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qD;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglNamedBufferSubDataEXT(n2, l2, intBuffer.remaining() << 2, o.a(intBuffer), l3);
    }

    public static void a(int n2, long l2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qD;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        EXTDirectStateAccess.nglNamedBufferSubDataEXT(n2, l2, shortBuffer.remaining() << 1, o.a(shortBuffer), l3);
    }

    static native void nglNamedBufferSubDataEXT(int var0, long var1, long var3, long var5, long var7);

    public static ByteBuffer b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qE;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = EXTDirectStateAccess.nglMapNamedBufferEXT(n2, n3, EXTDirectStateAccess.n(n2, 34660), byteBuffer, l2);
        return d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    public static ByteBuffer a(int n2, int n3, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qE;
        org.lwjgl.a.a(l3);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = EXTDirectStateAccess.nglMapNamedBufferEXT(n2, n3, l2, byteBuffer, l3);
        return d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapNamedBufferEXT(int var0, int var1, long var2, ByteBuffer var4, long var5);

    public static boolean f(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qF;
        org.lwjgl.a.a(l2);
        boolean bl2 = EXTDirectStateAccess.nglUnmapNamedBufferEXT(n2, l2);
        return bl2;
    }

    static native boolean nglUnmapNamedBufferEXT(int var0, long var1);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetNamedBufferParameterivEXT(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetNamedBufferParameterivEXT(int var0, int var1, long var2, long var4);

    public static int n(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qG;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetNamedBufferParameterivEXT(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static ByteBuffer o(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qH;
        org.lwjgl.a.a(l2);
        ByteBuffer byteBuffer = EXTDirectStateAccess.nglGetNamedBufferPointervEXT(n2, n3, EXTDirectStateAccess.n(n2, 34660), l2);
        return d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetNamedBufferPointervEXT(int var0, int var1, long var2, long var4);

    public static void b(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qI;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        EXTDirectStateAccess.nglGetNamedBufferSubDataEXT(n2, l2, byteBuffer.remaining(), o.a(byteBuffer), l3);
    }

    public static void b(int n2, long l2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qI;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        EXTDirectStateAccess.nglGetNamedBufferSubDataEXT(n2, l2, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l3);
    }

    public static void b(int n2, long l2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qI;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglGetNamedBufferSubDataEXT(n2, l2, floatBuffer.remaining() << 2, o.a(floatBuffer), l3);
    }

    public static void b(int n2, long l2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qI;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglGetNamedBufferSubDataEXT(n2, l2, intBuffer.remaining() << 2, o.a(intBuffer), l3);
    }

    public static void b(int n2, long l2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.qI;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        EXTDirectStateAccess.nglGetNamedBufferSubDataEXT(n2, l2, shortBuffer.remaining() << 1, o.a(shortBuffer), l3);
    }

    static native void nglGetNamedBufferSubDataEXT(int var0, long var1, long var3, long var5, long var7);

    public static void a(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qJ;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform1fEXT(n2, n3, f2, l2);
    }

    static native void nglProgramUniform1fEXT(int var0, int var1, float var2, long var3);

    public static void a(int n2, int n3, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qK;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform2fEXT(n2, n3, f2, f3, l2);
    }

    static native void nglProgramUniform2fEXT(int var0, int var1, float var2, float var3, long var4);

    public static void a(int n2, int n3, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qL;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform3fEXT(n2, n3, f2, f3, f4, l2);
    }

    static native void nglProgramUniform3fEXT(int var0, int var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, int n3, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qM;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform4fEXT(n2, n3, f2, f3, f4, f5, l2);
    }

    static native void nglProgramUniform4fEXT(int var0, int var1, float var2, float var3, float var4, float var5, long var6);

    public static void h(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qN;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform1iEXT(n2, n3, n4, l2);
    }

    static native void nglProgramUniform1iEXT(int var0, int var1, int var2, long var3);

    public static void i(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qO;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform2iEXT(n2, n3, n4, n5, l2);
    }

    static native void nglProgramUniform2iEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qP;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform3iEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglProgramUniform3iEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qQ;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform4iEXT(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglProgramUniform4iEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniform1fvEXT(n2, n3, floatBuffer.remaining(), o.a(floatBuffer), l2);
    }

    static native void nglProgramUniform1fvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniform2fvEXT(n2, n3, floatBuffer.remaining() >> 1, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniform2fvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniform3fvEXT(n2, n3, floatBuffer.remaining() / 3, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniform3fvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void f(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniform4fvEXT(n2, n3, floatBuffer.remaining() >> 2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniform4fvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglProgramUniform1ivEXT(n2, n3, intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglProgramUniform1ivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglProgramUniform2ivEXT(n2, n3, intBuffer.remaining() >> 1, o.a(intBuffer), l2);
    }

    static native void nglProgramUniform2ivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglProgramUniform3ivEXT(n2, n3, intBuffer.remaining() / 3, o.a(intBuffer), l2);
    }

    static native void nglProgramUniform3ivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglProgramUniform4ivEXT(n2, n3, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglProgramUniform4ivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.qZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix2fvEXT(n2, n3, floatBuffer.remaining() >> 2, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix2fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void b(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ra;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix3fvEXT(n2, n3, floatBuffer.remaining() / 9, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix3fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void c(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix4fvEXT(n2, n3, floatBuffer.remaining() >> 4, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix4fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void d(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix2x3fvEXT(n2, n3, floatBuffer.remaining() / 6, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix2x3fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void e(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix3x2fvEXT(n2, n3, floatBuffer.remaining() / 6, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix3x2fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void f(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.re;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix2x4fvEXT(n2, n3, floatBuffer.remaining() >> 3, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix2x4fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void g(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix4x2fvEXT(n2, n3, floatBuffer.remaining() >> 3, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix4x2fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void h(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix3x4fvEXT(n2, n3, floatBuffer.remaining() / 12, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix3x4fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void i(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglProgramUniformMatrix4x3fvEXT(n2, n3, floatBuffer.remaining() / 12, bl2, o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix4x3fvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void j(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ri;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglTextureBufferEXT(n2, n3, n4, n5, l2);
    }

    static native void nglTextureBufferEXT(int var0, int var1, int var2, int var3, long var4);

    public static void k(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rj;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexBufferEXT(n2, n3, n4, n5, l2);
    }

    static native void nglMultiTexBufferEXT(int var0, int var1, int var2, int var3, long var4);

    public static void l(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglTextureParameterIivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglTextureParameterIivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void l(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rk;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglTextureParameterIivEXT(n2, n3, n4, i.c(dt2, n5), l2);
    }

    public static void m(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglTextureParameterIuivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglTextureParameterIuivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void m(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rl;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglTextureParameterIuivEXT(n2, n3, n4, i.c(dt2, n5), l2);
    }

    public static void n(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rm;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetTextureParameterIivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetTextureParameterIivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int i(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rm;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetTextureParameterIivEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void o(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetTextureParameterIuivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetTextureParameterIuivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int j(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rn;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetTextureParameterIuivEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void p(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ro;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglMultiTexParameterIivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglMultiTexParameterIivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void n(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ro;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexParameterIivEXT(n2, n3, n4, i.c(dt2, n5), l2);
    }

    public static void q(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglMultiTexParameterIuivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglMultiTexParameterIuivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void o(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rp;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexParameterIuivEXT(n2, n3, n4, i.c(dt2, n5), l2);
    }

    public static void r(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexParameterIivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetMultiTexParameterIivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int k(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rq;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetMultiTexParameterIivEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void s(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetMultiTexParameterIuivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetMultiTexParameterIuivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int l(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rr;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetMultiTexParameterIuivEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void m(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rs;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform1uiEXT(n2, n3, n4, l2);
    }

    static native void nglProgramUniform1uiEXT(int var0, int var1, int var2, long var3);

    public static void p(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rt;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform2uiEXT(n2, n3, n4, n5, l2);
    }

    static native void nglProgramUniform2uiEXT(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ru;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform3uiEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglProgramUniform3uiEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rv;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglProgramUniform4uiEXT(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglProgramUniform4uiEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void g(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglProgramUniform1uivEXT(n2, n3, intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglProgramUniform1uivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void h(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglProgramUniform2uivEXT(n2, n3, intBuffer.remaining() >> 1, o.a(intBuffer), l2);
    }

    static native void nglProgramUniform2uivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void i(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ry;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglProgramUniform3uivEXT(n2, n3, intBuffer.remaining() / 3, o.a(intBuffer), l2);
    }

    static native void nglProgramUniform3uivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void j(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglProgramUniform4uivEXT(n2, n3, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglProgramUniform4uivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void l(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTDirectStateAccess.nglNamedProgramLocalParameters4fvEXT(n2, n3, n4, floatBuffer.remaining() >> 2, o.a(floatBuffer), l2);
    }

    static native void nglNamedProgramLocalParameters4fvEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rB;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedProgramLocalParameterI4iEXT(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    static native void nglNamedProgramLocalParameterI4iEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);

    public static void t(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglNamedProgramLocalParameterI4ivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglNamedProgramLocalParameterI4ivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void u(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglNamedProgramLocalParametersI4ivEXT(n2, n3, n4, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglNamedProgramLocalParametersI4ivEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rE;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedProgramLocalParameterI4uiEXT(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    static native void nglNamedProgramLocalParameterI4uiEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);

    public static void v(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglNamedProgramLocalParameterI4uivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglNamedProgramLocalParameterI4uivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void w(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglNamedProgramLocalParametersI4uivEXT(n2, n3, n4, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglNamedProgramLocalParametersI4uivEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void x(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetNamedProgramLocalParameterIivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetNamedProgramLocalParameterIivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void y(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetNamedProgramLocalParameterIuivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetNamedProgramLocalParameterIuivEXT(int var0, int var1, int var2, long var3, long var5);

    public static void q(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rJ;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedRenderbufferStorageEXT(n2, n3, n4, n5, l2);
    }

    static native void nglNamedRenderbufferStorageEXT(int var0, int var1, int var2, int var3, long var4);

    public static void k(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetNamedRenderbufferParameterivEXT(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetNamedRenderbufferParameterivEXT(int var0, int var1, long var2, long var4);

    public static int p(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rK;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetNamedRenderbufferParameterivEXT(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rL;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedRenderbufferStorageMultisampleEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglNamedRenderbufferStorageMultisampleEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rM;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedRenderbufferStorageMultisampleCoverageEXT(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglNamedRenderbufferStorageMultisampleCoverageEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static int q(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rN;
        org.lwjgl.a.a(l2);
        int n4 = EXTDirectStateAccess.nglCheckNamedFramebufferStatusEXT(n2, n3, l2);
        return n4;
    }

    static native int nglCheckNamedFramebufferStatusEXT(int var0, int var1, long var2);

    public static void d(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rO;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedFramebufferTexture1DEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglNamedFramebufferTexture1DEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void e(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rP;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedFramebufferTexture2DEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglNamedFramebufferTexture2DEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rQ;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedFramebufferTexture3DEXT(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglNamedFramebufferTexture3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void r(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rR;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedFramebufferRenderbufferEXT(n2, n3, n4, n5, l2);
    }

    static native void nglNamedFramebufferRenderbufferEXT(int var0, int var1, int var2, int var3, long var4);

    public static void z(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetNamedFramebufferAttachmentParameterivEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetNamedFramebufferAttachmentParameterivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int n(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rS;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetNamedFramebufferAttachmentParameterivEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void r(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rT;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglGenerateTextureMipmapEXT(n2, n3, l2);
    }

    static native void nglGenerateTextureMipmapEXT(int var0, int var1, long var2);

    public static void s(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rU;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglGenerateMultiTexMipmapEXT(n2, n3, l2);
    }

    static native void nglGenerateMultiTexMipmapEXT(int var0, int var1, long var2);

    public static void t(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rV;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglFramebufferDrawBufferEXT(n2, n3, l2);
    }

    static native void nglFramebufferDrawBufferEXT(int var0, int var1, long var2);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTDirectStateAccess.nglFramebufferDrawBuffersEXT(n2, intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglFramebufferDrawBuffersEXT(int var0, int var1, long var2, long var4);

    public static void u(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rX;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglFramebufferReadBufferEXT(n2, n3, l2);
    }

    static native void nglFramebufferReadBufferEXT(int var0, int var1, long var2);

    public static void l(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTDirectStateAccess.nglGetFramebufferParameterivEXT(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetFramebufferParameterivEXT(int var0, int var1, long var2, long var4);

    public static int v(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.rY;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetFramebufferParameterivEXT(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.rZ;
        org.lwjgl.a.a(l5);
        EXTDirectStateAccess.nglNamedCopyBufferSubDataEXT(n2, n3, l2, l3, l4, l5);
    }

    static native void nglNamedCopyBufferSubDataEXT(int var0, int var1, long var2, long var4, long var6, long var8);

    public static void s(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sa;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedFramebufferTextureEXT(n2, n3, n4, n5, l2);
    }

    static native void nglNamedFramebufferTextureEXT(int var0, int var1, int var2, int var3, long var4);

    public static void f(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sb;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedFramebufferTextureLayerEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglNamedFramebufferTextureLayerEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void g(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sc;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglNamedFramebufferTextureFaceEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglNamedFramebufferTextureFaceEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void o(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sd;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglTextureRenderbufferEXT(n2, n3, n4, l2);
    }

    static native void nglTextureRenderbufferEXT(int var0, int var1, int var2, long var3);

    public static void p(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.se;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglMultiTexRenderbufferEXT(n2, n3, n4, l2);
    }

    static native void nglMultiTexRenderbufferEXT(int var0, int var1, int var2, long var3);

    public static void c(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sf;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayVertexOffsetEXT(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglVertexArrayVertexOffsetEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void d(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sg;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayColorOffsetEXT(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglVertexArrayColorOffsetEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void c(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sh;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayEdgeFlagOffsetEXT(n2, n3, n4, l2, l3);
    }

    static native void nglVertexArrayEdgeFlagOffsetEXT(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.si;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayIndexOffsetEXT(n2, n3, n4, n5, l2, l3);
    }

    static native void nglVertexArrayIndexOffsetEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void c(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sj;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayNormalOffsetEXT(n2, n3, n4, n5, l2, l3);
    }

    static native void nglVertexArrayNormalOffsetEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void e(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sk;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayTexCoordOffsetEXT(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglVertexArrayTexCoordOffsetEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sl;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayMultiTexCoordOffsetEXT(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglVertexArrayMultiTexCoordOffsetEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void d(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sm;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayFogCoordOffsetEXT(n2, n3, n4, n5, l2, l3);
    }

    static native void nglVertexArrayFogCoordOffsetEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void f(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sn;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArraySecondaryColorOffsetEXT(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglVertexArraySecondaryColorOffsetEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, boolean bl2, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.so;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayVertexAttribOffsetEXT(n2, n3, n4, n5, n6, bl2, n7, l2, l3);
    }

    static native void nglVertexArrayVertexAttribOffsetEXT(int var0, int var1, int var2, int var3, int var4, boolean var5, int var6, long var7, long var9);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sp;
        org.lwjgl.a.a(l3);
        EXTDirectStateAccess.nglVertexArrayVertexAttribIOffsetEXT(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglVertexArrayVertexAttribIOffsetEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void w(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sq;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglEnableVertexArrayEXT(n2, n3, l2);
    }

    static native void nglEnableVertexArrayEXT(int var0, int var1, long var2);

    public static void x(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sr;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglDisableVertexArrayEXT(n2, n3, l2);
    }

    static native void nglDisableVertexArrayEXT(int var0, int var1, long var2);

    public static void y(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ss;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglEnableVertexArrayAttribEXT(n2, n3, l2);
    }

    static native void nglEnableVertexArrayAttribEXT(int var0, int var1, long var2);

    public static void z(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.st;
        org.lwjgl.a.a(l2);
        EXTDirectStateAccess.nglDisableVertexArrayAttribEXT(n2, n3, l2);
    }

    static native void nglDisableVertexArrayAttribEXT(int var0, int var1, long var2);

    public static void m(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.su;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 16);
        EXTDirectStateAccess.nglGetVertexArrayIntegervEXT(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetVertexArrayIntegervEXT(int var0, int var1, long var2, long var4);

    public static int A(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.su;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetVertexArrayIntegervEXT(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static ByteBuffer c(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sv;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = EXTDirectStateAccess.nglGetVertexArrayPointervEXT(n2, n3, l2, l3);
        return d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetVertexArrayPointervEXT(int var0, int var1, long var2, long var4);

    public static void A(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 16);
        EXTDirectStateAccess.nglGetVertexArrayIntegeri_vEXT(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetVertexArrayIntegeri_vEXT(int var0, int var1, int var2, long var3, long var5);

    public static int q(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sw;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDirectStateAccess.nglGetVertexArrayIntegeri_vEXT(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static ByteBuffer d(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sx;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = EXTDirectStateAccess.nglGetVertexArrayPointeri_vEXT(n2, n3, n4, l2, l3);
        return d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetVertexArrayPointeri_vEXT(int var0, int var1, int var2, long var3, long var5);

    public static ByteBuffer a(int n2, long l2, long l3, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l4 = dt2.sy;
        org.lwjgl.a.a(l4);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = EXTDirectStateAccess.nglMapNamedBufferRangeEXT(n2, l2, l3, n3, byteBuffer, l4);
        return d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapNamedBufferRangeEXT(int var0, long var1, long var3, int var5, ByteBuffer var6, long var7);

    public static void a(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.sz;
        org.lwjgl.a.a(l4);
        EXTDirectStateAccess.nglFlushMappedNamedBufferRangeEXT(n2, l2, l3, l4);
    }

    static native void nglFlushMappedNamedBufferRangeEXT(int var0, long var1, long var3, long var5);
}

