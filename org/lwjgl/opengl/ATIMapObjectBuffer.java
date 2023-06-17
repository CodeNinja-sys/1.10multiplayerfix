/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.opengl.ATIVertexArrayObject;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ATIMapObjectBuffer {
    private ATIMapObjectBuffer() {
    }

    public static ByteBuffer a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nw;
        a.a(l2);
        if (byteBuffer != null) {
            a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = ATIMapObjectBuffer.nglMapObjectBufferATI(n2, ATIVertexArrayObject.b(n2, 34660), byteBuffer, l2);
        return d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    public static ByteBuffer a(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.nw;
        a.a(l3);
        if (byteBuffer != null) {
            a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = ATIMapObjectBuffer.nglMapObjectBufferATI(n2, l2, byteBuffer, l3);
        return d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapObjectBufferATI(int var0, long var1, ByteBuffer var3, long var4);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nx;
        a.a(l2);
        ATIMapObjectBuffer.nglUnmapObjectBufferATI(n2, l2);
    }

    static native void nglUnmapObjectBufferATI(int var0, long var1);
}

