/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBBindlessTexture {
    public static final int a = 5135;

    private ARBBindlessTexture() {
    }

    public static long a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hE;
        org.lwjgl.a.a(l2);
        long l3 = ARBBindlessTexture.nglGetTextureHandleARB(n2, l2);
        return l3;
    }

    static native long nglGetTextureHandleARB(int var0, long var1);

    public static long a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hF;
        org.lwjgl.a.a(l2);
        long l3 = ARBBindlessTexture.nglGetTextureSamplerHandleARB(n2, n3, l2);
        return l3;
    }

    static native long nglGetTextureSamplerHandleARB(int var0, int var1, long var2);

    public static void a(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hG;
        org.lwjgl.a.a(l3);
        ARBBindlessTexture.nglMakeTextureHandleResidentARB(l2, l3);
    }

    static native void nglMakeTextureHandleResidentARB(long var0, long var2);

    public static void b(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hH;
        org.lwjgl.a.a(l3);
        ARBBindlessTexture.nglMakeTextureHandleNonResidentARB(l2, l3);
    }

    static native void nglMakeTextureHandleNonResidentARB(long var0, long var2);

    public static long a(int n2, int n3, boolean bl2, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hI;
        org.lwjgl.a.a(l2);
        long l3 = ARBBindlessTexture.nglGetImageHandleARB(n2, n3, bl2, n4, n5, l2);
        return l3;
    }

    static native long nglGetImageHandleARB(int var0, int var1, boolean var2, int var3, int var4, long var5);

    public static void a(long l2, int n2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hJ;
        org.lwjgl.a.a(l3);
        ARBBindlessTexture.nglMakeImageHandleResidentARB(l2, n2, l3);
    }

    static native void nglMakeImageHandleResidentARB(long var0, int var2, long var3);

    public static void c(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hK;
        org.lwjgl.a.a(l3);
        ARBBindlessTexture.nglMakeImageHandleNonResidentARB(l2, l3);
    }

    static native void nglMakeImageHandleNonResidentARB(long var0, long var2);

    public static void a(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hL;
        org.lwjgl.a.a(l3);
        ARBBindlessTexture.nglUniformHandleui64ARB(n2, l2, l3);
    }

    static native void nglUniformHandleui64ARB(int var0, long var1, long var3);

    public static void a(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        ARBBindlessTexture.nglUniformHandleui64vARB(n2, longBuffer.remaining(), o.a(longBuffer), l2);
    }

    static native void nglUniformHandleui64vARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hN;
        org.lwjgl.a.a(l3);
        ARBBindlessTexture.nglProgramUniformHandleui64ARB(n2, n3, l2, l3);
    }

    static native void nglProgramUniformHandleui64ARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hO;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        ARBBindlessTexture.nglProgramUniformHandleui64vARB(n2, n3, longBuffer.remaining(), o.a(longBuffer), l2);
    }

    static native void nglProgramUniformHandleui64vARB(int var0, int var1, int var2, long var3, long var5);

    public static boolean d(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hP;
        org.lwjgl.a.a(l3);
        boolean bl2 = ARBBindlessTexture.nglIsTextureHandleResidentARB(l2, l3);
        return bl2;
    }

    static native boolean nglIsTextureHandleResidentARB(long var0, long var2);

    public static boolean e(long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hQ;
        org.lwjgl.a.a(l3);
        boolean bl2 = ARBBindlessTexture.nglIsImageHandleResidentARB(l2, l3);
        return bl2;
    }

    static native boolean nglIsImageHandleResidentARB(long var0, long var2);

    public static void b(int n2, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.hR;
        org.lwjgl.a.a(l3);
        ARBBindlessTexture.nglVertexAttribL1ui64ARB(n2, l2, l3);
    }

    static native void nglVertexAttribL1ui64ARB(int var0, long var1, long var3);

    public static void b(int n2, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        ARBBindlessTexture.nglVertexAttribL1ui64vARB(n2, o.a(longBuffer), l2);
    }

    static native void nglVertexAttribL1ui64vARB(int var0, long var1, long var3);

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 4);
        ARBBindlessTexture.nglGetVertexAttribLui64vARB(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetVertexAttribLui64vARB(int var0, int var1, long var2, long var4);
}

