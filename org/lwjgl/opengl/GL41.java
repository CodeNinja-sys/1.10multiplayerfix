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
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;
import org.lwjgl.opengl.is;

public final class GL41 {
    public static final int a = 36346;
    public static final int b = 36345;
    public static final int c = 36347;
    public static final int d = 36348;
    public static final int e = 36349;
    public static final int f = 35738;
    public static final int g = 35739;
    public static final int h = 5132;
    public static final int i = 36336;
    public static final int j = 36337;
    public static final int k = 36338;
    public static final int l = 36339;
    public static final int m = 36340;
    public static final int n = 36341;
    public static final int o = 36194;
    public static final int p = 33367;
    public static final int q = 34625;
    public static final int r = 34814;
    public static final int s = 34815;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 4;
    public static final int w = 8;
    public static final int x = 16;
    public static final int y = -1;
    public static final int z = 33368;
    public static final int A = 33369;
    public static final int B = 33370;
    public static final int C = 33371;
    public static final int D = 33372;
    public static final int E = 33373;
    public static final int F = 33374;
    public static final int G = 33375;
    public static final int H = 33376;

    private GL41() {
    }

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.GY;
        org.lwjgl.a.a(l2);
        GL41.nglReleaseShaderCompiler(l2);
    }

    static native void nglReleaseShaderCompiler(long var0);

    public static void a(IntBuffer intBuffer, int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.GZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        GL41.nglShaderBinary(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), n2, org.lwjgl.o.a(byteBuffer), byteBuffer.remaining(), l2);
    }

    static native void nglShaderBinary(int var0, long var1, int var3, long var4, int var6, long var7);

    public static void a(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ha;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        org.lwjgl.a.a(intBuffer2, 1);
        GL41.nglGetShaderPrecisionFormat(n2, n3, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    static native void nglGetShaderPrecisionFormat(int var0, int var1, long var2, long var4, long var6);

    public static void a(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hb;
        org.lwjgl.a.a(l2);
        GL41.nglDepthRangef(f2, f3, l2);
    }

    static native void nglDepthRangef(float var0, float var1, long var2);

    public static void a(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hc;
        org.lwjgl.a.a(l2);
        GL41.nglClearDepthf(f2, l2);
    }

    static native void nglClearDepthf(float var0, long var1);

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hd;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.a(intBuffer2, 1);
        org.lwjgl.a.b(byteBuffer);
        GL41.nglGetProgramBinary(n2, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetProgramBinary(int var0, int var1, long var2, long var4, long var6, long var8);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.He;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL41.nglProgramBinary(n2, n3, org.lwjgl.o.a(byteBuffer), byteBuffer.remaining(), l2);
    }

    static native void nglProgramBinary(int var0, int var1, long var2, int var4, long var5);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hf;
        org.lwjgl.a.a(l2);
        GL41.nglProgramParameteri(n2, n3, n4, l2);
    }

    static native void nglProgramParameteri(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hg;
        org.lwjgl.a.a(l2);
        GL41.nglUseProgramStages(n2, n3, n4, l2);
    }

    static native void nglUseProgramStages(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hh;
        org.lwjgl.a.a(l2);
        GL41.nglActiveShaderProgram(n2, n3, l2);
    }

    static native void nglActiveShaderProgram(int var0, int var1, long var2);

    public static int a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = GL41.nglCreateShaderProgramv(n2, 1, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglCreateShaderProgramv(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer, n3);
        int n4 = GL41.nglCreateShaderProgramv2(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
        return n4;
    }

    static native int nglCreateShaderProgramv2(int var0, int var1, long var2, long var4);

    public static int a(int n2, ByteBuffer[] arrbyteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrbyteBuffer, 1);
        int n3 = GL41.nglCreateShaderProgramv3(n2, arrbyteBuffer.length, arrbyteBuffer, l2);
        return n3;
    }

    static native int nglCreateShaderProgramv3(int var0, int var1, ByteBuffer[] var2, long var3);

    public static int a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hi;
        org.lwjgl.a.a(l2);
        int n3 = GL41.nglCreateShaderProgramv(n2, 1, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static int a(int n2, CharSequence[] arrcharSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrcharSequence);
        int n3 = GL41.nglCreateShaderProgramv2(n2, arrcharSequence.length, org.lwjgl.opengl.i.b(dt2, arrcharSequence), l2);
        return n3;
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hj;
        org.lwjgl.a.a(l2);
        GL41.nglBindProgramPipeline(n2, l2);
    }

    static native void nglBindProgramPipeline(int var0, long var1);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglDeleteProgramPipelines(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteProgramPipelines(int var0, long var1, long var3);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hk;
        org.lwjgl.a.a(l2);
        GL41.nglDeleteProgramPipelines(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglGenProgramPipelines(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenProgramPipelines(int var0, long var1, long var3);

    public static int b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hl;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL41.nglGenProgramPipelines(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hm;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL41.nglIsProgramPipeline(n2, l2);
        return bl2;
    }

    static native boolean nglIsProgramPipeline(int var0, long var1);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL41.nglGetProgramPipelineiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetProgramPipelineiv(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hn;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL41.nglGetProgramPipelineiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ho;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform1i(n2, n3, n4, l2);
    }

    static native void nglProgramUniform1i(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hp;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform2i(n2, n3, n4, n5, l2);
    }

    static native void nglProgramUniform2i(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hq;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform3i(n2, n3, n4, n5, n6, l2);
    }

    static native void nglProgramUniform3i(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hr;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform4i(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglProgramUniform4i(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void a(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hs;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform1f(n2, n3, f2, l2);
    }

    static native void nglProgramUniform1f(int var0, int var1, float var2, long var3);

    public static void a(int n2, int n3, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ht;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform2f(n2, n3, f2, f3, l2);
    }

    static native void nglProgramUniform2f(int var0, int var1, float var2, float var3, long var4);

    public static void a(int n2, int n3, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hu;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform3f(n2, n3, f2, f3, f4, l2);
    }

    static native void nglProgramUniform3f(int var0, int var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, int n3, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hv;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform4f(n2, n3, f2, f3, f4, f5, l2);
    }

    static native void nglProgramUniform4f(int var0, int var1, float var2, float var3, float var4, float var5, long var6);

    public static void a(int n2, int n3, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hw;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform1d(n2, n3, d2, l2);
    }

    static native void nglProgramUniform1d(int var0, int var1, double var2, long var4);

    public static void a(int n2, int n3, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hx;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform2d(n2, n3, d2, d3, l2);
    }

    static native void nglProgramUniform2d(int var0, int var1, double var2, double var4, long var6);

    public static void a(int n2, int n3, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hy;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform3d(n2, n3, d2, d3, d4, l2);
    }

    static native void nglProgramUniform3d(int var0, int var1, double var2, double var4, double var6, long var8);

    public static void a(int n2, int n3, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Hz;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform4d(n2, n3, d2, d3, d4, d5, l2);
    }

    static native void nglProgramUniform4d(int var0, int var1, double var2, double var4, double var6, double var8, long var10);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglProgramUniform1iv(n2, n3, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglProgramUniform1iv(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglProgramUniform2iv(n2, n3, intBuffer.remaining() >> 1, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglProgramUniform2iv(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglProgramUniform3iv(n2, n3, intBuffer.remaining() / 3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglProgramUniform3iv(int var0, int var1, int var2, long var3, long var5);

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglProgramUniform4iv(n2, n3, intBuffer.remaining() >> 2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglProgramUniform4iv(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniform1fv(n2, n3, floatBuffer.remaining(), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniform1fv(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniform2fv(n2, n3, floatBuffer.remaining() >> 1, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniform2fv(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniform3fv(n2, n3, floatBuffer.remaining() / 3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniform3fv(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniform4fv(n2, n3, floatBuffer.remaining() >> 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniform4fv(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniform1dv(n2, n3, doubleBuffer.remaining(), org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniform1dv(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniform2dv(n2, n3, doubleBuffer.remaining() >> 1, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniform2dv(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniform3dv(n2, n3, doubleBuffer.remaining() / 3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniform3dv(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniform4dv(n2, n3, doubleBuffer.remaining() >> 2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniform4dv(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HM;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform1ui(n2, n3, n4, l2);
    }

    static native void nglProgramUniform1ui(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HN;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform2ui(n2, n3, n4, n5, l2);
    }

    static native void nglProgramUniform2ui(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HO;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform3ui(n2, n3, n4, n5, n6, l2);
    }

    static native void nglProgramUniform3ui(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HP;
        org.lwjgl.a.a(l2);
        GL41.nglProgramUniform4ui(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglProgramUniform4ui(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglProgramUniform1uiv(n2, n3, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglProgramUniform1uiv(int var0, int var1, int var2, long var3, long var5);

    public static void g(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglProgramUniform2uiv(n2, n3, intBuffer.remaining() >> 1, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglProgramUniform2uiv(int var0, int var1, int var2, long var3, long var5);

    public static void h(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglProgramUniform3uiv(n2, n3, intBuffer.remaining() / 3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglProgramUniform3uiv(int var0, int var1, int var2, long var3, long var5);

    public static void i(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglProgramUniform4uiv(n2, n3, intBuffer.remaining() >> 2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglProgramUniform4uiv(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix2fv(n2, n3, floatBuffer.remaining() >> 2, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix2fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void b(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix3fv(n2, n3, floatBuffer.remaining() / 9, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix3fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void c(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix4fv(n2, n3, floatBuffer.remaining() >> 4, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix4fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void a(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix2dv(n2, n3, doubleBuffer.remaining() >> 2, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix2dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void b(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix3dv(n2, n3, doubleBuffer.remaining() / 9, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix3dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void c(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.HZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix4dv(n2, n3, doubleBuffer.remaining() >> 4, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix4dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void d(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ia;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix2x3fv(n2, n3, floatBuffer.remaining() / 6, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix2x3fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void e(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ib;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix3x2fv(n2, n3, floatBuffer.remaining() / 6, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix3x2fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void f(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ic;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix2x4fv(n2, n3, floatBuffer.remaining() >> 3, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix2x4fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void g(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Id;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix4x2fv(n2, n3, floatBuffer.remaining() >> 3, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix4x2fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void h(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ie;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix3x4fv(n2, n3, floatBuffer.remaining() / 12, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix3x4fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void i(int n2, int n3, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.If;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglProgramUniformMatrix4x3fv(n2, n3, floatBuffer.remaining() / 12, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramUniformMatrix4x3fv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void d(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ig;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix2x3dv(n2, n3, doubleBuffer.remaining() / 6, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix2x3dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void e(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ih;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix3x2dv(n2, n3, doubleBuffer.remaining() / 6, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix3x2dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void f(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ii;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix2x4dv(n2, n3, doubleBuffer.remaining() >> 3, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix2x4dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void g(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ij;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix4x2dv(n2, n3, doubleBuffer.remaining() >> 3, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix4x2dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void h(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ik;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix3x4dv(n2, n3, doubleBuffer.remaining() / 12, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix3x4dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void i(int n2, int n3, boolean bl2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Il;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglProgramUniformMatrix4x3dv(n2, n3, doubleBuffer.remaining() / 12, bl2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramUniformMatrix4x3dv(int var0, int var1, int var2, boolean var3, long var4, long var6);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Im;
        org.lwjgl.a.a(l2);
        GL41.nglValidateProgramPipeline(n2, l2);
    }

    static native void nglValidateProgramPipeline(int var0, long var1);

    public static void a(int n2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.In;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL41.nglGetProgramPipelineInfoLog(n2, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetProgramPipelineInfoLog(int var0, int var1, long var2, long var4, long var6);

    public static String c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.In;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n3);
        GL41.nglGetProgramPipelineInfoLog(n2, n3, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void a(int n2, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Io;
        org.lwjgl.a.a(l2);
        GL41.nglVertexAttribL1d(n2, d2, l2);
    }

    static native void nglVertexAttribL1d(int var0, double var1, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ip;
        org.lwjgl.a.a(l2);
        GL41.nglVertexAttribL2d(n2, d2, d3, l2);
    }

    static native void nglVertexAttribL2d(int var0, double var1, double var3, long var5);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Iq;
        org.lwjgl.a.a(l2);
        GL41.nglVertexAttribL3d(n2, d2, d3, d4, l2);
    }

    static native void nglVertexAttribL3d(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ir;
        org.lwjgl.a.a(l2);
        GL41.nglVertexAttribL4d(n2, d2, d3, d4, d5, l2);
    }

    static native void nglVertexAttribL4d(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Is;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 1);
        GL41.nglVertexAttribL1dv(n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribL1dv(int var0, long var1, long var3);

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.It;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 2);
        GL41.nglVertexAttribL2dv(n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribL2dv(int var0, long var1, long var3);

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Iu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 3);
        GL41.nglVertexAttribL3dv(n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribL3dv(int var0, long var1, long var3);

    public static void d(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Iv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        GL41.nglVertexAttribL4dv(n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribL4dv(int var0, long var1, long var3);

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Iw;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = doubleBuffer;
        }
        GL41.nglVertexAttribLPointer(n2, n3, 5130, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribLPointer(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Iw;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        GL41.nglVertexAttribLPointerBO(n2, n3, 5130, n4, l2, l3);
    }

    static native void nglVertexAttribLPointerBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void e(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ix;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        GL41.nglGetVertexAttribLdv(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetVertexAttribLdv(int var0, int var1, long var2, long var4);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Iy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglViewportArrayv(n2, floatBuffer.remaining() >> 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglViewportArrayv(int var0, int var1, long var2, long var4);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Iz;
        org.lwjgl.a.a(l2);
        GL41.nglViewportIndexedf(n2, f2, f3, f4, f5, l2);
    }

    static native void nglViewportIndexedf(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL41.nglViewportIndexedfv(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglViewportIndexedfv(int var0, long var1, long var3);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL41.nglScissorArrayv(n2, intBuffer.remaining() >> 2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglScissorArrayv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IC;
        org.lwjgl.a.a(l2);
        GL41.nglScissorIndexed(n2, n3, n4, n5, n6, l2);
    }

    static native void nglScissorIndexed(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ID;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL41.nglScissorIndexedv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglScissorIndexedv(int var0, long var1, long var3);

    public static void e(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglDepthRangeArrayv(n2, doubleBuffer.remaining() >> 1, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglDepthRangeArrayv(int var0, int var1, long var2, long var4);

    public static void b(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IF;
        org.lwjgl.a.a(l2);
        GL41.nglDepthRangeIndexed(n2, d2, d3, l2);
    }

    static native void nglDepthRangeIndexed(int var0, double var1, double var3, long var5);

    public static void e(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL41.nglGetFloati_v(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetFloati_v(int var0, int var1, long var2, long var4);

    public static float d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IG;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL41.nglGetFloati_v(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void f(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL41.nglGetDoublei_v(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetDoublei_v(int var0, int var1, long var2, long var4);

    public static double e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IH;
        org.lwjgl.a.a(l2);
        DoubleBuffer doubleBuffer = org.lwjgl.opengl.i.d(dt2);
        GL41.nglGetDoublei_v(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
        return doubleBuffer.get(0);
    }
}

