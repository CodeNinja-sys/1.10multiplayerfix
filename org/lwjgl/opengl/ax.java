/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL42;

public final class ax {
    public static final int a = 37760;

    private ax() {
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        GL42.b(n2, n3, n4, intBuffer);
    }

    public static int a(int n2, int n3, int n4) {
        return GL42.c(n2, n3, n4);
    }
}

