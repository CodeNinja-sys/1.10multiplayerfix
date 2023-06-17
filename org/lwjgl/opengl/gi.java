/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengl.GL45;

public final class gi {
    public static final int a = 33363;
    public static final int b = 33364;
    public static final int c = 33365;
    public static final int d = 37107;
    public static final int e = 33366;
    public static final int f = 33362;
    public static final int g = 33377;
    public static final int h = 1287;

    private gi() {
    }

    public static int a() {
        return GL45.i();
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        GL45.b(n2, n3, n4, n5, n6, n7, byteBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, DoubleBuffer doubleBuffer) {
        GL45.b(n2, n3, n4, n5, n6, n7, doubleBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, FloatBuffer floatBuffer) {
        GL45.b(n2, n3, n4, n5, n6, n7, floatBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, IntBuffer intBuffer) {
        GL45.b(n2, n3, n4, n5, n6, n7, intBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ShortBuffer shortBuffer) {
        GL45.b(n2, n3, n4, n5, n6, n7, shortBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        GL45.a(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        GL45.c(n2, n3, floatBuffer);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        GL45.m(n2, n3, intBuffer);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        GL45.n(n2, n3, intBuffer);
    }
}

