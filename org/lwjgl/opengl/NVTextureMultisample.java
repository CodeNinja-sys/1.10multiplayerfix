/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVTextureMultisample {
    public static final int a = 36933;
    public static final int b = 36934;

    private NVTextureMultisample() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qx;
        org.lwjgl.a.a(l2);
        NVTextureMultisample.nglTexImage2DMultisampleCoverageNV(n2, n3, n4, n5, n6, n7, bl2, l2);
    }

    static native void nglTexImage2DMultisampleCoverageNV(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qy;
        org.lwjgl.a.a(l2);
        NVTextureMultisample.nglTexImage3DMultisampleCoverageNV(n2, n3, n4, n5, n6, n7, n8, bl2, l2);
    }

    static native void nglTexImage3DMultisampleCoverageNV(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, long var8);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qz;
        org.lwjgl.a.a(l2);
        NVTextureMultisample.nglTextureImage2DMultisampleNV(n2, n3, n4, n5, n6, n7, bl2, l2);
    }

    static native void nglTextureImage2DMultisampleNV(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6, long var7);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QA;
        org.lwjgl.a.a(l2);
        NVTextureMultisample.nglTextureImage3DMultisampleNV(n2, n3, n4, n5, n6, n7, n8, bl2, l2);
    }

    static native void nglTextureImage3DMultisampleNV(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, long var8);

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QB;
        org.lwjgl.a.a(l2);
        NVTextureMultisample.nglTextureImage2DMultisampleCoverageNV(n2, n3, n4, n5, n6, n7, n8, bl2, l2);
    }

    static native void nglTextureImage2DMultisampleCoverageNV(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.QC;
        org.lwjgl.a.a(l2);
        NVTextureMultisample.nglTextureImage3DMultisampleCoverageNV(n2, n3, n4, n5, n6, n7, n8, n9, bl2, l2);
    }

    static native void nglTextureImage3DMultisampleCoverageNV(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, long var9);
}

