/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;

public final class AL11 {
    public static final int a = 4132;
    public static final int b = 4133;
    public static final int c = 4134;
    public static final int d = 4136;
    public static final int e = 4137;
    public static final int f = 4144;
    public static final int g = 40964;
    public static final int h = 49155;
    public static final int i = 53251;
    public static final int j = 53252;
    public static final int k = 53253;
    public static final int l = 53254;

    private AL11() {
    }

    static native void initNativeStubs();

    public static void a(int n2, int n3, int n4, int n5) {
        AL11.nalListener3i(n2, n3, n4, n5);
    }

    static native void nalListener3i(int var0, int var1, int var2, int var3);

    public static void a(int n2, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        AL11.nalGetListeneriv(n2, o.a(floatBuffer));
    }

    static native void nalGetListeneriv(int var0, long var1);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        AL11.nalSource3i(n2, n3, n4, n5, n6);
    }

    static native void nalSource3i(int var0, int var1, int var2, int var3, int var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        AL11.nalSourceiv(n2, n3, o.a(intBuffer));
    }

    static native void nalSourceiv(int var0, int var1, long var2);

    public static void a(int n2, int n3, float f2) {
        AL11.nalBufferf(n2, n3, f2);
    }

    static native void nalBufferf(int var0, int var1, float var2);

    public static void a(int n2, int n3, float f2, float f3, float f4) {
        AL11.nalBuffer3f(n2, n3, f2, f3, f4);
    }

    static native void nalBuffer3f(int var0, int var1, float var2, float var3, float var4);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        AL11.nalBufferfv(n2, n3, o.a(floatBuffer));
    }

    static native void nalBufferfv(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        AL11.nalBufferi(n2, n3, n4);
    }

    static native void nalBufferi(int var0, int var1, int var2);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        AL11.nalBuffer3i(n2, n3, n4, n5, n6);
    }

    static native void nalBuffer3i(int var0, int var1, int var2, int var3, int var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        AL11.nalBufferiv(n2, n3, o.a(intBuffer));
    }

    static native void nalBufferiv(int var0, int var1, long var2);

    public static int a(int n2, int n3) {
        int n4 = AL11.nalGetBufferi(n2, n3);
        return n4;
    }

    static native int nalGetBufferi(int var0, int var1);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        AL11.nalGetBufferiv(n2, n3, o.a(intBuffer));
    }

    static native void nalGetBufferiv(int var0, int var1, long var2);

    public static float b(int n2, int n3) {
        float f2 = AL11.nalGetBufferf(n2, n3);
        return f2;
    }

    static native float nalGetBufferf(int var0, int var1);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        AL11.nalGetBufferfv(n2, n3, o.a(floatBuffer));
    }

    static native void nalGetBufferfv(int var0, int var1, long var2);

    public static void a(float f2) {
        AL11.nalSpeedOfSound(f2);
    }

    static native void nalSpeedOfSound(float var0);
}

