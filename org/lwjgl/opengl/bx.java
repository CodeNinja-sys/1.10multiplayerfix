/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.fx;

public final class bx {
    public static final int a = 37137;
    public static final int b = 37138;
    public static final int c = 37139;
    public static final int d = 37140;
    public static final int e = 37141;
    public static final int f = 37142;
    public static final int g = 37143;
    public static final int h = 37144;
    public static final int i = 37145;
    public static final int j = 1;
    public static final long k = -1L;
    public static final int l = 37146;
    public static final int m = 37147;
    public static final int n = 37148;
    public static final int o = 37149;

    private bx() {
    }

    public static fx a(int n2, int n3) {
        return GL32.d(n2, n3);
    }

    public static boolean a(fx fx2) {
        return GL32.a(fx2);
    }

    public static void b(fx fx2) {
        GL32.b(fx2);
    }

    public static int a(fx fx2, int n2, long l2) {
        return GL32.a(fx2, n2, l2);
    }

    public static void b(fx fx2, int n2, long l2) {
        GL32.b(fx2, n2, l2);
    }

    public static void a(int n2, LongBuffer longBuffer) {
        GL32.a(n2, longBuffer);
    }

    public static long a(int n2) {
        return GL32.b(n2);
    }

    public static void a(fx fx2, int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        GL32.a(fx2, n2, intBuffer, intBuffer2);
    }

    public static int a(fx fx2, int n2) {
        return GL32.b(fx2, n2);
    }

    public static int b(fx fx2, int n2) {
        return GL32.b(fx2, n2);
    }
}

