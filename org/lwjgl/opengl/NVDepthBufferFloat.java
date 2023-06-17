/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVDepthBufferFloat {
    public static final int a = 36267;
    public static final int b = 36268;
    public static final int c = 36269;
    public static final int d = 36271;

    private NVDepthBufferFloat() {
    }

    public static void a(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ms;
        org.lwjgl.a.a(l2);
        NVDepthBufferFloat.nglDepthRangedNV(d2, d3, l2);
    }

    static native void nglDepthRangedNV(double var0, double var2, long var4);

    public static void a(double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mt;
        org.lwjgl.a.a(l2);
        NVDepthBufferFloat.nglClearDepthdNV(d2, l2);
    }

    static native void nglClearDepthdNV(double var0, long var2);

    public static void b(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mu;
        org.lwjgl.a.a(l2);
        NVDepthBufferFloat.nglDepthBoundsdNV(d2, d3, l2);
    }

    static native void nglDepthBoundsdNV(double var0, double var2, long var4);
}

