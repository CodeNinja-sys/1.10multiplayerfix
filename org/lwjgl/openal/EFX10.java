/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;

public final class EFX10 {
    public static final String a = "ALC_EXT_EFX";
    public static final int b = 131073;
    public static final int c = 131074;
    public static final int d = 131075;
    public static final int e = 131076;
    public static final int f = 131077;
    public static final int g = 131078;
    public static final int h = 131079;
    public static final int i = 131080;
    public static final int j = 131081;
    public static final int k = 131082;
    public static final int l = 131083;
    public static final int m = 131084;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    public static final int q = 0;
    public static final int r = 1;
    public static final int s = 2;
    public static final int t = 3;
    public static final int u = 4;
    public static final int v = 5;
    public static final int w = 6;
    public static final int x = 7;
    public static final int y = 8;
    public static final int z = 9;
    public static final int A = 10;
    public static final int B = 11;
    public static final int C = 12;
    public static final int D = 13;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;
    public static final int J = 6;
    public static final int K = 7;
    public static final int L = 8;
    public static final int M = 9;
    public static final int N = 10;
    public static final int O = 11;
    public static final int P = 12;
    public static final int Q = 13;
    public static final int R = 14;
    public static final int S = 15;
    public static final int T = 16;
    public static final int U = 17;
    public static final int V = 18;
    public static final int W = 19;
    public static final int X = 20;
    public static final int Y = 21;
    public static final int Z = 22;
    public static final int aa = 23;
    public static final int ab = 1;
    public static final int ac = 2;
    public static final int ad = 3;
    public static final int ae = 4;
    public static final int af = 5;
    public static final int ag = 6;
    public static final int ah = 1;
    public static final int ai = 2;
    public static final int aj = 3;
    public static final int ak = 4;
    public static final int al = 5;
    public static final int am = 1;
    public static final int an = 2;
    public static final int ao = 3;
    public static final int ap = 4;
    public static final int aq = 5;
    public static final int ar = 1;
    public static final int as = 2;
    public static final int at = 3;
    public static final int au = 4;
    public static final int av = 5;
    public static final int aw = 6;
    public static final int ax = 1;
    public static final int ay = 2;
    public static final int az = 3;
    public static final int aA = 1;
    public static final int aB = 2;
    public static final int aC = 3;
    public static final int aD = 4;
    public static final int aE = 5;
    public static final int aF = 6;
    public static final int aG = 1;
    public static final int aH = 2;
    public static final int aI = 1;
    public static final int aJ = 2;
    public static final int aK = 3;
    public static final int aL = 1;
    public static final int aM = 2;
    public static final int aN = 3;
    public static final int aO = 4;
    public static final int aP = 1;
    public static final int aQ = 1;
    public static final int aR = 2;
    public static final int aS = 3;
    public static final int aT = 4;
    public static final int aU = 5;
    public static final int aV = 6;
    public static final int aW = 7;
    public static final int aX = 8;
    public static final int aY = 9;
    public static final int aZ = 10;
    public static final int ba = 0;
    public static final int bb = 32768;
    public static final int bc = 32769;
    public static final int bd = 0;
    public static final int be = 1;
    public static final int bf = 2;
    public static final int bg = 3;
    public static final int bh = 4;
    public static final int bi = 5;
    public static final int bj = 6;
    public static final int bk = 7;
    public static final int bl = 8;
    public static final int bm = 9;
    public static final int bn = 10;
    public static final int bo = 11;
    public static final int bp = 12;
    public static final int bq = 32768;
    public static final int br = 1;
    public static final int bs = 2;
    public static final int bt = 1;
    public static final int bu = 2;
    public static final int bv = 1;
    public static final int bw = 2;
    public static final int bx = 3;
    public static final int by = 0;
    public static final int bz = 32768;
    public static final int bA = 32769;
    public static final int bB = 0;
    public static final int bC = 1;
    public static final int bD = 2;
    public static final int bE = 3;
    public static final float bF = 0.0f;
    public static final float bG = 10.0f;
    public static final float bH = 0.0f;
    public static final float bI = 0.0f;
    public static final float bJ = 10.0f;
    public static final float bK = 0.0f;
    public static final float bL = 0.0f;
    public static final float bM = 1.0f;
    public static final float bN = 1.0f;
    public static final int bO = 0;
    public static final int bP = 1;
    public static final int bQ = 1;
    public static final int bR = 0;
    public static final int bS = 1;
    public static final int bT = 1;
    public static final int bU = 0;
    public static final int bV = 1;
    public static final int bW = 1;
    public static final float bX = Float.MIN_VALUE;
    public static final float bY = Float.MAX_VALUE;
    public static final float bZ = 1.0f;
    public static final float ca = 0.0f;
    public static final float cb = 1.0f;
    public static final float cc = 1.0f;
    public static final float cd = 0.0f;
    public static final float ce = 1.0f;
    public static final float cf = 1.0f;
    public static final float cg = 0.0f;
    public static final float ch = 1.0f;
    public static final float ci = 0.32f;
    public static final float cj = 0.0f;
    public static final float ck = 1.0f;
    public static final float cl = 0.89f;
    public static final float cm = 0.1f;
    public static final float cn = 20.0f;
    public static final float co = 1.49f;
    public static final float cp = 0.1f;
    public static final float cq = 2.0f;
    public static final float cr = 0.83f;
    public static final float cs = 0.0f;
    public static final float ct = 3.16f;
    public static final float cu = 0.05f;
    public static final float cv = 0.0f;
    public static final float cw = 0.3f;
    public static final float cx = 0.007f;
    public static final float cy = 0.0f;
    public static final float cz = 10.0f;
    public static final float cA = 1.26f;
    public static final float cB = 0.0f;
    public static final float cC = 0.1f;
    public static final float cD = 0.011f;
    public static final float cE = 0.892f;
    public static final float cF = 1.0f;
    public static final float cG = 0.994f;
    public static final float cH = 0.0f;
    public static final float cI = 10.0f;
    public static final float cJ = 0.0f;
    public static final int cK = 0;
    public static final int cL = 1;
    public static final int cM = 1;
    public static final float cN = 0.0f;
    public static final float cO = 1.0f;
    public static final float cP = 1.0f;
    public static final float cQ = 0.0f;
    public static final float cR = 1.0f;
    public static final float cS = 1.0f;
    public static final float cT = 0.0f;
    public static final float cU = 1.0f;
    public static final float cV = 0.32f;
    public static final float cW = 0.0f;
    public static final float cX = 1.0f;
    public static final float cY = 0.89f;
    public static final float cZ = 0.0f;
    public static final float da = 1.0f;
    public static final float db = 1.0f;
    public static final float dc = 0.1f;
    public static final float dd = 20.0f;
    public static final float de = 1.49f;
    public static final float df = 0.1f;
    public static final float dg = 2.0f;
    public static final float dh = 0.83f;
    public static final float di = 0.1f;
    public static final float dj = 2.0f;
    public static final float dk = 1.0f;
    public static final float dl = 0.0f;
    public static final float dm = 3.16f;
    public static final float dn = 0.05f;
    public static final float do = 0.0f;
    public static final float dp = 0.3f;
    public static final float dq = 0.007f;
    public static final float dr = 0.0f;
    public static final float ds = 0.0f;
    public static final float dt = 10.0f;
    public static final float du = 1.26f;
    public static final float dv = 0.0f;
    public static final float dw = 0.1f;
    public static final float dx = 0.011f;
    public static final float dy = 0.0f;
    public static final float dz = 0.075f;
    public static final float dA = 0.25f;
    public static final float dB = 0.25f;
    public static final float dC = 0.0f;
    public static final float dD = 1.0f;
    public static final float dE = 0.0f;
    public static final float dF = 0.04f;
    public static final float dG = 4.0f;
    public static final float dH = 0.25f;
    public static final float dI = 0.0f;
    public static final float dJ = 1.0f;
    public static final float dK = 0.0f;
    public static final float dL = 0.892f;
    public static final float dM = 1.0f;
    public static final float dN = 0.994f;
    public static final float dO = 1000.0f;
    public static final float dP = 20000.0f;
    public static final float dQ = 5000.0f;
    public static final float dR = 20.0f;
    public static final float dS = 1000.0f;
    public static final float dT = 250.0f;
    public static final float dU = 0.0f;
    public static final float dV = 10.0f;
    public static final float dW = 0.0f;
    public static final int dX = 0;
    public static final int dY = 1;
    public static final int dZ = 1;
    public static final int ea = 0;
    public static final int eb = 1;
    public static final int ec = 0;
    public static final int ed = 1;
    public static final int ee = 1;
    public static final int ef = -180;
    public static final int eg = 180;
    public static final int eh = 90;
    public static final float ei = 0.0f;
    public static final float ej = 10.0f;
    public static final float ek = 1.1f;
    public static final float el = 0.0f;
    public static final float em = 1.0f;
    public static final float en = 0.1f;
    public static final float eo = -1.0f;
    public static final float ep = 1.0f;
    public static final float eq = 0.25f;
    public static final float er = 0.0f;
    public static final float es = 0.016f;
    public static final float et = 0.016f;
    public static final float eu = 0.0f;
    public static final float ev = 1.0f;
    public static final float ew = 0.2f;
    public static final float ex = 0.01f;
    public static final float ey = 1.0f;
    public static final float ez = 0.05f;
    public static final float eA = 80.0f;
    public static final float eB = 24000.0f;
    public static final float eC = 8000.0f;
    public static final float eD = 80.0f;
    public static final float eE = 24000.0f;
    public static final float eF = 3600.0f;
    public static final float eG = 80.0f;
    public static final float eH = 24000.0f;
    public static final float eI = 3600.0f;
    public static final float eJ = 0.0f;
    public static final float eK = 0.207f;
    public static final float eL = 0.1f;
    public static final float eM = 0.0f;
    public static final float eN = 0.404f;
    public static final float eO = 0.1f;
    public static final float eP = 0.0f;
    public static final float eQ = 0.99f;
    public static final float eR = 0.5f;
    public static final float eS = 0.0f;
    public static final float eT = 1.0f;
    public static final float eU = 0.5f;
    public static final float eV = -1.0f;
    public static final float eW = 1.0f;
    public static final float eX = -1.0f;
    public static final int eY = 0;
    public static final int eZ = 1;
    public static final int fa = 0;
    public static final int fb = 1;
    public static final int fc = 1;
    public static final int fd = -180;
    public static final int fe = 180;
    public static final int ff = 0;
    public static final float fg = 0.0f;
    public static final float fh = 10.0f;
    public static final float fi = 0.27f;
    public static final float fj = 0.0f;
    public static final float fk = 1.0f;
    public static final float fl = 1.0f;
    public static final float fm = -1.0f;
    public static final float fn = 1.0f;
    public static final float fo = -0.5f;
    public static final float fp = 0.0f;
    public static final float fq = 0.004f;
    public static final float fr = 0.002f;
    public static final float fs = 0.0f;
    public static final float ft = 24000.0f;
    public static final float fu = 0.0f;
    public static final int fv = 0;
    public static final int fw = 2;
    public static final int fx = 0;
    public static final int fy = 0;
    public static final int fz = 1;
    public static final int fA = 2;
    public static final int fB = 0;
    public static final int fC = 2;
    public static final int fD = 0;
    public static final int fE = 0;
    public static final int fF = 29;
    public static final int fG = 0;
    public static final int fH = -24;
    public static final int fI = 24;
    public static final int fJ = 0;
    public static final int fK = 0;
    public static final int fL = 29;
    public static final int fM = 10;
    public static final int fN = -24;
    public static final int fO = 24;
    public static final int fP = 0;
    public static final int fQ = 0;
    public static final int fR = 1;
    public static final int fS = 2;
    public static final int fT = 3;
    public static final int fU = 4;
    public static final int fV = 5;
    public static final int fW = 6;
    public static final int fX = 7;
    public static final int fY = 8;
    public static final int fZ = 9;
    public static final int ga = 10;
    public static final int gb = 11;
    public static final int gc = 12;
    public static final int gd = 13;
    public static final int ge = 14;
    public static final int gf = 15;
    public static final int gg = 16;
    public static final int gh = 17;
    public static final int gi = 18;
    public static final int gj = 19;
    public static final int gk = 20;
    public static final int gl = 21;
    public static final int gm = 22;
    public static final int gn = 23;
    public static final int go = 24;
    public static final int gp = 25;
    public static final int gq = 26;
    public static final int gr = 27;
    public static final int gs = 28;
    public static final int gt = 29;
    public static final int gu = 0;
    public static final int gv = 1;
    public static final int gw = 2;
    public static final int gx = 0;
    public static final int gy = 2;
    public static final int gz = 0;
    public static final float gA = 0.0f;
    public static final float gB = 10.0f;
    public static final float gC = 1.41f;
    public static final int gD = -12;
    public static final int gE = 12;
    public static final int gF = 12;
    public static final int gG = -50;
    public static final int gH = 50;
    public static final int gI = 0;
    public static final float gJ = 0.0f;
    public static final float gK = 8000.0f;
    public static final float gL = 440.0f;
    public static final float gM = 0.0f;
    public static final float gN = 24000.0f;
    public static final float gO = 800.0f;
    public static final int gP = 0;
    public static final int gQ = 1;
    public static final int gR = 2;
    public static final int gS = 0;
    public static final int gT = 2;
    public static final int gU = 0;
    public static final float gV = 1.0E-4f;
    public static final float gW = 1.0f;
    public static final float gX = 0.06f;
    public static final float gY = 1.0E-4f;
    public static final float gZ = 1.0f;
    public static final float ha = 0.06f;
    public static final float hb = 2.0f;
    public static final float hc = 1000.0f;
    public static final float hd = 1000.0f;
    public static final float he = 3.0E-5f;
    public static final float hf = 31621.0f;
    public static final float hg = 11.22f;
    public static final int hh = 0;
    public static final int hi = 1;
    public static final int hj = 1;
    public static final float hk = 0.126f;
    public static final float hl = 7.943f;
    public static final float hm = 1.0f;
    public static final float hn = 50.0f;
    public static final float ho = 800.0f;
    public static final float hp = 200.0f;
    public static final float hq = 0.126f;
    public static final float hr = 7.943f;
    public static final float hs = 1.0f;
    public static final float ht = 200.0f;
    public static final float hu = 3000.0f;
    public static final float hv = 500.0f;
    public static final float hw = 0.01f;
    public static final float hx = 1.0f;
    public static final float hy = 1.0f;
    public static final float hz = 0.126f;
    public static final float hA = 7.943f;
    public static final float hB = 1.0f;
    public static final float hC = 1000.0f;
    public static final float hD = 8000.0f;
    public static final float hE = 3000.0f;
    public static final float hF = 0.01f;
    public static final float hG = 1.0f;
    public static final float hH = 1.0f;
    public static final float hI = 0.126f;
    public static final float hJ = 7.943f;
    public static final float hK = 1.0f;
    public static final float hL = 4000.0f;
    public static final float hM = 16000.0f;
    public static final float hN = 6000.0f;
    public static final float hO = 0.0f;
    public static final float hP = 1.0f;
    public static final float hQ = 1.0f;
    public static final float hR = 0.0f;
    public static final float hS = 1.0f;
    public static final float hT = 1.0f;
    public static final float hU = 0.0f;
    public static final float hV = 1.0f;
    public static final float hW = 1.0f;
    public static final float hX = 0.0f;
    public static final float hY = 1.0f;
    public static final float hZ = 1.0f;
    public static final float ia = 0.0f;
    public static final float ib = 1.0f;
    public static final float ic = 1.0f;
    public static final float id = 0.0f;
    public static final float ie = 1.0f;
    public static final float if = 1.0f;
    public static final float ig = 0.0f;
    public static final float ih = 1.0f;
    public static final float ii = 1.0f;

    private EFX10() {
    }

    static native void initNativeStubs();

    public static void a(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        EFX10.nalGenAuxiliaryEffectSlots(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalGenAuxiliaryEffectSlots(int var0, long var1);

    public static int a() {
        int n2 = EFX10.nalGenAuxiliaryEffectSlots2(1);
        return n2;
    }

    static native int nalGenAuxiliaryEffectSlots2(int var0);

    public static void b(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        EFX10.nalDeleteAuxiliaryEffectSlots(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalDeleteAuxiliaryEffectSlots(int var0, long var1);

    public static void a(int n2) {
        EFX10.nalDeleteAuxiliaryEffectSlots2(1, n2);
    }

    static native void nalDeleteAuxiliaryEffectSlots2(int var0, int var1);

    public static boolean b(int n2) {
        boolean bl2 = EFX10.nalIsAuxiliaryEffectSlot(n2);
        return bl2;
    }

    static native boolean nalIsAuxiliaryEffectSlot(int var0);

    public static void a(int n2, int n3, int n4) {
        EFX10.nalAuxiliaryEffectSloti(n2, n3, n4);
    }

    static native void nalAuxiliaryEffectSloti(int var0, int var1, int var2);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        EFX10.nalAuxiliaryEffectSlotiv(n2, n3, org.lwjgl.o.a(intBuffer));
    }

    static native void nalAuxiliaryEffectSlotiv(int var0, int var1, long var2);

    public static void a(int n2, int n3, float f2) {
        EFX10.nalAuxiliaryEffectSlotf(n2, n3, f2);
    }

    static native void nalAuxiliaryEffectSlotf(int var0, int var1, float var2);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        EFX10.nalAuxiliaryEffectSlotfv(n2, n3, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalAuxiliaryEffectSlotfv(int var0, int var1, long var2);

    public static int a(int n2, int n3) {
        int n4 = EFX10.nalGetAuxiliaryEffectSloti(n2, n3);
        return n4;
    }

    static native int nalGetAuxiliaryEffectSloti(int var0, int var1);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        EFX10.nalGetAuxiliaryEffectSlotiv(n2, n3, org.lwjgl.o.a(intBuffer));
    }

    static native void nalGetAuxiliaryEffectSlotiv(int var0, int var1, long var2);

    public static float b(int n2, int n3) {
        float f2 = EFX10.nalGetAuxiliaryEffectSlotf(n2, n3);
        return f2;
    }

    static native float nalGetAuxiliaryEffectSlotf(int var0, int var1);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        EFX10.nalGetAuxiliaryEffectSlotfv(n2, n3, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalGetAuxiliaryEffectSlotfv(int var0, int var1, long var2);

    public static void c(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        EFX10.nalGenEffects(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalGenEffects(int var0, long var1);

    public static int b() {
        int n2 = EFX10.nalGenEffects2(1);
        return n2;
    }

    static native int nalGenEffects2(int var0);

    public static void d(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        EFX10.nalDeleteEffects(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalDeleteEffects(int var0, long var1);

    public static void c(int n2) {
        EFX10.nalDeleteEffects2(1, n2);
    }

    static native void nalDeleteEffects2(int var0, int var1);

    public static boolean d(int n2) {
        boolean bl2 = EFX10.nalIsEffect(n2);
        return bl2;
    }

    static native boolean nalIsEffect(int var0);

    public static void b(int n2, int n3, int n4) {
        EFX10.nalEffecti(n2, n3, n4);
    }

    static native void nalEffecti(int var0, int var1, int var2);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        EFX10.nalEffectiv(n2, n3, org.lwjgl.o.a(intBuffer));
    }

    static native void nalEffectiv(int var0, int var1, long var2);

    public static void b(int n2, int n3, float f2) {
        EFX10.nalEffectf(n2, n3, f2);
    }

    static native void nalEffectf(int var0, int var1, float var2);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        EFX10.nalEffectfv(n2, n3, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalEffectfv(int var0, int var1, long var2);

    public static int c(int n2, int n3) {
        int n4 = EFX10.nalGetEffecti(n2, n3);
        return n4;
    }

    static native int nalGetEffecti(int var0, int var1);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        EFX10.nalGetEffectiv(n2, n3, org.lwjgl.o.a(intBuffer));
    }

    static native void nalGetEffectiv(int var0, int var1, long var2);

    public static float d(int n2, int n3) {
        float f2 = EFX10.nalGetEffectf(n2, n3);
        return f2;
    }

    static native float nalGetEffectf(int var0, int var1);

    public static void d(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        EFX10.nalGetEffectfv(n2, n3, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalGetEffectfv(int var0, int var1, long var2);

    public static void e(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        EFX10.nalGenFilters(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalGenFilters(int var0, long var1);

    public static int c() {
        int n2 = EFX10.nalGenFilters2(1);
        return n2;
    }

    static native int nalGenFilters2(int var0);

    public static void f(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        EFX10.nalDeleteFilters(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalDeleteFilters(int var0, long var1);

    public static void e(int n2) {
        EFX10.nalDeleteFilters2(1, n2);
    }

    static native void nalDeleteFilters2(int var0, int var1);

    public static boolean f(int n2) {
        boolean bl2 = EFX10.nalIsFilter(n2);
        return bl2;
    }

    static native boolean nalIsFilter(int var0);

    public static void c(int n2, int n3, int n4) {
        EFX10.nalFilteri(n2, n3, n4);
    }

    static native void nalFilteri(int var0, int var1, int var2);

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        EFX10.nalFilteriv(n2, n3, org.lwjgl.o.a(intBuffer));
    }

    static native void nalFilteriv(int var0, int var1, long var2);

    public static void c(int n2, int n3, float f2) {
        EFX10.nalFilterf(n2, n3, f2);
    }

    static native void nalFilterf(int var0, int var1, float var2);

    public static void e(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        EFX10.nalFilterfv(n2, n3, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalFilterfv(int var0, int var1, long var2);

    public static int e(int n2, int n3) {
        int n4 = EFX10.nalGetFilteri(n2, n3);
        return n4;
    }

    static native int nalGetFilteri(int var0, int var1);

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        EFX10.nalGetFilteriv(n2, n3, org.lwjgl.o.a(intBuffer));
    }

    static native void nalGetFilteriv(int var0, int var1, long var2);

    public static float f(int n2, int n3) {
        float f2 = EFX10.nalGetFilterf(n2, n3);
        return f2;
    }

    static native float nalGetFilterf(int var0, int var1);

    public static void f(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        EFX10.nalGetFilterfv(n2, n3, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalGetFilterfv(int var0, int var1, long var2);
}

