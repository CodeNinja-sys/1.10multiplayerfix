/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVRegisterCombiners2 {
    public static final int a = 34101;

    private NVRegisterCombiners2() {
    }

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVRegisterCombiners2.nglCombinerStageParameterfvNV(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglCombinerStageParameterfvNV(int var0, int var1, long var2, long var4);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Qi;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer, 4);
        NVRegisterCombiners2.nglGetCombinerStageParameterfvNV(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetCombinerStageParameterfvNV(int var0, int var1, long var2, long var4);
}

