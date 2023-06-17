/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class ARBShaderObjects {
    public static final int a = 35648;
    public static final int b = 35662;
    public static final int c = 35663;
    public static final int d = 35712;
    public static final int e = 35713;
    public static final int f = 35714;
    public static final int g = 35715;
    public static final int h = 35716;
    public static final int i = 35717;
    public static final int j = 35718;
    public static final int k = 35719;
    public static final int l = 35720;
    public static final int m = 35656;
    public static final int n = 35664;
    public static final int o = 35665;
    public static final int p = 35666;
    public static final int q = 35667;
    public static final int r = 35668;
    public static final int s = 35669;
    public static final int t = 35670;
    public static final int u = 35671;
    public static final int v = 35672;
    public static final int w = 35673;
    public static final int x = 35674;
    public static final int y = 35675;
    public static final int z = 35676;
    public static final int A = 35677;
    public static final int B = 35678;
    public static final int C = 35679;
    public static final int D = 35680;
    public static final int E = 35681;
    public static final int F = 35682;
    public static final int G = 35683;
    public static final int H = 35684;

    private ARBShaderObjects() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kY;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglDeleteObjectARB(n2, l2);
    }

    static native void nglDeleteObjectARB(int var0, long var1);

    public static int b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kZ;
        org.lwjgl.a.a(l2);
        int n3 = ARBShaderObjects.nglGetHandleARB(n2, l2);
        return n3;
    }

    static native int nglGetHandleARB(int var0, long var1);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.la;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglDetachObjectARB(n2, n3, l2);
    }

    static native void nglDetachObjectARB(int var0, int var1, long var2);

    public static int c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lb;
        org.lwjgl.a.a(l2);
        int n3 = ARBShaderObjects.nglCreateShaderObjectARB(n2, l2);
        return n3;
    }

    static native int nglCreateShaderObjectARB(int var0, long var1);

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBShaderObjects.nglShaderSourceARB(n2, 1, org.lwjgl.o.a(byteBuffer), byteBuffer.remaining(), l2);
    }

    static native void nglShaderSourceARB(int var0, int var1, long var2, int var4, long var5);

    public static void a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lc;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglShaderSourceARB(n2, 1, org.lwjgl.opengl.i.a(dt2, charSequence), charSequence.length(), l2);
    }

    public static void a(int n2, CharSequence[] arrcharSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(arrcharSequence);
        ARBShaderObjects.nglShaderSourceARB3(n2, arrcharSequence.length, org.lwjgl.opengl.i.a(dt2, arrcharSequence), org.lwjgl.opengl.i.c(dt2, arrcharSequence), l2);
    }

    static native void nglShaderSourceARB3(int var0, int var1, long var2, long var4, long var6);

    public static void d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ld;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglCompileShaderARB(n2, l2);
    }

    static native void nglCompileShaderARB(int var0, long var1);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.le;
        org.lwjgl.a.a(l2);
        int n2 = ARBShaderObjects.nglCreateProgramObjectARB(l2);
        return n2;
    }

    static native int nglCreateProgramObjectARB(long var0);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lf;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglAttachObjectARB(n2, n3, l2);
    }

    static native void nglAttachObjectARB(int var0, int var1, long var2);

    public static void e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lg;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglLinkProgramARB(n2, l2);
    }

    static native void nglLinkProgramARB(int var0, long var1);

    public static void f(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lh;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUseProgramObjectARB(n2, l2);
    }

    static native void nglUseProgramObjectARB(int var0, long var1);

    public static void g(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.li;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglValidateProgramARB(n2, l2);
    }

    static native void nglValidateProgramARB(int var0, long var1);

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lj;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUniform1fARB(n2, f2, l2);
    }

    static native void nglUniform1fARB(int var0, float var1, long var2);

    public static void a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lk;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUniform2fARB(n2, f2, f3, l2);
    }

    static native void nglUniform2fARB(int var0, float var1, float var2, long var3);

    public static void a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ll;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUniform3fARB(n2, f2, f3, f4, l2);
    }

    static native void nglUniform3fARB(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lm;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUniform4fARB(n2, f2, f3, f4, f5, l2);
    }

    static native void nglUniform4fARB(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ln;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUniform1iARB(n2, n3, l2);
    }

    static native void nglUniform1iARB(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lo;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUniform2iARB(n2, n3, n4, l2);
    }

    static native void nglUniform2iARB(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lp;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUniform3iARB(n2, n3, n4, n5, l2);
    }

    static native void nglUniform3iARB(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lq;
        org.lwjgl.a.a(l2);
        ARBShaderObjects.nglUniform4iARB(n2, n3, n4, n5, n6, l2);
    }

    static native void nglUniform4iARB(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglUniform1fvARB(n2, floatBuffer.remaining(), org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniform1fvARB(int var0, int var1, long var2, long var4);

    public static void b(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ls;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglUniform2fvARB(n2, floatBuffer.remaining() >> 1, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniform2fvARB(int var0, int var1, long var2, long var4);

    public static void c(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lt;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglUniform3fvARB(n2, floatBuffer.remaining() / 3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniform3fvARB(int var0, int var1, long var2, long var4);

    public static void d(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglUniform4fvARB(n2, floatBuffer.remaining() >> 2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniform4fvARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBShaderObjects.nglUniform1ivARB(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform1ivARB(int var0, int var1, long var2, long var4);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBShaderObjects.nglUniform2ivARB(n2, intBuffer.remaining() >> 1, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform2ivARB(int var0, int var1, long var2, long var4);

    public static void c(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBShaderObjects.nglUniform3ivARB(n2, intBuffer.remaining() / 3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform3ivARB(int var0, int var1, long var2, long var4);

    public static void d(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ly;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBShaderObjects.nglUniform4ivARB(n2, intBuffer.remaining() >> 2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform4ivARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglUniformMatrix2fvARB(n2, floatBuffer.remaining() >> 2, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix2fvARB(int var0, int var1, boolean var2, long var3, long var5);

    public static void b(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglUniformMatrix3fvARB(n2, floatBuffer.remaining() / 9, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix3fvARB(int var0, int var1, boolean var2, long var3, long var5);

    public static void c(int n2, boolean bl2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglUniformMatrix4fvARB(n2, floatBuffer.remaining() >> 4, bl2, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglUniformMatrix4fvARB(int var0, int var1, boolean var2, long var3, long var5);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglGetObjectParameterfvARB(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetObjectParameterfvARB(int var0, int var1, long var2, long var4);

    public static float d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lC;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        ARBShaderObjects.nglGetObjectParameterfvARB(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBShaderObjects.nglGetObjectParameterivARB(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetObjectParameterivARB(int var0, int var1, long var2, long var4);

    public static int e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lD;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        ARBShaderObjects.nglGetObjectParameterivARB(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lE;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        ARBShaderObjects.nglGetInfoLogARB(n2, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetInfoLogARB(int var0, int var1, long var2, long var4, long var6);

    public static String f(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lE;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n3);
        ARBShaderObjects.nglGetInfoLogARB(n2, n3, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lF;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(intBuffer2);
        ARBShaderObjects.nglGetAttachedObjectsARB(n2, intBuffer2.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), l2);
    }

    static native void nglGetAttachedObjectsARB(int var0, int var1, long var2, long var4, long var6);

    public static int b(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = ARBShaderObjects.nglGetUniformLocationARB(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetUniformLocationARB(int var0, long var1, long var3);

    public static int b(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lG;
        org.lwjgl.a.a(l2);
        int n3 = ARBShaderObjects.nglGetUniformLocationARB(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lH;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.a(intBuffer2, 1);
        org.lwjgl.a.a(intBuffer3, 1);
        org.lwjgl.a.b(byteBuffer);
        ARBShaderObjects.nglGetActiveUniformARB(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(intBuffer3), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveUniformARB(int var0, int var1, int var2, long var3, long var5, long var7, long var9, long var11);

    public static String a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        IntBuffer intBuffer2 = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        ARBShaderObjects.nglGetActiveUniformARB(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer2), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, intBuffer.position() + 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer2.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static String b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lH;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        ARBShaderObjects.nglGetActiveUniformARB(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a((Buffer)org.lwjgl.opengl.i.a(dt2)), org.lwjgl.o.a(org.lwjgl.opengl.i.a(dt2), 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static int g(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lH;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        ARBShaderObjects.nglGetActiveUniformARB(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, 1), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static int h(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lH;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        ARBShaderObjects.nglGetActiveUniformARB(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer, 1), org.lwjgl.o.a(intBuffer), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        ARBShaderObjects.nglGetUniformfvARB(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetUniformfvARB(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBShaderObjects.nglGetUniformivARB(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetUniformivARB(int var0, int var1, long var2, long var4);

    public static void b(int n2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lK;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(byteBuffer);
        ARBShaderObjects.nglGetShaderSourceARB(n2, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetShaderSourceARB(int var0, int var1, long var2, long var4, long var6);

    public static String i(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lK;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n3);
        ARBShaderObjects.nglGetShaderSourceARB(n2, n3, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }
}

