/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class NVPointSprite {
    public static final int a = 34913;
    public static final int b = 34914;
    public static final int c = 34915;

    private NVPointSprite() {
    }

    public static void a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PB;
        org.lwjgl.a.a(l2);
        NVPointSprite.nglPointParameteriNV(n2, n3, l2);
    }

    static native void nglPointParameteriNV(int var0, int var1, long var2);

    public static void a(int n2, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PC;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 4);
        NVPointSprite.nglPointParameterivNV(n2, o.a(intBuffer), l2);
    }

    static native void nglPointParameterivNV(int var0, long var1, long var3);
}

