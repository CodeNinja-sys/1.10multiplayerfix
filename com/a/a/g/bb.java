/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.b.cl;
import com.a.a.g.ae;
import com.a.a.g.ai;
import com.a.a.g.aj;
import java.io.FilterOutputStream;
import java.io.OutputStream;

public final class bb
extends FilterOutputStream {
    private final aj a;

    public bb(ai ai2, OutputStream outputStream) {
        super((OutputStream)cl.a(outputStream));
        this.a = (aj)cl.a(ai2.a());
    }

    @Override
    public void write(int n2) {
        this.a.b((byte)n2);
        this.out.write(n2);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        this.a.b(arrby, n2, n3);
        this.out.write(arrby, n2, n3);
    }

    public ae a() {
        return this.a.a();
    }

    @Override
    public void close() {
        this.out.close();
    }
}

