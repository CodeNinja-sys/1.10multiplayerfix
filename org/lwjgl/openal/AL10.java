/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.openal;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.a;
import org.lwjgl.o;

public final class AL10 {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 0;
    public static final int d = 1;
    public static final int e = 4135;
    public static final int f = 513;
    public static final int g = 514;
    public static final int h = 4097;
    public static final int i = 4098;
    public static final int j = 4099;
    public static final int k = 4100;
    public static final int l = 4101;
    public static final int m = 4102;
    public static final int n = 4103;
    public static final int o = 4105;
    public static final int p = 4106;
    public static final int q = 4109;
    public static final int r = 4110;
    public static final int s = 4111;
    public static final int t = 4128;
    public static final int u = 4129;
    public static final int v = 4130;
    public static final int w = 4131;
    public static final int x = 12288;
    public static final int y = 4112;
    public static final int z = 4113;
    public static final int A = 4114;
    public static final int B = 4115;
    public static final int C = 4116;
    public static final int D = 4117;
    public static final int E = 4118;
    public static final int F = 4352;
    public static final int G = 4353;
    public static final int H = 4354;
    public static final int I = 4355;
    public static final int J = 65539;
    public static final int K = 8193;
    public static final int L = 8194;
    public static final int M = 8195;
    public static final int N = 8196;
    public static final int O = 8197;
    public static final int P = 8208;
    public static final int Q = 8209;
    public static final int R = 8210;
    public static final int S = 0;
    public static final int T = 40961;
    public static final int U = 40962;
    public static final int V = 40963;
    public static final int W = 40964;
    public static final int X = 40965;
    public static final int Y = 45057;
    public static final int Z = 45058;
    public static final int aa = 45059;
    public static final int ab = 45060;
    public static final int ac = 49152;
    public static final int ad = 49153;
    public static final int ae = 53248;
    public static final int af = 53249;
    public static final int ag = 53250;

    private AL10() {
    }

    static native void initNativeStubs();

    public static void a(int n2) {
        AL10.nalEnable(n2);
    }

    static native void nalEnable(int var0);

    public static void b(int n2) {
        AL10.nalDisable(n2);
    }

    static native void nalDisable(int var0);

    public static boolean c(int n2) {
        boolean bl2 = AL10.nalIsEnabled(n2);
        return bl2;
    }

    static native boolean nalIsEnabled(int var0);

    public static boolean d(int n2) {
        boolean bl2 = AL10.nalGetBoolean(n2);
        return bl2;
    }

    static native boolean nalGetBoolean(int var0);

    public static int e(int n2) {
        int n3 = AL10.nalGetInteger(n2);
        return n3;
    }

    static native int nalGetInteger(int var0);

    public static float f(int n2) {
        float f2 = AL10.nalGetFloat(n2);
        return f2;
    }

    static native float nalGetFloat(int var0);

    public static double g(int n2) {
        double d2 = AL10.nalGetDouble(n2);
        return d2;
    }

    static native double nalGetDouble(int var0);

    public static void a(int n2, IntBuffer intBuffer) {
        org.lwjgl.a.a(intBuffer, 1);
        AL10.nalGetIntegerv(n2, org.lwjgl.o.a(intBuffer));
    }

    static native void nalGetIntegerv(int var0, long var1);

    public static void a(int n2, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        AL10.nalGetFloatv(n2, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalGetFloatv(int var0, long var1);

    public static void a(int n2, DoubleBuffer doubleBuffer) {
        org.lwjgl.a.a(doubleBuffer, 1);
        AL10.nalGetDoublev(n2, org.lwjgl.o.a(doubleBuffer));
    }

    static native void nalGetDoublev(int var0, long var1);

    public static String h(int n2) {
        String string = AL10.nalGetString(n2);
        return string;
    }

    static native String nalGetString(int var0);

    public static int a() {
        int n2 = AL10.nalGetError();
        return n2;
    }

    static native int nalGetError();

    public static boolean a(String string) {
        org.lwjgl.a.a(string);
        boolean bl2 = AL10.nalIsExtensionPresent(string);
        return bl2;
    }

    static native boolean nalIsExtensionPresent(String var0);

    public static int b(String string) {
        org.lwjgl.a.a(string);
        int n2 = AL10.nalGetEnumValue(string);
        return n2;
    }

    static native int nalGetEnumValue(String var0);

    public static void a(int n2, int n3) {
        AL10.nalListeneri(n2, n3);
    }

    static native void nalListeneri(int var0, int var1);

    public static void a(int n2, float f2) {
        AL10.nalListenerf(n2, f2);
    }

    static native void nalListenerf(int var0, float var1);

    public static void b(int n2, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        AL10.nalListenerfv(n2, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalListenerfv(int var0, long var1);

    public static void a(int n2, float f2, float f3, float f4) {
        AL10.nalListener3f(n2, f2, f3, f4);
    }

    static native void nalListener3f(int var0, float var1, float var2, float var3);

    public static int i(int n2) {
        int n3 = AL10.nalGetListeneri(n2);
        return n3;
    }

    static native int nalGetListeneri(int var0);

    public static float j(int n2) {
        float f2 = AL10.nalGetListenerf(n2);
        return f2;
    }

    static native float nalGetListenerf(int var0);

    public static void c(int n2, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        AL10.nalGetListenerfv(n2, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalGetListenerfv(int var0, long var1);

    public static void a(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalGenSources(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalGenSources(int var0, long var1);

    public static int b() {
        int n2 = AL10.nalGenSources2(1);
        return n2;
    }

    static native int nalGenSources2(int var0);

    public static void b(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalDeleteSources(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalDeleteSources(int var0, long var1);

    public static void k(int n2) {
        AL10.nalDeleteSources2(1, n2);
    }

    static native void nalDeleteSources2(int var0, int var1);

    public static boolean l(int n2) {
        boolean bl2 = AL10.nalIsSource(n2);
        return bl2;
    }

    static native boolean nalIsSource(int var0);

    public static void a(int n2, int n3, int n4) {
        AL10.nalSourcei(n2, n3, n4);
    }

    static native void nalSourcei(int var0, int var1, int var2);

    public static void a(int n2, int n3, float f2) {
        AL10.nalSourcef(n2, n3, f2);
    }

    static native void nalSourcef(int var0, int var1, float var2);

    public static void a(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        AL10.nalSourcefv(n2, n3, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalSourcefv(int var0, int var1, long var2);

    public static void a(int n2, int n3, float f2, float f3, float f4) {
        AL10.nalSource3f(n2, n3, f2, f3, f4);
    }

    static native void nalSource3f(int var0, int var1, float var2, float var3, float var4);

    public static int b(int n2, int n3) {
        int n4 = AL10.nalGetSourcei(n2, n3);
        return n4;
    }

    static native int nalGetSourcei(int var0, int var1);

    public static float c(int n2, int n3) {
        float f2 = AL10.nalGetSourcef(n2, n3);
        return f2;
    }

    static native float nalGetSourcef(int var0, int var1);

    public static void b(int n2, int n3, FloatBuffer floatBuffer) {
        org.lwjgl.a.a(floatBuffer, 1);
        AL10.nalGetSourcefv(n2, n3, org.lwjgl.o.a(floatBuffer));
    }

    static native void nalGetSourcefv(int var0, int var1, long var2);

    public static void c(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalSourcePlayv(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalSourcePlayv(int var0, long var1);

    public static void d(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalSourcePausev(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalSourcePausev(int var0, long var1);

    public static void e(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalSourceStopv(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalSourceStopv(int var0, long var1);

    public static void f(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalSourceRewindv(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalSourceRewindv(int var0, long var1);

    public static void m(int n2) {
        AL10.nalSourcePlay(n2);
    }

    static native void nalSourcePlay(int var0);

    public static void n(int n2) {
        AL10.nalSourcePause(n2);
    }

    static native void nalSourcePause(int var0);

    public static void o(int n2) {
        AL10.nalSourceStop(n2);
    }

    static native void nalSourceStop(int var0);

    public static void p(int n2) {
        AL10.nalSourceRewind(n2);
    }

    static native void nalSourceRewind(int var0);

    public static void g(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalGenBuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalGenBuffers(int var0, long var1);

    public static int c() {
        int n2 = AL10.nalGenBuffers2(1);
        return n2;
    }

    static native int nalGenBuffers2(int var0);

    public static void h(IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalDeleteBuffers(intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalDeleteBuffers(int var0, long var1);

    public static void q(int n2) {
        AL10.nalDeleteBuffers2(1, n2);
    }

    static native void nalDeleteBuffers2(int var0, int var1);

    public static boolean r(int n2) {
        boolean bl2 = AL10.nalIsBuffer(n2);
        return bl2;
    }

    static native boolean nalIsBuffer(int var0);

    public static void a(int n2, int n3, ByteBuffer byteBuffer, int n4) {
        org.lwjgl.a.b(byteBuffer);
        AL10.nalBufferData(n2, n3, org.lwjgl.o.a(byteBuffer), byteBuffer.remaining(), n4);
    }

    public static void a(int n2, int n3, IntBuffer intBuffer, int n4) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalBufferData(n2, n3, org.lwjgl.o.a(intBuffer), intBuffer.remaining() << 2, n4);
    }

    public static void a(int n2, int n3, ShortBuffer shortBuffer, int n4) {
        org.lwjgl.a.a(shortBuffer);
        AL10.nalBufferData(n2, n3, org.lwjgl.o.a(shortBuffer), shortBuffer.remaining() << 1, n4);
    }

    static native void nalBufferData(int var0, int var1, long var2, int var4, int var5);

    public static int d(int n2, int n3) {
        int n4 = AL10.nalGetBufferi(n2, n3);
        return n4;
    }

    static native int nalGetBufferi(int var0, int var1);

    public static float e(int n2, int n3) {
        float f2 = AL10.nalGetBufferf(n2, n3);
        return f2;
    }

    static native float nalGetBufferf(int var0, int var1);

    public static void b(int n2, IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalSourceQueueBuffers(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalSourceQueueBuffers(int var0, int var1, long var2);

    public static void f(int n2, int n3) {
        AL10.nalSourceQueueBuffers2(n2, 1, n3);
    }

    static native void nalSourceQueueBuffers2(int var0, int var1, int var2);

    public static void c(int n2, IntBuffer intBuffer) {
        org.lwjgl.a.b(intBuffer);
        AL10.nalSourceUnqueueBuffers(n2, intBuffer.remaining(), org.lwjgl.o.a(intBuffer));
    }

    static native void nalSourceUnqueueBuffers(int var0, int var1, long var2);

    public static int s(int n2) {
        int n3 = AL10.nalSourceUnqueueBuffers2(n2, 1);
        return n3;
    }

    static native int nalSourceUnqueueBuffers2(int var0, int var1);

    public static void t(int n2) {
        AL10.nalDistanceModel(n2);
    }

    static native void nalDistanceModel(int var0);

    public static void a(float f2) {
        AL10.nalDopplerFactor(f2);
    }

    static native void nalDopplerFactor(float var0);

    public static void b(float f2) {
        AL10.nalDopplerVelocity(f2);
    }

    static native void nalDopplerVelocity(float var0);
}

