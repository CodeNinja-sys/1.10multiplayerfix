/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTShaderImageLoadStore {
    public static final int a = 36664;
    public static final int b = 36665;
    public static final int c = 36973;
    public static final int d = 36666;
    public static final int e = 36667;
    public static final int f = 36668;
    public static final int g = 36669;
    public static final int h = 36670;
    public static final int i = 36974;
    public static final int j = 1;
    public static final int k = 2;
    public static final int l = 4;
    public static final int m = 8;
    public static final int n = 32;
    public static final int o = 64;
    public static final int p = 128;
    public static final int q = 256;
    public static final int r = 512;
    public static final int s = 1024;
    public static final int t = 2048;
    public static final int u = 4096;
    public static final int v = -1;
    public static final int w = 36940;
    public static final int x = 36941;
    public static final int y = 36942;
    public static final int z = 36943;
    public static final int A = 36944;
    public static final int B = 36945;
    public static final int C = 36946;
    public static final int D = 36947;
    public static final int E = 36948;
    public static final int F = 36949;
    public static final int G = 36950;
    public static final int H = 36951;
    public static final int I = 36952;
    public static final int J = 36953;
    public static final int K = 36954;
    public static final int L = 36955;
    public static final int M = 36956;
    public static final int N = 36957;
    public static final int O = 36958;
    public static final int P = 36959;
    public static final int Q = 36960;
    public static final int R = 36961;
    public static final int S = 36962;
    public static final int T = 36963;
    public static final int U = 36964;
    public static final int V = 36965;
    public static final int W = 36966;
    public static final int X = 36967;
    public static final int Y = 36968;
    public static final int Z = 36969;
    public static final int aa = 36970;
    public static final int ab = 36971;
    public static final int ac = 36972;

    private EXTShaderImageLoadStore() {
    }

    public static void a(int n2, int n3, int n4, boolean bl2, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uk;
        org.lwjgl.a.a(l2);
        EXTShaderImageLoadStore.nglBindImageTextureEXT(n2, n3, n4, bl2, n5, n6, n7, l2);
    }

    static native void nglBindImageTextureEXT(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6, long var7);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ul;
        org.lwjgl.a.a(l2);
        EXTShaderImageLoadStore.nglMemoryBarrierEXT(n2, l2);
    }

    static native void nglMemoryBarrierEXT(int var0, long var1);
}

