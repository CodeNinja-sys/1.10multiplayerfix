/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.d;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.e.b;

public final class z {
    public static final String a = "org.apache.logging.log4j.uuidSequence";
    private static final String b = "org.apache.logging.log4j.assignedSequences";
    private static AtomicInteger c;
    private static final long d = 4096L;
    private static final byte e = -128;
    private static final int f = 16383;
    private static final long g = 122192928000000000L;
    private static long h;
    private static long i;
    private static final long j = 0xFFFFFFFFL;
    private static final long k = 0xFFFF00000000L;
    private static final long l = 0xFFF000000000000L;
    private static final int m = 8;
    private static final int n = 16;
    private static final int o = 32;
    private static final int p = 48;
    private static final int q = 10000;

    private z() {
    }

    public static UUID a() {
        long l2 = System.currentTimeMillis() * 10000L + 122192928000000000L + (long)(c.incrementAndGet() % 10000);
        long l3 = (l2 & 0xFFFFFFFFL) << 32;
        long l4 = (l2 & 0xFFFF00000000L) >> 16;
        long l5 = (l2 & 0xFFF000000000000L) >> 48;
        long l6 = l3 | l4 | 0x1000L | l5;
        return new UUID(l6, i);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static {
        Runtime runtime;
        Object object;
        Serializable serializable;
        c = new AtomicInteger(0);
        h = org.apache.logging.log4j.e.b.a().a(a, 0L);
        byte[] arrby = null;
        try {
            serializable = InetAddress.getLocalHost();
            try {
                Object object2;
                NetworkInterface networkInterface = NetworkInterface.getByInetAddress((InetAddress)serializable);
                if (networkInterface != null && !networkInterface.isLoopback() && networkInterface.isUp() && (object2 = networkInterface.getClass().getMethod("getHardwareAddress", new Class[0])) != null) {
                    arrby = (byte[])((Method)object2).invoke(networkInterface, new Object[0]);
                }
                if (arrby == null) {
                    object2 = NetworkInterface.getNetworkInterfaces();
                    while (object2.hasMoreElements() && arrby == null) {
                        networkInterface = object2.nextElement();
                        if (networkInterface == null || !networkInterface.isUp() || networkInterface.isLoopback() || (object = (Object)networkInterface.getClass().getMethod("getHardwareAddress", new Class[0])) == null) continue;
                        arrby = (byte[])((Method)object).invoke(networkInterface, new Object[0]);
                    }
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (arrby == null || arrby.length == 0) {
                arrby = ((InetAddress)serializable).getAddress();
            }
        }
        catch (UnknownHostException unknownHostException) {
            // empty catch block
        }
        serializable = new SecureRandom();
        if (arrby == null || arrby.length == 0) {
            arrby = new byte[6];
            ((Random)serializable).nextBytes(arrby);
        }
        int n2 = arrby.length >= 6 ? 6 : arrby.length;
        int n3 = arrby.length >= 6 ? arrby.length - 6 : 0;
        object = new byte[8];
        object[0] = -128;
        object[1] = 0;
        for (int i2 = 2; i2 < 8; ++i2) {
            object[i2] = false;
        }
        System.arraycopy(arrby, n3, object, n3 + 2, n2);
        ByteBuffer byteBuffer = ByteBuffer.wrap((byte[])object);
        long l2 = h;
        Runtime runtime2 = runtime = Runtime.getRuntime();
        synchronized (runtime2) {
            boolean bl2;
            long[] arrl;
            String string = org.apache.logging.log4j.e.b.a().a(b);
            if (string == null) {
                arrl = new long[]{};
            } else {
                String[] arrstring = string.split(",");
                arrl = new long[arrstring.length];
                int n4 = 0;
                String[] arrstring2 = arrstring;
                int n5 = arrstring2.length;
                for (int i3 = 0; i3 < n5; ++i3) {
                    String string2 = arrstring2[i3];
                    arrl[n4] = Long.parseLong(string2);
                    ++n4;
                }
            }
            if (l2 == 0L) {
                l2 = ((Random)serializable).nextLong();
            }
            l2 &= 0x3FFFL;
            do {
                bl2 = false;
                for (long l3 : arrl) {
                    if (l3 != l2) continue;
                    bl2 = true;
                    break;
                }
                if (!bl2) continue;
                l2 = l2 + 1L & 0x3FFFL;
            } while (bl2);
            string = string == null ? Long.toString(l2) : string + "," + Long.toString(l2);
            System.setProperty(b, string);
        }
        i = byteBuffer.getLong() | l2 << 48;
    }
}

