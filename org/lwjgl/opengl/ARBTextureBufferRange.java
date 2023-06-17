/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBTextureBufferRange {
    public static final int a = 37277;
    public static final int b = 37278;
    public static final int c = 37279;

    private ARBTextureBufferRange() {
    }

    public static void a(int n2, int n3, int n4, long l2, long l3) {
        GL43.a(n2, n3, n4, l2, l3);
    }

    public static void a(int n2, int n3, int n4, int n5, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.lV;
        org.lwjgl.a.a(l4);
        ARBTextureBufferRange.nglTextureBufferRangeEXT(n2, n3, n4, n5, l2, l3, l4);
    }

    static native void nglTextureBufferRangeEXT(int var0, int var1, int var2, int var3, long var4, long var6, long var8);
}

