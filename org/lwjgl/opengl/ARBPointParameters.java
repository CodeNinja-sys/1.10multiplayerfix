/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBPointParameters {
    public static final int a = 33062;
    public static final int b = 33063;
    public static final int c = 33064;
    public static final int d = 33065;

    private ARBPointParameters() {
    }

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ki;
        org.lwjgl.a.a(l2);
        ARBPointParameters.nglPointParameterfARB(n2, f2, l2);
    }

    static native void nglPointParameterfARB(int var0, float var1, long var2);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kj;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        ARBPointParameters.nglPointParameterfvARB(n2, o.a(floatBuffer), l2);
    }

    static native void nglPointParameterfvARB(int var0, long var1, long var3);
}

