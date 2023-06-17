/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class NVOcclusionQuery {
    public static final int a = 33125;
    public static final int b = 33126;
    public static final int c = 34916;
    public static final int d = 34917;
    public static final int e = 34918;
    public static final int f = 34919;

    private NVOcclusionQuery() {
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Os;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVOcclusionQuery.nglGenOcclusionQueriesNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenOcclusionQueriesNV(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Os;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        NVOcclusionQuery.nglGenOcclusionQueriesNV(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ot;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVOcclusionQuery.nglDeleteOcclusionQueriesNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteOcclusionQueriesNV(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ot;
        org.lwjgl.a.a(l2);
        NVOcclusionQuery.nglDeleteOcclusionQueriesNV(1, i.c(dt2, n2), l2);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ou;
        org.lwjgl.a.a(l2);
        boolean bl2 = NVOcclusionQuery.nglIsOcclusionQueryNV(n2, l2);
        return bl2;
    }

    static native boolean nglIsOcclusionQueryNV(int var0, long var1);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ov;
        org.lwjgl.a.a(l2);
        NVOcclusionQuery.nglBeginOcclusionQueryNV(n2, l2);
    }

    static native void nglBeginOcclusionQueryNV(int var0, long var1);

    public static void b() {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ow;
        org.lwjgl.a.a(l2);
        NVOcclusionQuery.nglEndOcclusionQueryNV(l2);
    }

    static native void nglEndOcclusionQueryNV(long var0);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ox;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        NVOcclusionQuery.nglGetOcclusionQueryuivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetOcclusionQueryuivNV(int var0, int var1, long var2, long var4);

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Ox;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        NVOcclusionQuery.nglGetOcclusionQueryuivNV(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oy;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        NVOcclusionQuery.nglGetOcclusionQueryivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetOcclusionQueryivNV(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oy;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        NVOcclusionQuery.nglGetOcclusionQueryivNV(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

