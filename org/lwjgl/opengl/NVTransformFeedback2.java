/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class NVTransformFeedback2 {
    public static final int a = 36386;
    public static final int b = 36387;
    public static final int c = 36388;
    public static final int d = 36389;

    private NVTransformFeedback2() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QO;
        org.lwjgl.a.a(l2);
        NVTransformFeedback2.nglBindTransformFeedbackNV(n2, n3, l2);
    }

    static native void nglBindTransformFeedbackNV(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVTransformFeedback2.nglDeleteTransformFeedbacksNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteTransformFeedbacksNV(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QP;
        org.lwjgl.a.a(l2);
        NVTransformFeedback2.nglDeleteTransformFeedbacksNV(1, i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVTransformFeedback2.nglGenTransformFeedbacksNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenTransformFeedbacksNV(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.QQ;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        NVTransformFeedback2.nglGenTransformFeedbacksNV(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QR;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVTransformFeedback2.nglIsTransformFeedbackNV(n2, l2);
        return bl2;
    }

    static native boolean nglIsTransformFeedbackNV(int var0, long var1);

    public static void b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.QS;
        org.lwjgl.a.a(l2);
        NVTransformFeedback2.nglPauseTransformFeedbackNV(l2);
    }

    static native void nglPauseTransformFeedbackNV(long var0);

    public static void c() {
        dt dt2 = GLContext.a();
        long l2 = dt2.QT;
        org.lwjgl.a.a(l2);
        NVTransformFeedback2.nglResumeTransformFeedbackNV(l2);
    }

    static native void nglResumeTransformFeedbackNV(long var0);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QU;
        org.lwjgl.a.a(l2);
        NVTransformFeedback2.nglDrawTransformFeedbackNV(n2, n3, l2);
    }

    static native void nglDrawTransformFeedbackNV(int var0, int var1, long var2);
}

