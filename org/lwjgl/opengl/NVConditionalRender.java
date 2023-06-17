/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVConditionalRender {
    public static final int a = 36371;
    public static final int b = 36372;
    public static final int c = 36373;
    public static final int d = 36374;

    private NVConditionalRender() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mp;
        org.lwjgl.a.a(l2);
        NVConditionalRender.nglBeginConditionalRenderNV(n2, n3, l2);
    }

    static native void nglBeginConditionalRenderNV(int var0, int var1, long var2);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mq;
        org.lwjgl.a.a(l2);
        NVConditionalRender.nglEndConditionalRenderNV(l2);
    }

    static native void nglEndConditionalRenderNV(long var0);
}

