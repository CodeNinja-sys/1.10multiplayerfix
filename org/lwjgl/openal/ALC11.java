/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import org.lwjgl.BufferUtils;
import org.lwjgl.c;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL11;
import org.lwjgl.openal.ALC10;
import org.lwjgl.openal.b;

public final class ALC11 {
    public static final int a = 4114;
    public static final int b = 4115;
    public static final int c = 784;
    public static final int d = 785;
    public static final int e = 786;
    public static final int f = 4112;
    public static final int g = 4113;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static b a(String string, int n2, int n3, int n4) {
        ByteBuffer byteBuffer = o.a((CharSequence)string);
        long l2 = ALC11.nalcCaptureOpenDevice(o.b(byteBuffer), n2, n3, n4);
        if (l2 != 0L) {
            b b2 = new b(l2);
            HashMap hashMap = ALC10.b;
            synchronized (hashMap) {
                ALC10.b.put(l2, b2);
            }
            return b2;
        }
        return null;
    }

    private static native long nalcCaptureOpenDevice(long var0, int var2, int var3, int var4);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(b b2) {
        boolean bl2 = ALC11.nalcCaptureCloseDevice(ALC10.c(b2));
        HashMap hashMap = ALC10.b;
        synchronized (hashMap) {
            b2.a();
            ALC10.b.remove(new Long(b2.a));
        }
        return bl2;
    }

    static native boolean nalcCaptureCloseDevice(long var0);

    public static void b(b b2) {
        ALC11.nalcCaptureStart(ALC10.c(b2));
    }

    static native void nalcCaptureStart(long var0);

    public static void c(b b2) {
        ALC11.nalcCaptureStop(ALC10.c(b2));
    }

    static native void nalcCaptureStop(long var0);

    public static void a(b b2, ByteBuffer byteBuffer, int n2) {
        ALC11.nalcCaptureSamples(ALC10.c(b2), o.a(byteBuffer), n2);
    }

    static native void nalcCaptureSamples(long var0, long var2, int var4);

    static native void initNativeStubs();

    static boolean a() {
        try {
            IntBuffer intBuffer = BufferUtils.d(2);
            ALC10.a(AL.e(), 4096, intBuffer);
            intBuffer.position(1);
            ALC10.a(AL.e(), 4097, intBuffer);
            int n2 = intBuffer.get(0);
            int n3 = intBuffer.get(1);
            if (n2 >= 1 && (n2 > 1 || n3 >= 1)) {
                ALC11.initNativeStubs();
                AL11.initNativeStubs();
            }
        }
        catch (c c2) {
            org.lwjgl.d.a((CharSequence)("failed to initialize ALC11: " + c2));
            return false;
        }
        return true;
    }
}

