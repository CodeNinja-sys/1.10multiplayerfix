/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.InputStream;
import org.apache.commons.compress.archivers.h.ac;
import org.apache.commons.compress.archivers.h.af;

class ae
extends InputStream {
    private final InputStream b;
    private final long c;
    private long d = 0L;
    final /* synthetic */ ac a;

    public ae(ac ac2, InputStream inputStream, long l2) {
        this.a = ac2;
        this.c = l2;
        this.b = inputStream;
    }

    public int read() {
        if (this.c >= 0L && this.d >= this.c) {
            return -1;
        }
        int n2 = this.b.read();
        ++this.d;
        ac.a(this.a, 1);
        af.h(ac.a(this.a));
        return n2;
    }

    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    public int read(byte[] arrby, int n2, int n3) {
        if (this.c >= 0L && this.d >= this.c) {
            return -1;
        }
        long l2 = this.c >= 0L ? Math.min((long)n3, this.c - this.d) : (long)n3;
        int n4 = this.b.read(arrby, n2, (int)l2);
        if (n4 == -1) {
            return -1;
        }
        this.d += (long)n4;
        ac.b(this.a, n4);
        af.a(ac.a(this.a), n4);
        return n4;
    }

    public long skip(long l2) {
        long l3 = this.c >= 0L ? Math.min(l2, this.c - this.d) : l2;
        long l4 = this.b.skip(l3);
        this.d += l4;
        return l4;
    }

    public int available() {
        if (this.c >= 0L && this.d >= this.c) {
            return 0;
        }
        return this.b.available();
    }
}

