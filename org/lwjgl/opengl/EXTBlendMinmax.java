/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTBlendMinmax {
    public static final int a = 32774;
    public static final int b = 32775;
    public static final int c = 32776;
    public static final int d = 32777;

    private EXTBlendMinmax() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.or;
        org.lwjgl.a.a(l2);
        EXTBlendMinmax.nglBlendEquationEXT(n2, l2);
    }

    static native void nglBlendEquationEXT(int var0, long var1);
}

