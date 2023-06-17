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

public final class ARBOcclusionQuery {
    public static final int a = 35092;
    public static final int b = 34916;
    public static final int c = 34917;
    public static final int d = 34918;
    public static final int e = 34919;

    private ARBOcclusionQuery() {
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ka;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBOcclusionQuery.nglGenQueriesARB(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenQueriesARB(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.ka;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        ARBOcclusionQuery.nglGenQueriesARB(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ARBOcclusionQuery.nglDeleteQueriesARB(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteQueriesARB(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kb;
        org.lwjgl.a.a(l2);
        ARBOcclusionQuery.nglDeleteQueriesARB(1, i.c(dt2, n2), l2);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kc;
        org.lwjgl.a.a(l2);
        boolean bl2 = ARBOcclusionQuery.nglIsQueryARB(n2, l2);
        return bl2;
    }

    static native boolean nglIsQueryARB(int var0, long var1);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kd;
        org.lwjgl.a.a(l2);
        ARBOcclusionQuery.nglBeginQueryARB(n2, n3, l2);
    }

    static native void nglBeginQueryARB(int var0, int var1, long var2);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.ke;
        org.lwjgl.a.a(l2);
        ARBOcclusionQuery.nglEndQueryARB(n2, l2);
    }

    static native void nglEndQueryARB(int var0, long var1);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kf;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        ARBOcclusionQuery.nglGetQueryivARB(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetQueryivARB(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        return ARBOcclusionQuery.c(n2, n3);
    }

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kf;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        ARBOcclusionQuery.nglGetQueryivARB(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kg;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        ARBOcclusionQuery.nglGetQueryObjectivARB(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetQueryObjectivARB(int var0, int var1, long var2, long var4);

    public static int d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kg;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        ARBOcclusionQuery.nglGetQueryObjectivARB(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void c(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kh;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        ARBOcclusionQuery.nglGetQueryObjectuivARB(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetQueryObjectuivARB(int var0, int var1, long var2, long var4);

    public static int e(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.kh;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        ARBOcclusionQuery.nglGetQueryObjectuivARB(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

