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
import org.lwjgl.opengl.is;

public final class EXTVertexShader {
    public static final int a = 34688;
    public static final int b = 34689;
    public static final int c = 34690;
    public static final int d = 34691;
    public static final int e = 34692;
    public static final int f = 34693;
    public static final int g = 34694;
    public static final int h = 34695;
    public static final int i = 34696;
    public static final int j = 34697;
    public static final int k = 34698;
    public static final int l = 34699;
    public static final int m = 34700;
    public static final int n = 34701;
    public static final int o = 34702;
    public static final int p = 34703;
    public static final int q = 34704;
    public static final int r = 34705;
    public static final int s = 34706;
    public static final int t = 34707;
    public static final int u = 34708;
    public static final int v = 34709;
    public static final int w = 34710;
    public static final int x = 34711;
    public static final int y = 34712;
    public static final int z = 34713;
    public static final int A = 34714;
    public static final int B = 34715;
    public static final int C = 34716;
    public static final int D = 34717;
    public static final int E = 34718;
    public static final int F = 34719;
    public static final int G = 34720;
    public static final int H = 34721;
    public static final int I = 34722;
    public static final int J = 34723;
    public static final int K = 34724;
    public static final int L = 34725;
    public static final int M = 34726;
    public static final int N = 34727;
    public static final int O = 34728;
    public static final int P = 34729;
    public static final int Q = 34730;
    public static final int R = 34731;
    public static final int S = 34732;
    public static final int T = 34733;
    public static final int U = 34734;
    public static final int V = 34735;
    public static final int W = 34736;
    public static final int X = 34737;
    public static final int Y = 34738;
    public static final int Z = 34739;
    public static final int aa = 34740;
    public static final int ab = 34741;
    public static final int ac = 34742;
    public static final int ad = 34743;
    public static final int ae = 34744;
    public static final int af = 34745;
    public static final int ag = 34746;
    public static final int ah = 34747;
    public static final int ai = 34748;
    public static final int aj = 34749;
    public static final int ak = 34750;
    public static final int al = 34751;
    public static final int am = 34752;
    public static final int an = 34753;
    public static final int ao = 34754;
    public static final int ap = 34755;
    public static final int aq = 34756;
    public static final int ar = 34757;
    public static final int as = 34758;
    public static final int at = 34759;
    public static final int au = 34760;
    public static final int av = 34761;
    public static final int aw = 34762;
    public static final int ax = 34763;
    public static final int ay = 34764;
    public static final int az = 34765;
    public static final int aA = 34766;
    public static final int aB = 34767;
    public static final int aC = 34768;
    public static final int aD = 34769;
    public static final int aE = 34770;
    public static final int aF = 34771;
    public static final int aG = 34772;
    public static final int aH = 34773;
    public static final int aI = 34774;
    public static final int aJ = 34775;
    public static final int aK = 34776;
    public static final int aL = 34777;
    public static final int aM = 34778;
    public static final int aN = 34779;
    public static final int aO = 34780;
    public static final int aP = 34781;
    public static final int aQ = 34782;
    public static final int aR = 34783;
    public static final int aS = 34784;
    public static final int aT = 34785;
    public static final int aU = 34786;
    public static final int aV = 34787;
    public static final int aW = 34788;
    public static final int aX = 34789;
    public static final int aY = 34790;
    public static final int aZ = 34791;
    public static final int ba = 34792;
    public static final int bb = 34793;
    public static final int bc = 34794;
    public static final int bd = 34795;
    public static final int be = 34796;
    public static final int bf = 34797;

    private EXTVertexShader() {
    }

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.uO;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglBeginVertexShaderEXT(l2);
    }

    static native void nglBeginVertexShaderEXT(long var0);

    public static void b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.uP;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglEndVertexShaderEXT(l2);
    }

    static native void nglEndVertexShaderEXT(long var0);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uQ;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglBindVertexShaderEXT(n2, l2);
    }

    static native void nglBindVertexShaderEXT(int var0, long var1);

    public static int b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uR;
        org.lwjgl.a.a(l2);
        int n3 = EXTVertexShader.nglGenVertexShadersEXT(n2, l2);
        return n3;
    }

    static native int nglGenVertexShadersEXT(int var0, long var1);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uS;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglDeleteVertexShaderEXT(n2, l2);
    }

    static native void nglDeleteVertexShaderEXT(int var0, long var1);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uT;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglShaderOp1EXT(n2, n3, n4, l2);
    }

    static native void nglShaderOp1EXT(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uU;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglShaderOp2EXT(n2, n3, n4, n5, l2);
    }

    static native void nglShaderOp2EXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uV;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglShaderOp3EXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglShaderOp3EXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uW;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglSwizzleEXT(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglSwizzleEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uX;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglWriteMaskEXT(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglWriteMaskEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uY;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglInsertComponentEXT(n2, n3, n4, l2);
    }

    static native void nglInsertComponentEXT(int var0, int var1, int var2, long var3);

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uZ;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglExtractComponentEXT(n2, n3, n4, l2);
    }

    static native void nglExtractComponentEXT(int var0, int var1, int var2, long var3);

    public static int b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.va;
        org.lwjgl.a.a(l2);
        int n6 = EXTVertexShader.nglGenSymbolsEXT(n2, n3, n4, n5, l2);
        return n6;
    }

    static native int nglGenSymbolsEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTVertexShader.nglSetInvariantEXT(n2, 5130, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTVertexShader.nglSetInvariantEXT(n2, 5126, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, boolean bl2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTVertexShader.nglSetInvariantEXT(n2, bl2 ? 5121 : 5120, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, boolean bl2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTVertexShader.nglSetInvariantEXT(n2, bl2 ? 5125 : 5124, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, boolean bl2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, 4);
        EXTVertexShader.nglSetInvariantEXT(n2, bl2 ? 5123 : 5122, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglSetInvariantEXT(int var0, int var1, long var2, long var4);

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTVertexShader.nglSetLocalConstantEXT(n2, 5130, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTVertexShader.nglSetLocalConstantEXT(n2, 5126, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, boolean bl2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTVertexShader.nglSetLocalConstantEXT(n2, bl2 ? 5121 : 5120, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, boolean bl2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTVertexShader.nglSetLocalConstantEXT(n2, bl2 ? 5125 : 5124, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, boolean bl2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, 4);
        EXTVertexShader.nglSetLocalConstantEXT(n2, bl2 ? 5123 : 5122, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglSetLocalConstantEXT(int var0, int var1, long var2, long var4);

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTVertexShader.nglVariantbvEXT(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglVariantbvEXT(int var0, long var1, long var3);

    public static void a(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ve;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, 4);
        EXTVertexShader.nglVariantsvEXT(n2, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVariantsvEXT(int var0, long var1, long var3);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTVertexShader.nglVariantivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVariantivEXT(int var0, long var1, long var3);

    public static void c(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTVertexShader.nglVariantfvEXT(n2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglVariantfvEXT(int var0, long var1, long var3);

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTVertexShader.nglVariantdvEXT(n2, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVariantdvEXT(int var0, long var1, long var3);

    public static void b(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTVertexShader.nglVariantubvEXT(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglVariantubvEXT(int var0, long var1, long var3);

    public static void b(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, 4);
        EXTVertexShader.nglVariantusvEXT(n2, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVariantusvEXT(int var0, long var1, long var3);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTVertexShader.nglVariantuivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVariantuivEXT(int var0, long var1, long var3);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vl;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).n = doubleBuffer;
        }
        EXTVertexShader.nglVariantPointerEXT(n2, 5130, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vl;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).n = floatBuffer;
        }
        EXTVertexShader.nglVariantPointerEXT(n2, 5126, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vl;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).n = byteBuffer;
        }
        EXTVertexShader.nglVariantPointerEXT(n2, bl2 ? 5121 : 5120, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vl;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).n = intBuffer;
        }
        EXTVertexShader.nglVariantPointerEXT(n2, bl2 ? 5125 : 5124, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vl;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).n = shortBuffer;
        }
        EXTVertexShader.nglVariantPointerEXT(n2, bl2 ? 5123 : 5122, n3, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVariantPointerEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.vl;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        EXTVertexShader.nglVariantPointerEXTBO(n2, n3, n4, l2, l3);
    }

    static native void nglVariantPointerEXTBO(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vm;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglEnableVariantClientStateEXT(n2, l2);
    }

    static native void nglEnableVariantClientStateEXT(int var0, long var1);

    public static void e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vn;
        org.lwjgl.a.a(l2);
        EXTVertexShader.nglDisableVariantClientStateEXT(n2, l2);
    }

    static native void nglDisableVariantClientStateEXT(int var0, long var1);

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vo;
        org.lwjgl.a.a(l2);
        int n4 = EXTVertexShader.nglBindLightParameterEXT(n2, n3, l2);
        return n4;
    }

    static native int nglBindLightParameterEXT(int var0, int var1, long var2);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vp;
        org.lwjgl.a.a(l2);
        int n4 = EXTVertexShader.nglBindMaterialParameterEXT(n2, n3, l2);
        return n4;
    }

    static native int nglBindMaterialParameterEXT(int var0, int var1, long var2);

    public static int d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vq;
        org.lwjgl.a.a(l2);
        int n5 = EXTVertexShader.nglBindTexGenParameterEXT(n2, n3, n4, l2);
        return n5;
    }

    static native int nglBindTexGenParameterEXT(int var0, int var1, int var2, long var3);

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vr;
        org.lwjgl.a.a(l2);
        int n4 = EXTVertexShader.nglBindTextureUnitParameterEXT(n2, n3, l2);
        return n4;
    }

    static native int nglBindTextureUnitParameterEXT(int var0, int var1, long var2);

    public static int f(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vs;
        org.lwjgl.a.a(l2);
        int n3 = EXTVertexShader.nglBindParameterEXT(n2, l2);
        return n3;
    }

    static native int nglBindParameterEXT(int var0, long var1);

    public static boolean d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vt;
        org.lwjgl.a.a(l2);
        boolean bl2 = EXTVertexShader.nglIsVariantEnabledEXT(n2, n3, l2);
        return bl2;
    }

    static native boolean nglIsVariantEnabledEXT(int var0, int var1, long var2);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTVertexShader.nglGetVariantBooleanvEXT(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetVariantBooleanvEXT(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTVertexShader.nglGetVariantIntegervEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVariantIntegervEXT(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTVertexShader.nglGetVariantFloatvEXT(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetVariantFloatvEXT(int var0, int var1, long var2, long var4);

    public static ByteBuffer a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.vx;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = EXTVertexShader.nglGetVariantPointervEXT(n2, n3, l2, l3);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetVariantPointervEXT(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTVertexShader.nglGetInvariantBooleanvEXT(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetInvariantBooleanvEXT(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTVertexShader.nglGetInvariantIntegervEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetInvariantIntegervEXT(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTVertexShader.nglGetInvariantFloatvEXT(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetInvariantFloatvEXT(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTVertexShader.nglGetLocalConstantBooleanvEXT(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetLocalConstantBooleanvEXT(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTVertexShader.nglGetLocalConstantIntegervEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetLocalConstantIntegervEXT(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTVertexShader.nglGetLocalConstantFloatvEXT(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetLocalConstantFloatvEXT(int var0, int var1, long var2, long var4);
}

