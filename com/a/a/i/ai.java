/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

final class ai
extends Reader {
    private CharSequence a;
    private int b;
    private int c;

    public ai(CharSequence charSequence) {
        this.a = (CharSequence)cl.a(charSequence);
    }

    private void a() {
        if (this.a == null) {
            throw new IOException("reader closed");
        }
    }

    private boolean b() {
        return this.c() > 0;
    }

    private int c() {
        return this.a.length() - this.b;
    }

    @Override
    public synchronized int read(CharBuffer charBuffer) {
        cl.a(charBuffer);
        this.a();
        if (!this.b()) {
            return -1;
        }
        int n2 = Math.min(charBuffer.remaining(), this.c());
        for (int i2 = 0; i2 < n2; ++i2) {
            charBuffer.put(this.a.charAt(this.b++));
        }
        return n2;
    }

    @Override
    public synchronized int read() {
        this.a();
        return this.b() ? (int)this.a.charAt(this.b++) : -1;
    }

    @Override
    public synchronized int read(char[] arrc, int n2, int n3) {
        cl.a(n2, n2 + n3, arrc.length);
        this.a();
        if (!this.b()) {
            return -1;
        }
        int n4 = Math.min(n3, this.c());
        for (int i2 = 0; i2 < n4; ++i2) {
            arrc[n2 + i2] = this.a.charAt(this.b++);
        }
        return n4;
    }

    @Override
    public synchronized long skip(long l2) {
        cl.a(l2 >= 0L, "n (%s) may not be negative", new Object[]{l2});
        this.a();
        int n2 = (int)Math.min((long)this.c(), l2);
        this.b += n2;
        return n2;
    }

    @Override
    public synchronized boolean ready() {
        this.a();
        return true;
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public synchronized void mark(int n2) {
        cl.a(n2 >= 0, "readAheadLimit (%s) may not be negative", new Object[]{n2});
        this.a();
        this.c = this.b;
    }

    @Override
    public synchronized void reset() {
        this.a();
        this.b = this.c;
    }

    @Override
    public synchronized void close() {
        this.a = null;
    }
}

