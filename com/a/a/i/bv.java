/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.i.bz;
import java.io.OutputStream;

final class bv
extends OutputStream {
    final /* synthetic */ bz a;

    bv(bz bz2) {
        this.a = bz2;
    }

    @Override
    public void write(int n2) {
        this.a.a((byte)n2);
    }

    @Override
    public void flush() {
        this.a.a();
    }

    @Override
    public void close() {
        this.a.b();
    }
}

