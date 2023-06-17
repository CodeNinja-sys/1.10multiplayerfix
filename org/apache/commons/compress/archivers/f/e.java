/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.f;

import java.io.InputStream;
import java.io.RandomAccessFile;

class e
extends InputStream {
    private final RandomAccessFile a;
    private long b;

    public e(RandomAccessFile randomAccessFile, long l2) {
        this.a = randomAccessFile;
        this.b = l2;
    }

    public int read() {
        if (this.b > 0L) {
            --this.b;
            return this.a.read();
        }
        return -1;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4;
        if (this.b == 0L) {
            return -1;
        }
        int n5 = n3;
        if ((long)n5 > this.b) {
            n5 = (int)this.b;
        }
        if ((n4 = this.a.read(arrby, n2, n5)) >= 0) {
            this.b -= (long)n4;
        }
        return n4;
    }

    public void close() {
    }
}

