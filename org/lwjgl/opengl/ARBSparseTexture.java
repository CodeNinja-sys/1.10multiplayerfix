/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBSparseTexture {
    public static final int a = 37286;
    public static final int b = 37287;
    public static final int c = 37290;
    public static final int d = 37288;
    public static final int e = 37269;
    public static final int f = 37270;
    public static final int g = 37271;
    public static final int h = 37272;
    public static final int i = 37273;
    public static final int j = 37274;
    public static final int k = 37289;

    private ARBSparseTexture() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lS;
        org.lwjgl.a.a(l2);
        ARBSparseTexture.nglTexPageCommitmentARB(n2, n3, n4, n5, n6, n7, n8, n9, bl2, l2);
    }

    static native void nglTexPageCommitmentARB(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lT;
        org.lwjgl.a.a(l2);
        ARBSparseTexture.nglTexturePageCommitmentEXT(n2, n3, n4, n5, n6, n7, n8, n9, n10, bl2, l2);
    }

    static native void nglTexturePageCommitmentEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, long var10);
}

