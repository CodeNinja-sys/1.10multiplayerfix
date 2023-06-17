/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTTextureBufferObject {
    public static final int a = 35882;
    public static final int b = 35883;
    public static final int c = 35884;
    public static final int d = 35885;
    public static final int e = 35886;

    private EXTTextureBufferObject() {
    }

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uo;
        org.lwjgl.a.a(l2);
        EXTTextureBufferObject.nglTexBufferEXT(n2, n3, n4, l2);
    }

    static native void nglTexBufferEXT(int var0, int var1, int var2, long var3);
}

