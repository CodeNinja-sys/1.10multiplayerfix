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

public final class NVPresentVideoUtil {
    private NVPresentVideoUtil() {
    }

    private static void a() {
        if (d.j && !GLContext.a().fH) {
            throw new IllegalStateException("NV_present_video is not supported");
        }
    }

    private static ByteBuffer b() {
        return du.g().e().h();
    }

    public static int a(LongBuffer longBuffer) {
        NVPresentVideoUtil.a();
        if (longBuffer != null) {
            a.a(longBuffer, 1);
        }
        return NVPresentVideoUtil.nglEnumerateVideoDevicesNV(NVPresentVideoUtil.b(), longBuffer, longBuffer == null ? 0 : longBuffer.position());
    }

    private static native int nglEnumerateVideoDevicesNV(ByteBuffer var0, LongBuffer var1, int var2);

    public static boolean a(int n2, long l2, IntBuffer intBuffer) {
        NVPresentVideoUtil.a();
        if (intBuffer != null) {
            a.a(intBuffer);
        }
        return NVPresentVideoUtil.nglBindVideoDeviceNV(NVPresentVideoUtil.b(), n2, l2, intBuffer, intBuffer == null ? 0 : intBuffer.position());
    }

    private static native boolean nglBindVideoDeviceNV(ByteBuffer var0, int var1, long var2, IntBuffer var4, int var5);

    public static boolean a(int n2, IntBuffer intBuffer) {
        NVPresentVideoUtil.a();
        a.a(intBuffer, 1);
        du du2 = du.g();
        return NVPresentVideoUtil.nglQueryContextNV(du2.e().h(), du2.j(), n2, intBuffer, intBuffer.position());
    }

    private static native boolean nglQueryContextNV(ByteBuffer var0, ByteBuffer var1, int var2, IntBuffer var3, int var4);
}

