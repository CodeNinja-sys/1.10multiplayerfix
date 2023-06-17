/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBInstancedArrays {
    public static final int a = 35070;

    private ARBInstancedArrays() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.jB;
        org.lwjgl.a.a(l2);
        ARBInstancedArrays.nglVertexAttribDivisorARB(n2, n3, l2);
    }

    static native void nglVertexAttribDivisorARB(int var0, int var1, long var2);
}

