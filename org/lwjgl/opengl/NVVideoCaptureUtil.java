/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.du;

public final class NVVideoCaptureUtil {
    private NVVideoCaptureUtil() {
    }

    private static void a() {
        if (d.j && !GLContext.a().gn) {
            throw new IllegalStateException("NV_video_capture is not supported");
        }
    }

    private static ByteBuffer b() {
        return du.g().e().h();
    }

    public static boolean a(int n2, long l2) {
        NVVideoCaptureUtil.a();
        return NVVideoCaptureUtil.nglBindVideoCaptureDeviceNV(NVVideoCaptureUtil.b(), n2, l2);
    }

    private static native boolean nglBindVideoCaptureDeviceNV(ByteBuffer var0, int var1, long var2);

    public static int a(LongBuffer longBuffer) {
        NVVideoCaptureUtil.a();
        if (longBuffer != null) {
            a.a(longBuffer, 1);
        }
        return NVVideoCaptureUtil.nglEnumerateVideoCaptureDevicesNV(NVVideoCaptureUtil.b(), longBuffer, longBuffer == null ? 0 : longBuffer.position());
    }

    private static native int nglEnumerateVideoCaptureDevicesNV(ByteBuffer var0, LongBuffer var1, int var2);

    public static boolean a(long l2) {
        NVVideoCaptureUtil.a();
        return NVVideoCaptureUtil.nglLockVideoCaptureDeviceNV(NVVideoCaptureUtil.b(), l2);
    }

    private static native boolean nglLockVideoCaptureDeviceNV(ByteBuffer var0, long var1);

    public static boolean a(long l2, int n2, IntBuffer intBuffer) {
        NVVideoCaptureUtil.a();
        a.a(intBuffer, 1);
        return NVVideoCaptureUtil.nglQueryVideoCaptureDeviceNV(NVVideoCaptureUtil.b(), l2, n2, intBuffer, intBuffer.position());
    }

    private static native boolean nglQueryVideoCaptureDeviceNV(ByteBuffer var0, long var1, int var3, IntBuffer var4, int var5);

    public static boolean b(long l2) {
        NVVideoCaptureUtil.a();
        return NVVideoCaptureUtil.nglReleaseVideoCaptureDeviceNV(NVVideoCaptureUtil.b(), l2);
    }

    private static native boolean nglReleaseVideoCaptureDeviceNV(ByteBuffer var0, long var1);
}

