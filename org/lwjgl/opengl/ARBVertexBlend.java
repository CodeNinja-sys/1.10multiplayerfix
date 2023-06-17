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
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.is;

public final class ARBVertexBlend {
    public static final int a = 34468;
    public static final int b = 34469;
    public static final int c = 34470;
    public static final int d = 34471;
    public static final int e = 34472;
    public static final int f = 34473;
    public static final int g = 34474;
    public static final int h = 34475;
    public static final int i = 34476;
    public static final int j = 34477;
    public static final int k = 5888;
    public static final int l = 34058;
    public static final int m = 34594;
    public static final int n = 34595;
    public static final int o = 34596;
    public static final int p = 34597;
    public static final int q = 34598;
    public static final int r = 34599;
    public static final int s = 34600;
    public static final int t = 34601;
    public static final int u = 34602;
    public static final int v = 34603;
    public static final int w = 34604;
    public static final int x = 34605;
    public static final int y = 34606;
    public static final int z = 34607;
    public static final int A = 34608;
    public static final int B = 34609;
    public static final int C = 34610;
    public static final int D = 34611;
    public static final int E = 34612;
    public static final int F = 34613;
    public static final int G = 34614;
    public static final int H = 34615;
    public static final int I = 34616;
    public static final int J = 34617;
    public static final int K = 34618;
    public static final int L = 34619;
    public static final int M = 34620;
    public static final int N = 34621;
    public static final int O = 34622;
    public static final int P = 34623;

    private ARBVertexBlend() {
    }

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ml;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBVertexBlend.nglWeightbvARB(byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglWeightbvARB(int var0, long var1, long var3);

    public static void a(ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mm;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        ARBVertexBlend.nglWeightsvARB(shortBuffer.remaining(), org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglWeightsvARB(int var0, long var1, long var3);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBVertexBlend.nglWeightivARB(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglWeightivARB(int var0, long var1, long var3);

    public static void a(FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mo;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBVertexBlend.nglWeightfvARB(floatBuffer.remaining(), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglWeightfvARB(int var0, long var1, long var3);

    public static void a(DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBVertexBlend.nglWeightdvARB(doubleBuffer.remaining(), org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglWeightdvARB(int var0, long var1, long var3);

    public static void b(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBVertexBlend.nglWeightubvARB(byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglWeightubvARB(int var0, long var1, long var3);

    public static void b(ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        ARBVertexBlend.nglWeightusvARB(shortBuffer.remaining(), org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglWeightusvARB(int var0, long var1, long var3);

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ms;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBVertexBlend.nglWeightuivARB(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglWeightuivARB(int var0, long var1, long var3);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mt;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).k = doubleBuffer;
        }
        ARBVertexBlend.nglWeightPointerARB(n2, 5130, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mt;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).k = floatBuffer;
        }
        ARBVertexBlend.nglWeightPointerARB(n2, 5126, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mt;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).k = byteBuffer;
        }
        ARBVertexBlend.nglWeightPointerARB(n2, bl2 ? 5121 : 5120, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mt;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).k = intBuffer;
        }
        ARBVertexBlend.nglWeightPointerARB(n2, bl2 ? 5125 : 5124, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mt;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).k = shortBuffer;
        }
        ARBVertexBlend.nglWeightPointerARB(n2, bl2 ? 5123 : 5122, n3, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglWeightPointerARB(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.mt;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        ARBVertexBlend.nglWeightPointerARBBO(n2, n3, n4, l2, l3);
    }

    static native void nglWeightPointerARBBO(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mu;
        org.lwjgl.a.a(l2);
        ARBVertexBlend.nglVertexBlendARB(n2, l2);
    }

    static native void nglVertexBlendARB(int var0, long var1);
}

