/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
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

public final class ARBVertexShader {
    public static final int a = 35633;
    public static final int b = 35658;
    public static final int c = 35659;
    public static final int d = 34921;
    public static final int e = 34930;
    public static final int f = 35660;
    public static final int g = 35661;
    public static final int h = 34929;
    public static final int i = 34370;
    public static final int j = 34371;
    public static final int k = 35721;
    public static final int l = 35722;
    public static final int m = 34338;
    public static final int n = 34339;
    public static final int o = 34340;
    public static final int p = 34341;
    public static final int q = 34922;
    public static final int r = 34342;
    public static final int s = 34373;
    public static final int t = 35664;
    public static final int u = 35665;
    public static final int v = 35666;
    public static final int w = 35674;
    public static final int x = 35675;
    public static final int y = 35676;

    private ARBVertexShader() {
    }

    public static void a(int n2, short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mv;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib1sARB(n2, s2, l2);
    }

    static native void nglVertexAttrib1sARB(int var0, short var1, long var2);

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mw;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib1fARB(n2, f2, l2);
    }

    static native void nglVertexAttrib1fARB(int var0, float var1, long var2);

    public static void a(int n2, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mx;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib1dARB(n2, d2, l2);
    }

    static native void nglVertexAttrib1dARB(int var0, double var1, long var3);

    public static void a(int n2, short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.my;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib2sARB(n2, s2, s3, l2);
    }

    static native void nglVertexAttrib2sARB(int var0, short var1, short var2, long var3);

    public static void a(int n2, float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mz;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib2fARB(n2, f2, f3, l2);
    }

    static native void nglVertexAttrib2fARB(int var0, float var1, float var2, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mA;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib2dARB(n2, d2, d3, l2);
    }

    static native void nglVertexAttrib2dARB(int var0, double var1, double var3, long var5);

    public static void a(int n2, short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mB;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib3sARB(n2, s2, s3, s4, l2);
    }

    static native void nglVertexAttrib3sARB(int var0, short var1, short var2, short var3, long var4);

    public static void a(int n2, float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mC;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib3fARB(n2, f2, f3, f4, l2);
    }

    static native void nglVertexAttrib3fARB(int var0, float var1, float var2, float var3, long var4);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mD;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib3dARB(n2, d2, d3, d4, l2);
    }

    static native void nglVertexAttrib3dARB(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mE;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib4sARB(n2, s2, s3, s4, s5, l2);
    }

    static native void nglVertexAttrib4sARB(int var0, short var1, short var2, short var3, short var4, long var5);

    public static void a(int n2, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mF;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib4fARB(n2, f2, f3, f4, f5, l2);
    }

    static native void nglVertexAttrib4fARB(int var0, float var1, float var2, float var3, float var4, long var5);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mG;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib4dARB(n2, d2, d3, d4, d5, l2);
    }

    static native void nglVertexAttrib4dARB(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, byte by2, byte by3, byte by4, byte by5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mH;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglVertexAttrib4NubARB(n2, by2, by3, by4, by5, l2);
    }

    static native void nglVertexAttrib4NubARB(int var0, byte var1, byte var2, byte var3, byte var4, long var5);

    public static void a(int n2, int n3, boolean bl2, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mI;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = doubleBuffer;
        }
        ARBVertexShader.nglVertexAttribPointerARB(n2, n3, 5130, bl2, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, boolean bl2, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mI;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = floatBuffer;
        }
        ARBVertexShader.nglVertexAttribPointerARB(n2, n3, 5126, bl2, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, boolean bl2, boolean bl3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mI;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = byteBuffer;
        }
        ARBVertexShader.nglVertexAttribPointerARB(n2, n3, bl2 ? 5121 : 5120, bl3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, boolean bl2, boolean bl3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mI;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = intBuffer;
        }
        ARBVertexShader.nglVertexAttribPointerARB(n2, n3, bl2 ? 5125 : 5124, bl3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, boolean bl2, boolean bl3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mI;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = shortBuffer;
        }
        ARBVertexShader.nglVertexAttribPointerARB(n2, n3, bl2 ? 5123 : 5122, bl3, n4, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribPointerARB(int var0, int var1, int var2, boolean var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, boolean bl2, int n5, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.mI;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        ARBVertexShader.nglVertexAttribPointerARBBO(n2, n3, n4, bl2, n5, l2, l3);
    }

    static native void nglVertexAttribPointerARBBO(int var0, int var1, int var2, boolean var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, boolean bl2, int n5, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mI;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = byteBuffer;
        }
        ARBVertexShader.nglVertexAttribPointerARB(n2, n3, n4, bl2, n5, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mJ;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglEnableVertexAttribArrayARB(n2, l2);
    }

    static native void nglEnableVertexAttribArrayARB(int var0, long var1);

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mK;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglDisableVertexAttribArrayARB(n2, l2);
    }

    static native void nglDisableVertexAttribArrayARB(int var0, long var1);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        ARBVertexShader.nglBindAttribLocationARB(n2, n3, org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglBindAttribLocationARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mL;
        org.lwjgl.a.a(l2);
        ARBVertexShader.nglBindAttribLocationARB(n2, n3, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mM;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.a(intBuffer2, 1);
        org.lwjgl.a.a(intBuffer3, 1);
        org.lwjgl.a.b(byteBuffer);
        ARBVertexShader.nglGetActiveAttribARB(n2, n3, byteBuffer.remaining(), org.lwjgl.o.b(intBuffer), org.lwjgl.o.a(intBuffer2), org.lwjgl.o.a(intBuffer3), org.lwjgl.o.a(byteBuffer), l2);
    }

    static native void nglGetActiveAttribARB(int var0, int var1, int var2, long var3, long var5, long var7, long var9, long var11);

    public static String a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 2);
        IntBuffer intBuffer2 = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        ARBVertexShader.nglGetActiveAttribARB(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer2), org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, intBuffer.position() + 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer2.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static String a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mM;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.e(dt2);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        ARBVertexShader.nglGetActiveAttribARB(n2, n3, n4, org.lwjgl.o.a((Buffer)intBuffer), org.lwjgl.o.a((Buffer)org.lwjgl.opengl.i.a(dt2)), org.lwjgl.o.a(org.lwjgl.opengl.i.a(dt2), 1), org.lwjgl.o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mM;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        ARBVertexShader.nglGetActiveAttribARB(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer), org.lwjgl.o.a(intBuffer, 1), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mM;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        ARBVertexShader.nglGetActiveAttribARB(n2, n3, 0, 0L, org.lwjgl.o.a(intBuffer, 1), org.lwjgl.o.a(intBuffer), org.lwjgl.opengl.i.f(dt2), l2);
        return intBuffer.get(0);
    }

    public static int a(int n2, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        int n3 = ARBVertexShader.nglGetAttribLocationARB(n2, org.lwjgl.o.a(byteBuffer), l2);
        return n3;
    }

    static native int nglGetAttribLocationARB(int var0, long var1, long var3);

    public static int a(int n2, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mN;
        org.lwjgl.a.a(l2);
        int n3 = ARBVertexShader.nglGetAttribLocationARB(n2, org.lwjgl.opengl.i.b(dt2, charSequence), l2);
        return n3;
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ARBVertexShader.nglGetVertexAttribfvARB(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetVertexAttribfvARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        ARBVertexShader.nglGetVertexAttribdvARB(n2, n3, org.lwjgl.o.a(doubleBuffer), l2);
    }

    static native void nglGetVertexAttribdvARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        ARBVertexShader.nglGetVertexAttribivARB(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetVertexAttribivARB(int var0, int var1, long var2, long var4);

    public static ByteBuffer a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.mR;
        org.lwjgl.a.a(l3);
        ByteBuffer byteBuffer = ARBVertexShader.nglGetVertexAttribPointervARB(n2, n3, l2, l3);
        return org.lwjgl.d.j && byteBuffer == null ? null : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static native ByteBuffer nglGetVertexAttribPointervARB(int var0, int var1, long var2, long var4);
}

