/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import org.lwjgl.a;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class APPLEFlushBufferRange {
    public static final int a = 35346;
    public static final int b = 35347;

    private APPLEFlushBufferRange() {
    }

    public static void a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.hj;
        org.lwjgl.a.a(l2);
        APPLEFlushBufferRange.nglBufferParameteriAPPLE(n2, n3, n4, l2);
    }

    static native void nglBufferParameteriAPPLE(int var0, int var1, int var2, long var3);

    public static void a(int n2, long l2, long l3) {
        dt dt2 = GLContext.a();
        long l4 = dt2.hk;
        org.lwjgl.a.a(l4);
        APPLEFlushBufferRange.nglFlushMappedBufferRangeAPPLE(n2, l2, l3, l4);
    }

    static native void nglFlushMappedBufferRangeAPPLE(int var0, long var1, long var3, long var5);
}

