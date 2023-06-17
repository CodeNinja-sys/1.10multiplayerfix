/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.c;

class e {
    e() {
    }

    static long a(long l2) {
        return l2 & 0xF000L;
    }

    static long a(byte[] arrby, boolean bl2) {
        if (arrby.length % 2 != 0) {
            throw new UnsupportedOperationException();
        }
        long l2 = 0L;
        int n2 = 0;
        byte[] arrby2 = new byte[arrby.length];
        System.arraycopy(arrby, 0, arrby2, 0, arrby.length);
        if (!bl2) {
            byte by2 = 0;
            for (n2 = 0; n2 < arrby2.length; ++n2) {
                by2 = arrby2[n2];
                arrby2[n2++] = arrby2[n2];
                arrby2[n2] = by2;
            }
        }
        l2 = arrby2[0] & 0xFF;
        for (n2 = 1; n2 < arrby2.length; ++n2) {
            l2 <<= 8;
            l2 |= (long)(arrby2[n2] & 0xFF);
        }
        return l2;
    }

    static byte[] a(long l2, int n2, boolean bl2) {
        byte[] arrby = new byte[n2];
        int n3 = 0;
        long l3 = 0L;
        if (n2 % 2 != 0 || n2 < 2) {
            throw new UnsupportedOperationException();
        }
        l3 = l2;
        for (n3 = n2 - 1; n3 >= 0; --n3) {
            arrby[n3] = (byte)(l3 & 0xFFL);
            l3 >>= 8;
        }
        if (!bl2) {
            byte by2 = 0;
            for (n3 = 0; n3 < n2; ++n3) {
                by2 = arrby[n3];
                arrby[n3++] = arrby[n3];
                arrby[n3] = by2;
            }
        }
        return arrby;
    }
}

