/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTFramebufferMultisample {
    public static final int a = 36011;
    public static final int b = 36182;
    public static final int c = 36183;

    private EXTFramebufferMultisample() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sN;
        org.lwjgl.a.a(l2);
        EXTFramebufferMultisample.nglRenderbufferStorageMultisampleEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglRenderbufferStorageMultisampleEXT(int var0, int var1, int var2, int var3, int var4, long var5);
}

