/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTBlendFuncSeparate {
    public static final int a = 32968;
    public static final int b = 32969;
    public static final int c = 32970;
    public static final int d = 32971;

    private EXTBlendFuncSeparate() {
    }

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oq;
        org.lwjgl.a.a(l2);
        EXTBlendFuncSeparate.nglBlendFuncSeparateEXT(n2, n3, n4, n5, l2);
    }

    static native void nglBlendFuncSeparateEXT(int var0, int var1, int var2, int var3, long var4);
}

