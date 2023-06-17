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

public final class NVParameterBufferObject {
    public static final int a = 36256;
    public static final int b = 36257;
    public static final int c = 36258;
    public static final int d = 36259;
    public static final int e = 36260;

    private NVParameterBufferObject() {
    }

    public static void a(int n2, int n3, int n4, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.Oz;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(floatBuffer);
        NVParameterBufferObject.nglProgramBufferParametersfvNV(n2, n3, n4, floatBuffer.remaining() >> 2, o.a(floatBuffer), l2);
    }

    static native void nglProgramBufferParametersfvNV(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OA;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVParameterBufferObject.nglProgramBufferParametersIivNV(n2, n3, n4, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglProgramBufferParametersIivNV(int var0, int var1, int var2, int var3, long var4, long var6);

    public static void b(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.OB;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        NVParameterBufferObject.nglProgramBufferParametersIuivNV(n2, n3, n4, intBuffer.remaining() >> 2, o.a(intBuffer), l2);
    }

    static native void nglProgramBufferParametersIuivNV(int var0, int var1, int var2, int var3, long var4, long var6);
}

