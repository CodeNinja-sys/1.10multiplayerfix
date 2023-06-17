/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVPixelDataRange {
    public static final int a = 34936;
    public static final int b = 34937;
    public static final int c = 34938;
    public static final int d = 34939;
    public static final int e = 34940;
    public static final int f = 34941;

    private NVPixelDataRange() {
    }

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVPixelDataRange.nglPixelDataRangeNV(n2, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        NVPixelDataRange.nglPixelDataRangeNV(n2, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVPixelDataRange.nglPixelDataRangeNV(n2, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVPixelDataRange.nglPixelDataRangeNV(n2, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Pz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVPixelDataRange.nglPixelDataRangeNV(n2, shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglPixelDataRangeNV(int var0, int var1, long var2, long var4);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PA;
        org.lwjgl.a.a(l2);
        NVPixelDataRange.nglFlushPixelDataRangeNV(n2, l2);
    }

    static native void nglFlushPixelDataRangeNV(int var0, long var1);
}

