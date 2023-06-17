/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class NVVideoCapture {
    public static final int a = 36896;
    public static final int b = 36897;
    public static final int c = 36898;
    public static final int d = 36899;
    public static final int e = 36900;
    public static final int f = 36901;
    public static final int g = 36903;
    public static final int h = 36904;
    public static final int i = 36920;
    public static final int j = 36921;
    public static final int k = 36922;
    public static final int l = 36923;
    public static final int m = 36902;
    public static final int n = 36905;
    public static final int o = 36906;
    public static final int p = 36907;
    public static final int q = 36908;
    public static final int r = 36909;
    public static final int s = 36924;
    public static final int t = 36910;
    public static final int u = 36911;
    public static final int v = 36912;
    public static final int w = 36913;
    public static final int x = 36914;
    public static final int y = 36915;
    public static final int z = 36916;
    public static final int A = 36917;
    public static final int B = 36918;
    public static final int C = 36919;
    public static final int D = 8399;
    public static final int E = 8398;

    private NVVideoCapture() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sr;
        org.lwjgl.a.a(l2);
        NVVideoCapture.nglBeginVideoCaptureNV(n2, l2);
    }

    static native void nglBeginVideoCaptureNV(int var0, long var1);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ss;
        org.lwjgl.a.a(l3);
        NVVideoCapture.nglBindVideoCaptureStreamBufferNV(n2, n3, n4, l2, l3);
    }

    static native void nglBindVideoCaptureStreamBufferNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.St;
        org.lwjgl.a.a(l2);
        NVVideoCapture.nglBindVideoCaptureStreamTextureNV(n2, n3, n4, n5, n6, l2);
    }

    static native void nglBindVideoCaptureStreamTextureNV(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Su;
        org.lwjgl.a.a(l2);
        NVVideoCapture.nglEndVideoCaptureNV(n2, l2);
    }

    static native void nglEndVideoCaptureNV(int var0, long var1);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        NVVideoCapture.nglGetVideoCaptureivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVideoCaptureivNV(int var0, int var1, long var2, long var4);

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sv;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVVideoCapture.nglGetVideoCaptureivNV(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        NVVideoCapture.nglGetVideoCaptureStreamivNV(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVideoCaptureStreamivNV(int var0, int var1, int var2, long var3, long var5);

    public static int a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sw;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVVideoCapture.nglGetVideoCaptureStreamivNV(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 1);
        NVVideoCapture.nglGetVideoCaptureStreamfvNV(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetVideoCaptureStreamfvNV(int var0, int var1, int var2, long var3, long var5);

    public static float b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sx;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        NVVideoCapture.nglGetVideoCaptureStreamfvNV(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 1);
        NVVideoCapture.nglGetVideoCaptureStreamdvNV(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetVideoCaptureStreamdvNV(int var0, int var1, int var2, long var3, long var5);

    public static double c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sy;
        org.lwjgl.a.a(l2);
        DoubleBuffer doubleBuffer = org.lwjgl.opengl.i.d(dt2);
        NVVideoCapture.nglGetVideoCaptureStreamdvNV(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
        return doubleBuffer.get(0);
    }

    public static int a(int n2, IntBuffer intBuffer, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Sz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        org.lwjgl.a.a(longBuffer, 1);
        int n3 = NVVideoCapture.nglVideoCaptureNV(n2, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(longBuffer), l2);
        return n3;
    }

    static native int nglVideoCaptureNV(int var0, long var1, long var3, long var5);

    public static void b(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.SA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 16);
        NVVideoCapture.nglVideoCaptureStreamParameterivNV(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVideoCaptureStreamParameterivNV(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.SB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        NVVideoCapture.nglVideoCaptureStreamParameterfvNV(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglVideoCaptureStreamParameterfvNV(int var0, int var1, int var2, long var3, long var5);

    public static void b(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.SC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 16);
        NVVideoCapture.nglVideoCaptureStreamParameterdvNV(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglVideoCaptureStreamParameterdvNV(int var0, int var1, int var2, long var3, long var5);
}

