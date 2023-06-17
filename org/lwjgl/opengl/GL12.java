/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;

public final class GL12 {
    public static final int a = 32874;
    public static final int b = 32875;
    public static final int c = 32876;
    public static final int d = 32877;
    public static final int e = 32878;
    public static final int f = 32879;
    public static final int g = 32880;
    public static final int h = 32881;
    public static final int i = 32882;
    public static final int j = 32883;
    public static final int k = 32992;
    public static final int l = 32993;
    public static final int m = 32818;
    public static final int n = 33634;
    public static final int o = 33635;
    public static final int p = 33636;
    public static final int q = 32819;
    public static final int r = 33637;
    public static final int s = 32820;
    public static final int t = 33638;
    public static final int u = 32821;
    public static final int v = 33639;
    public static final int w = 32822;
    public static final int x = 33640;
    public static final int y = 32826;
    public static final int z = 33272;
    public static final int A = 33273;
    public static final int B = 33274;
    public static final int C = 33071;
    public static final int D = 33082;
    public static final int E = 33083;
    public static final int F = 33084;
    public static final int G = 33085;
    public static final int H = 33000;
    public static final int I = 33001;
    public static final int J = 33901;
    public static final int K = 33902;
    public static final int L = 2834;
    public static final int M = 2835;
    public static final int N = 2850;
    public static final int O = 2851;

    private GL12() {
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ab;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL12.nglDrawRangeElements(n2, n3, n4, byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ab;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        GL12.nglDrawRangeElements(n2, n3, n4, intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ab;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL12.nglDrawRangeElements(n2, n3, n4, shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglDrawRangeElements(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ab;
        org.lwjgl.a.a(l3);
        ft.d(dt2);
        GL12.nglDrawRangeElementsBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglDrawRangeElementsBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ac;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, ft.b(byteBuffer, n9, n10, n5, n6, n7));
        }
        GL12.nglTexImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, org.lwjgl.o.b(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ac;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, ft.b(doubleBuffer, n9, n10, n5, n6, n7));
        }
        GL12.nglTexImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, org.lwjgl.o.b(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ac;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.b(floatBuffer, n9, n10, n5, n6, n7));
        }
        GL12.nglTexImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, org.lwjgl.o.b(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ac;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, ft.b(intBuffer, n9, n10, n5, n6, n7));
        }
        GL12.nglTexImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, org.lwjgl.o.b(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ac;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, ft.b(shortBuffer, n9, n10, n5, n6, n7));
        }
        GL12.nglTexImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, org.lwjgl.o.b(shortBuffer), l2);
    }

    static native void nglTexImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ac;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL12.nglTexImage3DBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglTexImage3DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ad;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n10, n11, n7, n8, n9));
        GL12.nglTexSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ad;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n10, n11, n7, n8, n9));
        GL12.nglTexSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ad;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n10, n11, n7, n8, n9));
        GL12.nglTexSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ad;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n10, n11, n7, n8, n9));
        GL12.nglTexSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ad;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n10, n11, n7, n8, n9));
        GL12.nglTexSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglTexSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ad;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL12.nglTexSubImage3DBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2, l3);
    }

    static native void nglTexSubImage3DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ae;
        org.lwjgl.a.a(l2);
        GL12.nglCopyTexSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2);
    }

    static native void nglCopyTexSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);
}

