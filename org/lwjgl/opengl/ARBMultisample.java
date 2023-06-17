/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBMultisample {
    public static final int a = 32925;
    public static final int b = 32926;
    public static final int c = 32927;
    public static final int d = 32928;
    public static final int e = 32936;
    public static final int f = 32937;
    public static final int g = 32938;
    public static final int h = 32939;
    public static final int i = 0x20000000;

    private ARBMultisample() {
    }

    public static void a(float f2, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jH;
        org.lwjgl.a.a(l2);
        ARBMultisample.nglSampleCoverageARB(f2, bl2, l2);
    }

    static native void nglSampleCoverageARB(float var0, boolean var1, long var2);
}

