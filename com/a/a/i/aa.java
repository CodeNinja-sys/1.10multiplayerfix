/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import java.io.OutputStream;

final class aa
extends OutputStream {
    aa() {
    }

    @Override
    public void write(int n2) {
    }

    @Override
    public void write(byte[] arrby) {
        cl.a(arrby);
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        cl.a(arrby);
    }

    public String toString() {
        return "ByteStreams.nullOutputStream()";
    }
}

