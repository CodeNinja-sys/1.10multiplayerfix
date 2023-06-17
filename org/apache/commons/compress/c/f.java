/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.c;

import java.io.IOException;
import java.io.InputStream;
import java.util.zip.Checksum;

public class f
extends InputStream {
    private final InputStream a;
    private long b;
    private final long c;
    private final Checksum d;

    public f(Checksum checksum, InputStream inputStream, long l2, long l3) {
        this.d = checksum;
        this.a = inputStream;
        this.c = l3;
        this.b = l2;
    }

    public int read() {
        if (this.b <= 0L) {
            return -1;
        }
        int n2 = this.a.read();
        if (n2 >= 0) {
            this.d.update(n2);
            --this.b;
        }
        if (this.b == 0L && this.c != this.d.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        return n2;
    }

    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.a.read(arrby, n2, n3);
        if (n4 >= 0) {
            this.d.update(arrby, n2, n4);
            this.b -= (long)n4;
        }
        if (this.b <= 0L && this.c != this.d.getValue()) {
            throw new IOException("Checksum verification failed");
        }
        return n4;
    }

    public long skip(long l2) {
        if (this.read() >= 0) {
            return 1L;
        }
        return 0L;
    }

    public void close() {
        this.a.close();
    }
}

