/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.s;
import java.io.InputStream;
import java.util.Iterator;

final class cj
extends InputStream {
    private Iterator a;
    private InputStream b;

    public cj(Iterator iterator) {
        this.a = (Iterator)cl.a(iterator);
        this.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        if (this.b != null) {
            try {
                this.b.close();
            }
            finally {
                this.b = null;
            }
        }
    }

    private void a() {
        this.close();
        if (this.a.hasNext()) {
            this.b = ((s)this.a.next()).a();
        }
    }

    @Override
    public int available() {
        if (this.b == null) {
            return 0;
        }
        return this.b.available();
    }

    @Override
    public boolean markSupported() {
        return false;
    }

    @Override
    public int read() {
        if (this.b == null) {
            return -1;
        }
        int n2 = this.b.read();
        if (n2 == -1) {
            this.a();
            return this.read();
        }
        return n2;
    }

    @Override
    public int read(byte[] arrby, int n2, int n3) {
        if (this.b == null) {
            return -1;
        }
        int n4 = this.b.read(arrby, n2, n3);
        if (n4 == -1) {
            this.a();
            return this.read(arrby, n2, n3);
        }
        return n4;
    }

    @Override
    public long skip(long l2) {
        if (this.b == null || l2 <= 0L) {
            return 0L;
        }
        long l3 = this.b.skip(l2);
        if (l3 != 0L) {
            return l3;
        }
        if (this.read() == -1) {
            return 0L;
        }
        return 1L + this.b.skip(l2 - 1L);
    }
}

