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

public final class APPLEFence {
    public static final int a = 35338;
    public static final int b = 35339;

    private APPLEFence() {
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        APPLEFence.nglGenFencesAPPLE(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenFencesAPPLE(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.hb;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        APPLEFence.nglGenFencesAPPLE(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        APPLEFence.nglDeleteFencesAPPLE(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteFencesAPPLE(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hc;
        org.lwjgl.a.a(l2);
        APPLEFence.nglDeleteFencesAPPLE(1, i.c(dt2, n2), l2);
    }

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hd;
        org.lwjgl.a.a(l2);
        APPLEFence.nglSetFenceAPPLE(n2, l2);
    }

    static native void nglSetFenceAPPLE(int var0, long var1);

    public static boolean c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.he;
        org.lwjgl.a.a(l2);
        boolean bl2 = APPLEFence.nglIsFenceAPPLE(n2, l2);
        return bl2;
    }

    static native boolean nglIsFenceAPPLE(int var0, long var1);

    public static boolean d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hf;
        org.lwjgl.a.a(l2);
        boolean bl2 = APPLEFence.nglTestFenceAPPLE(n2, l2);
        return bl2;
    }

    static native boolean nglTestFenceAPPLE(int var0, long var1);

    public static void e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hg;
        org.lwjgl.a.a(l2);
        APPLEFence.nglFinishFenceAPPLE(n2, l2);
    }

    static native void nglFinishFenceAPPLE(int var0, long var1);

    public static boolean a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hh;
        org.lwjgl.a.a(l2);
        boolean bl2 = APPLEFence.nglTestObjectAPPLE(n2, n3, l2);
        return bl2;
    }

    static native boolean nglTestObjectAPPLE(int var0, int var1, long var2);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hi;
        org.lwjgl.a.a(l2);
        APPLEFence.nglFinishObjectAPPLE(n2, n3, l2);
    }

    static native void nglFinishObjectAPPLE(int var0, int var1, long var2);
}

