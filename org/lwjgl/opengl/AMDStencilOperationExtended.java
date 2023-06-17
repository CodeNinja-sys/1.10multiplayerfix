/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class AMDStencilOperationExtended {
    public static final int a = 34634;
    public static final int b = 34635;
    public static final int c = 34636;
    public static final int d = 34637;

    private AMDStencilOperationExtended() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gT;
        org.lwjgl.a.a(l2);
        AMDStencilOperationExtended.nglStencilOpValueAMD(n2, n3, l2);
    }

    static native void nglStencilOpValueAMD(int var0, int var1, long var2);
}

