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

public final class AMDNameGenDelete {
    public static final int a = 37201;
    public static final int b = 37202;
    public static final int c = 37203;
    public static final int d = 37204;
    public static final int e = 37205;

    private AMDNameGenDelete() {
    }

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        AMDNameGenDelete.nglGenNamesAMD(n2, intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenNamesAMD(int var0, int var1, long var2, long var4);

    public static int a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gC;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        AMDNameGenDelete.nglGenNamesAMD(n2, 1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        AMDNameGenDelete.nglDeleteNamesAMD(n2, intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteNamesAMD(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gD;
        org.lwjgl.a.a(l2);
        AMDNameGenDelete.nglDeleteNamesAMD(n2, 1, i.c(dt2, n3), l2);
    }

    public static boolean b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gE;
        org.lwjgl.a.a(l2);
        boolean bl2 = AMDNameGenDelete.nglIsNameAMD(n2, n3, l2);
        return bl2;
    }

    static native boolean nglIsNameAMD(int var0, int var1, long var2);
}

