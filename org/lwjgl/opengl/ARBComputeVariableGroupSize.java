/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBComputeVariableGroupSize {
    public static final int a = 37700;
    public static final int b = 37099;
    public static final int c = 37701;
    public static final int d = 37311;

    private ARBComputeVariableGroupSize() {
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ik;
        org.lwjgl.a.a(l2);
        ARBComputeVariableGroupSize.nglDispatchComputeGroupSizeARB(n2, n3, n4, n5, n6, n7, l2);
    }

    static native void nglDispatchComputeGroupSizeARB(int var0, int var1, int var2, int var3, int var4, int var5, long var6);
}

