/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL41;

public final class as {
    public static final int a = 33367;
    public static final int b = 34625;
    public static final int c = 34814;
    public static final int d = 34815;

    private as() {
    }

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2, ByteBuffer byteBuffer) {
        GL41.a(n2, intBuffer, intBuffer2, byteBuffer);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        GL41.a(n2, n3, byteBuffer);
    }

    public static void a(int n2, int n3, int n4) {
        GL41.a(n2, n3, n4);
    }
}

