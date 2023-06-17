/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.c;

import java.io.FilterInputStream;
import java.io.InputStream;

public class g
extends FilterInputStream {
    private long a;

    public g(InputStream inputStream) {
        super(inputStream);
    }

    public int read() {
        int n2 = this.in.read();
        if (n2 >= 0) {
            this.a(1L);
        }
        return n2;
    }

    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.in.read(arrby, n2, n3);
        if (n4 >= 0) {
            this.a(n4);
        }
        return n4;
    }

    protected final void a(long l2) {
        if (l2 != -1L) {
            this.a += l2;
        }
    }

    public long a() {
        return this.a;
    }
}

