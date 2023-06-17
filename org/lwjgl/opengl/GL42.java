/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;

public final class GL42 {
    public static final int a = 36492;
    public static final int b = 36493;
    public static final int c = 36494;
    public static final int d = 36495;
    public static final int e = 37159;
    public static final int f = 37160;
    public static final int g = 37161;
    public static final int h = 37162;
    public static final int i = 37163;
    public static final int j = 37164;
    public static final int k = 37165;
    public static final int l = 37166;
    public static final int m = 37568;
    public static final int n = 37569;
    public static final int o = 37570;
    public static final int p = 37571;
    public static final int q = 37572;
    public static final int r = 37573;
    public static final int s = 37574;
    public static final int t = 37575;
    public static final int u = 37576;
    public static final int v = 37577;
    public static final int w = 37578;
    public static final int x = 37579;
    public static final int y = 37580;
    public static final int z = 37581;
    public static final int A = 37582;
    public static final int B = 37583;
    public static final int C = 37584;
    public static final int D = 37585;
    public static final int E = 37586;
    public static final int F = 37587;
    public static final int G = 37588;
    public static final int H = 37589;
    public static final int I = 37590;
    public static final int J = 37591;
    public static final int K = 37592;
    public static final int L = 37596;
    public static final int M = 37593;
    public static final int N = 37594;
    public static final int O = 37595;
    public static final int P = 37167;
    public static final int Q = 36664;
    public static final int R = 36665;
    public static final int S = 36973;
    public static final int T = 37066;
    public static final int U = 37067;
    public static final int V = 37068;
    public static final int W = 37069;
    public static final int X = 37070;
    public static final int Y = 37071;
    public static final int Z = 36666;
    public static final int aa = 36667;
    public static final int ab = 36668;
    public static final int ac = 36669;
    public static final int ad = 36670;
    public static final int ae = 36974;
    public static final int af = 1;
    public static final int ag = 2;
    public static final int ah = 4;
    public static final int ai = 8;
    public static final int aj = 32;
    public static final int ak = 64;
    public static final int al = 128;
    public static final int am = 256;
    public static final int an = 512;
    public static final int ao = 1024;
    public static final int ap = 2048;
    public static final int aq = 4096;
    public static final int ar = -1;
    public static final int as = 36940;
    public static final int at = 36941;
    public static final int au = 36942;
    public static final int av = 36943;
    public static final int aw = 36944;
    public static final int ax = 36945;
    public static final int ay = 36946;
    public static final int az = 36947;
    public static final int aA = 36948;
    public static final int aB = 36949;
    public static final int aC = 36950;
    public static final int aD = 36951;
    public static final int aE = 36952;
    public static final int aF = 36953;
    public static final int aG = 36954;
    public static final int aH = 36955;
    public static final int aI = 36956;
    public static final int aJ = 36957;
    public static final int aK = 36958;
    public static final int aL = 36959;
    public static final int aM = 36960;
    public static final int aN = 36961;
    public static final int aO = 36962;
    public static final int aP = 36963;
    public static final int aQ = 36964;
    public static final int aR = 36965;
    public static final int aS = 36966;
    public static final int aT = 36967;
    public static final int aU = 36968;
    public static final int aV = 36969;
    public static final int aW = 36970;
    public static final int aX = 36971;
    public static final int aY = 36972;
    public static final int aZ = 37063;
    public static final int ba = 37064;
    public static final int bb = 37065;
    public static final int bc = 37760;
    public static final int bd = 37052;

    private GL42() {
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.II;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL42.nglGetActiveAtomicCounterBufferiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetActiveAtomicCounterBufferiv(int var0, int var1, int var2, long var3, long var5);

    public static int a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.II;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL42.nglGetActiveAtomicCounterBufferiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IJ;
        org.lwjgl.a.a(l2);
        GL42.nglTexStorage1D(n2, n3, n4, n5, l2);
    }

    static native void nglTexStorage1D(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IK;
        org.lwjgl.a.a(l2);
        GL42.nglTexStorage2D(n2, n3, n4, n5, n6, l2);
    }

    static native void nglTexStorage2D(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IL;
        org.lwjgl.a.a(l2);
        GL42.nglTexStorage3D(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglTexStorage3D(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IM;
        org.lwjgl.a.a(l2);
        GL42.nglDrawTransformFeedbackInstanced(n2, n3, n4, l2);
    }

    static native void nglDrawTransformFeedbackInstanced(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IN;
        org.lwjgl.a.a(l2);
        GL42.nglDrawTransformFeedbackStreamInstanced(n2, n3, n4, n5, l2);
    }

    static native void nglDrawTransformFeedbackStreamInstanced(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IO;
        org.lwjgl.a.a(l2);
        GL42.nglDrawArraysInstancedBaseInstance(n2, n3, n4, n5, n6, l2);
    }

    static native void nglDrawArraysInstancedBaseInstance(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, ByteBuffer byteBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IP;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL42.nglDrawElementsInstancedBaseInstance(n2, byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), n3, n4, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IP;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        GL42.nglDrawElementsInstancedBaseInstance(n2, intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), n3, n4, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IP;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL42.nglDrawElementsInstancedBaseInstance(n2, shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), n3, n4, l2);
    }

    static native void nglDrawElementsInstancedBaseInstance(int var0, int var1, int var2, long var3, int var5, int var6, long var7);

    public static void a(int n2, int n3, int n4, long l2, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l3 = dt2.IP;
        org.lwjgl.a.a(l3);
        ft.d(dt2);
        GL42.nglDrawElementsInstancedBaseInstanceBO(n2, n3, n4, l2, n5, n6, l3);
    }

    static native void nglDrawElementsInstancedBaseInstanceBO(int var0, int var1, int var2, long var3, int var5, int var6, long var7);

    public static void a(int n2, ByteBuffer byteBuffer, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IQ;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL42.nglDrawElementsInstancedBaseVertexBaseInstance(n2, byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), n3, n4, n5, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IQ;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        GL42.nglDrawElementsInstancedBaseVertexBaseInstance(n2, intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), n3, n4, n5, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IQ;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL42.nglDrawElementsInstancedBaseVertexBaseInstance(n2, shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), n3, n4, n5, l2);
    }

    static native void nglDrawElementsInstancedBaseVertexBaseInstance(int var0, int var1, int var2, long var3, int var5, int var6, int var7, long var8);

    public static void a(int n2, int n3, int n4, long l2, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l3 = dt2.IQ;
        org.lwjgl.a.a(l3);
        ft.d(dt2);
        GL42.nglDrawElementsInstancedBaseVertexBaseInstanceBO(n2, n3, n4, l2, n5, n6, n7, l3);
    }

    static native void nglDrawElementsInstancedBaseVertexBaseInstanceBO(int var0, int var1, int var2, long var3, int var5, int var6, int var7, long var8);

    public static void a(int n2, int n3, int n4, boolean bl2, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IR;
        org.lwjgl.a.a(l2);
        GL42.nglBindImageTexture(n2, n3, n4, bl2, n5, n6, n7, l2);
    }

    static native void nglBindImageTexture(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6, long var7);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IS;
        org.lwjgl.a.a(l2);
        GL42.nglMemoryBarrier(n2, l2);
    }

    static native void nglMemoryBarrier(int var0, long var1);

    public static void b(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL42.nglGetInternalformativ(n2, n3, n4, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetInternalformativ(int var0, int var1, int var2, int var3, long var4, long var6);

    public static int c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.IT;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL42.nglGetInternalformativ(n2, n3, n4, 1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

