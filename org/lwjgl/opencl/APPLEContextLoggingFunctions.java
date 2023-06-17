/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.x;

final class APPLEContextLoggingFunctions {
    private APPLEContextLoggingFunctions() {
    }

    static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        long l2 = x.b;
        a.a(l2);
        a.b(byteBuffer);
        a.b(byteBuffer2);
        a.b(byteBuffer3);
        APPLEContextLoggingFunctions.nclLogMessagesToSystemLogAPPLE(o.a(byteBuffer), o.a(byteBuffer2), byteBuffer2.remaining(), o.a(byteBuffer3), l2);
    }

    static native void nclLogMessagesToSystemLogAPPLE(long var0, long var2, long var4, long var6, long var8);

    static void b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        long l2 = x.c;
        a.a(l2);
        a.b(byteBuffer);
        a.b(byteBuffer2);
        a.b(byteBuffer3);
        APPLEContextLoggingFunctions.nclLogMessagesToStdoutAPPLE(o.a(byteBuffer), o.a(byteBuffer2), byteBuffer2.remaining(), o.a(byteBuffer3), l2);
    }

    static native void nclLogMessagesToStdoutAPPLE(long var0, long var2, long var4, long var6, long var8);

    static void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        long l2 = x.d;
        a.a(l2);
        a.b(byteBuffer);
        a.b(byteBuffer2);
        a.b(byteBuffer3);
        APPLEContextLoggingFunctions.nclLogMessagesToStderrAPPLE(o.a(byteBuffer), o.a(byteBuffer2), byteBuffer2.remaining(), o.a(byteBuffer3), l2);
    }

    static native void nclLogMessagesToStderrAPPLE(long var0, long var2, long var4, long var6, long var8);
}

