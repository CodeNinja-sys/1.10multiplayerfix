/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ATIPnTriangles {
    public static final int a = 34800;
    public static final int b = 34801;
    public static final int c = 34802;
    public static final int d = 34803;
    public static final int e = 34804;
    public static final int f = 34805;
    public static final int g = 34806;
    public static final int h = 34807;
    public static final int i = 34808;

    private ATIPnTriangles() {
    }

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ny;
        org.lwjgl.a.a(l2);
        ATIPnTriangles.nglPNTrianglesfATI(n2, f2, l2);
    }

    static native void nglPNTrianglesfATI(int var0, float var1, long var2);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nz;
        org.lwjgl.a.a(l2);
        ATIPnTriangles.nglPNTrianglesiATI(n2, n3, l2);
    }

    static native void nglPNTrianglesiATI(int var0, int var1, long var2);
}

