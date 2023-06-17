/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class bc
extends FilterOutputStream {
    private long a;

    public bc(OutputStream outputStream) {
        super(outputStream);
    }

    public long a() {
        return this.a;
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        this.out.write(arrby, n2, n3);
        this.a += (long)n3;
    }

    @Override
    public void write(int n2) {
        this.out.write(n2);
        ++this.a;
    }

    @Override
    public void close() {
        this.out.close();
    }
}

