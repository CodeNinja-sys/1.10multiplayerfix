/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public class NVProgram {
    public static final int f = 34374;
    public static final int g = 34343;
    public static final int h = 34375;
    public static final int i = 34344;
    public static final int j = 34379;
    public static final int k = 34932;

    public static void a(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PL;
        a.a(l2);
        a.b(byteBuffer);
        NVProgram.nglLoadProgramNV(n2, n3, byteBuffer.remaining(), o.a(byteBuffer), l2);
    }

    static native void nglLoadProgramNV(int var0, int var1, int var2, long var3, long var5);

    public static void a(int n2, int n3, CharSequence charSequence) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PL;
        a.a(l2);
        NVProgram.nglLoadProgramNV(n2, n3, charSequence.length(), org.lwjgl.opengl.i.a(dt2, charSequence), l2);
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PM;
        a.a(l2);
        NVProgram.nglBindProgramNV(n2, n3, l2);
    }

    static native void nglBindProgramNV(int var0, int var1, long var2);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PN;
        a.a(l2);
        a.b(intBuffer);
        NVProgram.nglDeleteProgramsNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeleteProgramsNV(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PN;
        a.a(l2);
        NVProgram.nglDeleteProgramsNV(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PO;
        a.a(l2);
        a.b(intBuffer);
        NVProgram.nglGenProgramsNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenProgramsNV(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.PO;
        a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVProgram.nglGenProgramsNV(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PP;
        a.a(l2);
        a.b(intBuffer);
        NVProgram.nglGetProgramivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetProgramivNV(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        return NVProgram.c(n2, n3);
    }

    public static int c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PP;
        a.a(l2);
        IntBuffer intBuffer = org.lwjgl.opengl.i.a(dt2);
        NVProgram.nglGetProgramivNV(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PQ;
        a.a(l2);
        a.b(byteBuffer);
        NVProgram.nglGetProgramStringNV(n2, n3, o.a(byteBuffer), l2);
    }

    static native void nglGetProgramStringNV(int var0, int var1, long var2, long var4);

    public static String d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PQ;
        a.a(l2);
        int n4 = NVProgram.c(n2, 34343);
        ByteBuffer byteBuffer = org.lwjgl.opengl.i.a(dt2, n4);
        NVProgram.nglGetProgramStringNV(n2, n3, o.a(byteBuffer), l2);
        byteBuffer.limit(n4);
        return org.lwjgl.opengl.i.a(dt2, byteBuffer);
    }

    public static boolean b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PR;
        a.a(l2);
        boolean bl2 = NVProgram.nglIsProgramNV(n2, l2);
        return bl2;
    }

    static native boolean nglIsProgramNV(int var0, long var1);

    public static boolean a(IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PS;
        a.a(l2);
        a.b(intBuffer);
        a.b(byteBuffer, intBuffer.remaining());
        boolean bl2 = NVProgram.nglAreProgramsResidentNV(intBuffer.remaining(), o.a(intBuffer), o.a(byteBuffer), l2);
        return bl2;
    }

    static native boolean nglAreProgramsResidentNV(int var0, long var1, long var3, long var5);

    public static void c(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PT;
        a.a(l2);
        a.b(intBuffer);
        NVProgram.nglRequestResidentProgramsNV(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglRequestResidentProgramsNV(int var0, long var1, long var3);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PT;
        a.a(l2);
        NVProgram.nglRequestResidentProgramsNV(1, org.lwjgl.opengl.i.c(dt2, n2), l2);
    }
}

