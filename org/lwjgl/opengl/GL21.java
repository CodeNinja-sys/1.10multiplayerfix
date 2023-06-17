/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class GL21 {
    public static final int a = 35685;
    public static final int b = 35686;
    public static final int c = 35687;
    public static final int d = 35688;
    public static final int e = 35689;
    public static final int f = 35690;
    public static final int g = 35051;
    public static final int h = 35052;
    public static final int i = 35053;
    public static final int j = 35055;
    public static final int k = 35904;
    public static final int l = 35905;
    public static final int m = 35906;
    public static final int n = 35907;
    public static final int o = 35908;
    public static final int p = 35909;
    public static final int q = 35910;
    public static final int r = 35911;
    public static final int s = 35912;
    public static final int t = 35913;
    public static final int u = 35914;
    public static final int v = 35915;
    public static final int w = 33887;

    private GL21() {
    }

    public static void a(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL21.nglUniformMatrix2x3fv(n2, floatBuffer.remaining() / 6, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix2x3fv(int var0, int var1, boolean var2, long var3, long var5);

    public static void b(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL21.nglUniformMatrix3x2fv(n2, floatBuffer.remaining() / 6, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix3x2fv(int var0, int var1, boolean var2, long var3, long var5);

    public static void c(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL21.nglUniformMatrix2x4fv(n2, floatBuffer.remaining() >> 3, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix2x4fv(int var0, int var1, boolean var2, long var3, long var5);

    public static void d(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL21.nglUniformMatrix4x2fv(n2, floatBuffer.remaining() >> 3, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix4x2fv(int var0, int var1, boolean var2, long var3, long var5);

    public static void e(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL21.nglUniformMatrix3x4fv(n2, floatBuffer.remaining() / 12, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix3x4fv(int var0, int var1, boolean var2, long var3, long var5);

    public static void f(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL21.nglUniformMatrix4x3fv(n2, floatBuffer.remaining() / 12, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix4x3fv(int var0, int var1, boolean var2, long var3, long var5);
}

