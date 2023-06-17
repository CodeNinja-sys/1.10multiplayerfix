/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.IOException;
import java.io.InputStream;

public class e
extends InputStream {
    private final IOException a;

    public e(IOException iOException) {
        this.a = iOException;
    }

    public e() {
        this(new IOException("Broken input stream"));
    }

    @Override
    public int read() {
        throw this.a;
    }

    @Override
    public int available() {
        throw this.a;
    }

    @Override
    public long skip(long l2) {
        throw this.a;
    }

    @Override
    public void reset() {
        throw this.a;
    }

    @Override
    public void close() {
        throw this.a;
    }
}

