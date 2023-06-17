/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTPointParameters {
    public static final int a = 33062;
    public static final int b = 33063;
    public static final int c = 33064;
    public static final int d = 33065;

    private EXTPointParameters() {
    }

    public static void a(int n2, float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tZ;
        org.lwjgl.a.a(l2);
        EXTPointParameters.nglPointParameterfEXT(n2, f2, l2);
    }

    static native void nglPointParameterfEXT(int var0, float var1, long var2);

    public static void a(int n2, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ua;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        EXTPointParameters.nglPointParameterfvEXT(n2, o.a(floatBuffer), l2);
    }

    static native void nglPointParameterfvEXT(int var0, long var1, long var3);
}

