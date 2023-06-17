/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.d;
import org.lwjgl.x;

public final class KHRGLSharing {
    public static final int a = -1000;
    public static final int b = 8198;
    public static final int c = 8199;
    public static final int d = 8200;
    public static final int e = 8201;
    public static final int f = 8202;
    public static final int g = 8203;
    public static final int h = 8204;

    private KHRGLSharing() {
    }

    public static int a(x x2, int n2, ByteBuffer byteBuffer, x x3) {
        int n3;
        long l2 = org.lwjgl.opencl.x.bq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(x2);
        org.lwjgl.a.a(x2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if (x3 == null && org.lwjgl.opencl.d.d(n2)) {
            x3 = org.lwjgl.opencl.d.g();
        }
        if ((n3 = KHRGLSharing.nclGetGLContextInfoKHR(o.c(x2), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), o.b(byteBuffer), o.d(x3), l2)) == 0 && byteBuffer != null && org.lwjgl.opencl.d.d(n2)) {
            org.lwjgl.opencl.d.b(x2).a(byteBuffer, x3);
        }
        return n3;
    }

    static native int nclGetGLContextInfoKHR(long var0, int var2, long var3, long var5, long var7, long var9);
}

