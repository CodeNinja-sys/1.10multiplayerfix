/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class AMDPerformanceMonitor {
    public static final int a = 35776;
    public static final int b = 35777;
    public static final int c = 35778;
    public static final int d = 35779;
    public static final int e = 35780;
    public static final int f = 35781;
    public static final int g = 35782;

    private AMDPerformanceMonitor() {
    }

    public static void a(IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gF;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        org.lwjgl.a.b(intBuffer2);
        AMDPerformanceMonitor.nglGetPerfMonitorGroupsAMD(o.b(intBuffer), intBuffer2.remaining(), o.a(intBuffer2), l2);
    }

    static native void nglGetPerfMonitorGroupsAMD(long var0, int var2, long var3, long var5);

    public static void a(int n2, IntBuffer intBuffer, IntBuffer intBuffer2, IntBuffer intBuffer3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        org.lwjgl.a.a(intBuffer2, 1);
        if (intBuffer3 != null) {
            org.lwjgl.a.b(intBuffer3);
        }
        AMDPerformanceMonitor.nglGetPerfMonitorCountersAMD(n2, o.a(intBuffer), o.a(intBuffer2), intBuffer3 == null ? 0 : intBuffer3.remaining(), o.b(intBuffer3), l2);
    }

    static native void nglGetPerfMonitorCountersAMD(int var0, long var1, long var3, int var5, long var6, long var8);

    public static void a(int n2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gH;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        AMDPerformanceMonitor.nglGetPerfMonitorGroupStringAMD(n2, byteBuffer == null ? 0 : byteBuffer.remaining(), o.b(intBuffer), o.b(byteBuffer), l2);
    }

    static native void nglGetPerfMonitorGroupStringAMD(int var0, int var1, long var2, long var4, long var6);

    public static String a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gH;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.e(dt2);
        ByteBuffer byteBuffer = i.a(dt2, n3);
        AMDPerformanceMonitor.nglGetPerfMonitorGroupStringAMD(n2, n3, o.a((Buffer)intBuffer), o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return i.a(dt2, byteBuffer);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gI;
        org.lwjgl.a.a(l2);
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if (byteBuffer != null) {
            org.lwjgl.a.b(byteBuffer);
        }
        AMDPerformanceMonitor.nglGetPerfMonitorCounterStringAMD(n2, n3, byteBuffer == null ? 0 : byteBuffer.remaining(), o.b(intBuffer), o.b(byteBuffer), l2);
    }

    static native void nglGetPerfMonitorCounterStringAMD(int var0, int var1, int var2, long var3, long var5, long var7);

    public static String a(int n2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gI;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.e(dt2);
        ByteBuffer byteBuffer = i.a(dt2, n4);
        AMDPerformanceMonitor.nglGetPerfMonitorCounterStringAMD(n2, n3, n4, o.a((Buffer)intBuffer), o.a(byteBuffer), l2);
        byteBuffer.limit(intBuffer.get(0));
        return i.a(dt2, byteBuffer);
    }

    public static void a(int n2, int n3, int n4, ByteBuffer byteBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gJ;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(byteBuffer, 16);
        AMDPerformanceMonitor.nglGetPerfMonitorCounterInfoAMD(n2, n3, n4, o.a(byteBuffer), l2);
    }

    static native void nglGetPerfMonitorCounterInfoAMD(int var0, int var1, int var2, long var3, long var5);

    public static void a(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gK;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        AMDPerformanceMonitor.nglGenPerfMonitorsAMD(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglGenPerfMonitorsAMD(int var0, long var1, long var3);

    public static int a() {
        dt dt2 = GLContext.a();
        long l2 = dt2.gK;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        AMDPerformanceMonitor.nglGenPerfMonitorsAMD(1, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gL;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        AMDPerformanceMonitor.nglDeletePerfMonitorsAMD(intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglDeletePerfMonitorsAMD(int var0, long var1, long var3);

    public static void a(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gL;
        org.lwjgl.a.a(l2);
        AMDPerformanceMonitor.nglDeletePerfMonitorsAMD(1, i.c(dt2, n2), l2);
    }

    public static void a(int n2, boolean bl2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gM;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        AMDPerformanceMonitor.nglSelectPerfMonitorCountersAMD(n2, bl2, n3, intBuffer.remaining(), o.a(intBuffer), l2);
    }

    static native void nglSelectPerfMonitorCountersAMD(int var0, boolean var1, int var2, int var3, long var4, long var6);

    public static void a(int n2, boolean bl2, int n3, int n4) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gM;
        org.lwjgl.a.a(l2);
        AMDPerformanceMonitor.nglSelectPerfMonitorCountersAMD(n2, bl2, n3, 1, i.c(dt2, n4), l2);
    }

    public static void b(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gN;
        org.lwjgl.a.a(l2);
        AMDPerformanceMonitor.nglBeginPerfMonitorAMD(n2, l2);
    }

    static native void nglBeginPerfMonitorAMD(int var0, long var1);

    public static void c(int n2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gO;
        org.lwjgl.a.a(l2);
        AMDPerformanceMonitor.nglEndPerfMonitorAMD(n2, l2);
    }

    static native void nglEndPerfMonitorAMD(int var0, long var1);

    public static void a(int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gP;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(intBuffer);
        if (intBuffer2 != null) {
            org.lwjgl.a.a(intBuffer2, 1);
        }
        AMDPerformanceMonitor.nglGetPerfMonitorCounterDataAMD(n2, n3, intBuffer.remaining(), o.a(intBuffer), o.b(intBuffer2), l2);
    }

    static native void nglGetPerfMonitorCounterDataAMD(int var0, int var1, int var2, long var3, long var5, long var7);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.gP;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        AMDPerformanceMonitor.nglGetPerfMonitorCounterDataAMD(n2, n3, 4, o.a(intBuffer), 0L, l2);
        return intBuffer.get(0);
    }
}

