/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.CLMem;
import org.lwjgl.opencl.CallbackUtil;
import org.lwjgl.opencl.aa;
import org.lwjgl.opencl.ab;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.aj;
import org.lwjgl.opencl.ak;
import org.lwjgl.opencl.am;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.ax;
import org.lwjgl.opencl.ay;
import org.lwjgl.opencl.d;
import org.lwjgl.opencl.z;
import org.lwjgl.x;

public final class CL12 {
    public static final int a = -15;
    public static final int b = -16;
    public static final int c = -17;
    public static final int d = -18;
    public static final int e = -19;
    public static final int f = -65;
    public static final int g = -66;
    public static final int h = -67;
    public static final int i = -68;
    public static final int j = 1;
    public static final int k = 1;
    public static final int l = 0;
    public static final int m = 16;
    public static final int n = 4146;
    public static final int o = 4158;
    public static final int p = 4159;
    public static final int q = 4160;
    public static final int r = 4161;
    public static final int s = 4162;
    public static final int t = 4163;
    public static final int u = 4164;
    public static final int v = 4165;
    public static final int w = 4166;
    public static final int x = 4167;
    public static final int y = 4168;
    public static final int z = 4169;
    public static final int A = 128;
    public static final int B = 4229;
    public static final int C = 4230;
    public static final int D = 4231;
    public static final int E = 0;
    public static final int F = 4232;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 4;
    public static final int J = 8;
    public static final int K = 16;
    public static final int L = 32;
    public static final int M = 128;
    public static final int N = 256;
    public static final int O = 512;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 4339;
    public static final int S = 4340;
    public static final int T = 4341;
    public static final int U = 4342;
    public static final int V = 4375;
    public static final int W = 4376;
    public static final int X = 4377;
    public static final int Y = 4378;
    public static final int Z = 4;
    public static final int aa = 4455;
    public static final int ab = 4456;
    public static final int ac = 4484;
    public static final int ad = 0;
    public static final int ae = 1;
    public static final int af = 2;
    public static final int ag = 4;
    public static final int ah = 4501;
    public static final int ai = 4502;
    public static final int aj = 4503;
    public static final int ak = 4504;
    public static final int al = 4505;
    public static final int am = 4506;
    public static final int an = 4506;
    public static final int ao = 4507;
    public static final int ap = 4508;
    public static final int aq = 4509;
    public static final int ar = 4512;
    public static final int as = 4513;
    public static final int at = 4514;
    public static final int au = 4515;
    public static final int av = 0;
    public static final int aw = 1;
    public static final int ax = 2;
    public static final int ay = 4;
    public static final int az = 4533;
    public static final int aA = 4613;
    public static final int aB = 4614;
    public static final int aC = 4615;
    public static final int aD = 4616;

    private CL12() {
    }

    public static int a(ae ae2) {
        long l2 = org.lwjgl.opencl.x.aP;
        org.lwjgl.a.a(l2);
        int n2 = CL12.nclRetainDevice(ae2.a(), l2);
        if (n2 == 0) {
            ae2.cP_();
        }
        return n2;
    }

    static native int nclRetainDevice(long var0, long var2);

    public static int b(ae ae2) {
        long l2 = org.lwjgl.opencl.x.aQ;
        org.lwjgl.a.a(l2);
        org.lwjgl.opencl.d.a(ae2);
        int n2 = CL12.nclReleaseDevice(ae2.a(), l2);
        if (n2 == 0) {
            ae2.f();
        }
        return n2;
    }

    static native int nclReleaseDevice(long var0, long var2);

    public static int a(ae ae2, LongBuffer longBuffer, x x2, IntBuffer intBuffer) {
        int n2;
        long l2 = org.lwjgl.opencl.x.aR;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        org.lwjgl.a.a(longBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if ((n2 = CL12.nclCreateSubDevices(ae2.a(), org.lwjgl.o.a(longBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.b(intBuffer), l2)) == 0 && x2 != null) {
            ae2.a(x2);
        }
        return n2;
    }

    static native int nclCreateSubDevices(long var0, long var2, int var4, long var5, long var7, long var9);

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.aS;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer, 8);
        org.lwjgl.a.b(byteBuffer2, 7 * org.lwjgl.x.c() + 8 + org.lwjgl.x.c());
        if (byteBuffer3 != null) {
            org.lwjgl.a.b(byteBuffer3);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL12.nclCreateImage(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), org.lwjgl.o.b(byteBuffer3), org.lwjgl.o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, FloatBuffer floatBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.aS;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer, 8);
        org.lwjgl.a.b(byteBuffer2, 7 * org.lwjgl.x.c() + 8 + org.lwjgl.x.c());
        if (floatBuffer != null) {
            org.lwjgl.a.a(floatBuffer);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL12.nclCreateImage(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), org.lwjgl.o.b(floatBuffer), org.lwjgl.o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, IntBuffer intBuffer, IntBuffer intBuffer2) {
        long l3 = org.lwjgl.opencl.x.aS;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer, 8);
        org.lwjgl.a.b(byteBuffer2, 7 * org.lwjgl.x.c() + 8 + org.lwjgl.x.c());
        if (intBuffer != null) {
            org.lwjgl.a.b(intBuffer);
        }
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        CLMem cLMem = new CLMem(CL12.nclCreateImage(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), org.lwjgl.o.b(intBuffer), org.lwjgl.o.b(intBuffer2), l3), ab2);
        return cLMem;
    }

    public static CLMem a(ab ab2, long l2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ShortBuffer shortBuffer, IntBuffer intBuffer) {
        long l3 = org.lwjgl.opencl.x.aS;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(byteBuffer, 8);
        org.lwjgl.a.b(byteBuffer2, 7 * org.lwjgl.x.c() + 8 + org.lwjgl.x.c());
        if (shortBuffer != null) {
            org.lwjgl.a.a(shortBuffer);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        CLMem cLMem = new CLMem(CL12.nclCreateImage(ab2.a(), l2, org.lwjgl.o.a(byteBuffer), org.lwjgl.o.a(byteBuffer2), org.lwjgl.o.b(shortBuffer), org.lwjgl.o.b(intBuffer), l3), ab2);
        return cLMem;
    }

    static native long nclCreateImage(long var0, long var2, long var4, long var6, long var8, long var10, long var12);

    public static ay a(ab ab2, x x2, ByteBuffer byteBuffer, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.aT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        org.lwjgl.a.b(byteBuffer);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ay ay2 = new ay(CL12.nclCreateProgramWithBuiltInKernels(ab2.a(), x2.m(), org.lwjgl.o.c(x2), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.b(intBuffer), l2), ab2);
        return ay2;
    }

    static native long nclCreateProgramWithBuiltInKernels(long var0, int var2, long var3, long var5, long var7, long var9);

    public static ay a(ab ab2, x x2, CharSequence charSequence, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.aT;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(x2, 1);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        ay ay2 = new ay(CL12.nclCreateProgramWithBuiltInKernels(ab2.a(), x2.m(), org.lwjgl.o.c(x2), org.lwjgl.opencl.d.a(charSequence), org.lwjgl.o.b(intBuffer), l2), ab2);
        return ay2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ay ay2, x x2, ByteBuffer byteBuffer, x x3, ByteBuffer byteBuffer2, aa aa2) {
        long l2 = org.lwjgl.opencl.x.aU;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        org.lwjgl.a.a(x3, 1);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.a(byteBuffer2);
        long l3 = CallbackUtil.a(aa2);
        if (aa2 != null) {
            aa2.a((ab)ay2.m());
        }
        int n2 = 0;
        try {
            int n3 = n2 = CL12.nclCompileProgram(ay2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.a(byteBuffer), 1, org.lwjgl.o.c(x3), org.lwjgl.o.a(byteBuffer2), aa2 == null ? 0L : aa2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    static native int nclCompileProgram(long var0, int var2, long var3, long var5, int var7, long var8, long var10, long var12, long var14, long var16);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int b(ay ay2, x x2, ByteBuffer byteBuffer, x x3, ByteBuffer byteBuffer2, aa aa2) {
        long l2 = org.lwjgl.opencl.x.aU;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        org.lwjgl.a.a(x3, 1);
        org.lwjgl.a.b(byteBuffer2);
        org.lwjgl.a.a(byteBuffer2, x3.m());
        long l3 = CallbackUtil.a(aa2);
        if (aa2 != null) {
            aa2.a((ab)ay2.m());
        }
        int n2 = 0;
        try {
            int n3 = n2 = CL12.nclCompileProgramMulti(ay2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.a(byteBuffer), x3.m(), org.lwjgl.o.c(x3), org.lwjgl.o.a(byteBuffer2), aa2 == null ? 0L : aa2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    static native int nclCompileProgramMulti(long var0, int var2, long var3, long var5, int var7, long var8, long var10, long var12, long var14, long var16);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ay ay2, x x2, ByteBuffer byteBuffer, x x3, ByteBuffer[] arrbyteBuffer, aa aa2) {
        long l2 = org.lwjgl.opencl.x.aU;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        org.lwjgl.a.a(x3, arrbyteBuffer.length);
        org.lwjgl.a.a(arrbyteBuffer, 1);
        long l3 = CallbackUtil.a(aa2);
        if (aa2 != null) {
            aa2.a((ab)ay2.m());
        }
        int n2 = 0;
        try {
            int n3 = n2 = CL12.nclCompileProgram3(ay2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.a(byteBuffer), arrbyteBuffer.length, org.lwjgl.o.c(x3), arrbyteBuffer, aa2 == null ? 0L : aa2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    static native int nclCompileProgram3(long var0, int var2, long var3, long var5, int var7, long var8, ByteBuffer[] var10, long var11, long var13, long var15);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ay ay2, x x2, CharSequence charSequence, x x3, CharSequence charSequence2, aa aa2) {
        long l2 = org.lwjgl.opencl.x.aU;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        org.lwjgl.a.a(x3, 1);
        long l3 = CallbackUtil.a(aa2);
        if (aa2 != null) {
            aa2.a((ab)ay2.m());
        }
        int n2 = 0;
        try {
            int n3 = n2 = CL12.nclCompileProgram(ay2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.opencl.d.b(charSequence), 1, org.lwjgl.o.c(x3), org.lwjgl.opencl.d.b(charSequence2), aa2 == null ? 0L : aa2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ay ay2, x x2, CharSequence charSequence, x x3, CharSequence[] arrcharSequence, aa aa2) {
        long l2 = org.lwjgl.opencl.x.aU;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        org.lwjgl.a.a(x3, 1);
        org.lwjgl.a.a(arrcharSequence);
        long l3 = CallbackUtil.a(aa2);
        if (aa2 != null) {
            aa2.a((ab)ay2.m());
        }
        int n2 = 0;
        try {
            int n3 = n2 = CL12.nclCompileProgramMulti(ay2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.opencl.d.b(charSequence), x3.m(), org.lwjgl.o.c(x3), org.lwjgl.opencl.d.c(arrcharSequence), aa2 == null ? 0L : aa2.a(), l3, l2);
            return n3;
        }
        finally {
            CallbackUtil.a(n2, l3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ay a(ab ab2, x x2, ByteBuffer byteBuffer, x x3, am am2, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.aV;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        org.lwjgl.a.b(x3);
        org.lwjgl.a.a(intBuffer, 1);
        long l3 = CallbackUtil.a(am2);
        if (am2 != null) {
            am2.a(ab2);
        }
        ay ay2 = null;
        try {
            ay ay3 = ay2 = new ay(CL12.nclLinkProgram(ab2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.a(byteBuffer), x3.m(), org.lwjgl.o.c(x3), am2 == null ? 0L : am2.a(), l3, org.lwjgl.o.a(intBuffer), l2), ab2);
            return ay3;
        }
        finally {
            CallbackUtil.a(intBuffer.get(intBuffer.position()), l3);
        }
    }

    static native long nclLinkProgram(long var0, int var2, long var3, long var5, int var7, long var8, long var10, long var12, long var14, long var16);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ay a(ab ab2, x x2, CharSequence charSequence, x x3, am am2, IntBuffer intBuffer) {
        long l2 = org.lwjgl.opencl.x.aV;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        org.lwjgl.a.b(x3);
        org.lwjgl.a.a(intBuffer, 1);
        long l3 = CallbackUtil.a(am2);
        if (am2 != null) {
            am2.a(ab2);
        }
        ay ay2 = null;
        try {
            ay ay3 = ay2 = new ay(CL12.nclLinkProgram(ab2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.opencl.d.b(charSequence), x3.m(), org.lwjgl.o.c(x3), am2 == null ? 0L : am2.a(), l3, org.lwjgl.o.a(intBuffer), l2), ab2);
            return ay3;
        }
        finally {
            CallbackUtil.a(intBuffer.get(intBuffer.position()), l3);
        }
    }

    public static int a(au au2) {
        long l2 = org.lwjgl.opencl.x.aW;
        org.lwjgl.a.a(l2);
        int n2 = CL12.nclUnloadPlatformCompiler(au2.a(), l2);
        return n2;
    }

    static native int nclUnloadPlatformCompiler(long var0, long var2);

    public static int a(ak ak2, int n2, int n3, ByteBuffer byteBuffer, x x2) {
        long l2 = org.lwjgl.opencl.x.aX;
        org.lwjgl.a.a(l2);
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        if (x2 != null) {
            org.lwjgl.a.a(x2, 1);
        }
        int n4 = CL12.nclGetKernelArgInfo(ak2.a(), n2, n3, byteBuffer == null ? 0 : byteBuffer.remaining(), org.lwjgl.o.b(byteBuffer), org.lwjgl.o.d(x2), l2);
        return n4;
    }

    static native int nclGetKernelArgInfo(long var0, int var2, int var3, long var4, long var6, long var8, long var10);

    public static int a(z z2, CLMem cLMem, ByteBuffer byteBuffer, long l2, long l3, x x2, x x3) {
        long l4 = org.lwjgl.opencl.x.aY;
        org.lwjgl.a.a(l4);
        org.lwjgl.a.b(byteBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        int n2 = CL12.nclEnqueueFillBuffer(z2.a(), cLMem.a(), org.lwjgl.o.a(byteBuffer), byteBuffer.remaining(), l2, l3, x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l4);
        return n2;
    }

    static native int nclEnqueueFillBuffer(long var0, long var2, long var4, long var6, long var8, long var10, int var12, long var13, long var15, long var17);

    public static int a(z z2, CLMem cLMem, ByteBuffer byteBuffer, x x2, x x3, x x4, x x5) {
        long l2 = org.lwjgl.opencl.x.aZ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 16);
        org.lwjgl.a.a(x2, 3);
        org.lwjgl.a.a(x3, 3);
        if (x4 != null) {
            org.lwjgl.a.b(x4);
        }
        if (x5 != null) {
            org.lwjgl.a.a(x5, 1);
        }
        int n2 = CL12.nclEnqueueFillImage(z2.a(), cLMem.a(), org.lwjgl.o.a(byteBuffer), org.lwjgl.o.c(x2), org.lwjgl.o.c(x3), x4 == null ? 0 : x4.m(), org.lwjgl.o.d(x4), org.lwjgl.o.d(x5), l2);
        return n2;
    }

    static native int nclEnqueueFillImage(long var0, long var2, long var4, long var6, long var8, int var10, long var11, long var13, long var15);

    public static int a(z z2, x x2, long l2, x x3, x x4) {
        long l3 = org.lwjgl.opencl.x.ba;
        org.lwjgl.a.a(l3);
        org.lwjgl.a.b(x2);
        if (x3 != null) {
            org.lwjgl.a.b(x3);
        }
        if (x4 != null) {
            org.lwjgl.a.a(x4, 1);
        }
        int n2 = CL12.nclEnqueueMigrateMemObjects(z2.a(), x2.m(), org.lwjgl.o.c(x2), l2, x3 == null ? 0 : x3.m(), org.lwjgl.o.d(x3), org.lwjgl.o.d(x4), l3);
        return n2;
    }

    static native int nclEnqueueMigrateMemObjects(long var0, int var2, long var3, long var5, int var7, long var8, long var10, long var12);

    public static int a(z z2, x x2, x x3) {
        long l2 = org.lwjgl.opencl.x.bb;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        int n2 = CL12.nclEnqueueMarkerWithWaitList(z2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l2);
        return n2;
    }

    static native int nclEnqueueMarkerWithWaitList(long var0, int var2, long var3, long var5, long var7);

    public static int b(z z2, x x2, x x3) {
        long l2 = org.lwjgl.opencl.x.bc;
        org.lwjgl.a.a(l2);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (x3 != null) {
            org.lwjgl.a.a(x3, 1);
        }
        int n2 = CL12.nclEnqueueBarrierWithWaitList(z2.a(), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.d(x3), l2);
        return n2;
    }

    static native int nclEnqueueBarrierWithWaitList(long var0, int var2, long var3, long var5, long var7);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(ab ab2, ax ax2) {
        long l2 = org.lwjgl.opencl.x.bd;
        org.lwjgl.a.a(l2);
        long l3 = CallbackUtil.a(ax2);
        int n2 = 0;
        try {
            int n3 = n2 = CL12.nclSetPrintfCallback(ab2.a(), ax2.a(), l3, l2);
            return n3;
        }
        finally {
            ab2.b(l3, n2);
        }
    }

    static native int nclSetPrintfCallback(long var0, long var2, long var4, long var6);

    static aj a(au au2, ByteBuffer byteBuffer) {
        long l2 = org.lwjgl.opencl.x.be;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer);
        org.lwjgl.a.a(byteBuffer);
        aj aj2 = new aj(CL12.nclGetExtensionFunctionAddressForPlatform(au2.a(), org.lwjgl.o.a(byteBuffer), l2));
        return aj2;
    }

    static native long nclGetExtensionFunctionAddressForPlatform(long var0, long var2, long var4);

    static aj a(au au2, CharSequence charSequence) {
        long l2 = org.lwjgl.opencl.x.be;
        org.lwjgl.a.a(l2);
        aj aj2 = new aj(CL12.nclGetExtensionFunctionAddressForPlatform(au2.a(), org.lwjgl.opencl.d.b(charSequence), l2));
        return aj2;
    }
}

