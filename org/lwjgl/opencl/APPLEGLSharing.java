/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.d;
import org.lwjgl.x;

public final class APPLEGLSharing {
    public static final int a = 0x10000000;
    public static final int b = 0x10000002;
    public static final int c = 0x10000003;
    public static final int d = -1000;

    private APPLEGLSharing() {
    }

    public static int a(ab ab2, x x2, int n2, ByteBuffer byteBuffer, x x3) {
        int n3;
        long l2 = org.lwjgl.opencl.x.h;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if (x3 == null && org.lwjgl.opencl.d.d(n2)) {
            x3 = org.lwjgl.opencl.d.g();
        }
        if ((n3 = APPLEGLSharing.nclGetGLContextInfoAPPLE(ab2.a(), o.c(x2), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), o.b(byteBuffer), o.d(x3), l2)) == 0 && byteBuffer != null && org.lwjgl.opencl.d.d(n2)) {
            ((au)ab2.m()).a(byteBuffer, x3);
        }
        return n3;
    }

    static native int nclGetGLContextInfoAPPLE(long var0, long var2, int var4, long var5, long var7, long var9, long var11);
}

