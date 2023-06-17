/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class APPLEElementArray {
    public static final int a = 34664;
    public static final int b = 34665;
    public static final int c = 34666;

    private APPLEElementArray() {
    }

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        APPLEElementArray.nglElementPointerAPPLE(5121, o.a(byteBuffer), l2);
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        APPLEElementArray.nglElementPointerAPPLE(5125, o.a(intBuffer), l2);
    }

    public static void a(ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        APPLEElementArray.nglElementPointerAPPLE(5123, o.a(shortBuffer), l2);
    }

    static native void nglElementPointerAPPLE(int var0, long var1, long var3);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gX;
        org.lwjgl.a.a(l2);
        APPLEElementArray.nglDrawElementArrayAPPLE(n2, n3, n4, l2);
    }

    static native void nglDrawElementArrayAPPLE(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gY;
        org.lwjgl.a.a(l2);
        APPLEElementArray.nglDrawRangeElementArrayAPPLE(n2, n3, n4, n5, n6, l2);
    }

    static native void nglDrawRangeElementArrayAPPLE(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(intBuffer2, intBuffer.remaining());
        APPLEElementArray.nglMultiDrawElementArrayAPPLE(n2, o.a(intBuffer), o.a(intBuffer2), intBuffer.remaining(), l2);
    }

    static native void nglMultiDrawElementArrayAPPLE(int var0, long var1, long var3, int var5, long var6);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ha;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(intBuffer2, intBuffer.remaining());
        APPLEElementArray.nglMultiDrawRangeElementArrayAPPLE(n2, n3, n4, o.a(intBuffer), o.a(intBuffer2), intBuffer.remaining(), l2);
    }

    static native void nglMultiDrawRangeElementArrayAPPLE(int var0, int var1, int var2, long var3, long var5, int var7, long var8);
}

