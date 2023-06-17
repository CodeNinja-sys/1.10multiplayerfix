/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class GL33 {
    public static final int a = 35065;
    public static final int b = 35066;
    public static final int c = 35067;
    public static final int d = 35068;
    public static final int e = 35887;
    public static final int f = 35097;
    public static final int g = 36975;
    public static final int h = 36418;
    public static final int i = 36419;
    public static final int j = 36420;
    public static final int k = 36421;
    public static final int l = 36422;
    public static final int m = 35007;
    public static final int n = 36392;
    public static final int o = 35070;
    public static final int p = 36255;

    private GL33() {
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        GL33.nglBindFragDataLocationIndexed(n2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglBindFragDataLocationIndexed(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EY;
        org.lwjgl.a.a(l2);
        GL33.nglBindFragDataLocationIndexed(n2, n3, n4, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
    }

    public static int a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = GL33.nglGetFragDataIndex(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetFragDataIndex(int var0, long var1, long var3);

    public static int a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.EZ;
        org.lwjgl.a.a(l2);
        int n3 = GL33.nglGetFragDataIndex(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fa;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL33.nglGenSamplers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGenSamplers(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fa;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL33.nglGenSamplers(1, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        GL33.nglDeleteSamplers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDeleteSamplers(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fb;
        org.lwjgl.a.a(l2);
        GL33.nglDeleteSamplers(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fc;
        org.lwjgl.a.a(l2);
        boolean bl2 = GL33.nglIsSampler(n2, l2);
        return bl2;
    }

    static native boolean nglIsSampler(int var0, long var1);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fd;
        org.lwjgl.a.a(l2);
        GL33.nglBindSampler(n2, n3, l2);
    }

    static native void nglBindSampler(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fe;
        org.lwjgl.a.a(l2);
        GL33.nglSamplerParameteri(n2, n3, n4, l2);
    }

    static native void nglSamplerParameteri(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ff;
        org.lwjgl.a.a(l2);
        GL33.nglSamplerParameterf(n2, n3, f2, l2);
    }

    static native void nglSamplerParameterf(int var0, int var1, float var2, long var3);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglSamplerParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglSamplerParameteriv(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL33.nglSamplerParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglSamplerParameterfv(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglSamplerParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglSamplerParameterIiv(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglSamplerParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglSamplerParameterIuiv(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglGetSamplerParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetSamplerParameteriv(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fk;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL33.nglGetSamplerParameteriv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        GL33.nglGetSamplerParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetSamplerParameterfv(int var0, int var1, long var2, long var4);

    public static float c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fl;
        org.lwjgl.a.a(l2);
        FloatBuffer floatBuffer = org.lwjgl.opengl.i.c(dt2);
        GL33.nglGetSamplerParameterfv(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
        return floatBuffer.get(0);
    }

    public static void e(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fm;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglGetSamplerParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetSamplerParameterIiv(int var0, int var1, long var2, long var4);

    public static int d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fm;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL33.nglGetSamplerParameterIiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void f(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglGetSamplerParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetSamplerParameterIuiv(int var0, int var1, long var2, long var4);

    public static int e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fn;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        GL33.nglGetSamplerParameterIuiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void f(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fo;
        org.lwjgl.a.a(l2);
        GL33.nglQueryCounter(n2, n3, l2);
    }

    static native void nglQueryCounter(int var0, int var1, long var2);

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        GL33.nglGetQueryObjecti64v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetQueryObjecti64v(int var0, int var1, long var2, long var4);

    public static long g(int n2, int n3) {
        return GL33.h(n2, n3);
    }

    public static long h(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fp;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL33.nglGetQueryObjecti64v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        GL33.nglGetQueryObjectui64v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetQueryObjectui64v(int var0, int var1, long var2, long var4);

    public static long i(int n2, int n3) {
        return GL33.j(n2, n3);
    }

    public static long j(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fq;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        GL33.nglGetQueryObjectui64v(n2, n3, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void k(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fr;
        org.lwjgl.a.a(l2);
        GL33.nglVertexAttribDivisor(n2, n3, l2);
    }

    static native void nglVertexAttribDivisor(int var0, int var1, long var2);

    public static void l(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fs;
        org.lwjgl.a.a(l2);
        GL33.nglVertexP2ui(n2, n3, l2);
    }

    static native void nglVertexP2ui(int var0, int var1, long var2);

    public static void m(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ft;
        org.lwjgl.a.a(l2);
        GL33.nglVertexP3ui(n2, n3, l2);
    }

    static native void nglVertexP3ui(int var0, int var1, long var2);

    public static void n(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fu;
        org.lwjgl.a.a(l2);
        GL33.nglVertexP4ui(n2, n3, l2);
    }

    static native void nglVertexP4ui(int var0, int var1, long var2);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        GL33.nglVertexP2uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexP2uiv(int var0, long var1, long var3);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL33.nglVertexP3uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexP3uiv(int var0, long var1, long var3);

    public static void c(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglVertexP4uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexP4uiv(int var0, long var1, long var3);

    public static void o(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fy;
        org.lwjgl.a.a(l2);
        GL33.nglTexCoordP1ui(n2, n3, l2);
    }

    static native void nglTexCoordP1ui(int var0, int var1, long var2);

    public static void p(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Fz;
        org.lwjgl.a.a(l2);
        GL33.nglTexCoordP2ui(n2, n3, l2);
    }

    static native void nglTexCoordP2ui(int var0, int var1, long var2);

    public static void q(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FA;
        org.lwjgl.a.a(l2);
        GL33.nglTexCoordP3ui(n2, n3, l2);
    }

    static native void nglTexCoordP3ui(int var0, int var1, long var2);

    public static void r(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FB;
        org.lwjgl.a.a(l2);
        GL33.nglTexCoordP4ui(n2, n3, l2);
    }

    static native void nglTexCoordP4ui(int var0, int var1, long var2);

    public static void d(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL33.nglTexCoordP1uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexCoordP1uiv(int var0, long var1, long var3);

    public static void e(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        GL33.nglTexCoordP2uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexCoordP2uiv(int var0, long var1, long var3);

    public static void f(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL33.nglTexCoordP3uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexCoordP3uiv(int var0, long var1, long var3);

    public static void g(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglTexCoordP4uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglTexCoordP4uiv(int var0, long var1, long var3);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FG;
        org.lwjgl.a.a(l2);
        GL33.nglMultiTexCoordP1ui(n2, n3, n4, l2);
    }

    static native void nglMultiTexCoordP1ui(int var0, int var1, int var2, long var3);

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FH;
        org.lwjgl.a.a(l2);
        GL33.nglMultiTexCoordP2ui(n2, n3, n4, l2);
    }

    static native void nglMultiTexCoordP2ui(int var0, int var1, int var2, long var3);

    public static void d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FI;
        org.lwjgl.a.a(l2);
        GL33.nglMultiTexCoordP3ui(n2, n3, n4, l2);
    }

    static native void nglMultiTexCoordP3ui(int var0, int var1, int var2, long var3);

    public static void e(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FJ;
        org.lwjgl.a.a(l2);
        GL33.nglMultiTexCoordP4ui(n2, n3, n4, l2);
    }

    static native void nglMultiTexCoordP4ui(int var0, int var1, int var2, long var3);

    public static void g(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL33.nglMultiTexCoordP1uiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglMultiTexCoordP1uiv(int var0, int var1, long var2, long var4);

    public static void h(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        GL33.nglMultiTexCoordP2uiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglMultiTexCoordP2uiv(int var0, int var1, long var2, long var4);

    public static void i(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL33.nglMultiTexCoordP3uiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglMultiTexCoordP3uiv(int var0, int var1, long var2, long var4);

    public static void j(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglMultiTexCoordP4uiv(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglMultiTexCoordP4uiv(int var0, int var1, long var2, long var4);

    public static void s(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FO;
        org.lwjgl.a.a(l2);
        GL33.nglNormalP3ui(n2, n3, l2);
    }

    static native void nglNormalP3ui(int var0, int var1, long var2);

    public static void h(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL33.nglNormalP3uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglNormalP3uiv(int var0, long var1, long var3);

    public static void t(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FQ;
        org.lwjgl.a.a(l2);
        GL33.nglColorP3ui(n2, n3, l2);
    }

    static native void nglColorP3ui(int var0, int var1, long var2);

    public static void u(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FR;
        org.lwjgl.a.a(l2);
        GL33.nglColorP4ui(n2, n3, l2);
    }

    static native void nglColorP4ui(int var0, int var1, long var2);

    public static void i(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL33.nglColorP3uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglColorP3uiv(int var0, long var1, long var3);

    public static void j(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglColorP4uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglColorP4uiv(int var0, long var1, long var3);

    public static void v(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FU;
        org.lwjgl.a.a(l2);
        GL33.nglSecondaryColorP3ui(n2, n3, l2);
    }

    static native void nglSecondaryColorP3ui(int var0, int var1, long var2);

    public static void k(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL33.nglSecondaryColorP3uiv(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglSecondaryColorP3uiv(int var0, long var1, long var3);

    public static void a(int n2, int n3, boolean bl2, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FW;
        org.lwjgl.a.a(l2);
        GL33.nglVertexAttribP1ui(n2, n3, bl2, n4, l2);
    }

    static native void nglVertexAttribP1ui(int var0, int var1, boolean var2, int var3, long var4);

    public static void b(int n2, int n3, boolean bl2, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FX;
        org.lwjgl.a.a(l2);
        GL33.nglVertexAttribP2ui(n2, n3, bl2, n4, l2);
    }

    static native void nglVertexAttribP2ui(int var0, int var1, boolean var2, int var3, long var4);

    public static void c(int n2, int n3, boolean bl2, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FY;
        org.lwjgl.a.a(l2);
        GL33.nglVertexAttribP3ui(n2, n3, bl2, n4, l2);
    }

    static native void nglVertexAttribP3ui(int var0, int var1, boolean var2, int var3, long var4);

    public static void d(int n2, int n3, boolean bl2, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.FZ;
        org.lwjgl.a.a(l2);
        GL33.nglVertexAttribP4ui(n2, n3, bl2, n4, l2);
    }

    static native void nglVertexAttribP4ui(int var0, int var1, boolean var2, int var3, long var4);

    public static void a(int n2, int n3, boolean bl2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ga;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        GL33.nglVertexAttribP1uiv(n2, n3, bl2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribP1uiv(int var0, int var1, boolean var2, long var3, long var5);

    public static void b(int n2, int n3, boolean bl2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        GL33.nglVertexAttribP2uiv(n2, n3, bl2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribP2uiv(int var0, int var1, boolean var2, long var3, long var5);

    public static void c(int n2, int n3, boolean bl2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gc;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        GL33.nglVertexAttribP3uiv(n2, n3, bl2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribP3uiv(int var0, int var1, boolean var2, long var3, long var5);

    public static void d(int n2, int n3, boolean bl2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Gd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        GL33.nglVertexAttribP4uiv(n2, n3, bl2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribP4uiv(int var0, int var1, boolean var2, long var3, long var5);
}

