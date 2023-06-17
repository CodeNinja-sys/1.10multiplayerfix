/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.is;

public final class EXTFogCoord {
    public static final int a = 33872;
    public static final int b = 33873;
    public static final int c = 33874;
    public static final int d = 33875;
    public static final int e = 33876;
    public static final int f = 33877;
    public static final int g = 33878;
    public static final int h = 33879;

    private EXTFogCoord() {
    }

    public static void a(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sJ;
        org.lwjgl.a.a(l2);
        EXTFogCoord.nglFogCoordfEXT(f2, l2);
    }

    static native void nglFogCoordfEXT(float var0, long var1);

    public static void a(double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sK;
        org.lwjgl.a.a(l2);
        EXTFogCoord.nglFogCoorddEXT(d2, l2);
    }

    static native void nglFogCoorddEXT(double var0, long var2);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sL;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).l = doubleBuffer;
        }
        EXTFogCoord.nglFogCoordPointerEXT(5130, n2, o.a(doubleBuffer), l2);
    }

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sL;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).l = floatBuffer;
        }
        EXTFogCoord.nglFogCoordPointerEXT(5126, n2, o.a(floatBuffer), l2);
    }

    static native void nglFogCoordPointerEXT(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sL;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        EXTFogCoord.nglFogCoordPointerEXTBO(n2, n3, l2, l3);
    }

    static native void nglFogCoordPointerEXTBO(int var0, int var1, long var2, long var4);
}

