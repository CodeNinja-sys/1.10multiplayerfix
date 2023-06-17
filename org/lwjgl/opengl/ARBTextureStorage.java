/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GL42;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBTextureStorage {
    public static final int a = 37167;

    private ARBTextureStorage() {
    }

    public static void a(int n2, int n3, int n4, int n5) {
        GL42.a(n2, n3, n4, n5);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        GL42.a(n2, n3, n4, n5, n6);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        GL42.a(n2, n3, n4, n5, n6, n7);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.md;
        org.lwjgl.a.a(l2);
        ARBTextureStorage.nglTextureStorage1DEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglTextureStorage1DEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.me;
        org.lwjgl.a.a(l2);
        ARBTextureStorage.nglTextureStorage2DEXT(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglTextureStorage2DEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mf;
        org.lwjgl.a.a(l2);
        ARBTextureStorage.nglTextureStorage3DEXT(n2, n3, n4, n5, n6, n7, n8, l2);
    }

    static native void nglTextureStorage3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7);
}

