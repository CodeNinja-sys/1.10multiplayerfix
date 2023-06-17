/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers;

import java.io.InputStream;
import org.apache.commons.compress.archivers.a;

public abstract class c
extends InputStream {
    private final byte[] a = new byte[1];
    private static final int b = 255;
    private long c = 0L;

    public abstract a a();

    public int read() {
        int n2 = this.read(this.a, 0, 1);
        return n2 == -1 ? -1 : this.a[0] & 0xFF;
    }

    protected void a(int n2) {
        this.a((long)n2);
    }

    protected void a(long l2) {
        if (l2 != -1L) {
            this.c += l2;
        }
    }

    protected void b(long l2) {
        this.c -= l2;
    }

    public int b() {
        return (int)this.c;
    }

    public long c() {
        return this.c;
    }

    public boolean a(a a2) {
        return true;
    }
}

