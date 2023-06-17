/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVVertexAttribInteger64bit {
    public static final int a = 5134;
    public static final int b = 5135;

    private NVVertexAttribInteger64bit() {
    }

    public static void a(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.QZ;
        org.lwjgl.a.a(l3);
        NVVertexAttribInteger64bit.nglVertexAttribL1i64NV(n2, l2, l3);
    }

    static native void nglVertexAttribL1i64NV(int var0, long var1, long var3);

    public static void a(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Ra;
        org.lwjgl.a.a(l4);
        NVVertexAttribInteger64bit.nglVertexAttribL2i64NV(n2, l2, l3, l4);
    }

    static native void nglVertexAttribL2i64NV(int var0, long var1, long var3, long var5);

    public static void a(int n2, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.Rb;
        org.lwjgl.a.a(l5);
        NVVertexAttribInteger64bit.nglVertexAttribL3i64NV(n2, l2, l3, l4, l5);
    }

    static native void nglVertexAttribL3i64NV(int var0, long var1, long var3, long var5, long var7);

    public static void a(int n2, long l2, long l3, long l4, long l5) {
        dt dt2 = GLContext.a();
        long l6 = dt2.Rc;
        org.lwjgl.a.a(l6);
        NVVertexAttribInteger64bit.nglVertexAttribL4i64NV(n2, l2, l3, l4, l5, l6);
    }

    static native void nglVertexAttribL4i64NV(int var0, long var1, long var3, long var5, long var7, long var9);

    public static void a(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rd;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVVertexAttribInteger64bit.nglVertexAttribL1i64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL1i64vNV(int var0, long var1, long var3);

    public static void b(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Re;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 2);
        NVVertexAttribInteger64bit.nglVertexAttribL2i64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL2i64vNV(int var0, long var1, long var3);

    public static void c(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 3);
        NVVertexAttribInteger64bit.nglVertexAttribL3i64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL3i64vNV(int var0, long var1, long var3);

    public static void d(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 4);
        NVVertexAttribInteger64bit.nglVertexAttribL4i64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL4i64vNV(int var0, long var1, long var3);

    public static void b(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Rh;
        org.lwjgl.a.a(l3);
        NVVertexAttribInteger64bit.nglVertexAttribL1ui64NV(n2, l2, l3);
    }

    static native void nglVertexAttribL1ui64NV(int var0, long var1, long var3);

    public static void b(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Ri;
        org.lwjgl.a.a(l4);
        NVVertexAttribInteger64bit.nglVertexAttribL2ui64NV(n2, l2, l3, l4);
    }

    static native void nglVertexAttribL2ui64NV(int var0, long var1, long var3, long var5);

    public static void b(int n2, long l2, long l3, long l4) {
        dt dt2 = GLContext.a();
        long l5 = dt2.Rj;
        org.lwjgl.a.a(l5);
        NVVertexAttribInteger64bit.nglVertexAttribL3ui64NV(n2, l2, l3, l4, l5);
    }

    static native void nglVertexAttribL3ui64NV(int var0, long var1, long var3, long var5, long var7);

    public static void b(int n2, long l2, long l3, long l4, long l5) {
        dt dt2 = GLContext.a();
        long l6 = dt2.Rk;
        org.lwjgl.a.a(l6);
        NVVertexAttribInteger64bit.nglVertexAttribL4ui64NV(n2, l2, l3, l4, l5, l6);
    }

    static native void nglVertexAttribL4ui64NV(int var0, long var1, long var3, long var5, long var7, long var9);

    public static void e(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rl;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVVertexAttribInteger64bit.nglVertexAttribL1ui64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL1ui64vNV(int var0, long var1, long var3);

    public static void f(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rm;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 2);
        NVVertexAttribInteger64bit.nglVertexAttribL2ui64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL2ui64vNV(int var0, long var1, long var3);

    public static void g(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 3);
        NVVertexAttribInteger64bit.nglVertexAttribL3ui64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL3ui64vNV(int var0, long var1, long var3);

    public static void h(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ro;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 4);
        NVVertexAttribInteger64bit.nglVertexAttribL4ui64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL4ui64vNV(int var0, long var1, long var3);

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 4);
        NVVertexAttribInteger64bit.nglGetVertexAttribLi64vNV(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetVertexAttribLi64vNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 4);
        NVVertexAttribInteger64bit.nglGetVertexAttribLui64vNV(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetVertexAttribLui64vNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rr;
        org.lwjgl.a.a(l2);
        NVVertexAttribInteger64bit.nglVertexAttribLFormatNV(n2, n3, n4, n5, l2);
    }

    static native void nglVertexAttribLFormatNV(int var0, int var1, int var2, int var3, long var4);
}

