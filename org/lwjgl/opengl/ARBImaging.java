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
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;

public final class ARBImaging {
    public static final int a = 32773;
    public static final int b = 32774;
    public static final int c = 32775;
    public static final int d = 32776;
    public static final int e = 32777;
    public static final int f = 32778;
    public static final int g = 32779;
    public static final int h = 32945;
    public static final int i = 32946;
    public static final int j = 32947;
    public static final int k = 32948;
    public static final int l = 32949;
    public static final int m = 32950;
    public static final int n = 32951;
    public static final int o = 32952;
    public static final int p = 32953;
    public static final int q = 32954;
    public static final int r = 32955;
    public static final int s = 32976;
    public static final int t = 32977;
    public static final int u = 32978;
    public static final int v = 32979;
    public static final int w = 32980;
    public static final int x = 32981;
    public static final int y = 32982;
    public static final int z = 32983;
    public static final int A = 32984;
    public static final int B = 32985;
    public static final int C = 32986;
    public static final int D = 32987;
    public static final int E = 32988;
    public static final int F = 32989;
    public static final int G = 32990;
    public static final int H = 32991;
    public static final int I = 32784;
    public static final int J = 32785;
    public static final int K = 32786;
    public static final int L = 32787;
    public static final int M = 32788;
    public static final int N = 32789;
    public static final int O = 32790;
    public static final int P = 32791;
    public static final int Q = 32792;
    public static final int R = 32793;
    public static final int S = 32794;
    public static final int T = 32795;
    public static final int U = 32796;
    public static final int V = 32797;
    public static final int W = 32798;
    public static final int X = 32799;
    public static final int Y = 32800;
    public static final int Z = 32801;
    public static final int aa = 32802;
    public static final int ab = 32803;
    public static final int ac = 33104;
    public static final int ad = 33105;
    public static final int ae = 33107;
    public static final int af = 33108;
    public static final int ag = 32804;
    public static final int ah = 32805;
    public static final int ai = 32806;
    public static final int aj = 32807;
    public static final int ak = 32808;
    public static final int al = 32809;
    public static final int am = 32810;
    public static final int an = 32811;
    public static final int ao = 32812;
    public static final int ap = 32813;
    public static final int aq = 32814;
    public static final int ar = 32815;
    public static final int as = 32816;
    public static final int at = 32817;

    private ARBImaging() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iT;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, 256);
        ARBImaging.nglColorTable(n2, n3, n4, n5, n6, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iT;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, 256);
        ARBImaging.nglColorTable(n2, n3, n4, n5, n6, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iT;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, 256);
        ARBImaging.nglColorTable(n2, n3, n4, n5, n6, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglColorTable(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.iT;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBImaging.nglColorTableBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglColorTableBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void b(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iU;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, 256);
        ARBImaging.nglColorSubTable(n2, n3, n4, n5, n6, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iU;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, 256);
        ARBImaging.nglColorSubTable(n2, n3, n4, n5, n6, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iU;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, 256);
        ARBImaging.nglColorSubTable(n2, n3, n4, n5, n6, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglColorSubTable(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void b(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.iU;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBImaging.nglColorSubTableBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglColorSubTableBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ARBImaging.nglColorTableParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglColorTableParameteriv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ARBImaging.nglColorTableParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglColorTableParameterfv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iX;
        org.lwjgl.a.a(l2);
        ARBImaging.nglCopyColorSubTable(n2, n3, n4, n5, n6, l2);
    }

    static native void nglCopyColorSubTable(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iY;
        org.lwjgl.a.a(l2);
        ARBImaging.nglCopyColorTable(n2, n3, n4, n5, n6, l2);
    }

    static native void nglCopyColorTable(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 256);
        ARBImaging.nglGetColorTable(n2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 256);
        ARBImaging.nglGetColorTable(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 256);
        ARBImaging.nglGetColorTable(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetColorTable(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ja;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ARBImaging.nglGetColorTableParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetColorTableParameteriv(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ARBImaging.nglGetColorTableParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetColorTableParameterfv(int var0, int var1, long var2, long var4);

    public static void a(int n2) {
        GL14.a(n2);
    }

    public static void a(float f2, float f3, float f4, float f5) {
        GL14.a(f2, f3, f4, f5);
    }

    public static void a(int n2, int n3, int n4, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jc;
        org.lwjgl.a.a(l2);
        ARBImaging.nglHistogram(n2, n3, n4, bl2, l2);
    }

    static native void nglHistogram(int var0, int var1, int var2, boolean var3, long var4);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jd;
        org.lwjgl.a.a(l2);
        ARBImaging.nglResetHistogram(n2, l2);
    }

    static native void nglResetHistogram(int var0, long var1);

    public static void a(int n2, boolean bl2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.je;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer, 256);
        ARBImaging.nglGetHistogram(n2, bl2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.je;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer, 256);
        ARBImaging.nglGetHistogram(n2, bl2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.je;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer, 256);
        ARBImaging.nglGetHistogram(n2, bl2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.je;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(intBuffer, 256);
        ARBImaging.nglGetHistogram(n2, bl2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.je;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer, 256);
        ARBImaging.nglGetHistogram(n2, bl2, n3, n4, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetHistogram(int var0, boolean var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, boolean bl2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.je;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBImaging.nglGetHistogramBO(n2, bl2, n3, n4, l2, l3);
    }

    static native void nglGetHistogramBO(int var0, boolean var1, int var2, int var3, long var4, long var6);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 256);
        ARBImaging.nglGetHistogramParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetHistogramParameterfv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 256);
        ARBImaging.nglGetHistogramParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetHistogramParameteriv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jh;
        org.lwjgl.a.a(l2);
        ARBImaging.nglMinmax(n2, n3, bl2, l2);
    }

    static native void nglMinmax(int var0, int var1, boolean var2, long var3);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ji;
        org.lwjgl.a.a(l2);
        ARBImaging.nglResetMinmax(n2, l2);
    }

    static native void nglResetMinmax(int var0, long var1);

    public static void b(int n2, boolean bl2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jj;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer, 4);
        ARBImaging.nglGetMinmax(n2, bl2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, boolean bl2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jj;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer, 4);
        ARBImaging.nglGetMinmax(n2, bl2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, boolean bl2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jj;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer, 4);
        ARBImaging.nglGetMinmax(n2, bl2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, boolean bl2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jj;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(intBuffer, 4);
        ARBImaging.nglGetMinmax(n2, bl2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, boolean bl2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jj;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer, 4);
        ARBImaging.nglGetMinmax(n2, bl2, n3, n4, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetMinmax(int var0, boolean var1, int var2, int var3, long var4, long var6);

    public static void b(int n2, boolean bl2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.jj;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBImaging.nglGetMinmaxBO(n2, bl2, n3, n4, l2, l3);
    }

    static native void nglGetMinmaxBO(int var0, boolean var1, int var2, int var3, long var4, long var6);

    public static void d(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ARBImaging.nglGetMinmaxParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetMinmaxParameterfv(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ARBImaging.nglGetMinmaxParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetMinmaxParameteriv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jm;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n5, n6, n4, 1, 1));
        ARBImaging.nglConvolutionFilter1D(n2, n3, n4, n5, n6, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jm;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n5, n6, n4, 1, 1));
        ARBImaging.nglConvolutionFilter1D(n2, n3, n4, n5, n6, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jm;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n5, n6, n4, 1, 1));
        ARBImaging.nglConvolutionFilter1D(n2, n3, n4, n5, n6, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jm;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n5, n6, n4, 1, 1));
        ARBImaging.nglConvolutionFilter1D(n2, n3, n4, n5, n6, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jm;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n5, n6, n4, 1, 1));
        ARBImaging.nglConvolutionFilter1D(n2, n3, n4, n5, n6, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglConvolutionFilter1D(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void c(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.jm;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBImaging.nglConvolutionFilter1DBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglConvolutionFilter1DBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jn;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n6, n7, n4, n5, 1));
        ARBImaging.nglConvolutionFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jn;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n6, n7, n4, n5, 1));
        ARBImaging.nglConvolutionFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jn;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n6, n7, n4, n5, 1));
        ARBImaging.nglConvolutionFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglConvolutionFilter2D(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.jn;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBImaging.nglConvolutionFilter2DBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglConvolutionFilter2DBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jo;
        org.lwjgl.a.a(l2);
        ARBImaging.nglConvolutionParameterf(n2, n3, f2, l2);
    }

    static native void nglConvolutionParameterf(int var0, int var1, float var2, long var3);

    public static void e(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ARBImaging.nglConvolutionParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglConvolutionParameterfv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jq;
        org.lwjgl.a.a(l2);
        ARBImaging.nglConvolutionParameteri(n2, n3, n4, l2);
    }

    static native void nglConvolutionParameteri(int var0, int var1, int var2, long var3);

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ARBImaging.nglConvolutionParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglConvolutionParameteriv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.js;
        org.lwjgl.a.a(l2);
        ARBImaging.nglCopyConvolutionFilter1D(n2, n3, n4, n5, n6, l2);
    }

    static native void nglCopyConvolutionFilter1D(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jt;
        org.lwjgl.a.a(l2);
        ARBImaging.nglCopyConvolutionFilter2D(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglCopyConvolutionFilter2D(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void b(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ju;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetConvolutionFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ju;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetConvolutionFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ju;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        ARBImaging.nglGetConvolutionFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ju;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetConvolutionFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ju;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetConvolutionFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetConvolutionFilter(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ju;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBImaging.nglGetConvolutionFilterBO(n2, n3, n4, l2, l3);
    }

    static native void nglGetConvolutionFilterBO(int var0, int var1, int var2, long var3, long var5);

    public static void f(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ARBImaging.nglGetConvolutionParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetConvolutionParameterfv(int var0, int var1, long var2, long var4);

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ARBImaging.nglGetConvolutionParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetConvolutionParameteriv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jx;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBImaging.nglSeparableFilter2D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), l2);
    }

    static native void nglSeparableFilter2D(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.jx;
        org.lwjgl.a.a(l4);
        ft.j(dt2);
        ARBImaging.nglSeparableFilter2DBO(n2, n3, n4, n5, n6, n7, l2, l3, l4);
    }

    static native void nglSeparableFilter2DBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8, long var10);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.b(byteBuffer3);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), org.lwjgl.o.a(byteBuffer3), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, DoubleBuffer doubleBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.a(doubleBuffer3);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), org.lwjgl.o.a(doubleBuffer3), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.b(intBuffer3);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(intBuffer3), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.a(shortBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.b(byteBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.a(doubleBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.b(intBuffer);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, ShortBuffer shortBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jy;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.a(shortBuffer3);
        ARBImaging.nglGetSeparableFilter(n2, n3, n4, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.a(shortBuffer2), org.lwjgl.o.a(shortBuffer3), l2);
    }

    static native void nglGetSeparableFilter(int var0, int var1, int var2, long var3, long var5, long var7, long var9);

    public static void a(int n2, int n3, int n4, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.jy;
        org.lwjgl.a.a(l5);
        ft.h(dt2);
        ARBImaging.nglGetSeparableFilterBO(n2, n3, n4, l2, l3, l4, l5);
    }

    static native void nglGetSeparableFilterBO(int var0, int var1, int var2, long var3, long var5, long var7, long var9);
}

