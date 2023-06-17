/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ad;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.ag;
import org.lwjgl.opencl.aj;
import org.lwjgl.opencl.ak;
import org.lwjgl.opencl.ap;
import org.lwjgl.opencl.aq;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.ay;
import org.lwjgl.opencl.bb;
import org.lwjgl.opencl.d;
import org.lwjgl.opencl.w;
import org.lwjgl.opencl.y;
import org.lwjgl.x;
import org.lwjgl.z;

public final class CL10 {
    public static final int a = 0;
    public static final int b = -1;
    public static final int c = -2;
    public static final int d = -3;
    public static final int e = -4;
    public static final int f = -5;
    public static final int g = -6;
    public static final int h = -7;
    public static final int i = -8;
    public static final int j = -9;
    public static final int k = -10;
    public static final int l = -11;
    public static final int m = -12;
    public static final int n = -30;
    public static final int o = -31;
    public static final int p = -32;
    public static final int q = -33;
    public static final int r = -34;
    public static final int s = -35;
    public static final int t = -36;
    public static final int u = -37;
    public static final int v = -38;
    public static final int w = -39;
    public static final int x = -40;
    public static final int y = -41;
    public static final int z = -42;
    public static final int A = -43;
    public static final int B = -44;
    public static final int C = -45;
    public static final int D = -46;
    public static final int E = -47;
    public static final int F = -48;
    public static final int G = -49;
    public static final int H = -50;
    public static final int I = -51;
    public static final int J = -52;
    public static final int K = -53;
    public static final int L = -54;
    public static final int M = -55;
    public static final int N = -56;
    public static final int O = -57;
    public static final int P = -58;
    public static final int Q = -59;
    public static final int R = -60;
    public static final int S = -61;
    public static final int T = -62;
    public static final int U = -63;
    public static final int V = 1;
    public static final int W = 0;
    public static final int X = 1;
    public static final int Y = 2304;
    public static final int Z = 2305;
    public static final int aa = 2306;
    public static final int ab = 2307;
    public static final int ac = 2308;
    public static final int ad = 1;
    public static final int ae = 2;
    public static final int af = 4;
    public static final int ag = 8;
    public static final int ah = -1;
    public static final int ai = 4096;
    public static final int aj = 4097;
    public static final int ak = 4098;
    public static final int al = 4099;
    public static final int am = 4100;
    public static final int an = 4101;
    public static final int ao = 4102;
    public static final int ap = 4103;
    public static final int aq = 4104;
    public static final int ar = 4105;
    public static final int as = 4106;
    public static final int at = 4107;
    public static final int au = 4108;
    public static final int av = 4109;
    public static final int aw = 4110;
    public static final int ax = 4111;
    public static final int ay = 4112;
    public static final int az = 4113;
    public static final int aA = 4114;
    public static final int aB = 4115;
    public static final int aC = 4116;
    public static final int aD = 4117;
    public static final int aE = 4118;
    public static final int aF = 4119;
    public static final int aG = 4120;
    public static final int aH = 4121;
    public static final int aI = 4122;
    public static final int aJ = 4123;
    public static final int aK = 4124;
    public static final int aL = 4125;
    public static final int aM = 4126;
    public static final int aN = 4127;
    public static final int aO = 4128;
    public static final int aP = 4129;
    public static final int aQ = 4130;
    public static final int aR = 4131;
    public static final int aS = 4132;
    public static final int aT = 4133;
    public static final int aU = 4134;
    public static final int aV = 4135;
    public static final int aW = 4136;
    public static final int aX = 4137;
    public static final int aY = 4138;
    public static final int aZ = 4139;
    public static final int ba = 4140;
    public static final int bb = 4141;
    public static final int bc = 4142;
    public static final int bd = 4143;
    public static final int be = 4144;
    public static final int bf = 4145;
    public static final int bg = 1;
    public static final int bh = 2;
    public static final int bi = 4;
    public static final int bj = 8;
    public static final int bk = 16;
    public static final int bl = 32;
    public static final int bm = 0;
    public static final int bn = 1;
    public static final int bo = 2;
    public static final int bp = 1;
    public static final int bq = 2;
    public static final int br = 1;
    public static final int bs = 2;
    public static final int bt = 1;
    public static final int bu = 2;
    public static final int bv = 4224;
    public static final int bw = 4225;
    public static final int bx = 4226;
    public static final int by = 4228;
    public static final int bz = 4240;
    public static final int bA = 4241;
    public static final int bB = 4242;
    public static final int bC = 4243;
    public static final int bD = 1;
    public static final int bE = 2;
    public static final int bF = 4;
    public static final int bG = 8;
    public static final int bH = 16;
    public static final int bI = 32;
    public static final int bJ = 4272;
    public static final int bK = 4273;
    public static final int bL = 4274;
    public static final int bM = 4275;
    public static final int bN = 4276;
    public static final int bO = 4277;
    public static final int bP = 4278;
    public static final int bQ = 4279;
    public static final int bR = 4280;
    public static final int bS = 4281;
    public static final int bT = 4304;
    public static final int bU = 4305;
    public static final int bV = 4306;
    public static final int bW = 4307;
    public static final int bX = 4308;
    public static final int bY = 4309;
    public static final int bZ = 4310;
    public static final int ca = 4311;
    public static final int cb = 4312;
    public static final int cc = 4313;
    public static final int cd = 4314;
    public static final int ce = 4315;
    public static final int cf = 4316;
    public static final int cg = 4317;
    public static final int ch = 4318;
    public static final int ci = 4336;
    public static final int cj = 4337;
    public static final int ck = 4338;
    public static final int cl = 4352;
    public static final int cm = 4353;
    public static final int cn = 4354;
    public static final int co = 4355;
    public static final int cp = 4356;
    public static final int cq = 4357;
    public static final int cr = 4358;
    public static final int cs = 4368;
    public static final int ct = 4369;
    public static final int cu = 4370;
    public static final int cv = 4371;
    public static final int cw = 4372;
    public static final int cx = 4373;
    public static final int cy = 4374;
    public static final int cz = 4400;
    public static final int cA = 4401;
    public static final int cB = 4402;
    public static final int cC = 4403;
    public static final int cD = 4416;
    public static final int cE = 4417;
    public static final int cF = 4432;
    public static final int cG = 4433;
    public static final int cH = 4434;
    public static final int cI = 4435;
    public static final int cJ = 4436;
    public static final int cK = 1;
    public static final int cL = 2;
    public static final int cM = 4448;
    public static final int cN = 4449;
    public static final int cO = 4450;
    public static final int cP = 4451;
    public static final int cQ = 4452;
    public static final int cR = 4453;
    public static final int cS = 4454;
    public static final int cT = 4481;
    public static final int cU = 4482;
    public static final int cV = 4483;
    public static final int cW = 0;
    public static final int cX = -1;
    public static final int cY = -2;
    public static final int cZ = -3;
    public static final int da = 4496;
    public static final int db = 4497;
    public static final int dc = 4498;
    public static final int dd = 4499;
    public static final int de = 4500;
    public static final int df = 4528;
    public static final int dg = 4529;
    public static final int dh = 4530;
    public static final int di = 4560;
    public static final int dj = 4561;
    public static final int dk = 4562;
    public static final int dl = 4563;
    public static final int dm = 4592;
    public static final int dn = 4593;
    public static final int do = 4594;
    public static final int dp = 4595;
    public static final int dq = 4596;
    public static final int dr = 4597;
    public static final int ds = 4598;
    public static final int dt = 4599;
    public static final int du = 4600;
    public static final int dv = 4601;
    public static final int dw = 4602;
    public static final int dx = 4603;
    public static final int dy = 4604;
    public static final int dz = 4605;
    public static final int dA = 4606;
    public static final int dB = 4607;
    public static final int dC = 4608;
    public static final int dD = 0;
    public static final int dE = 1;
    public static final int dF = 2;
    public static final int dG = 3;
    public static final int dH = 4736;
    public static final int dI = 4737;
    public static final int dJ = 4738;
    public static final int dK = 4739;

    private CL10() {
    }

    public static int a(x x2, IntBuffer intBuffer) {
        int n2;
        long l2 = org.lwjgl.opencl.x.j;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if (intBuffer == null) {
            intBuffer = org.lwjgl.opencl.d.b();
        }
        if ((n2 = CL10.nclGetPlatformIDs(x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.b(intBuffer), l2)) == 0 && x2 != null) {
            org.lwjgl.opencl.au.a(x2, intBuffer);
        }
        return n2;
    }

    static native int nclGetPlatformIDs(int var0, long var1, long var3, long var5);

    public static int a(au au2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.k;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetPlatformInfo(au2 == null ? 0L : au2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetPlatformInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static int a(au au2, long l2, x x2, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.l;
        org.lwjgl.a.a(l3);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        } else {
            intBuffer = org.lwjgl.opencl.d.b();
        }
        int n2 = CL10.nclGetDeviceIDs(au2.a(), l2, x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.b(intBuffer), l3);
        if (n2 == 0 && x2 != null) {
            au2.b(x2, intBuffer);
        }
        return n2;
    }

    static native int nclGetDeviceIDs(long var0, long var2, int var4, long var5, long var7, long var9);

    public static int a(ae ae2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.m;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetDeviceInfo(ae2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetDeviceInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ab a(x x2, x x3, ad ad2, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.n;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x2);
        org.lwjgl.a.a(x3, 1);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        long l3 = ad2 == null || ad2.d() ? 0L : CallbackUtil.a(ad2);
        ab ab2 = null;
        try {
            ab ab3 = ab2 = new ab(CL10.nclCreateContext(org.lwjgl.o.c(x2), x3.m(), org.lwjgl.o.c(x3), ad2 == null ? 0L : ad2.a(), l3, org.lwjgl.o.b(intBuffer), l2), org.lwjgl.opencl.d.b(x2));
            return ab3;
        }
        finally {
            if (ab2 != null) {
                ab2.f(l3);
            }
        }
    }

    static native long nclCreateContext(long var0, int var2, long var3, long var5, long var7, long var9, long var11);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ab a(x x2, ae ae2, ad ad2, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.n;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        long l3 = ad2 == null || ad2.d() ? 0L : CallbackUtil.a(ad2);
        ab ab2 = null;
        try {
            ab ab3 = ab2 = new ab(CL10.nclCreateContext(org.lwjgl.o.c(x2), 1, org.lwjgl.opencl.d.a((z)ae2), ad2 == null ? 0L : ad2.a(), l3, org.lwjgl.o.b(intBuffer), l2), org.lwjgl.opencl.d.b(x2));
            return ab3;
        }
        finally {
            if (ab2 != null) {
                ab2.f(l3);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ab a(x x2, long l2, ad ad2, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.o;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        long l4 = ad2 == null || ad2.d() ? 0L : CallbackUtil.a(ad2);
        ab ab2 = null;
        try {
            ab ab3 = ab2 = new ab(CL10.nclCreateContextFromType(org.lwjgl.o.c(x2), l2, ad2 == null ? 0L : ad2.a(), l4, org.lwjgl.o.b(intBuffer), l3), org.lwjgl.opencl.d.b(x2));
            return ab3;
        }
        finally {
            if (ab2 != null) {
                ab2.f(l4);
            }
        }
    }

    static native long nclCreateContextFromType(long var0, long var2, long var4, long var6, long var8, long var10);

    public static int a(ab ab2) {
        long l2 = org.lwjgl.opencl.x.p;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclRetainContext(ab2.a(), l2);
        if (n2 == 0) {
            ab2.cP_();
        }
        return n2;
    }

    static native int nclRetainContext(long var0, long var2);

    public static int b(ab ab2) {
        long l2 = org.lwjgl.opencl.x.q;
        org.lwjgl.a.a(l2);
        org.lwjgl.opencl.d.a(ab2);
        int n2 = CL10.nclReleaseContext(ab2.a(), l2);
        if (n2 == 0) {
            ab2.k();
        }
        return n2;
    }

    static native int nclReleaseContext(long var0, long var2);

    public static int a(ab ab2, int n2, ByteBuffer byteBuffer, x x2) {
        int n3;
        long l2 = org.lwjgl.opencl.x.r;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        if (x2 == null && org.lwjgl.opencl.d.d(n2)) {
            x2 = org.lwjgl.opencl.d.g();
        }
        if ((n3 = CL10.nclGetContextInfo(ab2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2)) == 0 && byteBuffer != null && org.lwjgl.opencl.d.d(n2)) {
            ((au)ab2.m()).a(byteBuffer, x2);
        }
        return n3;
    }

    static native int nclGetContextInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static org.lwjgl.opencl.z a(ab ab2, ae ae2, long l2, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.s;
        org.lwjgl.a.a(l3);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.opencl.z z2 = new org.lwjgl.opencl.z(CL10.nclCreateCommandQueue(ab2.a(), ae2.a(), l2, org.lwjgl.o.b(intBuffer), l3), ab2, ae2);
        return z2;
    }

    static native long nclCreateCommandQueue(long var0, long var2, long var4, long var6, long var8);

    public static int a(org.lwjgl.opencl.z z2) {
        long l2 = org.lwjgl.opencl.x.t;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclRetainCommandQueue(z2.a(), l2);
        if (n2 == 0) {
            z2.cP_();
        }
        return n2;
    }

    static native int nclRetainCommandQueue(long var0, long var2);

    public static int b(org.lwjgl.opencl.z z2) {
        long l2 = org.lwjgl.opencl.x.u;
        org.lwjgl.a.a(l2);
        org.lwjgl.opencl.d.a(z2);
        int n2 = CL10.nclReleaseCommandQueue(z2.a(), l2);
        if (n2 == 0) {
            z2.f();
        }
        return n2;
    }

    static native int nclReleaseCommandQueue(long var0, long var2);

    public static int a(org.lwjgl.opencl.z z2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.v;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetCommandQueueInfo(z2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetCommandQueueInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static CLMem a(ab ab2, long l2, long l3, IntBuffer intBuffer) {
        long l4 = org.lwjgl.opencl.x.w;
        org.lwjgl.a.a(l4);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateBuffer(ab2.a(), l2, l3, 0L, org.lwjgl.o.b(intBuffer), l4), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.w;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateBuffer(ab2.a(), l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, DoubleBuffer doubleBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.w;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateBuffer(ab2.a(), l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), org.lwjgl.o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, FloatBuffer floatBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.w;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateBuffer(ab2.a(), l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), org.lwjgl.o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        long l3 = org.lwjgl.opencl.x.w;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateBuffer(ab2.a(), l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), org.lwjgl.o.b(intBuffer2), l3), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, LongBuffer longBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.w;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(longBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateBuffer(ab2.a(), l2, longBuffer.remaining() << 3, org.lwjgl.o.a(longBuffer), org.lwjgl.o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.w;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateBuffer(ab2.a(), l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), org.lwjgl.o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    static native long nclCreateBuffer(long var0, long var2, long var4, long var6, long var8, long var10);

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, ByteBuffer byteBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.x;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueReadBuffer(z2.a(), cLMem.a(), n2, l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, DoubleBuffer doubleBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.x;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueReadBuffer(z2.a(), cLMem.a(), n2, l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, FloatBuffer floatBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.x;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueReadBuffer(z2.a(), cLMem.a(), n2, l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, IntBuffer intBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.x;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueReadBuffer(z2.a(), cLMem.a(), n2, l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, LongBuffer longBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.x;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(longBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueReadBuffer(z2.a(), cLMem.a(), n2, l2, longBuffer.remaining() << 3, org.lwjgl.o.a(longBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, ShortBuffer shortBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.x;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueReadBuffer(z2.a(), cLMem.a(), n2, l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    static native int nclEnqueueReadBuffer(long var0, long var2, int var4, long var5, long var7, long var9, int var11, long var12, long var14, long var16);

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, ByteBuffer byteBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.y;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteBuffer(z2.a(), cLMem.a(), n2, l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, DoubleBuffer doubleBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.y;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteBuffer(z2.a(), cLMem.a(), n2, l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, FloatBuffer floatBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.y;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteBuffer(z2.a(), cLMem.a(), n2, l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, IntBuffer intBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.y;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteBuffer(z2.a(), cLMem.a(), n2, l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, LongBuffer longBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.y;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(longBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteBuffer(z2.a(), cLMem.a(), n2, l2, longBuffer.remaining() << 3, org.lwjgl.o.a(longBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, ShortBuffer shortBuffer, x x2, x x3) {
        int n3;
        long l3 = org.lwjgl.opencl.x.y;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteBuffer(z2.a(), cLMem.a(), n2, l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l3)) == 0) {
            z2.a(x3);
        }
        return n3;
    }

    static native int nclEnqueueWriteBuffer(long var0, long var2, int var4, long var5, long var7, long var9, int var11, long var12, long var14, long var16);

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, CLMem cLMem2, long l2, long l3, long l4, x x2, x x3) {
        int n2;
        long l5 = org.lwjgl.opencl.x.z;
        org.lwjgl.a.a(l5);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n2 = CL10.nclEnqueueCopyBuffer(z2.a(), cLMem.a(), cLMem2.a(), l2, l3, l4, x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l5)) == 0) {
            z2.a(x3);
        }
        return n2;
    }

    static native int nclEnqueueCopyBuffer(long var0, long var2, long var4, long var6, long var8, long var10, int var12, long var13, long var15, long var17);

    public static ByteBuffer a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, long l3, long l4, x x2, x x3, IntBuffer intBuffer) {
        ByteBuffer byteBuffer;
        long l5 = org.lwjgl.opencl.x.A;
        org.lwjgl.a.a(l5);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if ((byteBuffer = CL10.nclEnqueueMapBuffer(z2.a(), cLMem.a(), n2, l2, l3, l4, x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), org.lwjgl.o.b(intBuffer), l4, l5)) != null) {
            z2.a(x3);
        }
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nclEnqueueMapBuffer(long var0, long var2, int var4, long var5, long var7, long var9, int var11, long var12, long var14, long var16, long var18, long var20);

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, long l3, long l4, long l5, ByteBuffer byteBuffer2, IntBuffer intBuffer) {
        long l6 = org.lwjgl.opencl.x.B;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.b(byteBuffer, 8);
        if (byteBuffer2 != null) {
            org.lwjgl.a.b(byteBuffer2, org.lwjgl.opencl.y.a(byteBuffer, l3, l4, l5));
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage2D(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), l3, l4, l5, org.lwjgl.o.b(byteBuffer2), org.lwjgl.o.b(intBuffer), l6), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, long l3, long l4, long l5, FloatBuffer floatBuffer, IntBuffer intBuffer) {
        long l6 = org.lwjgl.opencl.x.B;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.b(byteBuffer, 8);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, org.lwjgl.opencl.y.a(byteBuffer, l3, l4, l5));
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage2D(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), l3, l4, l5, org.lwjgl.o.b(floatBuffer), org.lwjgl.o.b(intBuffer), l6), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, long l3, long l4, long l5, IntBuffer intBuffer, IntBuffer intBuffer2) {
        long l6 = org.lwjgl.opencl.x.B;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.b(byteBuffer, 8);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, org.lwjgl.opencl.y.a(byteBuffer, l3, l4, l5));
        }
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage2D(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), l3, l4, l5, org.lwjgl.o.b(intBuffer), org.lwjgl.o.b(intBuffer2), l6), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, long l3, long l4, long l5, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        long l6 = org.lwjgl.opencl.x.B;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.b(byteBuffer, 8);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, org.lwjgl.opencl.y.a(byteBuffer, l3, l4, l5));
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage2D(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), l3, l4, l5, org.lwjgl.o.b(shortBuffer), org.lwjgl.o.b(intBuffer), l6), ab2);
        return cLMem;
    }

    static native long nclCreateImage2D(long var0, long var2, long var4, long var6, long var8, long var10, long var12, long var14, long var16);

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, long l3, long l4, long l5, long l6, long l7, ByteBuffer byteBuffer2, IntBuffer intBuffer) {
        long l8 = org.lwjgl.opencl.x.C;
        org.lwjgl.a.a(l8);
        org.lwjgl.a.b(byteBuffer, 8);
        if (byteBuffer2 != null) {
            org.lwjgl.a.b(byteBuffer2, org.lwjgl.opencl.y.a(byteBuffer, l3, l4, l4, l6, l7));
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage3D(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), l3, l4, l5, l6, l7, org.lwjgl.o.b(byteBuffer2), org.lwjgl.o.b(intBuffer), l8), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, long l3, long l4, long l5, long l6, long l7, FloatBuffer floatBuffer, IntBuffer intBuffer) {
        long l8 = org.lwjgl.opencl.x.C;
        org.lwjgl.a.a(l8);
        org.lwjgl.a.b(byteBuffer, 8);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, org.lwjgl.opencl.y.a(byteBuffer, l3, l4, l4, l6, l7));
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage3D(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), l3, l4, l5, l6, l7, org.lwjgl.o.b(floatBuffer), org.lwjgl.o.b(intBuffer), l8), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, long l3, long l4, long l5, long l6, long l7, IntBuffer intBuffer, IntBuffer intBuffer2) {
        long l8 = org.lwjgl.opencl.x.C;
        org.lwjgl.a.a(l8);
        org.lwjgl.a.b(byteBuffer, 8);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, org.lwjgl.opencl.y.a(byteBuffer, l3, l4, l4, l6, l7));
        }
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage3D(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), l3, l4, l5, l6, l7, org.lwjgl.o.b(intBuffer), org.lwjgl.o.b(intBuffer2), l8), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, long l3, long l4, long l5, long l6, long l7, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        long l8 = org.lwjgl.opencl.x.C;
        org.lwjgl.a.a(l8);
        org.lwjgl.a.b(byteBuffer, 8);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, org.lwjgl.opencl.y.a(byteBuffer, l3, l4, l4, l6, l7));
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10.nclCreateImage3D(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), l3, l4, l5, l6, l7, org.lwjgl.o.b(shortBuffer), org.lwjgl.o.b(intBuffer), l8), ab2);
        return cLMem;
    }

    static native long nclCreateImage3D(long var0, long var2, long var4, long var6, long var8, long var10, long var12, long var14, long var16, long var18, long var20);

    public static int a(ab ab2, long l2, int n2, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.D;
        org.lwjgl.a.a(l3);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        int n3 = CL10.nclGetSupportedImageFormats(ab2.a(), l2, n2, (byteBuffer == null ? 0 : byteBuffer.remaining()) / 8, org.lwjgl.o.b(byteBuffer), org.lwjgl.o.b(intBuffer), l3);
        return n3;
    }

    static native int nclGetSupportedImageFormats(long var0, long var2, int var4, int var5, long var6, long var8, long var10);

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, x x2, x x3, long l2, long l3, ByteBuffer byteBuffer, x x4, x x5) {
        int n3;
        long l4 = org.lwjgl.opencl.x.E;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opencl.y.a(x3, l2, l3));
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n3 = CL10.nclEnqueueReadImage(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, l3, org.lwjgl.o.a(byteBuffer), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l4)) == 0) {
            z2.a(x5);
        }
        return n3;
    }

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, x x2, x x3, long l2, long l3, FloatBuffer floatBuffer, x x4, x x5) {
        int n3;
        long l4 = org.lwjgl.opencl.x.E;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(floatBuffer, org.lwjgl.opencl.y.a(x3, l2, l3));
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n3 = CL10.nclEnqueueReadImage(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, l3, org.lwjgl.o.a(floatBuffer), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l4)) == 0) {
            z2.a(x5);
        }
        return n3;
    }

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, x x2, x x3, long l2, long l3, IntBuffer intBuffer, x x4, x x5) {
        int n3;
        long l4 = org.lwjgl.opencl.x.E;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opencl.y.a(x3, l2, l3));
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n3 = CL10.nclEnqueueReadImage(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, l3, org.lwjgl.o.a(intBuffer), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l4)) == 0) {
            z2.a(x5);
        }
        return n3;
    }

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, x x2, x x3, long l2, long l3, ShortBuffer shortBuffer, x x4, x x5) {
        int n3;
        long l4 = org.lwjgl.opencl.x.E;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opencl.y.a(x3, l2, l3));
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n3 = CL10.nclEnqueueReadImage(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, l3, org.lwjgl.o.a(shortBuffer), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l4)) == 0) {
            z2.a(x5);
        }
        return n3;
    }

    static native int nclEnqueueReadImage(long var0, long var2, int var4, long var5, long var7, long var9, long var11, long var13, int var15, long var16, long var18, long var20);

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, x x2, x x3, long l2, long l3, ByteBuffer byteBuffer, x x4, x x5) {
        int n3;
        long l4 = org.lwjgl.opencl.x.F;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opencl.y.a(x3, l2, l3));
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteImage(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, l3, org.lwjgl.o.a(byteBuffer), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l4)) == 0) {
            z2.a(x5);
        }
        return n3;
    }

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, x x2, x x3, long l2, long l3, FloatBuffer floatBuffer, x x4, x x5) {
        int n3;
        long l4 = org.lwjgl.opencl.x.F;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(floatBuffer, org.lwjgl.opencl.y.a(x3, l2, l3));
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteImage(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, l3, org.lwjgl.o.a(floatBuffer), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l4)) == 0) {
            z2.a(x5);
        }
        return n3;
    }

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, x x2, x x3, long l2, long l3, IntBuffer intBuffer, x x4, x x5) {
        int n3;
        long l4 = org.lwjgl.opencl.x.F;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opencl.y.a(x3, l2, l3));
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteImage(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, l3, org.lwjgl.o.a(intBuffer), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l4)) == 0) {
            z2.a(x5);
        }
        return n3;
    }

    public static int b(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, x x2, x x3, long l2, long l3, ShortBuffer shortBuffer, x x4, x x5) {
        int n3;
        long l4 = org.lwjgl.opencl.x.F;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opencl.y.a(x3, l2, l3));
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n3 = CL10.nclEnqueueWriteImage(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, l3, org.lwjgl.o.a(shortBuffer), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l4)) == 0) {
            z2.a(x5);
        }
        return n3;
    }

    static native int nclEnqueueWriteImage(long var0, long var2, int var4, long var5, long var7, long var9, long var11, long var13, int var15, long var16, long var18, long var20);

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, CLMem cLMem2, x x2, x x3, x x4, x x5, x x6) {
        int n2;
        long l2 = org.lwjgl.opencl.x.G;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n2 = CL10.nclEnqueueCopyImage(z2.a(), cLMem.a(), cLMem2.a(), org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l2)) == 0) {
            z2.a(x6);
        }
        return n2;
    }

    static native int nclEnqueueCopyImage(long var0, long var2, long var4, long var6, long var8, long var10, int var12, long var13, long var15, long var17);

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, CLMem cLMem2, x x2, x x3, long l2, x x4, x x5) {
        int n2;
        long l3 = org.lwjgl.opencl.x.H;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n2 = CL10.nclEnqueueCopyImageToBuffer(z2.a(), cLMem.a(), cLMem2.a(), org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), l2, x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l3)) == 0) {
            z2.a(x5);
        }
        return n2;
    }

    static native int nclEnqueueCopyImageToBuffer(long var0, long var2, long var4, long var6, long var8, long var10, int var12, long var13, long var15, long var17);

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, CLMem cLMem2, long l2, x x2, x x3, x x4, x x5) {
        int n2;
        long l3 = org.lwjgl.opencl.x.I;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if ((n2 = CL10.nclEnqueueCopyBufferToImage(z2.a(), cLMem.a(), cLMem2.a(), l2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l3)) == 0) {
            z2.a(x5);
        }
        return n2;
    }

    static native int nclEnqueueCopyBufferToImage(long var0, long var2, long var4, long var6, long var8, long var10, int var12, long var13, long var15, long var17);

    public static ByteBuffer a(org.lwjgl.opencl.z z2, CLMem cLMem, int n2, long l2, x x2, x x3, x x4, x x5, x x6, x x7, IntBuffer intBuffer) {
        ByteBuffer byteBuffer;
        long l3 = org.lwjgl.opencl.x.J;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 1);
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        if (x6 != null) {
            org.lwjgl.a.b(x6);
        }
        if (x7 != null) {
            org.lwjgl.a.a(x7, 1);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if ((byteBuffer = CL10.nclEnqueueMapImage(z2.a(), cLMem.a(), n2, l2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), org.lwjgl.o.d(x5), x6 == null ? 0 : x6.m(), org.lwjgl.o.d(x6), org.lwjgl.o.d(x7), org.lwjgl.o.b(intBuffer), l3)) != null) {
            z2.a(x7);
        }
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nclEnqueueMapImage(long var0, long var2, int var4, long var5, long var7, long var9, long var11, long var13, int var15, long var16, long var18, long var20, long var22);

    public static int a(CLMem cLMem, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.K;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetImageInfo(cLMem.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetImageInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static int a(CLMem cLMem) {
        long l2 = org.lwjgl.opencl.x.L;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclRetainMemObject(cLMem.a(), l2);
        if (n2 == 0) {
            cLMem.cP_();
        }
        return n2;
    }

    static native int nclRetainMemObject(long var0, long var2);

    public static int b(CLMem cLMem) {
        long l2 = org.lwjgl.opencl.x.M;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclReleaseMemObject(cLMem.a(), l2);
        if (n2 == 0) {
            cLMem.f();
        }
        return n2;
    }

    static native int nclReleaseMemObject(long var0, long var2);

    public static int a(org.lwjgl.opencl.z z2, CLMem cLMem, ByteBuffer byteBuffer, x x2, x x3) {
        int n2;
        long l2 = org.lwjgl.opencl.x.N;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n2 = CL10.nclEnqueueUnmapMemObject(z2.a(), cLMem.a(), org.lwjgl.o.a(byteBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l2)) == 0) {
            z2.a(x3);
        }
        return n2;
    }

    static native int nclEnqueueUnmapMemObject(long var0, long var2, long var4, int var6, long var7, long var9, long var11);

    public static int b(CLMem cLMem, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.O;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetMemObjectInfo(cLMem.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetMemObjectInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static bb a(ab ab2, int n2, int n3, int n4, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.P;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        bb bb2 = new bb(CL10.nclCreateSampler(ab2.a(), n2, n3, n4, org.lwjgl.o.b(intBuffer), l2), ab2);
        return bb2;
    }

    static native long nclCreateSampler(long var0, int var2, int var3, int var4, long var5, long var7);

    public static int a(bb bb2) {
        long l2 = org.lwjgl.opencl.x.Q;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclRetainSampler(bb2.a(), l2);
        if (n2 == 0) {
            bb2.cP_();
        }
        return n2;
    }

    static native int nclRetainSampler(long var0, long var2);

    public static int b(bb bb2) {
        long l2 = org.lwjgl.opencl.x.R;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclReleaseSampler(bb2.a(), l2);
        if (n2 == 0) {
            bb2.f();
        }
        return n2;
    }

    static native int nclReleaseSampler(long var0, long var2);

    public static int a(bb bb2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.S;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetSamplerInfo(bb2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetSamplerInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static ay a(ab ab2, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.T;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ay ay2 = new ay(CL10.nclCreateProgramWithSource(ab2.a(), 1, org.lwjgl.o.a(byteBuffer), byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), l2), ab2);
        return ay2;
    }

    static native long nclCreateProgramWithSource(long var0, int var2, long var3, long var5, long var7, long var9);

    public static ay a(ab ab2, ByteBuffer byteBuffer, x x2, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.T;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opencl.d.a(x2));
        org.lwjgl.a.a(x2, 1);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ay ay2 = new ay(CL10.nclCreateProgramWithSource2(ab2.a(), x2.m(), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.c(x2), org.lwjgl.o.b(intBuffer), l2), ab2);
        return ay2;
    }

    static native long nclCreateProgramWithSource2(long var0, int var2, long var3, long var5, long var7, long var9);

    public static ay a(ab ab2, ByteBuffer[] arrbyteBuffer, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.T;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrbyteBuffer, 1);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ay ay2 = new ay(CL10.nclCreateProgramWithSource3(ab2.a(), arrbyteBuffer.length, arrbyteBuffer, org.lwjgl.opencl.d.a(arrbyteBuffer), org.lwjgl.o.b(intBuffer), l2), ab2);
        return ay2;
    }

    static native long nclCreateProgramWithSource3(long var0, int var2, ByteBuffer[] var3, long var4, long var6, long var8);

    public static ay a(ab ab2, CharSequence charSequence, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.T;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ay ay2 = new ay(CL10.nclCreateProgramWithSource(ab2.a(), 1, org.lwjgl.opencl.d.a(charSequence), charSequence.length(), org.lwjgl.o.b(intBuffer), l2), ab2);
        return ay2;
    }

    public static ay a(ab ab2, CharSequence[] arrcharSequence, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.T;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrcharSequence);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ay ay2 = new ay(CL10.nclCreateProgramWithSource4(ab2.a(), arrcharSequence.length, org.lwjgl.opencl.d.b(arrcharSequence), org.lwjgl.opencl.d.d(arrcharSequence), org.lwjgl.o.b(intBuffer), l2), ab2);
        return ay2;
    }

    static native long nclCreateProgramWithSource4(long var0, int var2, long var3, long var5, long var7, long var9);

    public static ay a(ab ab2, ae ae2, ByteBuffer byteBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        long l2 = org.lwjgl.opencl.x.U;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(intBuffer, 1);
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        ay ay2 = new ay(CL10.nclCreateProgramWithBinary(ab2.a(), 1, ae2.a(), byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.b(intBuffer2), l2), ab2);
        return ay2;
    }

    static native long nclCreateProgramWithBinary(long var0, int var2, long var3, long var5, long var7, long var9, long var11, long var13);

    public static ay a(ab ab2, x x2, x x3, ByteBuffer byteBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        long l2 = org.lwjgl.opencl.x.U;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        org.lwjgl.a.a(x3, x2.m());
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opencl.d.a(x3));
        org.lwjgl.a.a(intBuffer, x2.m());
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        ay ay2 = new ay(CL10.nclCreateProgramWithBinary2(ab2.a(), x2.m(), org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), org.lwjgl.o.b(intBuffer2), l2), ab2);
        return ay2;
    }

    static native long nclCreateProgramWithBinary2(long var0, int var2, long var3, long var5, long var7, long var9, long var11, long var13);

    public static ay a(ab ab2, x x2, ByteBuffer[] arrbyteBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        long l2 = org.lwjgl.opencl.x.U;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, arrbyteBuffer.length);
        org.lwjgl.a.a(arrbyteBuffer, 1);
        org.lwjgl.a.a(intBuffer, arrbyteBuffer.length);
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        ay ay2 = new ay(CL10.nclCreateProgramWithBinary3(ab2.a(), arrbyteBuffer.length, org.lwjgl.o.c(x2), org.lwjgl.opencl.d.a(arrbyteBuffer), arrbyteBuffer, org.lwjgl.o.a(intBuffer), org.lwjgl.o.b(intBuffer2), l2), ab2);
        return ay2;
    }

    static native long nclCreateProgramWithBinary3(long var0, int var2, long var3, long var5, ByteBuffer[] var7, long var8, long var10, long var12);

    public static int a(ay ay2) {
        long l2 = org.lwjgl.opencl.x.V;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclRetainProgram(ay2.a(), l2);
        if (n2 == 0) {
            ay2.cP_();
        }
        return n2;
    }

    static native int nclRetainProgram(long var0, long var2);

    public static int b(ay ay2) {
        long l2 = org.lwjgl.opencl.x.W;
        org.lwjgl.a.a(l2);
        org.lwjgl.opencl.d.a(ay2);
        int n2 = CL10.nclReleaseProgram(ay2.a(), l2);
        if (n2 == 0) {
            ay2.f();
        }
        return n2;
    }

    static native int nclReleaseProgram(long var0, long var2);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ay ay2, x x2, ByteBuffer byteBuffer, w w2) {
        long l2 = org.lwjgl.opencl.x.X;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        long l3 = CallbackUtil.a(w2);
        if (w2 != null) {
            w2.a((ab)ay2.m());
        }
        int n2 = 0;
        try {
            int n3 = n2 = CL10.nclBuildProgram(ay2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.a(byteBuffer), w2 == null ? 0L : w2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    static native int nclBuildProgram(long var0, int var2, long var3, long var5, long var7, long var9, long var11);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ay ay2, x x2, CharSequence charSequence, w w2) {
        long l2 = org.lwjgl.opencl.x.X;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        long l3 = CallbackUtil.a(w2);
        if (w2 != null) {
            w2.a((ab)ay2.m());
        }
        int n2 = 0;
        try {
            int n3 = n2 = CL10.nclBuildProgram(ay2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.opencl.d.b(charSequence), w2 == null ? 0L : w2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ay ay2, ae ae2, CharSequence charSequence, w w2) {
        long l2 = org.lwjgl.opencl.x.X;
        org.lwjgl.a.a(l2);
        long l3 = CallbackUtil.a(w2);
        if (w2 != null) {
            w2.a((ab)ay2.m());
        }
        int n2 = 0;
        try {
            int n3 = n2 = CL10.nclBuildProgram(ay2.a(), 1, org.lwjgl.opencl.d.a((z)ae2), org.lwjgl.opencl.d.b(charSequence), w2 == null ? 0L : w2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    public static int a() {
        long l2 = org.lwjgl.opencl.x.Y;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclUnloadCompiler(l2);
        return n2;
    }

    static native int nclUnloadCompiler(long var0);

    public static int a(ay ay2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.Z;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetProgramInfo(ay2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetProgramInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static int a(ay ay2, x x2, ByteBuffer byteBuffer, x x3) {
        long l2 = org.lwjgl.opencl.x.Z;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opencl.d.a(x2));
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        int n2 = CL10.nclGetProgramInfo2(ay2.a(), 4454, x2.m(), org.lwjgl.o.c(x2), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.d(x3), l2);
        return n2;
    }

    static native int nclGetProgramInfo2(long var0, int var2, long var3, long var5, long var7, long var9, long var11);

    public static int a(ay ay2, ByteBuffer[] arrbyteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.Z;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrbyteBuffer);
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n2 = CL10.nclGetProgramInfo3(ay2.a(), 4454, arrbyteBuffer.length, arrbyteBuffer, org.lwjgl.o.d(x2), l2);
        return n2;
    }

    static native int nclGetProgramInfo3(long var0, int var2, long var3, ByteBuffer[] var5, long var6, long var8);

    public static int a(ay ay2, ae ae2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.aa;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetProgramBuildInfo(ay2.a(), ae2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetProgramBuildInfo(long var0, long var2, int var4, long var5, long var7, long var9, long var11);

    public static ak a(ay ay2, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.ab;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ak ak2 = new ak(CL10.nclCreateKernel(ay2.a(), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.b(intBuffer), l2), ay2);
        return ak2;
    }

    static native long nclCreateKernel(long var0, long var2, long var4, long var6);

    public static ak a(ay ay2, CharSequence charSequence, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.ab;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ak ak2 = new ak(CL10.nclCreateKernel(ay2.a(), org.lwjgl.opencl.d.b(charSequence), org.lwjgl.o.b(intBuffer), l2), ay2);
        return ak2;
    }

    public static int a(ay ay2, x x2, IntBuffer intBuffer) {
        int n2;
        long l2 = org.lwjgl.opencl.x.ac;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if ((n2 = CL10.nclCreateKernelsInProgram(ay2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.b(intBuffer), l2)) == 0 && x2 != null) {
            ay2.a(x2);
        }
        return n2;
    }

    static native int nclCreateKernelsInProgram(long var0, int var2, long var3, long var5, long var7);

    public static int a(ak ak2) {
        long l2 = org.lwjgl.opencl.x.ad;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclRetainKernel(ak2.a(), l2);
        if (n2 == 0) {
            ak2.cP_();
        }
        return n2;
    }

    static native int nclRetainKernel(long var0, long var2);

    public static int b(ak ak2) {
        long l2 = org.lwjgl.opencl.x.ae;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclReleaseKernel(ak2.a(), l2);
        if (n2 == 0) {
            ak2.f();
        }
        return n2;
    }

    static native int nclReleaseKernel(long var0, long var2);

    public static int a(ak ak2, int n2, long l2) {
        long l3 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l3);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, l2, 0L, l3);
        return n3;
    }

    public static int a(ak ak2, int n2, ByteBuffer byteBuffer) {
        long l2 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    public static int a(ak ak2, int n2, DoubleBuffer doubleBuffer) {
        long l2 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l2);
        return n3;
    }

    public static int a(ak ak2, int n2, FloatBuffer floatBuffer) {
        long l2 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l2);
        return n3;
    }

    public static int a(ak ak2, int n2, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l2);
        return n3;
    }

    public static int a(ak ak2, int n2, LongBuffer longBuffer) {
        long l2 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, longBuffer.remaining() << 3, org.lwjgl.o.a(longBuffer), l2);
        return n3;
    }

    public static int a(ak ak2, int n2, ShortBuffer shortBuffer) {
        long l2 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l2);
        return n3;
    }

    static native int nclSetKernelArg(long var0, int var2, long var3, long var5, long var7);

    public static int a(ak ak2, int n2, aq aq2) {
        long l2 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l2);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, org.lwjgl.x.c(), org.lwjgl.opencl.d.b(aq2), l2);
        return n3;
    }

    static int a(ak ak2, int n2, long l2, Buffer buffer) {
        long l3 = org.lwjgl.opencl.x.af;
        org.lwjgl.a.a(l3);
        int n3 = CL10.nclSetKernelArg(ak2.a(), n2, l2, org.lwjgl.o.a(buffer), l3);
        return n3;
    }

    public static int a(ak ak2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.ag;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetKernelInfo(ak2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetKernelInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static int a(ak ak2, ae ae2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.ah;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetKernelWorkGroupInfo(ak2.a(), ae2 == null ? 0L : ae2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetKernelWorkGroupInfo(long var0, long var2, int var4, long var5, long var7, long var9, long var11);

    public static int a(org.lwjgl.opencl.z z2, ak ak2, int n2, x x2, x x3, x x4, x x5, x x6) {
        int n3;
        long l2 = org.lwjgl.opencl.x.ai;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.a(x2, n2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, n2);
        }
        if (x4 != null) {
            org.lwjgl.a.a(x4, n2);
        }
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL10.nclEnqueueNDRangeKernel(z2.a(), ak2.a(), n2, org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), org.lwjgl.o.d(x4), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l2)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    static native int nclEnqueueNDRangeKernel(long var0, long var2, int var4, long var5, long var7, long var9, int var11, long var12, long var14, long var16);

    public static int a(org.lwjgl.opencl.z z2, ak ak2, x x2, x x3) {
        int n2;
        long l2 = org.lwjgl.opencl.x.aj;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n2 = CL10.nclEnqueueTask(z2.a(), ak2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l2)) == 0) {
            z2.a(x3);
        }
        return n2;
    }

    static native int nclEnqueueTask(long var0, long var2, int var4, long var5, long var7, long var9);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(org.lwjgl.opencl.z z2, ap ap2, CLMem[] arrcLMem, long[] arrl, x x2, x x3) {
        long l2 = org.lwjgl.opencl.x.ak;
        org.lwjgl.a.a(l2);
        if (arrcLMem != null) {
            org.lwjgl.a.a(arrcLMem, 1);
        }
        if (arrl != null) {
            org.lwjgl.a.a(arrl, arrcLMem.length);
        }
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        long l3 = CallbackUtil.a(ap2);
        ByteBuffer byteBuffer = org.lwjgl.opencl.d.a(l3, arrcLMem, arrl);
        int n2 = 0;
        try {
            n2 = CL10.nclEnqueueNativeKernel(z2.a(), ap2.a(), org.lwjgl.o.a((Buffer)byteBuffer), byteBuffer.remaining(), arrcLMem == null ? 0 : arrcLMem.length, arrcLMem, x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l2);
            if (n2 == 0) {
                z2.a(x3);
            }
            int n3 = n2;
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    static native int nclEnqueueNativeKernel(long var0, long var2, long var4, long var6, int var8, CLMem[] var9, int var10, long var11, long var13, long var15);

    public static int a(x x2) {
        long l2 = org.lwjgl.opencl.x.al;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        int n2 = CL10.nclWaitForEvents(x2.m(), org.lwjgl.o.c(x2), l2);
        return n2;
    }

    static native int nclWaitForEvents(int var0, long var1, long var3);

    public static int a(ag ag2) {
        long l2 = org.lwjgl.opencl.x.al;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclWaitForEvents(1, org.lwjgl.opencl.d.a(ag2), l2);
        return n2;
    }

    public static int a(ag ag2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.am;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetEventInfo(ag2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetEventInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static int b(ag ag2) {
        long l2 = org.lwjgl.opencl.x.an;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclRetainEvent(ag2.a(), l2);
        if (n2 == 0) {
            ag2.cP_();
        }
        return n2;
    }

    static native int nclRetainEvent(long var0, long var2);

    public static int c(ag ag2) {
        long l2 = org.lwjgl.opencl.x.ao;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclReleaseEvent(ag2.a(), l2);
        if (n2 == 0) {
            ag2.f();
        }
        return n2;
    }

    static native int nclReleaseEvent(long var0, long var2);

    public static int a(org.lwjgl.opencl.z z2, x x2) {
        long l2 = org.lwjgl.opencl.x.ap;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        int n2 = CL10.nclEnqueueMarker(z2.a(), org.lwjgl.o.c(x2), l2);
        if (n2 == 0) {
            z2.a(x2);
        }
        return n2;
    }

    static native int nclEnqueueMarker(long var0, long var2, long var4);

    public static int c(org.lwjgl.opencl.z z2) {
        long l2 = org.lwjgl.opencl.x.aq;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclEnqueueBarrier(z2.a(), l2);
        return n2;
    }

    static native int nclEnqueueBarrier(long var0, long var2);

    public static int b(org.lwjgl.opencl.z z2, x x2) {
        long l2 = org.lwjgl.opencl.x.ar;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        int n2 = CL10.nclEnqueueWaitForEvents(z2.a(), x2.m(), org.lwjgl.o.c(x2), l2);
        return n2;
    }

    static native int nclEnqueueWaitForEvents(long var0, int var2, long var3, long var5);

    public static int a(org.lwjgl.opencl.z z2, ag ag2) {
        long l2 = org.lwjgl.opencl.x.ar;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclEnqueueWaitForEvents(z2.a(), 1, org.lwjgl.opencl.d.a(ag2), l2);
        return n2;
    }

    public static int b(ag ag2, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.as;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10.nclGetEventProfilingInfo(ag2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n3;
    }

    static native int nclGetEventProfilingInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static int d(org.lwjgl.opencl.z z2) {
        long l2 = org.lwjgl.opencl.x.at;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclFlush(z2.a(), l2);
        return n2;
    }

    static native int nclFlush(long var0, long var2);

    public static int e(org.lwjgl.opencl.z z2) {
        long l2 = org.lwjgl.opencl.x.au;
        org.lwjgl.a.a(l2);
        int n2 = CL10.nclFinish(z2.a(), l2);
        return n2;
    }

    static native int nclFinish(long var0, long var2);

    static aj a(ByteBuffer byteBuffer) {
        long l2 = org.lwjgl.opencl.x.av;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        aj aj2 = new aj(CL10.nclGetExtensionFunctionAddress(org.lwjgl.o.a(byteBuffer), l2));
        return aj2;
    }

    static native long nclGetExtensionFunctionAddress(long var0, long var2);

    static aj a(CharSequence charSequence) {
        long l2 = org.lwjgl.opencl.x.av;
        org.lwjgl.a.a(l2);
        aj aj2 = new aj(CL10.nclGetExtensionFunctionAddress(org.lwjgl.opencl.d.b(charSequence), l2));
        return aj2;
    }
}

