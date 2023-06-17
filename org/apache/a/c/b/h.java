/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.b;

import java.io.InputStream;
import org.apache.a.c.b.a;

class h
extends InputStream {
    private final InputStream a;
    private final a b;
    private InputStream c;

    public h(InputStream inputStream, a a2) {
        this.a = inputStream;
        this.b = a2;
    }

    private void a() {
        if (this.c == null) {
            this.c = this.b.a(this.a);
        }
    }

    public int read() {
        this.a();
        return this.c.read();
    }

    public int read(byte[] arrby) {
        this.a();
        return this.c.read(arrby);
    }

    public int read(byte[] arrby, int n2, int n3) {
        this.a();
        return this.c.read(arrby, n2, n3);
    }

    public long skip(long l2) {
        this.a();
        return this.c.skip(l2);
    }

    public boolean markSupported() {
        return false;
    }

    public int available() {
        this.a();
        return this.c.available();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void close() {
        try {
            if (this.c != null) {
                this.c.close();
            }
        }
        finally {
            this.a.close();
        }
    }
}

