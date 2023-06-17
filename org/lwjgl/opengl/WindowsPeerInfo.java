/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.ii;

abstract class WindowsPeerInfo
extends ii {
    protected WindowsPeerInfo() {
        super(WindowsPeerInfo.createHandle());
    }

    private static native ByteBuffer createHandle();

    protected static int a(long l2, int n2, int n3, PixelFormat pixelFormat, IntBuffer intBuffer, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        return WindowsPeerInfo.nChoosePixelFormat(l2, n2, n3, pixelFormat, intBuffer, bl2, bl3, bl4, bl5);
    }

    private static native int nChoosePixelFormat(long var0, int var2, int var3, PixelFormat var4, IntBuffer var5, boolean var6, boolean var7, boolean var8, boolean var9);

    protected static native void setPixelFormat(long var0, int var2);

    public final long e() {
        return WindowsPeerInfo.nGetHdc(this.h());
    }

    private static native long nGetHdc(ByteBuffer var0);

    public final long i() {
        return WindowsPeerInfo.nGetHwnd(this.h());
    }

    private static native long nGetHwnd(ByteBuffer var0);
}

