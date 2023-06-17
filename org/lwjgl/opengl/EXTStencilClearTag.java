/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTStencilClearTag {
    public static final int a = 35058;
    public static final int b = 35059;

    private EXTStencilClearTag() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.um;
        org.lwjgl.a.a(l2);
        EXTStencilClearTag.nglStencilClearTagEXT(n2, n3, l2);
    }

    static native void nglStencilClearTagEXT(int var0, int var1, long var2);
}

