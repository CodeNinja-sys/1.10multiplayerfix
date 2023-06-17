/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.apache.commons.compress.archivers.h.d;

class c {
    private static final int a = -1;
    private static final int b = -2;
    private final int[] c;

    public c(int n2) {
        this.c = new int[(1 << n2 + 1) - 1];
        Arrays.fill(this.c, -1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int n2, int n3, int n4, int n5) {
        if (n4 == 0) {
            if (this.c[n2] != -1) throw new IllegalArgumentException("Tree value at index " + n2 + " has already been assigned (" + this.c[n2] + ")");
            this.c[n2] = n5;
            return;
        } else {
            this.c[n2] = -2;
            int n6 = 2 * n2 + 1 + (n3 & 1);
            this.a(n6, n3 >>> 1, n4 - 1, n5);
        }
    }

    public int a(d d2) {
        int n2;
        int n3;
        int n4 = 0;
        while (true) {
            if ((n3 = d2.a()) == -1) {
                return -1;
            }
            int n5 = 2 * n4 + 1 + n3;
            n2 = this.c[n5];
            if (n2 != -2) break;
            n4 = n5;
        }
        if (n2 != -1) {
            return n2;
        }
        throw new IOException("The child " + n3 + " of node at index " + n4 + " is not defined");
    }

    /*
     * WARNING - void declaration
     */
    static c a(InputStream inputStream, int n2) {
        void var10_14;
        int n3;
        int n4;
        int n7 = inputStream.read() + 1;
        if (n7 == 0) {
            throw new IOException("Cannot read the size of the encoded tree, unexpected end of stream");
        }
        byte[] arrby = new byte[n7];
        new DataInputStream(inputStream).readFully(arrby);
        int n8 = 0;
        int[] arrn = new int[n2];
        int n9 = 0;
        byte[] arrobject = arrby;
        int n5 = arrobject.length;
        for (int arrn2 = 0; arrn2 < n5; ++arrn2) {
            byte by2 = arrobject[arrn2];
            n4 = ((by2 & 0xF0) >> 4) + 1;
            n3 = (by2 & 0xF) + 1;
            for (int i2 = 0; i2 < n4; ++i2) {
                arrn[n9++] = n3;
            }
            n8 = Math.max(n8, n3);
        }
        int[] arrn2 = new int[arrn.length];
        for (n5 = 0; n5 < arrn2.length; ++n5) {
            arrn2[n5] = n5;
        }
        n5 = 0;
        int[] arrn3 = new int[arrn.length];
        boolean bl2 = false;
        while (++var10_14 < arrn.length) {
            for (n4 = 0; n4 < arrn.length; ++n4) {
                if (arrn[n4] != var10_14) continue;
                arrn3[n5] = var10_14;
                arrn2[n5] = n4;
                ++n5;
            }
        }
        boolean bl3 = false;
        n4 = 0;
        n3 = 0;
        int[] arrn4 = new int[n2];
        for (int i3 = n2 - 1; i3 >= 0; --i3) {
            void var10_16;
            var10_16 += n4;
            if (arrn3[i3] != n3) {
                n3 = arrn3[i3];
                n4 = 1 << 16 - n3;
            }
            arrn4[arrn2[i3]] = var10_16;
        }
        c c2 = new c(n8);
        for (int i4 = 0; i4 < arrn4.length; ++i4) {
            int n6 = arrn[i4];
            if (n6 <= 0) continue;
            c2.a(0, Integer.reverse(arrn4[i4] << 16), n6, i4);
        }
        return c2;
    }
}

