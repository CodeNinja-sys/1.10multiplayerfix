/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.NVProgram;
import org.lwjgl.opengl.dt;

public final class NVFragmentProgram
extends NVProgram {
    public static final int a = 34928;
    public static final int b = 34929;
    public static final int c = 34930;
    public static final int d = 34931;
    public static final int e = 34920;

    private NVFragmentProgram() {
    }

    public static void a(int n2, ByteBuffer byteBuffer, float f2, float f3, float f4, float f5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVFragmentProgram.nglProgramNamedParameter4fNV(n2, byteBuffer.remaining(), o.a(byteBuffer), f2, f3, f4, f5, l2);
    }

    static native void nglProgramNamedParameter4fNV(int var0, int var1, long var2, float var4, float var5, float var6, float var7, long var8);

    public static void a(int n2, ByteBuffer byteBuffer, double d2, double d3, double d4, double d5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        NVFragmentProgram.nglProgramNamedParameter4dNV(n2, byteBuffer.remaining(), o.a(byteBuffer), d2, d3, d4, d5, l2);
    }

    static native void nglProgramNamedParameter4dNV(int var0, int var1, long var2, double var4, double var6, double var8, double var10, long var12);

    public static void a(int n2, ByteBuffer byteBuffer, FloatBuffer floatBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(floatBuffer, 4);
        NVFragmentProgram.nglGetProgramNamedParameterfvNV(n2, byteBuffer.remaining(), o.a(byteBuffer), o.a(floatBuffer), l2);
    }

    static native void nglGetProgramNamedParameterfvNV(int var0, int var1, long var2, long var4, long var6);

    public static void a(int n2, ByteBuffer byteBuffer, DoubleBuffer doubleBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.MS;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(doubleBuffer, 4);
        NVFragmentProgram.nglGetProgramNamedParameterdvNV(n2, byteBuffer.remaining(), o.a(byteBuffer), o.a(doubleBuffer), l2);
    }

    static native void nglGetProgramNamedParameterdvNV(int var0, int var1, long var2, long var4, long var6);
}

