/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.IOException;
import java.io.OutputStream;

public abstract class q
extends OutputStream {
    private final int a;
    private long b;
    private boolean c;

    public q(int n2) {
        this.a = n2;
    }

    @Override
    public void write(int n2) {
        this.a(1);
        this.a().write(n2);
        ++this.b;
    }

    @Override
    public void write(byte[] arrby) {
        this.a(arrby.length);
        this.a().write(arrby);
        this.b += (long)arrby.length;
    }

    @Override
    public void write(byte[] arrby, int n2, int n3) {
        this.a(n3);
        this.a().write(arrby, n2, n3);
        this.b += (long)n3;
    }

    @Override
    public void flush() {
        this.a().flush();
    }

    @Override
    public void close() {
        try {
            this.flush();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.a().close();
    }

    public int f() {
        return this.a;
    }

    public long g() {
        return this.b;
    }

    public boolean h() {
        return this.b > (long)this.a;
    }

    protected void a(int n2) {
        if (!this.c && this.b + (long)n2 > (long)this.a) {
            this.c = true;
            this.b();
        }
    }

    protected void i() {
        this.c = false;
        this.b = 0L;
    }

    protected abstract OutputStream a();

    protected abstract void b();
}

