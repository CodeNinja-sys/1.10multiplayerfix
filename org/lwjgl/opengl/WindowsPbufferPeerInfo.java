/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.opengl.WindowsPeerInfo;

final class WindowsPbufferPeerInfo
extends WindowsPeerInfo {
    WindowsPbufferPeerInfo(int n2, int n3, PixelFormat pixelFormat, IntBuffer intBuffer, IntBuffer intBuffer2) {
        WindowsPbufferPeerInfo.nCreate(this.h(), n2, n3, pixelFormat, intBuffer, intBuffer2);
    }

    private static native void nCreate(ByteBuffer var0, int var1, int var2, PixelFormat var3, IntBuffer var4, IntBuffer var5);

    public boolean d() {
        return WindowsPbufferPeerInfo.nIsBufferLost(this.h());
    }

    private static native boolean nIsBufferLost(ByteBuffer var0);

    public void a(int n2, int n3) {
        WindowsPbufferPeerInfo.nSetPbufferAttrib(this.h(), n2, n3);
    }

    private static native void nSetPbufferAttrib(ByteBuffer var0, int var1, int var2);

    public void a(int n2) {
        WindowsPbufferPeerInfo.nBindTexImageToPbuffer(this.h(), n2);
    }

    private static native void nBindTexImageToPbuffer(ByteBuffer var0, int var1);

    public void b(int n2) {
        WindowsPbufferPeerInfo.nReleaseTexImageFromPbuffer(this.h(), n2);
    }

    private static native void nReleaseTexImageFromPbuffer(ByteBuffer var0, int var1);

    public void c() {
        WindowsPbufferPeerInfo.nDestroy(this.h());
    }

    private static native void nDestroy(ByteBuffer var0);

    protected void a() {
    }

    protected void b() {
    }
}

