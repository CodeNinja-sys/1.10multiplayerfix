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
import org.lwjgl.opengl.i;
import org.lwjgl.opengl.is;

public final class GL15 {
    public static final int a = 34962;
    public static final int b = 34963;
    public static final int c = 34964;
    public static final int d = 34965;
    public static final int e = 34966;
    public static final int f = 34967;
    public static final int g = 34968;
    public static final int h = 34969;
    public static final int i = 34970;
    public static final int j = 34971;
    public static final int k = 34972;
    public static final int l = 34973;
    public static final int m = 34974;
    public static final int n = 34975;
    public static final int o = 35040;
    public static final int p = 35041;
    public static final int q = 35042;
    public static final int r = 35044;
    public static final int s = 35045;
    public static final int t = 35046;
    public static final int u = 35048;
    public static final int v = 35049;
    public static final int w = 35050;
    public static final int x = 35000;
    public static final int y = 35001;
    public static final int z = 35002;
    public static final int A = 34660;
    public static final int B = 34661;
    public static final int C = 35003;
    public static final int D = 35004;
    public static final int E = 35005;
    public static final int F = 33872;
    public static final int G = 33873;
    public static final int H = 33875;
    public static final int I = 33876;
    public static final int J = 33877;
    public static final int K = 33878;
    public static final int L = 33879;
    public static final int M = 34973;
    public static final int N = 34176;
    public static final int O = 34177;
    public static final int P = 34178;
    public static final int Q = 34184;
    public static final int R = 34185;
    public static final int S = 34186;
    public static final int T = 35092;
    public static final int U = 34916;
    public static final int V = 34917;
    public static final int W = 34918;
    public static final int X = 34919;

    private GL15() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AX;
        org.lwjgl.a.a(l2);
        is.a(dt2, n2, n3);
        GL15.nglBindBuffer(n2, n3, l2);
    }

    static native void nglBindBuffer(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL15.nglDeleteBuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteBuffers(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AY;
        org.lwjgl.a.a(l2);
        GL15.nglDeleteBuffers(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.AZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL15.nglGenBuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenBuffers(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.AZ;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL15.nglGenBuffers(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ba;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL15.nglIsBuffer(n2, l2);
        return bl2;
    }

    static native boolean nglIsBuffer(int var0, long var1);

    public static void a(int n2, long l2, int n3) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bb;
        org.lwjgl.a.a(l3);
        GL15.nglBufferData(n2, l2, 0L, n3, l3);
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL15.nglBufferData(n2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), n3, l2);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL15.nglBufferData(n2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), n3, l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL15.nglBufferData(n2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), n3, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL15.nglBufferData(n2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), n3, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        GL15.nglBufferData(n2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), n3, l2);
    }

    static native void nglBufferData(int var0, long var1, long var3, int var5, long var6);

    public static void a(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bc;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        GL15.nglBufferSubData(n2, l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l3);
    }

    public static void a(int n2, long l2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bc;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        GL15.nglBufferSubData(n2, l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l3);
    }

    public static void a(int n2, long l2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bc;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        GL15.nglBufferSubData(n2, l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l3);
    }

    public static void a(int n2, long l2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bc;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        GL15.nglBufferSubData(n2, l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l3);
    }

    public static void a(int n2, long l2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bc;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        GL15.nglBufferSubData(n2, l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l3);
    }

    static native void nglBufferSubData(int var0, long var1, long var3, long var5, long var7);

    public static void b(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bd;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        GL15.nglGetBufferSubData(n2, l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l3);
    }

    public static void b(int n2, long l2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bd;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        GL15.nglGetBufferSubData(n2, l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l3);
    }

    public static void b(int n2, long l2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bd;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        GL15.nglGetBufferSubData(n2, l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l3);
    }

    public static void b(int n2, long l2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bd;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        GL15.nglGetBufferSubData(n2, l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l3);
    }

    public static void b(int n2, long l2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Bd;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        GL15.nglGetBufferSubData(n2, l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l3);
    }

    static native void nglGetBufferSubData(int var0, long var1, long var3, long var5, long var7);

    public static ByteBuffer a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Be;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = GL15.nglMapBuffer(n2, n3, GL15.c(n2, 34660), byteBuffer, l2);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    public static ByteBuffer a(int n2, int n3, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Be;
        org.lwjgl.a.a(l3);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = GL15.nglMapBuffer(n2, n3, l2, byteBuffer, l3);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapBuffer(int var0, int var1, long var2, ByteBuffer var4, long var5);

    public static boolean c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bf;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL15.nglUnmapBuffer(n2, l2);
        return bl2;
    }

    static native boolean nglUnmapBuffer(int var0, long var1);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL15.nglGetBufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetBufferParameteriv(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        return GL15.c(n2, n3);
    }

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bg;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL15.nglGetBufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static ByteBuffer d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bh;
        org.lwjgl.a.a(l2);
        ByteBuffer byteBuffer = GL15.nglGetBufferPointerv(n2, n3, GL15.c(n2, 34660), l2);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetBufferPointerv(int var0, int var1, long var2, long var4);

    public static void c(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL15.nglGenQueries(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenQueries(int var0, long var1, long var3);

    public static int b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bi;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL15.nglGenQueries(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL15.nglDeleteQueries(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteQueries(int var0, long var1, long var3);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bj;
        org.lwjgl.a.a(l2);
        GL15.nglDeleteQueries(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static boolean e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bk;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL15.nglIsQuery(n2, l2);
        return bl2;
    }

    static native boolean nglIsQuery(int var0, long var1);

    public static void e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bl;
        org.lwjgl.a.a(l2);
        GL15.nglBeginQuery(n2, n3, l2);
    }

    static native void nglBeginQuery(int var0, int var1, long var2);

    public static void f(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bm;
        org.lwjgl.a.a(l2);
        GL15.nglEndQuery(n2, l2);
    }

    static native void nglEndQuery(int var0, long var1);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL15.nglGetQueryiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetQueryiv(int var0, int var1, long var2, long var4);

    public static int f(int n2, int n3) {
        return GL15.g(n2, n3);
    }

    public static int g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bn;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL15.nglGetQueryiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bo;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL15.nglGetQueryObjectiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetQueryObjectiv(int var0, int var1, long var2, long var4);

    public static int h(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bo;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL15.nglGetQueryObjectiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL15.nglGetQueryObjectuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetQueryObjectuiv(int var0, int var1, long var2, long var4);

    public static int i(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Bp;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL15.nglGetQueryObjectuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

