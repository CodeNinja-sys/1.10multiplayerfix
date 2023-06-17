/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class l
extends FilterOutputStream {
    public l(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void write(int n2) {
        try {
            this.b(1);
            this.out.write(n2);
            this.a(1);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void write(byte[] arrby) {
        try {
            int n2 = arrby != null ? arrby.length : 0;
            this.b(n2);
            this.out.write(arrby);
            this.a(n2);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        try {
            this.b(n3);
            this.out.write(arrby, n2, n3);
            this.a(n3);
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void flush() {
        try {
            this.out.flush();
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    @Override
    public void close() {
        try {
            this.out.close();
        }
        catch (IOException iOException) {
            this.a(iOException);
        }
    }

    protected void b(int n2) {
    }

    protected void a(int n2) {
    }

    protected void a(IOException iOException) {
        throw iOException;
    }
}

