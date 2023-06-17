/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.IOException;
import java.io.InputStream;
import org.apache.a.a;
import org.apache.a.j.h;

public class g
extends InputStream {
    private static final int a = 2048;
    private final long b;
    private long c = 0L;
    private boolean d = false;
    private h e = null;

    public g(h h2, long l2) {
        this.e = (h)org.apache.a.o.a.a(h2, "Session input buffer");
        this.b = org.apache.a.o.a.b(l2, "Content length");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        if (!this.d) {
            try {
                if (this.c < this.b) {
                    byte[] arrby = new byte[2048];
                    while (this.read(arrby) >= 0) {
                    }
                }
            }
            finally {
                this.d = true;
            }
        }
    }

    public int available() {
        if (this.e instanceof org.apache.a.j.a) {
            int n2 = ((org.apache.a.j.a)((Object)this.e)).g();
            return Math.min(n2, (int)(this.b - this.c));
        }
        return 0;
    }

    public int read() {
        if (this.d) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.c >= this.b) {
            return -1;
        }
        int n2 = this.e.a();
        if (n2 == -1) {
            if (this.c < this.b) {
                throw new a("Premature end of Content-Length delimited message body (expected: " + this.b + "; received: " + this.c);
            }
        } else {
            ++this.c;
        }
        return n2;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4;
        if (this.d) {
            throw new IOException("Attempted read from closed stream.");
        }
        if (this.c >= this.b) {
            return -1;
        }
        int n5 = n3;
        if (this.c + (long)n3 > this.b) {
            n5 = (int)(this.b - this.c);
        }
        if ((n4 = this.e.a(arrby, n2, n5)) == -1 && this.c < this.b) {
            throw new a("Premature end of Content-Length delimited message body (expected: " + this.b + "; received: " + this.c);
        }
        if (n4 > 0) {
            this.c += (long)n4;
        }
        return n4;
    }

    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    public long skip(long l2) {
        int n2;
        if (l2 <= 0L) {
            return 0L;
        }
        byte[] arrby = new byte[2048];
        long l3 = 0L;
        for (long i2 = Math.min(l2, this.b - this.c); i2 > 0L && (n2 = this.read(arrby, 0, (int)Math.min(2048L, i2))) != -1; i2 -= (long)n2) {
            l3 += (long)n2;
        }
        return l3;
    }
}

