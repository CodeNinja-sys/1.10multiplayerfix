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
import org.lwjgl.opengl.i;
import org.lwjgl.opengl.is;

public class ARBBufferObject {
    public static final int a = 35040;
    public static final int b = 35041;
    public static final int c = 35042;
    public static final int d = 35044;
    public static final int e = 35045;
    public static final int f = 35046;
    public static final int g = 35048;
    public static final int h = 35049;
    public static final int i = 35050;
    public static final int j = 35000;
    public static final int k = 35001;
    public static final int l = 35002;
    public static final int m = 34660;
    public static final int n = 34661;
    public static final int o = 35003;
    public static final int p = 35004;
    public static final int q = 35005;

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hU;
        org.lwjgl.a.a(l2);
        is.a(dt2, n2, n3);
        ARBBufferObject.nglBindBufferARB(n2, n3, l2);
    }

    static native void nglBindBufferARB(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBBufferObject.nglDeleteBuffersARB(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteBuffersARB(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hV;
        org.lwjgl.a.a(l2);
        ARBBufferObject.nglDeleteBuffersARB(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBBufferObject.nglGenBuffersARB(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenBuffersARB(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.hW;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        ARBBufferObject.nglGenBuffersARB(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hX;
        org.lwjgl.a.a(l2);
        boolean bl2 = ARBBufferObject.nglIsBufferARB(n2, l2);
        return bl2;
    }

    static native boolean nglIsBufferARB(int var0, long var1);

    public static void a(int n2, long l2, int n3) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hY;
        org.lwjgl.a.a(l3);
        ARBBufferObject.nglBufferDataARB(n2, l2, 0L, n3, l3);
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBBufferObject.nglBufferDataARB(n2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), n3, l2);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBBufferObject.nglBufferDataARB(n2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), n3, l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBBufferObject.nglBufferDataARB(n2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), n3, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBBufferObject.nglBufferDataARB(n2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), n3, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        ARBBufferObject.nglBufferDataARB(n2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), n3, l2);
    }

    static native void nglBufferDataARB(int var0, long var1, long var3, int var5, long var6);

    public static void a(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hZ;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        ARBBufferObject.nglBufferSubDataARB(n2, l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l3);
    }

    public static void a(int n2, long l2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hZ;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        ARBBufferObject.nglBufferSubDataARB(n2, l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l3);
    }

    public static void a(int n2, long l2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hZ;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        ARBBufferObject.nglBufferSubDataARB(n2, l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l3);
    }

    public static void a(int n2, long l2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hZ;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        ARBBufferObject.nglBufferSubDataARB(n2, l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l3);
    }

    public static void a(int n2, long l2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hZ;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        ARBBufferObject.nglBufferSubDataARB(n2, l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l3);
    }

    static native void nglBufferSubDataARB(int var0, long var1, long var3, long var5, long var7);

    public static void b(int n2, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ia;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer);
        ARBBufferObject.nglGetBufferSubDataARB(n2, l2, byteBuffer.remaining(), org.lwjgl.o.a(byteBuffer), l3);
    }

    public static void b(int n2, long l2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ia;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(doubleBuffer);
        ARBBufferObject.nglGetBufferSubDataARB(n2, l2, doubleBuffer.remaining() << 3, org.lwjgl.o.a(doubleBuffer), l3);
    }

    public static void b(int n2, long l2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ia;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(floatBuffer);
        ARBBufferObject.nglGetBufferSubDataARB(n2, l2, floatBuffer.remaining() << 2, org.lwjgl.o.a(floatBuffer), l3);
    }

    public static void b(int n2, long l2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ia;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(intBuffer);
        ARBBufferObject.nglGetBufferSubDataARB(n2, l2, intBuffer.remaining() << 2, org.lwjgl.o.a(intBuffer), l3);
    }

    public static void b(int n2, long l2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ia;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.a(shortBuffer);
        ARBBufferObject.nglGetBufferSubDataARB(n2, l2, shortBuffer.remaining() << 1, org.lwjgl.o.a(shortBuffer), l3);
    }

    static native void nglGetBufferSubDataARB(int var0, long var1, long var3, long var5, long var7);

    public static ByteBuffer a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ib;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = ARBBufferObject.nglMapBufferARB(n2, n3, ARBBufferObject.c(n2, 34660), byteBuffer, l2);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    public static ByteBuffer a(int n2, int n3, long l2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ib;
        org.lwjgl.a.a(l3);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        ByteBuffer byteBuffer2 = ARBBufferObject.nglMapBufferARB(n2, n3, l2, byteBuffer, l3);
        return org.lwjgl.d.j && byteBuffer2 == null ? null : byteBuffer2.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglMapBufferARB(int var0, int var1, long var2, ByteBuffer var4, long var5);

    public static boolean c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ic;
        org.lwjgl.a.a(l2);
        boolean bl2 = ARBBufferObject.nglUnmapBufferARB(n2, l2);
        return bl2;
    }

    static native boolean nglUnmapBufferARB(int var0, long var1);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.id;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ARBBufferObject.nglGetBufferParameterivARB(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetBufferParameterivARB(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        return ARBBufferObject.c(n2, n3);
    }

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.id;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        ARBBufferObject.nglGetBufferParameterivARB(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static ByteBuffer d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ie;
        org.lwjgl.a.a(l2);
        ByteBuffer byteBuffer = ARBBufferObject.nglGetBufferPointervARB(n2, n3, ARBBufferObject.c(n2, 34660), l2);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetBufferPointervARB(int var0, int var1, long var2, long var4);
}

