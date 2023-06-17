/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;

public final class ARBIndirectParameters {
    public static final int a = 33006;
    public static final int b = 33007;

    private ARBIndirectParameters() {
    }

    public static void a(int n2, ByteBuffer byteBuffer, long l2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l3 = dt2.jz;
        org.lwjgl.a.a(l3);
        ft.e(dt2);
        org.lwjgl.a.b(byteBuffer, (n4 == 0 ? 16 : n4) * n3);
        ARBIndirectParameters.nglMultiDrawArraysIndirectCountARB(n2, o.a(byteBuffer), l2, n3, n4, l3);
    }

    static native void nglMultiDrawArraysIndirectCountARB(int var0, long var1, long var3, int var5, int var6, long var7);

    public static void a(int n2, long l2, long l3, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l4 = dt2.jz;
        org.lwjgl.a.a(l4);
        ft.f(dt2);
        ARBIndirectParameters.nglMultiDrawArraysIndirectCountARBBO(n2, l2, l3, n3, n4, l4);
    }

    static native void nglMultiDrawArraysIndirectCountARBBO(int var0, long var1, long var3, int var5, int var6, long var7);

    public static void a(int n2, IntBuffer intBuffer, long l2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l3 = dt2.jz;
        org.lwjgl.a.a(l3);
        ft.e(dt2);
        org.lwjgl.a.a(intBuffer, (n4 == 0 ? 4 : n4 >> 2) * n3);
        ARBIndirectParameters.nglMultiDrawArraysIndirectCountARB(n2, o.a(intBuffer), l2, n3, n4, l3);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer, long l2, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.jA;
        org.lwjgl.a.a(l3);
        ft.e(dt2);
        org.lwjgl.a.b(byteBuffer, (n5 == 0 ? 20 : n5) * n4);
        ARBIndirectParameters.nglMultiDrawElementsIndirectCountARB(n2, n3, o.a(byteBuffer), l2, n4, n5, l3);
    }

    static native void nglMultiDrawElementsIndirectCountARB(int var0, int var1, long var2, long var4, int var6, int var7, long var8);

    public static void a(int n2, int n3, long l2, long l3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l4 = dt2.jA;
        org.lwjgl.a.a(l4);
        ft.f(dt2);
        ARBIndirectParameters.nglMultiDrawElementsIndirectCountARBBO(n2, n3, l2, l3, n4, n5, l4);
    }

    static native void nglMultiDrawElementsIndirectCountARBBO(int var0, int var1, long var2, long var4, int var6, int var7, long var8);

    public static void a(int n2, int n3, IntBuffer intBuffer, long l2, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.jA;
        org.lwjgl.a.a(l3);
        ft.e(dt2);
        org.lwjgl.a.a(intBuffer, (n5 == 0 ? 5 : n5 >> 2) * n4);
        ARBIndirectParameters.nglMultiDrawElementsIndirectCountARB(n2, n3, o.a(intBuffer), l2, n4, n5, l3);
    }
}

