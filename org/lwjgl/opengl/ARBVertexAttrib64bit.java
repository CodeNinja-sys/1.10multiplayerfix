/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import org.lwjgl.a;
import org.lwjgl.opengl.GL41;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ARBVertexAttrib64bit {
    public static final int a = 36860;
    public static final int b = 36861;
    public static final int c = 36862;
    public static final int d = 36678;
    public static final int e = 36679;
    public static final int f = 36680;
    public static final int g = 36681;
    public static final int h = 36682;
    public static final int i = 36683;
    public static final int j = 36684;
    public static final int k = 36685;
    public static final int l = 36686;

    private ARBVertexAttrib64bit() {
    }

    public static void a(int n2, double d2) {
        GL41.a(n2, d2);
    }

    public static void a(int n2, double d2, double d3) {
        GL41.a(n2, d2, d3);
    }

    public static void a(int n2, double d2, double d3, double d4) {
        GL41.a(n2, d2, d3, d4);
    }

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        GL41.a(n2, d2, d3, d4, d5);
    }

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        GL41.a(n2, doubleBuffer);
    }

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        GL41.b(n2, doubleBuffer);
    }

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        GL41.c(n2, doubleBuffer);
    }

    public static void d(int n2, DoubleBuffer doubleBuffer) {
        GL41.d(n2, doubleBuffer);
    }

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        GL41.a(n2, n3, n4, doubleBuffer);
    }

    public static void a(int n2, int n3, int n4, long l2) {
        GL41.a(n2, n3, n4, l2);
    }

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        GL41.e(n2, n3, doubleBuffer);
    }

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.mk;
        org.lwjgl.a.a(l3);
        ARBVertexAttrib64bit.nglVertexArrayVertexAttribLOffsetEXT(n2, n3, n4, n5, n6, n7, l2, l3);
    }

    static native void nglVertexArrayVertexAttribLOffsetEXT(int var0, int var1, int var2, int var3, int var4, int var5, long var6, long var8);
}

