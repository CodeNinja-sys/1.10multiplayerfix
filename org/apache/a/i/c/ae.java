/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.i.c.az;

class ae
extends OutputStream {
    private final OutputStream a;
    private final az b;

    public ae(OutputStream outputStream, az az2) {
        this.a = outputStream;
        this.b = az2;
    }

    public void write(int n2) {
        try {
            this.b.a(n2);
        }
        catch (IOException iOException) {
            this.b.a("[write] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    public void write(byte[] arrby) {
        try {
            this.b.a(arrby);
            this.a.write(arrby);
        }
        catch (IOException iOException) {
            this.b.a("[write] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    public void write(byte[] arrby, int n2, int n3) {
        try {
            this.b.a(arrby, n2, n3);
            this.a.write(arrby, n2, n3);
        }
        catch (IOException iOException) {
            this.b.a("[write] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    public void flush() {
        try {
            this.a.flush();
        }
        catch (IOException iOException) {
            this.b.a("[flush] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }

    public void close() {
        try {
            this.a.close();
        }
        catch (IOException iOException) {
            this.b.a("[close] I/O error: " + iOException.getMessage());
            throw iOException;
        }
    }
}

