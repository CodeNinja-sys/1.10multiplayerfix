/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVBlendEquationAdvanced {
    public static final int a = 37509;
    public static final int b = 37504;
    public static final int c = 37505;
    public static final int d = 37506;
    public static final int e = 37507;
    public static final int f = 37508;
    public static final int g = 37510;
    public static final int h = 37511;
    public static final int i = 37512;
    public static final int j = 37513;
    public static final int k = 37514;
    public static final int l = 37515;
    public static final int m = 37516;
    public static final int n = 37517;
    public static final int o = 37518;
    public static final int p = 37519;
    public static final int q = 37524;
    public static final int r = 37525;
    public static final int s = 37526;
    public static final int t = 37527;
    public static final int u = 37528;
    public static final int v = 37529;
    public static final int w = 37530;
    public static final int x = 37531;
    public static final int y = 37532;
    public static final int z = 37534;
    public static final int A = 37536;
    public static final int B = 37539;
    public static final int C = 37540;
    public static final int D = 37541;
    public static final int E = 37542;
    public static final int F = 37543;
    public static final int G = 37544;
    public static final int H = 37545;
    public static final int I = 37549;
    public static final int J = 37550;
    public static final int K = 37551;
    public static final int L = 37552;
    public static final int M = 37521;
    public static final int N = 37553;
    public static final int O = 37554;
    public static final int P = 37522;
    public static final int Q = 37535;
    public static final int R = 37555;
    public static final int S = 37537;
    public static final int T = 37556;

    private NVBlendEquationAdvanced() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mn;
        org.lwjgl.a.a(l2);
        NVBlendEquationAdvanced.nglBlendParameteriNV(n2, n3, l2);
    }

    static native void nglBlendParameteriNV(int var0, int var1, long var2);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mo;
        org.lwjgl.a.a(l2);
        NVBlendEquationAdvanced.nglBlendBarrierNV(l2);
    }

    static native void nglBlendBarrierNV(long var0);
}

