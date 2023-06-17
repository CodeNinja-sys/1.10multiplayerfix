/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;

public class f {
    public static short a(short s2) {
        return (short)(((s2 >> 0 & 0xFF) << 8) + ((s2 >> 8 & 0xFF) << 0));
    }

    public static int a(int n2) {
        return ((n2 >> 0 & 0xFF) << 24) + ((n2 >> 8 & 0xFF) << 16) + ((n2 >> 16 & 0xFF) << 8) + ((n2 >> 24 & 0xFF) << 0);
    }

    public static long a(long l2) {
        return ((l2 >> 0 & 0xFFL) << 56) + ((l2 >> 8 & 0xFFL) << 48) + ((l2 >> 16 & 0xFFL) << 40) + ((l2 >> 24 & 0xFFL) << 32) + ((l2 >> 32 & 0xFFL) << 24) + ((l2 >> 40 & 0xFFL) << 16) + ((l2 >> 48 & 0xFFL) << 8) + ((l2 >> 56 & 0xFFL) << 0);
    }

    public static float a(float f2) {
        return Float.intBitsToFloat(f.a(Float.floatToIntBits(f2)));
    }

    public static double a(double d2) {
        return Double.longBitsToDouble(f.a(Double.doubleToLongBits(d2)));
    }

    public static void a(byte[] arrby, int n2, short s2) {
        arrby[n2 + 0] = (byte)(s2 >> 0 & 0xFF);
        arrby[n2 + 1] = (byte)(s2 >> 8 & 0xFF);
    }

    public static short a(byte[] arrby, int n2) {
        return (short)(((arrby[n2 + 0] & 0xFF) << 0) + ((arrby[n2 + 1] & 0xFF) << 8));
    }

    public static int b(byte[] arrby, int n2) {
        return ((arrby[n2 + 0] & 0xFF) << 0) + ((arrby[n2 + 1] & 0xFF) << 8);
    }

    public static void a(byte[] arrby, int n2, int n3) {
        arrby[n2 + 0] = (byte)(n3 >> 0 & 0xFF);
        arrby[n2 + 1] = (byte)(n3 >> 8 & 0xFF);
        arrby[n2 + 2] = (byte)(n3 >> 16 & 0xFF);
        arrby[n2 + 3] = (byte)(n3 >> 24 & 0xFF);
    }

    public static int c(byte[] arrby, int n2) {
        return ((arrby[n2 + 0] & 0xFF) << 0) + ((arrby[n2 + 1] & 0xFF) << 8) + ((arrby[n2 + 2] & 0xFF) << 16) + ((arrby[n2 + 3] & 0xFF) << 24);
    }

    public static long d(byte[] arrby, int n2) {
        long l2 = ((arrby[n2 + 0] & 0xFF) << 0) + ((arrby[n2 + 1] & 0xFF) << 8) + ((arrby[n2 + 2] & 0xFF) << 16);
        long l3 = arrby[n2 + 3] & 0xFF;
        return (l3 << 24) + (0xFFFFFFFFL & l2);
    }

    public static void a(byte[] arrby, int n2, long l2) {
        arrby[n2 + 0] = (byte)(l2 >> 0 & 0xFFL);
        arrby[n2 + 1] = (byte)(l2 >> 8 & 0xFFL);
        arrby[n2 + 2] = (byte)(l2 >> 16 & 0xFFL);
        arrby[n2 + 3] = (byte)(l2 >> 24 & 0xFFL);
        arrby[n2 + 4] = (byte)(l2 >> 32 & 0xFFL);
        arrby[n2 + 5] = (byte)(l2 >> 40 & 0xFFL);
        arrby[n2 + 6] = (byte)(l2 >> 48 & 0xFFL);
        arrby[n2 + 7] = (byte)(l2 >> 56 & 0xFFL);
    }

    public static long e(byte[] arrby, int n2) {
        long l2 = ((arrby[n2 + 0] & 0xFF) << 0) + ((arrby[n2 + 1] & 0xFF) << 8) + ((arrby[n2 + 2] & 0xFF) << 16) + ((arrby[n2 + 3] & 0xFF) << 24);
        long l3 = ((arrby[n2 + 4] & 0xFF) << 0) + ((arrby[n2 + 5] & 0xFF) << 8) + ((arrby[n2 + 6] & 0xFF) << 16) + ((arrby[n2 + 7] & 0xFF) << 24);
        return (l3 << 32) + (0xFFFFFFFFL & l2);
    }

    public static void a(byte[] arrby, int n2, float f2) {
        f.a(arrby, n2, Float.floatToIntBits(f2));
    }

    public static float f(byte[] arrby, int n2) {
        return Float.intBitsToFloat(f.c(arrby, n2));
    }

    public static void a(byte[] arrby, int n2, double d2) {
        f.a(arrby, n2, Double.doubleToLongBits(d2));
    }

    public static double g(byte[] arrby, int n2) {
        return Double.longBitsToDouble(f.e(arrby, n2));
    }

    public static void a(OutputStream outputStream, short s2) {
        outputStream.write((byte)(s2 >> 0 & 0xFF));
        outputStream.write((byte)(s2 >> 8 & 0xFF));
    }

    public static short a(InputStream inputStream) {
        return (short)(((f.h(inputStream) & 0xFF) << 0) + ((f.h(inputStream) & 0xFF) << 8));
    }

    public static int b(InputStream inputStream) {
        int n2 = f.h(inputStream);
        int n3 = f.h(inputStream);
        return ((n2 & 0xFF) << 0) + ((n3 & 0xFF) << 8);
    }

    public static void a(OutputStream outputStream, int n2) {
        outputStream.write((byte)(n2 >> 0 & 0xFF));
        outputStream.write((byte)(n2 >> 8 & 0xFF));
        outputStream.write((byte)(n2 >> 16 & 0xFF));
        outputStream.write((byte)(n2 >> 24 & 0xFF));
    }

    public static int c(InputStream inputStream) {
        int n2 = f.h(inputStream);
        int n3 = f.h(inputStream);
        int n4 = f.h(inputStream);
        int n5 = f.h(inputStream);
        return ((n2 & 0xFF) << 0) + ((n3 & 0xFF) << 8) + ((n4 & 0xFF) << 16) + ((n5 & 0xFF) << 24);
    }

    public static long d(InputStream inputStream) {
        int n2 = f.h(inputStream);
        int n3 = f.h(inputStream);
        int n4 = f.h(inputStream);
        int n5 = f.h(inputStream);
        long l2 = ((n2 & 0xFF) << 0) + ((n3 & 0xFF) << 8) + ((n4 & 0xFF) << 16);
        long l3 = n5 & 0xFF;
        return (l3 << 24) + (0xFFFFFFFFL & l2);
    }

    public static void a(OutputStream outputStream, long l2) {
        outputStream.write((byte)(l2 >> 0 & 0xFFL));
        outputStream.write((byte)(l2 >> 8 & 0xFFL));
        outputStream.write((byte)(l2 >> 16 & 0xFFL));
        outputStream.write((byte)(l2 >> 24 & 0xFFL));
        outputStream.write((byte)(l2 >> 32 & 0xFFL));
        outputStream.write((byte)(l2 >> 40 & 0xFFL));
        outputStream.write((byte)(l2 >> 48 & 0xFFL));
        outputStream.write((byte)(l2 >> 56 & 0xFFL));
    }

    public static long e(InputStream inputStream) {
        byte[] arrby = new byte[8];
        for (int i2 = 0; i2 < 8; ++i2) {
            arrby[i2] = (byte)f.h(inputStream);
        }
        return f.e(arrby, 0);
    }

    public static void a(OutputStream outputStream, float f2) {
        f.a(outputStream, Float.floatToIntBits(f2));
    }

    public static float f(InputStream inputStream) {
        return Float.intBitsToFloat(f.c(inputStream));
    }

    public static void a(OutputStream outputStream, double d2) {
        f.a(outputStream, Double.doubleToLongBits(d2));
    }

    public static double g(InputStream inputStream) {
        return Double.longBitsToDouble(f.e(inputStream));
    }

    private static int h(InputStream inputStream) {
        int n2 = inputStream.read();
        if (-1 == n2) {
            throw new EOFException("Unexpected EOF reached");
        }
        return n2;
    }
}

