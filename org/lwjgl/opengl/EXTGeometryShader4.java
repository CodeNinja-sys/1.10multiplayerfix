/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTGeometryShader4 {
    public static final int a = 36313;
    public static final int b = 36314;
    public static final int c = 36315;
    public static final int d = 36316;
    public static final int e = 35881;
    public static final int f = 36317;
    public static final int g = 36318;
    public static final int h = 35659;
    public static final int i = 36319;
    public static final int j = 36320;
    public static final int k = 36321;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    public static final int o = 13;
    public static final int p = 36264;
    public static final int q = 36265;
    public static final int r = 36263;
    public static final int s = 36052;
    public static final int t = 34370;

    private EXTGeometryShader4() {
    }

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tf;
        org.lwjgl.a.a(l2);
        EXTGeometryShader4.nglProgramParameteriEXT(n2, n3, n4, l2);
    }

    static native void nglProgramParameteriEXT(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tg;
        org.lwjgl.a.a(l2);
        EXTGeometryShader4.nglFramebufferTextureEXT(n2, n3, n4, n5, l2);
    }

    static native void nglFramebufferTextureEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.th;
        org.lwjgl.a.a(l2);
        EXTGeometryShader4.nglFramebufferTextureLayerEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglFramebufferTextureLayerEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ti;
        org.lwjgl.a.a(l2);
        EXTGeometryShader4.nglFramebufferTextureFaceEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglFramebufferTextureFaceEXT(int var0, int var1, int var2, int var3, int var4, long var5);
}

