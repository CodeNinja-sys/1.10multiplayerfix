/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVDrawTexture {
    private NVDrawTexture() {
    }

    public static void a(int n2, int n3, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mv;
        a.a(l2);
        NVDrawTexture.nglDrawTextureNV(n2, n3, f2, f3, f4, f5, f6, f7, f8, f9, f10, l2);
    }

    static native void nglDrawTextureNV(int var0, int var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, long var11);
}

