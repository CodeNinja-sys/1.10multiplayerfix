/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import org.apache.commons.compress.archivers.h.am;

class m {
    private m() {
    }

    public static int a(byte[] arrby) {
        int n2 = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            n2 += m.b(arrby, 4 * i2);
        }
        return 84446 - (n2 - m.b(arrby, 28));
    }

    public static final boolean b(byte[] arrby) {
        int n2 = m.b(arrby, 24);
        if (n2 != 60012) {
            return false;
        }
        int n3 = m.b(arrby, 28);
        return n3 == m.a(arrby);
    }

    public static final int c(byte[] arrby) {
        return m.b(arrby, 20);
    }

    public static final long a(byte[] arrby, int n2) {
        long l2 = 0L;
        l2 += (long)arrby[n2 + 7] << 56;
        l2 += (long)arrby[n2 + 6] << 48 & 0xFF000000000000L;
        l2 += (long)arrby[n2 + 5] << 40 & 0xFF0000000000L;
        l2 += (long)arrby[n2 + 4] << 32 & 0xFF00000000L;
        l2 += (long)arrby[n2 + 3] << 24 & 0xFF000000L;
        l2 += (long)arrby[n2 + 2] << 16 & 0xFF0000L;
        l2 += (long)arrby[n2 + 1] << 8 & 0xFF00L;
        return l2 += (long)arrby[n2] & 0xFFL;
    }

    public static final int b(byte[] arrby, int n2) {
        int n3 = 0;
        n3 = arrby[n2 + 3] << 24;
        n3 += arrby[n2 + 2] << 16 & 0xFF0000;
        n3 += arrby[n2 + 1] << 8 & 0xFF00;
        return n3 += arrby[n2] & 0xFF;
    }

    public static final int c(byte[] arrby, int n2) {
        int n3 = 0;
        n3 += arrby[n2 + 1] << 8 & 0xFF00;
        return n3 += arrby[n2] & 0xFF;
    }

    static String a(am am2, byte[] arrby, int n2, int n3) {
        byte[] arrby2 = new byte[n3];
        System.arraycopy(arrby, n2, arrby2, 0, n3);
        return am2.a(arrby2);
    }
}

