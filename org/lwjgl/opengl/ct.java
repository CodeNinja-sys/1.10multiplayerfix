/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL40;

public final class ct {
    public static final int a = 36464;
    public static final int b = 36465;

    private ct() {
    }

    public static void a(int n2, int n3, int n4) {
        GL40.e(n2, n3, n4);
    }

    public static void b(int n2, int n3, int n4) {
        GL40.f(n2, n3, n4);
    }

    public static void a(int n2, int n3) {
        GL40.g(n2, n3);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        GL40.b(n2, n3, n4, intBuffer);
    }

    public static int c(int n2, int n3, int n4) {
        return GL40.h(n2, n3, n4);
    }
}

