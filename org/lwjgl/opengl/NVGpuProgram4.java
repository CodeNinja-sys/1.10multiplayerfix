/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVGpuProgram4 {
    public static final int a = 35078;
    public static final int b = 35079;
    public static final int c = 35080;
    public static final int d = 35081;
    public static final int e = 36261;
    public static final int f = 36262;

    private NVGpuProgram4() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MV;
        org.lwjgl.a.a(l2);
        NVGpuProgram4.nglProgramLocalParameterI4iNV(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglProgramLocalParameterI4iNV(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVGpuProgram4.nglProgramLocalParameterI4ivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglProgramLocalParameterI4ivNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVGpuProgram4.nglProgramLocalParametersI4ivNV(n2, n3, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglProgramLocalParametersI4ivNV(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MY;
        org.lwjgl.a.a(l2);
        NVGpuProgram4.nglProgramLocalParameterI4uiNV(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglProgramLocalParameterI4uiNV(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVGpuProgram4.nglProgramLocalParameterI4uivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglProgramLocalParameterI4uivNV(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Na;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVGpuProgram4.nglProgramLocalParametersI4uivNV(n2, n3, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglProgramLocalParametersI4uivNV(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nb;
        org.lwjgl.a.a(l2);
        NVGpuProgram4.nglProgramEnvParameterI4iNV(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglProgramEnvParameterI4iNV(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVGpuProgram4.nglProgramEnvParameterI4ivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglProgramEnvParameterI4ivNV(int var0, int var1, long var2, long var4);

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVGpuProgram4.nglProgramEnvParametersI4ivNV(n2, n3, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglProgramEnvParametersI4ivNV(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ne;
        org.lwjgl.a.a(l2);
        NVGpuProgram4.nglProgramEnvParameterI4uiNV(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglProgramEnvParameterI4uiNV(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void g(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVGpuProgram4.nglProgramEnvParameterI4uivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglProgramEnvParameterI4uivNV(int var0, int var1, long var2, long var4);

    public static void h(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ng;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVGpuProgram4.nglProgramEnvParametersI4uivNV(n2, n3, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglProgramEnvParametersI4uivNV(int var0, int var1, int var2, long var3, long var5);

    public static void i(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVGpuProgram4.nglGetProgramLocalParameterIivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetProgramLocalParameterIivNV(int var0, int var1, long var2, long var4);

    public static void j(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ni;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVGpuProgram4.nglGetProgramLocalParameterIuivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetProgramLocalParameterIuivNV(int var0, int var1, long var2, long var4);

    public static void k(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVGpuProgram4.nglGetProgramEnvParameterIivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetProgramEnvParameterIivNV(int var0, int var1, long var2, long var4);

    public static void l(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVGpuProgram4.nglGetProgramEnvParameterIuivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetProgramEnvParameterIuivNV(int var0, int var1, long var2, long var4);
}

