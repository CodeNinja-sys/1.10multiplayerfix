/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.ft;

public final class EXTDrawInstanced {
    private EXTDrawInstanced() {
    }

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sG;
        a.a(l2);
        EXTDrawInstanced.nglDrawArraysInstancedEXT(n2, n3, n4, n5, l2);
    }

    static native void nglDrawArraysInstancedEXT(int var0, int var1, int var2, int var3, long var4);

    public static void a(int n2, ByteBuffer byteBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sH;
        a.a(l2);
        ft.c(dt2);
        a.b(byteBuffer);
        EXTDrawInstanced.nglDrawElementsInstancedEXT(n2, byteBuffer.remaining(), 5121, o.a(byteBuffer), n3, l2);
    }

    public static void a(int n2, IntBuffer intBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sH;
        a.a(l2);
        ft.c(dt2);
        a.b(intBuffer);
        EXTDrawInstanced.nglDrawElementsInstancedEXT(n2, intBuffer.remaining(), 5125, o.a(intBuffer), n3, l2);
    }

    public static void a(int n2, ShortBuffer shortBuffer, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sH;
        a.a(l2);
        ft.c(dt2);
        a.a(shortBuffer);
        EXTDrawInstanced.nglDrawElementsInstancedEXT(n2, shortBuffer.remaining(), 5123, o.a(shortBuffer), n3, l2);
    }

    static native void nglDrawElementsInstancedEXT(int var0, int var1, int var2, long var3, int var5, long var6);

    public static void a(int n2, int n3, int n4, long l2, int n5) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sH;
        a.a(l3);
        ft.d(dt2);
        EXTDrawInstanced.nglDrawElementsInstancedEXTBO(n2, n3, n4, l2, n5, l3);
    }

    static native void nglDrawElementsInstancedEXTBO(int var0, int var1, int var2, long var3, int var5, long var6);
}

