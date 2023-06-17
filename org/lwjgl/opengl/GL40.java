/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;

public final class GL40 {
    public static final int a = 36671;
    public static final int b = 36675;
    public static final int c = 34943;
    public static final int d = 36442;
    public static final int e = 36443;
    public static final int f = 36444;
    public static final int g = 36445;
    public static final int h = 36465;
    public static final int i = 36860;
    public static final int j = 36861;
    public static final int k = 36862;
    public static final int l = 36678;
    public static final int m = 36679;
    public static final int n = 36680;
    public static final int o = 36681;
    public static final int p = 36682;
    public static final int q = 36683;
    public static final int r = 36684;
    public static final int s = 36685;
    public static final int t = 36686;
    public static final int u = 35894;
    public static final int v = 35895;
    public static final int w = 36325;
    public static final int x = 36326;
    public static final int y = 36423;
    public static final int z = 36424;
    public static final int A = 36425;
    public static final int B = 36327;
    public static final int C = 36328;
    public static final int D = 36426;
    public static final int E = 36427;
    public static final int F = 14;
    public static final int G = 36466;
    public static final int H = 36467;
    public static final int I = 36468;
    public static final int J = 36469;
    public static final int K = 36470;
    public static final int L = 36471;
    public static final int M = 36472;
    public static final int N = 36473;
    public static final int O = 36474;
    public static final int P = 36475;
    public static final int Q = 36476;
    public static final int R = 36477;
    public static final int S = 36478;
    public static final int T = 36479;
    public static final int U = 36480;
    public static final int V = 36481;
    public static final int W = 36482;
    public static final int X = 36483;
    public static final int Y = 36484;
    public static final int Z = 36485;
    public static final int aa = 36486;
    public static final int ab = 36489;
    public static final int ac = 36490;
    public static final int ad = 34924;
    public static final int ae = 34925;
    public static final int af = 36382;
    public static final int ag = 36383;
    public static final int ah = 34032;
    public static final int ai = 34033;
    public static final int aj = 36487;
    public static final int ak = 36488;
    public static final int al = 36873;
    public static final int am = 36874;
    public static final int an = 36875;
    public static final int ao = 36876;
    public static final int ap = 36877;
    public static final int aq = 36878;
    public static final int ar = 36879;
    public static final int as = 36446;
    public static final int at = 36447;
    public static final int au = 36767;
    public static final int av = 36386;
    public static final int aw = 36387;
    public static final int ax = 36388;
    public static final int ay = 36387;
    public static final int az = 36388;
    public static final int aA = 36389;
    public static final int aB = 36464;

    private GL40() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ge;
        org.lwjgl.a.a(l2);
        GL40.nglBlendEquationi(n2, n3, l2);
    }

    static native void nglBlendEquationi(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gf;
        org.lwjgl.a.a(l2);
        GL40.nglBlendEquationSeparatei(n2, n3, n4, l2);
    }

    static native void nglBlendEquationSeparatei(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gg;
        org.lwjgl.a.a(l2);
        GL40.nglBlendFunci(n2, n3, n4, l2);
    }

    static native void nglBlendFunci(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gh;
        org.lwjgl.a.a(l2);
        GL40.nglBlendFuncSeparatei(n2, n3, n4, n5, n6, l2);
    }

    static native void nglBlendFuncSeparatei(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gi;
        org.lwjgl.a.a(l2);
        ft.e(dt2);
        org.lwjgl.a.b(byteBuffer, 16);
        GL40.nglDrawArraysIndirect(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglDrawArraysIndirect(int var0, long var1, long var3);

    public static void a(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Gi;
        org.lwjgl.a.a(l3);
        ft.f(dt2);
        GL40.nglDrawArraysIndirectBO(n2, l2, l3);
    }

    static native void nglDrawArraysIndirectBO(int var0, long var1, long var3);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gi;
        org.lwjgl.a.a(l2);
        ft.e(dt2);
        org.lwjgl.a.a(intBuffer, 4);
        GL40.nglDrawArraysIndirect(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gj;
        org.lwjgl.a.a(l2);
        ft.e(dt2);
        org.lwjgl.a.b(byteBuffer, 20);
        GL40.nglDrawElementsIndirect(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglDrawElementsIndirect(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Gj;
        org.lwjgl.a.a(l3);
        ft.f(dt2);
        GL40.nglDrawElementsIndirectBO(n2, n3, l2, l3);
    }

    static native void nglDrawElementsIndirectBO(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gj;
        org.lwjgl.a.a(l2);
        ft.e(dt2);
        org.lwjgl.a.a(intBuffer, 5);
        GL40.nglDrawElementsIndirect(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gk;
        org.lwjgl.a.a(l2);
        GL40.nglUniform1d(n2, d2, l2);
    }

    static native void nglUniform1d(int var0, double var1, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gl;
        org.lwjgl.a.a(l2);
        GL40.nglUniform2d(n2, d2, d3, l2);
    }

    static native void nglUniform2d(int var0, double var1, double var3, long var5);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gm;
        org.lwjgl.a.a(l2);
        GL40.nglUniform3d(n2, d2, d3, d4, l2);
    }

    static native void nglUniform3d(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gn;
        org.lwjgl.a.a(l2);
        GL40.nglUniform4d(n2, d2, d3, d4, d5, l2);
    }

    static native void nglUniform4d(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Go;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniform1dv(n2, doubleBuffer.remaining(), org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniform1dv(int var0, int var1, long var2, long var4);

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniform2dv(n2, doubleBuffer.remaining() >> 1, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniform2dv(int var0, int var1, long var2, long var4);

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniform3dv(n2, doubleBuffer.remaining() / 3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniform3dv(int var0, int var1, long var2, long var4);

    public static void d(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniform4dv(n2, doubleBuffer.remaining() >> 2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniform4dv(int var0, int var1, long var2, long var4);

    public static void a(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gs;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix2dv(n2, doubleBuffer.remaining() >> 2, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix2dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void b(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gt;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix3dv(n2, doubleBuffer.remaining() / 9, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix3dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void c(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix4dv(n2, doubleBuffer.remaining() >> 4, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix4dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void d(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix2x3dv(n2, doubleBuffer.remaining() / 6, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix2x3dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void e(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix2x4dv(n2, doubleBuffer.remaining() >> 3, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix2x4dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void f(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix3x2dv(n2, doubleBuffer.remaining() / 6, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix3x2dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void g(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix3x4dv(n2, doubleBuffer.remaining() / 12, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix3x4dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void h(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix4x2dv(n2, doubleBuffer.remaining() >> 3, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix4x2dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void i(int n2, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglUniformMatrix4x3dv(n2, doubleBuffer.remaining() / 12, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglUniformMatrix4x3dv(int var0, int var1, boolean var2, long var3, long var5);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL40.nglGetUniformdv(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetUniformdv(int var0, int var1, long var2, long var4);

    public static void a(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GC;
        org.lwjgl.a.a(l2);
        GL40.nglMinSampleShading(f2, l2);
    }

    static native void nglMinSampleShading(float var0, long var1);

    public static int b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n4 = GL40.nglGetSubroutineUniformLocation(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
        return n4;
    }

    static native int nglGetSubroutineUniformLocation(int var0, int var1, long var2, long var4);

    public static int a(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GD;
        org.lwjgl.a.a(l2);
        int n4 = GL40.nglGetSubroutineUniformLocation(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n4;
    }

    public static int c(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n4 = GL40.nglGetSubroutineIndex(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
        return n4;
    }

    static native int nglGetSubroutineIndex(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GE;
        org.lwjgl.a.a(l2);
        int n4 = GL40.nglGetSubroutineIndex(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n4;
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL40.nglGetActiveSubroutineUniformiv(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetActiveSubroutineUniformiv(int var0, int var1, int var2, int var3, long var4, long var6);

    public static int a(int n2, int n3, int n4, int n5) {
        return GL40.b(n2, n3, n4, n5);
    }

    public static int b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GF;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL40.nglGetActiveSubroutineUniformiv(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GG;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL40.nglGetActiveSubroutineUniformName(n2, n3, n4, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveSubroutineUniformName(int var0, int var1, int var2, int var3, long var4, long var6, long var8);

    public static String c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GG;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n5);
        GL40.nglGetActiveSubroutineUniformName(n2, n3, n4, n5, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void b(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GH;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL40.nglGetActiveSubroutineName(n2, n3, n4, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveSubroutineName(int var0, int var1, int var2, int var3, long var4, long var6, long var8);

    public static String d(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GH;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n5);
        GL40.nglGetActiveSubroutineName(n2, n3, n4, n5, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL40.nglUniformSubroutinesuiv(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniformSubroutinesuiv(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL40.nglGetUniformSubroutineuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetUniformSubroutineuiv(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        return GL40.c(n2, n3);
    }

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GJ;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL40.nglGetUniformSubroutineuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL40.nglGetProgramStageiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetProgramStageiv(int var0, int var1, int var2, long var3, long var5);

    public static int c(int n2, int n3, int n4) {
        return GL40.d(n2, n3, n4);
    }

    public static int d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GK;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL40.nglGetProgramStageiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GL;
        org.lwjgl.a.a(l2);
        GL40.nglPatchParameteri(n2, n3, l2);
    }

    static native void nglPatchParameteri(int var0, int var1, long var2);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL40.nglPatchParameterfv(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglPatchParameterfv(int var0, long var1, long var3);

    public static void e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GN;
        org.lwjgl.a.a(l2);
        GL40.nglBindTransformFeedback(n2, n3, l2);
    }

    static native void nglBindTransformFeedback(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL40.nglDeleteTransformFeedbacks(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteTransformFeedbacks(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GO;
        org.lwjgl.a.a(l2);
        GL40.nglDeleteTransformFeedbacks(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL40.nglGenTransformFeedbacks(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenTransformFeedbacks(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.GP;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL40.nglGenTransformFeedbacks(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GQ;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL40.nglIsTransformFeedback(n2, l2);
        return bl2;
    }

    static native boolean nglIsTransformFeedback(int var0, long var1);

    public static void b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.GR;
        org.lwjgl.a.a(l2);
        GL40.nglPauseTransformFeedback(l2);
    }

    static native void nglPauseTransformFeedback(long var0);

    public static void c() {
        dt dt2 = GLContext.a();
        long l2 = dt2.GS;
        org.lwjgl.a.a(l2);
        GL40.nglResumeTransformFeedback(l2);
    }

    static native void nglResumeTransformFeedback(long var0);

    public static void f(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GT;
        org.lwjgl.a.a(l2);
        GL40.nglDrawTransformFeedback(n2, n3, l2);
    }

    static native void nglDrawTransformFeedback(int var0, int var1, long var2);

    public static void e(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GU;
        org.lwjgl.a.a(l2);
        GL40.nglDrawTransformFeedbackStream(n2, n3, n4, l2);
    }

    static native void nglDrawTransformFeedbackStream(int var0, int var1, int var2, long var3);

    public static void f(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GV;
        org.lwjgl.a.a(l2);
        GL40.nglBeginQueryIndexed(n2, n3, n4, l2);
    }

    static native void nglBeginQueryIndexed(int var0, int var1, int var2, long var3);

    public static void g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GW;
        org.lwjgl.a.a(l2);
        GL40.nglEndQueryIndexed(n2, n3, l2);
    }

    static native void nglEndQueryIndexed(int var0, int var1, long var2);

    public static void b(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL40.nglGetQueryIndexediv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetQueryIndexediv(int var0, int var1, int var2, long var3, long var5);

    public static int g(int n2, int n3, int n4) {
        return GL40.h(n2, n3, n4);
    }

    public static int h(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GX;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL40.nglGetQueryIndexediv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

