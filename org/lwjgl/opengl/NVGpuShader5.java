/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVGpuShader5 {
    public static final int a = 5134;
    public static final int b = 5135;
    public static final int c = 36832;
    public static final int d = 36833;
    public static final int e = 36834;
    public static final int f = 36835;
    public static final int g = 36836;
    public static final int h = 36837;
    public static final int i = 36838;
    public static final int j = 36839;
    public static final int k = 36841;
    public static final int l = 36842;
    public static final int m = 36843;
    public static final int n = 36844;
    public static final int o = 36845;
    public static final int p = 36846;
    public static final int q = 36847;
    public static final int r = 36848;
    public static final int s = 36849;
    public static final int t = 36850;
    public static final int u = 36851;
    public static final int v = 36853;
    public static final int w = 36854;
    public static final int x = 36855;
    public static final int y = 36856;
    public static final int z = 36857;
    public static final int A = 36858;
    public static final int B = 36859;
    public static final int C = 14;

    private NVGpuShader5() {
    }

    public static void a(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Nl;
        org.lwjgl.a.a(l3);
        NVGpuShader5.nglUniform1i64NV(n2, l2, l3);
    }

    static native void nglUniform1i64NV(int var0, long var1, long var3);

    public static void a(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Nm;
        org.lwjgl.a.a(l4);
        NVGpuShader5.nglUniform2i64NV(n2, l2, l3, l4);
    }

    static native void nglUniform2i64NV(int var0, long var1, long var3, long var5);

    public static void a(int n2, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.Nn;
        org.lwjgl.a.a(l5);
        NVGpuShader5.nglUniform3i64NV(n2, l2, l3, l4, l5);
    }

    static native void nglUniform3i64NV(int var0, long var1, long var3, long var5, long var7);

    public static void a(int n2, long l2, long l3, long l4, long l5) {
        dt dt2 = GLContext.a();
        long l6 = dt2.No;
        org.lwjgl.a.a(l6);
        NVGpuShader5.nglUniform4i64NV(n2, l2, l3, l4, l5, l6);
    }

    static native void nglUniform4i64NV(int var0, long var1, long var3, long var5, long var7, long var9);

    public static void a(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Np;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglUniform1i64vNV(n2, longBuffer.remaining(), org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglUniform1i64vNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglUniform2i64vNV(n2, longBuffer.remaining() >> 1, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglUniform2i64vNV(int var0, int var1, long var2, long var4);

    public static void c(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglUniform3i64vNV(n2, longBuffer.remaining() / 3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglUniform3i64vNV(int var0, int var1, long var2, long var4);

    public static void d(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ns;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglUniform4i64vNV(n2, longBuffer.remaining() >> 2, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglUniform4i64vNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Nt;
        org.lwjgl.a.a(l3);
        NVGpuShader5.nglUniform1ui64NV(n2, l2, l3);
    }

    static native void nglUniform1ui64NV(int var0, long var1, long var3);

    public static void b(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Nu;
        org.lwjgl.a.a(l4);
        NVGpuShader5.nglUniform2ui64NV(n2, l2, l3, l4);
    }

    static native void nglUniform2ui64NV(int var0, long var1, long var3, long var5);

    public static void b(int n2, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.Nv;
        org.lwjgl.a.a(l5);
        NVGpuShader5.nglUniform3ui64NV(n2, l2, l3, l4, l5);
    }

    static native void nglUniform3ui64NV(int var0, long var1, long var3, long var5, long var7);

    public static void b(int n2, long l2, long l3, long l4, long l5) {
        dt dt2 = GLContext.a();
        long l6 = dt2.Nw;
        org.lwjgl.a.a(l6);
        NVGpuShader5.nglUniform4ui64NV(n2, l2, l3, l4, l5, l6);
    }

    static native void nglUniform4ui64NV(int var0, long var1, long var3, long var5, long var7, long var9);

    public static void e(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglUniform1ui64vNV(n2, longBuffer.remaining(), org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglUniform1ui64vNV(int var0, int var1, long var2, long var4);

    public static void f(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ny;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglUniform2ui64vNV(n2, longBuffer.remaining() >> 1, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglUniform2ui64vNV(int var0, int var1, long var2, long var4);

    public static void g(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Nz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglUniform3ui64vNV(n2, longBuffer.remaining() / 3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglUniform3ui64vNV(int var0, int var1, long var2, long var4);

    public static void h(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglUniform4ui64vNV(n2, longBuffer.remaining() >> 2, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglUniform4ui64vNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVGpuShader5.nglGetUniformi64vNV(n2, n3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetUniformi64vNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVGpuShader5.nglGetUniformui64vNV(n2, n3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetUniformui64vNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ND;
        org.lwjgl.a.a(l3);
        NVGpuShader5.nglProgramUniform1i64NV(n2, n3, l2, l3);
    }

    static native void nglProgramUniform1i64NV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.NE;
        org.lwjgl.a.a(l4);
        NVGpuShader5.nglProgramUniform2i64NV(n2, n3, l2, l3, l4);
    }

    static native void nglProgramUniform2i64NV(int var0, int var1, long var2, long var4, long var6);

    public static void a(int n2, int n3, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.NF;
        org.lwjgl.a.a(l5);
        NVGpuShader5.nglProgramUniform3i64NV(n2, n3, l2, l3, l4, l5);
    }

    static native void nglProgramUniform3i64NV(int var0, int var1, long var2, long var4, long var6, long var8);

    public static void a(int n2, int n3, long l2, long l3, long l4, long l5) {
        dt dt2 = GLContext.a();
        long l6 = dt2.NG;
        org.lwjgl.a.a(l6);
        NVGpuShader5.nglProgramUniform4i64NV(n2, n3, l2, l3, l4, l5, l6);
    }

    static native void nglProgramUniform4i64NV(int var0, int var1, long var2, long var4, long var6, long var8, long var10);

    public static void c(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglProgramUniform1i64vNV(n2, n3, longBuffer.remaining(), org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglProgramUniform1i64vNV(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglProgramUniform2i64vNV(n2, n3, longBuffer.remaining() >> 1, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglProgramUniform2i64vNV(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglProgramUniform3i64vNV(n2, n3, longBuffer.remaining() / 3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglProgramUniform3i64vNV(int var0, int var1, int var2, long var3, long var5);

    public static void f(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglProgramUniform4i64vNV(n2, n3, longBuffer.remaining() >> 2, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglProgramUniform4i64vNV(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.NL;
        org.lwjgl.a.a(l3);
        NVGpuShader5.nglProgramUniform1ui64NV(n2, n3, l2, l3);
    }

    static native void nglProgramUniform1ui64NV(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.NM;
        org.lwjgl.a.a(l4);
        NVGpuShader5.nglProgramUniform2ui64NV(n2, n3, l2, l3, l4);
    }

    static native void nglProgramUniform2ui64NV(int var0, int var1, long var2, long var4, long var6);

    public static void b(int n2, int n3, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.NN;
        org.lwjgl.a.a(l5);
        NVGpuShader5.nglProgramUniform3ui64NV(n2, n3, l2, l3, l4, l5);
    }

    static native void nglProgramUniform3ui64NV(int var0, int var1, long var2, long var4, long var6, long var8);

    public static void b(int n2, int n3, long l2, long l3, long l4, long l5) {
        dt dt2 = GLContext.a();
        long l6 = dt2.NO;
        org.lwjgl.a.a(l6);
        NVGpuShader5.nglProgramUniform4ui64NV(n2, n3, l2, l3, l4, l5, l6);
    }

    static native void nglProgramUniform4ui64NV(int var0, int var1, long var2, long var4, long var6, long var8, long var10);

    public static void g(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglProgramUniform1ui64vNV(n2, n3, longBuffer.remaining(), org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglProgramUniform1ui64vNV(int var0, int var1, int var2, long var3, long var5);

    public static void h(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglProgramUniform2ui64vNV(n2, n3, longBuffer.remaining() >> 1, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglProgramUniform2ui64vNV(int var0, int var1, int var2, long var3, long var5);

    public static void i(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglProgramUniform3ui64vNV(n2, n3, longBuffer.remaining() / 3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglProgramUniform3ui64vNV(int var0, int var1, int var2, long var3, long var5);

    public static void j(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVGpuShader5.nglProgramUniform4ui64vNV(n2, n3, longBuffer.remaining() >> 2, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglProgramUniform4ui64vNV(int var0, int var1, int var2, long var3, long var5);
}

