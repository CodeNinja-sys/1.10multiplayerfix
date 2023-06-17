/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;
import org.lwjgl.opengl.is;
import org.lwjgl.x;

public final class GL20 {
    public static final int a = 35724;
    public static final int b = 35725;
    public static final int c = 35663;
    public static final int d = 35712;
    public static final int e = 35713;
    public static final int f = 35714;
    public static final int g = 35715;
    public static final int h = 35716;
    public static final int i = 35717;
    public static final int j = 35718;
    public static final int k = 35719;
    public static final int l = 35721;
    public static final int m = 35722;
    public static final int n = 35720;
    public static final int o = 35656;
    public static final int p = 35664;
    public static final int q = 35665;
    public static final int r = 35666;
    public static final int s = 35667;
    public static final int t = 35668;
    public static final int u = 35669;
    public static final int v = 35670;
    public static final int w = 35671;
    public static final int x = 35672;
    public static final int y = 35673;
    public static final int z = 35674;
    public static final int A = 35675;
    public static final int B = 35676;
    public static final int C = 35677;
    public static final int D = 35678;
    public static final int E = 35679;
    public static final int F = 35680;
    public static final int G = 35681;
    public static final int H = 35682;
    public static final int I = 35633;
    public static final int J = 35658;
    public static final int K = 35659;
    public static final int L = 34921;
    public static final int M = 34930;
    public static final int N = 35660;
    public static final int O = 35661;
    public static final int P = 34929;
    public static final int Q = 34370;
    public static final int R = 34371;
    public static final int S = 34338;
    public static final int T = 34339;
    public static final int U = 34340;
    public static final int V = 34341;
    public static final int W = 34922;
    public static final int X = 34342;
    public static final int Y = 34373;
    public static final int Z = 35632;
    public static final int aa = 35657;
    public static final int ab = 35723;
    public static final int ac = 34852;
    public static final int ad = 34853;
    public static final int ae = 34854;
    public static final int af = 34855;
    public static final int ag = 34856;
    public static final int ah = 34857;
    public static final int ai = 34858;
    public static final int aj = 34859;
    public static final int ak = 34860;
    public static final int al = 34861;
    public static final int am = 34862;
    public static final int an = 34863;
    public static final int ao = 34864;
    public static final int ap = 34865;
    public static final int aq = 34866;
    public static final int ar = 34867;
    public static final int as = 34868;
    public static final int at = 34913;
    public static final int au = 34914;
    public static final int av = 36000;
    public static final int aw = 36001;
    public static final int ax = 36002;
    public static final int ay = 34816;
    public static final int az = 34817;
    public static final int aA = 34818;
    public static final int aB = 34819;
    public static final int aC = 36003;
    public static final int aD = 36004;
    public static final int aE = 36005;
    public static final int aF = 32777;
    public static final int aG = 34877;

    private GL20() {
    }

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL20.nglShaderSource(n2, 1, org.lwjgl.o.a(byteBuffer), byteBuffer.remaining(), l2);
    }

    static native void nglShaderSource(int var0, int var1, long var2, int var4, long var5);

    public static void a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bq;
        org.lwjgl.a.a(l2);
        GL20.nglShaderSource(n2, 1, org.lwjgl.opengl.i.a(dt2, charSequence), charSequence.length(), l2);
    }

    public static void a(int n2, CharSequence[] arrcharSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrcharSequence);
        GL20.nglShaderSource3(n2, arrcharSequence.length, org.lwjgl.opengl.i.a(dt2, arrcharSequence), org.lwjgl.opengl.i.c(dt2, arrcharSequence), l2);
    }

    static native void nglShaderSource3(int var0, int var1, long var2, long var4, long var6);

    public static int a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Br;
        org.lwjgl.a.a(l2);
        int n3 = GL20.nglCreateShader(n2, l2);
        return n3;
    }

    static native int nglCreateShader(int var0, long var1);

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bs;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL20.nglIsShader(n2, l2);
        return bl2;
    }

    static native boolean nglIsShader(int var0, long var1);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bt;
        org.lwjgl.a.a(l2);
        GL20.nglCompileShader(n2, l2);
    }

    static native void nglCompileShader(int var0, long var1);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bu;
        org.lwjgl.a.a(l2);
        GL20.nglDeleteShader(n2, l2);
    }

    static native void nglDeleteShader(int var0, long var1);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bv;
        org.lwjgl.a.a(l2);
        int n2 = GL20.nglCreateProgram(l2);
        return n2;
    }

    static native int nglCreateProgram(long var0);

    public static boolean e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bw;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL20.nglIsProgram(n2, l2);
        return bl2;
    }

    static native boolean nglIsProgram(int var0, long var1);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bx;
        org.lwjgl.a.a(l2);
        GL20.nglAttachShader(n2, n3, l2);
    }

    static native void nglAttachShader(int var0, int var1, long var2);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.By;
        org.lwjgl.a.a(l2);
        GL20.nglDetachShader(n2, n3, l2);
    }

    static native void nglDetachShader(int var0, int var1, long var2);

    public static void f(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bz;
        org.lwjgl.a.a(l2);
        GL20.nglLinkProgram(n2, l2);
    }

    static native void nglLinkProgram(int var0, long var1);

    public static void g(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BA;
        org.lwjgl.a.a(l2);
        GL20.nglUseProgram(n2, l2);
    }

    static native void nglUseProgram(int var0, long var1);

    public static void h(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BB;
        org.lwjgl.a.a(l2);
        GL20.nglValidateProgram(n2, l2);
    }

    static native void nglValidateProgram(int var0, long var1);

    public static void i(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BC;
        org.lwjgl.a.a(l2);
        GL20.nglDeleteProgram(n2, l2);
    }

    static native void nglDeleteProgram(int var0, long var1);

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BD;
        org.lwjgl.a.a(l2);
        GL20.nglUniform1f(n2, f2, l2);
    }

    static native void nglUniform1f(int var0, float var1, long var2);

    public static void a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BE;
        org.lwjgl.a.a(l2);
        GL20.nglUniform2f(n2, f2, f3, l2);
    }

    static native void nglUniform2f(int var0, float var1, float var2, long var3);

    public static void a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BF;
        org.lwjgl.a.a(l2);
        GL20.nglUniform3f(n2, f2, f3, f4, l2);
    }

    static native void nglUniform3f(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BG;
        org.lwjgl.a.a(l2);
        GL20.nglUniform4f(n2, f2, f3, f4, f5, l2);
    }

    static native void nglUniform4f(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BH;
        org.lwjgl.a.a(l2);
        GL20.nglUniform1i(n2, n3, l2);
    }

    static native void nglUniform1i(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BI;
        org.lwjgl.a.a(l2);
        GL20.nglUniform2i(n2, n3, n4, l2);
    }

    static native void nglUniform2i(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BJ;
        org.lwjgl.a.a(l2);
        GL20.nglUniform3i(n2, n3, n4, n5, l2);
    }

    static native void nglUniform3i(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BK;
        org.lwjgl.a.a(l2);
        GL20.nglUniform4i(n2, n3, n4, n5, n6, l2);
    }

    static native void nglUniform4i(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL20.nglUniform1fv(n2, floatBuffer.remaining(), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniform1fv(int var0, int var1, long var2, long var4);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL20.nglUniform2fv(n2, floatBuffer.remaining() >> 1, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniform2fv(int var0, int var1, long var2, long var4);

    public static void c(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL20.nglUniform3fv(n2, floatBuffer.remaining() / 3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniform3fv(int var0, int var1, long var2, long var4);

    public static void d(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL20.nglUniform4fv(n2, floatBuffer.remaining() >> 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniform4fv(int var0, int var1, long var2, long var4);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL20.nglUniform1iv(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform1iv(int var0, int var1, long var2, long var4);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL20.nglUniform2iv(n2, intBuffer.remaining() >> 1, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform2iv(int var0, int var1, long var2, long var4);

    public static void c(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL20.nglUniform3iv(n2, intBuffer.remaining() / 3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform3iv(int var0, int var1, long var2, long var4);

    public static void d(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL20.nglUniform4iv(n2, intBuffer.remaining() >> 2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform4iv(int var0, int var1, long var2, long var4);

    public static void a(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL20.nglUniformMatrix2fv(n2, floatBuffer.remaining() >> 2, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix2fv(int var0, int var1, boolean var2, long var3, long var5);

    public static void b(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL20.nglUniformMatrix3fv(n2, floatBuffer.remaining() / 9, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix3fv(int var0, int var1, boolean var2, long var3, long var5);

    public static void c(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL20.nglUniformMatrix4fv(n2, floatBuffer.remaining() >> 4, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix4fv(int var0, int var1, boolean var2, long var3, long var5);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL20.nglGetShaderiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetShaderiv(int var0, int var1, long var2, long var4);

    public static int d(int n2, int n3) {
        return GL20.e(n2, n3);
    }

    public static int e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BW;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL20.nglGetShaderiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL20.nglGetProgramiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetProgramiv(int var0, int var1, long var2, long var4);

    public static int f(int n2, int n3) {
        return GL20.g(n2, n3);
    }

    public static int g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BX;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL20.nglGetProgramiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BY;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL20.nglGetShaderInfoLog(n2, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetShaderInfoLog(int var0, int var1, long var2, long var4, long var6);

    public static String h(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BY;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n3);
        GL20.nglGetShaderInfoLog(n2, n3, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void b(int n2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BZ;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL20.nglGetProgramInfoLog(n2, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetProgramInfoLog(int var0, int var1, long var2, long var4, long var6);

    public static String i(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.BZ;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n3);
        GL20.nglGetProgramInfoLog(n2, n3, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ca;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(intBuffer2);
        GL20.nglGetAttachedShaders(n2, intBuffer2.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    static native void nglGetAttachedShaders(int var0, int var1, long var2, long var4, long var6);

    public static int b(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 1);
        org.lwjgl.a.a(byteBuffer);
        int n3 = GL20.nglGetUniformLocation(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetUniformLocation(int var0, long var1, long var3);

    public static int b(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cb;
        org.lwjgl.a.a(l2);
        int n3 = GL20.nglGetUniformLocation(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cc;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.a(intBuffer2, 1);
        org.lwjgl.a.a(intBuffer3, 1);
        org.lwjgl.a.b(byteBuffer);
        GL20.nglGetActiveUniform(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(intBuffer3), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveUniform(int var0, int var1, int var2, long var3, long var5, long var7, long var9, long var11);

    public static String a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        IntBuffer intBuffer2 = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        GL20.nglGetActiveUniform(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer2), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, intBuffer.position() + 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer2.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static String b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cc;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        GL20.nglGetActiveUniform(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a((Buffer)org.lwjgl.opengl.i.a(dt2)), org.lwjgl.o.a(org.lwjgl.opengl.i.a(dt2), 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static int j(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cc;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL20.nglGetActiveUniform(n2, n3, 1, 0L, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, 1), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static int k(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cc;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL20.nglGetActiveUniform(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer, 1), org.lwjgl.o.a(intBuffer), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL20.nglGetUniformfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetUniformfv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ce;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL20.nglGetUniformiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetUniformiv(int var0, int var1, long var2, long var4);

    public static void c(int n2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cf;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL20.nglGetShaderSource(n2, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetShaderSource(int var0, int var1, long var2, long var4, long var6);

    public static String l(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cf;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n3);
        GL20.nglGetShaderSource(n2, n3, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void a(int n2, short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cg;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib1s(n2, s2, l2);
    }

    static native void nglVertexAttrib1s(int var0, short var1, long var2);

    public static void b(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ch;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib1f(n2, f2, l2);
    }

    static native void nglVertexAttrib1f(int var0, float var1, long var2);

    public static void a(int n2, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ci;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib1d(n2, d2, l2);
    }

    static native void nglVertexAttrib1d(int var0, double var1, long var3);

    public static void a(int n2, short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cj;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib2s(n2, s2, s3, l2);
    }

    static native void nglVertexAttrib2s(int var0, short var1, short var2, long var3);

    public static void b(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ck;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib2f(n2, f2, f3, l2);
    }

    static native void nglVertexAttrib2f(int var0, float var1, float var2, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cl;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib2d(n2, d2, d3, l2);
    }

    static native void nglVertexAttrib2d(int var0, double var1, double var3, long var5);

    public static void a(int n2, short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cm;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib3s(n2, s2, s3, s4, l2);
    }

    static native void nglVertexAttrib3s(int var0, short var1, short var2, short var3, long var4);

    public static void b(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cn;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib3f(n2, f2, f3, f4, l2);
    }

    static native void nglVertexAttrib3f(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Co;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib3d(n2, d2, d3, d4, l2);
    }

    static native void nglVertexAttrib3d(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cp;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib4s(n2, s2, s3, s4, s5, l2);
    }

    static native void nglVertexAttrib4s(int var0, short var1, short var2, short var3, short var4, long var5);

    public static void b(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cq;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib4f(n2, f2, f3, f4, f5, l2);
    }

    static native void nglVertexAttrib4f(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cr;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib4d(n2, d2, d3, d4, d5, l2);
    }

    static native void nglVertexAttrib4d(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, byte by2, byte by3, byte by4, byte by5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cs;
        org.lwjgl.a.a(l2);
        GL20.nglVertexAttrib4Nub(n2, by2, by3, by4, by5, l2);
    }

    static native void nglVertexAttrib4Nub(int var0, byte var1, byte var2, byte var3, byte var4, long var5);

    public static void a(int n2, int n3, boolean bl2, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ct;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = doubleBuffer;
        }
        GL20.nglVertexAttribPointer(n2, n3, 5130, bl2, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, boolean bl2, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ct;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = floatBuffer;
        }
        GL20.nglVertexAttribPointer(n2, n3, 5126, bl2, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, boolean bl2, boolean bl3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ct;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = byteBuffer;
        }
        GL20.nglVertexAttribPointer(n2, n3, bl2 ? 5121 : 5120, bl3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, boolean bl2, boolean bl3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ct;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = intBuffer;
        }
        GL20.nglVertexAttribPointer(n2, n3, bl2 ? 5125 : 5124, bl3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, boolean bl2, boolean bl3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ct;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = shortBuffer;
        }
        GL20.nglVertexAttribPointer(n2, n3, bl2 ? 5123 : 5122, bl3, n4, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribPointer(int var0, int var1, int var2, boolean var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, boolean bl2, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ct;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        GL20.nglVertexAttribPointerBO(n2, n3, n4, bl2, n5, l2, l3);
    }

    static native void nglVertexAttribPointerBO(int var0, int var1, int var2, boolean var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, boolean bl2, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ct;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = byteBuffer;
        }
        GL20.nglVertexAttribPointer(n2, n3, n4, bl2, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void j(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cu;
        org.lwjgl.a.a(l2);
        GL20.nglEnableVertexAttribArray(n2, l2);
    }

    static native void nglEnableVertexAttribArray(int var0, long var1);

    public static void k(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cv;
        org.lwjgl.a.a(l2);
        GL20.nglDisableVertexAttribArray(n2, l2);
    }

    static native void nglDisableVertexAttribArray(int var0, long var1);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL20.nglGetVertexAttribfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetVertexAttribfv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        GL20.nglGetVertexAttribdv(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetVertexAttribdv(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL20.nglGetVertexAttribiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexAttribiv(int var0, int var1, long var2, long var4);

    public static ByteBuffer a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Cz;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = GL20.nglGetVertexAttribPointerv(n2, n3, l2, l3);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetVertexAttribPointerv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Cz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.x.c());
        GL20.nglGetVertexAttribPointerv2(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetVertexAttribPointerv2(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        GL20.nglBindAttribLocation(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglBindAttribLocation(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CA;
        org.lwjgl.a.a(l2);
        GL20.nglBindAttribLocation(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CB;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.a(intBuffer2, 1);
        org.lwjgl.a.a(intBuffer3, 1);
        org.lwjgl.a.b(byteBuffer);
        GL20.nglGetActiveAttrib(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(intBuffer3), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveAttrib(int var0, int var1, int var2, long var3, long var5, long var7, long var9, long var11);

    public static String b(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        IntBuffer intBuffer2 = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        GL20.nglGetActiveAttrib(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer2), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, intBuffer.position() + 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer2.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static String c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CB;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        GL20.nglGetActiveAttrib(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a((Buffer)org.lwjgl.opengl.i.a(dt2)), org.lwjgl.o.a(org.lwjgl.opengl.i.a(dt2), 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static int m(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CB;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL20.nglGetActiveAttrib(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, 1), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static int n(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CB;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL20.nglGetActiveAttrib(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer, 1), org.lwjgl.o.a(intBuffer), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static int c(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = GL20.nglGetAttribLocation(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetAttribLocation(int var0, long var1, long var3);

    public static int c(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CC;
        org.lwjgl.a.a(l2);
        int n3 = GL20.nglGetAttribLocation(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL20.nglDrawBuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDrawBuffers(int var0, long var1, long var3);

    public static void l(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CD;
        org.lwjgl.a.a(l2);
        GL20.nglDrawBuffers(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CE;
        org.lwjgl.a.a(l2);
        GL20.nglStencilOpSeparate(n2, n3, n4, n5, l2);
    }

    static native void nglStencilOpSeparate(int var0, int var1, int var2, int var3, long var4);

    public static void c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CF;
        org.lwjgl.a.a(l2);
        GL20.nglStencilFuncSeparate(n2, n3, n4, n5, l2);
    }

    static native void nglStencilFuncSeparate(int var0, int var1, int var2, int var3, long var4);

    public static void o(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CG;
        org.lwjgl.a.a(l2);
        GL20.nglStencilMaskSeparate(n2, n3, l2);
    }

    static native void nglStencilMaskSeparate(int var0, int var1, long var2);

    public static void p(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CH;
        org.lwjgl.a.a(l2);
        GL20.nglBlendEquationSeparate(n2, n3, l2);
    }

    static native void nglBlendEquationSeparate(int var0, int var1, long var2);
}

