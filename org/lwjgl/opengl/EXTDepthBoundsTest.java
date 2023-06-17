/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTDepthBoundsTest {
    public static final int a = 34960;
    public static final int b = 34961;

    private EXTDepthBoundsTest() {
    }

    public static void a(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ou;
        org.lwjgl.a.a(l2);
        EXTDepthBoundsTest.nglDepthBoundsEXT(d2, d3, l2);
    }

    static native void nglDepthBoundsEXT(double var0, double var2, long var4);
}

