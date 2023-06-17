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
import org.lwjgl.opengl.i;

public final class NVRegisterCombiners {
    public static final int a = 34082;
    public static final int b = 34128;
    public static final int c = 34129;
    public static final int d = 34130;
    public static final int e = 34131;
    public static final int f = 34132;
    public static final int g = 34133;
    public static final int h = 34134;
    public static final int i = 34135;
    public static final int j = 34083;
    public static final int k = 34084;
    public static final int l = 34085;
    public static final int m = 34086;
    public static final int n = 34087;
    public static final int o = 34088;
    public static final int p = 34089;
    public static final int q = 34090;
    public static final int r = 34091;
    public static final int s = 34092;
    public static final int t = 34093;
    public static final int u = 34094;
    public static final int v = 34095;
    public static final int w = 34102;
    public static final int x = 34103;
    public static final int y = 34104;
    public static final int z = 34105;
    public static final int A = 34106;
    public static final int B = 34107;
    public static final int C = 34108;
    public static final int D = 34109;
    public static final int E = 34097;
    public static final int F = 34098;
    public static final int G = 34110;
    public static final int H = 34111;
    public static final int I = 34112;
    public static final int J = 34113;
    public static final int K = 34096;
    public static final int L = 34114;
    public static final int M = 34115;
    public static final int N = 34116;
    public static final int O = 34117;
    public static final int P = 34118;
    public static final int Q = 34119;
    public static final int R = 34120;
    public static final int S = 34121;
    public static final int T = 34122;
    public static final int U = 34123;
    public static final int V = 34124;
    public static final int W = 34126;
    public static final int X = 34127;
    public static final int Y = 34125;

    private NVRegisterCombiners() {
    }

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PU;
        org.lwjgl.a.a(l2);
        NVRegisterCombiners.nglCombinerParameterfNV(n2, f2, l2);
    }

    static native void nglCombinerParameterfNV(int var0, float var1, long var2);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVRegisterCombiners.nglCombinerParameterfvNV(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglCombinerParameterfvNV(int var0, long var1, long var3);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PW;
        org.lwjgl.a.a(l2);
        NVRegisterCombiners.nglCombinerParameteriNV(n2, n3, l2);
    }

    static native void nglCombinerParameteriNV(int var0, int var1, long var2);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVRegisterCombiners.nglCombinerParameterivNV(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCombinerParameterivNV(int var0, long var1, long var3);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PY;
        org.lwjgl.a.a(l2);
        NVRegisterCombiners.nglCombinerInputNV(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglCombinerInputNV(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2, boolean bl3, boolean bl4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PZ;
        org.lwjgl.a.a(l2);
        NVRegisterCombiners.nglCombinerOutputNV(n2, n3, n4, n5, n6, n7, n8, bl2, bl3, bl4, l2);
    }

    static native void nglCombinerOutputNV(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8, boolean var9, long var10);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qa;
        org.lwjgl.a.a(l2);
        NVRegisterCombiners.nglFinalCombinerInputNV(n2, n3, n4, n5, l2);
    }

    static native void nglFinalCombinerInputNV(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVRegisterCombiners.nglGetCombinerInputParameterfvNV(n2, n3, n4, n5, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetCombinerInputParameterfvNV(int var0, int var1, int var2, int var3, long var4, long var6);

    public static float b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qb;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        NVRegisterCombiners.nglGetCombinerInputParameterfvNV(n2, n3, n4, n5, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVRegisterCombiners.nglGetCombinerInputParameterivNV(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetCombinerInputParameterivNV(int var0, int var1, int var2, int var3, long var4, long var6);

    public static int c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qc;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVRegisterCombiners.nglGetCombinerInputParameterivNV(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVRegisterCombiners.nglGetCombinerOutputParameterfvNV(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetCombinerOutputParameterfvNV(int var0, int var1, int var2, long var3, long var5);

    public static float a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qd;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        NVRegisterCombiners.nglGetCombinerOutputParameterfvNV(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qe;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVRegisterCombiners.nglGetCombinerOutputParameterivNV(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetCombinerOutputParameterivNV(int var0, int var1, int var2, long var3, long var5);

    public static int b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qe;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVRegisterCombiners.nglGetCombinerOutputParameterivNV(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVRegisterCombiners.nglGetFinalCombinerInputParameterfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetFinalCombinerInputParameterfvNV(int var0, int var1, long var2, long var4);

    public static float b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qf;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        NVRegisterCombiners.nglGetFinalCombinerInputParameterfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVRegisterCombiners.nglGetFinalCombinerInputParameterivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetFinalCombinerInputParameterivNV(int var0, int var1, long var2, long var4);

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qg;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVRegisterCombiners.nglGetFinalCombinerInputParameterivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

