/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import java.nio.IntBuffer;
import java.nio.LongBuffer;
import org.lwjgl.a;
import org.lwjgl.o;
import org.lwjgl.opencl.ae;
import org.lwjgl.opencl.d;
import org.lwjgl.x;

public final class EXTDeviceFission {
    public static final int a = 16464;
    public static final int b = 16465;
    public static final int c = 16466;
    public static final int d = 16467;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 4;
    public static final int i = 16;
    public static final int j = 256;
    public static final int k = 16468;
    public static final int l = 16469;
    public static final int m = 16470;
    public static final int n = 16471;
    public static final int o = 16472;
    public static final int p = 0;
    public static final int q = 0;
    public static final int r = -1;
    public static final int s = -1057;
    public static final int t = -1058;
    public static final int u = -1059;

    private EXTDeviceFission() {
    }

    public static int a(ae ae2) {
        long l2 = org.lwjgl.opencl.x.bi;
        org.lwjgl.a.a(l2);
        int n2 = EXTDeviceFission.nclRetainDeviceEXT(ae2.a(), l2);
        if (n2 == 0) {
            ae2.cP_();
        }
        return n2;
    }

    static native int nclRetainDeviceEXT(long var0, long var2);

    public static int b(ae ae2) {
        long l2 = org.lwjgl.opencl.x.bj;
        org.lwjgl.a.a(l2);
        org.lwjgl.opencl.d.a(ae2);
        int n2 = EXTDeviceFission.nclReleaseDeviceEXT(ae2.a(), l2);
        if (n2 == 0) {
            ae2.f();
        }
        return n2;
    }

    static native int nclReleaseDeviceEXT(long var0, long var2);

    public static int a(ae ae2, LongBuffer longBuffer, x x2, IntBuffer intBuffer) {
        int n2;
        long l2 = org.lwjgl.opencl.x.bk;
        org.lwjgl.a.a(l2);
        org.lwjgl.a.b(longBuffer);
        org.lwjgl.a.a(longBuffer);
        if (x2 != null) {
            org.lwjgl.a.b(x2);
        }
        if (intBuffer != null) {
            org.lwjgl.a.a(intBuffer, 1);
        }
        if ((n2 = EXTDeviceFission.nclCreateSubDevicesEXT(ae2.a(), org.lwjgl.o.a(longBuffer), x2 == null ? 0 : x2.m(), org.lwjgl.o.d(x2), org.lwjgl.o.b(intBuffer), l2)) == 0 && x2 != null) {
            ae2.a(x2);
        }
        return n2;
    }

    static native int nclCreateSubDevicesEXT(long var0, long var2, int var4, long var5, long var7, long var9);
}

