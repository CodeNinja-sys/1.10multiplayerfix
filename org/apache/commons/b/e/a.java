/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.IOException;
import java.io.OutputStream;

public class a
extends OutputStream {
    private final IOException a;

    public a(IOException iOException) {
        this.a = iOException;
    }

    public a() {
        this(new IOException("Broken output stream"));
    }

    @Override
    public void write(int n2) {
        throw this.a;
    }

    @Override
    public void flush() {
        throw this.a;
    }

    @Override
    public void close() {
        throw this.a;
    }
}

