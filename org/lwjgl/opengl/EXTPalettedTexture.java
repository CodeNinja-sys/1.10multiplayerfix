/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;

public final class EXTPalettedTexture {
    public static final int a = 32994;
    public static final int b = 32995;
    public static final int c = 32996;
    public static final int d = 32997;
    public static final int e = 32998;
    public static final int f = 32999;
    public static final int g = 32984;
    public static final int h = 32985;
    public static final int i = 32986;
    public static final int j = 32987;
    public static final int k = 32988;
    public static final int l = 32989;
    public static final int m = 32990;
    public static final int n = 32991;
    public static final int o = 33005;

    private EXTPalettedTexture() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tU;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglColorTableEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void b(int n2, int n3, int n4, int n5, int n6, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, ft.a(byteBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorSubTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, ft.a(doubleBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorSubTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, ft.a(floatBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorSubTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, ft.a(intBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorSubTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tV;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer, ft.a(shortBuffer, n5, n6, n4, 1, 1));
        EXTPalettedTexture.nglColorSubTableEXT(n2, n3, n4, n5, n6, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglColorSubTableEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        EXTPalettedTexture.nglGetColorTableEXT(n2, n3, n4, org.lwjgl.o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer);
        EXTPalettedTexture.nglGetColorTableEXT(n2, n3, n4, org.lwjgl.o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        EXTPalettedTexture.nglGetColorTableEXT(n2, n3, n4, org.lwjgl.o.a(floatBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        EXTPalettedTexture.nglGetColorTableEXT(n2, n3, n4, org.lwjgl.o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tW;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        EXTPalettedTexture.nglGetColorTableEXT(n2, n3, n4, org.lwjgl.o.a(shortBuffer), l2);
    }

    static native void nglGetColorTableEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tX;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        EXTPalettedTexture.nglGetColorTableParameterivEXT(n2, n3, org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglGetColorTableParameterivEXT(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tY;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTPalettedTexture.nglGetColorTableParameterfvEXT(n2, n3, org.lwjgl.o.a(floatBuffer), l2);
    }

    static native void nglGetColorTableParameterfvEXT(int var0, int var1, long var2, long var4);
}

