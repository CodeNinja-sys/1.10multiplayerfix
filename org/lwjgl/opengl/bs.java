/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL40;

public final class bs {
    public static final int a = 36325;
    public static final int b = 36326;
    public static final int c = 36423;
    public static final int d = 36424;
    public static final int e = 36425;
    public static final int f = 36327;
    public static final int g = 36328;
    public static final int h = 36426;
    public static final int i = 36427;

    private bs() {
    }

    public static int a(int n2, int n3, ByteBuffer byteBuffer) {
        return GL40.b(n2, n3, byteBuffer);
    }

    public static int a(int n2, int n3, CharSequence charSequence) {
        return GL40.a(n2, n3, charSequence);
    }

    public static int b(int n2, int n3, ByteBuffer byteBuffer) {
        return GL40.c(n2, n3, byteBuffer);
    }

    public static int b(int n2, int n3, CharSequence charSequence) {
        return GL40.b(n2, n3, charSequence);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        GL40.a(n2, n3, n4, n5, intBuffer);
    }

    public static int a(int n2, int n3, int n4, int n5) {
        return GL40.b(n2, n3, n4, n5);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        GL40.a(n2, n3, n4, intBuffer, byteBuffer);
    }

    public static String b(int n2, int n3, int n4, int n5) {
        return GL40.c(n2, n3, n4, n5);
    }

    public static void b(int n2, int n3, int n4, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        GL40.b(n2, n3, n4, intBuffer, byteBuffer);
    }

    public static String c(int n2, int n3, int n4, int n5) {
        return GL40.d(n2, n3, n4, n5);
    }

    public static void a(int n2, IntBuffer intBuffer) {
        GL40.b(n2, intBuffer);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        GL40.b(n2, n3, intBuffer);
    }

    public static int a(int n2, int n3) {
        return GL40.c(n2, n3);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        GL40.a(n2, n3, n4, intBuffer);
    }

    public static int a(int n2, int n3, int n4) {
        return GL40.d(n2, n3, n4);
    }
}

