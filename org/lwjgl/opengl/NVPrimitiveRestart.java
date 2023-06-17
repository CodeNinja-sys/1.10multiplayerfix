/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVPrimitiveRestart {
    public static final int a = 34136;
    public static final int b = 34137;

    private NVPrimitiveRestart() {
    }

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.PJ;
        org.lwjgl.a.a(l2);
        NVPrimitiveRestart.nglPrimitiveRestartNV(l2);
    }

    static native void nglPrimitiveRestartNV(long var0);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PK;
        org.lwjgl.a.a(l2);
        NVPrimitiveRestart.nglPrimitiveRestartIndexNV(n2, l2);
    }

    static native void nglPrimitiveRestartIndexNV(int var0, long var1);
}

