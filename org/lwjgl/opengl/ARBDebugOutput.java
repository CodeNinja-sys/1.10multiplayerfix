/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.CallbackUtil;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.aa;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class ARBDebugOutput {
    public static final int a = 33346;
    public static final int b = 37187;
    public static final int c = 37188;
    public static final int d = 37189;
    public static final int e = 33347;
    public static final int f = 33348;
    public static final int g = 33349;
    public static final int h = 33350;
    public static final int i = 33351;
    public static final int j = 33352;
    public static final int k = 33353;
    public static final int l = 33354;
    public static final int m = 33355;
    public static final int n = 33356;
    public static final int o = 33357;
    public static final int p = 33358;
    public static final int q = 33359;
    public static final int r = 33360;
    public static final int s = 33361;
    public static final int t = 37190;
    public static final int u = 37191;
    public static final int v = 37192;

    private ARBDebugOutput() {
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.il;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.b(intBuffer);
        }
        ARBDebugOutput.nglDebugMessageControlARB(n2, n3, n4, intBuffer == null ? 0 : intBuffer.remaining(), org.lwjgl.o.b(intBuffer), bl2, l2);
    }

    static native void nglDebugMessageControlARB(int var0, int var1, int var2, int var3, long var4, boolean var6, long var7);

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.im;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBDebugOutput.nglDebugMessageInsertARB(n2, n3, n4, n5, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglDebugMessageInsertARB(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.im;
        org.lwjgl.a.a(l2);
        ARBDebugOutput.nglDebugMessageInsertARB(n2, n3, n4, n5, charSequence.length(), org.lwjgl.opengl.i.a(dt2, charSequence), l2);
    }

    public static void a(aa aa2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.in;
        org.lwjgl.a.a(l2);
        long l3 = aa2 == null ? 0L : CallbackUtil.a(aa2.d());
        CallbackUtil.a(l3);
        ARBDebugOutput.nglDebugMessageCallbackARB(aa2 == null ? 0L : aa2.a(), l3, l2);
    }

    static native void nglDebugMessageCallbackARB(long var0, long var2, long var4);

    public static int a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, IntBuffer intBuffer4, IntBuffer intBuffer5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.io;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, n2);
        }
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, n2);
        }
        if (intBuffer3 != null) {
            org.lwjgl.a.a(intBuffer3, n2);
        }
        if (intBuffer4 != null) {
            org.lwjgl.a.a(intBuffer4, n2);
        }
        if (intBuffer5 != null) {
            org.lwjgl.a.a(intBuffer5, n2);
        }
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        int n3 = ARBDebugOutput.nglGetDebugMessageLogARB(n2, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.b(intBuffer2), org.lwjgl.o.b(intBuffer3), org.lwjgl.o.b(intBuffer4), org.lwjgl.o.b(intBuffer5), org.lwjgl.o.b(byteBuffer), l2);
        return n3;
    }

    static native int nglGetDebugMessageLogARB(int var0, int var1, long var2, long var4, long var6, long var8, long var10, long var12, long var14);
}

