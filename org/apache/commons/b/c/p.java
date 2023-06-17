/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public abstract class p
extends FilterReader {
    public p(Reader reader) {
        super(reader);
    }

    @Override
    public int read() {
        try {
            this.a(1);
            int n2 = this.in.read();
            this.b(n2 != -1 ? 1 : -1);
            return n2;
        }
        catch (IOException iOException) {
            this.a(iOException);
            return -1;
        }
    }

    @Override
    public int read(char[] arrc) {
        try {
            this.a(arrc != null ? arrc.length : 0);
            int n2 = this.in.read(arrc);
            this.b(n2);
            return n2;
        }
        catch (IOException iOException) {
            this.a(iOException);
            return -1;
        }
    }

    @Override
    public int read(char[] arrc, int n2, int n3) {
        try {
            this.a(n3);
            int n4 = this.in.read(arrc, n2, n3);
            this.b(n4);
            return n4;
        }
        catch (IOException iOException) {
            this.a(iOException);
            return -1;
        }
    }

    @Override
    public int read(CharBuffer charBuffer) {
        try {
            this.a(charBuffer != null ? charBuffer.length() : 0);
            int n2 = this.in.read(charBuffer);
            this.b(n2);
            return n2;
        }
        catch (IOException iOException) {
            this.a(iOException);
            return -1;
        }
    }

    @Override
    public long skip(long l2) {
        try {
            return this.in.skip(l2);
        }
        catch (IOException iOException) {
            this.a(iOException);
            return 0L;
        }
    }

    @Override
    public boolean ready() {
        try {
            return this.in.ready();
        }
        catch (IOException iOException) {
            this.a(iOException);
            return false;
        }
    }

    @Override
    public void close() {
        try {
            this.in.close();
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public synchronized void mark(int n2) {
        try {
            this.in.mark(n2);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public synchronized void reset() {
        try {
            this.in.reset();
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public boolean markSupported() {
        return this.in.markSupported();
    }

    protected void a(int n2) {
    }

    protected void b(int n2) {
    }

    protected void a(IOException iOException) {
        throw iOException;
    }
}

