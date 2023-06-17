/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class bb
extends FilterInputStream {
    private long a;
    private long b = -1L;

    public bb(InputStream inputStream) {
        super(inputStream);
    }

    public long a() {
        return this.a;
    }

    @Override
    public int read() {
        int n2 = this.in.read();
        if (n2 != -1) {
            ++this.a;
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.in.read(arrby, n2, n3);
        if (n4 != -1) {
            this.a += (long)n4;
        }
        return n4;
    }

    @Override
    public long skip(long l2) {
        long l3 = this.in.skip(l2);
        this.a += l3;
        return l3;
    }

    @Override
    public synchronized void mark(int n2) {
        this.in.mark(n2);
        this.b = this.a;
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
}

