/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVFramebufferMultisampleCoverage {
    public static final int a = 36011;
    public static final int b = 36368;
    public static final int c = 36369;
    public static final int d = 36370;

    private NVFramebufferMultisampleCoverage() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MT;
        org.lwjgl.a.a(l2);
        NVFramebufferMultisampleCoverage.nglRenderbufferStorageMultisampleCoverageNV(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglRenderbufferStorageMultisampleCoverageNV(int var0, int var1, int var2, int var3, int var4, int var5, long var6);
}

