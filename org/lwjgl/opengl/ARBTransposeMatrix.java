/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBTransposeMatrix {
    public static final int a = 34019;
    public static final int b = 34020;
    public static final int c = 34021;
    public static final int d = 34022;

    private ARBTransposeMatrix() {
    }

    public static void a(FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        ARBTransposeMatrix.nglLoadTransposeMatrixfARB(o.a(floatBuffer), l2);
    }

    static native void nglLoadTransposeMatrixfARB(long var0, long var2);

    public static void b(FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 16);
        ARBTransposeMatrix.nglMultTransposeMatrixfARB(o.a(floatBuffer), l2);
    }

    static native void nglMultTransposeMatrixfARB(long var0, long var2);
}

