/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL40;

public final class cs {
    public static final int a = 36386;
    public static final int b = 36387;
    public static final int c = 36388;
    public static final int d = 36389;

    private cs() {
    }

    public static void a(int n2, int n3) {
        GL40.e(n2, n3);
    }

    public static void a(IntBuffer intBuffer) {
        GL40.a(intBuffer);
    }

    public static void a(int n2) {
        GL40.a(n2);
    }

    public static void b(IntBuffer intBuffer) {
        GL40.b(intBuffer);
    }

    public static int a() {
        return GL40.a();
    }

    public static boolean b(int n2) {
        return GL40.b(n2);
    }

    public static void b() {
        GL40.b();
    }

    public static void c() {
        GL40.c();
    }

    public static void b(int n2, int n3) {
        GL40.f(n2, n3);
    }
}

