/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;

public final class GL31 {
    public static final int a = 36752;
    public static final int b = 36753;
    public static final int c = 36754;
    public static final int d = 36755;
    public static final int e = 36756;
    public static final int f = 36757;
    public static final int g = 36758;
    public static final int h = 36759;
    public static final int i = 36760;
    public static final int j = 36761;
    public static final int k = 36762;
    public static final int l = 36763;
    public static final int m = 36764;
    public static final int n = 36662;
    public static final int o = 36663;
    public static final int p = 36662;
    public static final int q = 36663;
    public static final int r = 36765;
    public static final int s = 36766;
    public static final int t = 35882;
    public static final int u = 35883;
    public static final int v = 35884;
    public static final int w = 35885;
    public static final int x = 35886;
    public static final int y = 34037;
    public static final int z = 34038;
    public static final int A = 34039;
    public static final int B = 34040;
    public static final int C = 35683;
    public static final int D = 35684;
    public static final int E = 35345;
    public static final int F = 35368;
    public static final int G = 35369;
    public static final int H = 35370;
    public static final int I = 35371;
    public static final int J = 35372;
    public static final int K = 35373;
    public static final int L = 35374;
    public static final int M = 35375;
    public static final int N = 35376;
    public static final int O = 35377;
    public static final int P = 35378;
    public static final int Q = 35379;
    public static final int R = 35380;
    public static final int S = 35381;
    public static final int T = 35382;
    public static final int U = 35383;
    public static final int V = 35384;
    public static final int W = 35385;
    public static final int X = 35386;
    public static final int Y = 35387;
    public static final int Z = 35388;
    public static final int aa = 35389;
    public static final int ab = 35390;
    public static final int ac = 35391;
    public static final int ad = 35392;
    public static final int ae = 35393;
    public static final int af = 35394;
    public static final int ag = 35395;
    public static final int ah = 35396;
    public static final int ai = 35397;
    public static final int aj = 35398;
    public static final int ak = -1;

    private GL31() {
    }

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Eu;
        org.lwjgl.a.a(l2);
        GL31.nglDrawArraysInstanced(n2, n3, n4, n5, l2);
    }

    static native void nglDrawArraysInstanced(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ev;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL31.nglDrawElementsInstanced(n2, byteBuffer.remaining(), 5121, org.lwjgl.o.a(byteBuffer), n3, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ev;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        GL31.nglDrawElementsInstanced(n2, intBuffer.remaining(), 5125, org.lwjgl.o.a(intBuffer), n3, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ev;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL31.nglDrawElementsInstanced(n2, shortBuffer.remaining(), 5123, org.lwjgl.o.a(shortBuffer), n3, l2);
    }

    static native void nglDrawElementsInstanced(int var0, int var1, int var2, long var3, int var5, long var6);

    public static void a(int n2, int n3, int n4, long l2, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ev;
        org.lwjgl.a.a(l3);
        ft.d(dt2);
        GL31.nglDrawElementsInstancedBO(n2, n3, n4, l2, n5, l3);
    }

    static native void nglDrawElementsInstancedBO(int var0, int var1, int var2, long var3, int var5, long var6);

    public static void a(int n2, int n3, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.Ew;
        org.lwjgl.a.a(l5);
        GL31.nglCopyBufferSubData(n2, n3, l2, l3, l4, l5);
    }

    static native void nglCopyBufferSubData(int var0, int var1, long var2, long var4, long var6, long var8);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ex;
        org.lwjgl.a.a(l2);
        GL31.nglPrimitiveRestartIndex(n2, l2);
    }

    static native void nglPrimitiveRestartIndex(int var0, long var1);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ey;
        org.lwjgl.a.a(l2);
        GL31.nglTexBuffer(n2, n3, n4, l2);
    }

    static native void nglTexBuffer(int var0, int var1, int var2, long var3);

    public static void a(int n2, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ez;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer, intBuffer.remaining());
        org.lwjgl.a.b(intBuffer);
        GL31.nglGetUniformIndices(n2, intBuffer.remaining(), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetUniformIndices(int var0, int var1, long var2, long var4, long var6);

    public static void a(int n2, CharSequence[] arrcharSequence, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ez;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrcharSequence);
        org.lwjgl.a.a(intBuffer, arrcharSequence.length);
        GL31.nglGetUniformIndices(n2, arrcharSequence.length, org.lwjgl.opengl.i.b(dt2, arrcharSequence), org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(intBuffer2, intBuffer.remaining());
        GL31.nglGetActiveUniformsiv(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), n3, org.lwjgl.o.a(intBuffer2), l2);
    }

    static native void nglGetActiveUniformsiv(int var0, int var1, long var2, int var4, long var5, long var7);

    public static int b(int n2, int n3, int n4) {
        return GL31.c(n2, n3, n4);
    }

    public static int c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EA;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL31.nglGetActiveUniformsiv(n2, 1, org.lwjgl.o.a(intBuffer.put(1, n3), 1), n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EB;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL31.nglGetActiveUniformName(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveUniformName(int var0, int var1, int var2, long var3, long var5, long var7);

    public static String d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EB;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        GL31.nglGetActiveUniformName(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static int a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = GL31.nglGetUniformBlockIndex(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetUniformBlockIndex(int var0, long var1, long var3);

    public static int a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EC;
        org.lwjgl.a.a(l2);
        int n3 = GL31.nglGetUniformBlockIndex(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ED;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 16);
        GL31.nglGetActiveUniformBlockiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetActiveUniformBlockiv(int var0, int var1, int var2, long var3, long var5);

    public static int e(int n2, int n3, int n4) {
        return GL31.f(n2, n3, n4);
    }

    public static int f(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ED;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL31.nglGetActiveUniformBlockiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EE;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        GL31.nglGetActiveUniformBlockName(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveUniformBlockName(int var0, int var1, int var2, long var3, long var5, long var7);

    public static String g(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EE;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        GL31.nglGetActiveUniformBlockName(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void h(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EF;
        org.lwjgl.a.a(l2);
        GL31.nglUniformBlockBinding(n2, n3, n4, l2);
    }

    static native void nglUniformBlockBinding(int var0, int var1, int var2, long var3);
}

