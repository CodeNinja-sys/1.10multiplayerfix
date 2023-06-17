/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL30;

public final class cy {
    public static final int a = 34229;

    private cy() {
    }

    public static void a(int n2) {
        GL30.h(n2);
    }

    public static void a(IntBuffer intBuffer) {
        GL30.e(intBuffer);
    }

    public static void b(int n2) {
        GL30.i(n2);
    }

    public static void b(IntBuffer intBuffer) {
        GL30.f(intBuffer);
    }

    public static int a() {
        return GL30.e();
    }

    public static boolean c(int n2) {
        return GL30.j(n2);
    }
}

