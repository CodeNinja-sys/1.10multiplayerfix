/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.i;
import org.lwjgl.opengl.is;

public final class EXTGpuShader4 {
    public static final int a = 35069;
    public static final int b = 36288;
    public static final int c = 36289;
    public static final int d = 36290;
    public static final int e = 36291;
    public static final int f = 36292;
    public static final int g = 36293;
    public static final int h = 36294;
    public static final int i = 36295;
    public static final int j = 36296;
    public static final int k = 36297;
    public static final int l = 36298;
    public static final int m = 36299;
    public static final int n = 36300;
    public static final int o = 36301;
    public static final int p = 36302;
    public static final int q = 36303;
    public static final int r = 36304;
    public static final int s = 36305;
    public static final int t = 36306;
    public static final int u = 36307;
    public static final int v = 36308;
    public static final int w = 36309;
    public static final int x = 36310;
    public static final int y = 36311;
    public static final int z = 36312;
    public static final int A = 35076;
    public static final int B = 35077;

    private EXTGpuShader4() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tl;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglVertexAttribI1iEXT(n2, n3, l2);
    }

    static native void nglVertexAttribI1iEXT(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tm;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglVertexAttribI2iEXT(n2, n3, n4, l2);
    }

    static native void nglVertexAttribI2iEXT(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tn;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglVertexAttribI3iEXT(n2, n3, n4, n5, l2);
    }

    static native void nglVertexAttribI3iEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.to;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglVertexAttribI4iEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglVertexAttribI4iEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tp;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglVertexAttribI1uiEXT(n2, n3, l2);
    }

    static native void nglVertexAttribI1uiEXT(int var0, int var1, long var2);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tq;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglVertexAttribI2uiEXT(n2, n3, n4, l2);
    }

    static native void nglVertexAttribI2uiEXT(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tr;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglVertexAttribI3uiEXT(n2, n3, n4, n5, l2);
    }

    static native void nglVertexAttribI3uiEXT(int var0, int var1, int var2, int var3, long var4);

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ts;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglVertexAttribI4uiEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglVertexAttribI4uiEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tt;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        EXTGpuShader4.nglVertexAttribI1ivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI1ivEXT(int var0, long var1, long var3);

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tu;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        EXTGpuShader4.nglVertexAttribI2ivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI2ivEXT(int var0, long var1, long var3);

    public static void c(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        EXTGpuShader4.nglVertexAttribI3ivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI3ivEXT(int var0, long var1, long var3);

    public static void d(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tw;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTGpuShader4.nglVertexAttribI4ivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI4ivEXT(int var0, long var1, long var3);

    public static void e(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tx;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        EXTGpuShader4.nglVertexAttribI1uivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI1uivEXT(int var0, long var1, long var3);

    public static void f(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ty;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        EXTGpuShader4.nglVertexAttribI2uivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI2uivEXT(int var0, long var1, long var3);

    public static void g(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 3);
        EXTGpuShader4.nglVertexAttribI3uivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI3uivEXT(int var0, long var1, long var3);

    public static void h(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTGpuShader4.nglVertexAttribI4uivEXT(n2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglVertexAttribI4uivEXT(int var0, long var1, long var3);

    public static void a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTGpuShader4.nglVertexAttribI4bvEXT(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglVertexAttribI4bvEXT(int var0, long var1, long var3);

    public static void a(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, 4);
        EXTGpuShader4.nglVertexAttribI4svEXT(n2, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribI4svEXT(int var0, long var1, long var3);

    public static void b(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 4);
        EXTGpuShader4.nglVertexAttribI4ubvEXT(n2, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglVertexAttribI4ubvEXT(int var0, long var1, long var3);

    public static void b(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, 4);
        EXTGpuShader4.nglVertexAttribI4usvEXT(n2, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribI4usvEXT(int var0, long var1, long var3);

    public static void a(int n2, int n3, int n4, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tF;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = byteBuffer;
        }
        EXTGpuShader4.nglVertexAttribIPointerEXT(n2, n3, n4, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tF;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = intBuffer;
        }
        EXTGpuShader4.nglVertexAttribIPointerEXT(n2, n3, n4, n5, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tF;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = shortBuffer;
        }
        EXTGpuShader4.nglVertexAttribIPointerEXT(n2, n3, n4, n5, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribIPointerEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.tF;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        EXTGpuShader4.nglVertexAttribIPointerEXTBO(n2, n3, n4, n5, l2, l3);
    }

    static native void nglVertexAttribIPointerEXTBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTGpuShader4.nglGetVertexAttribIivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexAttribIivEXT(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTGpuShader4.nglGetVertexAttribIuivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexAttribIuivEXT(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tI;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglUniform1uiEXT(n2, n3, l2);
    }

    static native void nglUniform1uiEXT(int var0, int var1, long var2);

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tJ;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglUniform2uiEXT(n2, n3, n4, l2);
    }

    static native void nglUniform2uiEXT(int var0, int var1, int var2, long var3);

    public static void c(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tK;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglUniform3uiEXT(n2, n3, n4, n5, l2);
    }

    static native void nglUniform3uiEXT(int var0, int var1, int var2, int var3, long var4);

    public static void c(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tL;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglUniform4uiEXT(n2, n3, n4, n5, n6, l2);
    }

    static native void nglUniform4uiEXT(int var0, int var1, int var2, int var3, int var4, long var5);

    public static void i(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTGpuShader4.nglUniform1uivEXT(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform1uivEXT(int var0, int var1, long var2, long var4);

    public static void j(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTGpuShader4.nglUniform2uivEXT(n2, intBuffer.remaining() >> 1, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform2uivEXT(int var0, int var1, long var2, long var4);

    public static void k(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTGpuShader4.nglUniform3uivEXT(n2, intBuffer.remaining() / 3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform3uivEXT(int var0, int var1, long var2, long var4);

    public static void l(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTGpuShader4.nglUniform4uivEXT(n2, intBuffer.remaining() >> 2, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglUniform4uivEXT(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTGpuShader4.nglGetUniformuivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetUniformuivEXT(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        EXTGpuShader4.nglBindFragDataLocationEXT(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglBindFragDataLocationEXT(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tR;
        org.lwjgl.a.a(l2);
        EXTGpuShader4.nglBindFragDataLocationEXT(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
    }

    public static int c(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = EXTGpuShader4.nglGetFragDataLocationEXT(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetFragDataLocationEXT(int var0, long var1, long var3);

    public static int a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tS;
        org.lwjgl.a.a(l2);
        int n3 = EXTGpuShader4.nglGetFragDataLocationEXT(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }
}

