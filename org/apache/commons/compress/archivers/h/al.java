/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.Serializable;
import java.math.BigInteger;

public final class al
implements Serializable {
    private static final long b = 1L;
    private static final int c = 1;
    private static final int d = 65280;
    private static final int e = 8;
    private static final int f = 2;
    private static final int g = 0xFF0000;
    private static final int h = 16;
    private static final int i = 3;
    private static final long j = 0xFF000000L;
    private static final int k = 24;
    private static final int l = 4;
    private static final long m = 0xFF00000000L;
    private static final int n = 32;
    private static final int o = 5;
    private static final long p = 0xFF0000000000L;
    private static final int q = 40;
    private static final int r = 6;
    private static final long s = 0xFF000000000000L;
    private static final int t = 48;
    private static final int u = 7;
    private static final long v = 0x7F00000000000000L;
    private static final int w = 56;
    private static final int x = 63;
    private static final byte y = -128;
    private final BigInteger z;
    public static final al a = new al(0L);

    public al(long l2) {
        this(BigInteger.valueOf(l2));
    }

    public al(BigInteger bigInteger) {
        this.z = bigInteger;
    }

    public al(byte[] arrby) {
        this(arrby, 0);
    }

    public al(byte[] arrby, int n2) {
        this.z = al.b(arrby, n2);
    }

    public byte[] a() {
        return al.a(this.z);
    }

    public long b() {
        return this.z.longValue();
    }

    public BigInteger c() {
        return this.z;
    }

    public static byte[] a(long l2) {
        return al.a(BigInteger.valueOf(l2));
    }

    public static byte[] a(BigInteger bigInteger) {
        byte[] arrby = new byte[8];
        long l2 = bigInteger.longValue();
        arrby[0] = (byte)(l2 & 0xFFL);
        arrby[1] = (byte)((l2 & 0xFF00L) >> 8);
        arrby[2] = (byte)((l2 & 0xFF0000L) >> 16);
        arrby[3] = (byte)((l2 & 0xFF000000L) >> 24);
        arrby[4] = (byte)((l2 & 0xFF00000000L) >> 32);
        arrby[5] = (byte)((l2 & 0xFF0000000000L) >> 40);
        arrby[6] = (byte)((l2 & 0xFF000000000000L) >> 48);
        arrby[7] = (byte)((l2 & 0x7F00000000000000L) >> 56);
        if (bigInteger.testBit(63)) {
            arrby[7] = (byte)(arrby[7] | 0xFFFFFF80);
        }
        return arrby;
    }

    public static long a(byte[] arrby, int n2) {
        return al.b(arrby, n2).longValue();
    }

    public static BigInteger b(byte[] arrby, int n2) {
        long l2 = (long)arrby[n2 + 7] << 56 & 0x7F00000000000000L;
        l2 += (long)arrby[n2 + 6] << 48 & 0xFF000000000000L;
        l2 += (long)arrby[n2 + 5] << 40 & 0xFF0000000000L;
        l2 += (long)arrby[n2 + 4] << 32 & 0xFF00000000L;
        l2 += (long)arrby[n2 + 3] << 24 & 0xFF000000L;
        l2 += (long)arrby[n2 + 2] << 16 & 0xFF0000L;
        l2 += (long)arrby[n2 + 1] << 8 & 0xFF00L;
        BigInteger bigInteger = BigInteger.valueOf(l2 += (long)arrby[n2] & 0xFFL);
        return (arrby[n2 + 7] & 0xFFFFFF80) == -128 ? bigInteger.setBit(63) : bigInteger;
    }

    public static long a(byte[] arrby) {
        return al.a(arrby, 0);
    }

    public static BigInteger b(byte[] arrby) {
        return al.b(arrby, 0);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof al)) {
            return false;
        }
        return this.z.equals(((al)object).c());
    }

    public int hashCode() {
        return this.z.hashCode();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.z;
    }
}

