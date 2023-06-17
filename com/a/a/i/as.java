/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import java.io.Closeable;
import java.io.Reader;
import java.nio.CharBuffer;

final class as
extends Reader {
    final /* synthetic */ Readable a;

    as(Readable readable) {
        this.a = readable;
    }

    @Override
    public int read(char[] arrc, int n2, int n3) {
        return this.read(CharBuffer.wrap(arrc, n2, n3));
    }

    @Override
    public int read(CharBuffer charBuffer) {
        return this.a.read(charBuffer);
    }

    @Override
    public void close() {
        if (this.a instanceof Closeable) {
            ((Closeable)((Object)this.a)).close();
        }
    }
}

