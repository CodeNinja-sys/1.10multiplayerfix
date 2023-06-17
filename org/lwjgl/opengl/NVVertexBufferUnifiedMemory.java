/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class NVVertexBufferUnifiedMemory {
    public static final int a = 36638;
    public static final int b = 36639;
    public static final int c = 36640;
    public static final int d = 36645;
    public static final int e = 36641;
    public static final int f = 36642;
    public static final int g = 36643;
    public static final int h = 36644;
    public static final int i = 36646;
    public static final int j = 36647;
    public static final int k = 36648;
    public static final int l = 36649;
    public static final int m = 36650;
    public static final int n = 36655;
    public static final int o = 36651;
    public static final int p = 36652;
    public static final int q = 36653;
    public static final int r = 36654;
    public static final int s = 36656;
    public static final int t = 36657;
    public static final int u = 36658;
    public static final int v = 36659;

    private NVVertexBufferUnifiedMemory() {
    }

    public static void a(int n2, int n3, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.Rs;
        org.lwjgl.a.a(l4);
        NVVertexBufferUnifiedMemory.nglBufferAddressRangeNV(n2, n3, l2, l3, l4);
    }

    static native void nglBufferAddressRangeNV(int var0, int var1, long var2, long var4, long var6);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rt;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglVertexFormatNV(n2, n3, n4, l2);
    }

    static native void nglVertexFormatNV(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ru;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglNormalFormatNV(n2, n3, l2);
    }

    static native void nglNormalFormatNV(int var0, int var1, long var2);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rv;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglColorFormatNV(n2, n3, n4, l2);
    }

    static native void nglColorFormatNV(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rw;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglIndexFormatNV(n2, n3, l2);
    }

    static native void nglIndexFormatNV(int var0, int var1, long var2);

    public static void c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rx;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglTexCoordFormatNV(n2, n3, n4, l2);
    }

    static native void nglTexCoordFormatNV(int var0, int var1, int var2, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ry;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglEdgeFlagFormatNV(n2, l2);
    }

    static native void nglEdgeFlagFormatNV(int var0, long var1);

    public static void d(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Rz;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglSecondaryColorFormatNV(n2, n3, n4, l2);
    }

    static native void nglSecondaryColorFormatNV(int var0, int var1, int var2, long var3);

    public static void c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RA;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglFogCoordFormatNV(n2, n3, l2);
    }

    static native void nglFogCoordFormatNV(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4, boolean bl2, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RB;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglVertexAttribFormatNV(n2, n3, n4, bl2, n5, l2);
    }

    static native void nglVertexAttribFormatNV(int var0, int var1, int var2, boolean var3, int var4, long var5);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RC;
        org.lwjgl.a.a(l2);
        NVVertexBufferUnifiedMemory.nglVertexAttribIFormatNV(n2, n3, n4, n5, l2);
    }

    static native void nglVertexAttribIFormatNV(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVVertexBufferUnifiedMemory.nglGetIntegerui64i_vNV(n2, n3, org.lwjgl.o.a(longBuffer), l2);
    }

    static native void nglGetIntegerui64i_vNV(int var0, int var1, long var2, long var4);

    public static long d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.RD;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = org.lwjgl.opengl.i.b(dt2);
        NVVertexBufferUnifiedMemory.nglGetIntegerui64i_vNV(n2, n3, org.lwjgl.o.a(longBuffer), l2);
        return longBuffer.get(0);
    }
}

