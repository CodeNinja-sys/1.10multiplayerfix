/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opengl;

import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dt;
import org.lwjgl.opengl.i;

public final class NVPresentVideo {
    public static final int a = 36390;
    public static final int b = 36391;
    public static final int c = 36392;
    public static final int d = 36393;
    public static final int e = 36394;
    public static final int f = 36395;
    public static final int g = 8432;

    private NVPresentVideo() {
    }

    public static void a(int n2, long l2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        dt dt2 = GLContext.a();
        long l3 = dt2.PD;
        org.lwjgl.a.a(l3);
        NVPresentVideo.nglPresentFrameKeyedNV(n2, l2, n3, n4, n5, n6, n7, n8, n9, n10, n11, l3);
    }

    static native void nglPresentFrameKeyedNV(int var0, long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, long var12);

    public static void a(int n2, long l2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13) {
        dt dt2 = GLContext.a();
        long l3 = dt2.PE;
        org.lwjgl.a.a(l3);
        NVPresentVideo.nglPresentFrameDualFillNV(n2, l2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, l3);
    }

    static native void nglPresentFrameDualFillNV(int var0, long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, long var14);

    public static void a(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PF;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        NVPresentVideo.nglGetVideoivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetVideoivNV(int var0, int var1, long var2, long var4);

    public static int a(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PF;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        NVPresentVideo.nglGetVideoivNV(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void b(int n2, int n3, IntBuffer intBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PG;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(intBuffer, 1);
        NVPresentVideo.nglGetVideouivNV(n2, n3, o.a(intBuffer), l2);
    }

    static native void nglGetVideouivNV(int var0, int var1, long var2, long var4);

    public static int b(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PG;
        org.lwjgl.a.a(l2);
        IntBuffer intBuffer = i.a(dt2);
        NVPresentVideo.nglGetVideouivNV(n2, n3, o.a(intBuffer), l2);
        return intBuffer.get(0);
    }

    public static void a(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PH;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVPresentVideo.nglGetVideoi64vNV(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetVideoi64vNV(int var0, int var1, long var2, long var4);

    public static long c(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PH;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = i.b(dt2);
        NVPresentVideo.nglGetVideoi64vNV(n2, n3, o.a(longBuffer), l2);
        return longBuffer.get(0);
    }

    public static void b(int n2, int n3, LongBuffer longBuffer) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PI;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.a(longBuffer, 1);
        NVPresentVideo.nglGetVideoui64vNV(n2, n3, o.a(longBuffer), l2);
    }

    static native void nglGetVideoui64vNV(int var0, int var1, long var2, long var4);

    public static long d(int n2, int n3) {
        dt dt2 = GLContext.a();
        long l2 = dt2.PI;
        org.lwjgl.a.a(l2);
        LongBuffer longBuffer = i.b(dt2);
        NVPresentVideo.nglGetVideoui64vNV(n2, n3, o.a(longBuffer), l2);
        return longBuffer.get(0);
    }
}

