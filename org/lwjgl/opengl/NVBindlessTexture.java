/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVBindlessTexture {
    private NVBindlessTexture() {
    }

    public static long a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ma;
        a.a(l2);
        long l3 = NVBindlessTexture.nglGetTextureHandleNV(n2, l2);
        return l3;
    }

    static native long nglGetTextureHandleNV(int var0, long var1);

    public static long a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mb;
        a.a(l2);
        long l3 = NVBindlessTexture.nglGetTextureSamplerHandleNV(n2, n3, l2);
        return l3;
    }

    static native long nglGetTextureSamplerHandleNV(int var0, int var1, long var2);

    public static void a(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Mc;
        a.a(l3);
        NVBindlessTexture.nglMakeTextureHandleResidentNV(l2, l3);
    }

    static native void nglMakeTextureHandleResidentNV(long var0, long var2);

    public static void b(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Md;
        a.a(l3);
        NVBindlessTexture.nglMakeTextureHandleNonResidentNV(l2, l3);
    }

    static native void nglMakeTextureHandleNonResidentNV(long var0, long var2);

    public static long a(int n2, int n3, boolean bl2, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Me;
        a.a(l2);
        long l3 = NVBindlessTexture.nglGetImageHandleNV(n2, n3, bl2, n4, n5, l2);
        return l3;
    }

    static native long nglGetImageHandleNV(int var0, int var1, boolean var2, int var3, int var4, long var5);

    public static void a(long l2, int n2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Mf;
        a.a(l3);
        NVBindlessTexture.nglMakeImageHandleResidentNV(l2, n2, l3);
    }

    static native void nglMakeImageHandleResidentNV(long var0, int var2, long var3);

    public static void c(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Mg;
        a.a(l3);
        NVBindlessTexture.nglMakeImageHandleNonResidentNV(l2, l3);
    }

    static native void nglMakeImageHandleNonResidentNV(long var0, long var2);

    public static void a(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Mh;
        a.a(l3);
        NVBindlessTexture.nglUniformHandleui64NV(n2, l2, l3);
    }

    static native void nglUniformHandleui64NV(int var0, long var1, long var3);

    public static void a(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mi;
        a.a(l2);
        a.b(longBuffer);
        NVBindlessTexture.nglUniformHandleui64vNV(n2, longBuffer.remaining(), o.a(longBuffer), l2);
    }

    static native void nglUniformHandleui64vNV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Mj;
        a.a(l3);
        NVBindlessTexture.nglProgramUniformHandleui64NV(n2, n3, l2, l3);
    }

    static native void nglProgramUniformHandleui64NV(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Mk;
        a.a(l2);
        a.b(longBuffer);
        NVBindlessTexture.nglProgramUniformHandleui64vNV(n2, n3, longBuffer.remaining(), o.a(longBuffer), l2);
    }

    static native void nglProgramUniformHandleui64vNV(int var0, int var1, int var2, long var3, long var5);

    public static boolean d(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Ml;
        a.a(l3);
        boolean bl2 = NVBindlessTexture.nglIsTextureHandleResidentNV(l2, l3);
        return bl2;
    }

    static native boolean nglIsTextureHandleResidentNV(long var0, long var2);

    public static boolean e(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.Mm;
        a.a(l3);
        boolean bl2 = NVBindlessTexture.nglIsImageHandleResidentNV(l2, l3);
        return bl2;
    }

    static native boolean nglIsImageHandleResidentNV(long var0, long var2);
}

