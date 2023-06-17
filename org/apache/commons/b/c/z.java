/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.b.c.o;

public class z
extends o {
    private final OutputStream a;
    private final boolean b;

    public z(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    public z(InputStream inputStream, OutputStream outputStream, boolean bl2) {
        super(inputStream);
        this.a = outputStream;
        this.b = bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        try {
            super.close();
        }
        finally {
            if (this.b) {
                this.a.close();
            }
        }
    }

    @Override
    public int read() {
        int n2 = super.read();
        if (n2 != -1) {
            this.a.write(n2);
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        int n4 = super.read(arrby, n2, n3);
        if (n4 != -1) {
            this.a.write(arrby, n2, n4);
        }
        return n4;
    }

    @Override
    public int read(byte[] arrby) {
        int n2 = super.read(arrby);
        if (n2 != -1) {
            this.a.write(arrby, 0, n2);
        }
        return n2;
    }
}

