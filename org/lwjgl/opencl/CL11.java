/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ag;
import org.lwjgl.opencl.ai;
import org.lwjgl.opencl.ao;
import org.lwjgl.opencl.y;
import org.lwjgl.opencl.z;
import org.lwjgl.x;

public final class CL11 {
    public static final int a = -13;
    public static final int b = -14;
    public static final int c = -64;
    public static final int d = 1;
    public static final int e = 4148;
    public static final int f = 4149;
    public static final int g = 4150;
    public static final int h = 4151;
    public static final int i = 4152;
    public static final int j = 4153;
    public static final int k = 4154;
    public static final int l = 4155;
    public static final int m = 4156;
    public static final int n = 4157;
    public static final int o = 64;
    public static final int p = 4227;
    public static final int q = 4282;
    public static final int r = 4283;
    public static final int s = 4284;
    public static final int t = 4359;
    public static final int u = 4360;
    public static final int v = 4404;
    public static final int w = 4531;
    public static final int x = 4532;
    public static final int y = 4564;
    public static final int z = 4609;
    public static final int A = 4610;
    public static final int B = 4611;
    public static final int C = 4612;
    public static final int D = 4640;

    private CL11() {
    }

    public static CLMem a(CLMem cLMem, long l2, int n2, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.aG;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer, 2 * org.lwjgl.x.c());
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem2 = CLMem.a(CL11.nclCreateSubBuffer(cLMem.a(), l2, n2, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.b(intBuffer), l3), (ab)cLMem.m());
        return cLMem2;
    }

    static native long nclCreateSubBuffer(long var0, long var2, int var4, long var5, long var7, long var9);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(CLMem cLMem, ao ao2) {
        long l2 = org.lwjgl.opencl.x.aH;
        org.lwjgl.a.a(l2);
        long l3 = CallbackUtil.a(ao2);
        int n2 = 0;
        try {
            int n3 = n2 = CL11.nclSetMemObjectDestructorCallback(cLMem.a(), ao2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    static native int nclSetMemObjectDestructorCallback(long var0, long var2, long var4, long var6);

    public static int a(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, ByteBuffer byteBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aI;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueReadBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(byteBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int a(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, DoubleBuffer doubleBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aI;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(doubleBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueReadBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(doubleBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int a(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, FloatBuffer floatBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aI;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(floatBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueReadBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(floatBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int a(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, IntBuffer intBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aI;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueReadBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(intBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int a(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, LongBuffer longBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aI;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(longBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueReadBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(longBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int a(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, ShortBuffer shortBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aI;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueReadBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(shortBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    static native int nclEnqueueReadBufferRect(long var0, long var2, int var4, long var5, long var7, long var9, long var11, long var13, long var15, long var17, long var19, int var21, long var22, long var24, long var26);

    public static int b(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, ByteBuffer byteBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aJ;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.b(byteBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueWriteBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(byteBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int b(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, DoubleBuffer doubleBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aJ;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(doubleBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueWriteBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(doubleBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int b(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, FloatBuffer floatBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aJ;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(floatBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueWriteBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(floatBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int b(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, IntBuffer intBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aJ;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(intBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueWriteBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(intBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int b(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, LongBuffer longBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aJ;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(longBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueWriteBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(longBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    public static int b(z z2, CLMem cLMem, int n2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, ShortBuffer shortBuffer, x x5, x x6) {
        int n3;
        long l6 = org.lwjgl.opencl.x.aJ;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        org.lwjgl.a.a(shortBuffer, org.lwjgl.opencl.y.a(x3, x4, l4, l5));
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n3 = CL11.nclEnqueueWriteBufferRect(z2.a(), cLMem.a(), n2, org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, org.lwjgl.o.a(shortBuffer), x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n3;
    }

    static native int nclEnqueueWriteBufferRect(long var0, long var2, int var4, long var5, long var7, long var9, long var11, long var13, long var15, long var17, long var19, int var21, long var22, long var24, long var26);

    public static int a(z z2, CLMem cLMem, CLMem cLMem2, x x2, x x3, x x4, long l2, long l3, long l4, long l5, x x5, x x6) {
        int n2;
        long l6 = org.lwjgl.opencl.x.aK;
        org.lwjgl.a.a(l6);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        org.lwjgl.a.a(x4, 3);
        if (x5 != null) {
            org.lwjgl.a.b(x5);
        }
        if (x6 != null) {
            org.lwjgl.a.a(x6, 1);
        }
        if ((n2 = CL11.nclEnqueueCopyBufferRect(z2.a(), cLMem.a(), cLMem2.a(), org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), org.lwjgl.o.c(x4), l2, l3, l4, l5, x5 == null ? 0 : x5.m(), org.lwjgl.o.d(x5), org.lwjgl.o.d(x6), l6)) == 0) {
            z2.a(x6);
        }
        return n2;
    }

    static native int nclEnqueueCopyBufferRect(long var0, long var2, long var4, long var6, long var8, long var10, long var12, long var14, long var16, long var18, int var20, long var21, long var23, long var25);

    public static ag a(ab ab2, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.aL;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ag ag2 = new ag(CL11.nclCreateUserEvent(ab2.a(), org.lwjgl.o.b(intBuffer), l2), ab2);
        return ag2;
    }

    static native long nclCreateUserEvent(long var0, long var2, long var4);

    public static int a(ag ag2, int n2) {
        long l2 = org.lwjgl.opencl.x.aM;
        org.lwjgl.a.a(l2);
        int n3 = CL11.nclSetUserEventStatus(ag2.a(), n2, l2);
        return n3;
    }

    static native int nclSetUserEventStatus(long var0, int var2, long var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ag ag2, int n2, ai ai2) {
        long l2 = org.lwjgl.opencl.x.aN;
        org.lwjgl.a.a(l2);
        long l3 = CallbackUtil.a(ai2);
        ai2.a(ag2.e());
        int n3 = 0;
        try {
            int n4 = n3 = CL11.nclSetEventCallback(ag2.a(), n2, ai2.a(), l3, l2);
            return n4;
        }
        finally {
            CallbackUtil.a(n3, l3);
        }
    }

    static native int nclSetEventCallback(long var0, int var2, long var3, long var5, long var7);
}

