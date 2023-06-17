/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBDrawBuffersBlend {
    private ARBDrawBuffersBlend() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iq;
        a.a(l2);
        ARBDrawBuffersBlend.nglBlendEquationiARB(n2, n3, l2);
    }

    static native void nglBlendEquationiARB(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ir;
        a.a(l2);
        ARBDrawBuffersBlend.nglBlendEquationSeparateiARB(n2, n3, n4, l2);
    }

    static native void nglBlendEquationSeparateiARB(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.is;
        a.a(l2);
        ARBDrawBuffersBlend.nglBlendFunciARB(n2, n3, n4, l2);
    }

    static native void nglBlendFunciARB(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.it;
        a.a(l2);
        ARBDrawBuffersBlend.nglBlendFuncSeparateiARB(n2, n3, n4, n5, n6, l2);
    }

    static native void nglBlendFuncSeparateiARB(int var0, int var1, int var2, int var3, int var4, long var5);
}

