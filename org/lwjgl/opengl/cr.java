/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.opengl.GL33;

public final class cr {
    public static final int a = 35007;
    public static final int b = 36392;

    private cr() {
    }

    public static void a(int n2, int n3) {
        GL33.f(n2, n3);
    }

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        GL33.a(n2, n3, longBuffer);
    }

    public static long b(int n2, int n3) {
        return GL33.h(n2, n3);
    }

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        GL33.b(n2, n3, longBuffer);
    }

    public static long c(int n2, int n3) {
        return GL33.j(n2, n3);
    }
}

