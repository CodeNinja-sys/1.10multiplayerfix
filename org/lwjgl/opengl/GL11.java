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
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;
import org.lwjgl.opengl.is;

public final class GL11 {
    public static final int a = 256;
    public static final int b = 257;
    public static final int c = 258;
    public static final int d = 259;
    public static final int e = 260;
    public static final int f = 512;
    public static final int g = 513;
    public static final int h = 514;
    public static final int i = 515;
    public static final int j = 516;
    public static final int k = 517;
    public static final int l = 518;
    public static final int m = 519;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 4;
    public static final int q = 8;
    public static final int r = 16;
    public static final int s = 32;
    public static final int t = 64;
    public static final int u = 128;
    public static final int v = 256;
    public static final int w = 512;
    public static final int x = 1024;
    public static final int y = 2048;
    public static final int z = 4096;
    public static final int A = 8192;
    public static final int B = 16384;
    public static final int C = 32768;
    public static final int D = 65536;
    public static final int E = 131072;
    public static final int F = 262144;
    public static final int G = 524288;
    public static final int H = 1048575;
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 3;
    public static final int M = 4;
    public static final int N = 5;
    public static final int O = 6;
    public static final int P = 7;
    public static final int Q = 8;
    public static final int R = 9;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 768;
    public static final int V = 769;
    public static final int W = 770;
    public static final int X = 771;
    public static final int Y = 772;
    public static final int Z = 773;
    public static final int aa = 774;
    public static final int ab = 775;
    public static final int ac = 776;
    public static final int ad = 32769;
    public static final int ae = 32770;
    public static final int af = 32771;
    public static final int ag = 32772;
    public static final int ah = 1;
    public static final int ai = 0;
    public static final int aj = 12288;
    public static final int ak = 12289;
    public static final int al = 12290;
    public static final int am = 12291;
    public static final int an = 12292;
    public static final int ao = 12293;
    public static final int ap = 5120;
    public static final int aq = 5121;
    public static final int ar = 5122;
    public static final int as = 5123;
    public static final int at = 5124;
    public static final int au = 5125;
    public static final int av = 5126;
    public static final int aw = 5127;
    public static final int ax = 5128;
    public static final int ay = 5129;
    public static final int az = 5130;
    public static final int aA = 0;
    public static final int aB = 1024;
    public static final int aC = 1025;
    public static final int aD = 1026;
    public static final int aE = 1027;
    public static final int aF = 1028;
    public static final int aG = 1029;
    public static final int aH = 1030;
    public static final int aI = 1031;
    public static final int aJ = 1032;
    public static final int aK = 1033;
    public static final int aL = 1034;
    public static final int aM = 1035;
    public static final int aN = 1036;
    public static final int aO = 0;
    public static final int aP = 1280;
    public static final int aQ = 1281;
    public static final int aR = 1282;
    public static final int aS = 1283;
    public static final int aT = 1284;
    public static final int aU = 1285;
    public static final int aV = 1536;
    public static final int aW = 1537;
    public static final int aX = 1538;
    public static final int aY = 1539;
    public static final int aZ = 1540;
    public static final int ba = 1792;
    public static final int bb = 1793;
    public static final int bc = 1794;
    public static final int bd = 1795;
    public static final int be = 1796;
    public static final int bf = 1797;
    public static final int bg = 1798;
    public static final int bh = 1799;
    public static final int bi = 2048;
    public static final int bj = 2049;
    public static final int bk = 2304;
    public static final int bl = 2305;
    public static final int bm = 2560;
    public static final int bn = 2561;
    public static final int bo = 2562;
    public static final int bp = 2816;
    public static final int bq = 2817;
    public static final int br = 2818;
    public static final int bs = 2819;
    public static final int bt = 2820;
    public static final int bu = 2821;
    public static final int bv = 2822;
    public static final int bw = 2823;
    public static final int bx = 2824;
    public static final int by = 2825;
    public static final int bz = 2832;
    public static final int bA = 2833;
    public static final int bB = 2834;
    public static final int bC = 2835;
    public static final int bD = 2848;
    public static final int bE = 2849;
    public static final int bF = 2850;
    public static final int bG = 2851;
    public static final int bH = 2852;
    public static final int bI = 2853;
    public static final int bJ = 2854;
    public static final int bK = 2864;
    public static final int bL = 2865;
    public static final int bM = 2866;
    public static final int bN = 2867;
    public static final int bO = 2880;
    public static final int bP = 2881;
    public static final int bQ = 2882;
    public static final int bR = 2883;
    public static final int bS = 2884;
    public static final int bT = 2885;
    public static final int bU = 2886;
    public static final int bV = 2896;
    public static final int bW = 2897;
    public static final int bX = 2898;
    public static final int bY = 2899;
    public static final int bZ = 2900;
    public static final int ca = 2901;
    public static final int cb = 2902;
    public static final int cc = 2903;
    public static final int cd = 2912;
    public static final int ce = 2913;
    public static final int cf = 2914;
    public static final int cg = 2915;
    public static final int ch = 2916;
    public static final int ci = 2917;
    public static final int cj = 2918;
    public static final int ck = 2928;
    public static final int cl = 2929;
    public static final int cm = 2930;
    public static final int cn = 2931;
    public static final int co = 2932;
    public static final int cp = 2944;
    public static final int cq = 2960;
    public static final int cr = 2961;
    public static final int cs = 2962;
    public static final int ct = 2963;
    public static final int cu = 2964;
    public static final int cv = 2965;
    public static final int cw = 2966;
    public static final int cx = 2967;
    public static final int cy = 2968;
    public static final int cz = 2976;
    public static final int cA = 2977;
    public static final int cB = 2978;
    public static final int cC = 2979;
    public static final int cD = 2980;
    public static final int cE = 2981;
    public static final int cF = 2982;
    public static final int cG = 2983;
    public static final int cH = 2984;
    public static final int cI = 2992;
    public static final int cJ = 2993;
    public static final int cK = 3008;
    public static final int cL = 3009;
    public static final int cM = 3010;
    public static final int cN = 3024;
    public static final int cO = 3040;
    public static final int cP = 3041;
    public static final int cQ = 3042;
    public static final int cR = 3056;
    public static final int cS = 3057;
    public static final int cT = 3058;
    public static final int cU = 3072;
    public static final int cV = 3073;
    public static final int cW = 3074;
    public static final int cX = 3088;
    public static final int cY = 3089;
    public static final int cZ = 3104;
    public static final int da = 3105;
    public static final int db = 3106;
    public static final int dc = 3107;
    public static final int dd = 3120;
    public static final int de = 3121;
    public static final int df = 3122;
    public static final int dg = 3123;
    public static final int dh = 3136;
    public static final int di = 3152;
    public static final int dj = 3153;
    public static final int dk = 3154;
    public static final int dl = 3155;
    public static final int dm = 3156;
    public static final int dn = 3168;
    public static final int do = 3169;
    public static final int dp = 3170;
    public static final int dq = 3171;
    public static final int dr = 3184;
    public static final int ds = 3185;
    public static final int dt = 3186;
    public static final int du = 3187;
    public static final int dv = 3188;
    public static final int dw = 3189;
    public static final int dx = 3190;
    public static final int dy = 3191;
    public static final int dz = 3192;
    public static final int dA = 3193;
    public static final int dB = 3248;
    public static final int dC = 3249;
    public static final int dD = 3250;
    public static final int dE = 3251;
    public static final int dF = 3252;
    public static final int dG = 3253;
    public static final int dH = 3254;
    public static final int dI = 3255;
    public static final int dJ = 3256;
    public static final int dK = 3257;
    public static final int dL = 3312;
    public static final int dM = 3313;
    public static final int dN = 3314;
    public static final int dO = 3315;
    public static final int dP = 3316;
    public static final int dQ = 3317;
    public static final int dR = 3328;
    public static final int dS = 3329;
    public static final int dT = 3330;
    public static final int dU = 3331;
    public static final int dV = 3332;
    public static final int dW = 3333;
    public static final int dX = 3344;
    public static final int dY = 3345;
    public static final int dZ = 3346;
    public static final int ea = 3347;
    public static final int eb = 3348;
    public static final int ec = 3349;
    public static final int ed = 3350;
    public static final int ee = 3351;
    public static final int ef = 3352;
    public static final int eg = 3353;
    public static final int eh = 3354;
    public static final int ei = 3355;
    public static final int ej = 3356;
    public static final int ek = 3357;
    public static final int el = 3358;
    public static final int em = 3359;
    public static final int en = 3376;
    public static final int eo = 3377;
    public static final int ep = 3378;
    public static final int eq = 3379;
    public static final int er = 3380;
    public static final int es = 3381;
    public static final int et = 3382;
    public static final int eu = 3383;
    public static final int ev = 3384;
    public static final int ew = 3385;
    public static final int ex = 3386;
    public static final int ey = 3387;
    public static final int ez = 3408;
    public static final int eA = 3409;
    public static final int eB = 3410;
    public static final int eC = 3411;
    public static final int eD = 3412;
    public static final int eE = 3413;
    public static final int eF = 3414;
    public static final int eG = 3415;
    public static final int eH = 3416;
    public static final int eI = 3417;
    public static final int eJ = 3418;
    public static final int eK = 3419;
    public static final int eL = 3440;
    public static final int eM = 3456;
    public static final int eN = 3472;
    public static final int eO = 3473;
    public static final int eP = 3474;
    public static final int eQ = 3475;
    public static final int eR = 3476;
    public static final int eS = 3477;
    public static final int eT = 3478;
    public static final int eU = 3479;
    public static final int eV = 3480;
    public static final int eW = 3504;
    public static final int eX = 3505;
    public static final int eY = 3506;
    public static final int eZ = 3507;
    public static final int fa = 3508;
    public static final int fb = 3509;
    public static final int fc = 3510;
    public static final int fd = 3511;
    public static final int fe = 3512;
    public static final int ff = 3536;
    public static final int fg = 3537;
    public static final int fh = 3538;
    public static final int fi = 3539;
    public static final int fj = 3552;
    public static final int fk = 3553;
    public static final int fl = 3568;
    public static final int fm = 3569;
    public static final int fn = 3570;
    public static final int fo = 3571;
    public static final int fp = 3572;
    public static final int fq = 4096;
    public static final int fr = 4097;
    public static final int fs = 4099;
    public static final int ft = 4100;
    public static final int fu = 4101;
    public static final int fv = 4352;
    public static final int fw = 4353;
    public static final int fx = 4354;
    public static final int fy = 16384;
    public static final int fz = 16385;
    public static final int fA = 16386;
    public static final int fB = 16387;
    public static final int fC = 16388;
    public static final int fD = 16389;
    public static final int fE = 16390;
    public static final int fF = 16391;
    public static final int fG = 4608;
    public static final int fH = 4609;
    public static final int fI = 4610;
    public static final int fJ = 4611;
    public static final int fK = 4612;
    public static final int fL = 4613;
    public static final int fM = 4614;
    public static final int fN = 4615;
    public static final int fO = 4616;
    public static final int fP = 4617;
    public static final int fQ = 4864;
    public static final int fR = 4865;
    public static final int fS = 5376;
    public static final int fT = 5377;
    public static final int fU = 5378;
    public static final int fV = 5379;
    public static final int fW = 5380;
    public static final int fX = 5381;
    public static final int fY = 5382;
    public static final int fZ = 5383;
    public static final int ga = 5384;
    public static final int gb = 5385;
    public static final int gc = 5386;
    public static final int gd = 5387;
    public static final int ge = 5388;
    public static final int gf = 5389;
    public static final int gg = 5390;
    public static final int gh = 5391;
    public static final int gi = 5632;
    public static final int gj = 5633;
    public static final int gk = 5634;
    public static final int gl = 5635;
    public static final int gm = 5888;
    public static final int gn = 5889;
    public static final int go = 5890;
    public static final int gp = 6144;
    public static final int gq = 6145;
    public static final int gr = 6146;
    public static final int gs = 6400;
    public static final int gt = 6401;
    public static final int gu = 6402;
    public static final int gv = 6403;
    public static final int gw = 6404;
    public static final int gx = 6405;
    public static final int gy = 6406;
    public static final int gz = 6407;
    public static final int gA = 6408;
    public static final int gB = 6409;
    public static final int gC = 6410;
    public static final int gD = 6656;
    public static final int gE = 6912;
    public static final int gF = 6913;
    public static final int gG = 6914;
    public static final int gH = 7168;
    public static final int gI = 7169;
    public static final int gJ = 7170;
    public static final int gK = 7424;
    public static final int gL = 7425;
    public static final int gM = 7680;
    public static final int gN = 7681;
    public static final int gO = 7682;
    public static final int gP = 7683;
    public static final int gQ = 7936;
    public static final int gR = 7937;
    public static final int gS = 7938;
    public static final int gT = 7939;
    public static final int gU = 8192;
    public static final int gV = 8193;
    public static final int gW = 8194;
    public static final int gX = 8195;
    public static final int gY = 8448;
    public static final int gZ = 8449;
    public static final int ha = 8704;
    public static final int hb = 8705;
    public static final int hc = 8960;
    public static final int hd = 9216;
    public static final int he = 9217;
    public static final int hf = 9218;
    public static final int hg = 9472;
    public static final int hh = 9473;
    public static final int hi = 9474;
    public static final int hj = 9728;
    public static final int hk = 9729;
    public static final int hl = 9984;
    public static final int hm = 9985;
    public static final int hn = 9986;
    public static final int ho = 9987;
    public static final int hp = 10240;
    public static final int hq = 10241;
    public static final int hr = 10242;
    public static final int hs = 10243;
    public static final int ht = 10496;
    public static final int hu = 10497;
    public static final int hv = 1;
    public static final int hw = 2;
    public static final int hx = -1;
    public static final int hy = 32824;
    public static final int hz = 10752;
    public static final int hA = 10753;
    public static final int hB = 10754;
    public static final int hC = 32823;
    public static final int hD = 32827;
    public static final int hE = 32828;
    public static final int hF = 32829;
    public static final int hG = 32830;
    public static final int hH = 32831;
    public static final int hI = 32832;
    public static final int hJ = 32833;
    public static final int hK = 32834;
    public static final int hL = 32835;
    public static final int hM = 32836;
    public static final int hN = 32837;
    public static final int hO = 32838;
    public static final int hP = 32839;
    public static final int hQ = 32840;
    public static final int hR = 32841;
    public static final int hS = 32842;
    public static final int hT = 32843;
    public static final int hU = 32844;
    public static final int hV = 32845;
    public static final int hW = 10768;
    public static final int hX = 32847;
    public static final int hY = 32848;
    public static final int hZ = 32849;
    public static final int ia = 32850;
    public static final int ib = 32851;
    public static final int ic = 32852;
    public static final int id = 32853;
    public static final int ie = 32854;
    public static final int if = 32855;
    public static final int ig = 32856;
    public static final int ih = 32857;
    public static final int ii = 32858;
    public static final int ij = 32859;
    public static final int ik = 32860;
    public static final int il = 32861;
    public static final int im = 32862;
    public static final int in = 32863;
    public static final int io = 32864;
    public static final int ip = 32865;
    public static final int iq = 32867;
    public static final int ir = 32868;
    public static final int is = 32870;
    public static final int it = 32871;
    public static final int iu = 32872;
    public static final int iv = 32873;
    public static final int iw = 32884;
    public static final int ix = 32885;
    public static final int iy = 32886;
    public static final int iz = 32887;
    public static final int iA = 32888;
    public static final int iB = 32889;
    public static final int iC = 32890;
    public static final int iD = 32891;
    public static final int iE = 32892;
    public static final int iF = 32894;
    public static final int iG = 32895;
    public static final int iH = 32897;
    public static final int iI = 32898;
    public static final int iJ = 32899;
    public static final int iK = 32901;
    public static final int iL = 32902;
    public static final int iM = 32904;
    public static final int iN = 32905;
    public static final int iO = 32906;
    public static final int iP = 32908;
    public static final int iQ = 32910;
    public static final int iR = 32911;
    public static final int iS = 32912;
    public static final int iT = 32913;
    public static final int iU = 32914;
    public static final int iV = 32915;
    public static final int iW = 10784;
    public static final int iX = 10785;
    public static final int iY = 10786;
    public static final int iZ = 10787;
    public static final int ja = 10788;
    public static final int jb = 10789;
    public static final int jc = 10790;
    public static final int jd = 10791;
    public static final int je = 10792;
    public static final int jf = 10793;
    public static final int jg = 10794;
    public static final int jh = 10795;
    public static final int ji = 10796;
    public static final int jj = 10797;
    public static final int jk = 3057;
    public static final int jl = 4099;

    private GL11() {
    }

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vG;
        org.lwjgl.a.a(l2);
        GL11.nglAccum(n2, f2, l2);
    }

    static native void nglAccum(int var0, float var1, long var2);

    public static void b(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vH;
        org.lwjgl.a.a(l2);
        GL11.nglAlphaFunc(n2, f2, l2);
    }

    static native void nglAlphaFunc(int var0, float var1, long var2);

    public static void a(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vI;
        org.lwjgl.a.a(l2);
        GL11.nglClearColor(f2, f3, f4, f5, l2);
    }

    static native void nglClearColor(float var0, float var1, float var2, float var3, long var4);

    public static void b(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vJ;
        org.lwjgl.a.a(l2);
        GL11.nglClearAccum(f2, f3, f4, f5, l2);
    }

    static native void nglClearAccum(float var0, float var1, float var2, float var3, long var4);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vK;
        org.lwjgl.a.a(l2);
        GL11.nglClear(n2, l2);
    }

    static native void nglClear(int var0, long var1);

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL11.nglCallLists(byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL11.nglCallLists(intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        GL11.nglCallLists(shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglCallLists(int var0, int var1, long var2, long var4);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vM;
        org.lwjgl.a.a(l2);
        GL11.nglCallList(n2, l2);
    }

    static native void nglCallList(int var0, long var1);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vN;
        org.lwjgl.a.a(l2);
        GL11.nglBlendFunc(n2, n3, l2);
    }

    static native void nglBlendFunc(int var0, int var1, long var2);

    public static void a(int n2, int n3, float f2, float f3, float f4, float f5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vO;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, (n2 + 7) / 8 * n3);
        }
        GL11.nglBitmap(n2, n3, f2, f3, f4, f5, org.lwjgl.o.b(byteBuffer), l2);
    }

    static native void nglBitmap(int var0, int var1, float var2, float var3, float var4, float var5, long var6, long var8);

    public static void a(int n2, int n3, float f2, float f3, float f4, float f5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.vO;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglBitmapBO(n2, n3, f2, f3, f4, f5, l2, l3);
    }

    static native void nglBitmapBO(int var0, int var1, float var2, float var3, float var4, float var5, long var6, long var8);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vP;
        org.lwjgl.a.a(l2);
        GL11.nglBindTexture(n2, n3, l2);
    }

    static native void nglBindTexture(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer, intBuffer.remaining());
        GL11.nglPrioritizeTextures(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglPrioritizeTextures(int var0, long var1, long var3, long var5);

    public static boolean a(IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer, intBuffer.remaining());
        boolean bl2 = GL11.nglAreTexturesResident(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        return bl2;
    }

    static native boolean nglAreTexturesResident(int var0, long var1, long var3, long var5);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vS;
        org.lwjgl.a.a(l2);
        GL11.nglBegin(n2, l2);
    }

    static native void nglBegin(int var0, long var1);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.vT;
        org.lwjgl.a.a(l2);
        GL11.nglEnd(l2);
    }

    static native void nglEnd(long var0);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vU;
        org.lwjgl.a.a(l2);
        GL11.nglArrayElement(n2, l2);
    }

    static native void nglArrayElement(int var0, long var1);

    public static void a(double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vV;
        org.lwjgl.a.a(l2);
        GL11.nglClearDepth(d2, l2);
    }

    static native void nglClearDepth(double var0, long var2);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vW;
        org.lwjgl.a.a(l2);
        GL11.nglDeleteLists(n2, n3, l2);
    }

    static native void nglDeleteLists(int var0, int var1, long var2);

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL11.nglDeleteTextures(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteTextures(int var0, long var1, long var3);

    public static void e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vX;
        org.lwjgl.a.a(l2);
        GL11.nglDeleteTextures(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void f(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vY;
        org.lwjgl.a.a(l2);
        GL11.nglCullFace(n2, l2);
    }

    static native void nglCullFace(int var0, long var1);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vZ;
        org.lwjgl.a.a(l2);
        GL11.nglCopyTexSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, l2);
    }

    static native void nglCopyTexSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wa;
        org.lwjgl.a.a(l2);
        GL11.nglCopyTexSubImage1D(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglCopyTexSubImage1D(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wb;
        org.lwjgl.a.a(l2);
        GL11.nglCopyTexImage2D(n2, n3, n4, n5, n6, n7, n8, n9, l2);
    }

    static native void nglCopyTexImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wc;
        org.lwjgl.a.a(l2);
        GL11.nglCopyTexImage1D(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    static native void nglCopyTexImage1D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wd;
        org.lwjgl.a.a(l2);
        GL11.nglCopyPixels(n2, n3, n4, n5, n6, l2);
    }

    static native void nglCopyPixels(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.we;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).p = doubleBuffer;
        }
        GL11.nglColorPointer(n2, 5130, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.we;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).p = floatBuffer;
        }
        GL11.nglColorPointer(n2, 5126, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.we;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).p = byteBuffer;
        }
        GL11.nglColorPointer(n2, bl2 ? 5121 : 5120, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglColorPointer(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.we;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.b(dt2);
        GL11.nglColorPointerBO(n2, n3, n4, l2, l3);
    }

    static native void nglColorPointerBO(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.we;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).p = byteBuffer;
        }
        GL11.nglColorPointer(n2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wf;
        org.lwjgl.a.a(l2);
        GL11.nglColorMaterial(n2, n3, l2);
    }

    static native void nglColorMaterial(int var0, int var1, long var2);

    public static void a(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wg;
        org.lwjgl.a.a(l2);
        GL11.nglColorMask(bl2, bl3, bl4, bl5, l2);
    }

    static native void nglColorMask(boolean var0, boolean var1, boolean var2, boolean var3, long var4);

    public static void a(byte by2, byte by3, byte by4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wh;
        org.lwjgl.a.a(l2);
        GL11.nglColor3b(by2, by3, by4, l2);
    }

    static native void nglColor3b(byte var0, byte var1, byte var2, long var3);

    public static void a(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wi;
        org.lwjgl.a.a(l2);
        GL11.nglColor3f(f2, f3, f4, l2);
    }

    static native void nglColor3f(float var0, float var1, float var2, long var3);

    public static void a(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wj;
        org.lwjgl.a.a(l2);
        GL11.nglColor3d(d2, d3, d4, l2);
    }

    static native void nglColor3d(double var0, double var2, double var4, long var6);

    public static void b(byte by2, byte by3, byte by4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wk;
        org.lwjgl.a.a(l2);
        GL11.nglColor3ub(by2, by3, by4, l2);
    }

    static native void nglColor3ub(byte var0, byte var1, byte var2, long var3);

    public static void a(byte by2, byte by3, byte by4, byte by5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wl;
        org.lwjgl.a.a(l2);
        GL11.nglColor4b(by2, by3, by4, by5, l2);
    }

    static native void nglColor4b(byte var0, byte var1, byte var2, byte var3, long var4);

    public static void c(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wm;
        org.lwjgl.a.a(l2);
        GL11.nglColor4f(f2, f3, f4, f5, l2);
    }

    static native void nglColor4f(float var0, float var1, float var2, float var3, long var4);

    public static void a(double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wn;
        org.lwjgl.a.a(l2);
        GL11.nglColor4d(d2, d3, d4, d5, l2);
    }

    static native void nglColor4d(double var0, double var2, double var4, double var6, long var8);

    public static void b(byte by2, byte by3, byte by4, byte by5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wo;
        org.lwjgl.a.a(l2);
        GL11.nglColor4ub(by2, by3, by4, by5, l2);
    }

    static native void nglColor4ub(byte var0, byte var1, byte var2, byte var3, long var4);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        GL11.nglClipPlane(n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglClipPlane(int var0, long var1, long var3);

    public static void g(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wq;
        org.lwjgl.a.a(l2);
        GL11.nglClearStencil(n2, l2);
    }

    static native void nglClearStencil(int var0, long var1);

    public static void h(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wr;
        org.lwjgl.a.a(l2);
        GL11.nglEvalPoint1(n2, l2);
    }

    static native void nglEvalPoint1(int var0, long var1);

    public static void e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ws;
        org.lwjgl.a.a(l2);
        GL11.nglEvalPoint2(n2, n3, l2);
    }

    static native void nglEvalPoint2(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wt;
        org.lwjgl.a.a(l2);
        GL11.nglEvalMesh1(n2, n3, n4, l2);
    }

    static native void nglEvalMesh1(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wu;
        org.lwjgl.a.a(l2);
        GL11.nglEvalMesh2(n2, n3, n4, n5, n6, l2);
    }

    static native void nglEvalMesh2(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wv;
        org.lwjgl.a.a(l2);
        GL11.nglEvalCoord1f(f2, l2);
    }

    static native void nglEvalCoord1f(float var0, long var1);

    public static void b(double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ww;
        org.lwjgl.a.a(l2);
        GL11.nglEvalCoord1d(d2, l2);
    }

    static native void nglEvalCoord1d(double var0, long var2);

    public static void a(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wx;
        org.lwjgl.a.a(l2);
        GL11.nglEvalCoord2f(f2, f3, l2);
    }

    static native void nglEvalCoord2f(float var0, float var1, long var2);

    public static void a(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wy;
        org.lwjgl.a.a(l2);
        GL11.nglEvalCoord2d(d2, d3, l2);
    }

    static native void nglEvalCoord2d(double var0, double var2, long var4);

    public static void i(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wz;
        org.lwjgl.a.a(l2);
        GL11.nglEnableClientState(n2, l2);
    }

    static native void nglEnableClientState(int var0, long var1);

    public static void j(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wA;
        org.lwjgl.a.a(l2);
        GL11.nglDisableClientState(n2, l2);
    }

    static native void nglDisableClientState(int var0, long var1);

    public static void k(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wB;
        org.lwjgl.a.a(l2);
        GL11.nglEnable(n2, l2);
    }

    static native void nglEnable(int var0, long var1);

    public static void l(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wC;
        org.lwjgl.a.a(l2);
        GL11.nglDisable(n2, l2);
    }

    static native void nglDisable(int var0, long var1);

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wD;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).q = byteBuffer;
        }
        GL11.nglEdgeFlagPointer(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglEdgeFlagPointer(int var0, long var1, long var3);

    public static void a(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.wD;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.b(dt2);
        GL11.nglEdgeFlagPointerBO(n2, l2, l3);
    }

    static native void nglEdgeFlagPointerBO(int var0, long var1, long var3);

    public static void a(boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wE;
        org.lwjgl.a.a(l2);
        GL11.nglEdgeFlag(bl2, l2);
    }

    static native void nglEdgeFlag(boolean var0, long var1);

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wF;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opengl.ft.a(byteBuffer, n4, n5, n2, n3, 1));
        GL11.nglDrawPixels(n2, n3, n4, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wF;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opengl.ft.a(intBuffer, n4, n5, n2, n3, 1));
        GL11.nglDrawPixels(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wF;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opengl.ft.a(shortBuffer, n4, n5, n2, n3, 1));
        GL11.nglDrawPixels(n2, n3, n4, n5, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglDrawPixels(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.wF;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglDrawPixelsBO(n2, n3, n4, n5, l2, l3);
    }

    static native void nglDrawPixelsBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void b(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wG;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL11.nglDrawElements(n2, byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wG;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        GL11.nglDrawElements(n2, intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wG;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL11.nglDrawElements(n2, shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglDrawElements(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.wG;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.d(dt2);
        GL11.nglDrawElementsBO(n2, n3, n4, l2, l3);
    }

    static native void nglDrawElementsBO(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wG;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.c(dt2);
        org.lwjgl.a.b(byteBuffer, n3);
        GL11.nglDrawElements(n2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void m(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wH;
        org.lwjgl.a.a(l2);
        GL11.nglDrawBuffer(n2, l2);
    }

    static native void nglDrawBuffer(int var0, long var1);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wI;
        org.lwjgl.a.a(l2);
        GL11.nglDrawArrays(n2, n3, n4, l2);
    }

    static native void nglDrawArrays(int var0, int var1, int var2, long var3);

    public static void b(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wJ;
        org.lwjgl.a.a(l2);
        GL11.nglDepthRange(d2, d3, l2);
    }

    static native void nglDepthRange(double var0, double var2, long var4);

    public static void b(boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wK;
        org.lwjgl.a.a(l2);
        GL11.nglDepthMask(bl2, l2);
    }

    static native void nglDepthMask(boolean var0, long var1);

    public static void n(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wL;
        org.lwjgl.a.a(l2);
        GL11.nglDepthFunc(n2, l2);
    }

    static native void nglDepthFunc(int var0, long var1);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL11.nglFeedbackBuffer(floatBuffer.remaining(), n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglFeedbackBuffer(int var0, int var1, long var2, long var4);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wN;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(floatBuffer, 256);
        GL11.nglGetPixelMapfv(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetPixelMapfv(int var0, long var1, long var3);

    public static void b(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.wN;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.h(dt2);
        GL11.nglGetPixelMapfvBO(n2, l2, l3);
    }

    static native void nglGetPixelMapfvBO(int var0, long var1, long var3);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wO;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(intBuffer, 256);
        GL11.nglGetPixelMapuiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetPixelMapuiv(int var0, long var1, long var3);

    public static void c(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.wO;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.h(dt2);
        GL11.nglGetPixelMapuivBO(n2, l2, l3);
    }

    static native void nglGetPixelMapuivBO(int var0, long var1, long var3);

    public static void b(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wP;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(shortBuffer, 256);
        GL11.nglGetPixelMapusv(n2, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetPixelMapusv(int var0, long var1, long var3);

    public static void d(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.wP;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.h(dt2);
        GL11.nglGetPixelMapusvBO(n2, l2, l3);
    }

    static native void nglGetPixelMapusvBO(int var0, long var1, long var3);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglGetMaterialfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetMaterialfv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglGetMaterialiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetMaterialiv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 256);
        GL11.nglGetMapfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetMapfv(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 256);
        GL11.nglGetMapdv(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetMapdv(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 256);
        GL11.nglGetMapiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetMapiv(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglGetLightfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetLightfv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglGetLightiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetLightiv(int var0, int var1, long var2, long var4);

    public static int b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.wX;
        org.lwjgl.a.a(l2);
        int n2 = GL11.nglGetError(l2);
        return n2;
    }

    static native int nglGetError(long var0);

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        GL11.nglGetClipPlane(n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetClipPlane(int var0, long var1, long var3);

    public static void c(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 16);
        GL11.nglGetBooleanv(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetBooleanv(int var0, long var1, long var3);

    public static boolean o(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.wZ;
        org.lwjgl.a.a(l2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, 1);
        GL11.nglGetBooleanv(n2, org.lwjgl.o.a(byteBuffer), l2);
        return byteBuffer.get(0) == 1;
    }

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xa;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        GL11.nglGetDoublev(n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetDoublev(int var0, long var1, long var3);

    public static double p(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xa;
        org.lwjgl.a.a(l2);
        DoubleBuffer doubleBuffer = org.lwjgl.opengl.i.d(dt2);
        GL11.nglGetDoublev(n2, org.lwjgl.o.a(doubleBuffer), l2);
        return doubleBuffer.get(0);
    }

    public static void c(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        GL11.nglGetFloatv(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetFloatv(int var0, long var1, long var3);

    public static float q(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xb;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL11.nglGetFloatv(n2, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void c(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 16);
        GL11.nglGetIntegerv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetIntegerv(int var0, long var1, long var3);

    public static int r(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xc;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL11.nglGetIntegerv(n2, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL11.nglGenTextures(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenTextures(int var0, long var1, long var3);

    public static int c() {
        dt dt2 = GLContext.a();
        long l2 = dt2.xd;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL11.nglGenTextures(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static int s(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xe;
        org.lwjgl.a.a(l2);
        int n3 = GL11.nglGenLists(n2, l2);
        return n3;
    }

    static native int nglGenLists(int var0, long var1);

    public static void a(double d2, double d3, double d4, double d5, double d6, double d7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xf;
        org.lwjgl.a.a(l2);
        GL11.nglFrustum(d2, d3, d4, d5, d6, d7, l2);
    }

    static native void nglFrustum(double var0, double var2, double var4, double var6, double var8, double var10, long var12);

    public static void t(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xg;
        org.lwjgl.a.a(l2);
        GL11.nglFrontFace(n2, l2);
    }

    static native void nglFrontFace(int var0, long var1);

    public static void c(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xh;
        org.lwjgl.a.a(l2);
        GL11.nglFogf(n2, f2, l2);
    }

    static native void nglFogf(int var0, float var1, long var2);

    public static void f(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xi;
        org.lwjgl.a.a(l2);
        GL11.nglFogi(n2, n3, l2);
    }

    static native void nglFogi(int var0, int var1, long var2);

    public static void d(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglFogfv(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglFogfv(int var0, long var1, long var3);

    public static void d(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglFogiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglFogiv(int var0, long var1, long var3);

    public static void d() {
        dt dt2 = GLContext.a();
        long l2 = dt2.xl;
        org.lwjgl.a.a(l2);
        GL11.nglFlush(l2);
    }

    static native void nglFlush(long var0);

    public static void e() {
        dt dt2 = GLContext.a();
        long l2 = dt2.xm;
        org.lwjgl.a.a(l2);
        GL11.nglFinish(l2);
    }

    static native void nglFinish(long var0);

    public static ByteBuffer e(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.xn;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = GL11.nglGetPointerv(n2, l2, l3);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetPointerv(int var0, long var1, long var3);

    public static boolean u(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xo;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL11.nglIsEnabled(n2, l2);
        return bl2;
    }

    static native boolean nglIsEnabled(int var0, long var1);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xp;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL11.nglInterleavedArrays(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void c(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xp;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        GL11.nglInterleavedArrays(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void e(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xp;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        GL11.nglInterleavedArrays(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xp;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        GL11.nglInterleavedArrays(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xp;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL11.nglInterleavedArrays(n2, n3, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglInterleavedArrays(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.xp;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.b(dt2);
        GL11.nglInterleavedArraysBO(n2, n3, l2, l3);
    }

    static native void nglInterleavedArraysBO(int var0, int var1, long var2, long var4);

    public static void f() {
        dt dt2 = GLContext.a();
        long l2 = dt2.xq;
        org.lwjgl.a.a(l2);
        GL11.nglInitNames(l2);
    }

    static native void nglInitNames(long var0);

    public static void g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xr;
        org.lwjgl.a.a(l2);
        GL11.nglHint(n2, n3, l2);
    }

    static native void nglHint(int var0, int var1, long var2);

    public static void f(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xs;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglGetTexParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetTexParameterfv(int var0, int var1, long var2, long var4);

    public static float h(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xs;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL11.nglGetTexParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xt;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglGetTexParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTexParameteriv(int var0, int var1, long var2, long var4);

    public static int i(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xt;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL11.nglGetTexParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglGetTexLevelParameterfv(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetTexLevelParameterfv(int var0, int var1, int var2, long var3, long var5);

    public static float c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xu;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL11.nglGetTexLevelParameterfv(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglGetTexLevelParameteriv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTexLevelParameteriv(int var0, int var1, int var2, long var3, long var5);

    public static int d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xv;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL11.nglGetTexLevelParameteriv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xw;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opengl.ft.a(byteBuffer, n4, n5, 1, 1, 1));
        GL11.nglGetTexImage(n2, n3, n4, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xw;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer, org.lwjgl.opengl.ft.a(doubleBuffer, n4, n5, 1, 1, 1));
        GL11.nglGetTexImage(n2, n3, n4, n5, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xw;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(floatBuffer, org.lwjgl.opengl.ft.a(floatBuffer, n4, n5, 1, 1, 1));
        GL11.nglGetTexImage(n2, n3, n4, n5, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xw;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opengl.ft.a(intBuffer, n4, n5, 1, 1, 1));
        GL11.nglGetTexImage(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xw;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opengl.ft.a(shortBuffer, n4, n5, 1, 1, 1));
        GL11.nglGetTexImage(n2, n3, n4, n5, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetTexImage(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void b(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.xw;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.h(dt2);
        GL11.nglGetTexImageBO(n2, n3, n4, n5, l2, l3);
    }

    static native void nglGetTexImageBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglGetTexGeniv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTexGeniv(int var0, int var1, long var2, long var4);

    public static int j(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xx;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL11.nglGetTexGeniv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void g(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglGetTexGenfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetTexGenfv(int var0, int var1, long var2, long var4);

    public static float k(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xy;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL11.nglGetTexGenfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void d(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        GL11.nglGetTexGendv(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetTexGendv(int var0, int var1, long var2, long var4);

    public static double l(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xz;
        org.lwjgl.a.a(l2);
        DoubleBuffer doubleBuffer = org.lwjgl.opengl.i.d(dt2);
        GL11.nglGetTexGendv(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
        return doubleBuffer.get(0);
    }

    public static void g(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglGetTexEnviv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTexEnviv(int var0, int var1, long var2, long var4);

    public static int m(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xA;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL11.nglGetTexEnviv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void h(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglGetTexEnvfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetTexEnvfv(int var0, int var1, long var2, long var4);

    public static float n(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xB;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL11.nglGetTexEnvfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static String v(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xC;
        org.lwjgl.a.a(l2);
        String string = GL11.nglGetString(n2, l2);
        return string;
    }

    static native String nglGetString(int var0, long var1);

    public static void b(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xD;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.b(byteBuffer, 128);
        GL11.nglGetPolygonStipple(org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetPolygonStipple(long var0, long var2);

    public static void a(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.xD;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.h(dt2);
        GL11.nglGetPolygonStippleBO(l2, l3);
    }

    static native void nglGetPolygonStippleBO(long var0, long var2);

    public static boolean w(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xE;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL11.nglIsList(n2, l2);
        return bl2;
    }

    static native boolean nglIsList(int var0, long var1);

    public static void a(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xF;
        org.lwjgl.a.a(l2);
        GL11.nglMaterialf(n2, n3, f2, l2);
    }

    static native void nglMaterialf(int var0, int var1, float var2, long var3);

    public static void e(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xG;
        org.lwjgl.a.a(l2);
        GL11.nglMateriali(n2, n3, n4, l2);
    }

    static native void nglMateriali(int var0, int var1, int var2, long var3);

    public static void i(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglMaterialfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglMaterialfv(int var0, int var1, long var2, long var4);

    public static void h(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglMaterialiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglMaterialiv(int var0, int var1, long var2, long var4);

    public static void a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xJ;
        org.lwjgl.a.a(l2);
        GL11.nglMapGrid1f(n2, f2, f3, l2);
    }

    static native void nglMapGrid1f(int var0, float var1, float var2, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xK;
        org.lwjgl.a.a(l2);
        GL11.nglMapGrid1d(n2, d2, d3, l2);
    }

    static native void nglMapGrid1d(int var0, double var1, double var3, long var5);

    public static void a(int n2, float f2, float f3, int n3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xL;
        org.lwjgl.a.a(l2);
        GL11.nglMapGrid2f(n2, f2, f3, n3, f4, f5, l2);
    }

    static native void nglMapGrid2f(int var0, float var1, float var2, int var3, float var4, float var5, long var6);

    public static void a(int n2, double d2, double d3, int n3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xM;
        org.lwjgl.a.a(l2);
        GL11.nglMapGrid2d(n2, d2, d3, n3, d4, d5, l2);
    }

    static native void nglMapGrid2d(int var0, double var1, double var3, int var5, double var6, double var8, long var10);

    public static void a(int n2, float f2, float f3, int n3, int n4, float f4, float f5, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL11.nglMap2f(n2, f2, f3, n3, n4, f4, f5, n5, n6, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglMap2f(int var0, float var1, float var2, int var3, int var4, float var5, float var6, int var7, int var8, long var9, long var11);

    public static void a(int n2, double d2, double d3, int n3, int n4, double d4, double d5, int n5, int n6, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL11.nglMap2d(n2, d2, d3, n3, n4, d4, d5, n5, n6, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglMap2d(int var0, double var1, double var3, int var5, int var6, double var7, double var9, int var11, int var12, long var13, long var15);

    public static void a(int n2, float f2, float f3, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL11.nglMap1f(n2, f2, f3, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglMap1f(int var0, float var1, float var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, double d2, double d3, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL11.nglMap1d(n2, d2, d3, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglMap1d(int var0, double var1, double var3, int var5, int var6, long var7, long var9);

    public static void x(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xR;
        org.lwjgl.a.a(l2);
        GL11.nglLogicOp(n2, l2);
    }

    static native void nglLogicOp(int var0, long var1);

    public static void y(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xS;
        org.lwjgl.a.a(l2);
        GL11.nglLoadName(n2, l2);
    }

    static native void nglLoadName(int var0, long var1);

    public static void a(FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        GL11.nglLoadMatrixf(org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglLoadMatrixf(long var0, long var2);

    public static void a(DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        GL11.nglLoadMatrixd(org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglLoadMatrixd(long var0, long var2);

    public static void g() {
        dt dt2 = GLContext.a();
        long l2 = dt2.xV;
        org.lwjgl.a.a(l2);
        GL11.nglLoadIdentity(l2);
    }

    static native void nglLoadIdentity(long var0);

    public static void z(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xW;
        org.lwjgl.a.a(l2);
        GL11.nglListBase(n2, l2);
    }

    static native void nglListBase(int var0, long var1);

    public static void b(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xX;
        org.lwjgl.a.a(l2);
        GL11.nglLineWidth(f2, l2);
    }

    static native void nglLineWidth(float var0, long var1);

    public static void a(int n2, short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xY;
        org.lwjgl.a.a(l2);
        GL11.nglLineStipple(n2, s2, l2);
    }

    static native void nglLineStipple(int var0, short var1, long var2);

    public static void d(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.xZ;
        org.lwjgl.a.a(l2);
        GL11.nglLightModelf(n2, f2, l2);
    }

    static native void nglLightModelf(int var0, float var1, long var2);

    public static void o(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ya;
        org.lwjgl.a.a(l2);
        GL11.nglLightModeli(n2, n3, l2);
    }

    static native void nglLightModeli(int var0, int var1, long var2);

    public static void e(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglLightModelfv(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglLightModelfv(int var0, long var1, long var3);

    public static void e(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglLightModeliv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglLightModeliv(int var0, long var1, long var3);

    public static void b(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yd;
        org.lwjgl.a.a(l2);
        GL11.nglLightf(n2, n3, f2, l2);
    }

    static native void nglLightf(int var0, int var1, float var2, long var3);

    public static void f(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ye;
        org.lwjgl.a.a(l2);
        GL11.nglLighti(n2, n3, n4, l2);
    }

    static native void nglLighti(int var0, int var1, int var2, long var3);

    public static void j(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglLightfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglLightfv(int var0, int var1, long var2, long var4);

    public static void i(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglLightiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglLightiv(int var0, int var1, long var2, long var4);

    public static boolean A(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yh;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL11.nglIsTexture(n2, l2);
        return bl2;
    }

    static native boolean nglIsTexture(int var0, long var1);

    public static void B(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yi;
        org.lwjgl.a.a(l2);
        GL11.nglMatrixMode(n2, l2);
    }

    static native void nglMatrixMode(int var0, long var1);

    public static void c(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yj;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, 128);
        GL11.nglPolygonStipple(org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglPolygonStipple(long var0, long var2);

    public static void b(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.yj;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglPolygonStippleBO(l2, l3);
    }

    static native void nglPolygonStippleBO(long var0, long var2);

    public static void b(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yk;
        org.lwjgl.a.a(l2);
        GL11.nglPolygonOffset(f2, f3, l2);
    }

    static native void nglPolygonOffset(float var0, float var1, long var2);

    public static void p(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yl;
        org.lwjgl.a.a(l2);
        GL11.nglPolygonMode(n2, n3, l2);
    }

    static native void nglPolygonMode(int var0, int var1, long var2);

    public static void c(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ym;
        org.lwjgl.a.a(l2);
        GL11.nglPointSize(f2, l2);
    }

    static native void nglPointSize(float var0, long var1);

    public static void c(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yn;
        org.lwjgl.a.a(l2);
        GL11.nglPixelZoom(f2, f3, l2);
    }

    static native void nglPixelZoom(float var0, float var1, long var2);

    public static void e(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yo;
        org.lwjgl.a.a(l2);
        GL11.nglPixelTransferf(n2, f2, l2);
    }

    static native void nglPixelTransferf(int var0, float var1, long var2);

    public static void q(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yp;
        org.lwjgl.a.a(l2);
        GL11.nglPixelTransferi(n2, n3, l2);
    }

    static native void nglPixelTransferi(int var0, int var1, long var2);

    public static void f(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yq;
        org.lwjgl.a.a(l2);
        GL11.nglPixelStoref(n2, f2, l2);
    }

    static native void nglPixelStoref(int var0, float var1, long var2);

    public static void r(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yr;
        org.lwjgl.a.a(l2);
        GL11.nglPixelStorei(n2, n3, l2);
    }

    static native void nglPixelStorei(int var0, int var1, long var2);

    public static void f(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ys;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(floatBuffer);
        GL11.nglPixelMapfv(n2, floatBuffer.remaining(), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglPixelMapfv(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ys;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglPixelMapfvBO(n2, n3, l2, l3);
    }

    static native void nglPixelMapfvBO(int var0, int var1, long var2, long var4);

    public static void f(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yt;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.b(intBuffer);
        GL11.nglPixelMapuiv(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglPixelMapuiv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.yt;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglPixelMapuivBO(n2, n3, l2, l3);
    }

    static native void nglPixelMapuivBO(int var0, int var1, long var2, long var4);

    public static void c(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yu;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL11.nglPixelMapusv(n2, shortBuffer.remaining(), org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglPixelMapusv(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.yu;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglPixelMapusvBO(n2, n3, l2, l3);
    }

    static native void nglPixelMapusvBO(int var0, int var1, long var2, long var4);

    public static void d(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yv;
        org.lwjgl.a.a(l2);
        GL11.nglPassThrough(f2, l2);
    }

    static native void nglPassThrough(float var0, long var1);

    public static void b(double d2, double d3, double d4, double d5, double d6, double d7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yw;
        org.lwjgl.a.a(l2);
        GL11.nglOrtho(d2, d3, d4, d5, d6, d7, l2);
    }

    static native void nglOrtho(double var0, double var2, double var4, double var6, double var8, double var10, long var12);

    public static void d(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).r = byteBuffer;
        }
        GL11.nglNormalPointer(5120, n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void d(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).r = doubleBuffer;
        }
        GL11.nglNormalPointer(5130, n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void g(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).r = floatBuffer;
        }
        GL11.nglNormalPointer(5126, n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void g(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).r = intBuffer;
        }
        GL11.nglNormalPointer(5124, n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglNormalPointer(int var0, int var1, long var2, long var4);

    public static void e(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.yx;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.b(dt2);
        GL11.nglNormalPointerBO(n2, n3, l2, l3);
    }

    static native void nglNormalPointerBO(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).r = byteBuffer;
        }
        GL11.nglNormalPointer(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void c(byte by2, byte by3, byte by4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yy;
        org.lwjgl.a.a(l2);
        GL11.nglNormal3b(by2, by3, by4, l2);
    }

    static native void nglNormal3b(byte var0, byte var1, byte var2, long var3);

    public static void b(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yz;
        org.lwjgl.a.a(l2);
        GL11.nglNormal3f(f2, f3, f4, l2);
    }

    static native void nglNormal3f(float var0, float var1, float var2, long var3);

    public static void b(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yA;
        org.lwjgl.a.a(l2);
        GL11.nglNormal3d(d2, d3, d4, l2);
    }

    static native void nglNormal3d(double var0, double var2, double var4, long var6);

    public static void g(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yB;
        org.lwjgl.a.a(l2);
        GL11.nglNormal3i(n2, n3, n4, l2);
    }

    static native void nglNormal3i(int var0, int var1, int var2, long var3);

    public static void s(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yC;
        org.lwjgl.a.a(l2);
        GL11.nglNewList(n2, n3, l2);
    }

    static native void nglNewList(int var0, int var1, long var2);

    public static void h() {
        dt dt2 = GLContext.a();
        long l2 = dt2.yD;
        org.lwjgl.a.a(l2);
        GL11.nglEndList(l2);
    }

    static native void nglEndList(long var0);

    public static void b(FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        GL11.nglMultMatrixf(org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglMultMatrixf(long var0, long var2);

    public static void b(DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        GL11.nglMultMatrixd(org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglMultMatrixd(long var0, long var2);

    public static void C(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yG;
        org.lwjgl.a.a(l2);
        GL11.nglShadeModel(n2, l2);
    }

    static native void nglShadeModel(int var0, long var1);

    public static void d(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL11.nglSelectBuffer(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglSelectBuffer(int var0, long var1, long var3);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yI;
        org.lwjgl.a.a(l2);
        GL11.nglScissor(n2, n3, n4, n5, l2);
    }

    static native void nglScissor(int var0, int var1, int var2, int var3, long var4);

    public static void c(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yJ;
        org.lwjgl.a.a(l2);
        GL11.nglScalef(f2, f3, f4, l2);
    }

    static native void nglScalef(float var0, float var1, float var2, long var3);

    public static void c(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yK;
        org.lwjgl.a.a(l2);
        GL11.nglScaled(d2, d3, d4, l2);
    }

    static native void nglScaled(double var0, double var2, double var4, long var6);

    public static void d(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yL;
        org.lwjgl.a.a(l2);
        GL11.nglRotatef(f2, f3, f4, f5, l2);
    }

    static native void nglRotatef(float var0, float var1, float var2, float var3, long var4);

    public static void b(double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yM;
        org.lwjgl.a.a(l2);
        GL11.nglRotated(d2, d3, d4, d5, l2);
    }

    static native void nglRotated(double var0, double var2, double var4, double var6, long var8);

    public static int D(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yN;
        org.lwjgl.a.a(l2);
        int n3 = GL11.nglRenderMode(n2, l2);
        return n3;
    }

    static native int nglRenderMode(int var0, long var1);

    public static void e(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yO;
        org.lwjgl.a.a(l2);
        GL11.nglRectf(f2, f3, f4, f5, l2);
    }

    static native void nglRectf(float var0, float var1, float var2, float var3, long var4);

    public static void c(double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yP;
        org.lwjgl.a.a(l2);
        GL11.nglRectd(d2, d3, d4, d5, l2);
    }

    static native void nglRectd(double var0, double var2, double var4, double var6, long var8);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yQ;
        org.lwjgl.a.a(l2);
        GL11.nglRecti(n2, n3, n4, n5, l2);
    }

    static native void nglRecti(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yR;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opengl.ft.a(byteBuffer, n6, n7, n4, n5, 1));
        GL11.nglReadPixels(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yR;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer, org.lwjgl.opengl.ft.a(doubleBuffer, n6, n7, n4, n5, 1));
        GL11.nglReadPixels(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yR;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(floatBuffer, org.lwjgl.opengl.ft.a(floatBuffer, n6, n7, n4, n5, 1));
        GL11.nglReadPixels(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yR;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opengl.ft.a(intBuffer, n6, n7, n4, n5, 1));
        GL11.nglReadPixels(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yR;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.g(dt2);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opengl.ft.a(shortBuffer, n6, n7, n4, n5, 1));
        GL11.nglReadPixels(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglReadPixels(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.yR;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.h(dt2);
        GL11.nglReadPixelsBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglReadPixelsBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void E(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yS;
        org.lwjgl.a.a(l2);
        GL11.nglReadBuffer(n2, l2);
    }

    static native void nglReadBuffer(int var0, long var1);

    public static void d(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yT;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos2f(f2, f3, l2);
    }

    static native void nglRasterPos2f(float var0, float var1, long var2);

    public static void c(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yU;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos2d(d2, d3, l2);
    }

    static native void nglRasterPos2d(double var0, double var2, long var4);

    public static void t(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yV;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos2i(n2, n3, l2);
    }

    static native void nglRasterPos2i(int var0, int var1, long var2);

    public static void d(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yW;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos3f(f2, f3, f4, l2);
    }

    static native void nglRasterPos3f(float var0, float var1, float var2, long var3);

    public static void d(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yX;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos3d(d2, d3, d4, l2);
    }

    static native void nglRasterPos3d(double var0, double var2, double var4, long var6);

    public static void h(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yY;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos3i(n2, n3, n4, l2);
    }

    static native void nglRasterPos3i(int var0, int var1, int var2, long var3);

    public static void f(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.yZ;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos4f(f2, f3, f4, f5, l2);
    }

    static native void nglRasterPos4f(float var0, float var1, float var2, float var3, long var4);

    public static void d(double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.za;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos4d(d2, d3, d4, d5, l2);
    }

    static native void nglRasterPos4d(double var0, double var2, double var4, double var6, long var8);

    public static void c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zb;
        org.lwjgl.a.a(l2);
        GL11.nglRasterPos4i(n2, n3, n4, n5, l2);
    }

    static native void nglRasterPos4i(int var0, int var1, int var2, int var3, long var4);

    public static void F(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zc;
        org.lwjgl.a.a(l2);
        GL11.nglPushName(n2, l2);
    }

    static native void nglPushName(int var0, long var1);

    public static void i() {
        dt dt2 = GLContext.a();
        long l2 = dt2.zd;
        org.lwjgl.a.a(l2);
        GL11.nglPopName(l2);
    }

    static native void nglPopName(long var0);

    public static void j() {
        dt dt2 = GLContext.a();
        long l2 = dt2.ze;
        org.lwjgl.a.a(l2);
        GL11.nglPushMatrix(l2);
    }

    static native void nglPushMatrix(long var0);

    public static void k() {
        dt dt2 = GLContext.a();
        long l2 = dt2.zf;
        org.lwjgl.a.a(l2);
        GL11.nglPopMatrix(l2);
    }

    static native void nglPopMatrix(long var0);

    public static void G(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zg;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.is.a(dt2, n2);
        GL11.nglPushClientAttrib(n2, l2);
    }

    static native void nglPushClientAttrib(int var0, long var1);

    public static void l() {
        dt dt2 = GLContext.a();
        long l2 = dt2.zh;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.is.a(dt2);
        GL11.nglPopClientAttrib(l2);
    }

    static native void nglPopClientAttrib(long var0);

    public static void H(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zi;
        org.lwjgl.a.a(l2);
        GL11.nglPushAttrib(n2, l2);
    }

    static native void nglPushAttrib(int var0, long var1);

    public static void m() {
        dt dt2 = GLContext.a();
        long l2 = dt2.zj;
        org.lwjgl.a.a(l2);
        GL11.nglPopAttrib(l2);
    }

    static native void nglPopAttrib(long var0);

    public static void i(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zk;
        org.lwjgl.a.a(l2);
        GL11.nglStencilFunc(n2, n3, n4, l2);
    }

    static native void nglStencilFunc(int var0, int var1, int var2, long var3);

    public static void e(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zl;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).s = doubleBuffer;
        }
        GL11.nglVertexPointer(n2, 5130, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void k(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zl;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).s = floatBuffer;
        }
        GL11.nglVertexPointer(n2, 5126, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void j(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zl;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).s = intBuffer;
        }
        GL11.nglVertexPointer(n2, 5124, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zl;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).s = shortBuffer;
        }
        GL11.nglVertexPointer(n2, 5122, n3, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexPointer(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.zl;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.b(dt2);
        GL11.nglVertexPointerBO(n2, n3, n4, l2, l3);
    }

    static native void nglVertexPointerBO(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zl;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).s = byteBuffer;
        }
        GL11.nglVertexPointer(n2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void e(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zm;
        org.lwjgl.a.a(l2);
        GL11.nglVertex2f(f2, f3, l2);
    }

    static native void nglVertex2f(float var0, float var1, long var2);

    public static void d(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zn;
        org.lwjgl.a.a(l2);
        GL11.nglVertex2d(d2, d3, l2);
    }

    static native void nglVertex2d(double var0, double var2, long var4);

    public static void u(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zo;
        org.lwjgl.a.a(l2);
        GL11.nglVertex2i(n2, n3, l2);
    }

    static native void nglVertex2i(int var0, int var1, long var2);

    public static void e(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zp;
        org.lwjgl.a.a(l2);
        GL11.nglVertex3f(f2, f3, f4, l2);
    }

    static native void nglVertex3f(float var0, float var1, float var2, long var3);

    public static void e(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zq;
        org.lwjgl.a.a(l2);
        GL11.nglVertex3d(d2, d3, d4, l2);
    }

    static native void nglVertex3d(double var0, double var2, double var4, long var6);

    public static void j(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zr;
        org.lwjgl.a.a(l2);
        GL11.nglVertex3i(n2, n3, n4, l2);
    }

    static native void nglVertex3i(int var0, int var1, int var2, long var3);

    public static void g(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zs;
        org.lwjgl.a.a(l2);
        GL11.nglVertex4f(f2, f3, f4, f5, l2);
    }

    static native void nglVertex4f(float var0, float var1, float var2, float var3, long var4);

    public static void e(double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zt;
        org.lwjgl.a.a(l2);
        GL11.nglVertex4d(d2, d3, d4, d5, l2);
    }

    static native void nglVertex4d(double var0, double var2, double var4, double var6, long var8);

    public static void d(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zu;
        org.lwjgl.a.a(l2);
        GL11.nglVertex4i(n2, n3, n4, n5, l2);
    }

    static native void nglVertex4i(int var0, int var1, int var2, int var3, long var4);

    public static void f(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zv;
        org.lwjgl.a.a(l2);
        GL11.nglTranslatef(f2, f3, f4, l2);
    }

    static native void nglTranslatef(float var0, float var1, float var2, long var3);

    public static void f(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zw;
        org.lwjgl.a.a(l2);
        GL11.nglTranslated(d2, d3, d4, l2);
    }

    static native void nglTranslated(double var0, double var2, double var4, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, org.lwjgl.opengl.ft.a(byteBuffer, n7, n8, n5));
        }
        GL11.nglTexImage1D(n2, n3, n4, n5, n6, n7, n8, org.lwjgl.o.b(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, org.lwjgl.opengl.ft.a(doubleBuffer, n7, n8, n5));
        }
        GL11.nglTexImage1D(n2, n3, n4, n5, n6, n7, n8, org.lwjgl.o.b(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, org.lwjgl.opengl.ft.a(floatBuffer, n7, n8, n5));
        }
        GL11.nglTexImage1D(n2, n3, n4, n5, n6, n7, n8, org.lwjgl.o.b(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, org.lwjgl.opengl.ft.a(intBuffer, n7, n8, n5));
        }
        GL11.nglTexImage1D(n2, n3, n4, n5, n6, n7, n8, org.lwjgl.o.b(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zx;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, org.lwjgl.opengl.ft.a(shortBuffer, n7, n8, n5));
        }
        GL11.nglTexImage1D(n2, n3, n4, n5, n6, n7, n8, org.lwjgl.o.b(shortBuffer), l2);
    }

    static native void nglTexImage1D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.zx;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglTexImage1DBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglTexImage1DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zy;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer, org.lwjgl.opengl.ft.a(byteBuffer, n8, n9, n5, n6));
        }
        GL11.nglTexImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.b(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zy;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (doubleBuffer != null) {
            org.lwjgl.a.a(doubleBuffer, org.lwjgl.opengl.ft.a(doubleBuffer, n8, n9, n5, n6));
        }
        GL11.nglTexImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.b(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zy;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer, org.lwjgl.opengl.ft.a(floatBuffer, n8, n9, n5, n6));
        }
        GL11.nglTexImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.b(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zy;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, org.lwjgl.opengl.ft.a(intBuffer, n8, n9, n5, n6));
        }
        GL11.nglTexImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.b(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zy;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer, org.lwjgl.opengl.ft.a(shortBuffer, n8, n9, n5, n6));
        }
        GL11.nglTexImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.b(shortBuffer), l2);
    }

    static native void nglTexImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.zy;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglTexImage2DBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglTexImage2DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zz;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opengl.ft.a(byteBuffer, n6, n7, n5, 1, 1));
        GL11.nglTexSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zz;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, org.lwjgl.opengl.ft.a(doubleBuffer, n6, n7, n5, 1, 1));
        GL11.nglTexSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zz;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, org.lwjgl.opengl.ft.a(floatBuffer, n6, n7, n5, 1, 1));
        GL11.nglTexSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zz;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opengl.ft.a(intBuffer, n6, n7, n5, 1, 1));
        GL11.nglTexSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zz;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opengl.ft.a(shortBuffer, n6, n7, n5, 1, 1));
        GL11.nglTexSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglTexSubImage1D(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.zz;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglTexSubImage1DBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglTexSubImage1DBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zA;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opengl.ft.a(byteBuffer, n8, n9, n6, n7, 1));
        GL11.nglTexSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zA;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, org.lwjgl.opengl.ft.a(doubleBuffer, n8, n9, n6, n7, 1));
        GL11.nglTexSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zA;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, org.lwjgl.opengl.ft.a(floatBuffer, n8, n9, n6, n7, 1));
        GL11.nglTexSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zA;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opengl.ft.a(intBuffer, n8, n9, n6, n7, 1));
        GL11.nglTexSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zA;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opengl.ft.a(shortBuffer, n8, n9, n6, n7, 1));
        GL11.nglTexSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglTexSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.zA;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.j(dt2);
        GL11.nglTexSubImage2DBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglTexSubImage2DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void c(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zB;
        org.lwjgl.a.a(l2);
        GL11.nglTexParameterf(n2, n3, f2, l2);
    }

    static native void nglTexParameterf(int var0, int var1, float var2, long var3);

    public static void k(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zC;
        org.lwjgl.a.a(l2);
        GL11.nglTexParameteri(n2, n3, n4, l2);
    }

    static native void nglTexParameteri(int var0, int var1, int var2, long var3);

    public static void l(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglTexParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglTexParameterfv(int var0, int var1, long var2, long var4);

    public static void k(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglTexParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexParameteriv(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zF;
        org.lwjgl.a.a(l2);
        GL11.nglTexGenf(n2, n3, f2, l2);
    }

    static native void nglTexGenf(int var0, int var1, float var2, long var3);

    public static void a(int n2, int n3, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zG;
        org.lwjgl.a.a(l2);
        GL11.nglTexGend(n2, n3, d2, l2);
    }

    static native void nglTexGend(int var0, int var1, double var2, long var4);

    public static void m(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglTexGenfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglTexGenfv(int var0, int var1, long var2, long var4);

    public static void f(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        GL11.nglTexGendv(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglTexGendv(int var0, int var1, long var2, long var4);

    public static void l(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zJ;
        org.lwjgl.a.a(l2);
        GL11.nglTexGeni(n2, n3, n4, l2);
    }

    static native void nglTexGeni(int var0, int var1, int var2, long var3);

    public static void l(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglTexGeniv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexGeniv(int var0, int var1, long var2, long var4);

    public static void e(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zL;
        org.lwjgl.a.a(l2);
        GL11.nglTexEnvf(n2, n3, f2, l2);
    }

    static native void nglTexEnvf(int var0, int var1, float var2, long var3);

    public static void m(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zM;
        org.lwjgl.a.a(l2);
        GL11.nglTexEnvi(n2, n3, n4, l2);
    }

    static native void nglTexEnvi(int var0, int var1, int var2, long var3);

    public static void n(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL11.nglTexEnvfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglTexEnvfv(int var0, int var1, long var2, long var4);

    public static void m(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL11.nglTexEnviv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexEnviv(int var0, int var1, long var2, long var4);

    public static void g(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zP;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).d[org.lwjgl.opengl.is.b((dt)dt2).e] = doubleBuffer;
        }
        GL11.nglTexCoordPointer(n2, 5130, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void o(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zP;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).d[org.lwjgl.opengl.is.b((dt)dt2).e] = floatBuffer;
        }
        GL11.nglTexCoordPointer(n2, 5126, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void n(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zP;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).d[org.lwjgl.opengl.is.b((dt)dt2).e] = intBuffer;
        }
        GL11.nglTexCoordPointer(n2, 5124, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void c(int n2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zP;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).d[org.lwjgl.opengl.is.b((dt)dt2).e] = shortBuffer;
        }
        GL11.nglTexCoordPointer(n2, 5122, n3, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglTexCoordPointer(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.zP;
        org.lwjgl.a.a(l3);
        org.lwjgl.opengl.ft.b(dt2);
        GL11.nglTexCoordPointerBO(n2, n3, n4, l2, l3);
    }

    static native void nglTexCoordPointerBO(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zP;
        org.lwjgl.a.a(l2);
        org.lwjgl.opengl.ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            org.lwjgl.opengl.is.b((dt)dt2).d[org.lwjgl.opengl.is.b((dt)dt2).e] = byteBuffer;
        }
        GL11.nglTexCoordPointer(n2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void e(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zQ;
        org.lwjgl.a.a(l2);
        GL11.nglTexCoord1f(f2, l2);
    }

    static native void nglTexCoord1f(float var0, long var1);

    public static void c(double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zR;
        org.lwjgl.a.a(l2);
        GL11.nglTexCoord1d(d2, l2);
    }

    static native void nglTexCoord1d(double var0, long var2);

    public static void f(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zS;
        org.lwjgl.a.a(l2);
        GL11.nglTexCoord2f(f2, f3, l2);
    }

    static native void nglTexCoord2f(float var0, float var1, long var2);

    public static void e(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zT;
        org.lwjgl.a.a(l2);
        GL11.nglTexCoord2d(d2, d3, l2);
    }

    static native void nglTexCoord2d(double var0, double var2, long var4);

    public static void g(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zU;
        org.lwjgl.a.a(l2);
        GL11.nglTexCoord3f(f2, f3, f4, l2);
    }

    static native void nglTexCoord3f(float var0, float var1, float var2, long var3);

    public static void g(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zV;
        org.lwjgl.a.a(l2);
        GL11.nglTexCoord3d(d2, d3, d4, l2);
    }

    static native void nglTexCoord3d(double var0, double var2, double var4, long var6);

    public static void h(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zW;
        org.lwjgl.a.a(l2);
        GL11.nglTexCoord4f(f2, f3, f4, f5, l2);
    }

    static native void nglTexCoord4f(float var0, float var1, float var2, float var3, long var4);

    public static void f(double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zX;
        org.lwjgl.a.a(l2);
        GL11.nglTexCoord4d(d2, d3, d4, d5, l2);
    }

    static native void nglTexCoord4d(double var0, double var2, double var4, double var6, long var8);

    public static void n(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zY;
        org.lwjgl.a.a(l2);
        GL11.nglStencilOp(n2, n3, n4, l2);
    }

    static native void nglStencilOp(int var0, int var1, int var2, long var3);

    public static void I(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.zZ;
        org.lwjgl.a.a(l2);
        GL11.nglStencilMask(n2, l2);
    }

    static native void nglStencilMask(int var0, long var1);

    public static void e(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Aa;
        org.lwjgl.a.a(l2);
        GL11.nglViewport(n2, n3, n4, n5, l2);
    }

    static native void nglViewport(int var0, int var1, int var2, int var3, long var4);
}

