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
import org.lwjgl.opengl.ft;

public final class ARBRobustness {
    public static final int a = 33363;
    public static final int b = 33364;
    public static final int c = 33365;
    public static final int d = 33366;
    public static final int e = 33362;
    public static final int f = 33377;
    public static final int g = 4;

    private ARBRobustness() {
    }

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.kD;
        org.lwjgl.a.a(l2);
        int n2 = ARBRobustness.nglGetGraphicsResetStatusARB(l2);
        return n2;
    }

    static native int nglGetGraphicsResetStatusARB(long var0);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnMapdvARB(n2, n3, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    static native void nglGetnMapdvARB(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnMapfvARB(n2, n3, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    static native void nglGetnMapfvARB(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnMapivARB(n2, n3, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    static native void nglGetnMapivARB(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnPixelMapfvARB(n2, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    static native void nglGetnPixelMapfvARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnPixelMapuivARB(n2, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    static native void nglGetnPixelMapuivARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnPixelMapusvARB(n2, shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglGetnPixelMapusvARB(int var0, int var1, long var2, long var4);

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnPolygonStippleARB(byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglGetnPolygonStippleARB(int var0, long var1, long var3);

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnTexImageARB(n2, n3, n4, n5, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnTexImageARB(n2, n3, n4, n5, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnTexImageARB(n2, n3, n4, n5, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnTexImageARB(n2, n3, n4, n5, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kL;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnTexImageARB(n2, n3, n4, n5, shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglGetnTexImageARB(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.kL;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBRobustness.nglGetnTexImageARBBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglGetnTexImageARBBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglReadnPixelsARB(n2, n3, n4, n5, n6, n7, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglReadnPixelsARB(n2, n3, n4, n5, n6, n7, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglReadnPixelsARB(n2, n3, n4, n5, n6, n7, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglReadnPixelsARB(n2, n3, n4, n5, n6, n7, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kM;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglReadnPixelsARB(n2, n3, n4, n5, n6, n7, shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglReadnPixelsARB(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.kM;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBRobustness.nglReadnPixelsARBBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglReadnPixelsARBBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnColorTableARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnColorTableARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnColorTableARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    static native void nglGetnColorTableARB(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void b(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kO;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnConvolutionFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kO;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnConvolutionFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kO;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnConvolutionFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kO;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnConvolutionFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kO;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnConvolutionFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglGetnConvolutionFilterARB(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.kO;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBRobustness.nglGetnConvolutionFilterARBBO(n2, n3, n4, n5, l2, l3);
    }

    static native void nglGetnConvolutionFilterARBBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.b(byteBuffer3);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), byteBuffer2.remaining(), o.a(byteBuffer2), o.a(byteBuffer3), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), byteBuffer2.remaining(), o.a(byteBuffer2), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), byteBuffer2.remaining(), o.a(byteBuffer2), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), byteBuffer2.remaining(), o.a(byteBuffer2), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), byteBuffer2.remaining(), o.a(byteBuffer2), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, FloatBuffer floatBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, FloatBuffer floatBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, FloatBuffer floatBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, IntBuffer intBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), doubleBuffer2.remaining() << 3, o.a(doubleBuffer2), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, DoubleBuffer doubleBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.a(doubleBuffer3);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), doubleBuffer2.remaining() << 3, o.a(doubleBuffer2), o.a(doubleBuffer3), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), doubleBuffer2.remaining() << 3, o.a(doubleBuffer2), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), doubleBuffer2.remaining() << 3, o.a(doubleBuffer2), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), doubleBuffer2.remaining() << 3, o.a(doubleBuffer2), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, IntBuffer intBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ByteBuffer byteBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), floatBuffer2.remaining() << 2, o.a(floatBuffer2), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), floatBuffer2.remaining() << 2, o.a(floatBuffer2), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, FloatBuffer floatBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        org.lwjgl.a.a(floatBuffer3);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), floatBuffer2.remaining() << 2, o.a(floatBuffer2), o.a(floatBuffer3), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), floatBuffer2.remaining() << 2, o.a(floatBuffer2), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), floatBuffer2.remaining() << 2, o.a(floatBuffer2), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, IntBuffer intBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, FloatBuffer floatBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, FloatBuffer floatBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, FloatBuffer floatBuffer, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), intBuffer2.remaining() << 2, o.a(intBuffer2), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), intBuffer2.remaining() << 2, o.a(intBuffer2), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), intBuffer2.remaining() << 2, o.a(intBuffer2), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.b(intBuffer3);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), intBuffer2.remaining() << 2, o.a(intBuffer2), o.a(intBuffer3), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, IntBuffer intBuffer2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), intBuffer2.remaining() << 2, o.a(intBuffer2), o.a(shortBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ShortBuffer shortBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), shortBuffer.remaining() << 1, o.a(shortBuffer), o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(byteBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(byteBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ByteBuffer byteBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), byteBuffer.remaining(), o.a(byteBuffer), o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, DoubleBuffer doubleBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(doubleBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(doubleBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, DoubleBuffer doubleBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(doubleBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), doubleBuffer.remaining() << 3, o.a(doubleBuffer), o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, FloatBuffer floatBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, FloatBuffer floatBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(floatBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(floatBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, FloatBuffer floatBuffer, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, FloatBuffer floatBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(floatBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), floatBuffer.remaining() << 2, o.a(floatBuffer), o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.b(intBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(intBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, IntBuffer intBuffer, ShortBuffer shortBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.b(intBuffer);
        org.lwjgl.a.a(shortBuffer2);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), intBuffer.remaining() << 2, o.a(intBuffer), o.a(shortBuffer2), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), shortBuffer2.remaining() << 1, o.a(shortBuffer2), o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), shortBuffer2.remaining() << 1, o.a(shortBuffer2), o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), shortBuffer2.remaining() << 1, o.a(shortBuffer2), o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), shortBuffer2.remaining() << 1, o.a(shortBuffer2), o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer, ShortBuffer shortBuffer2, ShortBuffer shortBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kP;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        org.lwjgl.a.a(shortBuffer2);
        org.lwjgl.a.a(shortBuffer3);
        ARBRobustness.nglGetnSeparableFilterARB(n2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), shortBuffer2.remaining() << 1, o.a(shortBuffer2), o.a(shortBuffer3), l2);
    }

    static native void nglGetnSeparableFilterARB(int var0, int var1, int var2, int var3, long var4, int var6, long var7, long var9, long var11);

    public static void a(int n2, int n3, int n4, int n5, long l2, int n6, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.kP;
        org.lwjgl.a.a(l5);
        ft.h(dt2);
        ARBRobustness.nglGetnSeparableFilterARBBO(n2, n3, n4, n5, l2, n6, l3, l4, l5);
    }

    static native void nglGetnSeparableFilterARBBO(int var0, int var1, int var2, int var3, long var4, int var6, long var7, long var9, long var11);

    public static void a(int n2, boolean bl2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kQ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnHistogramARB(n2, bl2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kQ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnHistogramARB(n2, bl2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kQ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnHistogramARB(n2, bl2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kQ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnHistogramARB(n2, bl2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kQ;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnHistogramARB(n2, bl2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglGetnHistogramARB(int var0, boolean var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, boolean bl2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.kQ;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBRobustness.nglGetnHistogramARBBO(n2, bl2, n3, n4, n5, l2, l3);
    }

    static native void nglGetnHistogramARBBO(int var0, boolean var1, int var2, int var3, int var4, long var5, long var7);

    public static void b(int n2, boolean bl2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kR;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnMinmaxARB(n2, bl2, n3, n4, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void b(int n2, boolean bl2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kR;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnMinmaxARB(n2, bl2, n3, n4, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    public static void b(int n2, boolean bl2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kR;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnMinmaxARB(n2, bl2, n3, n4, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    public static void b(int n2, boolean bl2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kR;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnMinmaxARB(n2, bl2, n3, n4, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    public static void b(int n2, boolean bl2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kR;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnMinmaxARB(n2, bl2, n3, n4, shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglGetnMinmaxARB(int var0, boolean var1, int var2, int var3, int var4, long var5, long var7);

    public static void b(int n2, boolean bl2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.kR;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBRobustness.nglGetnMinmaxARBBO(n2, bl2, n3, n4, n5, l2, l3);
    }

    static native void nglGetnMinmaxARBBO(int var0, boolean var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kS;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBRobustness.nglGetnCompressedTexImageARB(n2, n3, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kS;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnCompressedTexImageARB(n2, n3, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kS;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.a(shortBuffer);
        ARBRobustness.nglGetnCompressedTexImageARB(n2, n3, shortBuffer.remaining() << 1, o.a(shortBuffer), l2);
    }

    static native void nglGetnCompressedTexImageARB(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.kS;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBRobustness.nglGetnCompressedTexImageARBBO(n2, n3, n4, l2, l3);
    }

    static native void nglGetnCompressedTexImageARBBO(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBRobustness.nglGetnUniformfvARB(n2, n3, floatBuffer.remaining() << 2, o.a(floatBuffer), l2);
    }

    static native void nglGetnUniformfvARB(int var0, int var1, int var2, long var3, long var5);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnUniformivARB(n2, n3, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    static native void nglGetnUniformivARB(int var0, int var1, int var2, long var3, long var5);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBRobustness.nglGetnUniformuivARB(n2, n3, intBuffer.remaining() << 2, o.a(intBuffer), l2);
    }

    static native void nglGetnUniformuivARB(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        ARBRobustness.nglGetnUniformdvARB(n2, n3, doubleBuffer.remaining() << 3, o.a(doubleBuffer), l2);
    }

    static native void nglGetnUniformdvARB(int var0, int var1, int var2, long var3, long var5);
}

