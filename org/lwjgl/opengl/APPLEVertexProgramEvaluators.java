/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class APPLEVertexProgramEvaluators {
    public static final int a = 35328;
    public static final int b = 35329;
    public static final int c = 35330;
    public static final int d = 35331;
    public static final int e = 35332;
    public static final int f = 35333;
    public static final int g = 35334;
    public static final int h = 35335;
    public static final int i = 35336;
    public static final int j = 35337;

    private APPLEVertexProgramEvaluators() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hx;
        org.lwjgl.a.a(l2);
        APPLEVertexProgramEvaluators.nglEnableVertexAttribAPPLE(n2, n3, l2);
    }

    static native void nglEnableVertexAttribAPPLE(int var0, int var1, long var2);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hy;
        org.lwjgl.a.a(l2);
        APPLEVertexProgramEvaluators.nglDisableVertexAttribAPPLE(n2, n3, l2);
    }

    static native void nglDisableVertexAttribAPPLE(int var0, int var1, long var2);

    public static boolean c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hz;
        org.lwjgl.a.a(l2);
        boolean bl2 = APPLEVertexProgramEvaluators.nglIsVertexAttribEnabledAPPLE(n2, n3, l2);
        return bl2;
    }

    static native boolean nglIsVertexAttribEnabledAPPLE(int var0, int var1, long var2);

    public static void a(int n2, int n3, double d2, double d3, int n4, int n5, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        APPLEVertexProgramEvaluators.nglMapVertexAttrib1dAPPLE(n2, n3, d2, d3, n4, n5, o.a(doubleBuffer), l2);
    }

    static native void nglMapVertexAttrib1dAPPLE(int var0, int var1, double var2, double var4, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, float f2, float f3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        APPLEVertexProgramEvaluators.nglMapVertexAttrib1fAPPLE(n2, n3, f2, f3, n4, n5, o.a(floatBuffer), l2);
    }

    static native void nglMapVertexAttrib1fAPPLE(int var0, int var1, float var2, float var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, double d2, double d3, int n4, int n5, double d4, double d5, int n6, int n7, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        APPLEVertexProgramEvaluators.nglMapVertexAttrib2dAPPLE(n2, n3, d2, d3, n4, n5, d4, d5, n6, n7, o.a(doubleBuffer), l2);
    }

    static native void nglMapVertexAttrib2dAPPLE(int var0, int var1, double var2, double var4, int var6, int var7, double var8, double var10, int var12, int var13, long var14, long var16);

    public static void a(int n2, int n3, float f2, float f3, int n4, int n5, float f4, float f5, int n6, int n7, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        APPLEVertexProgramEvaluators.nglMapVertexAttrib2fAPPLE(n2, n3, f2, f3, n4, n5, f4, f5, n6, n7, o.a(floatBuffer), l2);
    }

    static native void nglMapVertexAttrib2fAPPLE(int var0, int var1, float var2, float var3, int var4, int var5, float var6, float var7, int var8, int var9, long var10, long var12);
}

