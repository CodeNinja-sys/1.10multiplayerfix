/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL30;

public final class bb {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    public static final int e = 16;
    public static final int f = 32;

    private bb() {
    }

    public static ByteBuffer a(int n2, long l2, long l3, int n3, ByteBuffer byteBuffer) {
        return GL30.a(n2, l2, l3, n3, byteBuffer);
    }

    public static void a(int n2, long l2, long l3) {
        GL30.a(n2, l2, l3);
    }
}

