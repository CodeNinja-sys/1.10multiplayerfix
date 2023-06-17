/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTBlendEquationSeparate {
    public static final int a = 32777;
    public static final int b = 34877;

    private EXTBlendEquationSeparate() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.op;
        org.lwjgl.a.a(l2);
        EXTBlendEquationSeparate.nglBlendEquationSeparateEXT(n2, n3, l2);
    }

    static native void nglBlendEquationSeparateEXT(int var0, int var1, long var2);
}

