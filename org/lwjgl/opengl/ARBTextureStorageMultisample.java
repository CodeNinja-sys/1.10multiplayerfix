/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBTextureStorageMultisample {
    private ARBTextureStorageMultisample() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        GL43.a(n2, n3, n4, n5, n6, bl2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        GL43.a(n2, n3, n4, n5, n6, n7, bl2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mg;
        a.a(l2);
        ARBTextureStorageMultisample.nglTextureStorage2DMultisampleEXT(n2, n3, n4, n5, n6, n7, bl2, l2);
    }

    static native void nglTextureStorage2DMultisampleEXT(int var0, int var1, int var2, int var3, int var4, int var5, boolean var6, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, boolean bl2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mh;
        a.a(l2);
        ARBTextureStorageMultisample.nglTextureStorage3DMultisampleEXT(n2, n3, n4, n5, n6, n7, n8, bl2, l2);
    }

    static native void nglTextureStorage3DMultisampleEXT(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, long var8);
}

