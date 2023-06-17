/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GL40;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBGpuShaderFp64 {
    public static final int a = 36860;
    public static final int b = 36861;
    public static final int c = 36862;
    public static final int d = 36678;
    public static final int e = 36679;
    public static final int f = 36680;
    public static final int g = 36681;
    public static final int h = 36682;
    public static final int i = 36683;
    public static final int j = 36684;
    public static final int k = 36685;
    public static final int l = 36686;

    private ARBGpuShaderFp64() {
    }

    public static void a(int n2, double d2) {
        GL40.a(n2, d2);
    }

    public static void a(int n2, double d2, double d3) {
        GL40.a(n2, d2, d3);
    }

    public static void a(int n2, double d2, double d3, double d4) {
        GL40.a(n2, d2, d3, d4);
    }

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        GL40.a(n2, d2, d3, d4, d5);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        GL40.a(n2, doubleBuffer);
    }

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        GL40.b(n2, doubleBuffer);
    }

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        GL40.c(n2, doubleBuffer);
    }

    public static void d(int n2, DoubleBuffer doubleBuffer) {
        GL40.d(n2, doubleBuffer);
    }

    public static void a(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.a(n2, bl2, doubleBuffer);
    }

    public static void b(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.b(n2, bl2, doubleBuffer);
    }

    public static void c(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.c(n2, bl2, doubleBuffer);
    }

    public static void d(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.d(n2, bl2, doubleBuffer);
    }

    public static void e(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.e(n2, bl2, doubleBuffer);
    }

    public static void f(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.f(n2, bl2, doubleBuffer);
    }

    public static void g(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.g(n2, bl2, doubleBuffer);
    }

    public static void h(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.h(n2, bl2, doubleBuffer);
    }

    public static void i(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        GL40.i(n2, bl2, doubleBuffer);
    }

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        GL40.a(n2, n3, doubleBuffer);
    }

    public static void a(int n2, int n3, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iC;
        org.lwjgl.a.a(l2);
        ARBGpuShaderFp64.nglProgramUniform1dEXT(n2, n3, d2, l2);
    }

    static native void nglProgramUniform1dEXT(int var0, int var1, double var2, long var4);

    public static void a(int n2, int n3, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iD;
        org.lwjgl.a.a(l2);
        ARBGpuShaderFp64.nglProgramUniform2dEXT(n2, n3, d2, d3, l2);
    }

    static native void nglProgramUniform2dEXT(int var0, int var1, double var2, double var4, long var6);

    public static void a(int n2, int n3, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iE;
        org.lwjgl.a.a(l2);
        ARBGpuShaderFp64.nglProgramUniform3dEXT(n2, n3, d2, d3, d4, l2);
    }

    static native void nglProgramUniform3dEXT(int var0, int var1, double var2, double var4, double var6, long var8);

    public static void a(int n2, int n3, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iF;
        org.lwjgl.a.a(l2);
        ARBGpuShaderFp64.nglProgramUniform4dEXT(n2, n3, d2, d3, d4, d5, l2);
    }

    static native void nglProgramUniform4dEXT(int var0, int var1, double var2, double var4, double var6, double var8, long var10);

    public static void b(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniform1dvEXT(n2, n3, doubleBuffer.remaining(), o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniform1dvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniform2dvEXT(n2, n3, doubleBuffer.remaining() >> 1, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniform2dvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniform3dvEXT(n2, n3, doubleBuffer.remaining() / 3, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniform3dvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniform4dvEXT(n2, n3, doubleBuffer.remaining() >> 2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniform4dvEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix2dvEXT(n2, n3, doubleBuffer.remaining() >> 2, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix2dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void b(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix3dvEXT(n2, n3, doubleBuffer.remaining() / 9, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix3dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void c(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix4dvEXT(n2, n3, doubleBuffer.remaining() >> 4, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix4dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void d(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix2x3dvEXT(n2, n3, doubleBuffer.remaining() / 6, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix2x3dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void e(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix2x4dvEXT(n2, n3, doubleBuffer.remaining() >> 3, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix2x4dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void f(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix3x2dvEXT(n2, n3, doubleBuffer.remaining() / 6, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix3x2dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void g(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix3x4dvEXT(n2, n3, doubleBuffer.remaining() / 12, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix3x4dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void h(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix4x2dvEXT(n2, n3, doubleBuffer.remaining() >> 3, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix4x2dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void i(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBGpuShaderFp64.nglProgramUniformMatrix4x3dvEXT(n2, n3, doubleBuffer.remaining() / 12, bl2, o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix4x3dvEXT(int var0, int var1, int var2, boolean var3, long var4, long var6);
}

