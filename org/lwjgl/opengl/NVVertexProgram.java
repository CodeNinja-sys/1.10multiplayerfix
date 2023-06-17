/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

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
import org.lwjgl.opengl.NVProgram;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.is;

public final class NVVertexProgram
extends NVProgram {
    public static final int a = 34336;
    public static final int b = 34370;
    public static final int c = 34371;
    public static final int d = 34337;
    public static final int e = 34339;
    public static final int l = 34340;
    public static final int m = 34341;
    public static final int n = 34342;
    public static final int o = 34372;
    public static final int p = 34373;
    public static final int q = 34376;
    public static final int r = 34377;
    public static final int s = 34350;
    public static final int t = 34351;
    public static final int u = 34368;
    public static final int v = 34369;
    public static final int w = 34378;
    public static final int x = 34345;
    public static final int y = 34352;
    public static final int z = 34353;
    public static final int A = 34354;
    public static final int B = 34355;
    public static final int C = 34356;
    public static final int D = 34357;
    public static final int E = 34358;
    public static final int F = 34359;
    public static final int G = 34346;
    public static final int H = 34347;
    public static final int I = 34348;
    public static final int J = 34349;
    public static final int K = 34384;
    public static final int L = 34385;
    public static final int M = 34386;
    public static final int N = 34387;
    public static final int O = 34388;
    public static final int P = 34389;
    public static final int Q = 34390;
    public static final int R = 34391;
    public static final int S = 34392;
    public static final int T = 34393;
    public static final int U = 34394;
    public static final int V = 34395;
    public static final int W = 34396;
    public static final int X = 34397;
    public static final int Y = 34398;
    public static final int Z = 34399;
    public static final int aa = 34400;
    public static final int ab = 34401;
    public static final int ac = 34402;
    public static final int ad = 34403;
    public static final int ae = 34404;
    public static final int af = 34405;
    public static final int ag = 34406;
    public static final int ah = 34407;
    public static final int ai = 34408;
    public static final int aj = 34409;
    public static final int ak = 34410;
    public static final int al = 34411;
    public static final int am = 34412;
    public static final int an = 34413;
    public static final int ao = 34414;
    public static final int ap = 34415;
    public static final int aq = 34416;
    public static final int ar = 34417;
    public static final int as = 34418;
    public static final int at = 34419;
    public static final int au = 34420;
    public static final int av = 34421;
    public static final int aw = 34422;
    public static final int ax = 34423;
    public static final int ay = 34424;
    public static final int az = 34425;
    public static final int aA = 34426;
    public static final int aB = 34427;
    public static final int aC = 34428;
    public static final int aD = 34429;
    public static final int aE = 34430;
    public static final int aF = 34431;

    private NVVertexProgram() {
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVVertexProgram.nglExecuteProgramNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglExecuteProgramNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVVertexProgram.nglGetProgramParameterfvNV(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetProgramParameterfvNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        NVVertexProgram.nglGetProgramParameterdvNV(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetProgramParameterdvNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVVertexProgram.nglGetTrackMatrixivNV(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTrackMatrixivNV(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVVertexProgram.nglGetVertexAttribfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetVertexAttribfvNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        NVVertexProgram.nglGetVertexAttribdvNV(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetVertexAttribdvNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVVertexProgram.nglGetVertexAttribivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexAttribivNV(int var0, int var1, long var2, long var4);

    public static ByteBuffer a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.RL;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = NVVertexProgram.nglGetVertexAttribPointervNV(n2, n3, l2, l3);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetVertexAttribPointervNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RM;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglProgramParameter4fNV(n2, n3, f2, f3, f4, f5, l2);
    }

    static native void nglProgramParameter4fNV(int var0, int var1, float var2, float var3, float var4, float var5, long var6);

    public static void a(int n2, int n3, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RN;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglProgramParameter4dNV(n2, n3, d2, d3, d4, d5, l2);
    }

    static native void nglProgramParameter4dNV(int var0, int var1, double var2, double var4, double var6, double var8, long var10);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVVertexProgram.nglProgramParameters4fvNV(n2, n3, floatBuffer.remaining() >> 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglProgramParameters4fvNV(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        NVVertexProgram.nglProgramParameters4dvNV(n2, n3, doubleBuffer.remaining() >> 2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglProgramParameters4dvNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RQ;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglTrackMatrixNV(n2, n3, n4, n5, l2);
    }

    static native void nglTrackMatrixNV(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RR;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = doubleBuffer;
        }
        NVVertexProgram.nglVertexAttribPointerNV(n2, n3, n4, n5, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RR;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = floatBuffer;
        }
        NVVertexProgram.nglVertexAttribPointerNV(n2, n3, n4, n5, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RR;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = byteBuffer;
        }
        NVVertexProgram.nglVertexAttribPointerNV(n2, n3, n4, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RR;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = intBuffer;
        }
        NVVertexProgram.nglVertexAttribPointerNV(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RR;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = shortBuffer;
        }
        NVVertexProgram.nglVertexAttribPointerNV(n2, n3, n4, n5, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribPointerNV(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.RR;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        NVVertexProgram.nglVertexAttribPointerNVBO(n2, n3, n4, n5, l2, l3);
    }

    static native void nglVertexAttribPointerNVBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RS;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib1sNV(n2, s2, l2);
    }

    static native void nglVertexAttrib1sNV(int var0, short var1, long var2);

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RT;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib1fNV(n2, f2, l2);
    }

    static native void nglVertexAttrib1fNV(int var0, float var1, long var2);

    public static void a(int n2, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RU;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib1dNV(n2, d2, l2);
    }

    static native void nglVertexAttrib1dNV(int var0, double var1, long var3);

    public static void a(int n2, short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RV;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib2sNV(n2, s2, s3, l2);
    }

    static native void nglVertexAttrib2sNV(int var0, short var1, short var2, long var3);

    public static void a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RW;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib2fNV(n2, f2, f3, l2);
    }

    static native void nglVertexAttrib2fNV(int var0, float var1, float var2, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RX;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib2dNV(n2, d2, d3, l2);
    }

    static native void nglVertexAttrib2dNV(int var0, double var1, double var3, long var5);

    public static void a(int n2, short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RY;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib3sNV(n2, s2, s3, s4, l2);
    }

    static native void nglVertexAttrib3sNV(int var0, short var1, short var2, short var3, long var4);

    public static void a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RZ;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib3fNV(n2, f2, f3, f4, l2);
    }

    static native void nglVertexAttrib3fNV(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sa;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib3dNV(n2, d2, d3, d4, l2);
    }

    static native void nglVertexAttrib3dNV(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sb;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib4sNV(n2, s2, s3, s4, s5, l2);
    }

    static native void nglVertexAttrib4sNV(int var0, short var1, short var2, short var3, short var4, long var5);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sc;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib4fNV(n2, f2, f3, f4, f5, l2);
    }

    static native void nglVertexAttrib4fNV(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sd;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib4dNV(n2, d2, d3, d4, d5, l2);
    }

    static native void nglVertexAttrib4dNV(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, byte by2, byte by3, byte by4, byte by5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Se;
        org.lwjgl.a.a(l2);
        NVVertexProgram.nglVertexAttrib4ubNV(n2, by2, by3, by4, by5, l2);
    }

    static native void nglVertexAttrib4ubNV(int var0, byte var1, byte var2, byte var3, byte var4, long var5);

    public static void a(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVVertexProgram.nglVertexAttribs1svNV(n2, shortBuffer.remaining(), org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribs1svNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVVertexProgram.nglVertexAttribs1fvNV(n2, floatBuffer.remaining(), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglVertexAttribs1fvNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        NVVertexProgram.nglVertexAttribs1dvNV(n2, doubleBuffer.remaining(), org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribs1dvNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Si;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVVertexProgram.nglVertexAttribs2svNV(n2, shortBuffer.remaining() >> 1, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribs2svNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVVertexProgram.nglVertexAttribs2fvNV(n2, floatBuffer.remaining() >> 1, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglVertexAttribs2fvNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        NVVertexProgram.nglVertexAttribs2dvNV(n2, doubleBuffer.remaining() >> 1, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribs2dvNV(int var0, int var1, long var2, long var4);

    public static void c(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVVertexProgram.nglVertexAttribs3svNV(n2, shortBuffer.remaining() / 3, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribs3svNV(int var0, int var1, long var2, long var4);

    public static void c(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sm;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVVertexProgram.nglVertexAttribs3fvNV(n2, floatBuffer.remaining() / 3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglVertexAttribs3fvNV(int var0, int var1, long var2, long var4);

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        NVVertexProgram.nglVertexAttribs3dvNV(n2, doubleBuffer.remaining() / 3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribs3dvNV(int var0, int var1, long var2, long var4);

    public static void d(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.So;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVVertexProgram.nglVertexAttribs4svNV(n2, shortBuffer.remaining() >> 2, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribs4svNV(int var0, int var1, long var2, long var4);

    public static void d(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVVertexProgram.nglVertexAttribs4fvNV(n2, floatBuffer.remaining() >> 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglVertexAttribs4fvNV(int var0, int var1, long var2, long var4);

    public static void d(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        NVVertexProgram.nglVertexAttribs4dvNV(n2, doubleBuffer.remaining() >> 2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribs4dvNV(int var0, int var1, long var2, long var4);
}

