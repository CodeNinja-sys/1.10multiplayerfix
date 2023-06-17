/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;
import org.lwjgl.opengl.is;

public final class EXTVertexWeighting {
    public static final int a = 2979;
    public static final int b = 34050;
    public static final int c = 2982;
    public static final int d = 34054;
    public static final int e = 34057;
    public static final int f = 5888;
    public static final int g = 34058;
    public static final int h = 34059;
    public static final int i = 34060;
    public static final int j = 34061;
    public static final int k = 34062;
    public static final int l = 34063;
    public static final int m = 34064;

    private EXTVertexWeighting() {
    }

    public static void a(float f2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vE;
        org.lwjgl.a.a(l2);
        EXTVertexWeighting.nglVertexWeightfEXT(f2, l2);
    }

    static native void nglVertexWeightfEXT(float var0, long var1);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.vF;
        org.lwjgl.a.a(l2);
        ft.a(dt2);
        org.lwjgl.a.a(floatBuffer);
        if (org.lwjgl.d.j) {
            is.b((dt)dt2).o = floatBuffer;
        }
        EXTVertexWeighting.nglVertexWeightPointerEXT(n2, 5126, n3, o.a(floatBuffer), l2);
    }

    static native void nglVertexWeightPointerEXT(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, int n4, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.vF;
        org.lwjgl.a.a(l3);
        ft.b(dt2);
        EXTVertexWeighting.nglVertexWeightPointerEXTBO(n2, n3, n4, l2, l3);
    }

    static native void nglVertexWeightPointerEXTBO(int var0, int var1, int var2, long var3, long var5);
}

