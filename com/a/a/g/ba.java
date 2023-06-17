/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.g.aj;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ba
extends FilterInputStream {
    private final aj a;

    public ba(ai ai2, InputStream inputStream) {
        super((InputStream)cl.a(inputStream));
        this.a = (aj)cl.a(ai2.a());
    }

    @Override
    public int read() {
        int n2 = this.in.read();
        if (n2 != -1) {
            this.a.b((byte)n2);
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        int n4 = this.in.read(arrby, n2, n3);
        if (n4 != -1) {
            this.a.b(arrby, n2, n4);
        }
        return n4;
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public void mark(int n2) {
    }

    @Override
    public void reset() {
        throw new IOException("reset not supported");
    }

    public ae a() {
        return this.a.a();
    }
}

