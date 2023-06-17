/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class APPLETextureRange {
    public static final int a = 34236;
    public static final int b = 34237;
    public static final int c = 34238;
    public static final int d = 34239;
    public static final int e = 34231;
    public static final int f = 34232;

    private APPLETextureRange() {
    }

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ho;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        APPLETextureRange.nglTextureRangeAPPLE(n2, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglTextureRangeAPPLE(int var0, int var1, long var2, long var4);

    public static Buffer a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hp;
        org.lwjgl.a.a(l3);
        Buffer buffer = APPLETextureRange.nglGetTexParameterPointervAPPLE(n2, n3, l2, l3);
        return buffer;
    }

    static native Buffer nglGetTexParameterPointervAPPLE(int var0, int var1, long var2, long var4);
}

