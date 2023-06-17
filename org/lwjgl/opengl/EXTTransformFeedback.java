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

public final class EXTTransformFeedback {
    public static final int a = 35982;
    public static final int b = 35972;
    public static final int c = 35973;
    public static final int d = 35983;
    public static final int e = 35980;
    public static final int f = 35981;
    public static final int g = 35975;
    public static final int h = 35976;
    public static final int i = 35977;
    public static final int j = 35978;
    public static final int k = 35979;
    public static final int l = 35968;
    public static final int m = 35971;
    public static final int n = 35967;
    public static final int o = 35958;

    private EXTTransformFeedback() {
    }

    public static void a(int n2, int n3, int n4, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.ux;
        org.lwjgl.a.a(l4);
        EXTTransformFeedback.nglBindBufferRangeEXT(n2, n3, n4, l2, l3, l4);
    }

    static native void nglBindBufferRangeEXT(int var0, int var1, int var2, long var3, long var5, long var7);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.uy;
        org.lwjgl.a.a(l3);
        EXTTransformFeedback.nglBindBufferOffsetEXT(n2, n3, n4, l2, l3);
    }

    static native void nglBindBufferOffsetEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uz;
        org.lwjgl.a.a(l2);
        EXTTransformFeedback.nglBindBufferBaseEXT(n2, n3, n4, l2);
    }

    static native void nglBindBufferBaseEXT(int var0, int var1, int var2, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uA;
        org.lwjgl.a.a(l2);
        EXTTransformFeedback.nglBeginTransformFeedbackEXT(n2, l2);
    }

    static native void nglBeginTransformFeedbackEXT(int var0, long var1);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.uB;
        org.lwjgl.a.a(l2);
        EXTTransformFeedback.nglEndTransformFeedbackEXT(l2);
    }

    static native void nglEndTransformFeedbackEXT(long var0);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer, n3);
        EXTTransformFeedback.nglTransformFeedbackVaryingsEXT(n2, n3, org.lwjgl.o.a(byteBuffer), n4, l2);
    }

    static native void nglTransformFeedbackVaryingsEXT(int var0, int var1, long var2, int var4, long var5);

    public static void a(int n2, CharSequence[] arrcharSequence, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrcharSequence);
        EXTTransformFeedback.nglTransformFeedbackVaryingsEXT(n2, arrcharSequence.length, org.lwjgl.opengl.i.b(dt2, arrcharSequence), n3, l2);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uD;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.a(intBuffer2, 1);
        org.lwjgl.a.a(intBuffer3, 1);
        org.lwjgl.a.b(byteBuffer);
        EXTTransformFeedback.nglGetTransformFeedbackVaryingEXT(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(intBuffer3), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetTransformFeedbackVaryingEXT(int var0, int var1, int var2, long var3, long var5, long var7, long var9, long var11);

    public static String a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        org.lwjgl.a.a(intBuffer2, 1);
        IntBuffer intBuffer3 = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        EXTTransformFeedback.nglGetTransformFeedbackVaryingEXT(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer3), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer3.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }
}

