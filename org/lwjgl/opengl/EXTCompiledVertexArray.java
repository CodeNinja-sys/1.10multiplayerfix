/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTCompiledVertexArray {
    public static final int a = 33192;
    public static final int b = 33193;

    private EXTCompiledVertexArray() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.os;
        org.lwjgl.a.a(l2);
        EXTCompiledVertexArray.nglLockArraysEXT(n2, n3, l2);
    }

    static native void nglLockArraysEXT(int var0, int var1, long var2);

    public static void a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.ot;
        org.lwjgl.a.a(l2);
        EXTCompiledVertexArray.nglUnlockArraysEXT(l2);
    }

    static native void nglUnlockArraysEXT(long var0);
}

