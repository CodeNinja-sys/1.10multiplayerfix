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

public final class ATIElementArray {
    public static final int a = 34664;
    public static final int b = 34665;
    public static final int c = 34666;

    private ATIElementArray() {
    }

    public static void a(ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        ATIElementArray.nglElementPointerATI(5121, o.a(byteBuffer), l2);
    }

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        ATIElementArray.nglElementPointerATI(5125, o.a(intBuffer), l2);
    }

    public static void a(ShortBuffer shortBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nb;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(shortBuffer);
        ATIElementArray.nglElementPointerATI(5123, o.a(shortBuffer), l2);
    }

    static native void nglElementPointerATI(int var0, long var1, long var3);

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nc;
        org.lwjgl.a.a(l2);
        ATIElementArray.nglDrawElementArrayATI(n2, n3, l2);
    }

    static native void nglDrawElementArrayATI(int var0, int var1, long var2);

    public static void a(int n2, int n3, int n4, int n5) {
        dt dt2 = GLContext.a();
        long l2 = dt2.nd;
        org.lwjgl.a.a(l2);
        ATIElementArray.nglDrawRangeElementArrayATI(n2, n3, n4, n5, l2);
    }

    static native void nglDrawRangeElementArrayATI(int var0, int var1, int var2, int var3, long var4);
}

