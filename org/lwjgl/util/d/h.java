/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.nio.ByteBuffer;
import org.lwjgl.d;
import org.lwjgl.o;
import org.lwjgl.util.d.i;
import org.lwjgl.util.d.t;
import org.lwjgl.util.d.v;
import org.lwjgl.util.d.w;
import org.lwjgl.util.d.x;

public class h {
    public static void a(i i2, ByteBuffer byteBuffer, int n2, int n3) {
        if (d.j && i2.b != 0L) {
            throw new IllegalStateException("this method should not be called by user-code");
        }
        if (d.j && !byteBuffer.isDirect()) {
            throw new IllegalArgumentException("bytebuffer must be direct");
        }
        i2.d = byteBuffer;
        if (d.j && n2 <= 0) {
            throw new IllegalArgumentException("invalid alignment");
        }
        if (d.j && (n3 <= 0 || n3 % n2 != 0)) {
            throw new IllegalStateException("sizeof not a multiple of alignment");
        }
        long l2 = o.a(byteBuffer);
        if (d.j && l2 % (long)n2 != 0L) {
            throw new IllegalStateException("buffer address not aligned on " + n2 + " bytes");
        }
        i2.b = i2.c = l2;
    }

    public static void a(long l2, i i2) {
        i2.b(l2);
    }

    public static void a(v v2, int n2) {
        v2.a(n2);
    }

    public static void a(w w2, int n2) {
        w2.a(n2);
    }

    public static void a(x x2, int n2) {
        x2.a(n2);
    }

    public static void a(i i2, int n2, int n3) {
        i2.a(i2.b + (long)(n2 * n3));
    }

    public static int a(i i2, int n2) {
        return (int)(i2.c - i2.b) / n2;
    }

    public static void b(i i2, int n2, int n3) {
        i2.a(i2.b + (long)(n2 << n3));
    }

    public static int b(i i2, int n2) {
        return (int)(i2.c - i2.b) >> n2;
    }

    public static void c(i i2, int n2) {
        i2.a(i2.c + (long)n2);
    }

    public static i a(i i2, i i3) {
        i3.b = i2.b;
        i3.c = i2.c;
        i3.d = i2.d;
        return i3;
    }

    public static i b(i i2, i i3) {
        i3.b = i2.c;
        i3.c = i2.c;
        i3.d = i2.d;
        return i3;
    }

    public static void a(i i2, i i3, int n2) {
        if (i.a) {
            i2.b(n2);
            i3.b(n2);
        }
        t.a.copyMemory(i2.c, i3.c, n2);
    }

    public static ByteBuffer a(long l2, int n2) {
        return t.a(l2, n2);
    }

    public static void a(byte by2, long l2) {
        t.a.putByte(l2, by2);
    }

    public static void a(i i2, byte by2, int n2) {
        t.a.putByte(i2.c + (long)n2, by2);
    }

    public static byte a(long l2) {
        return t.a.getByte(l2);
    }

    public static byte d(i i2, int n2) {
        return t.a.getByte(i2.c + (long)n2);
    }

    public static void b(byte by2, long l2) {
        t.a.putByteVolatile(null, l2, by2);
    }

    public static void b(i i2, byte by2, int n2) {
        t.a.putByteVolatile(null, i2.c + (long)n2, by2);
    }

    public static byte b(long l2) {
        return t.a.getByteVolatile(null, l2);
    }

    public static byte e(i i2, int n2) {
        return t.a.getByteVolatile(null, i2.c + (long)n2);
    }

    public static void a(short s2, long l2) {
        t.a.putShort(l2, s2);
    }

    public static void a(i i2, short s2, int n2) {
        t.a.putShort(i2.c + (long)n2, s2);
    }

    public static short c(long l2) {
        return t.a.getShort(l2);
    }

    public static short f(i i2, int n2) {
        return t.a.getShort(i2.c + (long)n2);
    }

    public static void b(short s2, long l2) {
        t.a.putShortVolatile(null, l2, s2);
    }

    public static void b(i i2, short s2, int n2) {
        t.a.putShortVolatile(null, i2.c + (long)n2, s2);
    }

    public static short d(long l2) {
        return t.a.getShortVolatile(null, l2);
    }

    public static short g(i i2, int n2) {
        return t.a.getShortVolatile(null, i2.c + (long)n2);
    }

    public static void a(char c2, long l2) {
        t.a.putChar(l2, c2);
    }

    public static void a(i i2, char c2, int n2) {
        t.a.putChar(i2.c + (long)n2, c2);
    }

    public static char e(long l2) {
        return t.a.getChar(l2);
    }

    public static char h(i i2, int n2) {
        return t.a.getChar(i2.c + (long)n2);
    }

    public static void b(char c2, long l2) {
        t.a.putCharVolatile(null, l2, c2);
    }

    public static void b(i i2, char c2, int n2) {
        t.a.putCharVolatile(null, i2.c + (long)n2, c2);
    }

    public static char f(long l2) {
        return t.a.getCharVolatile(null, l2);
    }

    public static char i(i i2, int n2) {
        return t.a.getCharVolatile(null, i2.c + (long)n2);
    }

    public static void a(int n2, long l2) {
        t.a.putInt(l2, n2);
    }

    public static void c(i i2, int n2, int n3) {
        t.a.putInt(i2.c + (long)n3, n2);
    }

    public static int g(long l2) {
        return t.a.getInt(l2);
    }

    public static int j(i i2, int n2) {
        return t.a.getInt(i2.c + (long)n2);
    }

    public static void b(int n2, long l2) {
        t.a.putIntVolatile(null, l2, n2);
    }

    public static void d(i i2, int n2, int n3) {
        t.a.putIntVolatile(null, i2.c + (long)n3, n2);
    }

    public static int h(long l2) {
        return t.a.getIntVolatile(null, l2);
    }

    public static int k(i i2, int n2) {
        return t.a.getIntVolatile(null, i2.c + (long)n2);
    }

    public static void a(float f2, long l2) {
        t.a.putFloat(l2, f2);
    }

    public static void a(i i2, float f2, int n2) {
        t.a.putFloat(i2.c + (long)n2, f2);
    }

    public static float i(long l2) {
        return t.a.getFloat(l2);
    }

    public static float l(i i2, int n2) {
        return t.a.getFloat(i2.c + (long)n2);
    }

    public static void b(float f2, long l2) {
        t.a.putFloatVolatile(null, l2, f2);
    }

    public static void b(i i2, float f2, int n2) {
        t.a.putFloatVolatile(null, i2.c + (long)n2, f2);
    }

    public static float j(long l2) {
        return t.a.getFloatVolatile(null, l2);
    }

    public static float m(i i2, int n2) {
        return t.a.getFloatVolatile(null, i2.c + (long)n2);
    }

    public static void a(long l2, long l3) {
        t.a.putLong(l3, l2);
    }

    public static void a(i i2, long l2, int n2) {
        t.a.putLong(i2.c + (long)n2, l2);
    }

    public static long k(long l2) {
        return t.a.getLong(l2);
    }

    public static long n(i i2, int n2) {
        return t.a.getLong(i2.c + (long)n2);
    }

    public static void b(long l2, long l3) {
        t.a.putLongVolatile(null, l3, l2);
    }

    public static void b(i i2, long l2, int n2) {
        t.a.putLongVolatile(null, i2.c + (long)n2, l2);
    }

    public static long l(long l2) {
        return t.a.getLongVolatile(null, l2);
    }

    public static long o(i i2, int n2) {
        return t.a.getLongVolatile(null, i2.c + (long)n2);
    }

    public static void c(long l2, long l3) {
        t.a.putAddress(l3, l2);
    }

    public static void c(i i2, long l2, int n2) {
        t.a.putAddress(i2.c + (long)n2, l2);
    }

    public static long m(long l2) {
        return t.a.getAddress(l2);
    }

    public static long p(i i2, int n2) {
        return t.a.getAddress(i2.c + (long)n2);
    }

    public static void a(double d2, long l2) {
        t.a.putDouble(l2, d2);
    }

    public static void a(i i2, double d2, int n2) {
        t.a.putDouble(i2.c + (long)n2, d2);
    }

    public static double n(long l2) {
        return t.a.getDouble(l2);
    }

    public static double q(i i2, int n2) {
        return t.a.getDouble(i2.c + (long)n2);
    }

    public static void b(double d2, long l2) {
        t.a.putDoubleVolatile(null, l2, d2);
    }

    public static void b(i i2, double d2, int n2) {
        t.a.putDoubleVolatile(null, i2.c + (long)n2, d2);
    }

    public static double o(long l2) {
        return t.a.getDoubleVolatile(null, l2);
    }

    public static double r(i i2, int n2) {
        return t.a.getDoubleVolatile(null, i2.c + (long)n2);
    }
}

