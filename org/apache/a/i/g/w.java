/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.j.i;
import org.apache.a.o.a;

public class w
extends OutputStream {
    private final i a;
    private boolean b = false;

    public w(i i2) {
        this.a = (i)org.apache.a.o.a.a(i2, "Session output buffer");
    }

    public void close() {
        if (!this.b) {
            this.b = true;
            this.a.a();
        }
    }

    public void flush() {
        this.a.a();
    }

    public void write(byte[] arrby, int n2, int n3) {
        if (this.b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.a.a(arrby, n2, n3);
    }

    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    public void write(int n2) {
        if (this.b) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.a.a(n2);
    }
}

