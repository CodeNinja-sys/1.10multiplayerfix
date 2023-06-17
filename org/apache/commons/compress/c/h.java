/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.c;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class h
extends FilterOutputStream {
    private long a = 0L;

    public h(OutputStream outputStream) {
        super(outputStream);
    }

    public void write(int n2) {
        this.out.write(n2);
        this.a(1L);
    }

    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    public void write(byte[] arrby, int n2, int n3) {
        this.out.write(arrby, n2, n3);
        this.a(n3);
    }

    protected void a(long l2) {
        if (l2 != -1L) {
            this.a += l2;
        }
    }

    public long a() {
        return this.a;
    }
}

