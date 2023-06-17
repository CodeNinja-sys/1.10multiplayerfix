/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.j.i;
import org.apache.a.o.a;

public class h
extends OutputStream {
    private final i a;
    private final long b;
    private long c = 0L;
    private boolean d = false;

    public h(i i2, long l2) {
        this.a = (i)org.apache.a.o.a.a(i2, "Session output buffer");
        this.b = org.apache.a.o.a.b(l2, "Content length");
    }

    public void close() {
        if (!this.d) {
            this.d = true;
            this.a.a();
        }
    }

    public void flush() {
        this.a.a();
    }

    public void write(byte[] arrby, int n2, int n3) {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.c < this.b) {
            int n4 = n3;
            long l2 = this.b - this.c;
            if ((long)n4 > l2) {
                n4 = (int)l2;
            }
            this.a.a(arrby, n2, n4);
            this.c += (long)n4;
        }
    }

    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    public void write(int n2) {
        if (this.d) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (this.c < this.b) {
            this.a.a(n2);
            ++this.c;
        }
    }
}

