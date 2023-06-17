/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.CallbackUtil;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.gf;
import org.lwjgl.opengl.i;
import org.lwjgl.z;

public final class GL43 {
    public static final int a = 33513;
    public static final int b = 34638;
    public static final int c = 37492;
    public static final int d = 37493;
    public static final int e = 37494;
    public static final int f = 37495;
    public static final int g = 37496;
    public static final int h = 37497;
    public static final int i = 37488;
    public static final int j = 37489;
    public static final int k = 37490;
    public static final int l = 37491;
    public static final int m = 36201;
    public static final int n = 36202;
    public static final int o = 36203;
    public static final int p = 37305;
    public static final int q = 37307;
    public static final int r = 37308;
    public static final int s = 37309;
    public static final int t = 33378;
    public static final int u = 33379;
    public static final int v = 33380;
    public static final int w = 33381;
    public static final int x = 33382;
    public static final int y = 37099;
    public static final int z = 37310;
    public static final int A = 37311;
    public static final int B = 33383;
    public static final int C = 37100;
    public static final int D = 37101;
    public static final int E = 37102;
    public static final int F = 37103;
    public static final int G = 32;
    public static final int H = 37600;
    public static final int I = 33346;
    public static final int J = 2;
    public static final int K = 37187;
    public static final int L = 37188;
    public static final int M = 37189;
    public static final int N = 33347;
    public static final int O = 33388;
    public static final int P = 33389;
    public static final int Q = 33512;
    public static final int R = 33348;
    public static final int S = 33349;
    public static final int T = 33350;
    public static final int U = 33351;
    public static final int V = 33352;
    public static final int W = 33353;
    public static final int X = 33354;
    public static final int Y = 33355;
    public static final int Z = 33356;
    public static final int aa = 33357;
    public static final int ab = 33358;
    public static final int ac = 33359;
    public static final int ad = 33360;
    public static final int ae = 33361;
    public static final int af = 33384;
    public static final int ag = 33385;
    public static final int ah = 33386;
    public static final int ai = 37190;
    public static final int aj = 37191;
    public static final int ak = 37192;
    public static final int al = 33387;
    public static final int am = 33504;
    public static final int an = 33505;
    public static final int ao = 33506;
    public static final int ap = 33507;
    public static final int aq = 33508;
    public static final int ar = 33510;
    public static final int as = 33511;
    public static final int at = 33390;
    public static final int au = 37648;
    public static final int av = 37649;
    public static final int aw = 37650;
    public static final int ax = 37651;
    public static final int ay = 37652;
    public static final int az = 37653;
    public static final int aA = 37654;
    public static final int aB = 37655;
    public static final int aC = 37656;
    public static final int aD = 33391;
    public static final int aE = 33392;
    public static final int aF = 33393;
    public static final int aG = 33394;
    public static final int aH = 33395;
    public static final int aI = 33396;
    public static final int aJ = 33397;
    public static final int aK = 33398;
    public static final int aL = 33399;
    public static final int aM = 33400;
    public static final int aN = 33401;
    public static final int aO = 33402;
    public static final int aP = 33403;
    public static final int aQ = 33404;
    public static final int aR = 33405;
    public static final int aS = 33406;
    public static final int aT = 33407;
    public static final int aU = 33408;
    public static final int aV = 33409;
    public static final int aW = 33410;
    public static final int aX = 33411;
    public static final int aY = 33412;
    public static final int aZ = 33413;
    public static final int ba = 33414;
    public static final int bb = 33415;
    public static final int bc = 33416;
    public static final int bd = 33417;
    public static final int be = 33418;
    public static final int bf = 33419;
    public static final int bg = 33420;
    public static final int bh = 33421;
    public static final int bi = 33422;
    public static final int bj = 33423;
    public static final int bk = 33424;
    public static final int bl = 33425;
    public static final int bm = 33426;
    public static final int bn = 33427;
    public static final int bo = 33428;
    public static final int bp = 33429;
    public static final int bq = 33430;
    public static final int br = 33431;
    public static final int bs = 33432;
    public static final int bt = 33433;
    public static final int bu = 33434;
    public static final int bv = 33435;
    public static final int bw = 33436;
    public static final int bx = 33437;
    public static final int by = 33438;
    public static final int bz = 33439;
    public static final int bA = 33440;
    public static final int bB = 33441;
    public static final int bC = 33442;
    public static final int bD = 33443;
    public static final int bE = 33444;
    public static final int bF = 33445;
    public static final int bG = 33446;
    public static final int bH = 33447;
    public static final int bI = 33448;
    public static final int bJ = 33449;
    public static final int bK = 33450;
    public static final int bL = 33452;
    public static final int bM = 33453;
    public static final int bN = 33454;
    public static final int bO = 33455;
    public static final int bP = 33457;
    public static final int bQ = 33458;
    public static final int bR = 33459;
    public static final int bS = 33460;
    public static final int bT = 33461;
    public static final int bU = 33462;
    public static final int bV = 33463;
    public static final int bW = 33464;
    public static final int bX = 33465;
    public static final int bY = 33466;
    public static final int bZ = 33467;
    public static final int ca = 33468;
    public static final int cb = 33469;
    public static final int cc = 33470;
    public static final int cd = 33471;
    public static final int ce = 33472;
    public static final int cf = 33473;
    public static final int cg = 33474;
    public static final int ch = 33475;
    public static final int ci = 33476;
    public static final int cj = 33477;
    public static final int ck = 33478;
    public static final int cl = 33479;
    public static final int cm = 33480;
    public static final int cn = 33481;
    public static final int co = 33482;
    public static final int cp = 33483;
    public static final int cq = 33484;
    public static final int cr = 33485;
    public static final int cs = 33486;
    public static final int ct = 33487;
    public static final int cu = 33488;
    public static final int cv = 33489;
    public static final int cw = 33490;
    public static final int cx = 33491;
    public static final int cy = 37601;
    public static final int cz = 37602;
    public static final int cA = 37603;
    public static final int cB = 37604;
    public static final int cC = 37605;
    public static final int cD = 37606;
    public static final int cE = 37608;
    public static final int cF = 37609;
    public static final int cG = 37610;
    public static final int cH = 37611;
    public static final int cI = 37612;
    public static final int cJ = 37613;
    public static final int cK = 37614;
    public static final int cL = 37615;
    public static final int cM = 37616;
    public static final int cN = 37617;
    public static final int cO = 37618;
    public static final int cP = 37619;
    public static final int cQ = 37620;
    public static final int cR = 37621;
    public static final int cS = 37622;
    public static final int cT = 37623;
    public static final int cU = 37624;
    public static final int cV = 37625;
    public static final int cW = 37626;
    public static final int cX = 37627;
    public static final int cY = 37628;
    public static final int cZ = 37629;
    public static final int da = 37630;
    public static final int db = 37631;
    public static final int dc = 37632;
    public static final int dd = 37633;
    public static final int de = 37634;
    public static final int df = 37635;
    public static final int dg = 37636;
    public static final int dh = 37637;
    public static final int di = 37638;
    public static final int dj = 37639;
    public static final int dk = 37640;
    public static final int dl = 37641;
    public static final int dm = 37642;
    public static final int dn = 37643;
    public static final int do = 37644;
    public static final int dp = 37645;
    public static final int dq = 37646;
    public static final int dr = 37647;
    public static final int ds = 37607;
    public static final int dt = 37074;
    public static final int du = 37075;
    public static final int dv = 37076;
    public static final int dw = 37077;
    public static final int dx = 37078;
    public static final int dy = 37079;
    public static final int dz = 37080;
    public static final int dA = 37081;
    public static final int dB = 37082;
    public static final int dC = 37083;
    public static final int dD = 37084;
    public static final int dE = 37085;
    public static final int dF = 37086;
    public static final int dG = 37087;
    public static final int dH = 8192;
    public static final int dI = 36665;
    public static final int dJ = 37098;
    public static final int dK = 37277;
    public static final int dL = 37278;
    public static final int dM = 37279;
    public static final int dN = 33499;
    public static final int dO = 33500;
    public static final int dP = 33501;
    public static final int dQ = 33502;
    public static final int dR = 33503;
    public static final int dS = 33492;
    public static final int dT = 33493;
    public static final int dU = 33494;
    public static final int dV = 33495;
    public static final int dW = 33496;
    public static final int dX = 33497;
    public static final int dY = 33498;

    private GL43() {
    }

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 1);
        GL43.nglClearBufferData(n2, n3, n4, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglClearBufferData(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, long l2, long l3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l4 = dt2.IV;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.b(byteBuffer, 1);
        GL43.nglClearBufferSubData(n2, n3, l2, l3, n4, n5, org.lwjgl.o.a(byteBuffer), l4);
    }

    static native void nglClearBufferSubData(int var0, int var1, long var2, long var4, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IW;
        org.lwjgl.a.a(l2);
        GL43.nglDispatchCompute(n2, n3, n4, l2);
    }

    static native void nglDispatchCompute(int var0, int var1, int var2, long var3);

    public static void a(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.IX;
        org.lwjgl.a.a(l3);
        GL43.nglDispatchComputeIndirect(l2, l3);
    }

    static native void nglDispatchComputeIndirect(long var0, long var2);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IY;
        org.lwjgl.a.a(l2);
        GL43.nglCopyImageSubData(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, l2);
    }

    static native void nglCopyImageSubData(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, long var15);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IZ;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.b(intBuffer);
        }
        GL43.nglDebugMessageControl(n2, n3, n4, intBuffer == null ? 0 : intBuffer.remaining(), org.lwjgl.o.b(intBuffer), bl2, l2);
    }

    static native void nglDebugMessageControl(int var0, int var1, int var2, int var3, long var4, boolean var6, long var7);

    public static void b(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ja;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL43.nglDebugMessageInsert(n2, n3, n4, n5, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglDebugMessageInsert(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ja;
        org.lwjgl.a.a(l2);
        GL43.nglDebugMessageInsert(n2, n3, n4, n5, charSequence.length(), org.lwjgl.opengl.i.a(dt2, charSequence), l2);
    }

    public static void a(gf gf2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jb;
        org.lwjgl.a.a(l2);
        long l3 = gf2 == null ? 0L : CallbackUtil.a(gf2.d());
        CallbackUtil.c(l3);
        GL43.nglDebugMessageCallback(gf2 == null ? 0L : gf2.a(), l3, l2);
    }

    static native void nglDebugMessageCallback(long var0, long var2, long var4);

    public static int a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, IntBuffer intBuffer4, IntBuffer intBuffer5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jc;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n2);
        }
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, n2);
        }
        if (intBuffer3 != null) {
            org.lwjgl.a.a(intBuffer3, n2);
        }
        if (intBuffer4 != null) {
            org.lwjgl.a.a(intBuffer4, n2);
        }
        if (intBuffer5 != null) {
            org.lwjgl.a.a(intBuffer5, n2);
        }
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        int n3 = GL43.nglGetDebugMessageLog(n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.b(intBuffer2), org.lwjgl.o.b(intBuffer3), org.lwjgl.o.b(intBuffer4), org.lwjgl.o.b(intBuffer5), org.lwjgl.o.b(byteBuffer), l2);
        return n3;
    }

    static native int nglGetDebugMessageLog(int var0, int var1, long var2, long var4, long var6, long var8, long var10, long var12, long var14);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL43.nglPushDebugGroup(n2, n3, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglPushDebugGroup(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jd;
        org.lwjgl.a.a(l2);
        GL43.nglPushDebugGroup(n2, n3, charSequence.length(), org.lwjgl.opengl.i.a(dt2, charSequence), l2);
    }

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Je;
        org.lwjgl.a.a(l2);
        GL43.nglPopDebugGroup(l2);
    }

    static native void nglPopDebugGroup(long var0);

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jf;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        GL43.nglObjectLabel(n2, n3, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), l2);
    }

    static native void nglObjectLabel(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jf;
        org.lwjgl.a.a(l2);
        GL43.nglObjectLabel(n2, n3, charSequence.length(), org.lwjgl.opengl.i.a(dt2, charSequence), l2);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jg;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL43.nglGetObjectLabel(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetObjectLabel(int var0, int var1, int var2, long var3, long var5, long var7);

    public static String b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jg;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        GL43.nglGetObjectLabel(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void a(z z2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jh;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        GL43.nglObjectPtrLabel(z2.a(), byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), l2);
    }

    static native void nglObjectPtrLabel(long var0, int var2, long var3, long var5);

    public static void a(z z2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jh;
        org.lwjgl.a.a(l2);
        GL43.nglObjectPtrLabel(z2.a(), charSequence.length(), org.lwjgl.opengl.i.a(dt2, charSequence), l2);
    }

    public static void a(z z2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ji;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL43.nglGetObjectPtrLabel(z2.a(), byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetObjectPtrLabel(long var0, int var2, long var3, long var5, long var7);

    public static String a(z z2, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ji;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n2);
        GL43.nglGetObjectPtrLabel(z2.a(), n2, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jj;
        org.lwjgl.a.a(l2);
        GL43.nglFramebufferParameteri(n2, n3, n4, l2);
    }

    static native void nglFramebufferParameteri(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL43.nglGetFramebufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetFramebufferParameteriv(int var0, int var1, long var2, long var4);

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jk;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL43.nglGetFramebufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        GL43.nglGetInternalformati64v(n2, n3, n4, longBuffer.remaining(), org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetInternalformati64v(int var0, int var1, int var2, int var3, long var4, long var6);

    public static long d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jl;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL43.nglGetInternalformati64v(n2, n3, n4, 1, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jm;
        org.lwjgl.a.a(l2);
        GL43.nglInvalidateTexSubImage(n2, n3, n4, n5, n6, n7, n8, n9, l2);
    }

    static native void nglInvalidateTexSubImage(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jn;
        org.lwjgl.a.a(l2);
        GL43.nglInvalidateTexImage(n2, n3, l2);
    }

    static native void nglInvalidateTexImage(int var0, int var1, long var2);

    public static void a(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Jo;
        org.lwjgl.a.a(l4);
        GL43.nglInvalidateBufferSubData(n2, l2, l3, l4);
    }

    static native void nglInvalidateBufferSubData(int var0, long var1, long var3, long var5);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jp;
        org.lwjgl.a.a(l2);
        GL43.nglInvalidateBufferData(n2, l2);
    }

    static native void nglInvalidateBufferData(int var0, long var1);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL43.nglInvalidateFramebuffer(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglInvalidateFramebuffer(int var0, int var1, long var2, long var4);

    public static void a(int n2, IntBuffer intBuffer, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL43.nglInvalidateSubFramebuffer(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), n3, n4, n5, n6, l2);
    }

    static native void nglInvalidateSubFramebuffer(int var0, int var1, long var2, int var4, int var5, int var6, int var7, long var8);

    public static void a(int n2, ByteBuffer byteBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Js;
        org.lwjgl.a.a(l2);
        ft.e(dt2);
        org.lwjgl.a.b(byteBuffer, (n4 == 0 ? 16 : n4) * n3);
        GL43.nglMultiDrawArraysIndirect(n2, org.lwjgl.o.a(byteBuffer), n3, n4, l2);
    }

    static native void nglMultiDrawArraysIndirect(int var0, long var1, int var3, int var4, long var5);

    public static void a(int n2, long l2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Js;
        org.lwjgl.a.a(l3);
        ft.f(dt2);
        GL43.nglMultiDrawArraysIndirectBO(n2, l2, n3, n4, l3);
    }

    static native void nglMultiDrawArraysIndirectBO(int var0, long var1, int var3, int var4, long var5);

    public static void a(int n2, IntBuffer intBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Js;
        org.lwjgl.a.a(l2);
        ft.e(dt2);
        org.lwjgl.a.a(intBuffer, (n4 == 0 ? 4 : n4 >> 2) * n3);
        GL43.nglMultiDrawArraysIndirect(n2, org.lwjgl.o.a(intBuffer), n3, n4, l2);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jt;
        org.lwjgl.a.a(l2);
        ft.e(dt2);
        org.lwjgl.a.b(byteBuffer, (n5 == 0 ? 20 : n5) * n4);
        GL43.nglMultiDrawElementsIndirect(n2, n3, org.lwjgl.o.a(byteBuffer), n4, n5, l2);
    }

    static native void nglMultiDrawElementsIndirect(int var0, int var1, long var2, int var4, int var5, long var6);

    public static void a(int n2, int n3, long l2, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Jt;
        org.lwjgl.a.a(l3);
        ft.f(dt2);
        GL43.nglMultiDrawElementsIndirectBO(n2, n3, l2, n4, n5, l3);
    }

    static native void nglMultiDrawElementsIndirectBO(int var0, int var1, long var2, int var4, int var5, long var6);

    public static void a(int n2, int n3, IntBuffer intBuffer, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jt;
        org.lwjgl.a.a(l2);
        ft.e(dt2);
        org.lwjgl.a.a(intBuffer, (n5 == 0 ? 5 : n5 >> 2) * n4);
        GL43.nglMultiDrawElementsIndirect(n2, n3, org.lwjgl.o.a(intBuffer), n4, n5, l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ju;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL43.nglGetProgramInterfaceiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetProgramInterfaceiv(int var0, int var1, int var2, long var3, long var5);

    public static int e(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ju;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL43.nglGetProgramInterfaceiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static int c(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n4 = GL43.nglGetProgramResourceIndex(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
        return n4;
    }

    static native int nglGetProgramResourceIndex(int var0, int var1, long var2, long var4);

    public static int c(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jv;
        org.lwjgl.a.a(l2);
        int n4 = GL43.nglGetProgramResourceIndex(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n4;
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jw;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        GL43.nglGetProgramResourceName(n2, n3, n4, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.b(byteBuffer), l2);
    }

    static native void nglGetProgramResourceName(int var0, int var1, int var2, int var3, long var4, long var6, long var8);

    public static String a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jw;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n5);
        GL43.nglGetProgramResourceName(n2, n3, n4, n5, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        org.lwjgl.a.b(intBuffer3);
        GL43.nglGetProgramResourceiv(n2, n3, n4, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), intBuffer3.remaining(), org.lwjgl.o.b(intBuffer2), org.lwjgl.o.a(intBuffer3), l2);
    }

    static native void nglGetProgramResourceiv(int var0, int var1, int var2, int var3, long var4, int var6, long var7, long var9, long var11);

    public static int d(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n4 = GL43.nglGetProgramResourceLocation(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
        return n4;
    }

    static native int nglGetProgramResourceLocation(int var0, int var1, long var2, long var4);

    public static int d(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jy;
        org.lwjgl.a.a(l2);
        int n4 = GL43.nglGetProgramResourceLocation(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n4;
    }

    public static int e(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n4 = GL43.nglGetProgramResourceLocationIndex(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
        return n4;
    }

    static native int nglGetProgramResourceLocationIndex(int var0, int var1, long var2, long var4);

    public static int e(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Jz;
        org.lwjgl.a.a(l2);
        int n4 = GL43.nglGetProgramResourceLocationIndex(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n4;
    }

    public static void f(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JA;
        org.lwjgl.a.a(l2);
        GL43.nglShaderStorageBlockBinding(n2, n3, n4, l2);
    }

    static native void nglShaderStorageBlockBinding(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.JB;
        org.lwjgl.a.a(l4);
        GL43.nglTexBufferRange(n2, n3, n4, l2, l3, l4);
    }

    static native void nglTexBufferRange(int var0, int var1, int var2, long var3, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JC;
        org.lwjgl.a.a(l2);
        GL43.nglTexStorage2DMultisample(n2, n3, n4, n5, n6, bl2, l2);
    }

    static native void nglTexStorage2DMultisample(int var0, int var1, int var2, int var3, int var4, boolean var5, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JD;
        org.lwjgl.a.a(l2);
        GL43.nglTexStorage3DMultisample(n2, n3, n4, n5, n6, n7, bl2, l2);
    }

    static native void nglTexStorage3DMultisample(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6, long var7);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JE;
        org.lwjgl.a.a(l2);
        GL43.nglTextureView(n2, n3, n4, n5, n6, n7, n8, n9, l2);
    }

    static native void nglTextureView(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

    public static void a(int n2, int n3, long l2, int n4) {
        dt dt2 = GLContext.a();
        long l3 = dt2.JF;
        org.lwjgl.a.a(l3);
        GL43.nglBindVertexBuffer(n2, n3, l2, n4, l3);
    }

    static native void nglBindVertexBuffer(int var0, int var1, long var2, int var4, long var5);

    public static void a(int n2, int n3, int n4, boolean bl2, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JG;
        org.lwjgl.a.a(l2);
        GL43.nglVertexAttribFormat(n2, n3, n4, bl2, n5, l2);
    }

    static native void nglVertexAttribFormat(int var0, int var1, int var2, boolean var3, int var4, long var5);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JH;
        org.lwjgl.a.a(l2);
        GL43.nglVertexAttribIFormat(n2, n3, n4, n5, l2);
    }

    static native void nglVertexAttribIFormat(int var0, int var1, int var2, int var3, long var4);

    public static void c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JI;
        org.lwjgl.a.a(l2);
        GL43.nglVertexAttribLFormat(n2, n3, n4, n5, l2);
    }

    static native void nglVertexAttribLFormat(int var0, int var1, int var2, int var3, long var4);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JJ;
        org.lwjgl.a.a(l2);
        GL43.nglVertexAttribBinding(n2, n3, l2);
    }

    static native void nglVertexAttribBinding(int var0, int var1, long var2);

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JK;
        org.lwjgl.a.a(l2);
        GL43.nglVertexBindingDivisor(n2, n3, l2);
    }

    static native void nglVertexBindingDivisor(int var0, int var1, long var2);
}

