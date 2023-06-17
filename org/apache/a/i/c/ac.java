/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.io.InputStream;
import org.apache.a.i.c.az;

class ac
extends InputStream {
    private final InputStream a;
    private final az b;

    public ac(InputStream inputStream, az az2) {
        this.a = inputStream;
        this.b = az2;
    }

    public int read() {
        try {
            int n2 = this.a.read();
            if (n2 == -1) {
                this.b.b("end of stream");
            } else {
                this.b.b(n2);
            }
            return n2;
        }
        catch (IOException iOException) {
            this.b.b("[read] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    public int read(byte[] arrby) {
        try {
            int n2 = this.a.read(arrby);
            if (n2 == -1) {
                this.b.b("end of stream");
            } else if (n2 > 0) {
                this.b.b(arrby, 0, n2);
            }
            return n2;
        }
        catch (IOException iOException) {
            this.b.b("[read] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    public int read(byte[] arrby, int n2, int n3) {
        try {
            int n4 = this.a.read(arrby, n2, n3);
            if (n4 == -1) {
                this.b.b("end of stream");
            } else if (n4 > 0) {
                this.b.b(arrby, n2, n4);
            }
            return n4;
        }
        catch (IOException iOException) {
            this.b.b("[read] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    public long skip(long l2) {
        try {
            return super.skip(l2);
        }
        catch (IOException iOException) {
            this.b.b("[skip] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    public int available() {
        try {
            return this.a.available();
        }
        catch (IOException iOException) {
            this.b.b("[available] I/O error : " + iOException.getMessage());
            throw iOException;
        }
    }

    public void mark(int n2) {
        super.mark(n2);
    }

    public void reset() {
        super.reset();
    }

    public boolean markSupported() {
        return false;
    }

    public void close() {
        try {
            this.a.close();
        }
        catch (IOException iOException) {
            this.b.b("[close] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }
}

