/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;

public final class NVPathRendering {
    public static final int a = 0;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 8;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 11;
    public static final int l = 12;
    public static final int m = 13;
    public static final int n = 14;
    public static final int o = 15;
    public static final int p = 16;
    public static final int q = 17;
    public static final int r = 18;
    public static final int s = 19;
    public static final int t = 20;
    public static final int u = 21;
    public static final int v = 22;
    public static final int w = 23;
    public static final int x = 24;
    public static final int y = 25;
    public static final int z = 248;
    public static final int A = 250;
    public static final int B = 252;
    public static final int C = 254;
    public static final int D = 255;
    public static final int E = 36976;
    public static final int F = 36977;
    public static final int G = 36978;
    public static final int H = 36979;
    public static final int I = 36980;
    public static final int J = 37033;
    public static final int K = 37034;
    public static final int L = 36981;
    public static final int M = 36983;
    public static final int N = 36984;
    public static final int O = 36985;
    public static final int P = 36986;
    public static final int Q = 36988;
    public static final int R = 36989;
    public static final int S = 36990;
    public static final int T = 36991;
    public static final int U = 37044;
    public static final int V = 36992;
    public static final int W = 36993;
    public static final int X = 36994;
    public static final int Y = 36995;
    public static final int Z = 36996;
    public static final int aa = 36982;
    public static final int ab = 36987;
    public static final int ac = 37000;
    public static final int ad = 37001;
    public static final int ae = 34167;
    public static final int af = 34092;
    public static final int ag = 34093;
    public static final int ah = 37002;
    public static final int ai = 37003;
    public static final int aj = 37005;
    public static final int ak = 37006;
    public static final int al = 37007;
    public static final int am = 37008;
    public static final int an = 37009;
    public static final int ao = 37010;
    public static final int ap = 37012;
    public static final int aq = 37014;
    public static final int ar = 37016;
    public static final int as = 37018;
    public static final int at = 37019;
    public static final int au = 37020;
    public static final int av = 37021;
    public static final int aw = 37022;
    public static final int ax = 37023;
    public static final int ay = 37024;
    public static final int az = 37025;
    public static final int aA = 37026;
    public static final int aB = 37027;
    public static final int aC = 37028;
    public static final int aD = 37029;
    public static final int aE = 37030;
    public static final int aF = 37031;
    public static final int aG = 37032;
    public static final int aH = 37045;
    public static final int aI = 37046;
    public static final int aJ = 1;
    public static final int aK = 2;
    public static final int aL = 37035;
    public static final int aM = 37036;
    public static final int aN = 37047;
    public static final int aO = 37048;
    public static final int aP = 37049;
    public static final int aQ = 37053;
    public static final int aR = 37054;
    public static final int aS = 37055;
    public static final int aT = 1;
    public static final int aU = 2;
    public static final int aV = 4;
    public static final int aW = 8;
    public static final int aX = 16;
    public static final int aY = 32;
    public static final int aZ = 64;
    public static final int ba = 128;
    public static final int bb = 256;
    public static final int bc = 65536;
    public static final int bd = 131072;
    public static final int be = 262144;
    public static final int bf = 524288;
    public static final int bg = 0x100000;
    public static final int bh = 0x200000;
    public static final int bi = 0x400000;
    public static final int bj = 0x800000;
    public static final int bk = 0x1000000;
    public static final int bl = 0x2000000;
    public static final int bm = 0x4000000;
    public static final int bn = 0x8000000;
    public static final int bo = 0x10000000;
    public static final int bp = 37037;
    public static final int bq = 37038;
    public static final int br = 37039;
    public static final int bs = 37040;
    public static final int bt = 37041;
    public static final int bu = 37042;
    public static final int bv = 37043;

    private NVPathRendering() {
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        NVPathRendering.nglPathCommandsNV(n2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), byteBuffer2.remaining(), n3, org.lwjgl.o.a(byteBuffer2), l2);
    }

    static native void nglPathCommandsNV(int var0, int var1, long var2, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVPathRendering.nglPathCoordsNV(n2, byteBuffer.remaining(), n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglPathCoordsNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, int n5, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        NVPathRendering.nglPathSubCommandsNV(n2, n3, n4, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), byteBuffer2.remaining(), n5, org.lwjgl.o.a(byteBuffer2), l2);
    }

    static native void nglPathSubCommandsNV(int var0, int var1, int var2, int var3, long var4, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVPathRendering.nglPathSubCoordsNV(n2, n3, byteBuffer.remaining(), n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglPathSubCoordsNV(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVPathRendering.nglPathStringNV(n2, n3, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglPathStringNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4, int n5, ByteBuffer byteBuffer2, int n6, int n7, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        NVPathRendering.nglPathGlyphsNV(n2, n3, org.lwjgl.o.a(byteBuffer), n4, byteBuffer2.remaining() / ft.a(n5), n5, org.lwjgl.o.a(byteBuffer2), n6, n7, f2, l2);
    }

    static native void nglPathGlyphsNV(int var0, int var1, long var2, int var4, int var5, int var6, long var7, int var9, int var10, float var11, long var12);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4, int n5, int n6, int n7, int n8, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        NVPathRendering.nglPathGlyphRangeNV(n2, n3, org.lwjgl.o.a(byteBuffer), n4, n5, n6, n7, n8, f2, l2);
    }

    static native void nglPathGlyphRangeNV(int var0, int var1, long var2, int var4, int var5, int var6, int var7, int var8, float var9, long var10);

    public static void a(int n2, IntBuffer intBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer, intBuffer.remaining());
        NVPathRendering.nglWeightPathsNV(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglWeightPathsNV(int var0, int var1, long var2, long var4, long var6);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OK;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglCopyPathNV(n2, n3, l2);
    }

    static native void nglCopyPathNV(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OL;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglInterpolatePathsNV(n2, n3, n4, f2, l2);
    }

    static native void nglInterpolatePathsNV(int var0, int var1, int var2, float var3, long var4);

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OM;
        org.lwjgl.a.a(l2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.c(n4));
        }
        NVPathRendering.nglTransformPathNV(n2, n3, n4, org.lwjgl.o.b(floatBuffer), l2);
    }

    static native void nglTransformPathNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ON;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVPathRendering.nglPathParameterivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglPathParameterivNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OO;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglPathParameteriNV(n2, n3, n4, l2);
    }

    static native void nglPathParameteriNV(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVPathRendering.nglPathParameterfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglPathParameterfvNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OQ;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglPathParameterfNV(n2, n3, f2, l2);
    }

    static native void nglPathParameterfNV(int var0, int var1, float var2, long var3);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVPathRendering.nglPathDashArrayNV(n2, floatBuffer.remaining(), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglPathDashArrayNV(int var0, int var1, long var2, long var4);

    public static int a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OS;
        org.lwjgl.a.a(l2);
        int n3 = NVPathRendering.nglGenPathsNV(n2, l2);
        return n3;
    }

    static native int nglGenPathsNV(int var0, long var1);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OT;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglDeletePathsNV(n2, n3, l2);
    }

    static native void nglDeletePathsNV(int var0, int var1, long var2);

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OU;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVPathRendering.nglIsPathNV(n2, l2);
        return bl2;
    }

    static native boolean nglIsPathNV(int var0, long var1);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OV;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglPathStencilFuncNV(n2, n3, n4, l2);
    }

    static native void nglPathStencilFuncNV(int var0, int var1, int var2, long var3);

    public static void a(float f2, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OW;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglPathStencilDepthOffsetNV(f2, n2, l2);
    }

    static native void nglPathStencilDepthOffsetNV(float var0, int var1, long var2);

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OX;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglStencilFillPathNV(n2, n3, n4, l2);
    }

    static native void nglStencilFillPathNV(int var0, int var1, int var2, long var3);

    public static void d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OY;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglStencilStrokePathNV(n2, n3, n4, l2);
    }

    static native void nglStencilStrokePathNV(int var0, int var1, int var2, long var3);

    public static void a(int n2, ByteBuffer byteBuffer, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.c(n6));
        }
        NVPathRendering.nglStencilFillPathInstancedNV(byteBuffer.remaining() / ft.b(n2), n2, org.lwjgl.o.a(byteBuffer), n3, n4, n5, n6, org.lwjgl.o.b(floatBuffer), l2);
    }

    static native void nglStencilFillPathInstancedNV(int var0, int var1, long var2, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, ByteBuffer byteBuffer, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pa;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.c(n6));
        }
        NVPathRendering.nglStencilStrokePathInstancedNV(byteBuffer.remaining() / ft.b(n2), n2, org.lwjgl.o.a(byteBuffer), n3, n4, n5, n6, org.lwjgl.o.b(floatBuffer), l2);
    }

    static native void nglStencilStrokePathInstancedNV(int var0, int var1, long var2, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pb;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglPathCoverDepthFuncNV(n2, l2);
    }

    static native void nglPathCoverDepthFuncNV(int var0, long var1);

    public static void b(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pc;
        org.lwjgl.a.a(l2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.a(n3, n4));
        }
        NVPathRendering.nglPathColorGenNV(n2, n3, n4, org.lwjgl.o.b(floatBuffer), l2);
    }

    static native void nglPathColorGenNV(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pd;
        org.lwjgl.a.a(l2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer);
        }
        NVPathRendering.nglPathTexGenNV(n2, n3, ft.a(floatBuffer, n3), org.lwjgl.o.b(floatBuffer), l2);
    }

    static native void nglPathTexGenNV(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pe;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglPathFogGenNV(n2, l2);
    }

    static native void nglPathFogGenNV(int var0, long var1);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pf;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglCoverFillPathNV(n2, n3, l2);
    }

    static native void nglCoverFillPathNV(int var0, int var1, long var2);

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pg;
        org.lwjgl.a.a(l2);
        NVPathRendering.nglCoverStrokePathNV(n2, n3, l2);
    }

    static native void nglCoverStrokePathNV(int var0, int var1, long var2);

    public static void a(int n2, ByteBuffer byteBuffer, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ph;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.c(n5));
        }
        NVPathRendering.nglCoverFillPathInstancedNV(byteBuffer.remaining() / ft.b(n2), n2, org.lwjgl.o.a(byteBuffer), n3, n4, n5, org.lwjgl.o.b(floatBuffer), l2);
    }

    static native void nglCoverFillPathInstancedNV(int var0, int var1, long var2, int var4, int var5, int var6, long var7, long var9);

    public static void b(int n2, ByteBuffer byteBuffer, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, ft.c(n5));
        }
        NVPathRendering.nglCoverStrokePathInstancedNV(byteBuffer.remaining() / ft.b(n2), n2, org.lwjgl.o.a(byteBuffer), n3, n4, n5, org.lwjgl.o.b(floatBuffer), l2);
    }

    static native void nglCoverStrokePathInstancedNV(int var0, int var1, long var2, int var4, int var5, int var6, long var7, long var9);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVPathRendering.nglGetPathParameterivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetPathParameterivNV(int var0, int var1, long var2, long var4);

    public static int e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pj;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVPathRendering.nglGetPathParameterivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVPathRendering.nglGetPathParameterfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPathParameterfvNV(int var0, int var1, long var2, long var4);

    public static float f(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pk;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        NVPathRendering.nglGetPathParameterfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVPathRendering.nglGetPathCommandsNV(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetPathCommandsNV(int var0, long var1, long var3);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pm;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVPathRendering.nglGetPathCoordsNV(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPathCoordsNV(int var0, long var1, long var3);

    public static void c(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVPathRendering.nglGetPathDashArrayNV(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPathDashArrayNV(int var0, long var1, long var3);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Po;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer, ft.b(n2, n5));
        NVPathRendering.nglGetPathMetricsNV(n2, byteBuffer.remaining() / ft.b(n3), n3, org.lwjgl.o.a(byteBuffer), n4, n5, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPathMetricsNV(int var0, int var1, int var2, long var3, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, ft.b(n2, n5));
        NVPathRendering.nglGetPathMetricRangeNV(n2, n3, n4, n5, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPathMetricRangeNV(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4, float f2, float f3, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pq;
        org.lwjgl.a.a(l2);
        int n6 = byteBuffer.remaining() / ft.b(n3);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer, n6 - 1);
        NVPathRendering.nglGetPathSpacingNV(n2, n6, n3, org.lwjgl.o.a(byteBuffer), n4, f2, f3, n5, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPathSpacingNV(int var0, int var1, int var2, long var3, int var5, float var6, float var7, int var8, long var9, long var11);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 16);
        NVPathRendering.nglGetPathColorGenivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetPathColorGenivNV(int var0, int var1, long var2, long var4);

    public static int g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pr;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVPathRendering.nglGetPathColorGenivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ps;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        NVPathRendering.nglGetPathColorGenfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPathColorGenfvNV(int var0, int var1, long var2, long var4);

    public static float h(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ps;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        NVPathRendering.nglGetPathColorGenfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pt;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 16);
        NVPathRendering.nglGetPathTexGenivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetPathTexGenivNV(int var0, int var1, long var2, long var4);

    public static int i(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pt;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVPathRendering.nglGetPathTexGenivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void e(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        NVPathRendering.nglGetPathTexGenfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPathTexGenfvNV(int var0, int var1, long var2, long var4);

    public static float j(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pu;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        NVPathRendering.nglGetPathTexGenfvNV(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static boolean a(int n2, int n3, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pv;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVPathRendering.nglIsPointInFillPathNV(n2, n3, f2, f3, l2);
        return bl2;
    }

    static native boolean nglIsPointInFillPathNV(int var0, int var1, float var2, float var3, long var4);

    public static boolean a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pw;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVPathRendering.nglIsPointInStrokePathNV(n2, f2, f3, l2);
        return bl2;
    }

    static native boolean nglIsPointInStrokePathNV(int var0, float var1, float var2, long var3);

    public static float e(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Px;
        org.lwjgl.a.a(l2);
        float f2 = NVPathRendering.nglGetPathLengthNV(n2, n3, n4, l2);
        return f2;
    }

    static native float nglGetPathLengthNV(int var0, int var1, int var2, long var3);

    public static boolean a(int n2, int n3, int n4, float f2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, FloatBuffer floatBuffer3, FloatBuffer floatBuffer4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Py;
        org.lwjgl.a.a(l2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, 1);
        }
        if (floatBuffer2 != null) {
            org.lwjgl.a.a(floatBuffer2, 1);
        }
        if (floatBuffer3 != null) {
            org.lwjgl.a.a(floatBuffer3, 1);
        }
        if (floatBuffer4 != null) {
            org.lwjgl.a.a(floatBuffer4, 1);
        }
        boolean bl2 = NVPathRendering.nglPointAlongPathNV(n2, n3, n4, f2, org.lwjgl.o.b(floatBuffer), org.lwjgl.o.b(floatBuffer2), org.lwjgl.o.b(floatBuffer3), org.lwjgl.o.b(floatBuffer4), l2);
        return bl2;
    }

    static native boolean nglPointAlongPathNV(int var0, int var1, int var2, float var3, long var4, long var6, long var8, long var10, long var12);
}

