/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.ak;
import java.io.Reader;
import java.util.Iterator;

class ck
extends Reader {
    private final Iterator a;
    private Reader b;

    ck(Iterator iterator) {
        this.a = iterator;
        this.a();
    }

    private void a() {
        this.close();
        if (this.a.hasNext()) {
            this.b = ((ak)this.a.next()).a();
        }
    }

    @Override
    public int read(char[] arrc, int n2, int n3) {
        if (this.b == null) {
            return -1;
        }
        int n4 = this.b.read(arrc, n2, n3);
        if (n4 == -1) {
            this.a();
            return this.read(arrc, n2, n3);
        }
        return n4;
    }

    @Override
    public long skip(long l2) {
        cl.a(l2 >= 0L, (Object)"n is negative");
        if (l2 > 0L) {
            while (this.b != null) {
                long l3 = this.b.skip(l2);
                if (l3 > 0L) {
                    return l3;
                }
                this.a();
            }
        }
        return 0L;
    }

    @Override
    public boolean ready() {
        return this.b != null && this.b.ready();
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
}

