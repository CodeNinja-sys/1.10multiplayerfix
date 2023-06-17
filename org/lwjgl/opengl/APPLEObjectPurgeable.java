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

public final class APPLEObjectPurgeable {
    public static final int a = 35353;
    public static final int b = 35354;
    public static final int c = 35355;
    public static final int d = 35356;
    public static final int e = 35357;
    public static final int f = 34227;

    private APPLEObjectPurgeable() {
    }

    public static int a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hl;
        org.lwjgl.a.a(l2);
        int n5 = APPLEObjectPurgeable.nglObjectPurgeableAPPLE(n2, n3, n4, l2);
        return n5;
    }

    static native int nglObjectPurgeableAPPLE(int var0, int var1, int var2, long var3);

    public static int b(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hm;
        org.lwjgl.a.a(l2);
        int n5 = APPLEObjectPurgeable.nglObjectUnpurgeableAPPLE(n2, n3, n4, l2);
        return n5;
    }

    static native int nglObjectUnpurgeableAPPLE(int var0, int var1, int var2, long var3);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hn;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        APPLEObjectPurgeable.nglGetObjectParameterivAPPLE(n2, n3, n4, o.a(intBuffer), l2);
    }

    static native void nglGetObjectParameterivAPPLE(int var0, int var1, int var2, long var3, long var5);

    public static int c(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hn;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        APPLEObjectPurgeable.nglGetObjectParameterivAPPLE(n2, n3, n4, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }
}

