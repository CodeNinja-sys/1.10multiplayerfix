/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
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

public final class GL30 {
    public static final int a = 33307;
    public static final int b = 33308;
    public static final int c = 33309;
    public static final int d = 33310;
    public static final int e = 1;
    public static final int f = 33315;
    public static final int g = 33316;
    public static final int h = 33317;
    public static final int i = 33318;
    public static final int j = 34894;
    public static final int k = 12288;
    public static final int l = 12289;
    public static final int m = 12290;
    public static final int n = 12291;
    public static final int o = 12292;
    public static final int p = 12293;
    public static final int q = 12294;
    public static final int r = 12295;
    public static final int s = 3378;
    public static final int t = 35659;
    public static final int u = 37151;
    public static final int v = 37152;
    public static final int w = 37153;
    public static final int x = 35069;
    public static final int y = 36290;
    public static final int z = 36293;
    public static final int A = 36294;
    public static final int B = 36295;
    public static final int C = 36296;
    public static final int D = 36297;
    public static final int E = 36298;
    public static final int F = 36299;
    public static final int G = 36300;
    public static final int H = 36301;
    public static final int I = 36302;
    public static final int J = 36303;
    public static final int K = 36304;
    public static final int L = 36305;
    public static final int M = 36306;
    public static final int N = 36307;
    public static final int O = 36308;
    public static final int P = 36309;
    public static final int Q = 36310;
    public static final int R = 36311;
    public static final int S = 36312;
    public static final int T = 35076;
    public static final int U = 35077;
    public static final int V = 36371;
    public static final int W = 36372;
    public static final int X = 36373;
    public static final int Y = 36374;
    public static final int Z = 1;
    public static final int aa = 2;
    public static final int ab = 4;
    public static final int ac = 8;
    public static final int ad = 16;
    public static final int ae = 32;
    public static final int af = 35098;
    public static final int ag = 35099;
    public static final int ah = 35100;
    public static final int ai = 35101;
    public static final int aj = 36012;
    public static final int ak = 36013;
    public static final int al = 36269;
    public static final int am = 35856;
    public static final int an = 35857;
    public static final int ao = 35858;
    public static final int ap = 35859;
    public static final int aq = 35860;
    public static final int ar = 35861;
    public static final int as = 35862;
    public static final int at = 35863;
    public static final int au = 34836;
    public static final int av = 34837;
    public static final int aw = 34838;
    public static final int ax = 34842;
    public static final int ay = 34843;
    public static final int az = 34844;
    public static final int aA = 35898;
    public static final int aB = 35899;
    public static final int aC = 35901;
    public static final int aD = 35902;
    public static final int aE = 35903;
    public static final int aF = 36160;
    public static final int aG = 36008;
    public static final int aH = 36009;
    public static final int aI = 36161;
    public static final int aJ = 36166;
    public static final int aK = 36167;
    public static final int aL = 36168;
    public static final int aM = 36169;
    public static final int aN = 36162;
    public static final int aO = 36163;
    public static final int aP = 36164;
    public static final int aQ = 36176;
    public static final int aR = 36177;
    public static final int aS = 36178;
    public static final int aT = 36179;
    public static final int aU = 36180;
    public static final int aV = 36181;
    public static final int aW = 36048;
    public static final int aX = 36049;
    public static final int aY = 36050;
    public static final int aZ = 36051;
    public static final int ba = 33296;
    public static final int bb = 33297;
    public static final int bc = 33298;
    public static final int bd = 33299;
    public static final int be = 33300;
    public static final int bf = 33301;
    public static final int bg = 33302;
    public static final int bh = 33303;
    public static final int bi = 33304;
    public static final int bj = 33314;
    public static final int bk = 36064;
    public static final int bl = 36065;
    public static final int bm = 36066;
    public static final int bn = 36067;
    public static final int bo = 36068;
    public static final int bp = 36069;
    public static final int bq = 36070;
    public static final int br = 36071;
    public static final int bs = 36072;
    public static final int bt = 36073;
    public static final int bu = 36074;
    public static final int bv = 36075;
    public static final int bw = 36076;
    public static final int bx = 36077;
    public static final int by = 36078;
    public static final int bz = 36079;
    public static final int bA = 36096;
    public static final int bB = 36128;
    public static final int bC = 33306;
    public static final int bD = 36053;
    public static final int bE = 36054;
    public static final int bF = 36055;
    public static final int bG = 36059;
    public static final int bH = 36060;
    public static final int bI = 36061;
    public static final int bJ = 33305;
    public static final int bK = 36006;
    public static final int bL = 36007;
    public static final int bM = 36063;
    public static final int bN = 34024;
    public static final int bO = 1286;
    public static final int bP = 5131;
    public static final int bQ = 36011;
    public static final int bR = 36182;
    public static final int bS = 36183;
    public static final int bT = 36006;
    public static final int bU = 36010;
    public static final int bV = 36254;
    public static final int bW = 36208;
    public static final int bX = 36209;
    public static final int bY = 36210;
    public static final int bZ = 36214;
    public static final int ca = 36215;
    public static final int cb = 36216;
    public static final int cc = 36220;
    public static final int cd = 36221;
    public static final int ce = 36222;
    public static final int cf = 36226;
    public static final int cg = 36227;
    public static final int ch = 36228;
    public static final int ci = 36232;
    public static final int cj = 36233;
    public static final int ck = 36234;
    public static final int cl = 36238;
    public static final int cm = 36239;
    public static final int cn = 36240;
    public static final int co = 36244;
    public static final int cp = 36245;
    public static final int cq = 36246;
    public static final int cr = 36247;
    public static final int cs = 36248;
    public static final int ct = 36249;
    public static final int cu = 36250;
    public static final int cv = 36251;
    public static final int cw = 35864;
    public static final int cx = 35866;
    public static final int cy = 35867;
    public static final int cz = 35865;
    public static final int cA = 35868;
    public static final int cB = 35869;
    public static final int cC = 35071;
    public static final int cD = 34894;
    public static final int cE = 36052;
    public static final int cF = 36288;
    public static final int cG = 36289;
    public static final int cH = 36291;
    public static final int cI = 36292;
    public static final int cJ = 34041;
    public static final int cK = 34042;
    public static final int cL = 35056;
    public static final int cM = 35057;
    public static final int cN = 36283;
    public static final int cO = 36284;
    public static final int cP = 36285;
    public static final int cQ = 36286;
    public static final int cR = 33321;
    public static final int cS = 33322;
    public static final int cT = 33323;
    public static final int cU = 33324;
    public static final int cV = 33325;
    public static final int cW = 33326;
    public static final int cX = 33327;
    public static final int cY = 33328;
    public static final int cZ = 33329;
    public static final int da = 33330;
    public static final int db = 33331;
    public static final int dc = 33332;
    public static final int dd = 33333;
    public static final int de = 33334;
    public static final int df = 33335;
    public static final int dg = 33336;
    public static final int dh = 33337;
    public static final int di = 33338;
    public static final int dj = 33339;
    public static final int dk = 33340;
    public static final int dl = 33319;
    public static final int dm = 33320;
    public static final int dn = 35982;
    public static final int do = 35972;
    public static final int dp = 35973;
    public static final int dq = 35983;
    public static final int dr = 35980;
    public static final int ds = 35981;
    public static final int dt = 35975;
    public static final int du = 35976;
    public static final int dv = 35977;
    public static final int dw = 35978;
    public static final int dx = 35979;
    public static final int dy = 35968;
    public static final int dz = 35971;
    public static final int dA = 35967;
    public static final int dB = 35958;
    public static final int dC = 34229;
    public static final int dD = 36281;
    public static final int dE = 36282;

    private GL30() {
    }

    public static String a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CO;
        org.lwjgl.a.a(l2);
        String string = GL30.nglGetStringi(n2, n3, l2);
        return string;
    }

    static native String nglGetStringi(int var0, int var1, long var2);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL30.nglClearBufferfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglClearBufferfv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglClearBufferiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglClearBufferiv(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglClearBufferuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglClearBufferuiv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, float f2, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CS;
        org.lwjgl.a.a(l2);
        GL30.nglClearBufferfi(n2, n3, f2, n4, l2);
    }

    static native void nglClearBufferfi(int var0, int var1, float var2, int var3, long var4);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CT;
        org.lwjgl.a.a(l2);
        GL30.nglVertexAttribI1i(n2, n3, l2);
    }

    static native void nglVertexAttribI1i(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CU;
        org.lwjgl.a.a(l2);
        GL30.nglVertexAttribI2i(n2, n3, n4, l2);
    }

    static native void nglVertexAttribI2i(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CV;
        org.lwjgl.a.a(l2);
        GL30.nglVertexAttribI3i(n2, n3, n4, n5, l2);
    }

    static native void nglVertexAttribI3i(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CW;
        org.lwjgl.a.a(l2);
        GL30.nglVertexAttribI4i(n2, n3, n4, n5, n6, l2);
    }

    static native void nglVertexAttribI4i(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CX;
        org.lwjgl.a.a(l2);
        GL30.nglVertexAttribI1ui(n2, n3, l2);
    }

    static native void nglVertexAttribI1ui(int var0, int var1, long var2);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CY;
        org.lwjgl.a.a(l2);
        GL30.nglVertexAttribI2ui(n2, n3, n4, l2);
    }

    static native void nglVertexAttribI2ui(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.CZ;
        org.lwjgl.a.a(l2);
        GL30.nglVertexAttribI3ui(n2, n3, n4, n5, l2);
    }

    static native void nglVertexAttribI3ui(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Da;
        org.lwjgl.a.a(l2);
        GL30.nglVertexAttribI4ui(n2, n3, n4, n5, n6, l2);
    }

    static native void nglVertexAttribI4ui(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Db;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL30.nglVertexAttribI1iv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI1iv(int var0, long var1, long var3);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        GL30.nglVertexAttribI2iv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI2iv(int var0, long var1, long var3);

    public static void c(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL30.nglVertexAttribI3iv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI3iv(int var0, long var1, long var3);

    public static void d(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.De;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglVertexAttribI4iv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI4iv(int var0, long var1, long var3);

    public static void e(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Df;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL30.nglVertexAttribI1uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI1uiv(int var0, long var1, long var3);

    public static void f(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        GL30.nglVertexAttribI2uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI2uiv(int var0, long var1, long var3);

    public static void g(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL30.nglVertexAttribI3uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI3uiv(int var0, long var1, long var3);

    public static void h(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Di;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglVertexAttribI4uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI4uiv(int var0, long var1, long var3);

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        GL30.nglVertexAttribI4bv(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglVertexAttribI4bv(int var0, long var1, long var3);

    public static void a(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, 4);
        GL30.nglVertexAttribI4sv(n2, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribI4sv(int var0, long var1, long var3);

    public static void b(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        GL30.nglVertexAttribI4ubv(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglVertexAttribI4ubv(int var0, long var1, long var3);

    public static void b(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dm;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, 4);
        GL30.nglVertexAttribI4usv(n2, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribI4usv(int var0, long var1, long var3);

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dn;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = byteBuffer;
        }
        GL30.nglVertexAttribIPointer(n2, n3, n4, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dn;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = intBuffer;
        }
        GL30.nglVertexAttribIPointer(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dn;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = shortBuffer;
        }
        GL30.nglVertexAttribIPointer(n2, n3, n4, n5, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribIPointer(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Dn;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        GL30.nglVertexAttribIPointerBO(n2, n3, n4, n5, l2, l3);
    }

    static native void nglVertexAttribIPointerBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Do;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglGetVertexAttribIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexAttribIiv(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglGetVertexAttribIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexAttribIuiv(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dq;
        org.lwjgl.a.a(l2);
        GL30.nglUniform1ui(n2, n3, l2);
    }

    static native void nglUniform1ui(int var0, int var1, long var2);

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dr;
        org.lwjgl.a.a(l2);
        GL30.nglUniform2ui(n2, n3, n4, l2);
    }

    static native void nglUniform2ui(int var0, int var1, int var2, long var3);

    public static void c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ds;
        org.lwjgl.a.a(l2);
        GL30.nglUniform3ui(n2, n3, n4, n5, l2);
    }

    static native void nglUniform3ui(int var0, int var1, int var2, int var3, long var4);

    public static void c(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dt;
        org.lwjgl.a.a(l2);
        GL30.nglUniform4ui(n2, n3, n4, n5, n6, l2);
    }

    static native void nglUniform4ui(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void i(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Du;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglUniform1uiv(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform1uiv(int var0, int var1, long var2, long var4);

    public static void j(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglUniform2uiv(n2, intBuffer.remaining() >> 1, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform2uiv(int var0, int var1, long var2, long var4);

    public static void k(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglUniform3uiv(n2, intBuffer.remaining() / 3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform3uiv(int var0, int var1, long var2, long var4);

    public static void l(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglUniform4uiv(n2, intBuffer.remaining() >> 2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform4uiv(int var0, int var1, long var2, long var4);

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglGetUniformuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetUniformuiv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        GL30.nglBindFragDataLocation(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglBindFragDataLocation(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Dz;
        org.lwjgl.a.a(l2);
        GL30.nglBindFragDataLocation(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
    }

    public static int c(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = GL30.nglGetFragDataLocation(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetFragDataLocation(int var0, long var1, long var3);

    public static int a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DA;
        org.lwjgl.a.a(l2);
        int n3 = GL30.nglGetFragDataLocation(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static void e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DB;
        org.lwjgl.a.a(l2);
        GL30.nglBeginConditionalRender(n2, n3, l2);
    }

    static native void nglBeginConditionalRender(int var0, int var1, long var2);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.DC;
        org.lwjgl.a.a(l2);
        GL30.nglEndConditionalRender(l2);
    }

    static native void nglEndConditionalRender(long var0);

    public static ByteBuffer a(int n2, long l2, long l3, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l4 = dt2.DD;
        org.lwjgl.a.a(l4);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = GL30.nglMapBufferRange(n2, l2, l3, n3, byteBuffer, l4);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapBufferRange(int var0, long var1, long var3, int var5, ByteBuffer var6, long var7);

    public static void a(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.DE;
        org.lwjgl.a.a(l4);
        GL30.nglFlushMappedBufferRange(n2, l2, l3, l4);
    }

    static native void nglFlushMappedBufferRange(int var0, long var1, long var3, long var5);

    public static void f(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DF;
        org.lwjgl.a.a(l2);
        GL30.nglClampColor(n2, n3, l2);
    }

    static native void nglClampColor(int var0, int var1, long var2);

    public static boolean a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DG;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL30.nglIsRenderbuffer(n2, l2);
        return bl2;
    }

    static native boolean nglIsRenderbuffer(int var0, long var1);

    public static void g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DH;
        org.lwjgl.a.a(l2);
        GL30.nglBindRenderbuffer(n2, n3, l2);
    }

    static native void nglBindRenderbuffer(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglDeleteRenderbuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteRenderbuffers(int var0, long var1, long var3);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DI;
        org.lwjgl.a.a(l2);
        GL30.nglDeleteRenderbuffers(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglGenRenderbuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenRenderbuffers(int var0, long var1, long var3);

    public static int b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.DJ;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL30.nglGenRenderbuffers(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DK;
        org.lwjgl.a.a(l2);
        GL30.nglRenderbufferStorage(n2, n3, n4, n5, l2);
    }

    static native void nglRenderbufferStorage(int var0, int var1, int var2, int var3, long var4);

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglGetRenderbufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetRenderbufferParameteriv(int var0, int var1, long var2, long var4);

    public static int h(int n2, int n3) {
        return GL30.i(n2, n3);
    }

    public static int i(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DL;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL30.nglGetRenderbufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DM;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL30.nglIsFramebuffer(n2, l2);
        return bl2;
    }

    static native boolean nglIsFramebuffer(int var0, long var1);

    public static void j(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DN;
        org.lwjgl.a.a(l2);
        GL30.nglBindFramebuffer(n2, n3, l2);
    }

    static native void nglBindFramebuffer(int var0, int var1, long var2);

    public static void c(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglDeleteFramebuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteFramebuffers(int var0, long var1, long var3);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DO;
        org.lwjgl.a.a(l2);
        GL30.nglDeleteFramebuffers(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void d(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglGenFramebuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenFramebuffers(int var0, long var1, long var3);

    public static int c() {
        dt dt2 = GLContext.a();
        long l2 = dt2.DP;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL30.nglGenFramebuffers(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static int e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DQ;
        org.lwjgl.a.a(l2);
        int n3 = GL30.nglCheckFramebufferStatus(n2, l2);
        return n3;
    }

    static native int nglCheckFramebufferStatus(int var0, long var1);

    public static void d(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DR;
        org.lwjgl.a.a(l2);
        GL30.nglFramebufferTexture1D(n2, n3, n4, n5, n6, l2);
    }

    static native void nglFramebufferTexture1D(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void e(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DS;
        org.lwjgl.a.a(l2);
        GL30.nglFramebufferTexture2D(n2, n3, n4, n5, n6, l2);
    }

    static native void nglFramebufferTexture2D(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DT;
        org.lwjgl.a.a(l2);
        GL30.nglFramebufferTexture3D(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglFramebufferTexture3D(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void e(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DU;
        org.lwjgl.a.a(l2);
        GL30.nglFramebufferRenderbuffer(n2, n3, n4, n5, l2);
    }

    static native void nglFramebufferRenderbuffer(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglGetFramebufferAttachmentParameteriv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetFramebufferAttachmentParameteriv(int var0, int var1, int var2, long var3, long var5);

    public static int d(int n2, int n3, int n4) {
        return GL30.e(n2, n3, n4);
    }

    public static int e(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DV;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL30.nglGetFramebufferAttachmentParameteriv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void f(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DW;
        org.lwjgl.a.a(l2);
        GL30.nglGenerateMipmap(n2, l2);
    }

    static native void nglGenerateMipmap(int var0, long var1);

    public static void f(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DX;
        org.lwjgl.a.a(l2);
        GL30.nglRenderbufferStorageMultisample(n2, n3, n4, n5, n6, l2);
    }

    static native void nglRenderbufferStorageMultisample(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DY;
        org.lwjgl.a.a(l2);
        GL30.nglBlitFramebuffer(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2);
    }

    static native void nglBlitFramebuffer(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);

    public static void g(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglTexParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexParameterIiv(int var0, int var1, long var2, long var4);

    public static void f(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.DZ;
        org.lwjgl.a.a(l2);
        GL30.nglTexParameterIiv(n2, n3, org.lwjgl.opengl.i.c(dt2, n4), l2);
    }

    public static void h(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ea;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglTexParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexParameterIuiv(int var0, int var1, long var2, long var4);

    public static void g(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ea;
        org.lwjgl.a.a(l2);
        GL30.nglTexParameterIuiv(n2, n3, org.lwjgl.opengl.i.c(dt2, n4), l2);
    }

    public static void i(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglGetTexParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTexParameterIiv(int var0, int var1, long var2, long var4);

    public static int k(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eb;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL30.nglGetTexParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void j(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ec;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglGetTexParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTexParameterIuiv(int var0, int var1, long var2, long var4);

    public static int l(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ec;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL30.nglGetTexParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void g(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ed;
        org.lwjgl.a.a(l2);
        GL30.nglFramebufferTextureLayer(n2, n3, n4, n5, n6, l2);
    }

    static native void nglFramebufferTextureLayer(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ee;
        org.lwjgl.a.a(l2);
        GL30.nglColorMaski(n2, bl2, bl3, bl4, bl5, l2);
    }

    static native void nglColorMaski(int var0, boolean var1, boolean var2, boolean var3, boolean var4, long var5);

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ef;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        GL30.nglGetBooleani_v(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetBooleani_v(int var0, int var1, long var2, long var4);

    public static boolean m(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ef;
        org.lwjgl.a.a(l2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, 1);
        GL30.nglGetBooleani_v(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
        return byteBuffer.get(0) == 1;
    }

    public static void k(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL30.nglGetIntegeri_v(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetIntegeri_v(int var0, int var1, long var2, long var4);

    public static int n(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eg;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL30.nglGetIntegeri_v(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void o(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eh;
        org.lwjgl.a.a(l2);
        GL30.nglEnablei(n2, n3, l2);
    }

    static native void nglEnablei(int var0, int var1, long var2);

    public static void p(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ei;
        org.lwjgl.a.a(l2);
        GL30.nglDisablei(n2, n3, l2);
    }

    static native void nglDisablei(int var0, int var1, long var2);

    public static boolean q(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ej;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL30.nglIsEnabledi(n2, n3, l2);
        return bl2;
    }

    static native boolean nglIsEnabledi(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Ek;
        org.lwjgl.a.a(l4);
        GL30.nglBindBufferRange(n2, n3, n4, l2, l3, l4);
    }

    static native void nglBindBufferRange(int var0, int var1, int var2, long var3, long var5, long var7);

    public static void h(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.El;
        org.lwjgl.a.a(l2);
        GL30.nglBindBufferBase(n2, n3, n4, l2);
    }

    static native void nglBindBufferBase(int var0, int var1, int var2, long var3);

    public static void g(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Em;
        org.lwjgl.a.a(l2);
        GL30.nglBeginTransformFeedback(n2, l2);
    }

    static native void nglBeginTransformFeedback(int var0, long var1);

    public static void d() {
        dt dt2 = GLContext.a();
        long l2 = dt2.En;
        org.lwjgl.a.a(l2);
        GL30.nglEndTransformFeedback(l2);
    }

    static native void nglEndTransformFeedback(long var0);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eo;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer, n3);
        GL30.nglTransformFeedbackVaryings(n2, n3, org.lwjgl.o.a(byteBuffer), n4, l2);
    }

    static native void nglTransformFeedbackVaryings(int var0, int var1, long var2, int var4, long var5);

    public static void a(int n2, CharSequence[] arrcharSequence, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eo;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrcharSequence);
        GL30.nglTransformFeedbackVaryings(n2, arrcharSequence.length, org.lwjgl.opengl.i.b(dt2, arrcharSequence), n3, l2);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ep;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.a(intBuffer2, 1);
        org.lwjgl.a.a(intBuffer3, 1);
        org.lwjgl.a.b(byteBuffer);
        GL30.nglGetTransformFeedbackVarying(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(intBuffer3), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetTransformFeedbackVarying(int var0, int var1, int var2, long var3, long var5, long var7, long var9, long var11);

    public static String a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ep;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        org.lwjgl.a.a(intBuffer2, 1);
        IntBuffer intBuffer3 = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        GL30.nglGetTransformFeedbackVarying(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer3), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer3.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void h(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eq;
        org.lwjgl.a.a(l2);
        is.b(dt2, n2);
        GL30.nglBindVertexArray(n2, l2);
    }

    static native void nglBindVertexArray(int var0, long var1);

    public static void e(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Er;
        org.lwjgl.a.a(l2);
        is.a(dt2, intBuffer);
        org.lwjgl.a.b(intBuffer);
        GL30.nglDeleteVertexArrays(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteVertexArrays(int var0, long var1, long var3);

    public static void i(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Er;
        org.lwjgl.a.a(l2);
        is.c(dt2, n2);
        GL30.nglDeleteVertexArrays(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void f(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Es;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL30.nglGenVertexArrays(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenVertexArrays(int var0, long var1, long var3);

    public static int e() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Es;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL30.nglGenVertexArrays(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean j(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Et;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL30.nglIsVertexArray(n2, l2);
        return bl2;
    }

    static native boolean nglIsVertexArray(int var0, long var1);
}

