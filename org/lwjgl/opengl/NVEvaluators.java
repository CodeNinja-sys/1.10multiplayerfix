/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVEvaluators {
    public static final int a = 34496;
    public static final int b = 34497;
    public static final int c = 34498;
    public static final int d = 34499;
    public static final int e = 34500;
    public static final int f = 34501;
    public static final int g = 34502;
    public static final int h = 34503;
    public static final int i = 34504;
    public static final int j = 34505;
    public static final int k = 34506;
    public static final int l = 34507;
    public static final int m = 34508;
    public static final int n = 34509;
    public static final int o = 34510;
    public static final int p = 34511;
    public static final int q = 34512;
    public static final int r = 34513;
    public static final int s = 34514;
    public static final int t = 34515;
    public static final int u = 34516;
    public static final int v = 34517;
    public static final int w = 34518;
    public static final int x = 34519;

    private NVEvaluators() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVEvaluators.nglGetMapControlPointsNV(n2, n3, n4, n5, n6, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetMapControlPointsNV(int var0, int var1, int var2, int var3, int var4, boolean var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVEvaluators.nglMapControlPointsNV(n2, n3, n4, n5, n6, n7, n8, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglMapControlPointsNV(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, long var8, long var10);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.My;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVEvaluators.nglMapParameterfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglMapParameterfvNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVEvaluators.nglMapParameterivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglMapParameterivNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVEvaluators.nglGetMapParameterfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetMapParameterfvNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVEvaluators.nglGetMapParameterivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetMapParameterivNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVEvaluators.nglGetMapAttribParameterfvNV(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetMapAttribParameterfvNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVEvaluators.nglGetMapAttribParameterivNV(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetMapAttribParameterivNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ME;
        org.lwjgl.a.a(l2);
        NVEvaluators.nglEvalMapsNV(n2, n3, l2);
    }

    static native void nglEvalMapsNV(int var0, int var1, long var2);
}

