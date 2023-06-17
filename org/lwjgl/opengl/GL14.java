/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.is;

public final class GL14 {
    public static final int a = 33169;
    public static final int b = 33170;
    public static final int c = 33189;
    public static final int d = 33190;
    public static final int e = 33191;
    public static final int f = 34890;
    public static final int g = 34891;
    public static final int h = 34892;
    public static final int i = 34893;
    public static final int j = 34894;
    public static final int k = 33872;
    public static final int l = 33873;
    public static final int m = 33874;
    public static final int n = 33875;
    public static final int o = 33876;
    public static final int p = 33877;
    public static final int q = 33878;
    public static final int r = 33879;
    public static final int s = 33062;
    public static final int t = 33063;
    public static final int u = 33064;
    public static final int v = 33065;
    public static final int w = 33880;
    public static final int x = 33881;
    public static final int y = 33882;
    public static final int z = 33883;
    public static final int A = 33884;
    public static final int B = 33885;
    public static final int C = 33886;
    public static final int D = 32968;
    public static final int E = 32969;
    public static final int F = 32970;
    public static final int G = 32971;
    public static final int H = 34055;
    public static final int I = 34056;
    public static final int J = 34048;
    public static final int K = 34049;
    public static final int L = 34045;
    public static final int M = 33648;
    public static final int N = 32773;
    public static final int O = 32777;
    public static final int P = 32774;
    public static final int Q = 32778;
    public static final int R = 32779;
    public static final int S = 32775;
    public static final int T = 32776;

    private GL14() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AB;
        org.lwjgl.a.a(l2);
        GL14.nglBlendEquation(n2, l2);
    }

    static native void nglBlendEquation(int var0, long var1);

    public static void a(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AC;
        org.lwjgl.a.a(l2);
        GL14.nglBlendColor(f2, f3, f4, f5, l2);
    }

    static native void nglBlendColor(float var0, float var1, float var2, float var3, long var4);

    public static void a(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AD;
        org.lwjgl.a.a(l2);
        GL14.nglFogCoordf(f2, l2);
    }

    static native void nglFogCoordf(float var0, long var1);

    public static void a(double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AE;
        org.lwjgl.a.a(l2);
        GL14.nglFogCoordd(d2, l2);
    }

    static native void nglFogCoordd(double var0, long var2);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AF;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).t = doubleBuffer;
        }
        GL14.nglFogCoordPointer(5130, n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AF;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).t = floatBuffer;
        }
        GL14.nglFogCoordPointer(5126, n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglFogCoordPointer(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.AF;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        GL14.nglFogCoordPointerBO(n2, n3, l2, l3);
    }

    static native void nglFogCoordPointerBO(int var0, int var1, long var2, long var4);

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(intBuffer2, intBuffer.remaining());
        GL14.nglMultiDrawArrays(n2, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), intBuffer.remaining(), l2);
    }

    static native void nglMultiDrawArrays(int var0, long var1, long var3, int var5, long var6);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AH;
        org.lwjgl.a.a(l2);
        GL14.nglPointParameteri(n2, n3, l2);
    }

    static native void nglPointParameteri(int var0, int var1, long var2);

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AI;
        org.lwjgl.a.a(l2);
        GL14.nglPointParameterf(n2, f2, l2);
    }

    static native void nglPointParameterf(int var0, float var1, long var2);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL14.nglPointParameteriv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglPointParameteriv(int var0, long var1, long var3);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL14.nglPointParameterfv(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglPointParameterfv(int var0, long var1, long var3);

    public static void a(byte by2, byte by3, byte by4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AL;
        org.lwjgl.a.a(l2);
        GL14.nglSecondaryColor3b(by2, by3, by4, l2);
    }

    static native void nglSecondaryColor3b(byte var0, byte var1, byte var2, long var3);

    public static void a(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AM;
        org.lwjgl.a.a(l2);
        GL14.nglSecondaryColor3f(f2, f3, f4, l2);
    }

    static native void nglSecondaryColor3f(float var0, float var1, float var2, long var3);

    public static void a(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AN;
        org.lwjgl.a.a(l2);
        GL14.nglSecondaryColor3d(d2, d3, d4, l2);
    }

    static native void nglSecondaryColor3d(double var0, double var2, double var4, long var6);

    public static void b(byte by2, byte by3, byte by4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AO;
        org.lwjgl.a.a(l2);
        GL14.nglSecondaryColor3ub(by2, by3, by4, l2);
    }

    static native void nglSecondaryColor3ub(byte var0, byte var1, byte var2, long var3);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AP;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        GL14.nglSecondaryColorPointer(n2, 5130, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AP;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        GL14.nglSecondaryColorPointer(n2, 5126, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AP;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL14.nglSecondaryColorPointer(n2, bl2 ? 5121 : 5120, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglSecondaryColorPointer(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.AP;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        GL14.nglSecondaryColorPointerBO(n2, n3, n4, l2, l3);
    }

    static native void nglSecondaryColorPointerBO(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AQ;
        org.lwjgl.a.a(l2);
        GL14.nglBlendFuncSeparate(n2, n3, n4, n5, l2);
    }

    static native void nglBlendFuncSeparate(int var0, int var1, int var2, int var3, long var4);

    public static void a(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AR;
        org.lwjgl.a.a(l2);
        GL14.nglWindowPos2f(f2, f3, l2);
    }

    static native void nglWindowPos2f(float var0, float var1, long var2);

    public static void a(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AS;
        org.lwjgl.a.a(l2);
        GL14.nglWindowPos2d(d2, d3, l2);
    }

    static native void nglWindowPos2d(double var0, double var2, long var4);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AT;
        org.lwjgl.a.a(l2);
        GL14.nglWindowPos2i(n2, n3, l2);
    }

    static native void nglWindowPos2i(int var0, int var1, long var2);

    public static void b(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AU;
        org.lwjgl.a.a(l2);
        GL14.nglWindowPos3f(f2, f3, f4, l2);
    }

    static native void nglWindowPos3f(float var0, float var1, float var2, long var3);

    public static void b(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AV;
        org.lwjgl.a.a(l2);
        GL14.nglWindowPos3d(d2, d3, d4, l2);
    }

    static native void nglWindowPos3d(double var0, double var2, double var4, long var6);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AW;
        org.lwjgl.a.a(l2);
        GL14.nglWindowPos3i(n2, n3, n4, l2);
    }

    static native void nglWindowPos3i(int var0, int var1, int var2, long var3);
}

