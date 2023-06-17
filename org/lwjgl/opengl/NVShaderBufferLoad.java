/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.NVGpuShader5;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class NVShaderBufferLoad {
    public static final int a = 36637;
    public static final int b = 36660;
    public static final int c = 36661;

    private NVShaderBufferLoad() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qj;
        org.lwjgl.a.a(l2);
        NVShaderBufferLoad.nglMakeBufferResidentNV(n2, n3, l2);
    }

    static native void nglMakeBufferResidentNV(int var0, int var1, long var2);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qk;
        org.lwjgl.a.a(l2);
        NVShaderBufferLoad.nglMakeBufferNonResidentNV(n2, l2);
    }

    static native void nglMakeBufferNonResidentNV(int var0, long var1);

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ql;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVShaderBufferLoad.nglIsBufferResidentNV(n2, l2);
        return bl2;
    }

    static native boolean nglIsBufferResidentNV(int var0, long var1);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qm;
        org.lwjgl.a.a(l2);
        NVShaderBufferLoad.nglMakeNamedBufferResidentNV(n2, n3, l2);
    }

    static native void nglMakeNamedBufferResidentNV(int var0, int var1, long var2);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qn;
        org.lwjgl.a.a(l2);
        NVShaderBufferLoad.nglMakeNamedBufferNonResidentNV(n2, l2);
    }

    static native void nglMakeNamedBufferNonResidentNV(int var0, long var1);

    public static boolean d(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qo;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVShaderBufferLoad.nglIsNamedBufferResidentNV(n2, l2);
        return bl2;
    }

    static native boolean nglIsNamedBufferResidentNV(int var0, long var1);

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qp;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVShaderBufferLoad.nglGetBufferParameterui64vNV(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetBufferParameterui64vNV(int var0, int var1, long var2, long var4);

    public static long c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qp;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = i.b(dt2);
        NVShaderBufferLoad.nglGetBufferParameterui64vNV(n2, n3, o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qq;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVShaderBufferLoad.nglGetNamedBufferParameterui64vNV(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetNamedBufferParameterui64vNV(int var0, int var1, long var2, long var4);

    public static long d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qq;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = i.b(dt2);
        NVShaderBufferLoad.nglGetNamedBufferParameterui64vNV(n2, n3, o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void a(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qr;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVShaderBufferLoad.nglGetIntegerui64vNV(n2, o.a(longBuffer), l2);
    }

    static native void nglGetIntegerui64vNV(int var0, long var1, long var3);

    public static long e(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qr;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = i.b(dt2);
        NVShaderBufferLoad.nglGetIntegerui64vNV(n2, o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void a(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Qs;
        org.lwjgl.a.a(l3);
        NVShaderBufferLoad.nglUniformui64NV(n2, l2, l3);
    }

    static native void nglUniformui64NV(int var0, long var1, long var3);

    public static void b(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qt;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVShaderBufferLoad.nglUniformui64vNV(n2, longBuffer.remaining(), o.a(longBuffer), l2);
    }

    static native void nglUniformui64vNV(int var0, int var1, long var2, long var4);

    public static void c(int n2, int n3, LongBuffer longBuffer) {
        NVGpuShader5.b(n2, n3, longBuffer);
    }

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Qu;
        org.lwjgl.a.a(l3);
        NVShaderBufferLoad.nglProgramUniformui64NV(n2, n3, l2, l3);
    }

    static native void nglProgramUniformui64NV(int var0, int var1, long var2, long var4);

    public static void d(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qv;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        NVShaderBufferLoad.nglProgramUniformui64vNV(n2, n3, longBuffer.remaining(), o.a(longBuffer), l2);
    }

    static native void nglProgramUniformui64vNV(int var0, int var1, int var2, long var3, long var5);
}

