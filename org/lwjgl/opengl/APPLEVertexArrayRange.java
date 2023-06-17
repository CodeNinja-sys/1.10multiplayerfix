/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class APPLEVertexArrayRange {
    public static final int a = 34077;
    public static final int b = 34078;
    public static final int c = 34080;
    public static final int d = 34081;
    public static final int e = 34079;
    public static final int f = 34238;
    public static final int g = 34239;
    public static final int h = 35338;
    public static final int i = 35339;

    private APPLEVertexArrayRange() {
    }

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        APPLEVertexArrayRange.nglVertexArrayRangeAPPLE(byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglVertexArrayRangeAPPLE(int var0, long var1, long var3);

    public static void b(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        APPLEVertexArrayRange.nglFlushVertexArrayRangeAPPLE(byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglFlushVertexArrayRangeAPPLE(int var0, long var1, long var3);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hw;
        org.lwjgl.a.a(l2);
        APPLEVertexArrayRange.nglVertexArrayParameteriAPPLE(n2, n3, l2);
    }

    static native void nglVertexArrayParameteriAPPLE(int var0, int var1, long var2);
}

