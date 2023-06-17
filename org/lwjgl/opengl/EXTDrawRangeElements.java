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

public final class EXTDrawRangeElements {
    public static final int a = 33000;
    public static final int b = 33001;

    private EXTDrawRangeElements() {
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sI;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(byteBuffer);
        EXTDrawRangeElements.nglDrawRangeElementsEXT(n2, n3, n4, byteBuffer.remaining(), 5121, o.a(byteBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sI;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.b(intBuffer);
        EXTDrawRangeElements.nglDrawRangeElementsEXT(n2, n3, n4, intBuffer.remaining(), 5125, o.a(intBuffer), l2);
    }

    public static void a(int n2, int n3, int n4, ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.sI;
        org.lwjgl.a.a(l2);
        ft.c(dt2);
        org.lwjgl.a.a(shortBuffer);
        EXTDrawRangeElements.nglDrawRangeElementsEXT(n2, n3, n4, shortBuffer.remaining(), 5123, o.a(shortBuffer), l2);
    }

    static native void nglDrawRangeElementsEXT(int var0, int var1, int var2, int var3, int var4, long var5, long var7);

    public static void a(int n2, int n3, int n4, int n5, int n6, long l2) {
        dt dt2 = GLContext.a();
        long l3 = dt2.sI;
        org.lwjgl.a.a(l3);
        ft.d(dt2);
        EXTDrawRangeElements.nglDrawRangeElementsEXTBO(n2, n3, n4, n5, n6, l2, l3);
    }

    static native void nglDrawRangeElementsEXTBO(int var0, int var1, int var2, int var3, int var4, long var5, long var7);
}

