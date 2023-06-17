/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTFramebufferBlit {
    public static final int a = 36008;
    public static final int b = 36009;
    public static final int c = 36006;
    public static final int d = 36010;

    private EXTFramebufferBlit() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sM;
        org.lwjgl.a.a(l2);
        EXTFramebufferBlit.nglBlitFramebufferEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2);
    }

    static native void nglBlitFramebufferEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10);
}

