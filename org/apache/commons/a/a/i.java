/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.a.a.g;
import org.apache.commons.a.a.h;

public class i
extends FilterInputStream {
    private final g a;
    private final boolean b;
    private final byte[] c = new byte[1];
    private final h d = new h();

    protected i(InputStream inputStream, g g2, boolean bl2) {
        super(inputStream);
        this.b = bl2;
        this.a = g2;
    }

    @Override
    public int available() {
        return this.d.f ? 0 : 1;
    }

    @Override
    public synchronized void mark(int n2) {
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() {
        int n2 = this.read(this.c, 0, 1);
        while (n2 == 0) {
            n2 = this.read(this.c, 0, 1);
        }
        if (n2 > 0) {
            int n3 = this.c[0];
            return n3 < 0 ? 256 + n3 : n3;
        }
        return -1;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            throw new NullPointerException();
        }
        if (n2 < 0 || n3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 > arrby.length || n2 + n3 > arrby.length) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return 0;
        }
        int n4 = 0;
        while (n4 == 0) {
            if (!this.a.a(this.d)) {
                byte[] arrby2 = new byte[this.b ? 4096 : 8192];
                int n5 = this.in.read(arrby2);
                if (this.b) {
                    this.a.b(arrby2, 0, n5, this.d);
                } else {
                    this.a.a(arrby2, 0, n5, this.d);
                }
            }
            n4 = this.a.c(arrby, n2, n3, this.d);
        }
        return n4;
    }

    @Override
    public synchronized void reset() {
        throw new IOException("mark/reset not supported");
    }

    @Override
    public long skip(long l2) {
        long l3;
        int n2;
        if (l2 < 0L) {
            throw new IllegalArgumentException("Negative skip length: " + l2);
        }
        byte[] arrby = new byte[512];
        for (l3 = l2; l3 > 0L; l3 -= (long)n2) {
            n2 = (int)Math.min((long)arrby.length, l3);
            if ((n2 = this.read(arrby, 0, n2)) == -1) break;
        }
        return l2 - l3;
    }
}

