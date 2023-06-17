/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTProvokingVertex {
    public static final int a = 36429;
    public static final int b = 36430;
    public static final int c = 36431;
    public static final int d = 36428;

    private EXTProvokingVertex() {
    }

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ub;
        org.lwjgl.a.a(l2);
        EXTProvokingVertex.nglProvokingVertexEXT(n2, l2);
    }

    static native void nglProvokingVertexEXT(int var0, long var1);
}

