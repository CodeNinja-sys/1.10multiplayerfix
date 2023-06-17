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
import org.lwjgl.opengl.is;

public final class GL13 {
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
    public static final int J = 34065;
    public static final int K = 34066;
    public static final int L = 34067;
    public static final int M = 34068;
    public static final int N = 34069;
    public static final int O = 34070;
    public static final int P = 34071;
    public static final int Q = 34072;
    public static final int R = 34073;
    public static final int S = 34074;
    public static final int T = 34075;
    public static final int U = 34076;
    public static final int V = 34025;
    public static final int W = 34026;
    public static final int X = 34027;
    public static final int Y = 34028;
    public static final int Z = 34029;
    public static final int aa = 34030;
    public static final int ab = 34031;
    public static final int ac = 34464;
    public static final int ad = 34465;
    public static final int ae = 34466;
    public static final int af = 34467;
    public static final int ag = 32925;
    public static final int ah = 32926;
    public static final int ai = 32927;
    public static final int aj = 32928;
    public static final int ak = 32936;
    public static final int al = 32937;
    public static final int am = 32938;
    public static final int an = 32939;
    public static final int ao = 0x20000000;
    public static final int ap = 34019;
    public static final int aq = 34020;
    public static final int ar = 34021;
    public static final int as = 34022;
    public static final int at = 34160;
    public static final int au = 34161;
    public static final int av = 34162;
    public static final int aw = 34176;
    public static final int ax = 34177;
    public static final int ay = 34178;
    public static final int az = 34184;
    public static final int aA = 34185;
    public static final int aB = 34186;
    public static final int aC = 34192;
    public static final int aD = 34193;
    public static final int aE = 34194;
    public static final int aF = 34200;
    public static final int aG = 34201;
    public static final int aH = 34202;
    public static final int aI = 34163;
    public static final int aJ = 34164;
    public static final int aK = 34165;
    public static final int aL = 34023;
    public static final int aM = 34166;
    public static final int aN = 34167;
    public static final int aO = 34168;
    public static final int aP = 34478;
    public static final int aQ = 34479;
    public static final int aR = 33069;

    private GL13() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Af;
        org.lwjgl.a.a(l2);
        GL13.nglActiveTexture(n2, l2);
    }

    static native void nglActiveTexture(int var0, long var1);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ag;
        org.lwjgl.a.a(l2);
        is.b((dt)dt2).e = n2 - 33984;
        GL13.nglClientActiveTexture(n2, l2);
    }

    static native void nglClientActiveTexture(int var0, long var1);

    public static void a(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ah;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL13.nglCompressedTexImage1D(n2, n3, n4, n5, n6, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexImage1D(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ah;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL13.nglCompressedTexImage1DBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglCompressedTexImage1DBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ah;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        GL13.nglCompressedTexImage1D(n2, n3, n4, n5, n6, n7, 0L, l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ai;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL13.nglCompressedTexImage2D(n2, n3, n4, n5, n6, n7, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ai;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL13.nglCompressedTexImage2DBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglCompressedTexImage2DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ai;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        GL13.nglCompressedTexImage2D(n2, n3, n4, n5, n6, n7, n8, 0L, l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Aj;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL13.nglCompressedTexImage3D(n2, n3, n4, n5, n6, n7, n8, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Aj;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL13.nglCompressedTexImage3DBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglCompressedTexImage3DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Aj;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        GL13.nglCompressedTexImage3D(n2, n3, n4, n5, n6, n7, n8, n9, 0L, l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ak;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL13.nglCompressedTexSubImage1D(n2, n3, n4, n5, n6, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexSubImage1D(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ak;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL13.nglCompressedTexSubImage1DBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglCompressedTexSubImage1DBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Al;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL13.nglCompressedTexSubImage2D(n2, n3, n4, n5, n6, n7, n8, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Al;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL13.nglCompressedTexSubImage2DBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglCompressedTexSubImage2DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Am;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL13.nglCompressedTexSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Am;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL13.nglCompressedTexSubImage3DBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2, l3);
    }

    static native void nglCompressedTexSubImage3DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.An;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL13.nglGetCompressedTexImage(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.An;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        GL13.nglGetCompressedTexImage(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.An;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL13.nglGetCompressedTexImage(n2, n3, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetCompressedTexImage(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.An;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        GL13.nglGetCompressedTexImageBO(n2, n3, l2, l3);
    }

    static native void nglGetCompressedTexImageBO(int var0, int var1, long var2, long var4);

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ao;
        org.lwjgl.a.a(l2);
        GL13.nglMultiTexCoord1f(n2, f2, l2);
    }

    static native void nglMultiTexCoord1f(int var0, float var1, long var2);

    public static void a(int n2, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ap;
        org.lwjgl.a.a(l2);
        GL13.nglMultiTexCoord1d(n2, d2, l2);
    }

    static native void nglMultiTexCoord1d(int var0, double var1, long var3);

    public static void a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Aq;
        org.lwjgl.a.a(l2);
        GL13.nglMultiTexCoord2f(n2, f2, f3, l2);
    }

    static native void nglMultiTexCoord2f(int var0, float var1, float var2, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ar;
        org.lwjgl.a.a(l2);
        GL13.nglMultiTexCoord2d(n2, d2, d3, l2);
    }

    static native void nglMultiTexCoord2d(int var0, double var1, double var3, long var5);

    public static void a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.As;
        org.lwjgl.a.a(l2);
        GL13.nglMultiTexCoord3f(n2, f2, f3, f4, l2);
    }

    static native void nglMultiTexCoord3f(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.At;
        org.lwjgl.a.a(l2);
        GL13.nglMultiTexCoord3d(n2, d2, d3, d4, l2);
    }

    static native void nglMultiTexCoord3d(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Au;
        org.lwjgl.a.a(l2);
        GL13.nglMultiTexCoord4f(n2, f2, f3, f4, f5, l2);
    }

    static native void nglMultiTexCoord4f(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Av;
        org.lwjgl.a.a(l2);
        GL13.nglMultiTexCoord4d(n2, d2, d3, d4, d5, l2);
    }

    static native void nglMultiTexCoord4d(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Aw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        GL13.nglLoadTransposeMatrixf(org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglLoadTransposeMatrixf(long var0, long var2);

    public static void a(DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ax;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        GL13.nglLoadTransposeMatrixd(org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglLoadTransposeMatrixd(long var0, long var2);

    public static void b(FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ay;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        GL13.nglMultTransposeMatrixf(org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglMultTransposeMatrixf(long var0, long var2);

    public static void b(DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Az;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        GL13.nglMultTransposeMatrixd(org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglMultTransposeMatrixd(long var0, long var2);

    public static void a(float f2, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AA;
        org.lwjgl.a.a(l2);
        GL13.nglSampleCoverage(f2, bl2, l2);
    }

    static native void nglSampleCoverage(float var0, boolean var1, long var2);
}

