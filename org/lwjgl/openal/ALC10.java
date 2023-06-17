/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import org.lwjgl.o;
import org.lwjgl.openal.a;
import org.lwjgl.openal.b;
import org.lwjgl.openal.e;

public final class ALC10 {
    static final HashMap a = new HashMap();
    static final HashMap b = new HashMap();
    public static final int c = 0;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 0;
    public static final int g = 4096;
    public static final int h = 4097;
    public static final int i = 4098;
    public static final int j = 4099;
    public static final int k = 4100;
    public static final int l = 4101;
    public static final int m = 4102;
    public static final int n = 4103;
    public static final int o = 4104;
    public static final int p = 4105;
    public static final int q = 40961;
    public static final int r = 40962;
    public static final int s = 40963;
    public static final int t = 40964;
    public static final int u = 40965;

    static native void initNativeStubs();

    public static String a(b b2, int n2) {
        ByteBuffer byteBuffer = ALC10.nalcGetString(ALC10.c(b2), n2);
        org.lwjgl.openal.e.a(b2);
        return org.lwjgl.o.d(byteBuffer);
    }

    static native ByteBuffer nalcGetString(long var0, int var2);

    public static void a(b b2, int n2, IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        ALC10.nalcGetIntegerv(ALC10.c(b2), n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
        org.lwjgl.openal.e.a(b2);
    }

    static native void nalcGetIntegerv(long var0, int var2, int var3, long var4);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static b a(String string) {
        ByteBuffer byteBuffer = org.lwjgl.o.b(string);
        long l2 = ALC10.nalcOpenDevice(org.lwjgl.o.b(byteBuffer));
        if (l2 != 0L) {
            b b2 = new b(l2);
            HashMap hashMap = b;
            synchronized (hashMap) {
                b.put(l2, b2);
            }
            return b2;
        }
        return null;
    }

    static native long nalcOpenDevice(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(b b2) {
        boolean bl2 = ALC10.nalcCloseDevice(ALC10.c(b2));
        HashMap hashMap = b;
        synchronized (hashMap) {
            b2.a();
            b.remove(new Long(b2.a));
        }
        return bl2;
    }

    static native boolean nalcCloseDevice(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static a a(b b2, IntBuffer intBuffer) {
        long l2 = ALC10.nalcCreateContext(ALC10.c(b2), org.lwjgl.o.b(intBuffer));
        org.lwjgl.openal.e.a(b2);
        if (l2 != 0L) {
            a a2 = new a(l2);
            HashMap hashMap = a;
            synchronized (hashMap) {
                a.put(l2, a2);
                b2.a(a2);
            }
            return a2;
        }
        return null;
    }

    static native long nalcCreateContext(long var0, long var2);

    public static int a(a a2) {
        return ALC10.nalcMakeContextCurrent(ALC10.f(a2));
    }

    static native int nalcMakeContextCurrent(long var0);

    public static void b(a a2) {
        ALC10.nalcProcessContext(ALC10.f(a2));
    }

    static native void nalcProcessContext(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static a a() {
        a a2 = null;
        long l2 = ALC10.nalcGetCurrentContext();
        if (l2 != 0L) {
            HashMap hashMap = a;
            synchronized (hashMap) {
                a2 = (a)a.get(l2);
            }
        }
        return a2;
    }

    static native long nalcGetCurrentContext();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static b c(a a2) {
        b b2 = null;
        long l2 = ALC10.nalcGetContextsDevice(ALC10.f(a2));
        if (l2 != 0L) {
            HashMap hashMap = b;
            synchronized (hashMap) {
                b2 = (b)b.get(l2);
            }
        }
        return b2;
    }

    static native long nalcGetContextsDevice(long var0);

    public static void d(a a2) {
        ALC10.nalcSuspendContext(ALC10.f(a2));
    }

    static native void nalcSuspendContext(long var0);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void e(a a2) {
        HashMap hashMap = a;
        synchronized (hashMap) {
            b b2 = ALC10.c(a2);
            ALC10.nalcDestroyContext(ALC10.f(a2));
            b2.b(a2);
            a2.a();
        }
    }

    static native void nalcDestroyContext(long var0);

    public static int b(b b2) {
        return ALC10.nalcGetError(ALC10.c(b2));
    }

    static native int nalcGetError(long var0);

    public static boolean a(b b2, String string) {
        ByteBuffer byteBuffer = org.lwjgl.o.a((CharSequence)string);
        boolean bl2 = ALC10.nalcIsExtensionPresent(ALC10.c(b2), org.lwjgl.o.a(byteBuffer));
        org.lwjgl.openal.e.a(b2);
        return bl2;
    }

    private static native boolean nalcIsExtensionPresent(long var0, long var2);

    public static int b(b b2, String string) {
        ByteBuffer byteBuffer = org.lwjgl.o.a((CharSequence)string);
        int n2 = ALC10.nalcGetEnumValue(ALC10.c(b2), org.lwjgl.o.a(byteBuffer));
        org.lwjgl.openal.e.a(b2);
        return n2;
    }

    private static native int nalcGetEnumValue(long var0, long var2);

    static long c(b b2) {
        if (b2 != null) {
            org.lwjgl.openal.e.b(b2);
            return b2.a;
        }
        return 0L;
    }

    static long f(a a2) {
        if (a2 != null) {
            org.lwjgl.openal.e.a(a2);
            return a2.a;
        }
        return 0L;
    }
}

