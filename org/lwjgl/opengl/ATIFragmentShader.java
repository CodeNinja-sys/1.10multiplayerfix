/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ATIFragmentShader {
    public static final int a = 35104;
    public static final int b = 35105;
    public static final int c = 35106;
    public static final int d = 35107;
    public static final int e = 35108;
    public static final int f = 35109;
    public static final int g = 35110;
    public static final int h = 35111;
    public static final int i = 35112;
    public static final int j = 35113;
    public static final int k = 35114;
    public static final int l = 35115;
    public static final int m = 35116;
    public static final int n = 35117;
    public static final int o = 35118;
    public static final int p = 35119;
    public static final int q = 35120;
    public static final int r = 35121;
    public static final int s = 35122;
    public static final int t = 35123;
    public static final int u = 35124;
    public static final int v = 35125;
    public static final int w = 35126;
    public static final int x = 35127;
    public static final int y = 35128;
    public static final int z = 35129;
    public static final int A = 35130;
    public static final int B = 35131;
    public static final int C = 35132;
    public static final int D = 35133;
    public static final int E = 35134;
    public static final int F = 35135;
    public static final int G = 35136;
    public static final int H = 35137;
    public static final int I = 35138;
    public static final int J = 35139;
    public static final int K = 35140;
    public static final int L = 35141;
    public static final int M = 35142;
    public static final int N = 35143;
    public static final int O = 35144;
    public static final int P = 35145;
    public static final int Q = 35146;
    public static final int R = 35147;
    public static final int S = 35148;
    public static final int T = 35149;
    public static final int U = 35150;
    public static final int V = 35151;
    public static final int W = 35152;
    public static final int X = 35153;
    public static final int Y = 35154;
    public static final int Z = 35155;
    public static final int aa = 35156;
    public static final int ab = 35157;
    public static final int ac = 35158;
    public static final int ad = 35159;
    public static final int ae = 35160;
    public static final int af = 35161;
    public static final int ag = 35162;
    public static final int ah = 35163;
    public static final int ai = 35164;
    public static final int aj = 35165;
    public static final int ak = 35166;
    public static final int al = 35167;
    public static final int am = 35168;
    public static final int an = 35169;
    public static final int ao = 35171;
    public static final int ap = 35172;
    public static final int aq = 35173;
    public static final int ar = 35174;
    public static final int as = 35175;
    public static final int at = 35176;
    public static final int au = 35177;
    public static final int av = 35178;
    public static final int aw = 35179;
    public static final int ax = 35180;
    public static final int ay = 35181;
    public static final int az = 35182;
    public static final int aA = 35183;
    public static final int aB = 35184;
    public static final int aC = 35185;
    public static final int aD = 35186;
    public static final int aE = 35187;
    public static final int aF = 35188;
    public static final int aG = 35189;
    public static final int aH = 35190;
    public static final int aI = 35191;
    public static final int aJ = 35192;
    public static final int aK = 35193;
    public static final int aL = 35194;
    public static final int aM = 35195;
    public static final int aN = 1;
    public static final int aO = 2;
    public static final int aP = 4;
    public static final int aQ = 1;
    public static final int aR = 2;
    public static final int aS = 4;
    public static final int aT = 8;
    public static final int aU = 16;
    public static final int aV = 32;
    public static final int aW = 64;
    public static final int aX = 2;
    public static final int aY = 4;
    public static final int aZ = 8;

    private ATIFragmentShader() {
    }

    public static int a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ni;
        org.lwjgl.a.a(l2);
        int n3 = ATIFragmentShader.nglGenFragmentShadersATI(n2, l2);
        return n3;
    }

    static native int nglGenFragmentShadersATI(int var0, long var1);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nj;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglBindFragmentShaderATI(n2, l2);
    }

    static native void nglBindFragmentShaderATI(int var0, long var1);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nk;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglDeleteFragmentShaderATI(n2, l2);
    }

    static native void nglDeleteFragmentShaderATI(int var0, long var1);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.nl;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglBeginFragmentShaderATI(l2);
    }

    static native void nglBeginFragmentShaderATI(long var0);

    public static void b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.nm;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglEndFragmentShaderATI(l2);
    }

    static native void nglEndFragmentShaderATI(long var0);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nn;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglPassTexCoordATI(n2, n3, n4, l2);
    }

    static native void nglPassTexCoordATI(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.no;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglSampleMapATI(n2, n3, n4, l2);
    }

    static native void nglSampleMapATI(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.np;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglColorFragmentOp1ATI(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    static native void nglColorFragmentOp1ATI(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nq;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglColorFragmentOp2ATI(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2);
    }

    static native void nglColorFragmentOp2ATI(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nr;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglColorFragmentOp3ATI(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, l2);
    }

    static native void nglColorFragmentOp3ATI(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, long var13);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ns;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglAlphaFragmentOp1ATI(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglAlphaFragmentOp1ATI(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nt;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglAlphaFragmentOp2ATI(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2);
    }

    static native void nglAlphaFragmentOp2ATI(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nu;
        org.lwjgl.a.a(l2);
        ATIFragmentShader.nglAlphaFragmentOp3ATI(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, l2);
    }

    static native void nglAlphaFragmentOp3ATI(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, long var12);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ATIFragmentShader.nglSetFragmentShaderConstantATI(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglSetFragmentShaderConstantATI(int var0, long var1, long var3);
}

