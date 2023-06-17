/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ATIVertexStreams {
    public static final int a = 34667;
    public static final int b = 34668;
    public static final int c = 34669;
    public static final int d = 34670;
    public static final int e = 34671;
    public static final int f = 34672;
    public static final int g = 34673;
    public static final int h = 34674;
    public static final int i = 34675;
    public static final int j = 34676;

    private ATIVertexStreams() {
    }

    public static void a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nR;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream2fATI(n2, f2, f3, l2);
    }

    static native void nglVertexStream2fATI(int var0, float var1, float var2, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nS;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream2dATI(n2, d2, d3, l2);
    }

    static native void nglVertexStream2dATI(int var0, double var1, double var3, long var5);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nT;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream2iATI(n2, n3, n4, l2);
    }

    static native void nglVertexStream2iATI(int var0, int var1, int var2, long var3);

    public static void a(int n2, short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nU;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream2sATI(n2, s2, s3, l2);
    }

    static native void nglVertexStream2sATI(int var0, short var1, short var2, long var3);

    public static void a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nV;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream3fATI(n2, f2, f3, f4, l2);
    }

    static native void nglVertexStream3fATI(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nW;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream3dATI(n2, d2, d3, d4, l2);
    }

    static native void nglVertexStream3dATI(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nX;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream3iATI(n2, n3, n4, n5, l2);
    }

    static native void nglVertexStream3iATI(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nY;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream3sATI(n2, s2, s3, s4, l2);
    }

    static native void nglVertexStream3sATI(int var0, short var1, short var2, short var3, long var4);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nZ;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream4fATI(n2, f2, f3, f4, f5, l2);
    }

    static native void nglVertexStream4fATI(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oa;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream4dATI(n2, d2, d3, d4, d5, l2);
    }

    static native void nglVertexStream4dATI(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ob;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream4iATI(n2, n3, n4, n5, n6, l2);
    }

    static native void nglVertexStream4iATI(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oc;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexStream4sATI(n2, s2, s3, s4, s5, l2);
    }

    static native void nglVertexStream4sATI(int var0, short var1, short var2, short var3, short var4, long var5);

    public static void a(int n2, byte by2, byte by3, byte by4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.od;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglNormalStream3bATI(n2, by2, by3, by4, l2);
    }

    static native void nglNormalStream3bATI(int var0, byte var1, byte var2, byte var3, long var4);

    public static void b(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oe;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglNormalStream3fATI(n2, f2, f3, f4, l2);
    }

    static native void nglNormalStream3fATI(int var0, float var1, float var2, float var3, long var4);

    public static void b(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.of;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglNormalStream3dATI(n2, d2, d3, d4, l2);
    }

    static native void nglNormalStream3dATI(int var0, double var1, double var3, double var5, long var7);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.og;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglNormalStream3iATI(n2, n3, n4, n5, l2);
    }

    static native void nglNormalStream3iATI(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oh;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglNormalStream3sATI(n2, s2, s3, s4, l2);
    }

    static native void nglNormalStream3sATI(int var0, short var1, short var2, short var3, long var4);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oi;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglClientActiveVertexStreamATI(n2, l2);
    }

    static native void nglClientActiveVertexStreamATI(int var0, long var1);

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oj;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexBlendEnvfATI(n2, f2, l2);
    }

    static native void nglVertexBlendEnvfATI(int var0, float var1, long var2);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ok;
        org.lwjgl.a.a(l2);
        ATIVertexStreams.nglVertexBlendEnviATI(n2, n3, l2);
    }

    static native void nglVertexBlendEnviATI(int var0, int var1, long var2);
}

