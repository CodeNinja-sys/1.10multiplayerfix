/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL33;

public final class r {
    public static final int a = 35065;
    public static final int b = 34185;
    public static final int c = 35066;
    public static final int d = 35067;
    public static final int e = 35068;

    private r() {
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        GL33.a(n2, n3, n4, byteBuffer);
    }

    public static void a(int n2, int n3, int n4, CharSequence charSequence) {
        GL33.a(n2, n3, n4, charSequence);
    }

    public static int a(int n2, ByteBuffer byteBuffer) {
        return GL33.a(n2, byteBuffer);
    }

    public static int a(int n2, CharSequence charSequence) {
        return GL33.a(n2, charSequence);
    }
}

