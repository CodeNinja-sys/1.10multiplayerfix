/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;

public class n
extends Reader {
    private final long a;
    private long b;
    private long c = -1L;
    private long d;
    private boolean e;
    private final boolean f;
    private final boolean g;

    public n(long l2) {
        this(l2, true, false);
    }

    public n(long l2, boolean bl2, boolean bl3) {
        this.a = l2;
        this.g = bl2;
        this.f = bl3;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.a;
    }

    @Override
    public void close() {
        this.e = false;
        this.b = 0L;
        this.c = -1L;
    }

    @Override
    public synchronized void mark(int n2) {
        if (!this.g) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        this.c = this.b;
        this.d = n2;
    }

    @Override
    public boolean markSupported() {
        return this.g;
    }

    @Override
    public int read() {
        if (this.e) {
            throw new IOException("Read after end of file");
        }
        if (this.b == this.a) {
            return this.d();
        }
        ++this.b;
        return this.c();
    }

    @Override
    public int read(char[] arrc) {
        return this.read(arrc, 0, arrc.length);
    }

    @Override
    public int read(char[] arrc, int n2, int n3) {
        if (this.e) {
            throw new IOException("Read after end of file");
        }
        if (this.b == this.a) {
            return this.d();
        }
        this.b += (long)n3;
        int n4 = n3;
        if (this.b > this.a) {
            n4 = n3 - (int)(this.b - this.a);
            this.b = this.a;
        }
        this.a(arrc, n2, n4);
        return n4;
    }

    @Override
    public synchronized void reset() {
        if (!this.g) {
            throw new UnsupportedOperationException("Mark not supported");
        }
        if (this.c < 0L) {
            throw new IOException("No position has been marked");
        }
        if (this.b > this.c + this.d) {
            throw new IOException("Marked position [" + this.c + "] is no longer valid - passed the read limit [" + this.d + "]");
        }
        this.b = this.c;
        this.e = false;
    }

    @Override
    public long skip(long l2) {
        if (this.e) {
            throw new IOException("Skip after end of file");
        }
        if (this.b == this.a) {
            return this.d();
        }
        this.b += l2;
        long l3 = l2;
        if (this.b > this.a) {
            l3 = l2 - (this.b - this.a);
            this.b = this.a;
        }
        return l3;
    }

    protected int c() {
        return 0;
    }

    protected void a(char[] arrc, int n2, int n3) {
    }

    private int d() {
        this.e = true;
        if (this.f) {
            throw new EOFException();
        }
        return -1;
    }
}

