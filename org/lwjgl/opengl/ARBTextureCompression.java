/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;

public final class ARBTextureCompression {
    public static final int a = 34025;
    public static final int b = 34026;
    public static final int c = 34027;
    public static final int d = 34028;
    public static final int e = 34029;
    public static final int f = 34030;
    public static final int g = 34031;
    public static final int h = 34464;
    public static final int i = 34465;
    public static final int j = 34466;
    public static final int k = 34467;

    private ARBTextureCompression() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lW;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBTextureCompression.nglCompressedTexImage1DARB(n2, n3, n4, n5, n6, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexImage1DARB(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.lW;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBTextureCompression.nglCompressedTexImage1DARBBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglCompressedTexImage1DARBBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lX;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBTextureCompression.nglCompressedTexImage2DARB(n2, n3, n4, n5, n6, n7, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexImage2DARB(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.lX;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBTextureCompression.nglCompressedTexImage2DARBBO(n2, n3, n4, n5, n6, n7, n8, l2, l3);
    }

    static native void nglCompressedTexImage2DARBBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, long var7, long var9);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lY;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBTextureCompression.nglCompressedTexImage3DARB(n2, n3, n4, n5, n6, n7, n8, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexImage3DARB(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.lY;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBTextureCompression.nglCompressedTexImage3DARBBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglCompressedTexImage3DARBBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.lZ;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBTextureCompression.nglCompressedTexSubImage1DARB(n2, n3, n4, n5, n6, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexSubImage1DARB(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.lZ;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBTextureCompression.nglCompressedTexSubImage1DARBBO(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglCompressedTexSubImage1DARBBO(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ma;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBTextureCompression.nglCompressedTexSubImage2DARB(n2, n3, n4, n5, n6, n7, n8, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexSubImage2DARB(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ma;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBTextureCompression.nglCompressedTexSubImage2DARBBO(n2, n3, n4, n5, n6, n7, n8, n9, l2, l3);
    }

    static native void nglCompressedTexSubImage2DARBBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, long var8, long var10);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mb;
        org.lwjgl.a.a(l2);
        ft.i(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBTextureCompression.nglCompressedTexSubImage3DARB(n2, n3, n4, n5, n6, n7, n8, n9, n10, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglCompressedTexSubImage3DARB(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.mb;
        org.lwjgl.a.a(l3);
        ft.j(dt2);
        ARBTextureCompression.nglCompressedTexSubImage3DARBBO(n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l2, l3);
    }

    static native void nglCompressedTexSubImage3DARBBO(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, long var10, long var12);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mc;
        org.lwjgl.a.a(l2);
        ft.g(dt2);
        org.lwjgl.a.b(byteBuffer);
        ARBTextureCompression.nglGetCompressedTexImageARB(n2, n3, o.a(byteBuffer), l2);
    }

    static native void nglGetCompressedTexImageARB(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.mc;
        org.lwjgl.a.a(l3);
        ft.h(dt2);
        ARBTextureCompression.nglGetCompressedTexImageARBBO(n2, n3, l2, l3);
    }

    static native void nglGetCompressedTexImageARBBO(int var0, int var1, long var2, long var4);
}

