/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.d.mq;
import com.a.a.g.ai;
import com.a.a.i.aa;
import com.a.a.i.ab;
import com.a.a.i.ac;
import com.a.a.i.ad;
import com.a.a.i.ae;
import com.a.a.i.af;
import com.a.a.i.ag;
import com.a.a.i.ah;
import com.a.a.i.ax;
import com.a.a.i.cc;
import com.a.a.i.cl;
import com.a.a.i.m;
import com.a.a.i.n;
import com.a.a.i.o;
import com.a.a.i.p;
import com.a.a.i.s;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;

public final class z {
    private static final int a = 4096;
    private static final OutputStream b = new aa();

    private z() {
    }

    public static cc a(byte[] arrby) {
        return z.a(s.a(arrby));
    }

    public static cc a(byte[] arrby, int n2, int n3) {
        return z.a(s.a(arrby).a(n2, n3));
    }

    public static void a(byte[] arrby, cl cl2) {
        z.a(cl2).a(arrby);
    }

    public static long a(cc cc2, cl cl2) {
        return z.c(cc2).a(z.a(cl2));
    }

    public static long a(cc cc2, OutputStream outputStream) {
        return z.c(cc2).a(outputStream);
    }

    public static long a(InputStream inputStream, cl cl2) {
        return z.a(cl2).a(inputStream);
    }

    public static long a(InputStream inputStream, OutputStream outputStream) {
        int n2;
        com.a.a.b.cl.a(inputStream);
        com.a.a.b.cl.a(outputStream);
        byte[] arrby = new byte[4096];
        long l2 = 0L;
        while ((n2 = inputStream.read(arrby)) != -1) {
            outputStream.write(arrby, 0, n2);
            l2 += (long)n2;
        }
        return l2;
    }

    public static long a(ReadableByteChannel readableByteChannel, WritableByteChannel writableByteChannel) {
        com.a.a.b.cl.a(readableByteChannel);
        com.a.a.b.cl.a(writableByteChannel);
        ByteBuffer byteBuffer = ByteBuffer.allocate(4096);
        long l2 = 0L;
        while (readableByteChannel.read(byteBuffer) != -1) {
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                l2 += (long)writableByteChannel.write(byteBuffer);
            }
            byteBuffer.clear();
        }
        return l2;
    }

    public static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        z.a(inputStream, (OutputStream)byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    static byte[] a(InputStream inputStream, int n2) {
        int n3;
        int n4;
        byte[] arrby = new byte[n2];
        for (int i2 = n2; i2 > 0; i2 -= n4) {
            n3 = n2 - i2;
            n4 = inputStream.read(arrby, n3, i2);
            if (n4 != -1) continue;
            return Arrays.copyOf(arrby, n3);
        }
        n3 = inputStream.read();
        if (n3 == -1) {
            return arrby;
        }
        ag ag2 = new ag(null);
        ag2.write(n3);
        z.a(inputStream, (OutputStream)ag2);
        byte[] arrby2 = new byte[arrby.length + ag2.size()];
        System.arraycopy(arrby, 0, arrby2, 0, arrby.length);
        ag2.a(arrby2, arrby.length);
        return arrby2;
    }

    public static byte[] a(cc cc2) {
        return z.c(cc2).f();
    }

    public static m b(byte[] arrby) {
        return z.a(new ByteArrayInputStream(arrby));
    }

    public static m a(byte[] arrby, int n2) {
        com.a.a.b.cl.b(n2, arrby.length);
        return z.a(new ByteArrayInputStream(arrby, n2, arrby.length - n2));
    }

    public static m a(ByteArrayInputStream byteArrayInputStream) {
        return new ae((ByteArrayInputStream)com.a.a.b.cl.a(byteArrayInputStream));
    }

    public static n a() {
        return z.a(new ByteArrayOutputStream());
    }

    public static n a(int n2) {
        com.a.a.b.cl.a(n2 >= 0, "Invalid size: %s", new Object[]{n2});
        return z.a(new ByteArrayOutputStream(n2));
    }

    public static n a(ByteArrayOutputStream byteArrayOutputStream) {
        return new af((ByteArrayOutputStream)com.a.a.b.cl.a(byteArrayOutputStream));
    }

    public static OutputStream b() {
        return b;
    }

    public static InputStream a(InputStream inputStream, long l2) {
        return new ah(inputStream, l2);
    }

    public static long b(cc cc2) {
        return z.c(cc2).e();
    }

    public static boolean a(cc cc2, cc cc3) {
        return z.c(cc2).a(z.c(cc3));
    }

    public static void a(InputStream inputStream, byte[] arrby) {
        z.a(inputStream, arrby, 0, arrby.length);
    }

    public static void a(InputStream inputStream, byte[] arrby, int n2, int n3) {
        int n4 = z.b(inputStream, arrby, n2, n3);
        if (n4 != n3) {
            throw new EOFException("reached end of stream after reading " + n4 + " bytes; " + n3 + " bytes expected");
        }
    }

    public static void b(InputStream inputStream, long l2) {
        long l3 = l2;
        while (l2 > 0L) {
            long l4 = inputStream.skip(l2);
            if (l4 == 0L) {
                if (inputStream.read() == -1) {
                    long l5 = l3 - l2;
                    throw new EOFException("reached end of stream after skipping " + l5 + " bytes; " + l3 + " bytes expected");
                }
                --l2;
                continue;
            }
            l2 -= l4;
        }
    }

    public static Object a(cc cc2, o o2) {
        com.a.a.b.cl.a(cc2);
        com.a.a.b.cl.a(o2);
        ax ax2 = ax.a();
        try {
            InputStream inputStream = (InputStream)ax2.a((Closeable)cc2.h());
            Object object = z.a(inputStream, o2);
            return object;
        }
        catch (Throwable throwable) {
            throw ax2.a(throwable);
        }
        finally {
            ax2.close();
        }
    }

    public static Object a(InputStream inputStream, o o2) {
        int n2;
        com.a.a.b.cl.a(inputStream);
        com.a.a.b.cl.a(o2);
        byte[] arrby = new byte[4096];
        while ((n2 = inputStream.read(arrby)) != -1 && o2.a(arrby, 0, n2)) {
        }
        return o2.a();
    }

    public static com.a.a.g.ae a(cc cc2, ai ai2) {
        return z.c(cc2).a(ai2);
    }

    public static int b(InputStream inputStream, byte[] arrby, int n2, int n3) {
        int n4;
        int n5;
        com.a.a.b.cl.a(inputStream);
        com.a.a.b.cl.a(arrby);
        if (n3 < 0) {
            throw new IndexOutOfBoundsException("len is negative");
        }
        for (n4 = 0; n4 < n3 && (n5 = inputStream.read(arrby, n2 + n4, n3 - n4)) != -1; n4 += n5) {
        }
        return n4;
    }

    public static cc a(cc cc2, long l2, long l3) {
        return z.a(z.c(cc2).a(l2, l3));
    }

    public static cc a(Iterable iterable) {
        com.a.a.b.cl.a(iterable);
        Iterable iterable2 = mq.a(iterable, new ab());
        return z.a(s.a(iterable2));
    }

    public static cc a(cc ... arrcc) {
        return z.a(Arrays.asList(arrcc));
    }

    public static s c(cc cc2) {
        com.a.a.b.cl.a(cc2);
        return new ac(cc2);
    }

    public static p a(cl cl2) {
        com.a.a.b.cl.a(cl2);
        return new ad(cl2);
    }

    static cc a(s s2) {
        return (cc)com.a.a.b.cl.a(s2);
    }

    static cl a(p p2) {
        return (cl)com.a.a.b.cl.a(p2);
    }
}

