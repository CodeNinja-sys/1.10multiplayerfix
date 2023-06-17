/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;

public final class NVBindlessMultiDrawIndirect {
    private NVBindlessMultiDrawIndirect() {
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LY;
        a.a(l2);
        ft.e(dt2);
        a.b(byteBuffer, (n4 == 0 ? 20 + 24 * n5 : n4) * n3);
        NVBindlessMultiDrawIndirect.nglMultiDrawArraysIndirectBindlessNV(n2, o.a(byteBuffer), n3, n4, n5, l2);
    }

    static native void nglMultiDrawArraysIndirectBindlessNV(int var0, long var1, int var3, int var4, int var5, long var6);

    public static void a(int n2, long l2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.LY;
        a.a(l3);
        ft.f(dt2);
        NVBindlessMultiDrawIndirect.nglMultiDrawArraysIndirectBindlessNVBO(n2, l2, n3, n4, n5, l3);
    }

    static native void nglMultiDrawArraysIndirectBindlessNVBO(int var0, long var1, int var3, int var4, int var5, long var6);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l2 = dt2.LZ;
        a.a(l2);
        ft.e(dt2);
        a.b(byteBuffer, (n5 == 0 ? 48 + 24 * n6 : n5) * n4);
        NVBindlessMultiDrawIndirect.nglMultiDrawElementsIndirectBindlessNV(n2, n3, o.a(byteBuffer), n4, n5, n6, l2);
    }

    static native void nglMultiDrawElementsIndirectBindlessNV(int var0, int var1, long var2, int var4, int var5, int var6, long var7);

    public static void a(int n2, int n3, long l2, int n4, int n5, int n6) {
        dt dt2 = GLContext.a();
        long l3 = dt2.LZ;
        a.a(l3);
        ft.f(dt2);
        NVBindlessMultiDrawIndirect.nglMultiDrawElementsIndirectBindlessNVBO(n2, n3, l2, n4, n5, n6, l3);
    }

    static native void nglMultiDrawElementsIndirectBindlessNVBO(int var0, int var1, long var2, int var4, int var5, int var6, long var7);
}

