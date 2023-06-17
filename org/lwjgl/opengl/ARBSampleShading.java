/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBSampleShading {
    public static final int a = 35894;
    public static final int b = 35895;

    private ARBSampleShading() {
    }

    public static void a(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kX;
        org.lwjgl.a.a(l2);
        ARBSampleShading.nglMinSampleShadingARB(f2, l2);
    }

    static native void nglMinSampleShadingARB(float var0, long var1);
}

