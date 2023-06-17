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
import org.lwjgl.opengl.i;

public final class ATIVertexArrayObject {
    public static final int a = 34656;
    public static final int b = 34657;
    public static final int c = 34658;
    public static final int d = 34659;
    public static final int e = 34660;
    public static final int f = 34661;
    public static final int g = 34662;
    public static final int h = 34663;

    private ATIVertexArrayObject() {
    }

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nC;
        org.lwjgl.a.a(l2);
        int n4 = ATIVertexArrayObject.nglNewObjectBufferATI(n2, 0L, n3, l2);
        return n4;
    }

    public static int a(ByteBuffer byteBuffer, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        int n3 = ATIVertexArrayObject.nglNewObjectBufferATI(byteBuffer.remaining(), o.a(byteBuffer), n2, l2);
        return n3;
    }

    public static int a(DoubleBuffer doubleBuffer, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        int n3 = ATIVertexArrayObject.nglNewObjectBufferATI(doubleBuffer.remaining() << 3, o.a(doubleBuffer), n2, l2);
        return n3;
    }

    public static int a(FloatBuffer floatBuffer, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        int n3 = ATIVertexArrayObject.nglNewObjectBufferATI(floatBuffer.remaining() << 2, o.a(floatBuffer), n2, l2);
        return n3;
    }

    public static int a(IntBuffer intBuffer, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        int n3 = ATIVertexArrayObject.nglNewObjectBufferATI(intBuffer.remaining() << 2, o.a(intBuffer), n2, l2);
        return n3;
    }

    public static int a(ShortBuffer shortBuffer, int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        int n3 = ATIVertexArrayObject.nglNewObjectBufferATI(shortBuffer.remaining() << 1, o.a(shortBuffer), n2, l2);
        return n3;
    }

    static native int nglNewObjectBufferATI(int var0, long var1, int var3, long var4);

    public static boolean a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nD;
        org.lwjgl.a.a(l2);
        boolean bl2 = ATIVertexArrayObject.nglIsObjectBufferATI(n2, l2);
        return bl2;
    }

    static native boolean nglIsObjectBufferATI(int var0, long var1);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ATIVertexArrayObject.nglUpdateObjectBufferATI(n2, n3, byteBuffer.remaining(), o.a(byteBuffer), n4, l2);
    }

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ATIVertexArrayObject.nglUpdateObjectBufferATI(n2, n3, doubleBuffer.remaining() << 3, o.a(doubleBuffer), n4, l2);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ATIVertexArrayObject.nglUpdateObjectBufferATI(n2, n3, floatBuffer.remaining() << 2, o.a(floatBuffer), n4, l2);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ATIVertexArrayObject.nglUpdateObjectBufferATI(n2, n3, intBuffer.remaining() << 2, o.a(intBuffer), n4, l2);
    }

    public static void a(int n2, int n3, ShortBuffer shortBuffer, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        ATIVertexArrayObject.nglUpdateObjectBufferATI(n2, n3, shortBuffer.remaining() << 1, o.a(shortBuffer), n4, l2);
    }

    static native void nglUpdateObjectBufferATI(int var0, int var1, int var2, long var3, int var5, long var6);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ATIVertexArrayObject.nglGetObjectBufferfvATI(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetObjectBufferfvATI(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ATIVertexArrayObject.nglGetObjectBufferivATI(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetObjectBufferivATI(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nG;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        ATIVertexArrayObject.nglGetObjectBufferivATI(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nH;
        org.lwjgl.a.a(l2);
        ATIVertexArrayObject.nglFreeObjectBufferATI(n2, l2);
    }

    static native void nglFreeObjectBufferATI(int var0, long var1);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nI;
        org.lwjgl.a.a(l2);
        ATIVertexArrayObject.nglArrayObjectATI(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglArrayObjectATI(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ATIVertexArrayObject.nglGetArrayObjectfvATI(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetArrayObjectfvATI(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ATIVertexArrayObject.nglGetArrayObjectivATI(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetArrayObjectivATI(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nL;
        org.lwjgl.a.a(l2);
        ATIVertexArrayObject.nglVariantArrayObjectATI(n2, n3, n4, n5, n6, l2);
    }

    static native void nglVariantArrayObjectATI(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ATIVertexArrayObject.nglGetVariantArrayObjectfvATI(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetVariantArrayObjectfvATI(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ATIVertexArrayObject.nglGetVariantArrayObjectivATI(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetVariantArrayObjectivATI(int var0, int var1, long var2, long var4);
}

