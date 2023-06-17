/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class EXTTextureInteger {
    public static final int a = 36254;
    public static final int b = 36208;
    public static final int c = 36209;
    public static final int d = 36210;
    public static final int e = 36211;
    public static final int f = 36212;
    public static final int g = 36213;
    public static final int h = 36214;
    public static final int i = 36215;
    public static final int j = 36216;
    public static final int k = 36217;
    public static final int l = 36218;
    public static final int m = 36219;
    public static final int n = 36220;
    public static final int o = 36221;
    public static final int p = 36222;
    public static final int q = 36223;
    public static final int r = 36224;
    public static final int s = 36225;
    public static final int t = 36226;
    public static final int u = 36227;
    public static final int v = 36228;
    public static final int w = 36229;
    public static final int x = 36230;
    public static final int y = 36231;
    public static final int z = 36232;
    public static final int A = 36233;
    public static final int B = 36234;
    public static final int C = 36235;
    public static final int D = 36236;
    public static final int E = 36237;
    public static final int F = 36238;
    public static final int G = 36239;
    public static final int H = 36240;
    public static final int I = 36241;
    public static final int J = 36242;
    public static final int K = 36243;
    public static final int L = 36244;
    public static final int M = 36245;
    public static final int N = 36246;
    public static final int O = 36247;
    public static final int P = 36248;
    public static final int Q = 36249;
    public static final int R = 36250;
    public static final int S = 36251;
    public static final int T = 36252;
    public static final int U = 36253;

    private EXTTextureInteger() {
    }

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.up;
        org.lwjgl.a.a(l2);
        EXTTextureInteger.nglClearColorIiEXT(n2, n3, n4, n5, l2);
    }

    static native void nglClearColorIiEXT(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uq;
        org.lwjgl.a.a(l2);
        EXTTextureInteger.nglClearColorIuiEXT(n2, n3, n4, n5, l2);
    }

    static native void nglClearColorIuiEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ur;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTTextureInteger.nglTexParameterIivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexParameterIivEXT(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ur;
        org.lwjgl.a.a(l2);
        EXTTextureInteger.nglTexParameterIivEXT(n2, n3, org.lwjgl.opengl.i.c(dt2, n4), l2);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.us;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTTextureInteger.nglTexParameterIuivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexParameterIuivEXT(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.us;
        org.lwjgl.a.a(l2);
        EXTTextureInteger.nglTexParameterIuivEXT(n2, n3, org.lwjgl.opengl.i.c(dt2, n4), l2);
    }

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ut;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTTextureInteger.nglGetTexParameterIivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTexParameterIivEXT(int var0, int var1, long var2, long var4);

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ut;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        EXTTextureInteger.nglGetTexParameterIivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTTextureInteger.nglGetTexParameterIuivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetTexParameterIuivEXT(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uu;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        EXTTextureInteger.nglGetTexParameterIuivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

