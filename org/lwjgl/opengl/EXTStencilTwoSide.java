/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTStencilTwoSide {
    public static final int a = 35088;
    public static final int b = 35089;

    private EXTStencilTwoSide() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.un;
        org.lwjgl.a.a(l2);
        EXTStencilTwoSide.nglActiveStencilFaceEXT(n2, l2);
    }

    static native void nglActiveStencilFaceEXT(int var0, long var1);
}

