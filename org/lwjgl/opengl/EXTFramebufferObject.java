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

public final class EXTFramebufferObject {
    public static final int a = 36160;
    public static final int b = 36161;
    public static final int c = 36166;
    public static final int d = 36167;
    public static final int e = 36168;
    public static final int f = 36169;
    public static final int g = 36162;
    public static final int h = 36163;
    public static final int i = 36164;
    public static final int j = 36176;
    public static final int k = 36177;
    public static final int l = 36178;
    public static final int m = 36179;
    public static final int n = 36180;
    public static final int o = 36181;
    public static final int p = 36048;
    public static final int q = 36049;
    public static final int r = 36050;
    public static final int s = 36051;
    public static final int t = 36052;
    public static final int u = 36064;
    public static final int v = 36065;
    public static final int w = 36066;
    public static final int x = 36067;
    public static final int y = 36068;
    public static final int z = 36069;
    public static final int A = 36070;
    public static final int B = 36071;
    public static final int C = 36072;
    public static final int D = 36073;
    public static final int E = 36074;
    public static final int F = 36075;
    public static final int G = 36076;
    public static final int H = 36077;
    public static final int I = 36078;
    public static final int J = 36079;
    public static final int K = 36096;
    public static final int L = 36128;
    public static final int M = 36053;
    public static final int N = 36054;
    public static final int O = 36055;
    public static final int P = 36057;
    public static final int Q = 36058;
    public static final int R = 36059;
    public static final int S = 36060;
    public static final int T = 36061;
    public static final int U = 36006;
    public static final int V = 36007;
    public static final int W = 36063;
    public static final int X = 34024;
    public static final int Y = 1286;

    private EXTFramebufferObject() {
    }

    public static boolean a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sO;
        org.lwjgl.a.a(l2);
        boolean bl2 = EXTFramebufferObject.nglIsRenderbufferEXT(n2, l2);
        return bl2;
    }

    static native boolean nglIsRenderbufferEXT(int var0, long var1);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sP;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglBindRenderbufferEXT(n2, n3, l2);
    }

    static native void nglBindRenderbufferEXT(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTFramebufferObject.nglDeleteRenderbuffersEXT(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteRenderbuffersEXT(int var0, long var1, long var3);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sQ;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglDeleteRenderbuffersEXT(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTFramebufferObject.nglGenRenderbuffersEXT(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenRenderbuffersEXT(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.sR;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        EXTFramebufferObject.nglGenRenderbuffersEXT(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sS;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglRenderbufferStorageEXT(n2, n3, n4, n5, l2);
    }

    static native void nglRenderbufferStorageEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTFramebufferObject.nglGetRenderbufferParameterivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetRenderbufferParameterivEXT(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        return EXTFramebufferObject.c(n2, n3);
    }

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sT;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        EXTFramebufferObject.nglGetRenderbufferParameterivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static boolean c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sU;
        org.lwjgl.a.a(l2);
        boolean bl2 = EXTFramebufferObject.nglIsFramebufferEXT(n2, l2);
        return bl2;
    }

    static native boolean nglIsFramebufferEXT(int var0, long var1);

    public static void d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sV;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglBindFramebufferEXT(n2, n3, l2);
    }

    static native void nglBindFramebufferEXT(int var0, int var1, long var2);

    public static void c(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTFramebufferObject.nglDeleteFramebuffersEXT(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteFramebuffersEXT(int var0, long var1, long var3);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sW;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglDeleteFramebuffersEXT(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void d(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTFramebufferObject.nglGenFramebuffersEXT(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenFramebuffersEXT(int var0, long var1, long var3);

    public static int b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.sX;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        EXTFramebufferObject.nglGenFramebuffersEXT(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static int e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sY;
        org.lwjgl.a.a(l2);
        int n3 = EXTFramebufferObject.nglCheckFramebufferStatusEXT(n2, l2);
        return n3;
    }

    static native int nglCheckFramebufferStatusEXT(int var0, long var1);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sZ;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglFramebufferTexture1DEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglFramebufferTexture1DEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ta;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglFramebufferTexture2DEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglFramebufferTexture2DEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tb;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglFramebufferTexture3DEXT(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglFramebufferTexture3DEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tc;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglFramebufferRenderbufferEXT(n2, n3, n4, n5, l2);
    }

    static native void nglFramebufferRenderbufferEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.td;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTFramebufferObject.nglGetFramebufferAttachmentParameterivEXT(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetFramebufferAttachmentParameterivEXT(int var0, int var1, int var2, long var3, long var5);

    public static int a(int n2, int n3, int n4) {
        return EXTFramebufferObject.b(n2, n3, n4);
    }

    public static int b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.td;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        EXTFramebufferObject.nglGetFramebufferAttachmentParameterivEXT(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void f(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.te;
        org.lwjgl.a.a(l2);
        EXTFramebufferObject.nglGenerateMipmapEXT(n2, l2);
    }

    static native void nglGenerateMipmapEXT(int var0, long var1);
}

