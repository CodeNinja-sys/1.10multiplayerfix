/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBMultitexture {
    public static final int a = 33984;
    public static final int b = 33985;
    public static final int c = 33986;
    public static final int d = 33987;
    public static final int e = 33988;
    public static final int f = 33989;
    public static final int g = 33990;
    public static final int h = 33991;
    public static final int i = 33992;
    public static final int j = 33993;
    public static final int k = 33994;
    public static final int l = 33995;
    public static final int m = 33996;
    public static final int n = 33997;
    public static final int o = 33998;
    public static final int p = 33999;
    public static final int q = 34000;
    public static final int r = 34001;
    public static final int s = 34002;
    public static final int t = 34003;
    public static final int u = 34004;
    public static final int v = 34005;
    public static final int w = 34006;
    public static final int x = 34007;
    public static final int y = 34008;
    public static final int z = 34009;
    public static final int A = 34010;
    public static final int B = 34011;
    public static final int C = 34012;
    public static final int D = 34013;
    public static final int E = 34014;
    public static final int F = 34015;
    public static final int G = 34016;
    public static final int H = 34017;
    public static final int I = 34018;

    private ARBMultitexture() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jI;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglClientActiveTextureARB(n2, l2);
    }

    static native void nglClientActiveTextureARB(int var0, long var1);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jJ;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglActiveTextureARB(n2, l2);
    }

    static native void nglActiveTextureARB(int var0, long var1);

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jK;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord1fARB(n2, f2, l2);
    }

    static native void nglMultiTexCoord1fARB(int var0, float var1, long var2);

    public static void a(int n2, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jL;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord1dARB(n2, d2, l2);
    }

    static native void nglMultiTexCoord1dARB(int var0, double var1, long var3);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jM;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord1iARB(n2, n3, l2);
    }

    static native void nglMultiTexCoord1iARB(int var0, int var1, long var2);

    public static void a(int n2, short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jN;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord1sARB(n2, s2, l2);
    }

    static native void nglMultiTexCoord1sARB(int var0, short var1, long var2);

    public static void a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jO;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord2fARB(n2, f2, f3, l2);
    }

    static native void nglMultiTexCoord2fARB(int var0, float var1, float var2, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jP;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord2dARB(n2, d2, d3, l2);
    }

    static native void nglMultiTexCoord2dARB(int var0, double var1, double var3, long var5);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jQ;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord2iARB(n2, n3, n4, l2);
    }

    static native void nglMultiTexCoord2iARB(int var0, int var1, int var2, long var3);

    public static void a(int n2, short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jR;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord2sARB(n2, s2, s3, l2);
    }

    static native void nglMultiTexCoord2sARB(int var0, short var1, short var2, long var3);

    public static void a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jS;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord3fARB(n2, f2, f3, f4, l2);
    }

    static native void nglMultiTexCoord3fARB(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jT;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord3dARB(n2, d2, d3, d4, l2);
    }

    static native void nglMultiTexCoord3dARB(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jU;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord3iARB(n2, n3, n4, n5, l2);
    }

    static native void nglMultiTexCoord3iARB(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jV;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord3sARB(n2, s2, s3, s4, l2);
    }

    static native void nglMultiTexCoord3sARB(int var0, short var1, short var2, short var3, long var4);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jW;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord4fARB(n2, f2, f3, f4, f5, l2);
    }

    static native void nglMultiTexCoord4fARB(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jX;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord4dARB(n2, d2, d3, d4, d5, l2);
    }

    static native void nglMultiTexCoord4dARB(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jY;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord4iARB(n2, n3, n4, n5, n6, l2);
    }

    static native void nglMultiTexCoord4iARB(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jZ;
        org.lwjgl.a.a(l2);
        ARBMultitexture.nglMultiTexCoord4sARB(n2, s2, s3, s4, s5, l2);
    }

    static native void nglMultiTexCoord4sARB(int var0, short var1, short var2, short var3, short var4, long var5);
}

