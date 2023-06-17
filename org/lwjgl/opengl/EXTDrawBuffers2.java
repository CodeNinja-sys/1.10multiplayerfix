/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class EXTDrawBuffers2 {
    private EXTDrawBuffers2() {
    }

    public static void a(int n2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sA;
        a.a(l2);
        EXTDrawBuffers2.nglColorMaskIndexedEXT(n2, bl2, bl3, bl4, bl5, l2);
    }

    static native void nglColorMaskIndexedEXT(int var0, boolean var1, boolean var2, boolean var3, boolean var4, long var5);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sB;
        a.a(l2);
        a.b(byteBuffer, 4);
        EXTDrawBuffers2.nglGetBooleanIndexedvEXT(n2, n3, o.a(byteBuffer), l2);
    }

    static native void nglGetBooleanIndexedvEXT(int var0, int var1, long var2, long var4);

    public static boolean a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sB;
        a.a(l2);
        ByteBuffer byteBuffer = i.a(dt2, 1);
        EXTDrawBuffers2.nglGetBooleanIndexedvEXT(n2, n3, o.a(byteBuffer), l2);
        return byteBuffer.get(0) == 1;
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sC;
        a.a(l2);
        a.a(intBuffer, 4);
        EXTDrawBuffers2.nglGetIntegerIndexedvEXT(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetIntegerIndexedvEXT(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sC;
        a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        EXTDrawBuffers2.nglGetIntegerIndexedvEXT(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sD;
        a.a(l2);
        EXTDrawBuffers2.nglEnableIndexedEXT(n2, n3, l2);
    }

    static native void nglEnableIndexedEXT(int var0, int var1, long var2);

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sE;
        a.a(l2);
        EXTDrawBuffers2.nglDisableIndexedEXT(n2, n3, l2);
    }

    static native void nglDisableIndexedEXT(int var0, int var1, long var2);

    public static boolean e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sF;
        a.a(l2);
        boolean bl2 = EXTDrawBuffers2.nglIsEnabledIndexedEXT(n2, n3, l2);
        return bl2;
    }

    static native boolean nglIsEnabledIndexedEXT(int var0, int var1, long var2);
}

