/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;
import org.lwjgl.x;

public final class GL45 {
    public static final int a = 37726;
    public static final int b = 37727;
    public static final int c = 37724;
    public static final int d = 37725;
    public static final int e = 36375;
    public static final int f = 36376;
    public static final int g = 36377;
    public static final int h = 36378;
    public static final int i = 33529;
    public static final int j = 33530;
    public static final int k = 4102;
    public static final int l = 33514;
    public static final int m = 33515;
    public static final int n = 33531;
    public static final int o = 33532;
    public static final int p = 33363;
    public static final int q = 33364;
    public static final int r = 33365;
    public static final int s = 37107;
    public static final int t = 33366;
    public static final int u = 33362;
    public static final int v = 33377;
    public static final int w = 1287;

    private GL45() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JU;
        org.lwjgl.a.a(l2);
        GL45.nglClipControl(n2, n3, l2);
    }

    static native void nglClipControl(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateTransformFeedbacks(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateTransformFeedbacks(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.JV;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateTransformFeedbacks(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JW;
        org.lwjgl.a.a(l2);
        GL45.nglTransformFeedbackBufferBase(n2, n3, n4, l2);
    }

    static native void nglTransformFeedbackBufferBase(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.JX;
        org.lwjgl.a.a(l4);
        GL45.nglTransformFeedbackBufferRange(n2, n3, n4, l2, l3, l4);
    }

    static native void nglTransformFeedbackBufferRange(int var0, int var1, int var2, long var3, long var5, long var7);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetTransformFeedbackiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTransformFeedbackiv(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JY;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetTransformFeedbackiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetTransformFeedbacki_v(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTransformFeedbacki_v(int var0, int var1, int var2, long var3, long var5);

    public static int b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.JZ;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetTransformFeedbacki_v(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ka;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        GL45.nglGetTransformFeedbacki64_v(n2, n3, n4, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetTransformFeedbacki64_v(int var0, int var1, int var2, long var3, long var5);

    public static long c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ka;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL45.nglGetTransformFeedbacki64_v(n2, n3, n4, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateBuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateBuffers(int var0, long var1, long var3);

    public static int b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kb;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateBuffers(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglNamedBufferStorage(n2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), n3, l2);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL45.nglNamedBufferStorage(n2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), n3, l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglNamedBufferStorage(n2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), n3, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglNamedBufferStorage(n2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), n3, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglNamedBufferStorage(n2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), n3, l2);
    }

    public static void a(int n2, LongBuffer longBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        GL45.nglNamedBufferStorage(n2, longBuffer.remaining() << 3, org.lwjgl.o.a(longBuffer), n3, l2);
    }

    static native void nglNamedBufferStorage(int var0, long var1, long var3, int var5, long var6);

    public static void a(int n2, long l2, int n3) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Kc;
        org.lwjgl.a.a(l3);
        GL45.nglNamedBufferStorage(n2, l2, 0L, n3, l3);
    }

    public static void b(int n2, long l2, int n3) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Kd;
        org.lwjgl.a.a(l3);
        GL45.nglNamedBufferData(n2, l2, 0L, n3, l3);
    }

    public static void b(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglNamedBufferData(n2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), n3, l2);
    }

    public static void b(int n2, DoubleBuffer doubleBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        GL45.nglNamedBufferData(n2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), n3, l2);
    }

    public static void b(int n2, FloatBuffer floatBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglNamedBufferData(n2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), n3, l2);
    }

    public static void b(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglNamedBufferData(n2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), n3, l2);
    }

    public static void b(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglNamedBufferData(n2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), n3, l2);
    }

    static native void nglNamedBufferData(int var0, long var1, long var3, int var5, long var6);

    public static void a(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ke;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglNamedBufferSubData(n2, l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l3);
    }

    public static void a(int n2, long l2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ke;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        GL45.nglNamedBufferSubData(n2, l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l3);
    }

    public static void a(int n2, long l2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ke;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglNamedBufferSubData(n2, l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l3);
    }

    public static void a(int n2, long l2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ke;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        GL45.nglNamedBufferSubData(n2, l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l3);
    }

    public static void a(int n2, long l2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ke;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglNamedBufferSubData(n2, l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l3);
    }

    static native void nglNamedBufferSubData(int var0, long var1, long var3, long var5, long var7);

    public static void a(int n2, int n3, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.Kf;
        org.lwjgl.a.a(l5);
        GL45.nglCopyNamedBufferSubData(n2, n3, l2, l3, l4, l5);
    }

    static native void nglCopyNamedBufferSubData(int var0, int var1, long var2, long var4, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 1);
        GL45.nglClearNamedBufferData(n2, n3, n4, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglClearNamedBufferData(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, long l2, long l3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Kh;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.b(byteBuffer, 1);
        GL45.nglClearNamedBufferSubData(n2, n3, l2, l3, n4, n5, org.lwjgl.o.a(byteBuffer), l4);
    }

    static native void nglClearNamedBufferSubData(int var0, int var1, long var2, long var4, int var6, int var7, long var8, long var10);

    public static ByteBuffer a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ki;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = GL45.nglMapNamedBuffer(n2, n3, GL45.c(n2, 34660), byteBuffer, l2);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    public static ByteBuffer a(int n2, int n3, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ki;
        org.lwjgl.a.a(l3);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = GL45.nglMapNamedBuffer(n2, n3, l2, byteBuffer, l3);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapNamedBuffer(int var0, int var1, long var2, ByteBuffer var4, long var5);

    public static ByteBuffer a(int n2, long l2, long l3, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Kj;
        org.lwjgl.a.a(l4);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = GL45.nglMapNamedBufferRange(n2, l2, l3, n3, byteBuffer, l4);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapNamedBufferRange(int var0, long var1, long var3, int var5, ByteBuffer var6, long var7);

    public static boolean a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kk;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL45.nglUnmapNamedBuffer(n2, l2);
        return bl2;
    }

    static native boolean nglUnmapNamedBuffer(int var0, long var1);

    public static void a(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Kl;
        org.lwjgl.a.a(l4);
        GL45.nglFlushMappedNamedBufferRange(n2, l2, l3, l4);
    }

    static native void nglFlushMappedNamedBufferRange(int var0, long var1, long var3, long var5);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Km;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglGetNamedBufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetNamedBufferParameteriv(int var0, int var1, long var2, long var4);

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Km;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetNamedBufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        GL45.nglGetNamedBufferParameteri64v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetNamedBufferParameteri64v(int var0, int var1, long var2, long var4);

    public static long d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kn;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL45.nglGetNamedBufferParameteri64v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static ByteBuffer e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ko;
        org.lwjgl.a.a(l2);
        ByteBuffer byteBuffer = GL45.nglGetNamedBufferPointerv(n2, n3, GL45.c(n2, 34660), l2);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetNamedBufferPointerv(int var0, int var1, long var2, long var4);

    public static void b(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Kp;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglGetNamedBufferSubData(n2, l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l3);
    }

    public static void b(int n2, long l2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Kp;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        GL45.nglGetNamedBufferSubData(n2, l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l3);
    }

    public static void b(int n2, long l2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Kp;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglGetNamedBufferSubData(n2, l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l3);
    }

    public static void b(int n2, long l2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Kp;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        GL45.nglGetNamedBufferSubData(n2, l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l3);
    }

    public static void b(int n2, long l2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Kp;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglGetNamedBufferSubData(n2, l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l3);
    }

    static native void nglGetNamedBufferSubData(int var0, long var1, long var3, long var5, long var7);

    public static void c(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateFramebuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateFramebuffers(int var0, long var1, long var3);

    public static int c() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kq;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateFramebuffers(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kr;
        org.lwjgl.a.a(l2);
        GL45.nglNamedFramebufferRenderbuffer(n2, n3, n4, n5, l2);
    }

    static native void nglNamedFramebufferRenderbuffer(int var0, int var1, int var2, int var3, long var4);

    public static void d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ks;
        org.lwjgl.a.a(l2);
        GL45.nglNamedFramebufferParameteri(n2, n3, n4, l2);
    }

    static native void nglNamedFramebufferParameteri(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kt;
        org.lwjgl.a.a(l2);
        GL45.nglNamedFramebufferTexture(n2, n3, n4, n5, l2);
    }

    static native void nglNamedFramebufferTexture(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ku;
        org.lwjgl.a.a(l2);
        GL45.nglNamedFramebufferTextureLayer(n2, n3, n4, n5, n6, l2);
    }

    static native void nglNamedFramebufferTextureLayer(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void f(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kv;
        org.lwjgl.a.a(l2);
        GL45.nglNamedFramebufferDrawBuffer(n2, n3, l2);
    }

    static native void nglNamedFramebufferDrawBuffer(int var0, int var1, long var2);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglNamedFramebufferDrawBuffers(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglNamedFramebufferDrawBuffers(int var0, int var1, long var2, long var4);

    public static void g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kx;
        org.lwjgl.a.a(l2);
        GL45.nglNamedFramebufferReadBuffer(n2, n3, l2);
    }

    static native void nglNamedFramebufferReadBuffer(int var0, int var1, long var2);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ky;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglInvalidateNamedFramebufferData(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglInvalidateNamedFramebufferData(int var0, int var1, long var2, long var4);

    public static void a(int n2, IntBuffer intBuffer, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Kz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglInvalidateNamedFramebufferSubData(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), n3, n4, n5, n6, l2);
    }

    static native void nglInvalidateNamedFramebufferSubData(int var0, int var1, long var2, int var4, int var5, int var6, int var7, long var8);

    public static void b(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglClearNamedFramebufferiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglClearNamedFramebufferiv(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL45.nglClearNamedFramebufferuiv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglClearNamedFramebufferuiv(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 1);
        GL45.nglClearNamedFramebufferfv(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglClearNamedFramebufferfv(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, float f2, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KD;
        org.lwjgl.a.a(l2);
        GL45.nglClearNamedFramebufferfi(n2, n3, f2, n4, l2);
    }

    static native void nglClearNamedFramebufferfi(int var0, int var1, float var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KE;
        org.lwjgl.a.a(l2);
        GL45.nglBlitNamedFramebuffer(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, l2);
    }

    static native void nglBlitNamedFramebuffer(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, long var12);

    public static int h(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KF;
        org.lwjgl.a.a(l2);
        int n4 = GL45.nglCheckNamedFramebufferStatus(n2, n3, l2);
        return n4;
    }

    static native int nglCheckNamedFramebufferStatus(int var0, int var1, long var2);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetNamedFramebufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetNamedFramebufferParameteriv(int var0, int var1, long var2, long var4);

    public static int i(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KG;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetNamedFramebufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetNamedFramebufferAttachmentParameteriv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetNamedFramebufferAttachmentParameteriv(int var0, int var1, int var2, long var3, long var5);

    public static int e(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KH;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetNamedFramebufferAttachmentParameteriv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateRenderbuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateRenderbuffers(int var0, long var1, long var3);

    public static int d() {
        dt dt2 = GLContext.a();
        long l2 = dt2.KI;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateRenderbuffers(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KJ;
        org.lwjgl.a.a(l2);
        GL45.nglNamedRenderbufferStorage(n2, n3, n4, n5, l2);
    }

    static native void nglNamedRenderbufferStorage(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KK;
        org.lwjgl.a.a(l2);
        GL45.nglNamedRenderbufferStorageMultisample(n2, n3, n4, n5, n6, l2);
    }

    static native void nglNamedRenderbufferStorageMultisample(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetNamedRenderbufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetNamedRenderbufferParameteriv(int var0, int var1, long var2, long var4);

    public static int j(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KL;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetNamedRenderbufferParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateTextures(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateTextures(int var0, int var1, long var2, long var4);

    public static int b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KM;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateTextures(n2, 1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void f(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KN;
        org.lwjgl.a.a(l2);
        GL45.nglTextureBuffer(n2, n3, n4, l2);
    }

    static native void nglTextureBuffer(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.KO;
        org.lwjgl.a.a(l4);
        GL45.nglTextureBufferRange(n2, n3, n4, l2, l3, l4);
    }

    static native void nglTextureBufferRange(int var0, int var1, int var2, long var3, long var5, long var7);

    public static void d(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KP;
        org.lwjgl.a.a(l2);
        GL45.nglTextureStorage1D(n2, n3, n4, n5, l2);
    }

    static native void nglTextureStorage1D(int var0, int var1, int var2, int var3, long var4);

    public static void c(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KQ;
        org.lwjgl.a.a(l2);
        GL45.nglTextureStorage2D(n2, n3, n4, n5, n6, l2);
    }

    static native void nglTextureStorage2D(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KR;
        org.lwjgl.a.a(l2);
        GL45.nglTextureStorage3D(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglTextureStorage3D(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KS;
        org.lwjgl.a.a(l2);
        GL45.nglTextureStorage2DMultisample(n2, n3, n4, n5, n6, bl2, l2);
    }

    static native void nglTextureStorage2DMultisample(int var0, int var1, int var2, int var3, int var4, boolean var5, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KT;
        org.lwjgl.a.a(l2);
        GL45.nglTextureStorage3DMultisample(n2, n3, n4, n5, n6, n7, bl2, l2);
    }

    static native void nglTextureStorage3DMultisample(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KU;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n6, n7, n5, 1, 1));
        GL45.nglTextureSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KU;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n6, n7, n5, 1, 1));
        GL45.nglTextureSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KU;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n6, n7, n5, 1, 1));
        GL45.nglTextureSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KU;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n6, n7, n5, 1, 1));
        GL45.nglTextureSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KU;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n6, n7, n5, 1, 1));
        GL45.nglTextureSubImage1D(n2, n3, n4, n5, n6, n7, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglTextureSubImage1D(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.KU;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL45.nglTextureSubImage1DBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglTextureSubImage1DBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KV;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n8, n9, n6, n7, 1));
        GL45.nglTextureSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KV;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n8, n9, n6, n7, 1));
        GL45.nglTextureSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KV;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n8, n9, n6, n7, 1));
        GL45.nglTextureSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KV;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n8, n9, n6, n7, 1));
        GL45.nglTextureSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KV;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n8, n9, n6, n7, 1));
        GL45.nglTextureSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglTextureSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.KV;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL45.nglTextureSubImage2DBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglTextureSubImage2DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KW;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n10, n11, n7, n8, n9));
        GL45.nglTextureSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KW;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n10, n11, n7, n8, n9));
        GL45.nglTextureSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KW;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n10, n11, n7, n8, n9));
        GL45.nglTextureSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KW;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n10, n11, n7, n8, n9));
        GL45.nglTextureSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KW;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n10, n11, n7, n8, n9));
        GL45.nglTextureSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglTextureSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.KW;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL45.nglTextureSubImage3DBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2, l3);
    }

    static native void nglTextureSubImage3DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KX;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglCompressedTextureSubImage1D(n2, n3, n4, n5, n6, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureSubImage1D(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.KX;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL45.nglCompressedTextureSubImage1DBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglCompressedTextureSubImage1DBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KY;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglCompressedTextureSubImage2D(n2, n3, n4, n5, n6, n7, n8, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.KY;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL45.nglCompressedTextureSubImage2DBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglCompressedTextureSubImage2DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.KZ;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglCompressedTextureSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglCompressedTextureSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.KZ;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        GL45.nglCompressedTextureSubImage3DBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2, l3);
    }

    static native void nglCompressedTextureSubImage3DBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.La;
        org.lwjgl.a.a(l2);
        GL45.nglCopyTextureSubImage1D(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglCopyTextureSubImage1D(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lb;
        org.lwjgl.a.a(l2);
        GL45.nglCopyTextureSubImage2D(n2, n3, n4, n5, n6, n7, n8, n9, l2);
    }

    static native void nglCopyTextureSubImage2D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lc;
        org.lwjgl.a.a(l2);
        GL45.nglCopyTextureSubImage3D(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2);
    }

    static native void nglCopyTextureSubImage3D(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9);

    public static void a(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ld;
        org.lwjgl.a.a(l2);
        GL45.nglTextureParameterf(n2, n3, f2, l2);
    }

    static native void nglTextureParameterf(int var0, int var1, float var2, long var3);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Le;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL45.nglTextureParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglTextureParameterfv(int var0, int var1, long var2, long var4);

    public static void g(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lf;
        org.lwjgl.a.a(l2);
        GL45.nglTextureParameteri(n2, n3, n4, l2);
    }

    static native void nglTextureParameteri(int var0, int var1, int var2, long var3);

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglTextureParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTextureParameterIiv(int var0, int var1, long var2, long var4);

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglTextureParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTextureParameterIuiv(int var0, int var1, long var2, long var4);

    public static void g(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Li;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL45.nglTextureParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTextureParameteriv(int var0, int var1, long var2, long var4);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lj;
        org.lwjgl.a.a(l2);
        GL45.nglGenerateTextureMipmap(n2, l2);
    }

    static native void nglGenerateTextureMipmap(int var0, long var1);

    public static void k(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lk;
        org.lwjgl.a.a(l2);
        GL45.nglBindTextureUnit(n2, n3, l2);
    }

    static native void nglBindTextureUnit(int var0, int var1, long var2);

    public static void b(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ll;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglGetTextureImage(n2, n3, n4, n5, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ll;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        GL45.nglGetTextureImage(n2, n3, n4, n5, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ll;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglGetTextureImage(n2, n3, n4, n5, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ll;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglGetTextureImage(n2, n3, n4, n5, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ll;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglGetTextureImage(n2, n3, n4, n5, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetTextureImage(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ll;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        GL45.nglGetTextureImageBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglGetTextureImageBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lm;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglGetCompressedTextureImage(n2, n3, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void h(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lm;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglGetCompressedTextureImage(n2, n3, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lm;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglGetCompressedTextureImage(n2, n3, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetCompressedTextureImage(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Lm;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        GL45.nglGetCompressedTextureImageBO(n2, n3, n4, l2, l3);
    }

    static native void nglGetCompressedTextureImageBO(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ln;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 1);
        GL45.nglGetTextureLevelParameterfv(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetTextureLevelParameterfv(int var0, int var1, int var2, long var3, long var5);

    public static float h(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ln;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL45.nglGetTextureLevelParameterfv(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void e(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lo;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetTextureLevelParameteriv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTextureLevelParameteriv(int var0, int var1, int var2, long var3, long var5);

    public static int i(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lo;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetTextureLevelParameteriv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 1);
        GL45.nglGetTextureParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetTextureParameterfv(int var0, int var1, long var2, long var4);

    public static float l(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lp;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL45.nglGetTextureParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void i(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetTextureParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTextureParameterIiv(int var0, int var1, long var2, long var4);

    public static int m(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lq;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetTextureParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void j(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetTextureParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTextureParameterIuiv(int var0, int var1, long var2, long var4);

    public static int n(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lr;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetTextureParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void k(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ls;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetTextureParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTextureParameteriv(int var0, int var1, long var2, long var4);

    public static int o(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ls;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetTextureParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void e(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lt;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateVertexArrays(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateVertexArrays(int var0, long var1, long var3);

    public static int e() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lt;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateVertexArrays(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void p(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lu;
        org.lwjgl.a.a(l2);
        GL45.nglDisableVertexArrayAttrib(n2, n3, l2);
    }

    static native void nglDisableVertexArrayAttrib(int var0, int var1, long var2);

    public static void q(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lv;
        org.lwjgl.a.a(l2);
        GL45.nglEnableVertexArrayAttrib(n2, n3, l2);
    }

    static native void nglEnableVertexArrayAttrib(int var0, int var1, long var2);

    public static void r(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lw;
        org.lwjgl.a.a(l2);
        GL45.nglVertexArrayElementBuffer(n2, n3, l2);
    }

    static native void nglVertexArrayElementBuffer(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4, long l2, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Lx;
        org.lwjgl.a.a(l3);
        GL45.nglVertexArrayVertexBuffer(n2, n3, n4, l2, n5, l3);
    }

    static native void nglVertexArrayVertexBuffer(int var0, int var1, int var2, long var3, int var5, long var6);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, x x2, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ly;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n4);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, n4);
        }
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, n4);
        }
        GL45.nglVertexArrayVertexBuffers(n2, n3, n4, org.lwjgl.o.b(intBuffer), org.lwjgl.o.d(x2), org.lwjgl.o.b(intBuffer2), l2);
    }

    static native void nglVertexArrayVertexBuffers(int var0, int var1, int var2, long var3, long var5, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, boolean bl2, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Lz;
        org.lwjgl.a.a(l2);
        GL45.nglVertexArrayAttribFormat(n2, n3, n4, n5, bl2, n6, l2);
    }

    static native void nglVertexArrayAttribFormat(int var0, int var1, int var2, int var3, boolean var4, int var5, long var6);

    public static void d(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LA;
        org.lwjgl.a.a(l2);
        GL45.nglVertexArrayAttribIFormat(n2, n3, n4, n5, n6, l2);
    }

    static native void nglVertexArrayAttribIFormat(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void e(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LB;
        org.lwjgl.a.a(l2);
        GL45.nglVertexArrayAttribLFormat(n2, n3, n4, n5, n6, l2);
    }

    static native void nglVertexArrayAttribLFormat(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void j(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LC;
        org.lwjgl.a.a(l2);
        GL45.nglVertexArrayAttribBinding(n2, n3, n4, l2);
    }

    static native void nglVertexArrayAttribBinding(int var0, int var1, int var2, long var3);

    public static void k(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LD;
        org.lwjgl.a.a(l2);
        GL45.nglVertexArrayBindingDivisor(n2, n3, n4, l2);
    }

    static native void nglVertexArrayBindingDivisor(int var0, int var1, int var2, long var3);

    public static void l(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetVertexArrayiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexArrayiv(int var0, int var1, long var2, long var4);

    public static int s(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LE;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetVertexArrayiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void f(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL45.nglGetVertexArrayIndexediv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexArrayIndexediv(int var0, int var1, int var2, long var3, long var5);

    public static int l(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LF;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglGetVertexArrayIndexediv(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, int n4, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        GL45.nglGetVertexArrayIndexed64iv(n2, n3, n4, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetVertexArrayIndexed64iv(int var0, int var1, int var2, long var3, long var5);

    public static long m(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LG;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL45.nglGetVertexArrayIndexed64iv(n2, n3, n4, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void f(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateSamplers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateSamplers(int var0, long var1, long var3);

    public static int f() {
        dt dt2 = GLContext.a();
        long l2 = dt2.LH;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateSamplers(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void g(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateProgramPipelines(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateProgramPipelines(int var0, long var1, long var3);

    public static int g() {
        dt dt2 = GLContext.a();
        long l2 = dt2.LI;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateProgramPipelines(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglCreateQueries(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglCreateQueries(int var0, int var1, long var2, long var4);

    public static int d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LJ;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL45.nglCreateQueries(n2, 1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LK;
        org.lwjgl.a.a(l2);
        GL45.nglMemoryBarrierByRegion(n2, l2);
    }

    static native void nglMemoryBarrierByRegion(int var0, long var1);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglGetTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        GL45.nglGetTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglGetTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglGetTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglGetTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetTextureSubImage(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.LL;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        GL45.nglGetTextureSubImageBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, l2, l3);
    }

    static native void nglGetTextureSubImageBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, long var11, long var13);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglGetCompressedTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        GL45.nglGetCompressedTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglGetCompressedTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglGetCompressedTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglGetCompressedTextureSubImage(n2, n3, n4, n5, n6, n7, n8, n9, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetCompressedTextureSubImage(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.LM;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        GL45.nglGetCompressedTextureSubImageBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, l2, l3);
    }

    static native void nglGetCompressedTextureSubImageBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, long var9, long var11);

    public static void h() {
        dt dt2 = GLContext.a();
        long l2 = dt2.LN;
        org.lwjgl.a.a(l2);
        GL45.nglTextureBarrier(l2);
    }

    static native void nglTextureBarrier(long var0);

    public static int i() {
        dt dt2 = GLContext.a();
        long l2 = dt2.LO;
        org.lwjgl.a.a(l2);
        int n2 = GL45.nglGetGraphicsResetStatus(l2);
        return n2;
    }

    static native int nglGetGraphicsResetStatus(long var0);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        GL45.nglReadnPixels(n2, n3, n4, n5, n6, n7, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        GL45.nglReadnPixels(n2, n3, n4, n5, n6, n7, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglReadnPixels(n2, n3, n4, n5, n6, n7, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglReadnPixels(n2, n3, n4, n5, n6, n7, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        GL45.nglReadnPixels(n2, n3, n4, n5, n6, n7, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglReadnPixels(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.LP;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        GL45.nglReadnPixelsBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglReadnPixelsBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        GL45.nglGetnUniformfv(n2, n3, floatBuffer.remaining(), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetnUniformfv(int var0, int var1, int var2, long var3, long var5);

    public static void m(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglGetnUniformiv(n2, n3, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetnUniformiv(int var0, int var1, int var2, long var3, long var5);

    public static void n(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL45.nglGetnUniformuiv(n2, n3, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetnUniformuiv(int var0, int var1, int var2, long var3, long var5);
}

