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

public final class NVFence {
    public static final int a = 34034;
    public static final int b = 34035;
    public static final int c = 34036;

    private NVFence() {
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVFence.nglGenFencesNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenFencesNV(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.MI;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        NVFence.nglGenFencesNV(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVFence.nglDeleteFencesNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteFencesNV(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MJ;
        org.lwjgl.a.a(l2);
        NVFence.nglDeleteFencesNV(1, i.c(dt2, n2), l2);
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MK;
        org.lwjgl.a.a(l2);
        NVFence.nglSetFenceNV(n2, n3, l2);
    }

    static native void nglSetFenceNV(int var0, int var1, long var2);

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ML;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVFence.nglTestFenceNV(n2, l2);
        return bl2;
    }

    static native boolean nglTestFenceNV(int var0, long var1);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MM;
        org.lwjgl.a.a(l2);
        NVFence.nglFinishFenceNV(n2, l2);
    }

    static native void nglFinishFenceNV(int var0, long var1);

    public static boolean d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MN;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVFence.nglIsFenceNV(n2, l2);
        return bl2;
    }

    static native boolean nglIsFenceNV(int var0, long var1);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVFence.nglGetFenceivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetFenceivNV(int var0, int var1, long var2, long var4);
}

