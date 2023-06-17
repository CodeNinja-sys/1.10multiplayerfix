/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.opengl.GL44;
import org.lwjgl.x;

public final class bc {
    private bc() {
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        GL44.a(n2, n3, n4, intBuffer);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer, x x2, x x3) {
        GL44.a(n2, n3, n4, intBuffer, x2, x3);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        GL44.a(n2, n3, intBuffer);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        GL44.b(n2, n3, intBuffer);
    }

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        GL44.c(n2, n3, intBuffer);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, x x2, IntBuffer intBuffer2) {
        GL44.a(n2, n3, intBuffer, x2, intBuffer2);
    }
}

