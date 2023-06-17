/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GL43;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class ARBFramebufferNoAttachments {
    public static final int a = 37648;
    public static final int b = 37649;
    public static final int c = 37650;
    public static final int d = 37651;
    public static final int e = 37652;
    public static final int f = 37653;
    public static final int g = 37654;
    public static final int h = 37655;
    public static final int i = 37656;

    private ARBFramebufferNoAttachments() {
    }

    public static void a(int n2, int n3, int n4) {
        GL43.c(n2, n3, n4);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        GL43.a(n2, n3, intBuffer);
    }

    public static int a(int n2, int n3) {
        return GL43.a(n2, n3);
    }

    public static void b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.iw;
        org.lwjgl.a.a(l2);
        ARBFramebufferNoAttachments.nglNamedFramebufferParameteriEXT(n2, n3, n4, l2);
    }

    static native void nglNamedFramebufferParameteriEXT(int var0, int var1, int var2, long var3);

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ix;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        ARBFramebufferNoAttachments.nglGetNamedFramebufferParameterivEXT(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetNamedFramebufferParameterivEXT(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ix;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        ARBFramebufferNoAttachments.nglGetNamedFramebufferParameterivEXT(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

