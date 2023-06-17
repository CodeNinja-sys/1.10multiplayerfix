/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GL44;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBBufferStorage {
    public static final int a = 64;
    public static final int b = 128;
    public static final int c = 256;
    public static final int d = 512;
    public static final int e = 33311;
    public static final int f = 33312;
    public static final int g = 16384;

    private ARBBufferStorage() {
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        GL44.a(n2, byteBuffer, n3);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer, int n3) {
        GL44.a(n2, doubleBuffer, n3);
    }

    public static void a(int n2, FloatBuffer floatBuffer, int n3) {
        GL44.a(n2, floatBuffer, n3);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        GL44.a(n2, intBuffer, n3);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        GL44.a(n2, shortBuffer, n3);
    }

    public static void a(int n2, LongBuffer longBuffer, int n3) {
        GL44.a(n2, longBuffer, n3);
    }

    public static void a(int n2, long l2, int n3) {
        GL44.a(n2, l2, n3);
    }

    public static void b(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.if;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBBufferStorage.nglNamedBufferStorageEXT(n2, byteBuffer.remaining(), o.a(byteBuffer), n3, l2);
    }

    public static void b(int n2, DoubleBuffer doubleBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.if;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBBufferStorage.nglNamedBufferStorageEXT(n2, doubleBuffer.remaining() << 3, o.a(doubleBuffer), n3, l2);
    }

    public static void b(int n2, FloatBuffer floatBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.if;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBBufferStorage.nglNamedBufferStorageEXT(n2, floatBuffer.remaining() << 2, o.a(floatBuffer), n3, l2);
    }

    public static void b(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.if;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBBufferStorage.nglNamedBufferStorageEXT(n2, intBuffer.remaining() << 2, o.a(intBuffer), n3, l2);
    }

    public static void b(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.if;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        ARBBufferStorage.nglNamedBufferStorageEXT(n2, shortBuffer.remaining() << 1, o.a(shortBuffer), n3, l2);
    }

    public static void b(int n2, LongBuffer longBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.if;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        ARBBufferStorage.nglNamedBufferStorageEXT(n2, longBuffer.remaining() << 3, o.a(longBuffer), n3, l2);
    }

    static native void nglNamedBufferStorageEXT(int var0, long var1, long var3, int var5, long var6);

    public static void b(int n2, long l2, int n3) {
        dt dt2 = GLContext.a();
        long l3 = dt2.if;
        org.lwjgl.a.a(l3);
        ARBBufferStorage.nglNamedBufferStorageEXT(n2, l2, 0L, n3, l3);
    }
}

