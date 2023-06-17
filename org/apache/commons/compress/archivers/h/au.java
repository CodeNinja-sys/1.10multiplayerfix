/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.InputStream;
import java.io.RandomAccessFile;
import org.apache.commons.compress.archivers.h.aq;

class au
extends InputStream {
    private long b;
    private long c;
    private boolean d = false;
    final /* synthetic */ aq a;

    au(aq aq2, long l2, long l3) {
        this.a = aq2;
        this.b = l3;
        this.c = l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int read() {
        if (this.b-- <= 0L) {
            if (this.d) {
                this.d = false;
                return 0;
            }
            return -1;
        }
        RandomAccessFile randomAccessFile = aq.b(this.a);
        synchronized (randomAccessFile) {
            aq.b(this.a).seek(this.c++);
            return aq.b(this.a).read();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int read(byte[] arrby, int n2, int n3) {
        if (this.b <= 0L) {
            if (this.d) {
                this.d = false;
                arrby[n2] = 0;
                return 1;
            }
            return -1;
        }
        if (n3 <= 0) {
            return 0;
        }
        if ((long)n3 > this.b) {
            n3 = (int)this.b;
        }
        int n4 = -1;
        RandomAccessFile randomAccessFile = aq.b(this.a);
        synchronized (randomAccessFile) {
            aq.b(this.a).seek(this.c);
            n4 = aq.b(this.a).read(arrby, n2, n3);
        }
        if (n4 > 0) {
            this.c += (long)n4;
            this.b -= (long)n4;
        }
        return n4;
    }

    void a() {
        this.d = true;
    }
}

