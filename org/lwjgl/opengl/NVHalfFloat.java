/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVHalfFloat {
    public static final int a = 5131;

    private NVHalfFloat() {
    }

    public static void a(short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NT;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglVertex2hNV(s2, s3, l2);
    }

    static native void nglVertex2hNV(short var0, short var1, long var2);

    public static void a(short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NU;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglVertex3hNV(s2, s3, s4, l2);
    }

    static native void nglVertex3hNV(short var0, short var1, short var2, long var3);

    public static void a(short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NV;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglVertex4hNV(s2, s3, s4, s5, l2);
    }

    static native void nglVertex4hNV(short var0, short var1, short var2, short var3, long var4);

    public static void b(short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NW;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglNormal3hNV(s2, s3, s4, l2);
    }

    static native void nglNormal3hNV(short var0, short var1, short var2, long var3);

    public static void c(short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NX;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglColor3hNV(s2, s3, s4, l2);
    }

    static native void nglColor3hNV(short var0, short var1, short var2, long var3);

    public static void b(short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NY;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglColor4hNV(s2, s3, s4, s5, l2);
    }

    static native void nglColor4hNV(short var0, short var1, short var2, short var3, long var4);

    public static void a(short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.NZ;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglTexCoord1hNV(s2, l2);
    }

    static native void nglTexCoord1hNV(short var0, long var1);

    public static void b(short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oa;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglTexCoord2hNV(s2, s3, l2);
    }

    static native void nglTexCoord2hNV(short var0, short var1, long var2);

    public static void d(short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ob;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglTexCoord3hNV(s2, s3, s4, l2);
    }

    static native void nglTexCoord3hNV(short var0, short var1, short var2, long var3);

    public static void c(short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oc;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglTexCoord4hNV(s2, s3, s4, s5, l2);
    }

    static native void nglTexCoord4hNV(short var0, short var1, short var2, short var3, long var4);

    public static void a(int n2, short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Od;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglMultiTexCoord1hNV(n2, s2, l2);
    }

    static native void nglMultiTexCoord1hNV(int var0, short var1, long var2);

    public static void a(int n2, short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oe;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglMultiTexCoord2hNV(n2, s2, s3, l2);
    }

    static native void nglMultiTexCoord2hNV(int var0, short var1, short var2, long var3);

    public static void a(int n2, short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Of;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglMultiTexCoord3hNV(n2, s2, s3, s4, l2);
    }

    static native void nglMultiTexCoord3hNV(int var0, short var1, short var2, short var3, long var4);

    public static void a(int n2, short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Og;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglMultiTexCoord4hNV(n2, s2, s3, s4, s5, l2);
    }

    static native void nglMultiTexCoord4hNV(int var0, short var1, short var2, short var3, short var4, long var5);

    public static void b(short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oh;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglFogCoordhNV(s2, l2);
    }

    static native void nglFogCoordhNV(short var0, long var1);

    public static void e(short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oi;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglSecondaryColor3hNV(s2, s3, s4, l2);
    }

    static native void nglSecondaryColor3hNV(short var0, short var1, short var2, long var3);

    public static void c(short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oj;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglVertexWeighthNV(s2, l2);
    }

    static native void nglVertexWeighthNV(short var0, long var1);

    public static void b(int n2, short s2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ok;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglVertexAttrib1hNV(n2, s2, l2);
    }

    static native void nglVertexAttrib1hNV(int var0, short var1, long var2);

    public static void b(int n2, short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ol;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglVertexAttrib2hNV(n2, s2, s3, l2);
    }

    static native void nglVertexAttrib2hNV(int var0, short var1, short var2, long var3);

    public static void b(int n2, short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Om;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglVertexAttrib3hNV(n2, s2, s3, s4, l2);
    }

    static native void nglVertexAttrib3hNV(int var0, short var1, short var2, short var3, long var4);

    public static void b(int n2, short s2, short s3, short s4, short s5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.On;
        org.lwjgl.a.a(l2);
        NVHalfFloat.nglVertexAttrib4hNV(n2, s2, s3, s4, s5, l2);
    }

    static native void nglVertexAttrib4hNV(int var0, short var1, short var2, short var3, short var4, long var5);

    public static void a(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oo;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVHalfFloat.nglVertexAttribs1hvNV(n2, shortBuffer.remaining(), o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribs1hvNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Op;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVHalfFloat.nglVertexAttribs2hvNV(n2, shortBuffer.remaining() >> 1, o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribs2hvNV(int var0, int var1, long var2, long var4);

    public static void c(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVHalfFloat.nglVertexAttribs3hvNV(n2, shortBuffer.remaining() / 3, o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribs3hvNV(int var0, int var1, long var2, long var4);

    public static void d(int n2, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Or;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        NVHalfFloat.nglVertexAttribs4hvNV(n2, shortBuffer.remaining() >> 2, o.a(shortBuffer), l2);
    }

    static native void nglVertexAttribs4hvNV(int var0, int var1, long var2, long var4);
}

