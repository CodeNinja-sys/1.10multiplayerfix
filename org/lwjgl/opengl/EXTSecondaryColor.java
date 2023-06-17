/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.is;

public final class EXTSecondaryColor {
    public static final int a = 33880;
    public static final int b = 33881;
    public static final int c = 33882;
    public static final int d = 33883;
    public static final int e = 33884;
    public static final int f = 33885;
    public static final int g = 33886;

    private EXTSecondaryColor() {
    }

    public static void a(byte by2, byte by3, byte by4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uc;
        org.lwjgl.a.a(l2);
        EXTSecondaryColor.nglSecondaryColor3bEXT(by2, by3, by4, l2);
    }

    static native void nglSecondaryColor3bEXT(byte var0, byte var1, byte var2, long var3);

    public static void a(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ud;
        org.lwjgl.a.a(l2);
        EXTSecondaryColor.nglSecondaryColor3fEXT(f2, f3, f4, l2);
    }

    static native void nglSecondaryColor3fEXT(float var0, float var1, float var2, long var3);

    public static void a(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ue;
        org.lwjgl.a.a(l2);
        EXTSecondaryColor.nglSecondaryColor3dEXT(d2, d3, d4, l2);
    }

    static native void nglSecondaryColor3dEXT(double var0, double var2, double var4, long var6);

    public static void b(byte by2, byte by3, byte by4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uf;
        org.lwjgl.a.a(l2);
        EXTSecondaryColor.nglSecondaryColor3ubEXT(by2, by3, by4, l2);
    }

    static native void nglSecondaryColor3ubEXT(byte var0, byte var1, byte var2, long var3);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ug;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).m = doubleBuffer;
        }
        EXTSecondaryColor.nglSecondaryColorPointerEXT(n2, 5130, n3, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ug;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).m = floatBuffer;
        }
        EXTSecondaryColor.nglSecondaryColorPointerEXT(n2, 5126, n3, o.a(floatBuffer), l2);
    }

    public static void a(int n2, boolean bl2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ug;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.b(byteBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).m = byteBuffer;
        }
        EXTSecondaryColor.nglSecondaryColorPointerEXT(n2, bl2 ? 5121 : 5120, n3, o.a(byteBuffer), l2);
    }

    static native void nglSecondaryColorPointerEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.ug;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        EXTSecondaryColor.nglSecondaryColorPointerEXTBO(n2, n3, n4, l2, l3);
    }

    static native void nglSecondaryColorPointerEXTBO(int var0, int var1, int var2, long var3, long var5);
}

