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

public final class APPLEVertexArrayObject {
    public static final int a = 34229;

    private APPLEVertexArrayObject() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hq;
        org.lwjgl.a.a(l2);
        APPLEVertexArrayObject.nglBindVertexArrayAPPLE(n2, l2);
    }

    static native void nglBindVertexArrayAPPLE(int var0, long var1);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        APPLEVertexArrayObject.nglDeleteVertexArraysAPPLE(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteVertexArraysAPPLE(int var0, long var1, long var3);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hr;
        org.lwjgl.a.a(l2);
        APPLEVertexArrayObject.nglDeleteVertexArraysAPPLE(1, i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hs;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        APPLEVertexArrayObject.nglGenVertexArraysAPPLE(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenVertexArraysAPPLE(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.hs;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        APPLEVertexArrayObject.nglGenVertexArraysAPPLE(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ht;
        org.lwjgl.a.a(l2);
        boolean bl2 = APPLEVertexArrayObject.nglIsVertexArrayAPPLE(n2, l2);
        return bl2;
    }

    static native boolean nglIsVertexArrayAPPLE(int var0, long var1);
}

