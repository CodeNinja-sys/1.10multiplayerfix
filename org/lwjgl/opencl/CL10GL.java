/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.d;
import org.lwjgl.opencl.z;
import org.lwjgl.x;

public final class CL10GL {
    public static final int a = 8192;
    public static final int b = 8193;
    public static final int c = 8194;
    public static final int d = 8195;
    public static final int e = 8196;
    public static final int f = 8197;

    private CL10GL() {
    }

    public static CLMem a(ab ab2, long l2, int n2, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.ax;
        org.lwjgl.a.a(l3);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10GL.nclCreateFromGLBuffer(ab2.a(), l2, n2, o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    static native long nclCreateFromGLBuffer(long var0, long var2, int var4, long var5, long var7);

    public static CLMem a(ab ab2, long l2, int n2, int n3, int n4, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.ay;
        org.lwjgl.a.a(l3);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10GL.nclCreateFromGLTexture2D(ab2.a(), l2, n2, n3, n4, o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    static native long nclCreateFromGLTexture2D(long var0, long var2, int var4, int var5, int var6, long var7, long var9);

    public static CLMem b(ab ab2, long l2, int n2, int n3, int n4, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.az;
        org.lwjgl.a.a(l3);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10GL.nclCreateFromGLTexture3D(ab2.a(), l2, n2, n3, n4, o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    static native long nclCreateFromGLTexture3D(long var0, long var2, int var4, int var5, int var6, long var7, long var9);

    public static CLMem b(ab ab2, long l2, int n2, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.aA;
        org.lwjgl.a.a(l3);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL10GL.nclCreateFromGLRenderbuffer(ab2.a(), l2, n2, o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    static native long nclCreateFromGLRenderbuffer(long var0, long var2, int var4, long var5, long var7);

    public static int a(CLMem cLMem, IntBuffer intBuffer, IntBuffer intBuffer2) {
        long l2 = org.lwjgl.opencl.x.aB;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        int n2 = CL10GL.nclGetGLObjectInfo(cLMem.a(), o.b(intBuffer), o.b(intBuffer2), l2);
        return n2;
    }

    static native int nclGetGLObjectInfo(long var0, long var2, long var4, long var6);

    public static int a(CLMem cLMem, int n2, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.aC;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n3 = CL10GL.nclGetGLTextureInfo(cLMem.a(), n2, byteBuffer == null ? 0 : byteBuffer.remaining(), o.b(byteBuffer), o.d(x2), l2);
        return n3;
    }

    static native int nclGetGLTextureInfo(long var0, int var2, long var3, long var5, long var7, long var9);

    public static int a(z z2, x x2, x x3, x x4) {
        int n2;
        long l2 = org.lwjgl.opencl.x.aD;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        if (x3 != null) {
            org.lwjgl.a.b(x3);
        }
        if (x4 != null) {
            org.lwjgl.a.a(x4, 1);
        }
        if ((n2 = CL10GL.nclEnqueueAcquireGLObjects(z2.a(), x2.m(), o.c(x2), x3 == null ? 0 : x3.m(), o.d(x3), o.d(x4), l2)) == 0) {
            z2.a(x4);
        }
        return n2;
    }

    static native int nclEnqueueAcquireGLObjects(long var0, int var2, long var3, int var5, long var6, long var8, long var10);

    public static int a(z z2, CLMem cLMem, x x2, x x3) {
        int n2;
        long l2 = org.lwjgl.opencl.x.aD;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n2 = CL10GL.nclEnqueueAcquireGLObjects(z2.a(), 1, org.lwjgl.opencl.d.a(cLMem), x2 == null ? 0 : x2.m(), o.d(x2), o.d(x3), l2)) == 0) {
            z2.a(x3);
        }
        return n2;
    }

    public static int b(z z2, x x2, x x3, x x4) {
        int n2;
        long l2 = org.lwjgl.opencl.x.aE;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        if (x3 != null) {
            org.lwjgl.a.b(x3);
        }
        if (x4 != null) {
            org.lwjgl.a.a(x4, 1);
        }
        if ((n2 = CL10GL.nclEnqueueReleaseGLObjects(z2.a(), x2.m(), o.c(x2), x3 == null ? 0 : x3.m(), o.d(x3), o.d(x4), l2)) == 0) {
            z2.a(x4);
        }
        return n2;
    }

    static native int nclEnqueueReleaseGLObjects(long var0, int var2, long var3, int var5, long var6, long var8, long var10);

    public static int b(z z2, CLMem cLMem, x x2, x x3) {
        int n2;
        long l2 = org.lwjgl.opencl.x.aE;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        if ((n2 = CL10GL.nclEnqueueReleaseGLObjects(z2.a(), 1, org.lwjgl.opencl.d.a(cLMem), x2 == null ? 0 : x2.m(), o.d(x2), o.d(x3), l2)) == 0) {
            z2.a(x3);
        }
        return n2;
    }
}

