/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTBindableUniform {
    public static final int a = 36322;
    public static final int b = 36323;
    public static final int c = 36324;
    public static final int d = 36333;
    public static final int e = 36335;
    public static final int f = 36334;

    private EXTBindableUniform() {
    }

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ol;
        org.lwjgl.a.a(l2);
        EXTBindableUniform.nglUniformBufferEXT(n2, n3, n4, l2);
    }

    static native void nglUniformBufferEXT(int var0, int var1, int var2, long var3);

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.om;
        org.lwjgl.a.a(l2);
        int n4 = EXTBindableUniform.nglGetUniformBufferSizeEXT(n2, n3, l2);
        return n4;
    }

    static native int nglGetUniformBufferSizeEXT(int var0, int var1, long var2);

    public static long b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.on;
        org.lwjgl.a.a(l2);
        long l3 = EXTBindableUniform.nglGetUniformOffsetEXT(n2, n3, l2);
        return l3;
    }

    static native long nglGetUniformOffsetEXT(int var0, int var1, long var2);
}

