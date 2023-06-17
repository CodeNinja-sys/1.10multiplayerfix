/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class AMDSparseTexture {
    public static final int a = 1;
    public static final int b = 37269;
    public static final int c = 37270;
    public static final int d = 37271;
    public static final int e = 37272;
    public static final int f = 37273;
    public static final int g = 37274;
    public static final int h = 37275;
    public static final int i = 37276;

    private AMDSparseTexture() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gR;
        org.lwjgl.a.a(l2);
        AMDSparseTexture.nglTexStorageSparseAMD(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    static native void nglTexStorageSparseAMD(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gS;
        org.lwjgl.a.a(l2);
        AMDSparseTexture.nglTextureStorageSparseAMD(n2, n3, n4, n5, n6, n7, n8, n9, l2);
    }

    static native void nglTextureStorageSparseAMD(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8);
}

