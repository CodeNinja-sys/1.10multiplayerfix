/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.EXTDrawBuffers2;
import org.lwjgl.opengl.GL41;

public final class dd {
    public static final int a = 33371;
    public static final int b = 33372;
    public static final int c = 33373;
    public static final int d = 33374;
    public static final int e = 33375;
    public static final int f = 36429;
    public static final int g = 36430;
    public static final int h = 36431;
    public static final int i = 33376;

    private dd() {
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        GL41.a(n2, floatBuffer);
    }

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        GL41.a(n2, f2, f3, f4, f5);
    }

    public static void b(int n2, FloatBuffer floatBuffer) {
        GL41.b(n2, floatBuffer);
    }

    public static void a(int n2, IntBuffer intBuffer) {
        GL41.a(n2, intBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        GL41.c(n2, n3, n4, n5, n6);
    }

    public static void b(int n2, IntBuffer intBuffer) {
        GL41.b(n2, intBuffer);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        GL41.e(n2, doubleBuffer);
    }

    public static void a(int n2, double d2, double d3) {
        GL41.b(n2, d2, d3);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        GL41.e(n2, n3, floatBuffer);
    }

    public static float a(int n2, int n3) {
        return GL41.d(n2, n3);
    }

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        GL41.f(n2, n3, doubleBuffer);
    }

    public static double b(int n2, int n3) {
        return GL41.e(n2, n3);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        EXTDrawBuffers2.a(n2, n3, intBuffer);
    }

    public static int c(int n2, int n3) {
        return EXTDrawBuffers2.b(n2, n3);
    }

    public static void d(int n2, int n3) {
        EXTDrawBuffers2.c(n2, n3);
    }

    public static void e(int n2, int n3) {
        EXTDrawBuffers2.d(n2, n3);
    }

    public static boolean f(int n2, int n3) {
        return EXTDrawBuffers2.e(n2, n3);
    }
}

