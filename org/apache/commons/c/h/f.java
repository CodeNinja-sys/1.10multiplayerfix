/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.io.Reader;
import org.apache.commons.c.h.e;

class f
extends Reader {
    private int b;
    private int c;
    final /* synthetic */ e a;

    f(e e2) {
        this.a = e2;
    }

    @Override
    public void close() {
    }

    @Override
    public int read() {
        if (!this.ready()) {
            return -1;
        }
        return this.a.charAt(this.b++);
    }

    @Override
    public int read(char[] arrc, int n2, int n3) {
        if (n2 < 0 || n3 < 0 || n2 > arrc.length || n2 + n3 > arrc.length || n2 + n3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (n3 == 0) {
            return 0;
        }
        if (this.b >= this.a.f()) {
            return -1;
        }
        if (this.b + n3 > this.a.f()) {
            n3 = this.a.f() - this.b;
        }
        this.a.a(this.b, this.b + n3, arrc, n2);
        this.b += n3;
        return n3;
    }

    @Override
    public long skip(long l2) {
        if ((long)this.b + l2 > (long)this.a.f()) {
            l2 = this.a.f() - this.b;
        }
        if (l2 < 0L) {
            return 0L;
        }
        this.b = (int)((long)this.b + l2);
        return l2;
    }

    @Override
    public boolean ready() {
        return this.b < this.a.f();
    }

    @Override
    public boolean markSupported() {
        return true;
    }

    @Override
    public void mark(int n2) {
        this.c = this.b;
    }

    @Override
    public void reset() {
        this.b = this.c;
    }
}

