/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVVertexArrayRange {
    public static final int a = 34077;
    public static final int b = 34078;
    public static final int c = 34079;
    public static final int d = 34080;
    public static final int e = 34081;

    private NVVertexArrayRange() {
    }

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVVertexArrayRange.nglVertexArrayRangeNV(byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void a(DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        NVVertexArrayRange.nglVertexArrayRangeNV(doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    public static void a(FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVVertexArrayRange.nglVertexArrayRangeNV(floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVVertexArrayRange.nglVertexArrayRangeNV(intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    public static void a(ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVVertexArrayRange.nglVertexArrayRangeNV(shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglVertexArrayRangeNV(int var0, long var1, long var3);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.QW;
        org.lwjgl.a.a(l2);
        NVVertexArrayRange.nglFlushVertexArrayRangeNV(l2);
    }

    static native void nglFlushVertexArrayRangeNV(long var0);

    public static ByteBuffer a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QX;
        org.lwjgl.a.a(l2);
        ByteBuffer byteBuffer = NVVertexArrayRange.nglAllocateMemoryNV(n2, f2, f3, f4, n2, l2);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglAllocateMemoryNV(int var0, float var1, float var2, float var3, long var4, long var6);

    public static void b(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVVertexArrayRange.nglFreeMemoryNV(o.a(byteBuffer), l2);
    }

    static native void nglFreeMemoryNV(long var0, long var2);
}

