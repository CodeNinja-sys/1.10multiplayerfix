/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f;

import java.io.IOException;
import java.io.InputStream;
import org.apache.a.f.j;
import org.apache.a.f.n;
import org.apache.a.o.a;

public class m
extends InputStream
implements j {
    protected InputStream a;
    private boolean b;
    private final n c;

    public m(InputStream inputStream, n n2) {
        org.apache.a.o.a.a(inputStream, "Wrapped stream");
        this.a = inputStream;
        this.b = false;
        this.c = n2;
    }

    boolean a() {
        return this.b;
    }

    InputStream b() {
        return this.a;
    }

    protected boolean c() {
        if (this.b) {
            throw new IOException("Attempted read on closed stream.");
        }
        return this.a != null;
    }

    public int read() {
        int n2 = -1;
        if (this.c()) {
            try {
                n2 = this.a.read();
                this.a(n2);
            }
            catch (IOException iOException) {
                this.e();
                throw iOException;
            }
        }
        return n2;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = -1;
        if (this.c()) {
            try {
                n4 = this.a.read(arrby, n2, n3);
                this.a(n4);
            }
            catch (IOException iOException) {
                this.e();
                throw iOException;
            }
        }
        return n4;
    }

    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    public int available() {
        int n2 = 0;
        if (this.c()) {
            try {
                n2 = this.a.available();
            }
            catch (IOException iOException) {
                this.e();
                throw iOException;
            }
        }
        return n2;
    }

    public void close() {
        this.b = true;
        this.d();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(int n2) {
        if (this.a != null && n2 < 0) {
            try {
                boolean bl2 = true;
                if (this.c != null) {
                    bl2 = this.c.a(this.a);
                }
                if (bl2) {
                    this.a.close();
                }
            }
            finally {
                this.a = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void d() {
        if (this.a != null) {
            try {
                boolean bl2 = true;
                if (this.c != null) {
                    bl2 = this.c.b(this.a);
                }
                if (bl2) {
                    this.a.close();
                }
            }
            finally {
                this.a = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void e() {
        if (this.a != null) {
            try {
                boolean bl2 = true;
                if (this.c != null) {
                    bl2 = this.c.c(this.a);
                }
                if (bl2) {
                    this.a.close();
                }
            }
            finally {
                this.a = null;
            }
        }
    }

    public void cM_() {
        this.close();
    }

    public void cN_() {
        this.b = true;
        this.e();
    }
}

