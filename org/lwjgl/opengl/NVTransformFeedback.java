/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class NVTransformFeedback {
    public static final int a = 35982;
    public static final int b = 35972;
    public static final int c = 35973;
    public static final int d = 35974;
    public static final int e = 35983;
    public static final int f = 35980;
    public static final int g = 35981;
    public static final int h = 35975;
    public static final int i = 35976;
    public static final int j = 35977;
    public static final int k = 35978;
    public static final int l = 35979;
    public static final int m = 35968;
    public static final int n = 35966;
    public static final int o = 35969;
    public static final int p = 35970;
    public static final int q = 35971;
    public static final int r = 35967;
    public static final int s = 35959;
    public static final int t = 35960;
    public static final int u = 35961;
    public static final int v = 35962;
    public static final int w = 35963;
    public static final int x = 35964;
    public static final int y = 35965;
    public static final int z = 36266;

    private NVTransformFeedback() {
    }

    public static void a(int n2, int n3, int n4, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.QD;
        org.lwjgl.a.a(l4);
        NVTransformFeedback.nglBindBufferRangeNV(n2, n3, n4, l2, l3, l4);
    }

    static native void nglBindBufferRangeNV(int var0, int var1, int var2, long var3, long var5, long var7);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.QE;
        org.lwjgl.a.a(l3);
        NVTransformFeedback.nglBindBufferOffsetNV(n2, n3, n4, l2, l3);
    }

    static native void nglBindBufferOffsetNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QF;
        org.lwjgl.a.a(l2);
        NVTransformFeedback.nglBindBufferBaseNV(n2, n3, n4, l2);
    }

    static native void nglBindBufferBaseNV(int var0, int var1, int var2, long var3);

    public static void a(IntBuffer intBuffer, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        NVTransformFeedback.nglTransformFeedbackAttribsNV(intBuffer.remaining() / 3, org.lwjgl.o.a(intBuffer), n2, l2);
    }

    static native void nglTransformFeedbackAttribsNV(int var0, long var1, int var3, long var4);

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVTransformFeedback.nglTransformFeedbackVaryingsNV(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), n3, l2);
    }

    static native void nglTransformFeedbackVaryingsNV(int var0, int var1, long var2, int var4, long var5);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QI;
        org.lwjgl.a.a(l2);
        NVTransformFeedback.nglBeginTransformFeedbackNV(n2, l2);
    }

    static native void nglBeginTransformFeedbackNV(int var0, long var1);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.QJ;
        org.lwjgl.a.a(l2);
        NVTransformFeedback.nglEndTransformFeedbackNV(l2);
    }

    static native void nglEndTransformFeedbackNV(long var0);

    public static int a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = NVTransformFeedback.nglGetVaryingLocationNV(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetVaryingLocationNV(int var0, long var1, long var3);

    public static int a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QK;
        org.lwjgl.a.a(l2);
        int n3 = NVTransformFeedback.nglGetVaryingLocationNV(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QL;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.a(intBuffer2, 1);
        org.lwjgl.a.a(intBuffer3, 1);
        org.lwjgl.a.b(byteBuffer);
        NVTransformFeedback.nglGetActiveVaryingNV(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(intBuffer3), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveVaryingNV(int var0, int var1, int var2, long var3, long var5, long var7, long var9, long var11);

    public static String a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        IntBuffer intBuffer2 = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        NVTransformFeedback.nglGetActiveVaryingNV(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer2), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, intBuffer.position() + 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer2.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static String b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QL;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        NVTransformFeedback.nglGetActiveVaryingNV(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a((Buffer)org.lwjgl.opengl.i.a(dt2)), org.lwjgl.o.a(org.lwjgl.opengl.i.a(dt2), 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QL;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVTransformFeedback.nglGetActiveVaryingNV(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, 1), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QL;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVTransformFeedback.nglGetActiveVaryingNV(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer, 1), org.lwjgl.o.a(intBuffer), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        NVTransformFeedback.nglActiveVaryingNV(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglActiveVaryingNV(int var0, long var1, long var3);

    public static void b(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QM;
        org.lwjgl.a.a(l2);
        NVTransformFeedback.nglActiveVaryingNV(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        NVTransformFeedback.nglGetTransformFeedbackVaryingNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTransformFeedbackVaryingNV(int var0, int var1, long var2, long var4);

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QN;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVTransformFeedback.nglGetTransformFeedbackVaryingNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

