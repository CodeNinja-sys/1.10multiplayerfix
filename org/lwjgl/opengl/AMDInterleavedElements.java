/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class AMDInterleavedElements {
    public static final int a = 37284;
    public static final int b = 37285;

    private AMDInterleavedElements() {
    }

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gz;
        org.lwjgl.a.a(l2);
        AMDInterleavedElements.nglVertexAttribParameteriAMD(n2, n3, n4, l2);
    }

    static native void nglVertexAttribParameteriAMD(int var0, int var1, int var2, long var3);
}

