/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBWindowPos {
    private ARBWindowPos() {
    }

    public static void a(float f2, float f3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mS;
        a.a(l2);
        ARBWindowPos.nglWindowPos2fARB(f2, f3, l2);
    }

    static native void nglWindowPos2fARB(float var0, float var1, long var2);

    public static void a(double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mT;
        a.a(l2);
        ARBWindowPos.nglWindowPos2dARB(d2, d3, l2);
    }

    static native void nglWindowPos2dARB(double var0, double var2, long var4);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mU;
        a.a(l2);
        ARBWindowPos.nglWindowPos2iARB(n2, n3, l2);
    }

    static native void nglWindowPos2iARB(int var0, int var1, long var2);

    public static void a(short s2, short s3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mV;
        a.a(l2);
        ARBWindowPos.nglWindowPos2sARB(s2, s3, l2);
    }

    static native void nglWindowPos2sARB(short var0, short var1, long var2);

    public static void a(float f2, float f3, float f4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mW;
        a.a(l2);
        ARBWindowPos.nglWindowPos3fARB(f2, f3, f4, l2);
    }

    static native void nglWindowPos3fARB(float var0, float var1, float var2, long var3);

    public static void a(double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mX;
        a.a(l2);
        ARBWindowPos.nglWindowPos3dARB(d2, d3, d4, l2);
    }

    static native void nglWindowPos3dARB(double var0, double var2, double var4, long var6);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mY;
        a.a(l2);
        ARBWindowPos.nglWindowPos3iARB(n2, n3, n4, l2);
    }

    static native void nglWindowPos3iARB(int var0, int var1, int var2, long var3);

    public static void a(short s2, short s3, short s4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.mZ;
        a.a(l2);
        ARBWindowPos.nglWindowPos3sARB(s2, s3, s4, l2);
    }

    static native void nglWindowPos3sARB(short var0, short var1, short var2, long var3);
}

