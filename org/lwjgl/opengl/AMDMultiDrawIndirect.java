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

public final class AMDMultiDrawIndirect {
    private AMDMultiDrawIndirect() {
    }

    public static void a(int n2, ByteBuffer byteBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gA;
        a.a(l2);
        ft.e(dt2);
        a.b(byteBuffer, (n4 == 0 ? 16 : n4) * n3);
        AMDMultiDrawIndirect.nglMultiDrawArraysIndirectAMD(n2, o.a(byteBuffer), n3, n4, l2);
    }

    static native void nglMultiDrawArraysIndirectAMD(int var0, long var1, int var3, int var4, long var5);

    public static void a(int n2, long l2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l3 = dt2.gA;
        a.a(l3);
        ft.f(dt2);
        AMDMultiDrawIndirect.nglMultiDrawArraysIndirectAMDBO(n2, l2, n3, n4, l3);
    }

    static native void nglMultiDrawArraysIndirectAMDBO(int var0, long var1, int var3, int var4, long var5);

    public static void a(int n2, IntBuffer intBuffer, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gA;
        a.a(l2);
        ft.e(dt2);
        a.a(intBuffer, (n4 == 0 ? 4 : n4 >> 2) * n3);
        AMDMultiDrawIndirect.nglMultiDrawArraysIndirectAMD(n2, o.a(intBuffer), n3, n4, l2);
    }

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gB;
        a.a(l2);
        ft.e(dt2);
        a.b(byteBuffer, (n5 == 0 ? 20 : n5) * n4);
        AMDMultiDrawIndirect.nglMultiDrawElementsIndirectAMD(n2, n3, o.a(byteBuffer), n4, n5, l2);
    }

    static native void nglMultiDrawElementsIndirectAMD(int var0, int var1, long var2, int var4, int var5, long var6);

    public static void a(int n2, int n3, long l2, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.gB;
        a.a(l3);
        ft.f(dt2);
        AMDMultiDrawIndirect.nglMultiDrawElementsIndirectAMDBO(n2, n3, l2, n4, n5, l3);
    }

    static native void nglMultiDrawElementsIndirectAMDBO(int var0, int var1, long var2, int var4, int var5, long var6);

    public static void a(int n2, int n3, IntBuffer intBuffer, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gB;
        a.a(l2);
        ft.e(dt2);
        a.a(intBuffer, (n5 == 0 ? 5 : n5 >> 2) * n4);
        AMDMultiDrawIndirect.nglMultiDrawElementsIndirectAMD(n2, n3, o.a(intBuffer), n4, n5, l2);
    }
}

