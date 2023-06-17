/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.EXTDrawBuffers2;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVExplicitMultisample {
    public static final int a = 36432;
    public static final int b = 36433;
    public static final int c = 36434;
    public static final int d = 36435;
    public static final int e = 36436;
    public static final int f = 36441;
    public static final int g = 36437;
    public static final int h = 36438;
    public static final int i = 36439;
    public static final int j = 36440;

    private NVExplicitMultisample() {
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        EXTDrawBuffers2.a(n2, n3, byteBuffer);
    }

    public static boolean a(int n2, int n3) {
        return EXTDrawBuffers2.a(n2, n3);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        EXTDrawBuffers2.a(n2, n3, intBuffer);
    }

    public static int b(int n2, int n3) {
        return EXTDrawBuffers2.b(n2, n3);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 2);
        NVExplicitMultisample.nglGetMultisamplefvNV(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetMultisamplefvNV(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MG;
        org.lwjgl.a.a(l2);
        NVExplicitMultisample.nglSampleMaskIndexedNV(n2, n3, l2);
    }

    static native void nglSampleMaskIndexedNV(int var0, int var1, long var2);

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MH;
        org.lwjgl.a.a(l2);
        NVExplicitMultisample.nglTexRenderbufferNV(n2, n3, l2);
    }

    static native void nglTexRenderbufferNV(int var0, int var1, long var2);
}

