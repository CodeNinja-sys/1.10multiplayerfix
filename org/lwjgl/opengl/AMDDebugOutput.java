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
import org.lwjgl.opengl.b;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class AMDDebugOutput {
    public static final int a = 37187;
    public static final int b = 37188;
    public static final int c = 37189;
    public static final int d = 37190;
    public static final int e = 37191;
    public static final int f = 37192;
    public static final int g = 37193;
    public static final int h = 37194;
    public static final int i = 37195;
    public static final int j = 37196;
    public static final int k = 37197;
    public static final int l = 37198;
    public static final int m = 37199;
    public static final int n = 37200;

    private AMDDebugOutput() {
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gr;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.b(intBuffer);
        }
        AMDDebugOutput.nglDebugMessageEnableAMD(n2, n3, intBuffer == null ? 0 : intBuffer.remaining(), o.b(intBuffer), bl2, l2);
    }

    static native void nglDebugMessageEnableAMD(int var0, int var1, int var2, long var3, boolean var5, long var6);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gs;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        AMDDebugOutput.nglDebugMessageInsertAMD(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglDebugMessageInsertAMD(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gs;
        org.lwjgl.a.a(l2);
        AMDDebugOutput.nglDebugMessageInsertAMD(n2, n3, n4, charSequence.length(), org.lwjgl.opengl.i.a(dt2, charSequence), l2);
    }

    public static void a(b b2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gt;
        org.lwjgl.a.a(l2);
        long l3 = b2 == null ? 0L : CallbackUtil.a(b2.d());
        CallbackUtil.b(l3);
        AMDDebugOutput.nglDebugMessageCallbackAMD(b2 == null ? 0L : b2.a(), l3, l2);
    }

    static native void nglDebugMessageCallbackAMD(long var0, long var2, long var4);

    public static int a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, IntBuffer intBuffer4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gu;
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
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        int n3 = AMDDebugOutput.nglGetDebugMessageLogAMD(n2, byteBuffer == null ? 0 : byteBuffer.remaining(), o.b(intBuffer), o.b(intBuffer2), o.b(intBuffer3), o.b(intBuffer4), o.b(byteBuffer), l2);
        return n3;
    }

    static native int nglGetDebugMessageLogAMD(int var0, int var1, long var2, long var4, long var6, long var8, long var10, long var12);
}

