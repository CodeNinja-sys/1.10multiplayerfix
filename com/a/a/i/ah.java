/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

final class ah
extends FilterInputStream {
    private long a;
    private long b = -1L;

    ah(InputStream inputStream, long l2) {
        super(inputStream);
        cl.a(inputStream);
        cl.a(l2 >= 0L, (Object)"limit must be non-negative");
        this.a = l2;
    }

    @Override
    public int available() {
        return (int)Math.min((long)this.in.available(), this.a);
    }

    @Override
    public synchronized void mark(int n2) {
        this.in.mark(n2);
        this.b = this.a;
    }

    @Override
    public int read() {
        if (this.a == 0L) {
            return -1;
        }
        int n2 = this.in.read();
        if (n2 != -1) {
            --this.a;
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        if (this.a == 0L) {
            return -1;
        }
        int n4 = this.in.read(arrby, n2, n3 = (int)Math.min((long)n3, this.a));
        if (n4 != -1) {
            this.a -= (long)n4;
        }
        return n4;
    }

    @Override
    public synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.b == -1L) {
            throw new IOException("Mark not set");
        }
        this.in.reset();
        this.a = this.b;
    }

    @Override
    public long skip(long l2) {
        l2 = Math.min(l2, this.a);
        long l3 = this.in.skip(l2);
        this.a -= l3;
        return l3;
    }
}

