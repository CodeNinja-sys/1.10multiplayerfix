/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;

public class d
extends InputStream {
    private final InputStream a;
    private final long b;
    private long c = 0L;
    private long d = -1L;
    private boolean e = true;

    public d(InputStream inputStream, long l2) {
        this.b = l2;
        this.a = inputStream;
    }

    public d(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override
    public int read() {
        if (this.b >= 0L && this.c >= this.b) {
            return -1;
        }
        int n2 = this.a.read();
        ++this.c;
        return n2;
    }

    @Override
    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        if (this.b >= 0L && this.c >= this.b) {
            return -1;
        }
        long l2 = this.b >= 0L ? Math.min((long)n3, this.b - this.c) : (long)n3;
        int n4 = this.a.read(arrby, n2, (int)l2);
        if (n4 == -1) {
            return -1;
        }
        this.c += (long)n4;
        return n4;
    }

    @Override
    public long skip(long l2) {
        long l3 = this.b >= 0L ? Math.min(l2, this.b - this.c) : l2;
        long l4 = this.a.skip(l3);
        this.c += l4;
        return l4;
    }

    @Override
    public int available() {
        if (this.b >= 0L && this.c >= this.b) {
            return 0;
        }
        return this.a.available();
    }

    public String toString() {
        return this.a.toString();
    }

    @Override
    public void close() {
        if (this.e) {
            this.a.close();
        }
    }

    @Override
    public synchronized void reset() {
        this.a.reset();
        this.c = this.d;
    }

    @Override
    public synchronized void mark(int n2) {
        this.a.mark(n2);
        this.d = this.c;
    }

    @Override
    public boolean markSupported() {
        return this.a.markSupported();
    }

    public boolean a() {
        return this.e;
    }

    public void a(boolean bl2) {
        this.e = bl2;
    }
}

