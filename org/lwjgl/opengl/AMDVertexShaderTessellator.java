/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class AMDVertexShaderTessellator {
    public static final int a = 36865;
    public static final int b = 36866;
    public static final int c = 36867;
    public static final int d = 36870;
    public static final int e = 36871;
    public static final int f = 36868;
    public static final int g = 36869;

    private AMDVertexShaderTessellator() {
    }

    public static void a(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gU;
        org.lwjgl.a.a(l2);
        AMDVertexShaderTessellator.nglTessellationFactorAMD(f2, l2);
    }

    static native void nglTessellationFactorAMD(float var0, long var1);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gV;
        org.lwjgl.a.a(l2);
        AMDVertexShaderTessellator.nglTessellationModeAMD(n2, l2);
    }

    static native void nglTessellationModeAMD(int var0, long var1);
}

