/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.g;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.a.j.i;

public class f
extends OutputStream {
    private final i a;
    private final byte[] b;
    private int c = 0;
    private boolean d = false;
    private boolean e = false;

    public f(i i2, int n2) {
        this(n2, i2);
    }

    public f(i i2) {
        this(2048, i2);
    }

    public f(int n2, i i2) {
        this.b = new byte[n2];
        this.a = i2;
    }

    protected void a() {
        if (this.c > 0) {
            this.a.a(Integer.toHexString(this.c));
            this.a.a(this.b, 0, this.c);
            this.a.a("");
            this.c = 0;
        }
    }

    protected void a(byte[] arrby, int n2, int n3) {
        this.a.a(Integer.toHexString(this.c + n3));
        this.a.a(this.b, 0, this.c);
        this.a.a(arrby, n2, n3);
        this.a.a("");
        this.c = 0;
    }

    protected void b() {
        this.a.a("0");
        this.a.a("");
    }

    public void c() {
        if (!this.d) {
            this.a();
            this.b();
            this.d = true;
        }
    }

    public void write(int n2) {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        }
        this.b[this.c] = (byte)n2;
        ++this.c;
        if (this.c == this.b.length) {
            this.a();
        }
    }

    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    public void write(byte[] arrby, int n2, int n3) {
        if (this.e) {
            throw new IOException("Attempted write to closed stream.");
        }
        if (n3 >= this.b.length - this.c) {
            this.a(arrby, n2, n3);
        } else {
            System.arraycopy(arrby, n2, this.b, this.c, n3);
            this.c += n3;
        }
    }

    public void flush() {
        this.a();
        this.a.a();
    }

    public void close() {
        if (!this.e) {
            this.e = true;
            this.c();
            this.a.a();
        }
    }
}

