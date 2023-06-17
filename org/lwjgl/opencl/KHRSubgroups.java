/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.ak;
import org.lwjgl.x;

public final class KHRSubgroups {
    private KHRSubgroups() {
    }

    public static int a(ak ak2, ae ae2, int n2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, x x2) {
        long l2 = org.lwjgl.opencl.x.bu;
        a.a(l2);
        if (byteBuffer != null) {
            a.b(byteBuffer);
        }
        if (byteBuffer2 != null) {
            a.b(byteBuffer2);
        }
        if (x2 != null) {
            a.a(x2, 1);
        }
        int n3 = KHRSubgroups.nclGetKernelSubGroupInfoKHR(ak2.a(), ae2 == null ? 0L : ae2.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), o.b(byteBuffer), byteBuffer2 == null ? 0 : byteBuffer2.remaining(), o.b(byteBuffer2), o.d(x2), l2);
        return n3;
    }

    static native int nclGetKernelSubGroupInfoKHR(long var0, long var2, int var4, long var5, long var7, long var9, long var11, long var13, long var15);
}

