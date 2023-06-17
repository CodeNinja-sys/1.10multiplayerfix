/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBColorBufferFloat {
    public static final int a = 34848;
    public static final int b = 35098;
    public static final int c = 35099;
    public static final int d = 35100;
    public static final int e = 35101;
    public static final int f = 8608;
    public static final int g = 8377;
    public static final int h = 4;

    private ARBColorBufferFloat() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ij;
        org.lwjgl.a.a(l2);
        ARBColorBufferFloat.nglClampColorARB(n2, n3, l2);
    }

    static native void nglClampColorARB(int var0, int var1, long var2);
}

