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

public final class ATIDrawBuffers {
    public static final int a = 34852;
    public static final int b = 34853;
    public static final int c = 34854;
    public static final int d = 34855;
    public static final int e = 34856;
    public static final int f = 34857;
    public static final int g = 34858;
    public static final int h = 34859;
    public static final int i = 34860;
    public static final int j = 34861;
    public static final int k = 34862;
    public static final int l = 34863;
    public static final int m = 34864;
    public static final int n = 34865;
    public static final int o = 34866;
    public static final int p = 34867;
    public static final int q = 34868;

    private ATIDrawBuffers() {
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.na;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ATIDrawBuffers.nglDrawBuffersATI(intBuffer.remaining(), org.lwjgl.o.a(intBuffer), l2);
    }

    static native void nglDrawBuffersATI(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.na;
        org.lwjgl.a.a(l2);
        ATIDrawBuffers.nglDrawBuffersATI(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }
}

