/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public class ARBProgram {
    public static final int p = 34933;
    public static final int q = 34343;
    public static final int r = 34934;
    public static final int s = 34423;
    public static final int t = 34976;
    public static final int u = 34977;
    public static final int v = 34978;
    public static final int w = 34979;
    public static final int x = 34980;
    public static final int y = 34981;
    public static final int z = 34982;
    public static final int A = 34983;
    public static final int B = 34984;
    public static final int C = 34985;
    public static final int D = 34986;
    public static final int E = 34987;
    public static final int F = 34988;
    public static final int G = 34989;
    public static final int H = 34990;
    public static final int I = 34991;
    public static final int J = 34996;
    public static final int K = 34997;
    public static final int L = 34998;
    public static final int M = 34344;
    public static final int N = 34379;
    public static final int O = 34369;
    public static final int P = 34999;
    public static final int Q = 34368;
    public static final int R = 34351;
    public static final int S = 34350;
    public static final int T = 34932;
    public static final int U = 35008;
    public static final int V = 35009;
    public static final int W = 35010;
    public static final int X = 35011;
    public static final int Y = 35012;
    public static final int Z = 35013;
    public static final int aa = 35014;
    public static final int ab = 35015;
    public static final int ac = 35016;
    public static final int ad = 35017;
    public static final int ae = 35018;
    public static final int af = 35019;
    public static final int ag = 35020;
    public static final int ah = 35021;
    public static final int ai = 35022;
    public static final int aj = 35023;
    public static final int ak = 35024;
    public static final int al = 35025;
    public static final int am = 35026;
    public static final int an = 35027;
    public static final int ao = 35028;
    public static final int ap = 35029;
    public static final int aq = 35030;
    public static final int ar = 35031;
    public static final int as = 35032;
    public static final int at = 35033;
    public static final int au = 35034;
    public static final int av = 35035;
    public static final int aw = 35036;
    public static final int ax = 35037;
    public static final int ay = 35038;
    public static final int az = 35039;

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kk;
        a.a(l2);
        a.b(byteBuffer);
        ARBProgram.nglProgramStringARB(n2, n3, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglProgramStringARB(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kk;
        a.a(l2);
        ARBProgram.nglProgramStringARB(n2, n3, charSequence.length(), i.a(dt2, charSequence), l2);
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kl;
        a.a(l2);
        ARBProgram.nglBindProgramARB(n2, n3, l2);
    }

    static native void nglBindProgramARB(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.km;
        a.a(l2);
        a.b(intBuffer);
        ARBProgram.nglDeleteProgramsARB(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteProgramsARB(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.km;
        a.a(l2);
        ARBProgram.nglDeleteProgramsARB(1, i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kn;
        a.a(l2);
        a.b(intBuffer);
        ARBProgram.nglGenProgramsARB(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenProgramsARB(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.kn;
        a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        ARBProgram.nglGenProgramsARB(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ko;
        a.a(l2);
        ARBProgram.nglProgramEnvParameter4fARB(n2, n3, f2, f3, f4, f5, l2);
    }

    static native void nglProgramEnvParameter4fARB(int var0, int var1, float var2, float var3, float var4, float var5, long var6);

    public static void a(int n2, int n3, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kp;
        a.a(l2);
        ARBProgram.nglProgramEnvParameter4dARB(n2, n3, d2, d3, d4, d5, l2);
    }

    static native void nglProgramEnvParameter4dARB(int var0, int var1, double var2, double var4, double var6, double var8, long var10);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kq;
        a.a(l2);
        a.a(floatBuffer, 4);
        ARBProgram.nglProgramEnvParameter4fvARB(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglProgramEnvParameter4fvARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kr;
        a.a(l2);
        a.a(doubleBuffer, 4);
        ARBProgram.nglProgramEnvParameter4dvARB(n2, n3, o.a(doubleBuffer), l2);
    }

    static native void nglProgramEnvParameter4dvARB(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ks;
        a.a(l2);
        ARBProgram.nglProgramLocalParameter4fARB(n2, n3, f2, f3, f4, f5, l2);
    }

    static native void nglProgramLocalParameter4fARB(int var0, int var1, float var2, float var3, float var4, float var5, long var6);

    public static void b(int n2, int n3, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kt;
        a.a(l2);
        ARBProgram.nglProgramLocalParameter4dARB(n2, n3, d2, d3, d4, d5, l2);
    }

    static native void nglProgramLocalParameter4dARB(int var0, int var1, double var2, double var4, double var6, double var8, long var10);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ku;
        a.a(l2);
        a.a(floatBuffer, 4);
        ARBProgram.nglProgramLocalParameter4fvARB(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglProgramLocalParameter4fvARB(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kv;
        a.a(l2);
        a.a(doubleBuffer, 4);
        ARBProgram.nglProgramLocalParameter4dvARB(n2, n3, o.a(doubleBuffer), l2);
    }

    static native void nglProgramLocalParameter4dvARB(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kw;
        a.a(l2);
        a.a(floatBuffer, 4);
        ARBProgram.nglGetProgramEnvParameterfvARB(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetProgramEnvParameterfvARB(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kx;
        a.a(l2);
        a.a(doubleBuffer, 4);
        ARBProgram.nglGetProgramEnvParameterdvARB(n2, n3, o.a(doubleBuffer), l2);
    }

    static native void nglGetProgramEnvParameterdvARB(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ky;
        a.a(l2);
        a.a(floatBuffer, 4);
        ARBProgram.nglGetProgramLocalParameterfvARB(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetProgramLocalParameterfvARB(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kz;
        a.a(l2);
        a.a(doubleBuffer, 4);
        ARBProgram.nglGetProgramLocalParameterdvARB(n2, n3, o.a(doubleBuffer), l2);
    }

    static native void nglGetProgramLocalParameterdvARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kA;
        a.a(l2);
        a.a(intBuffer, 4);
        ARBProgram.nglGetProgramivARB(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetProgramivARB(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        return ARBProgram.c(n2, n3);
    }

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kA;
        a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        ARBProgram.nglGetProgramivARB(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kB;
        a.a(l2);
        a.b(byteBuffer);
        ARBProgram.nglGetProgramStringARB(n2, n3, o.a(byteBuffer), l2);
    }

    static native void nglGetProgramStringARB(int var0, int var1, long var2, long var4);

    public static String d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kB;
        a.a(l2);
        int n4 = ARBProgram.c(n2, 34343);
        ByteBuffer byteBuffer = i.a(dt2, n4);
        ARBProgram.nglGetProgramStringARB(n2, n3, o.a(byteBuffer), l2);
        byteBuffer.limit(n4);
        return i.a(dt2, byteBuffer);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kC;
        a.a(l2);
        boolean bl2 = ARBProgram.nglIsProgramARB(n2, l2);
        return bl2;
    }

    static native boolean nglIsProgramARB(int var0, long var1);
}

