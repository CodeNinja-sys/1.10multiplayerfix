/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.EXTGeometryShader4;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVGeometryProgram4 {
    public static final int a = 35878;
    public static final int b = 35879;
    public static final int c = 35880;

    private NVGeometryProgram4() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MU;
        org.lwjgl.a.a(l2);
        NVGeometryProgram4.nglProgramVertexLimitNV(n2, n3, l2);
    }

    static native void nglProgramVertexLimitNV(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4, int n5) {
        EXTGeometryShader4.a(n2, n3, n4, n5);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        EXTGeometryShader4.a(n2, n3, n4, n5, n6);
    }

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        EXTGeometryShader4.b(n2, n3, n4, n5, n6);
    }
}

