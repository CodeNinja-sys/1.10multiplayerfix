/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.c;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class i {
    private static final int a = 8024;
    private static final int b = 4096;
    private static final byte[] c = new byte[4096];

    private i() {
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        return i.a(inputStream, outputStream, 8024);
    }

    public static long a(InputStream inputStream, OutputStream outputStream, int n2) {
        byte[] arrby = new byte[n2];
        int n3 = 0;
        long l2 = 0L;
        while (-1 != (n3 = inputStream.read(arrby))) {
            outputStream.write(arrby, 0, n3);
            l2 += (long)n3;
        }
        return l2;
    }

    public static long a(InputStream inputStream, long l2) {
        int n2;
        long l3;
        long l4 = l2;
        while (l2 > 0L && (l3 = inputStream.skip(l2)) != 0L) {
            l2 -= l3;
        }
        while (l2 > 0L && (n2 = i.a(inputStream, c, 0, (int)Math.min(l2, 4096L))) >= 1) {
            l2 -= (long)n2;
        }
        return l4 - l2;
    }

    public static int a(InputStream inputStream, byte[] arrby) {
        return i.a(inputStream, arrby, 0, arrby.length);
    }

    public static int a(InputStream inputStream, byte[] arrby, int n2, int n3) {
        int n4;
        if (n3 < 0 || n2 < 0 || n3 + n2 > arrby.length) {
            throw new IndexOutOfBoundsException();
        }
        int n5 = 0;
        for (n4 = 0; n4 != n3 && (n5 = inputStream.read(arrby, n2 + n4, n3 - n4)) != -1; n4 += n5) {
        }
        return n4;
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i.a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }
}

