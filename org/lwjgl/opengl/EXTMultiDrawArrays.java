/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;

public final class EXTMultiDrawArrays {
    private EXTMultiDrawArrays() {
    }

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.tT;
        a.a(l2);
        a.b(intBuffer);
        a.a(intBuffer2, intBuffer.remaining());
        EXTMultiDrawArrays.nglMultiDrawArraysEXT(n2, o.a(intBuffer), o.a(intBuffer2), intBuffer.remaining(), l2);
    }

    static native void nglMultiDrawArraysEXT(int var0, long var1, long var3, int var5, long var6);
}

