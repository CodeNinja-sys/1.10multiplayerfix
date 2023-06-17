/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class ATIVertexAttribArrayObject {
    private ATIVertexAttribArrayObject() {
    }

    public static void a(int n2, int n3, int n4, boolean bl2, int n5, int n6, int n7) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nO;
        a.a(l2);
        ATIVertexAttribArrayObject.nglVertexAttribArrayObjectATI(n2, n3, n4, bl2, n5, n6, n7, l2);
    }

    static native void nglVertexAttribArrayObjectATI(int var0, int var1, int var2, boolean var3, int var4, int var5, int var6, long var7);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nP;
        a.a(l2);
        a.a(floatBuffer, 4);
        ATIVertexAttribArrayObject.nglGetVertexAttribArrayObjectfvATI(n2, n3, o.a(floatBuffer), l2);
    }

    static native void nglGetVertexAttribArrayObjectfvATI(int var0, int var1, long var2, long var4);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nQ;
        a.a(l2);
        a.a(intBuffer, 4);
        ATIVertexAttribArrayObject.nglGetVertexAttribArrayObjectivATI(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetVertexAttribArrayObjectivATI(int var0, int var1, long var2, long var4);
}

