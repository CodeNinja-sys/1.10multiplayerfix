/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTBlendColor {
    public static final int a = 32769;
    public static final int b = 32770;
    public static final int c = 32771;
    public static final int d = 32772;
    public static final int e = 32773;

    private EXTBlendColor() {
    }

    public static void a(float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.oo;
        org.lwjgl.a.a(l2);
        EXTBlendColor.nglBlendColorEXT(f2, f3, f4, f5, l2);
    }

    static native void nglBlendColorEXT(float var0, float var1, float var2, float var3, long var4);
}

