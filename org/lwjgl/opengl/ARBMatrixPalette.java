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
import org.lwjgl.opengl.is;

public final class ARBMatrixPalette {
    public static final int a = 34880;
    public static final int b = 34881;
    public static final int c = 34882;
    public static final int d = 34883;
    public static final int e = 34884;
    public static final int f = 34885;
    public static final int g = 34886;
    public static final int h = 34887;
    public static final int i = 34888;
    public static final int j = 34889;

    private ARBMatrixPalette() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jC;
        org.lwjgl.a.a(l2);
        ARBMatrixPalette.nglCurrentPaletteMatrixARB(n2, l2);
    }

    static native void nglCurrentPaletteMatrixARB(int var0, long var1);

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jD;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).j = byteBuffer;
        }
        ARBMatrixPalette.nglMatrixIndexPointerARB(n2, 5121, n3, o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jD;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(intBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).j = intBuffer;
        }
        ARBMatrixPalette.nglMatrixIndexPointerARB(n2, 5125, n3, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jD;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(shortBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).j = shortBuffer;
        }
        ARBMatrixPalette.nglMatrixIndexPointerARB(n2, 5123, n3, o.a(shortBuffer), l2);
    }

    static native void nglMatrixIndexPointerARB(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.jD;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        ARBMatrixPalette.nglMatrixIndexPointerARBBO(n2, n3, n4, l2, l3);
    }

    static native void nglMatrixIndexPointerARBBO(int var0, int var1, int var2, long var3, long var5);

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ARBMatrixPalette.nglMatrixIndexubvARB(byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglMatrixIndexubvARB(int var0, long var1, long var3);

    public static void a(ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        ARBMatrixPalette.nglMatrixIndexusvARB(shortBuffer.remaining(), o.a(shortBuffer), l2);
    }

    static native void nglMatrixIndexusvARB(int var0, long var1, long var3);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBMatrixPalette.nglMatrixIndexuivARB(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglMatrixIndexuivARB(int var0, long var1, long var3);
}

