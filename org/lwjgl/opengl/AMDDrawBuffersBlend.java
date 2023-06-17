/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class AMDDrawBuffersBlend {
    private AMDDrawBuffersBlend() {
    }

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gv;
        a.a(l2);
        AMDDrawBuffersBlend.nglBlendFuncIndexedAMD(n2, n3, n4, l2);
    }

    static native void nglBlendFuncIndexedAMD(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gw;
        a.a(l2);
        AMDDrawBuffersBlend.nglBlendFuncSeparateIndexedAMD(n2, n3, n4, n5, n6, l2);
    }

    static native void nglBlendFuncSeparateIndexedAMD(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gx;
        a.a(l2);
        AMDDrawBuffersBlend.nglBlendEquationIndexedAMD(n2, n3, l2);
    }

    static native void nglBlendEquationIndexedAMD(int var0, int var1, long var2);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gy;
        a.a(l2);
        AMDDrawBuffersBlend.nglBlendEquationSeparateIndexedAMD(n2, n3, n4, l2);
    }

    static native void nglBlendEquationSeparateIndexedAMD(int var0, int var1, int var2, long var3);
}

