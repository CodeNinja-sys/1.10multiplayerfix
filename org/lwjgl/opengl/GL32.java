/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.fx;
import org.lwjgl.opengl.i;

public final class GL32 {
    public static final int a = 37158;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 37154;
    public static final int e = 37155;
    public static final int f = 37156;
    public static final int g = 37157;
    public static final int h = 36429;
    public static final int i = 36430;
    public static final int j = 36431;
    public static final int k = 36428;
    public static final int l = 34895;
    public static final int m = 36432;
    public static final int n = 36433;
    public static final int o = 36434;
    public static final int p = 37120;
    public static final int q = 37121;
    public static final int r = 37122;
    public static final int s = 37123;
    public static final int t = 36441;
    public static final int u = 37134;
    public static final int v = 37135;
    public static final int w = 37136;
    public static final int x = 37124;
    public static final int y = 37125;
    public static final int z = 37126;
    public static final int A = 37127;
    public static final int B = 37128;
    public static final int C = 37129;
    public static final int D = 37130;
    public static final int E = 37131;
    public static final int F = 37132;
    public static final int G = 37133;
    public static final int H = 34383;
    public static final int I = 36313;
    public static final int J = 36314;
    public static final int K = 36315;
    public static final int L = 36316;
    public static final int M = 35881;
    public static final int N = 36319;
    public static final int O = 36320;
    public static final int P = 36321;
    public static final int Q = 10;
    public static final int R = 11;
    public static final int S = 12;
    public static final int T = 13;
    public static final int U = 36264;
    public static final int V = 36263;
    public static final int W = 34370;
    public static final int X = 37137;
    public static final int Y = 37138;
    public static final int Z = 37139;
    public static final int aa = 37140;
    public static final int ab = 37141;
    public static final int ac = 37142;
    public static final int ad = 37143;
    public static final int ae = 37144;
    public static final int af = 37145;
    public static final int ag = 1;
    public static final long ah = -1L;
    public static final int ai = 37146;
    public static final int aj = 37147;
    public static final int ak = 37148;
    public static final int al = 37149;

    private GL32() {
    }

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 4);
        GL32.nglGetBufferParameteri64v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetBufferParameteri64v(int var0, int var1, long var2, long var4);

    public static long a(int n2, int n3) {
        return GL32.b(n2, n3);
    }

    public static long b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EG;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL32.nglGetBufferParameteri64v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EH;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL32.nglDrawElementsBaseVertex(n2, byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), n3, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EH;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        GL32.nglDrawElementsBaseVertex(n2, intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), n3, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EH;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL32.nglDrawElementsBaseVertex(n2, shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), n3, l2);
    }

    static native void nglDrawElementsBaseVertex(int var0, int var1, int var2, long var3, int var5, long var6);

    public static void a(int n2, int n3, int n4, long l2, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.EH;
        org.lwjgl.a.a(l3);
        ft.d(dt2);
        GL32.nglDrawElementsBaseVertexBO(n2, n3, n4, l2, n5, l3);
    }

    static native void nglDrawElementsBaseVertexBO(int var0, int var1, int var2, long var3, int var5, long var6);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EI;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL32.nglDrawRangeElementsBaseVertex(n2, n3, n4, byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), n5, l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EI;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        GL32.nglDrawRangeElementsBaseVertex(n2, n3, n4, intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), n5, l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EI;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL32.nglDrawRangeElementsBaseVertex(n2, n3, n4, shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), n5, l2);
    }

    static native void nglDrawRangeElementsBaseVertex(int var0, int var1, int var2, int var3, int var4, long var5, int var7, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, long l2, int n7) {
        dt dt2 = GLContext.a();
        long l3 = dt2.EI;
        org.lwjgl.a.a(l3);
        ft.d(dt2);
        GL32.nglDrawRangeElementsBaseVertexBO(n2, n3, n4, n5, n6, l2, n7, l3);
    }

    static native void nglDrawRangeElementsBaseVertexBO(int var0, int var1, int var2, int var3, int var4, long var5, int var7, long var8);

    public static void a(int n2, ByteBuffer byteBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EJ;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL32.nglDrawElementsInstancedBaseVertex(n2, byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), n3, n4, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EJ;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        GL32.nglDrawElementsInstancedBaseVertex(n2, intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), n3, n4, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EJ;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL32.nglDrawElementsInstancedBaseVertex(n2, shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), n3, n4, l2);
    }

    static native void nglDrawElementsInstancedBaseVertex(int var0, int var1, int var2, long var3, int var5, int var6, long var7);

    public static void a(int n2, int n3, int n4, long l2, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l3 = dt2.EJ;
        org.lwjgl.a.a(l3);
        ft.d(dt2);
        GL32.nglDrawElementsInstancedBaseVertexBO(n2, n3, n4, l2, n5, n6, l3);
    }

    static native void nglDrawElementsInstancedBaseVertexBO(int var0, int var1, int var2, long var3, int var5, int var6, long var7);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EK;
        org.lwjgl.a.a(l2);
        GL32.nglProvokingVertex(n2, l2);
    }

    static native void nglProvokingVertex(int var0, long var1);

    public static void a(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EL;
        org.lwjgl.a.a(l2);
        GL32.nglTexImage2DMultisample(n2, n3, n4, n5, n6, bl2, l2);
    }

    static native void nglTexImage2DMultisample(int var0, int var1, int var2, int var3, int var4, boolean var5, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EM;
        org.lwjgl.a.a(l2);
        GL32.nglTexImage3DMultisample(n2, n3, n4, n5, n6, n7, bl2, l2);
    }

    static native void nglTexImage3DMultisample(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6, long var7);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 2);
        GL32.nglGetMultisamplefv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetMultisamplefv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EO;
        org.lwjgl.a.a(l2);
        GL32.nglSampleMaski(n2, n3, l2);
    }

    static native void nglSampleMaski(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EP;
        org.lwjgl.a.a(l2);
        GL32.nglFramebufferTexture(n2, n3, n4, n5, l2);
    }

    static native void nglFramebufferTexture(int var0, int var1, int var2, int var3, long var4);

    public static fx d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EQ;
        org.lwjgl.a.a(l2);
        fx fx2 = new fx(GL32.nglFenceSync(n2, n3, l2));
        return fx2;
    }

    static native long nglFenceSync(int var0, int var1, long var2);

    public static boolean a(fx fx2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ER;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL32.nglIsSync(fx2.a(), l2);
        return bl2;
    }

    static native boolean nglIsSync(long var0, long var2);

    public static void b(fx fx2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ES;
        org.lwjgl.a.a(l2);
        GL32.nglDeleteSync(fx2.a(), l2);
    }

    static native void nglDeleteSync(long var0, long var2);

    public static int a(fx fx2, int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ET;
        org.lwjgl.a.a(l3);
        int n3 = GL32.nglClientWaitSync(fx2.a(), n2, l2, l3);
        return n3;
    }

    static native int nglClientWaitSync(long var0, int var2, long var3, long var5);

    public static void b(fx fx2, int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.EU;
        org.lwjgl.a.a(l3);
        GL32.nglWaitSync(fx2.a(), n2, l2, l3);
    }

    static native void nglWaitSync(long var0, int var2, long var3, long var5);

    public static void a(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        GL32.nglGetInteger64v(n2, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetInteger64v(int var0, long var1, long var3);

    public static long b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EV;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL32.nglGetInteger64v(n2, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 4);
        GL32.nglGetInteger64i_v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetInteger64i_v(int var0, int var1, long var2, long var4);

    public static long e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EW;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL32.nglGetInteger64i_v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void a(fx fx2, int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EX;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(intBuffer2);
        GL32.nglGetSynciv(fx2.a(), n2, intBuffer2.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    static native void nglGetSynciv(long var0, int var2, int var3, long var4, long var6, long var8);

    public static int a(fx fx2, int n2) {
        return GL32.b(fx2, n2);
    }

    public static int b(fx fx2, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EX;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL32.nglGetSynciv(fx2.a(), n2, 1, 0L, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

