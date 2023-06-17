/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.x;

public final class CL12GL {
    public static final int a = 8206;
    public static final int b = 8207;
    public static final int c = 8208;
    public static final int d = 8209;

    private CL12GL() {
    }

    public static CLMem a(ab ab2, long l2, int n2, int n3, int n4, IntBuffer intBuffer) {
        long l3 = x.bg;
        org.lwjgl.a.a(l3);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL12GL.nclCreateFromGLTexture(ab2.a(), l2, n2, n3, n4, o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    static native long nclCreateFromGLTexture(long var0, long var2, int var4, int var5, int var6, long var7, long var9);
}

