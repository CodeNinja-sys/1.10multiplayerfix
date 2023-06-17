/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.DoubleBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.ARBVertexAttrib64bit;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.is;

public final class EXTVertexAttrib64bit {
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

    private EXTVertexAttrib64bit() {
    }

    public static void a(int n2, double d2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uE;
        org.lwjgl.a.a(l2);
        EXTVertexAttrib64bit.nglVertexAttribL1dEXT(n2, d2, l2);
    }

    static native void nglVertexAttribL1dEXT(int var0, double var1, long var3);

    public static void a(int n2, double d2, double d3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uF;
        org.lwjgl.a.a(l2);
        EXTVertexAttrib64bit.nglVertexAttribL2dEXT(n2, d2, d3, l2);
    }

    static native void nglVertexAttribL2dEXT(int var0, double var1, double var3, long var5);

    public static void a(int n2, double d2, double d3, double d4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uG;
        org.lwjgl.a.a(l2);
        EXTVertexAttrib64bit.nglVertexAttribL3dEXT(n2, d2, d3, d4, l2);
    }

    static native void nglVertexAttribL3dEXT(int var0, double var1, double var3, double var5, long var7);

    public static void a(int n2, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uH;
        org.lwjgl.a.a(l2);
        EXTVertexAttrib64bit.nglVertexAttribL4dEXT(n2, d2, d3, d4, d5, l2);
    }

    static native void nglVertexAttribL4dEXT(int var0, double var1, double var3, double var5, double var7, long var9);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 1);
        EXTVertexAttrib64bit.nglVertexAttribL1dvEXT(n2, o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribL1dvEXT(int var0, long var1, long var3);

    public static void b(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 2);
        EXTVertexAttrib64bit.nglVertexAttribL2dvEXT(n2, o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribL2dvEXT(int var0, long var1, long var3);

    public static void c(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 3);
        EXTVertexAttrib64bit.nglVertexAttribL3dvEXT(n2, o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribL3dvEXT(int var0, long var1, long var3);

    public static void d(int n2, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTVertexAttrib64bit.nglVertexAttribL4dvEXT(n2, o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribL4dvEXT(int var0, long var1, long var3);

    public static void a(int n2, int n3, int n4, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uM;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(doubleBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).c[n2] = doubleBuffer;
        }
        EXTVertexAttrib64bit.nglVertexAttribLPointerEXT(n2, n3, 5130, n4, o.a(doubleBuffer), l2);
    }

    static native void nglVertexAttribLPointerEXT(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.uM;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        EXTVertexAttrib64bit.nglVertexAttribLPointerEXTBO(n2, n3, 5130, n4, l2, l3);
    }

    static native void nglVertexAttribLPointerEXTBO(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.uN;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(doubleBuffer, 4);
        EXTVertexAttrib64bit.nglGetVertexAttribLdvEXT(n2, n3, o.a(doubleBuffer), l2);
    }

    static native void nglGetVertexAttribLdvEXT(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, int n4, int n5, int n6, int n7, long l2) {
        ARBVertexAttrib64bit.a(n2, n3, n4, n5, n6, n7, l2);
    }
}

