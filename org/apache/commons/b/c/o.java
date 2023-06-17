/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public abstract class o
extends FilterInputStream {
    public o(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() {
        try {
            this.b(1);
            int n2 = this.in.read();
            this.a(n2 != -1 ? 1 : -1);
            return n2;
        }
        catch (IOException iOException) {
            this.a(iOException);
            return -1;
        }
    }

    @Override
    public int read(byte[] arrby) {
        try {
            this.b(arrby != null ? arrby.length : 0);
            int n2 = this.in.read(arrby);
            this.a(n2);
            return n2;
        }
        catch (IOException iOException) {
            this.a(iOException);
            return -1;
        }
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        try {
            this.b(n3);
            int n4 = this.in.read(arrby, n2, n3);
            this.a(n4);
            return n4;
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
    public int available() {
        try {
            return super.available();
        }
        catch (IOException iOException) {
            this.a(iOException);
            return 0;
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
        this.in.mark(n2);
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

    protected void b(int n2) {
    }

    protected void a(int n2) {
    }

    protected void a(IOException iOException) {
        throw iOException;
    }
}

