/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ATISeparateStencil {
    public static final int a = 34816;
    public static final int b = 34817;
    public static final int c = 34818;
    public static final int d = 34819;

    private ATISeparateStencil() {
    }

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nA;
        org.lwjgl.a.a(l2);
        ATISeparateStencil.nglStencilOpSeparateATI(n2, n3, n4, n5, l2);
    }

    static native void nglStencilOpSeparateATI(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nB;
        org.lwjgl.a.a(l2);
        ATISeparateStencil.nglStencilFuncSeparateATI(n2, n3, n4, n5, l2);
    }

    static native void nglStencilFuncSeparateATI(int var0, int var1, int var2, int var3, long var4);
}

