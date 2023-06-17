/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.Serializable;

public final class ay
implements Serializable,
Cloneable {
    private static final long g = 1L;
    private static final int h = 1;
    private static final int i = 65280;
    private static final int j = 8;
    private static final int k = 2;
    private static final int l = 0xFF0000;
    private static final int m = 16;
    private static final int n = 3;
    private static final long o = 0xFF000000L;
    private static final int p = 24;
    private final long q;
    public static final ay a = new ay(33639248L);
    public static final ay b = new ay(67324752L);
    public static final ay c = new ay(134695760L);
    static final ay d = new ay(0xFFFFFFFFL);
    public static final ay e = new ay(808471376L);
    public static final ay f = new ay(134630224L);

    public ay(long l2) {
        this.q = l2;
    }

    public ay(byte[] arrby) {
        this(arrby, 0);
    }

    public ay(byte[] arrby, int n2) {
        this.q = ay.a(arrby, n2);
    }

    public byte[] a() {
        return ay.a(this.q);
    }

    public long b() {
        return this.q;
    }

    public static byte[] a(long l2) {
        byte[] arrby = new byte[]{(byte)(l2 & 0xFFL), (byte)((l2 & 0xFF00L) >> 8), (byte)((l2 & 0xFF0000L) >> 16), (byte)((l2 & 0xFF000000L) >> 24)};
        return arrby;
    }

    public static long a(byte[] arrby, int n2) {
        long l2 = (long)(arrby[n2 + 3] << 24) & 0xFF000000L;
        l2 += (long)(arrby[n2 + 2] << 16 & 0xFF0000);
        l2 += (long)(arrby[n2 + 1] << 8 & 0xFF00);
        return l2 += (long)(arrby[n2] & 0xFF);
    }

    public static long a(byte[] arrby) {
        return ay.a(arrby, 0);
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof ay)) {
            return false;
        }
        return this.q == ((ay)object).b();
    }

    public int hashCode() {
        return (int)this.q;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException(cloneNotSupportedException);
        }
    }

    public String toString() {
        return "ZipLong value: " + this.q;
    }
}

